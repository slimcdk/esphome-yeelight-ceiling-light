package p075o;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import p191o4.C9779a;

/* renamed from: o.u0 */
public final class C3408u0 implements C0689b<C3406t0> {

    /* renamed from: a */
    private final C9779a<Context> f5542a;

    /* renamed from: b */
    private final C9779a<String> f5543b;

    /* renamed from: c */
    private final C9779a<Integer> f5544c;

    public C3408u0(C9779a<Context> aVar, C9779a<String> aVar2, C9779a<Integer> aVar3) {
        this.f5542a = aVar;
        this.f5543b = aVar2;
        this.f5544c = aVar3;
    }

    /* renamed from: a */
    public static C3408u0 m9396a(C9779a<Context> aVar, C9779a<String> aVar2, C9779a<Integer> aVar3) {
        return new C3408u0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C3406t0 m9397c(Context context, String str, int i) {
        return new C3406t0(context, str, i);
    }

    /* renamed from: b */
    public C3406t0 get() {
        return m9397c(this.f5542a.get(), this.f5543b.get(), this.f5544c.get().intValue());
    }
}
