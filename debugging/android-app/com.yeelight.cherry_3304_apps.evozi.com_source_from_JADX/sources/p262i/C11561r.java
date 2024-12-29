package p262i;

import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1150z;

/* renamed from: i.r */
public final class C11561r<T> {

    /* renamed from: a */
    private final C1150z f22970a;

    /* renamed from: b */
    private final T f22971b;

    /* renamed from: c */
    private final C0988a0 f22972c;

    private C11561r(C1150z zVar, T t, C0988a0 a0Var) {
        C11566t.m30352a(zVar, "rawResponse == null");
        this.f22970a = zVar;
        this.f22971b = t;
        this.f22972c = a0Var;
    }

    /* renamed from: c */
    public static <T> C11561r<T> m30328c(C0988a0 a0Var, C1150z zVar) {
        return new C11561r<>(zVar, (Object) null, a0Var);
    }

    /* renamed from: g */
    public static <T> C11561r<T> m30329g(T t, C1150z zVar) {
        return new C11561r<>(zVar, t, (C0988a0) null);
    }

    /* renamed from: a */
    public T mo36471a() {
        return this.f22971b;
    }

    /* renamed from: b */
    public int mo36472b() {
        return this.f22970a.mo9861o();
    }

    /* renamed from: d */
    public C0988a0 mo36473d() {
        return this.f22972c;
    }

    /* renamed from: e */
    public boolean mo36474e() {
        return this.f22970a.mo9866t();
    }

    /* renamed from: f */
    public String mo36475f() {
        return this.f22970a.mo9868u();
    }
}
