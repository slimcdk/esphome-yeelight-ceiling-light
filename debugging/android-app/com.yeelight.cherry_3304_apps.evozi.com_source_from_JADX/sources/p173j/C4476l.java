package p173j;

import javax.annotation.Nullable;
import p156f.C4332c0;
import p156f.C4336d0;

/* renamed from: j.l */
public final class C4476l<T> {

    /* renamed from: a */
    private final C4332c0 f8069a;
    @Nullable

    /* renamed from: b */
    private final T f8070b;
    @Nullable

    /* renamed from: c */
    private final C4336d0 f8071c;

    private C4476l(C4332c0 c0Var, @Nullable T t, @Nullable C4336d0 d0Var) {
        this.f8069a = c0Var;
        this.f8070b = t;
        this.f8071c = d0Var;
    }

    /* renamed from: c */
    public static <T> C4476l<T> m13188c(C4336d0 d0Var, C4332c0 c0Var) {
        C4482o.m13230b(d0Var, "body == null");
        C4482o.m13230b(c0Var, "rawResponse == null");
        if (!c0Var.mo23865o()) {
            return new C4476l<>(c0Var, (Object) null, d0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static <T> C4476l<T> m13189f(@Nullable T t, C4332c0 c0Var) {
        C4482o.m13230b(c0Var, "rawResponse == null");
        if (c0Var.mo23865o()) {
            return new C4476l<>(c0Var, t, (C4336d0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo24562a() {
        return this.f8070b;
    }

    /* renamed from: b */
    public int mo24563b() {
        return this.f8069a.mo23860g();
    }

    /* renamed from: d */
    public boolean mo24564d() {
        return this.f8069a.mo23865o();
    }

    /* renamed from: e */
    public String mo24565e() {
        return this.f8069a.mo23866s();
    }

    public String toString() {
        return this.f8069a.toString();
    }
}
