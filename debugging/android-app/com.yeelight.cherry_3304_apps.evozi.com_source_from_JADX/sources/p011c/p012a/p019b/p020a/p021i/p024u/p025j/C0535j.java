package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.j */
final /* synthetic */ class C0535j implements C0514b0.C0516b {

    /* renamed from: a */
    private final long f185a;

    /* renamed from: b */
    private final C0487l f186b;

    private C0535j(long j, C0487l lVar) {
        this.f185a = j;
        this.f186b = lVar;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m295a(long j, C0487l lVar) {
        return new C0535j(j, lVar);
    }

    public Object apply(Object obj) {
        return C0514b0.m209X(this.f185a, this.f186b, (SQLiteDatabase) obj);
    }
}
