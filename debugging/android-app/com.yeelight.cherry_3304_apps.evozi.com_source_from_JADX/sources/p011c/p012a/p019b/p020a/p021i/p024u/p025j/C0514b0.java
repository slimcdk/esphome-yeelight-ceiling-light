package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.time.C1354a;
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
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.p021i.C0480g;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p022s.C0496a;
import p011c.p012a.p019b.p020a.p021i.p026v.C0552a;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;
import p011c.p012a.p019b.p020a.p021i.p027w.C0555a;

@Singleton
@WorkerThread
/* renamed from: c.a.b.a.i.u.j.b0 */
public class C0514b0 implements C0519c, C0553b {

    /* renamed from: e */
    private static final C0459b f155e = C0459b.m41b("proto");

    /* renamed from: a */
    private final C0531h0 f156a;

    /* renamed from: b */
    private final C1354a f157b;

    /* renamed from: c */
    private final C1354a f158c;

    /* renamed from: d */
    private final C0521d f159d;

    /* renamed from: c.a.b.a.i.u.j.b0$b */
    interface C0516b<T, U> {
        U apply(T t);
    }

    /* renamed from: c.a.b.a.i.u.j.b0$c */
    private static class C0517c {

        /* renamed from: a */
        final String f160a;

        /* renamed from: b */
        final String f161b;

        private C0517c(String str, String str2) {
            this.f160a = str;
            this.f161b = str2;
        }
    }

    /* renamed from: c.a.b.a.i.u.j.b0$d */
    interface C0518d<T> {
        /* renamed from: a */
        T mo8517a();
    }

    @Inject
    C0514b0(@WallTime C1354a aVar, @Monotonic C1354a aVar2, C0521d dVar, C0531h0 h0Var) {
        this.f156a = h0Var;
        this.f157b = aVar;
        this.f158c = aVar2;
        this.f159d = dVar;
    }

    /* renamed from: D */
    static /* synthetic */ Object m196D(Throwable th) {
        throw new C0552a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: F */
    static /* synthetic */ SQLiteDatabase m197F(Throwable th) {
        throw new C0552a("Timed out while trying to open db.", th);
    }

    /* renamed from: I */
    static /* synthetic */ Long m198I(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: J */
    static /* synthetic */ Long m199J(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: K */
    static /* synthetic */ Boolean m200K(C0514b0 b0Var, C0487l lVar, SQLiteDatabase sQLiteDatabase) {
        Long n = b0Var.m222n(sQLiteDatabase, lVar);
        if (n == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m221j0(b0Var.mo8511h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n.toString()}), C0546u.m308a());
    }

    /* renamed from: L */
    static /* synthetic */ List m201L(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C0487l.C0488a a = C0487l.m131a();
            a.mo8442b(cursor.getString(1));
            a.mo8444d(C0555a.m317b(cursor.getInt(2)));
            a.mo8443c(m213b0(cursor.getString(3)));
            arrayList.add(a.mo8441a());
        }
        return arrayList;
    }

    /* renamed from: M */
    static /* synthetic */ List m202M(SQLiteDatabase sQLiteDatabase) {
        return (List) m221j0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C0545t.m307a());
    }

    /* renamed from: Q */
    static /* synthetic */ List m203Q(C0514b0 b0Var, C0487l lVar, SQLiteDatabase sQLiteDatabase) {
        List<C0533i> Z = b0Var.m210Z(sQLiteDatabase, lVar);
        b0Var.m225t(Z, b0Var.m211a0(sQLiteDatabase, Z));
        return Z;
    }

    /* renamed from: R */
    static /* synthetic */ Object m204R(C0514b0 b0Var, List list, C0487l lVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C0481h.C0482a a = C0481h.m91a();
            a.mo8420j(cursor.getString(1));
            a.mo8419i(cursor.getLong(2));
            a.mo8421k(cursor.getLong(3));
            a.mo8418h(z ? new C0480g(m216e0(cursor.getString(4)), cursor.getBlob(5)) : new C0480g(m216e0(cursor.getString(4)), b0Var.m214c0(j)));
            if (!cursor.isNull(6)) {
                a.mo8417g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C0533i.m289a(j, lVar, a.mo8414d()));
        }
        return null;
    }

    /* renamed from: S */
    static /* synthetic */ Object m205S(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C0517c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: T */
    static /* synthetic */ Long m206T(C0514b0 b0Var, C0487l lVar, C0481h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.m224s()) {
            return -1L;
        }
        long g = b0Var.m218g(sQLiteDatabase, lVar);
        int e = b0Var.f159d.mo8487e();
        byte[] a = hVar.mo8407e().mo8453a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(g));
        contentValues.put("transport_name", hVar.mo8411j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo8409f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo8412k()));
        contentValues.put("payload_encoding", hVar.mo8407e().mo8454b().mo8397a());
        contentValues.put("code", hVar.mo8406d());
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
        for (Map.Entry next : hVar.mo8461i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: V */
    static /* synthetic */ byte[] m207V(Cursor cursor) {
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

    /* renamed from: W */
    static /* synthetic */ Object m208W(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* renamed from: X */
    static /* synthetic */ Object m209X(long j, C0487l lVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{lVar.mo8436b(), String.valueOf(C0555a.m316a(lVar.mo8438d()))}) < 1) {
            contentValues.put("backend_name", lVar.mo8436b());
            contentValues.put("priority", Integer.valueOf(C0555a.m316a(lVar.mo8438d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: Z */
    private List<C0533i> m210Z(SQLiteDatabase sQLiteDatabase, C0487l lVar) {
        ArrayList arrayList = new ArrayList();
        Long n = m222n(sQLiteDatabase, lVar);
        if (n == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m221j0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{n.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f159d.mo8486d())), C0539n.m299a(this, arrayList, lVar));
        return arrayList;
    }

    /* renamed from: a0 */
    private Map<Long, Set<C0517c>> m211a0(SQLiteDatabase sQLiteDatabase, List<C0533i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo8500c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m221j0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), C0541p.m301a(hashMap));
        return hashMap;
    }

    /* renamed from: b */
    private void m212b(SQLiteDatabase sQLiteDatabase) {
        m215d0(C0542q.m302b(sQLiteDatabase), C0543r.m304a());
    }

    /* renamed from: b0 */
    private static byte[] m213b0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: c0 */
    private byte[] m214c0(long j) {
        return (byte[]) m221j0(mo8511h().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C0540o.m300a());
    }

    /* renamed from: d0 */
    private <T> T m215d0(C0518d<T> dVar, C0516b<Throwable, T> bVar) {
        long a = this.f158c.mo10267a();
        while (true) {
            try {
                return dVar.mo8517a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f158c.mo10267a() >= ((long) this.f159d.mo8484b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: e0 */
    private static C0459b m216e0(@Nullable String str) {
        return str == null ? f155e : C0459b.m41b(str);
    }

    /* renamed from: f0 */
    private static String m217f0(Iterable<C0533i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C0533i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo8500c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: g */
    private long m218g(SQLiteDatabase sQLiteDatabase, C0487l lVar) {
        Long n = m222n(sQLiteDatabase, lVar);
        if (n != null) {
            return n.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", lVar.mo8436b());
        contentValues.put("priority", Integer.valueOf(C0555a.m316a(lVar.mo8438d())));
        contentValues.put("next_request_ms", 0);
        if (lVar.mo8437c() != null) {
            contentValues.put("extras", Base64.encodeToString(lVar.mo8437c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: i */
    private long m219i() {
        return mo8511h().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: j */
    private long m220j() {
        return mo8511h().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: j0 */
    private static <T> T m221j0(Cursor cursor, C0516b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Nullable
    /* renamed from: n */
    private Long m222n(SQLiteDatabase sQLiteDatabase, C0487l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{lVar.mo8436b(), String.valueOf(C0555a.m316a(lVar.mo8438d()))}));
        if (lVar.mo8437c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.mo8437c(), 0));
        }
        return (Long) m221j0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C0549x.m311a());
    }

    /* renamed from: o */
    private <T> T m223o(C0516b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase h = mo8511h();
        h.beginTransaction();
        try {
            T apply = bVar.apply(h);
            h.setTransactionSuccessful();
            return apply;
        } finally {
            h.endTransaction();
        }
    }

    /* renamed from: s */
    private boolean m224s() {
        return m219i() * m220j() >= this.f159d.mo8489f();
    }

    /* renamed from: t */
    private List<C0533i> m225t(List<C0533i> list, Map<Long, Set<C0517c>> map) {
        ListIterator<C0533i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C0533i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo8500c()))) {
                C0481h.C0482a l = next.mo8499b().mo8462l();
                for (C0517c cVar : map.get(Long.valueOf(next.mo8500c()))) {
                    l.mo8465c(cVar.f160a, cVar.f161b);
                }
                listIterator.set(C0533i.m289a(next.mo8500c(), next.mo8501d(), l.mo8414d()));
            }
        }
        return list;
    }

    @Nullable
    /* renamed from: K0 */
    public C0533i mo8505K0(C0487l lVar, C0481h hVar) {
        C0496a.m156b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.mo8438d(), hVar.mo8411j(), lVar.mo8436b());
        long longValue = ((Long) m223o(C0548w.m310a(this, lVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C0533i.m289a(longValue, lVar, hVar);
    }

    /* renamed from: O0 */
    public long mo8506O0(C0487l lVar) {
        return ((Long) m221j0(mo8511h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.mo8436b(), String.valueOf(C0555a.m316a(lVar.mo8438d()))}), C0551z.m313a())).longValue();
    }

    /* renamed from: T0 */
    public boolean mo8507T0(C0487l lVar) {
        return ((Boolean) m223o(C0512a0.m191a(this, lVar))).booleanValue();
    }

    /* renamed from: U0 */
    public void mo8508U0(Iterable<C0533i> iterable) {
        if (iterable.iterator().hasNext()) {
            m223o(C0550y.m312a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m217f0(iterable)));
        }
    }

    /* renamed from: a */
    public <T> T mo8509a(C0553b.C0554a<T> aVar) {
        SQLiteDatabase h = mo8511h();
        m212b(h);
        try {
            T J = aVar.mo8479J();
            h.setTransactionSuccessful();
            return J;
        } finally {
            h.endTransaction();
        }
    }

    public void close() {
        this.f156a.close();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h */
    public SQLiteDatabase mo8511h() {
        C0531h0 h0Var = this.f156a;
        h0Var.getClass();
        return (SQLiteDatabase) m215d0(C0544s.m305b(h0Var), C0547v.m309a());
    }

    /* renamed from: l */
    public int mo8512l() {
        return ((Integer) m223o(C0538m.m298a(this.f157b.mo10267a() - this.f159d.mo8485c()))).intValue();
    }

    /* renamed from: m */
    public void mo8513m(Iterable<C0533i> iterable) {
        if (iterable.iterator().hasNext()) {
            mo8511h().compileStatement("DELETE FROM events WHERE _id in " + m217f0(iterable)).execute();
        }
    }

    /* renamed from: r */
    public Iterable<C0533i> mo8514r(C0487l lVar) {
        return (Iterable) m223o(C0536k.m296a(this, lVar));
    }

    /* renamed from: w */
    public void mo8515w(C0487l lVar, long j) {
        m223o(C0535j.m295a(j, lVar));
    }

    /* renamed from: z */
    public Iterable<C0487l> mo8516z() {
        return (Iterable) m223o(C0537l.m297a());
    }
}
