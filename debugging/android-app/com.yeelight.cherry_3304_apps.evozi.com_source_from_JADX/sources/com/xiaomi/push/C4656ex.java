package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4909f;

/* renamed from: com.xiaomi.push.ex */
class C4656ex implements C4652et {
    C4656ex() {
    }

    /* renamed from: a */
    private void m14126a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (TextUtils.isEmpty(stringExtra)) {
                C4645em.m14078a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                String b = C4644el.m14076b(stringExtra2);
                boolean isEmpty = TextUtils.isEmpty(b);
                Context applicationContext = service.getApplicationContext();
                if (!isEmpty) {
                    C4645em.m14078a(applicationContext, b, 1007, "old version message ");
                } else {
                    C4645em.m14078a(applicationContext, "service", 1008, "B get a incorrect message");
                }
            } else {
                C4645em.m14078a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
            }
        }
    }

    /* renamed from: a */
    private void m14127a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                C4645em.m14078a(context, "service", 1008, "argument error");
            } else {
                C4645em.m14078a(context, str3, 1008, "argument error");
            }
        } else if (!C4909f.m15741a(context, str)) {
            C4645em.m14078a(context, str3, 1003, "B is not ready");
        } else {
            C4645em.m14078a(context, str3, 1002, "B is ready");
            C4645em.m14078a(context, str3, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", context.getPackageName());
                intent.putExtra("awake_info", C4644el.m14074a(str3));
                if (context.startService(intent) != null) {
                    C4645em.m14078a(context, str3, ReturnCode.E_INVALID_OPERATION, "A is successful");
                    C4645em.m14078a(context, str3, 1006, "The job is finished");
                    return;
                }
                C4645em.m14078a(context, str3, 1008, "A is fail to help B's service");
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
                C4645em.m14078a(context, str3, 1008, "A meet a exception when help B's service");
            }
        }
    }

    /* renamed from: a */
    public void mo25037a(Context context, Intent intent, String str) {
        if (context != null && (context instanceof Service)) {
            m14126a((Service) context, intent);
        }
    }

    /* renamed from: a */
    public void mo25038a(Context context, C4648ep epVar) {
        if (epVar != null) {
            m14127a(context, epVar.mo25039a(), epVar.mo25044c(), epVar.mo25046d());
        }
    }
}
