package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.ax */
class C4535ax {

    /* renamed from: a */
    private static volatile boolean f7599a = false;

    /* renamed from: a */
    private static void m12917a(Class<?> cls, Context context) {
        if (!f7599a) {
            try {
                f7599a = true;
                cls.getDeclaredMethod("InitEntry", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            } catch (Throwable th) {
                C4408b.m12464a("mdid:load lib error " + th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m12918a(Context context) {
        try {
            Class<?> a = C4994v.m15735a(context, "com.bun.miitmdid.core.JLibrary");
            if (a == null) {
                return false;
            }
            m12917a(a, context);
            return true;
        } catch (Throwable th) {
            C4408b.m12464a("mdid:check error " + th);
            return false;
        }
    }
}
