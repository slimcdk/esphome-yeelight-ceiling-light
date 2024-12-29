package p011c.p012a.p019b.p020a.p021i;

import dagger.internal.C10742b;
import dagger.internal.C10744d;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.a.i.j */
public final class C0484j implements C10742b<Executor> {

    /* renamed from: a */
    private static final C0484j f98a = new C0484j();

    /* renamed from: a */
    public static C0484j m115a() {
        return f98a;
    }

    /* renamed from: b */
    public static Executor m116b() {
        Executor a = C0483i.m114a();
        C10744d.m26606c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public Executor get() {
        return m116b();
    }
}
