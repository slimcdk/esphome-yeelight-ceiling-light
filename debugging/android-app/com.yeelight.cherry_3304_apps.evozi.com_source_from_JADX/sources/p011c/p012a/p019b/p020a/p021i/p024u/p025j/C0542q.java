package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.q */
final /* synthetic */ class C0542q implements C0514b0.C0518d {

    /* renamed from: a */
    private final SQLiteDatabase f196a;

    private C0542q(SQLiteDatabase sQLiteDatabase) {
        this.f196a = sQLiteDatabase;
    }

    /* renamed from: b */
    public static C0514b0.C0518d m302b(SQLiteDatabase sQLiteDatabase) {
        return new C0542q(sQLiteDatabase);
    }

    /* renamed from: a */
    public Object mo8517a() {
        return this.f196a.beginTransaction();
    }
}
