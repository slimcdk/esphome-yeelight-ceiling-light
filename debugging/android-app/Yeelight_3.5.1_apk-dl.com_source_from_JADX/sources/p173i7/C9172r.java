package p173i7;

import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;

/* renamed from: i7.r */
public final class C9172r<T> {

    /* renamed from: a */
    private final C4318x f16982a;

    /* renamed from: b */
    private final T f16983b;

    /* renamed from: c */
    private final C4321y f16984c;

    private C9172r(C4318x xVar, T t, C4321y yVar) {
        this.f16982a = (C4318x) C9177t.m22060a(xVar, "rawResponse == null");
        this.f16983b = t;
        this.f16984c = yVar;
    }

    /* renamed from: c */
    public static <T> C9172r<T> m22036c(C4321y yVar, C4318x xVar) {
        return new C9172r<>(xVar, (Object) null, yVar);
    }

    /* renamed from: g */
    public static <T> C9172r<T> m22037g(T t, C4318x xVar) {
        return new C9172r<>(xVar, t, (C4321y) null);
    }

    /* renamed from: a */
    public T mo37247a() {
        return this.f16983b;
    }

    /* renamed from: b */
    public int mo37248b() {
        return this.f16982a.mo28060o();
    }

    /* renamed from: d */
    public C4321y mo37249d() {
        return this.f16984c;
    }

    /* renamed from: e */
    public boolean mo37250e() {
        return this.f16982a.mo28065t();
    }

    /* renamed from: f */
    public String mo37251f() {
        return this.f16982a.mo28067u();
    }
}
