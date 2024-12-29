package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.k */
final /* synthetic */ class C0536k implements C0514b0.C0516b {

    /* renamed from: a */
    private final C0514b0 f187a;

    /* renamed from: b */
    private final C0487l f188b;

    private C0536k(C0514b0 b0Var, C0487l lVar) {
        this.f187a = b0Var;
        this.f188b = lVar;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m296a(C0514b0 b0Var, C0487l lVar) {
        return new C0536k(b0Var, lVar);
    }

    public Object apply(Object obj) {
        return C0514b0.m203Q(this.f187a, this.f188b, (SQLiteDatabase) obj);
    }
}
