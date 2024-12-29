package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4969l;

/* renamed from: com.xiaomi.push.ek */
class C4662ek implements C4658eg {
    C4662ek() {
    }

    /* renamed from: a */
    private void m13667a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (TextUtils.isEmpty(stringExtra)) {
                C4650dz.m13610a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                String b = C4649dy.m13608b(stringExtra2);
                boolean isEmpty = TextUtils.isEmpty(b);
                Context applicationContext = service.getApplicationContext();
                if (!isEmpty) {
                    C4650dz.m13610a(applicationContext, b, 1007, "old version message ");
                } else {
                    C4650dz.m13610a(applicationContext, "service", 1008, "B get a incorrect message");
                }
            } else {
                C4650dz.m13610a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
            }
        }
    }

    /* renamed from: a */
    private void m13668a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                C4650dz.m13610a(context, "service", 1008, "argument error");
            } else {
                C4650dz.m13610a(context, str3, 1008, "argument error");
            }
        } else if (!C4969l.m15575a(context, str)) {
            C4650dz.m13610a(context, str3, 1003, "B is not ready");
        } else {
            C4650dz.m13610a(context, str3, 1002, "B is ready");
            C4650dz.m13610a(context, str3, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", context.getPackageName());
                intent.putExtra("awake_info", C4649dy.m13606a(str3));
                if (context.startService(intent) != null) {
                    C4650dz.m13610a(context, str3, ReturnCode.E_INVALID_OPERATION, "A is successful");
                    C4650dz.m13610a(context, str3, 1006, "The job is finished");
                    return;
                }
                C4650dz.m13610a(context, str3, 1008, "A is fail to help B's service");
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
                C4650dz.m13610a(context, str3, 1008, "A meet a exception when help B's service");
            }
        }
    }

    /* renamed from: a */
    public void mo29028a(Context context, Intent intent, String str) {
        if (context != null && (context instanceof Service)) {
            m13667a((Service) context, intent);
        }
    }

    /* renamed from: a */
    public void mo29029a(Context context, C4654ec ecVar) {
        if (ecVar != null) {
            m13668a(context, ecVar.mo29030a(), ecVar.mo29035c(), ecVar.mo29037d());
        }
    }
}
