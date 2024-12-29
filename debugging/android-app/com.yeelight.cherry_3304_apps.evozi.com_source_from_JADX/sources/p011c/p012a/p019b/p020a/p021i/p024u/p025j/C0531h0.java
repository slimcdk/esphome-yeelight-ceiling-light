package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: c.a.b.a.i.u.j.h0 */
final class C0531h0 extends SQLiteOpenHelper {

    /* renamed from: c */
    static int f174c = 4;

    /* renamed from: d */
    private static final C0532a f175d = C0523d0.m262b();

    /* renamed from: e */
    private static final C0532a f176e = C0525e0.m267b();

    /* renamed from: f */
    private static final C0532a f177f = C0527f0.m272b();

    /* renamed from: g */
    private static final C0532a f178g;

    /* renamed from: h */
    private static final List<C0532a> f179h;

    /* renamed from: a */
    private final int f180a;

    /* renamed from: b */
    private boolean f181b = false;

    /* renamed from: c.a.b.a.i.u.j.h0$a */
    public interface C0532a {
        /* renamed from: a */
        void mo8519a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C0532a b = C0529g0.m277b();
        f178g = b;
        f179h = Arrays.asList(new C0532a[]{f175d, f176e, f177f, b});
    }

    @Inject
    C0531h0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f180a = i;
    }

    /* renamed from: a */
    private void m282a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f181b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m283b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: g */
    static /* synthetic */ void m284g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: i */
    static /* synthetic */ void m286i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: j */
    private void m287j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f179h.size()) {
            while (i < i2) {
                f179h.get(i).mo8519a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + f179h.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f181b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m282a(sQLiteDatabase);
        m287j(sQLiteDatabase, 0, this.f180a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m282a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m282a(sQLiteDatabase);
        m287j(sQLiteDatabase, i, i2);
    }
}
