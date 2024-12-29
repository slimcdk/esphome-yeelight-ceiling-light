package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.channel.commonutils.logger.C3989b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.er */
class C4650er implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f8593a;

    /* renamed from: a */
    final /* synthetic */ C4649eq f8594a;

    /* renamed from: a */
    final /* synthetic */ String f8595a;

    /* renamed from: b */
    final /* synthetic */ String f8596b;

    /* renamed from: c */
    final /* synthetic */ String f8597c;

    C4650er(C4649eq eqVar, String str, Context context, String str2, String str3) {
        this.f8594a = eqVar;
        this.f8595a = str;
        this.f8593a = context;
        this.f8596b = str2;
        this.f8597c = str3;
    }

    public void run() {
        String str;
        String str2;
        Context context;
        Context context2;
        String str3;
        String str4;
        C4649eq eqVar;
        C4651es esVar;
        Context context3;
        if (!TextUtils.isEmpty(this.f8595a)) {
            try {
                C4645em.m14078a(this.f8593a, this.f8595a, 1001, "get message");
                JSONObject jSONObject = new JSONObject(this.f8595a);
                String optString = jSONObject.optString(DddTag.ACTION);
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                int optInt = jSONObject.optInt("awake_foreground", 0);
                if (this.f8596b.equals(optString3)) {
                    if (this.f8597c.equals(optString4)) {
                        if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                            context2 = this.f8593a;
                            str3 = this.f8595a;
                            str4 = "A receive a incorrect message with empty type";
                        } else {
                            this.f8594a.mo25056b(optString3);
                            this.f8594a.mo25053a(optString4);
                            C4648ep epVar = new C4648ep();
                            epVar.mo25043b(optString);
                            epVar.mo25041a(optString2);
                            epVar.mo25040a(optInt);
                            epVar.mo25047d(this.f8595a);
                            if ("service".equals(optString5)) {
                                if (!TextUtils.isEmpty(optString)) {
                                    eqVar = this.f8594a;
                                    esVar = C4651es.SERVICE_ACTION;
                                    context3 = this.f8593a;
                                } else {
                                    epVar.mo25045c("com.xiaomi.mipush.sdk.PushMessageHandler");
                                    eqVar = this.f8594a;
                                    esVar = C4651es.SERVICE_COMPONENT;
                                    context3 = this.f8593a;
                                }
                            } else if (C4651es.ACTIVITY.f8603a.equals(optString5)) {
                                eqVar = this.f8594a;
                                esVar = C4651es.ACTIVITY;
                                context3 = this.f8593a;
                            } else if (C4651es.PROVIDER.f8603a.equals(optString5)) {
                                eqVar = this.f8594a;
                                esVar = C4651es.PROVIDER;
                                context3 = this.f8593a;
                            } else {
                                context2 = this.f8593a;
                                str3 = this.f8595a;
                                str4 = "A receive a incorrect message with unknown type " + optString5;
                            }
                            eqVar.m14100a(esVar, context3, epVar);
                            return;
                        }
                        C4645em.m14078a(context2, str3, 1008, str4);
                        return;
                    }
                }
                C4645em.m14078a(this.f8593a, this.f8595a, 1008, "A receive a incorrect message with incorrect package info" + optString3);
            } catch (JSONException e) {
                C3989b.m10678a((Throwable) e);
                context = this.f8593a;
                str2 = this.f8595a;
                str = "A meet a exception when receive the message";
            }
        } else {
            context = this.f8593a;
            str2 = "null";
            str = "A receive a incorrect message with empty info";
            C4645em.m14078a(context, str2, 1008, str);
        }
    }
}
