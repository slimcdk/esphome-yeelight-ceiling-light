package p075o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: o.t0 */
final class C3406t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f5532c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: d */
    static int f5533d = 5;

    /* renamed from: e */
    private static final C3407a f5534e;

    /* renamed from: f */
    private static final C3407a f5535f;

    /* renamed from: g */
    private static final C3407a f5536g;

    /* renamed from: h */
    private static final C3407a f5537h;

    /* renamed from: i */
    private static final C3407a f5538i;

    /* renamed from: j */
    private static final List<C3407a> f5539j;

    /* renamed from: a */
    private final int f5540a;

    /* renamed from: b */
    private boolean f5541b = false;

    /* renamed from: o.t0$a */
    public interface C3407a {
        /* renamed from: a */
        void mo24207a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C9765r0 r0Var = C9765r0.f17618a;
        f5534e = r0Var;
        C9759o0 o0Var = C9759o0.f17605a;
        f5535f = o0Var;
        C9761p0 p0Var = C9761p0.f17610a;
        f5536g = p0Var;
        C9763q0 q0Var = C9763q0.f17614a;
        f5537h = q0Var;
        C9767s0 s0Var = C9767s0.f17620a;
        f5538i = s0Var;
        f5539j = Arrays.asList(new C3407a[]{r0Var, o0Var, p0Var, q0Var, s0Var});
    }

    @Inject
    C3406t0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f5540a = i;
    }

    /* renamed from: i */
    private void m9387i(SQLiteDatabase sQLiteDatabase) {
        if (!this.f5541b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m9388k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m9389l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m9391n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m9392p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f5532c);
    }

    /* renamed from: q */
    private void m9393q(SQLiteDatabase sQLiteDatabase, int i) {
        m9387i(sQLiteDatabase);
        m9394s(sQLiteDatabase, 0, i);
    }

    /* renamed from: s */
    private void m9394s(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C3407a> list = f5539j;
        if (i2 <= list.size()) {
            while (i < i2) {
                f5539j.get(i).mo24207a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f5541b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m9393q(sQLiteDatabase, this.f5540a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m9393q(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m9387i(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m9387i(sQLiteDatabase);
        m9394s(sQLiteDatabase, i, i2);
    }
}
