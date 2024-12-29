package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.channel.commonutils.logger.C4408b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.ee */
class C4656ee implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7981a;

    /* renamed from: a */
    final /* synthetic */ C4655ed f7982a;

    /* renamed from: a */
    final /* synthetic */ String f7983a;

    /* renamed from: b */
    final /* synthetic */ String f7984b;

    /* renamed from: c */
    final /* synthetic */ String f7985c;

    C4656ee(C4655ed edVar, String str, Context context, String str2, String str3) {
        this.f7982a = edVar;
        this.f7983a = str;
        this.f7981a = context;
        this.f7984b = str2;
        this.f7985c = str3;
    }

    public void run() {
        String str;
        String str2;
        Context context;
        Context context2;
        String str3;
        String str4;
        C4655ed edVar;
        Context context3;
        C4655ed edVar2;
        C4657ef efVar;
        Context context4;
        if (!TextUtils.isEmpty(this.f7983a)) {
            try {
                C4650dz.m13610a(this.f7981a, this.f7983a, 1001, "get message");
                JSONObject jSONObject = new JSONObject(this.f7983a);
                String optString = jSONObject.optString(DddTag.ACTION);
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                int optInt = jSONObject.optInt("awake_foreground", 0);
                if (this.f7984b.equals(optString3)) {
                    if (this.f7985c.equals(optString4)) {
                        if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                            context2 = this.f7981a;
                            str3 = this.f7983a;
                            str4 = "A receive a incorrect message with empty type";
                        } else {
                            this.f7982a.mo29047b(optString3);
                            this.f7982a.mo29044a(optString4);
                            C4654ec ecVar = new C4654ec();
                            ecVar.mo29034b(optString);
                            ecVar.mo29032a(optString2);
                            ecVar.mo29031a(optInt);
                            ecVar.mo29038d(this.f7983a);
                            if ("service".equals(optString5)) {
                                if (!TextUtils.isEmpty(optString)) {
                                    edVar2 = this.f7982a;
                                    efVar = C4657ef.SERVICE_ACTION;
                                    context4 = this.f7981a;
                                } else {
                                    ecVar.mo29036c("com.xiaomi.mipush.sdk.PushMessageHandler");
                                    edVar2 = this.f7982a;
                                    efVar = C4657ef.SERVICE_COMPONENT;
                                    context4 = this.f7981a;
                                }
                                edVar2.m13641a(efVar, context4, ecVar);
                                return;
                            }
                            C4657ef efVar2 = C4657ef.ACTIVITY;
                            if (efVar2.f7991a.equals(optString5)) {
                                edVar = this.f7982a;
                                context3 = this.f7981a;
                            } else {
                                efVar2 = C4657ef.PROVIDER;
                                if (efVar2.f7991a.equals(optString5)) {
                                    edVar = this.f7982a;
                                    context3 = this.f7981a;
                                } else {
                                    context2 = this.f7981a;
                                    str3 = this.f7983a;
                                    str4 = "A receive a incorrect message with unknown type " + optString5;
                                }
                            }
                            edVar.m13641a(efVar2, context3, ecVar);
                            return;
                        }
                        C4650dz.m13610a(context2, str3, 1008, str4);
                        return;
                    }
                }
                C4650dz.m13610a(this.f7981a, this.f7983a, 1008, "A receive a incorrect message with incorrect package info" + optString3);
            } catch (JSONException e) {
                C4408b.m12478a((Throwable) e);
                context = this.f7981a;
                str2 = this.f7983a;
                str = "A meet a exception when receive the message";
            }
        } else {
            context = this.f7981a;
            str2 = "null";
            str = "A receive a incorrect message with empty info";
            C4650dz.m13610a(context, str2, 1008, str);
        }
    }
}
