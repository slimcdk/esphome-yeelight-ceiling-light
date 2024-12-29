package p075o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import p031f.C3150a;
import p035g.C3187h;
import p035g.C3188i;
import p035g.C3198o;
import p043i.C3246a;
import p047j.C3252a;
import p047j.C3254b;
import p047j.C3256c;
import p047j.C3258d;
import p047j.C3260e;
import p052k.C3285a;
import p079p.C3590a;
import p083q.C3604a;
import p087r.C3621a;

@Singleton
@WorkerThread
/* renamed from: o.m0 */
public class C3400m0 implements C3388d, C3590a, C3387c {

    /* renamed from: f */
    private static final C3150a f5519f = C3150a.m8421b("proto");

    /* renamed from: a */
    private final C3406t0 f5520a;

    /* renamed from: b */
    private final C3604a f5521b;

    /* renamed from: c */
    private final C3604a f5522c;

    /* renamed from: d */
    private final C3389e f5523d;

    /* renamed from: e */
    private final C3246a<String> f5524e;

    /* renamed from: o.m0$b */
    interface C3402b<T, U> {
        U apply(T t);
    }

    /* renamed from: o.m0$c */
    private static class C3403c {

        /* renamed from: a */
        final String f5525a;

        /* renamed from: b */
        final String f5526b;

        private C3403c(String str, String str2) {
            this.f5525a = str;
            this.f5526b = str2;
        }
    }

    /* renamed from: o.m0$d */
    interface C3404d<T> {
        /* renamed from: a */
        T mo24200a();
    }

    @Inject
    C3400m0(@WallTime C3604a aVar, @Monotonic C3604a aVar2, C3389e eVar, C3406t0 t0Var, @Named("PACKAGE_NAME") C3246a<String> aVar3) {
        this.f5520a = t0Var;
        this.f5521b = aVar;
        this.f5522c = aVar2;
        this.f5523d = eVar;
        this.f5524e = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public static /* synthetic */ Object m9297D0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public static /* synthetic */ SQLiteDatabase m9299E0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public static /* synthetic */ Long m9302H0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public static /* synthetic */ C3260e m9306L0(long j, SQLiteDatabase sQLiteDatabase) {
        return (C3260e) m9359y1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C9754l(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public static /* synthetic */ Long m9307M0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ Boolean m9309N0(C3198o oVar, SQLiteDatabase sQLiteDatabase) {
        Long u0 = m9350u0(sQLiteDatabase, oVar);
        if (u0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m9359y1(mo24197j0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{u0.toString()}), C9773y.f17626a);
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public static /* synthetic */ List m9311S0(SQLiteDatabase sQLiteDatabase) {
        return (List) m9359y1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C9768t.f17621a);
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ List m9313U0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C3198o.m8609a().mo23737b(cursor.getString(1)).mo23739d(C3621a.m10302b(cursor.getInt(2))).mo23738c(m9348s1(cursor.getString(3))).mo23736a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ List m9315V0(C3198o oVar, SQLiteDatabase sQLiteDatabase) {
        List<C3399k> q1 = m9344q1(sQLiteDatabase, oVar);
        return m9356x0(q1, m9346r1(sQLiteDatabase, q1));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ C3252a m9317Z0(Map map, C3252a.C3253a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason d0 = m9320d0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.m538c().mo11249c(d0).mo11248b(j).mo11247a());
        }
        m9349t1(aVar, map);
        aVar.mo23805e(m9345r0());
        aVar.mo23804d(m9330k0());
        aVar.mo23803c(this.f5524e.get());
        return aVar.mo23802b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ C3252a m9318b1(String str, Map map, C3252a.C3253a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C3252a) m9359y1(sQLiteDatabase.rawQuery(str, new String[0]), new C9764r(this, map, aVar));
    }

    /* renamed from: d0 */
    private LogEventDropped.Reason m9320d0(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.getNumber()) {
            return reason7;
        }
        C3285a.m8854b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    /* renamed from: f0 */
    private void m9321f0(SQLiteDatabase sQLiteDatabase) {
        m9353v1(new C9745c0(sQLiteDatabase), C9744b0.f17580a);
    }

    /* renamed from: g0 */
    private long m9322g0(SQLiteDatabase sQLiteDatabase, C3198o oVar) {
        Long u0 = m9350u0(sQLiteDatabase, oVar);
        if (u0 != null) {
            return u0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.mo23731b());
        contentValues.put("priority", Integer.valueOf(C3621a.m10301a(oVar.mo23733d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.mo23732c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.mo23732c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ Object m9323g1(List list, C3198o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C3188i.C3189a k = C3188i.m8566a().mo23715j(cursor.getString(1)).mo23714i(cursor.getLong(2)).mo23716k(cursor.getLong(3));
            k.mo23713h(z ? new C3187h(m9355w1(cursor.getString(4)), cursor.getBlob(5)) : new C3187h(m9355w1(cursor.getString(4)), m9351u1(j)));
            if (!cursor.isNull(6)) {
                k.mo23712g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C3399k.m9289a(j, oVar, k.mo23709d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public static /* synthetic */ Object m9325h1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C3403c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ Long m9327i1(C3188i iVar, C3198o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m9354w0()) {
            mo24180f(1, LogEventDropped.Reason.CACHE_FULL, iVar.mo23706j());
            return -1L;
        }
        long g0 = m9322g0(sQLiteDatabase, oVar);
        int e = this.f5523d.mo24161e();
        byte[] a = iVar.mo23702e().mo23745a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(g0));
        contentValues.put("transport_name", iVar.mo23706j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.mo23704f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.mo23707k()));
        contentValues.put("payload_encoding", iVar.mo23702e().mo23746b().mo23639a());
        contentValues.put("code", iVar.mo23701d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            double length = (double) a.length;
            double d = (double) e;
            Double.isNaN(length);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(length / d);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.mo23753i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ byte[] m9328j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: k0 */
    private C3254b m9330k0() {
        return C3254b.m8726b().mo23808b(C3258d.m8736c().mo23817b(mo24196h0()).mo23818c(C3389e.f5514a.mo24163f()).mo23816a()).mo23807a();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ Object m9331k1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo24180f((long) i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ Object m9333l1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m9359y1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C9751i0(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static /* synthetic */ Boolean m9335m1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static /* synthetic */ Object m9337n1(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m9359y1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), C9772x.f17625a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        }
        return null;
    }

    /* renamed from: o0 */
    private long m9338o0() {
        return mo24197j0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static /* synthetic */ Object m9339o1(long j, C3198o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.mo23731b(), String.valueOf(C3621a.m10301a(oVar.mo23733d()))}) < 1) {
            contentValues.put("backend_name", oVar.mo23731b());
            contentValues.put("priority", Integer.valueOf(C3621a.m10301a(oVar.mo23733d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: p0 */
    private long m9341p0() {
        return mo24197j0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ Object m9342p1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f5521b.mo25913a()).execute();
        return null;
    }

    /* renamed from: q1 */
    private List<C3399k> m9344q1(SQLiteDatabase sQLiteDatabase, C3198o oVar) {
        ArrayList arrayList = new ArrayList();
        Long u0 = m9350u0(sQLiteDatabase, oVar);
        if (u0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m9359y1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{u0.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f5523d.mo24160d())), new C9762q(this, arrayList, oVar));
        return arrayList;
    }

    /* renamed from: r0 */
    private C3260e m9345r0() {
        return (C3260e) mo24198v0(new C9771w(this.f5521b.mo25913a()));
    }

    /* renamed from: r1 */
    private Map<Long, Set<C3403c>> m9346r1(SQLiteDatabase sQLiteDatabase, List<C3399k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo24173c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m9359y1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C9749g0(hashMap));
        return hashMap;
    }

    /* renamed from: s1 */
    private static byte[] m9348s1(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: t1 */
    private void m9349t1(C3252a.C3253a aVar, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo23801a(C3256c.m8730c().mo23813c((String) next.getKey()).mo23812b((List) next.getValue()).mo23811a());
        }
    }

    @Nullable
    /* renamed from: u0 */
    private Long m9350u0(SQLiteDatabase sQLiteDatabase, C3198o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.mo23731b(), String.valueOf(C3621a.m10301a(oVar.mo23733d()))}));
        if (oVar.mo23732c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.mo23732c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m9359y1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C9770v.f17623a);
    }

    /* renamed from: u1 */
    private byte[] m9351u1(long j) {
        return (byte[]) m9359y1(mo24197j0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C9766s.f17619a);
    }

    /* renamed from: v1 */
    private <T> T m9353v1(C3404d<T> dVar, C3402b<Throwable, T> bVar) {
        long a = this.f5522c.mo25913a();
        while (true) {
            try {
                return dVar.mo24200a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f5522c.mo25913a() >= ((long) this.f5523d.mo24158b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: w0 */
    private boolean m9354w0() {
        return m9338o0() * m9341p0() >= this.f5523d.mo24163f();
    }

    /* renamed from: w1 */
    private static C3150a m9355w1(@Nullable String str) {
        return str == null ? f5519f : C3150a.m8421b(str);
    }

    /* renamed from: x0 */
    private List<C3399k> m9356x0(List<C3399k> list, Map<Long, Set<C3403c>> map) {
        ListIterator<C3399k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C3399k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo24173c()))) {
                C3188i.C3189a l = next.mo24172b().mo23754l();
                for (C3403c cVar : map.get(Long.valueOf(next.mo24173c()))) {
                    l.mo23757c(cVar.f5525a, cVar.f5526b);
                }
                listIterator.set(C3399k.m9289a(next.mo24173c(), next.mo24174d(), l.mo23709d()));
            }
        }
        return list;
    }

    /* renamed from: x1 */
    private static String m9357x1(Iterable<C3399k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C3399k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo24173c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ Object m9358y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo24180f((long) i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: y1 */
    static <T> T m9359y1(Cursor cursor, C3402b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ Integer m9361z0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m9359y1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C9750h0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Nullable
    /* renamed from: F0 */
    public C3399k mo24181F0(C3198o oVar, C3188i iVar) {
        C3285a.m8855c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.mo23733d(), iVar.mo23706j(), oVar.mo23731b());
        long longValue = ((Long) mo24198v0(new C9755l0(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C3399k.m9289a(longValue, oVar, iVar);
    }

    /* renamed from: U */
    public Iterable<C3198o> mo24182U() {
        return (Iterable) mo24198v0(C9774z.f17627a);
    }

    /* renamed from: W0 */
    public void mo24183W0(Iterable<C3399k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo24198v0(new C9758o(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m9357x1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: a */
    public <T> T mo24194a(C3590a.C3591a<T> aVar) {
        SQLiteDatabase j0 = mo24197j0();
        m9321f0(j0);
        try {
            T J = aVar.mo25865J();
            j0.setTransactionSuccessful();
            return J;
        } finally {
            j0.endTransaction();
        }
    }

    /* renamed from: b0 */
    public long mo24184b0(C3198o oVar) {
        return ((Long) m9359y1(mo24197j0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.mo23731b(), String.valueOf(C3621a.m10301a(oVar.mo23733d()))}), C9769u.f17622a)).longValue();
    }

    /* renamed from: c */
    public void mo24178c() {
        mo24198v0(new C9752j0(this));
    }

    public void close() {
        this.f5520a.close();
    }

    /* renamed from: d */
    public C3252a mo24179d() {
        return (C3252a) mo24198v0(new C9760p(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C3252a.m8715e()));
    }

    /* renamed from: f */
    public void mo24180f(long j, LogEventDropped.Reason reason, String str) {
        mo24198v0(new C9748f0(str, reason, j));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h0 */
    public long mo24196h0() {
        return m9338o0() * m9341p0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: j0 */
    public SQLiteDatabase mo24197j0() {
        C3406t0 t0Var = this.f5520a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m9353v1(new C9746d0(t0Var), C9743a0.f17579a);
    }

    /* renamed from: l0 */
    public Iterable<C3399k> mo24185l0(C3198o oVar) {
        return (Iterable) mo24198v0(new C9756m(this, oVar));
    }

    /* renamed from: n0 */
    public void mo24186n0(C3198o oVar, long j) {
        mo24198v0(new C9747e0(j, oVar));
    }

    /* renamed from: r */
    public int mo24187r() {
        return ((Integer) mo24198v0(new C9753k0(this, this.f5521b.mo25913a() - this.f5523d.mo24159c()))).intValue();
    }

    /* renamed from: t */
    public boolean mo24188t(C3198o oVar) {
        return ((Boolean) mo24198v0(new C9757n(this, oVar))).booleanValue();
    }

    /* renamed from: u */
    public void mo24189u(Iterable<C3399k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo24197j0().compileStatement("DELETE FROM events WHERE _id in " + m9357x1(iterable)).execute();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: v0 */
    public <T> T mo24198v0(C3402b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase j0 = mo24197j0();
        j0.beginTransaction();
        try {
            T apply = bVar.apply(j0);
            j0.setTransactionSuccessful();
            return apply;
        } finally {
            j0.endTransaction();
        }
    }
}
