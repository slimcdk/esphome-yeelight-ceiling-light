package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.C1465k0;
import com.google.android.gms.internal.wearable.C1480n0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.wearable.n0 */
public abstract class C1480n0<MessageType extends C1480n0<MessageType, BuilderType>, BuilderType extends C1465k0<MessageType, BuilderType>> extends C1439f<MessageType, BuilderType> {
    private static final Map<Object, C1480n0<?, ?>> zzb = new ConcurrentHashMap();
    protected C1487o2 zzc = C1487o2.m3661a();
    protected int zzd = -1;

    /* renamed from: m */
    static <T extends C1480n0> T m3619m(Class<T> cls) {
        Map<Object, C1480n0<?, ?>> map = zzb;
        T t = (C1480n0) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C1480n0) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C1480n0) ((C1480n0) C1534y2.m3984h(cls)).mo13717j(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: n */
    protected static <T extends C1480n0> void m3620n(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: o */
    protected static Object m3621o(C1486o1 o1Var, String str, Object[] objArr) {
        return new C1537z1(o1Var, str, objArr);
    }

    /* renamed from: p */
    static Object m3622p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: q */
    protected static C1510t0 m3623q() {
        return C1436e1.m3514e();
    }

    /* renamed from: r */
    protected static C1505s0 m3624r() {
        return C1455i0.m3552e();
    }

    /* renamed from: s */
    protected static <E> C1515u0<E> m3625s() {
        return C1533y1.m3968e();
    }

    /* renamed from: t */
    protected static <E> C1515u0<E> m3626t(C1515u0<E> u0Var) {
        int size = u0Var.size();
        return u0Var.mo13609h(size == 0 ? 10 : size + size);
    }

    /* renamed from: u */
    static <T extends C1480n0<T, ?>> T m3627u(T t, byte[] bArr, int i, int i2, C1425c0 c0Var) {
        T t2 = (C1480n0) t.mo13717j(4, (Object) null, (Object) null);
        try {
            C1417a2<?> b = C1529x1.m3906a().mo13843b(t2.getClass());
            b.mo13580b(t2, bArr, 0, i2, new C1454i(c0Var));
            b.mo13584f(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzcc e) {
            e.zza(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzcc) {
                throw ((zzcc) e2.getCause());
            }
            zzcc zzcc = new zzcc(e2);
            zzcc.zza(t2);
            throw zzcc;
        } catch (IndexOutOfBoundsException unused) {
            zzcc zzb2 = zzcc.zzb();
            zzb2.zza(t2);
            throw zzb2;
        }
    }

    /* renamed from: v */
    protected static <T extends C1480n0<T, ?>> T m3628v(T t, byte[] bArr) {
        T u = m3627u(t, bArr, 0, bArr.length, C1425c0.m3435a());
        if (u == null || u.mo13719l()) {
            return u;
        }
        zzcc zzcc = new zzcc(new zzdv(u).getMessage());
        zzcc.zza(u);
        throw zzcc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C1486o1 mo13680a() {
        return (C1480n0) mo13717j(6, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final int mo13711b() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = C1529x1.m3906a().mo13843b(getClass()).mo13579a(this);
        this.zzd = a;
        return a;
    }

    /* renamed from: c */
    public final void mo13712c(C1527x xVar) {
        C1529x1.m3906a().mo13843b(getClass()).mo13585g(this, C1531y.m3924l(xVar));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C1481n1 mo13713d() {
        C1465k0 k0Var = (C1465k0) mo13717j(5, (Object) null, (Object) null);
        k0Var.mo13686o(this);
        return k0Var;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C1481n1 mo13714e() {
        return (C1465k0) mo13717j(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1529x1.m3906a().mo13843b(getClass()).mo13586h(this, (C1480n0) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo13623g() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13624h(int i) {
        this.zzd = i;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = C1529x1.m3906a().mo13843b(getClass()).mo13582d(this);
        this.zza = d;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo13717j(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final <MessageType extends C1480n0<MessageType, BuilderType>, BuilderType extends C1465k0<MessageType, BuilderType>> BuilderType mo13718k() {
        return (C1465k0) mo13717j(5, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final boolean mo13719l() {
        byte byteValue = ((Byte) mo13717j(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = C1529x1.m3906a().mo13843b(getClass()).mo13583e(this);
        mo13717j(2, true != e ? null : this, (Object) null);
        return e;
    }

    public final String toString() {
        return C1496q1.m3727a(this, super.toString());
    }
}
