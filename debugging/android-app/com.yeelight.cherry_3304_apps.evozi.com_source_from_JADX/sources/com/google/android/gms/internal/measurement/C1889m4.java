package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1889m4.C1891b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.m4 */
public abstract class C1889m4<MessageType extends C1889m4<MessageType, BuilderType>, BuilderType extends C1891b<MessageType, BuilderType>> extends C2044w2<MessageType, BuilderType> {
    private static Map<Object, C1889m4<?, ?>> zzd = new ConcurrentHashMap();
    protected C1814h7 zzb = C1814h7.m5204a();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.measurement.m4$a */
    public static class C1890a<T extends C1889m4<T, ?>> extends C1703a3<T> {
        public C1890a(T t) {
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.m4$b */
    public static abstract class C1891b<MessageType extends C1889m4<MessageType, BuilderType>, BuilderType extends C1891b<MessageType, BuilderType>> extends C2075y2<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f3566a;

        /* renamed from: b */
        protected MessageType f3567b;

        /* renamed from: c */
        protected boolean f3568c = false;

        protected C1891b(MessageType messagetype) {
            this.f3566a = messagetype;
            this.f3567b = (C1889m4) messagetype.mo11417o(C1894e.f3572d, (Object) null, (Object) null);
        }

        /* renamed from: p */
        private static void m5483p(MessageType messagetype, MessageType messagetype2) {
            C1844j6.m5284a().mo11763c(messagetype).mo11469h(messagetype, messagetype2);
        }

        /* renamed from: q */
        private final BuilderType m5484q(byte[] bArr, int i, int i2, C2076y3 y3Var) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            try {
                C1844j6.m5284a().mo11763c(this.f3567b).mo11468g(this.f3567b, bArr, 0, i2 + 0, new C1764e3(y3Var));
                return this;
            } catch (C2046w4 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C2046w4.m6265a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: c */
        public final boolean mo11840c() {
            return C1889m4.m5468s(this.f3567b, false);
        }

        public /* synthetic */ Object clone() {
            C1891b bVar = (C1891b) this.f3566a.mo11417o(C1894e.f3573e, (Object) null, (Object) null);
            bVar.mo11857o((C1889m4) mo11852M());
            return bVar;
        }

        /* renamed from: d */
        public final /* synthetic */ C2062x5 mo11841d() {
            return this.f3566a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final /* synthetic */ C2075y2 mo11854k(C2044w2 w2Var) {
            mo11857o((C1889m4) w2Var);
            return this;
        }

        /* renamed from: l */
        public final /* synthetic */ C2075y2 mo11855l(byte[] bArr, int i, int i2) {
            m5484q(bArr, 0, i2, C2076y3.m6600a());
            return this;
        }

        /* renamed from: m */
        public final /* synthetic */ C2075y2 mo11856m(byte[] bArr, int i, int i2, C2076y3 y3Var) {
            m5484q(bArr, 0, i2, y3Var);
            return this;
        }

        /* renamed from: o */
        public final BuilderType mo11857o(MessageType messagetype) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            m5483p(this.f3567b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo11858r() {
            MessageType messagetype = (C1889m4) this.f3567b.mo11417o(C1894e.f3572d, (Object) null, (Object) null);
            m5483p(messagetype, this.f3567b);
            this.f3567b = messagetype;
        }

        /* renamed from: s */
        public MessageType mo11852M() {
            if (this.f3568c) {
                return this.f3567b;
            }
            MessageType messagetype = this.f3567b;
            C1844j6.m5284a().mo11763c(messagetype).mo11464c(messagetype);
            this.f3568c = true;
            return this.f3567b;
        }

        /* renamed from: t */
        public final MessageType mo11851I() {
            MessageType messagetype = (C1889m4) mo11852M();
            if (messagetype.mo11840c()) {
                return messagetype;
            }
            throw new C1783f7(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.m4$c */
    static final class C1892c implements C1811h4<C1892c> {
        /* renamed from: C */
        public final int mo11706C() {
            throw new NoSuchMethodError();
        }

        /* renamed from: D */
        public final C2034v7 mo11707D() {
            throw new NoSuchMethodError();
        }

        /* renamed from: E */
        public final C2081y7 mo11708E() {
            throw new NoSuchMethodError();
        }

        /* renamed from: F */
        public final boolean mo11709F() {
            throw new NoSuchMethodError();
        }

        /* renamed from: G */
        public final boolean mo11710G() {
            throw new NoSuchMethodError();
        }

        /* renamed from: N */
        public final C1738c6 mo11711N(C1738c6 c6Var, C1738c6 c6Var2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        /* renamed from: l0 */
        public final C2047w5 mo11712l0(C2047w5 w5Var, C2062x5 x5Var) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.m4$d */
    public static abstract class C1893d<MessageType extends C1893d<MessageType, BuilderType>, BuilderType> extends C1889m4<MessageType, BuilderType> implements C2094z5 {
        protected C1780f4<C1892c> zzc = C1780f4.m5089c();

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final C1780f4<C1892c> mo11862y() {
            if (this.zzc.mo11656o()) {
                this.zzc = (C1780f4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.measurement.m4$e */
    public static final class C1894e {

        /* renamed from: a */
        public static final int f3569a = 1;

        /* renamed from: b */
        public static final int f3570b = 2;

        /* renamed from: c */
        public static final int f3571c = 3;

        /* renamed from: d */
        public static final int f3572d = 4;

        /* renamed from: e */
        public static final int f3573e = 5;

        /* renamed from: f */
        public static final int f3574f = 6;

        /* renamed from: g */
        public static final int f3575g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f3576h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f3577i = 1;

        /* renamed from: j */
        public static final int f3578j = 2;

        /* renamed from: k */
        public static final int f3579k = 1;

        /* renamed from: l */
        public static final int f3580l = 2;

        /* renamed from: a */
        public static int[] m5504a() {
            return (int[]) f3576h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.m4$f */
    public static class C1895f<ContainingType extends C2062x5, Type> extends C2092z3<ContainingType, Type> {
    }

    /* renamed from: l */
    static <T extends C1889m4<?, ?>> T m5462l(Class<T> cls) {
        T t = (C1889m4) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C1889m4) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C1889m4) ((C1889m4) C1859k7.m5329c(cls)).mo11417o(C1894e.f3574f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: m */
    protected static <E> C1999t4<E> m5463m(C1999t4<E> t4Var) {
        int size = t4Var.size();
        return t4Var.mo11562a(size == 0 ? 10 : size << 1);
    }

    /* renamed from: n */
    protected static C2014u4 m5464n(C2014u4 u4Var) {
        int size = u4Var.size();
        return u4Var.mo11806d0(size == 0 ? 10 : size << 1);
    }

    /* renamed from: p */
    protected static Object m5465p(C2062x5 x5Var, String str, Object[] objArr) {
        return new C1876l6(x5Var, str, objArr);
    }

    /* renamed from: q */
    static Object m5466q(Method method, Object obj, Object... objArr) {
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

    /* renamed from: r */
    protected static <T extends C1889m4<?, ?>> void m5467r(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: s */
    protected static final <T extends C1889m4<T, ?>> boolean m5468s(T t, boolean z) {
        byte byteValue = ((Byte) t.mo11417o(C1894e.f3569a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = C1844j6.m5284a().mo11763c(t).mo11463b(t);
        if (z) {
            t.mo11417o(C1894e.f3570b, b ? t : null, (Object) null);
        }
        return b;
    }

    /* renamed from: v */
    protected static C1969r4 m5469v() {
        return C1939p4.m5757e();
    }

    /* renamed from: w */
    protected static C2014u4 m5470w() {
        return C1875l5.m5412e();
    }

    /* renamed from: x */
    protected static <E> C1999t4<E> m5471x() {
        return C1897m6.m5509f();
    }

    /* renamed from: a */
    public final /* synthetic */ C2047w5 mo11838a() {
        return (C1891b) mo11417o(C1894e.f3573e, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final void mo11839b(C2028v3 v3Var) {
        C1844j6.m5284a().mo11763c(this).mo11467f(this, C2060x3.m6522P(v3Var));
    }

    /* renamed from: c */
    public final boolean mo11840c() {
        return m5468s(this, true);
    }

    /* renamed from: d */
    public final /* synthetic */ C2062x5 mo11841d() {
        return (C1889m4) mo11417o(C1894e.f3574f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1844j6.m5284a().mo11763c(this).mo11466e(this, (C1889m4) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ C2047w5 mo11843f() {
        C1891b bVar = (C1891b) mo11417o(C1894e.f3573e, (Object) null, (Object) null);
        bVar.mo11857o(this);
        return bVar;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = C1844j6.m5284a().mo11763c(this).mo11462a(this);
        this.zza = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo11845i() {
        return this.zzc;
    }

    /* renamed from: j */
    public final int mo11846j() {
        if (this.zzc == -1) {
            this.zzc = C1844j6.m5284a().mo11763c(this).mo11465d(this);
        }
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo11847k(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract Object mo11417o(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final <MessageType extends C1889m4<MessageType, BuilderType>, BuilderType extends C1891b<MessageType, BuilderType>> BuilderType mo11848t() {
        return (C1891b) mo11417o(C1894e.f3573e, (Object) null, (Object) null);
    }

    public String toString() {
        return C2079y5.m6604a(this, super.toString());
    }

    /* renamed from: u */
    public final BuilderType mo11850u() {
        BuilderType buildertype = (C1891b) mo11417o(C1894e.f3573e, (Object) null, (Object) null);
        buildertype.mo11857o(this);
        return buildertype;
    }
}
