package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1110g8;
import com.google.android.gms.internal.measurement.C1174k8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.k8 */
public abstract class C1174k8<MessageType extends C1174k8<MessageType, BuilderType>, BuilderType extends C1110g8<MessageType, BuilderType>> extends C1391y6<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C1240oa zzc = C1240oa.m2413c();
    protected int zzd = -1;

    /* renamed from: m */
    static C1174k8 m2146m(Class cls) {
        Map map = zza;
        C1174k8 k8Var = (C1174k8) map.get(cls);
        if (k8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k8Var = (C1174k8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (k8Var == null) {
            k8Var = (C1174k8) ((C1174k8) C1380xa.m3266j(cls)).mo12569w(6, (Object) null, (Object) null);
            if (k8Var != null) {
                map.put(cls, k8Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return k8Var;
    }

    /* renamed from: o */
    protected static C1222n8 m2147o() {
        return C1190l8.m2230g();
    }

    /* renamed from: p */
    protected static C1238o8 m2148p() {
        return C1015a9.m1685e();
    }

    /* renamed from: q */
    protected static C1238o8 m2149q(C1238o8 o8Var) {
        int size = o8Var.size();
        return o8Var.mo12534h(size == 0 ? 10 : size + size);
    }

    /* renamed from: r */
    protected static C1254p8 m2150r() {
        return C1334u9.m3071e();
    }

    /* renamed from: s */
    protected static C1254p8 m2151s(C1254p8 p8Var) {
        int size = p8Var.size();
        return p8Var.mo12539s(size == 0 ? 10 : size + size);
    }

    /* renamed from: t */
    static Object m2152t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: u */
    protected static Object m2153u(C1191l9 l9Var, String str, Object[] objArr) {
        return new C1349v9(l9Var, str, objArr);
    }

    /* renamed from: v */
    protected static void m2154v(Class cls, C1174k8 k8Var) {
        zza.put(cls, k8Var);
    }

    /* renamed from: a */
    public final /* synthetic */ C1191l9 mo12830a() {
        return (C1174k8) mo12569w(6, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final /* synthetic */ C1175k9 mo12907b() {
        return (C1110g8) mo12569w(5, (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final int mo12908c() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int f = C1319t9.m3045a().mo13383b(getClass()).mo13046f(this);
        this.zzd = f;
        return f;
    }

    /* renamed from: d */
    public final void mo12909d(C1301s7 s7Var) {
        C1319t9.m3045a().mo13383b(getClass()).mo13048h(this, C1317t7.m3004K(s7Var));
    }

    /* renamed from: e */
    public final /* synthetic */ C1175k9 mo12910e() {
        C1110g8 g8Var = (C1110g8) mo12569w(5, (Object) null, (Object) null);
        g8Var.mo12836o(this);
        return g8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1319t9.m3045a().mo13383b(getClass()).mo13049i(this, (C1174k8) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo12912g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int e = C1319t9.m3045a().mo13383b(getClass()).mo13045e(this);
        this.zzb = e;
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12914i(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C1110g8 mo12915k() {
        return (C1110g8) mo12569w(5, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final C1110g8 mo12916l() {
        C1110g8 g8Var = (C1110g8) mo12569w(5, (Object) null, (Object) null);
        g8Var.mo12836o(this);
        return g8Var;
    }

    public final String toString() {
        return C1223n9.m2324a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo12569w(int i, Object obj, Object obj2);
}
