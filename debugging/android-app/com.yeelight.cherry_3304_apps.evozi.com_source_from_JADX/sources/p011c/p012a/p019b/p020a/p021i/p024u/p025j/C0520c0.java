package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import javax.inject.C11584a;

/* renamed from: c.a.b.a.i.u.j.c0 */
public final class C0520c0 implements C10742b<C0514b0> {

    /* renamed from: a */
    private final C11584a<C1354a> f162a;

    /* renamed from: b */
    private final C11584a<C1354a> f163b;

    /* renamed from: c */
    private final C11584a<C0521d> f164c;

    /* renamed from: d */
    private final C11584a<C0531h0> f165d;

    public C0520c0(C11584a<C1354a> aVar, C11584a<C1354a> aVar2, C11584a<C0521d> aVar3, C11584a<C0531h0> aVar4) {
        this.f162a = aVar;
        this.f163b = aVar2;
        this.f164c = aVar3;
        this.f165d = aVar4;
    }

    /* renamed from: a */
    public static C0520c0 m248a(C11584a<C1354a> aVar, C11584a<C1354a> aVar2, C11584a<C0521d> aVar3, C11584a<C0531h0> aVar4) {
        return new C0520c0(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: b */
    public C0514b0 get() {
        return new C0514b0(this.f162a.get(), this.f163b.get(), this.f164c.get(), this.f165d.get());
    }
}
