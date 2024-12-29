package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.lang.reflect.Method;

/* renamed from: com.xiaomi.push.as */
class C4514as implements C4513ar {

    /* renamed from: a */
    private Context f8182a;

    /* renamed from: a */
    private Class<?> f8183a;

    /* renamed from: a */
    private Object f8184a;

    /* renamed from: a */
    private Method f8185a = null;

    /* renamed from: b */
    private Method f8186b = null;

    /* renamed from: c */
    private Method f8187c = null;

    /* renamed from: d */
    private Method f8188d = null;

    public C4514as(Context context) {
        this.f8182a = context;
        m13325a(context);
    }

    /* renamed from: a */
    private String m13324a(Context context, Method method) {
        Object obj = this.f8184a;
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
            C3989b.m10677a("miui invoke error", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    private void m13325a(Context context) {
        try {
            Class<?> a = C4937t.m15867a(context, "com.android.id.impl.IdProviderImpl");
            this.f8183a = a;
            this.f8184a = a.newInstance();
            this.f8185a = this.f8183a.getMethod("getUDID", new Class[]{Context.class});
            this.f8186b = this.f8183a.getMethod("getOAID", new Class[]{Context.class});
            this.f8187c = this.f8183a.getMethod("getVAID", new Class[]{Context.class});
            this.f8188d = this.f8183a.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e) {
            C3989b.m10677a("miui load class error", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m13326a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName());
    }

    /* renamed from: a */
    public String mo24744a() {
        return m13324a(this.f8182a, this.f8185a);
    }

    /* renamed from: a */
    public boolean m13328a() {
        return (this.f8183a == null || this.f8184a == null) ? false : true;
    }

    /* renamed from: b */
    public String mo24745b() {
        return m13324a(this.f8182a, this.f8186b);
    }

    /* renamed from: c */
    public String mo24746c() {
        return m13324a(this.f8182a, this.f8187c);
    }

    /* renamed from: d */
    public String mo24747d() {
        return m13324a(this.f8182a, this.f8188d);
    }
}
