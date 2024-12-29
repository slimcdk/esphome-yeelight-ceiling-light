package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.sqlite.SQLiteDatabase;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.m */
final /* synthetic */ class C0538m implements C0514b0.C0516b {

    /* renamed from: a */
    private final long f190a;

    private C0538m(long j) {
        this.f190a = j;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m298a(long j) {
        return new C0538m(j);
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f190a)}));
    }
}
