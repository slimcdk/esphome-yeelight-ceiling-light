package p075o;

import android.database.sqlite.SQLiteDatabase;
import p075o.C3406t0;

/* renamed from: o.p0 */
public final /* synthetic */ class C9761p0 implements C3406t0.C3407a {

    /* renamed from: a */
    public static final /* synthetic */ C9761p0 f17610a = new C9761p0();

    private /* synthetic */ C9761p0() {
    }

    /* renamed from: a */
    public final void mo24207a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
