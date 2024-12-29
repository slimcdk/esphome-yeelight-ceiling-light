package com.google.android.datatransport.runtime.dagger.internal;

import p043i.C3246a;
import p191o4.C9779a;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.a */
public final class C0688a<T> implements C9779a<T>, C3246a<T> {

    /* renamed from: c */
    private static final Object f433c = new Object();

    /* renamed from: a */
    private volatile C9779a<T> f434a;

    /* renamed from: b */
    private volatile Object f435b = f433c;

    private C0688a(C9779a<T> aVar) {
        this.f434a = aVar;
    }

    /* renamed from: a */
    public static <P extends C9779a<T>, T> C3246a<T> m531a(P p) {
        return p instanceof C3246a ? (C3246a) p : new C0688a((C9779a) C0691d.m536b(p));
    }

    /* renamed from: b */
    public static <P extends C9779a<T>, T> C9779a<T> m532b(P p) {
        C0691d.m536b(p);
        return p instanceof C0688a ? p : new C0688a(p);
    }

    /* renamed from: c */
    public static Object m533c(Object obj, Object obj2) {
        if (!(obj != f433c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f435b;
        T t2 = f433c;
        if (t == t2) {
            synchronized (this) {
                t = this.f435b;
                if (t == t2) {
                    t = this.f434a.get();
                    this.f435b = m533c(this.f435b, t);
                    this.f434a = null;
                }
            }
        }
        return t;
    }
}
