package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.content.Context;
import dagger.internal.C10742b;
import javax.inject.C11584a;

/* renamed from: c.a.b.a.i.u.j.i0 */
public final class C0534i0 implements C10742b<C0531h0> {

    /* renamed from: a */
    private final C11584a<Context> f182a;

    /* renamed from: b */
    private final C11584a<String> f183b;

    /* renamed from: c */
    private final C11584a<Integer> f184c;

    public C0534i0(C11584a<Context> aVar, C11584a<String> aVar2, C11584a<Integer> aVar3) {
        this.f182a = aVar;
        this.f183b = aVar2;
        this.f184c = aVar3;
    }

    /* renamed from: a */
    public static C0534i0 m293a(C11584a<Context> aVar, C11584a<String> aVar2, C11584a<Integer> aVar3) {
        return new C0534i0(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public C0531h0 get() {
        return new C0531h0(this.f182a.get(), this.f183b.get(), this.f184c.get().intValue());
    }
}
