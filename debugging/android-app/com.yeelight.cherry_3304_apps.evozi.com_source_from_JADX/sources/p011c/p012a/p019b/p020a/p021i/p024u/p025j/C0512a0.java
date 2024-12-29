package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.a0 */
final /* synthetic */ class C0512a0 implements C0514b0.C0516b {

    /* renamed from: a */
    private final C0514b0 f150a;

    /* renamed from: b */
    private final C0487l f151b;

    private C0512a0(C0514b0 b0Var, C0487l lVar) {
        this.f150a = b0Var;
        this.f151b = lVar;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m191a(C0514b0 b0Var, C0487l lVar) {
        return new C0512a0(b0Var, lVar);
    }

    public Object apply(Object obj) {
        return C0514b0.m200K(this.f150a, this.f151b, (SQLiteDatabase) obj);
    }
}
