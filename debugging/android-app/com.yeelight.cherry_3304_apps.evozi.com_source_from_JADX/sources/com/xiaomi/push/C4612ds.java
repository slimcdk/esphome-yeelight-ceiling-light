package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4854ak;

/* renamed from: com.xiaomi.push.ds */
final class C4612ds implements C4616dw {
    C4612ds() {
    }

    /* renamed from: a */
    private void m13757a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                if (!C4614du.m13762a(context, String.valueOf(12), 1)) {
                    C4747hu huVar = new C4747hu();
                    huVar.mo25296a(str + Constants.COLON_SEPARATOR + str2);
                    huVar.mo25294a(System.currentTimeMillis());
                    huVar.mo25295a(C4741ho.BroadcastAction);
                    C4624ed.m13797a(context, huVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13759b(Context context, Intent intent) {
        int a;
        try {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                String[] split = dataString.split(Constants.COLON_SEPARATOR);
                if (split.length < 2) {
                    return;
                }
                if (!TextUtils.isEmpty(split[1])) {
                    String str = split[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean a2 = C4854ak.m15568a(context).mo25911a(C4744hr.BroadcastActionCollectionSwitch.mo25291a(), true);
                    if (TextUtils.equals("android.intent.action.PACKAGE_RESTARTED", intent.getAction())) {
                        if (C4614du.m13762a(context, String.valueOf(12), 1)) {
                            return;
                        }
                        if (a2) {
                            if (TextUtils.isEmpty(C4623ec.f8435a)) {
                                C4623ec.f8435a += C4615dv.f8429a + Constants.COLON_SEPARATOR;
                            }
                            C4623ec.f8435a += str + "(" + currentTimeMillis + ")" + Constants.ACCEPT_TIME_SEPARATOR_SP;
                        }
                    } else if (!TextUtils.equals("android.intent.action.PACKAGE_CHANGED", intent.getAction())) {
                        if (TextUtils.equals("android.intent.action.PACKAGE_ADDED", intent.getAction())) {
                            if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                                a = C4741ho.BroadcastActionAdded.mo25255a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_REMOVED", intent.getAction())) {
                            if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                                a = C4741ho.BroadcastActionRemoved.mo25255a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_REPLACED", intent.getAction())) {
                            if (a2) {
                                a = C4741ho.BroadcastActionReplaced.mo25255a();
                            } else {
                                return;
                            }
                        } else if (TextUtils.equals("android.intent.action.PACKAGE_DATA_CLEARED", intent.getAction()) && a2) {
                            a = C4741ho.BroadcastActionDataCleared.mo25255a();
                        } else {
                            return;
                        }
                        m13757a(context, String.valueOf(a), str);
                    } else if (C4614du.m13762a(context, String.valueOf(12), 1)) {
                    } else {
                        if (a2) {
                            if (TextUtils.isEmpty(C4623ec.f8436b)) {
                                C4623ec.f8436b += C4615dv.f8430b + Constants.COLON_SEPARATOR;
                            }
                            C4623ec.f8436b += str + "(" + currentTimeMillis + ")" + Constants.ACCEPT_TIME_SEPARATOR_SP;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo24926a(Context context, Intent intent) {
        if (intent != null) {
            C4498ai.m13271a(context).mo24725a((Runnable) new C4613dt(this, context, intent));
        }
    }
}
