package p011c.p091e.p092a.p093a.p099e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1252e;
import p011c.p091e.p092a.p093a.p100f.C1253f;

/* renamed from: c.e.a.a.e.b */
class C1243b implements SharedPreferences {

    /* renamed from: a */
    private final ContentResolver f2199a;

    /* renamed from: b */
    private final String[] f2200b = {"_id", BaseService.KEY, "type", "value"};

    /* renamed from: c */
    private final HashMap<String, Object> f2201c = new HashMap<>();

    /* renamed from: d */
    private C1244a f2202d = null;

    /* renamed from: c.e.a.a.e.b$a */
    private static class C1244a implements SharedPreferences.Editor {

        /* renamed from: a */
        private Map<String, Object> f2203a = new HashMap();

        /* renamed from: b */
        private Set<String> f2204b = new HashSet();

        /* renamed from: c */
        private boolean f2205c = false;

        /* renamed from: d */
        private ContentResolver f2206d;

        public C1244a(ContentResolver contentResolver) {
            this.f2206d = contentResolver;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.f2205c = true;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x003f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean commit() {
            /*
                r10 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r10.f2205c
                r2 = 0
                if (r1 == 0) goto L_0x0014
                android.content.ContentResolver r1 = r10.f2206d
                android.net.Uri r3 = p011c.p091e.p092a.p093a.p100f.C1253f.f2213a
                r4 = 0
                r1.delete(r3, r4, r4)
                r10.f2205c = r2
            L_0x0014:
                java.util.Set<java.lang.String> r1 = r10.f2204b
                java.util.Iterator r1 = r1.iterator()
            L_0x001a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                r5 = 1
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r6 = r10.f2206d
                android.net.Uri r7 = p011c.p091e.p092a.p093a.p100f.C1253f.f2213a
                java.lang.String[] r5 = new java.lang.String[r5]
                r5[r2] = r3
                r6.delete(r7, r4, r5)
                goto L_0x001a
            L_0x0035:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f2203a
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x003f:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x00c1
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L_0x005a
                java.lang.String r8 = "unresolve failed, null value"
            L_0x0055:
                p011c.p091e.p092a.p093a.p100f.C1249b.m3235b(r7, r8)
                r7 = 0
                goto L_0x0095
            L_0x005a:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L_0x0060
                r7 = 1
                goto L_0x0095
            L_0x0060:
                boolean r8 = r6 instanceof java.lang.Long
                if (r8 == 0) goto L_0x0066
                r7 = 2
                goto L_0x0095
            L_0x0066:
                boolean r8 = r6 instanceof java.lang.String
                if (r8 == 0) goto L_0x006c
                r7 = 3
                goto L_0x0095
            L_0x006c:
                boolean r8 = r6 instanceof java.lang.Boolean
                if (r8 == 0) goto L_0x0072
                r7 = 4
                goto L_0x0095
            L_0x0072:
                boolean r8 = r6 instanceof java.lang.Float
                if (r8 == 0) goto L_0x0078
                r7 = 5
                goto L_0x0095
            L_0x0078:
                boolean r8 = r6 instanceof java.lang.Double
                if (r8 == 0) goto L_0x007e
                r7 = 6
                goto L_0x0095
            L_0x007e:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "unresolve failed, unknown type="
                r8.<init>(r9)
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.toString()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                goto L_0x0055
            L_0x0095:
                if (r7 != 0) goto L_0x0099
                r6 = 0
                goto L_0x00ac
            L_0x0099:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r8 = "type"
                r0.put(r8, r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "value"
                r0.put(r7, r6)
                r6 = 1
            L_0x00ac:
                if (r6 == 0) goto L_0x003f
                android.content.ContentResolver r6 = r10.f2206d
                android.net.Uri r7 = p011c.p091e.p092a.p093a.p100f.C1253f.f2213a
                java.lang.String[] r8 = new java.lang.String[r5]
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r8[r2] = r3
                r6.update(r7, r0, r4, r8)
                goto L_0x003f
            L_0x00c1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p091e.p092a.p093a.p099e.C1243b.C1244a.commit():boolean");
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f2203a.put(str, Boolean.valueOf(z));
            this.f2204b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f2203a.put(str, Float.valueOf(f));
            this.f2204b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.f2203a.put(str, Integer.valueOf(i));
            this.f2204b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.f2203a.put(str, Long.valueOf(j));
            this.f2204b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.f2203a.put(str, str2);
            this.f2204b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        public SharedPreferences.Editor remove(String str) {
            this.f2204b.add(str);
            return this;
        }
    }

    public C1243b(Context context) {
        this.f2199a = context.getContentResolver();
    }

    /* renamed from: a */
    private Object m3205a(String str) {
        try {
            Cursor query = this.f2199a.query(C1253f.f2213a, this.f2200b, "key = ?", new String[]{str}, (String) null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? C1252e.m3239a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            C1249b.m3235b("MicroMsg.SDK.SharedPreferences", "getValue exception:" + e.getMessage());
            return null;
        }
    }

    public boolean contains(String str) {
        return m3205a(str) != null;
    }

    public SharedPreferences.Editor edit() {
        if (this.f2202d == null) {
            this.f2202d = new C1244a(this.f2199a);
        }
        return this.f2202d;
    }

    public Map<String, ?> getAll() {
        try {
            Cursor query = this.f2199a.query(C1253f.f2213a, this.f2200b, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex(BaseService.KEY);
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.f2201c.put(query.getString(columnIndex), C1252e.m3239a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.f2201c;
        } catch (Exception e) {
            C1249b.m3235b("MicroMsg.SDK.SharedPreferences", "getAll exception:" + e.getMessage());
            return this.f2201c;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        Object a = m3205a(str);
        return (a == null || !(a instanceof Boolean)) ? z : ((Boolean) a).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object a = m3205a(str);
        return (a == null || !(a instanceof Float)) ? f : ((Float) a).floatValue();
    }

    public int getInt(String str, int i) {
        Object a = m3205a(str);
        return (a == null || !(a instanceof Integer)) ? i : ((Integer) a).intValue();
    }

    public long getLong(String str, long j) {
        Object a = m3205a(str);
        return (a == null || !(a instanceof Long)) ? j : ((Long) a).longValue();
    }

    public String getString(String str, String str2) {
        Object a = m3205a(str);
        return (a == null || !(a instanceof String)) ? str2 : (String) a;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
