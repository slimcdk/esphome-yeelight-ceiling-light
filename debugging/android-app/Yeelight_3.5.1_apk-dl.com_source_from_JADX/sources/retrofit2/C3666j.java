package retrofit2;

import javax.annotation.Nullable;
import okhttp3.C3509b0;
import okhttp3.C3518c0;

/* renamed from: retrofit2.j */
public final class C3666j<T> {

    /* renamed from: a */
    private final C3509b0 f6129a;
    @Nullable

    /* renamed from: b */
    private final T f6130b;

    private C3666j(C3509b0 b0Var, @Nullable T t, @Nullable C3518c0 c0Var) {
        this.f6129a = b0Var;
        this.f6130b = t;
    }

    /* renamed from: c */
    public static <T> C3666j<T> m10453c(C3518c0 c0Var, C3509b0 b0Var) {
        C3672m.m10495b(c0Var, "body == null");
        C3672m.m10495b(b0Var, "rawResponse == null");
        if (!b0Var.mo24364l()) {
            return new C3666j<>(b0Var, (Object) null, c0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static <T> C3666j<T> m10454f(@Nullable T t, C3509b0 b0Var) {
        C3672m.m10495b(b0Var, "rawResponse == null");
        if (b0Var.mo24364l()) {
            return new C3666j<>(b0Var, t, (C3518c0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo26040a() {
        return this.f6130b;
    }

    /* renamed from: b */
    public int mo26041b() {
        return this.f6129a.mo24359d();
    }

    /* renamed from: d */
    public boolean mo26042d() {
        return this.f6129a.mo24364l();
    }

    /* renamed from: e */
    public String mo26043e() {
        return this.f6129a.mo24365m();
    }

    public String toString() {
        return this.f6129a.toString();
    }
}
