package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.lang.reflect.Method;

/* renamed from: com.xiaomi.push.ay */
class C4536ay implements C4531au {

    /* renamed from: a */
    private Context f7600a;

    /* renamed from: a */
    private Class<?> f7601a;

    /* renamed from: a */
    private Object f7602a;

    /* renamed from: a */
    private Method f7603a = null;

    /* renamed from: b */
    private Method f7604b = null;

    /* renamed from: c */
    private Method f7605c = null;

    /* renamed from: d */
    private Method f7606d = null;

    public C4536ay(Context context) {
        this.f7600a = context;
        m12920a(context);
    }

    /* renamed from: a */
    private String m12919a(Context context, Method method) {
        Object obj = this.f7602a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, new Object[]{context});
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            C4408b.m12477a("miui invoke error", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    private void m12920a(Context context) {
        try {
            Class<?> a = C4994v.m15735a(context, "com.android.id.impl.IdProviderImpl");
            this.f7601a = a;
            this.f7602a = a.newInstance();
            this.f7603a = this.f7601a.getMethod("getUDID", new Class[]{Context.class});
            this.f7604b = this.f7601a.getMethod("getOAID", new Class[]{Context.class});
            this.f7605c = this.f7601a.getMethod("getVAID", new Class[]{Context.class});
            this.f7606d = this.f7601a.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e) {
            C4408b.m12477a("miui load class error", (Throwable) e);
        }
    }

    /* renamed from: a */
    public String mo28753a() {
        return m12919a(this.f7600a, this.f7604b);
    }

    /* renamed from: a */
    public boolean m12922a() {
        return (this.f7601a == null || this.f7602a == null) ? false : true;
    }
}
