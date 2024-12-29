package p178k3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p181l3.C9523b;
import p181l3.C9526e;
import p181l3.C9527f;

/* renamed from: k3.b */
class C9290b implements SharedPreferences {

    /* renamed from: a */
    private final ContentResolver f17204a;

    /* renamed from: b */
    private final String[] f17205b = {"_id", "key", "type", "value"};

    /* renamed from: c */
    private final HashMap<String, Object> f17206c = new HashMap<>();

    /* renamed from: d */
    private C9291a f17207d = null;

    /* renamed from: k3.b$a */
    private static class C9291a implements SharedPreferences.Editor {

        /* renamed from: a */
        private Map<String, Object> f17208a = new HashMap();

        /* renamed from: b */
        private Set<String> f17209b = new HashSet();

        /* renamed from: c */
        private boolean f17210c = false;

        /* renamed from: d */
        private ContentResolver f17211d;

        public C9291a(ContentResolver contentResolver) {
            this.f17211d = contentResolver;
        }

        public void apply() {
        }

        public SharedPreferences.Editor clear() {
            this.f17210c = true;
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
                boolean r1 = r10.f17210c
                r2 = 0
                if (r1 == 0) goto L_0x0014
                android.content.ContentResolver r1 = r10.f17211d
                android.net.Uri r3 = p181l3.C9527f.f17362a
                r4 = 0
                r1.delete(r3, r4, r4)
                r10.f17210c = r2
            L_0x0014:
                java.util.Set<java.lang.String> r1 = r10.f17209b
                java.util.Iterator r1 = r1.iterator()
            L_0x001a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                r5 = 1
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r6 = r10.f17211d
                android.net.Uri r7 = p181l3.C9527f.f17362a
                java.lang.String[] r5 = new java.lang.String[r5]
                r5[r2] = r3
                r6.delete(r7, r4, r5)
                goto L_0x001a
            L_0x0035:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f17208a
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
                p181l3.C9523b.m23172b(r7, r8)
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
                android.content.ContentResolver r6 = r10.f17211d
                android.net.Uri r7 = p181l3.C9527f.f17362a
                java.lang.String[] r8 = new java.lang.String[r5]
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r8[r2] = r3
                r6.update(r7, r0, r4, r8)
                goto L_0x003f
            L_0x00c1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p178k3.C9290b.C9291a.commit():boolean");
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f17208a.put(str, Boolean.valueOf(z));
            this.f17209b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f17208a.put(str, Float.valueOf(f));
            this.f17209b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.f17208a.put(str, Integer.valueOf(i));
            this.f17209b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.f17208a.put(str, Long.valueOf(j));
            this.f17209b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.f17208a.put(str, str2);
            this.f17209b.remove(str);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        public SharedPreferences.Editor remove(String str) {
            this.f17209b.add(str);
            return this;
        }
    }

    public C9290b(Context context) {
        this.f17204a = context.getContentResolver();
    }

    /* renamed from: a */
    private Object m22735a(String str) {
        try {
            Cursor query = this.f17204a.query(C9527f.f17362a, this.f17205b, "key = ?", new String[]{str}, (String) null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? C9526e.m23176a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            C9523b.m23172b("MicroMsg.SDK.SharedPreferences", "getValue exception:" + e.getMessage());
            return null;
        }
    }

    public boolean contains(String str) {
        return m22735a(str) != null;
    }

    public SharedPreferences.Editor edit() {
        if (this.f17207d == null) {
            this.f17207d = new C9291a(this.f17204a);
        }
        return this.f17207d;
    }

    public Map<String, ?> getAll() {
        try {
            Cursor query = this.f17204a.query(C9527f.f17362a, this.f17205b, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.f17206c.put(query.getString(columnIndex), C9526e.m23176a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.f17206c;
        } catch (Exception e) {
            C9523b.m23172b("MicroMsg.SDK.SharedPreferences", "getAll exception:" + e.getMessage());
            return this.f17206c;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        Object a = m22735a(str);
        return (a == null || !(a instanceof Boolean)) ? z : ((Boolean) a).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object a = m22735a(str);
        return (a == null || !(a instanceof Float)) ? f : ((Float) a).floatValue();
    }

    public int getInt(String str, int i) {
        Object a = m22735a(str);
        return (a == null || !(a instanceof Integer)) ? i : ((Integer) a).intValue();
    }

    public long getLong(String str, long j) {
        Object a = m22735a(str);
        return (a == null || !(a instanceof Long)) ? j : ((Long) a).longValue();
    }

    public String getString(String str, String str2) {
        Object a = m22735a(str);
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
