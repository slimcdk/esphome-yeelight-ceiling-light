package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.w */
final /* synthetic */ class C0548w implements C0514b0.C0516b {

    /* renamed from: a */
    private final C0514b0 f202a;

    /* renamed from: b */
    private final C0487l f203b;

    /* renamed from: c */
    private final C0481h f204c;

    private C0548w(C0514b0 b0Var, C0487l lVar, C0481h hVar) {
        this.f202a = b0Var;
        this.f203b = lVar;
        this.f204c = hVar;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m310a(C0514b0 b0Var, C0487l lVar, C0481h hVar) {
        return new C0548w(b0Var, lVar, hVar);
    }

    public Object apply(Object obj) {
        return C0514b0.m206T(this.f202a, this.f203b, this.f204c, (SQLiteDatabase) obj);
    }
}
