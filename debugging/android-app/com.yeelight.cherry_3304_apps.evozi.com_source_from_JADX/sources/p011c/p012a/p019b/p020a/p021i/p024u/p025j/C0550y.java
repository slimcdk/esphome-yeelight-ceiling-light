package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.y */
final /* synthetic */ class C0550y implements C0514b0.C0516b {

    /* renamed from: a */
    private final String f206a;

    private C0550y(String str) {
        this.f206a = str;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m312a(String str) {
        return new C0550y(str);
    }

    public Object apply(Object obj) {
        return C0514b0.m208W(this.f206a, (SQLiteDatabase) obj);
    }
}
