package com.xiaomi.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4909f;

/* renamed from: com.xiaomi.push.eo */
class C4647eo implements C4652et {
    C4647eo() {
    }

    /* renamed from: a */
    private void m14084a(Activity activity, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b = C4644el.m14076b(stringExtra);
            if (!TextUtils.isEmpty(b)) {
                C4645em.m14078a(activity.getApplicationContext(), b, 1007, "play with activity successfully");
                return;
            }
        }
        C4645em.m14078a(activity.getApplicationContext(), "activity", 1008, "B get incorrect message");
    }

    /* renamed from: b */
    private void m14085b(Context context, C4648ep epVar) {
        String a = epVar.mo25039a();
        String b = epVar.mo25042b();
        String d = epVar.mo25046d();
        int a2 = epVar.mo25039a();
        if (context == null || TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4645em.m14078a(context, "activity", 1008, "argument error");
            } else {
                C4645em.m14078a(context, d, 1008, "argument error");
            }
        } else if (!C4909f.m15744b(context, a, b)) {
            C4645em.m14078a(context, d, 1003, "B is not ready");
        } else {
            C4645em.m14078a(context, d, 1002, "B is ready");
            C4645em.m14078a(context, d, 1004, "A is ready");
            Intent intent = new Intent(b);
            intent.setPackage(a);
            intent.putExtra("awake_info", C4644el.m14074a(d));
            intent.addFlags(276824064);
            intent.setAction(b);
            if (a2 == 1) {
                try {
                    if (!C4649eq.m14098a(context)) {
                        C4645em.m14078a(context, d, 1008, "A not in foreground");
                        return;
                    }
                } catch (Exception e) {
                    C3989b.m10678a((Throwable) e);
                    C4645em.m14078a(context, d, 1008, "A meet a exception when help B's activity");
                    return;
                }
            }
            context.startActivity(intent);
            C4645em.m14078a(context, d, ReturnCode.E_INVALID_OPERATION, "A is successful");
            C4645em.m14078a(context, d, 1006, "The job is finished");
        }
    }

    /* renamed from: a */
    public void mo25037a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Activity) || intent == null) {
            C4645em.m14078a(context, "activity", 1008, "B receive incorrect message");
        } else {
            m14084a((Activity) context, intent);
        }
    }

    /* renamed from: a */
    public void mo25038a(Context context, C4648ep epVar) {
        if (epVar != null) {
            m14085b(context, epVar);
        } else {
            C4645em.m14078a(context, "activity", 1008, "A receive incorrect message");
        }
    }
}
