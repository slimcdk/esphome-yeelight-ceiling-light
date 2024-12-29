package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0531h0;

/* renamed from: c.a.b.a.i.u.j.f0 */
final /* synthetic */ class C0527f0 implements C0531h0.C0532a {

    /* renamed from: a */
    private static final C0527f0 f170a = new C0527f0();

    private C0527f0() {
    }

    /* renamed from: b */
    public static C0531h0.C0532a m272b() {
        return f170a;
    }

    /* renamed from: a */
    public void mo8519a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
