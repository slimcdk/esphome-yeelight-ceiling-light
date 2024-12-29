package com.xiaomi.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4969l;

/* renamed from: com.xiaomi.push.eb */
class C4653eb implements C4658eg {
    C4653eb() {
    }

    /* renamed from: a */
    private void m13625a(Activity activity, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b = C4649dy.m13608b(stringExtra);
            if (!TextUtils.isEmpty(b)) {
                C4650dz.m13610a(activity.getApplicationContext(), b, 1007, "play with activity successfully");
                return;
            }
        }
        C4650dz.m13610a(activity.getApplicationContext(), "activity", 1008, "B get incorrect message");
    }

    /* renamed from: b */
    private void m13626b(Context context, C4654ec ecVar) {
        String a = ecVar.mo29030a();
        String b = ecVar.mo29033b();
        String d = ecVar.mo29037d();
        int a2 = ecVar.mo29030a();
        if (context == null || TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4650dz.m13610a(context, "activity", 1008, "argument error");
            } else {
                C4650dz.m13610a(context, d, 1008, "argument error");
            }
        } else if (!C4969l.m15578b(context, a, b)) {
            C4650dz.m13610a(context, d, 1003, "B is not ready");
        } else {
            C4650dz.m13610a(context, d, 1002, "B is ready");
            C4650dz.m13610a(context, d, 1004, "A is ready");
            Intent intent = new Intent(b);
            intent.setPackage(a);
            intent.putExtra("awake_info", C4649dy.m13606a(d));
            intent.addFlags(276824064);
            intent.setAction(b);
            if (a2 == 1) {
                try {
                    if (!C4655ed.m13639a(context)) {
                        C4650dz.m13610a(context, d, 1008, "A not in foreground");
                        return;
                    }
                } catch (Exception e) {
                    C4408b.m12478a((Throwable) e);
                    C4650dz.m13610a(context, d, 1008, "A meet a exception when help B's activity");
                    return;
                }
            }
            context.startActivity(intent);
            C4650dz.m13610a(context, d, ReturnCode.E_INVALID_OPERATION, "A is successful");
            C4650dz.m13610a(context, d, 1006, "The job is finished");
        }
    }

    /* renamed from: a */
    public void mo29028a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Activity) || intent == null) {
            C4650dz.m13610a(context, "activity", 1008, "B receive incorrect message");
        } else {
            m13625a((Activity) context, intent);
        }
    }

    /* renamed from: a */
    public void mo29029a(Context context, C4654ec ecVar) {
        if (ecVar != null) {
            m13626b(context, ecVar);
        } else {
            C4650dz.m13610a(context, "activity", 1008, "A receive incorrect message");
        }
    }
}
