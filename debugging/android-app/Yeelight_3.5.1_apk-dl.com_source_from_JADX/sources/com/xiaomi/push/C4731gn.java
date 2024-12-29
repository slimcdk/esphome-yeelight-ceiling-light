package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.xiaomi.push.gn */
public abstract class C4731gn {

    /* renamed from: a */
    private static long f8301a = 0;

    /* renamed from: a */
    protected static final String f8302a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: a */
    public static final DateFormat f8303a;

    /* renamed from: b */
    private static String f8304b = null;

    /* renamed from: c */
    private static String f8305c = (C4745gy.m14114a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    private C4737gr f8306a = null;

    /* renamed from: a */
    private List<C4727gk> f8307a = new CopyOnWriteArrayList();

    /* renamed from: a */
    private final Map<String, Object> f8308a = new HashMap();

    /* renamed from: d */
    private String f8309d = f8304b;

    /* renamed from: e */
    private String f8310e = null;

    /* renamed from: f */
    private String f8311f = null;

    /* renamed from: g */
    private String f8312g = null;

    /* renamed from: h */
    private String f8313h = null;

    /* renamed from: i */
    private String f8314i = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f8303a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public C4731gn() {
    }

    public C4731gn(Bundle bundle) {
        this.f8311f = bundle.getString("ext_to");
        this.f8312g = bundle.getString("ext_from");
        this.f8313h = bundle.getString("ext_chid");
        this.f8310e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f8307a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4727gk a = C4727gk.m14020a((Bundle) parcelable);
                if (a != null) {
                    this.f8307a.add(a);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f8306a = new C4737gr(bundle2);
        }
    }

    /* renamed from: i */
    public static synchronized String m14061i() {
        String sb;
        synchronized (C4731gn.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f8305c);
            long j = f8301a;
            f8301a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: q */
    public static String m14062q() {
        return f8302a;
    }

    /* renamed from: a */
    public Bundle mo29223a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f8309d)) {
            bundle.putString("ext_ns", this.f8309d);
        }
        if (!TextUtils.isEmpty(this.f8312g)) {
            bundle.putString("ext_from", this.f8312g);
        }
        if (!TextUtils.isEmpty(this.f8311f)) {
            bundle.putString("ext_to", this.f8311f);
        }
        if (!TextUtils.isEmpty(this.f8310e)) {
            bundle.putString("ext_pkt_id", this.f8310e);
        }
        if (!TextUtils.isEmpty(this.f8313h)) {
            bundle.putString("ext_chid", this.f8313h);
        }
        C4737gr grVar = this.f8306a;
        if (grVar != null) {
            bundle.putBundle("ext_ERROR", grVar.mo29267a());
        }
        List<C4727gk> list = this.f8307a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4727gk a : this.f8307a) {
                Bundle a2 = a.mo29216a();
                if (a2 != null) {
                    bundleArr[i] = a2;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public C4727gk mo29228a(String str) {
        return mo29229a(str, (String) null);
    }

    /* renamed from: a */
    public C4727gk mo29229a(String str, String str2) {
        for (C4727gk next : this.f8307a) {
            if ((str2 == null || str2.equals(next.mo29219b())) && str.equals(next.mo29216a())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C4737gr m14066a() {
        return this.f8306a;
    }

    /* renamed from: a */
    public synchronized Object m14067a(String str) {
        Map<String, Object> map = this.f8308a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: a */
    public abstract String m14068a();

    /* renamed from: a */
    public synchronized Collection<C4727gk> m14069a() {
        if (this.f8307a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f8307a));
    }

    /* renamed from: a */
    public void mo29249a(C4727gk gkVar) {
        this.f8307a.add(gkVar);
    }

    /* renamed from: a */
    public void mo29250a(C4737gr grVar) {
        this.f8306a = grVar;
    }

    /* renamed from: b */
    public synchronized Collection<String> mo29226b() {
        if (this.f8308a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f8308a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4731gn gnVar = (C4731gn) obj;
        C4737gr grVar = this.f8306a;
        if (grVar == null ? gnVar.f8306a != null : !grVar.equals(gnVar.f8306a)) {
            return false;
        }
        String str = this.f8312g;
        if (str == null ? gnVar.f8312g != null : !str.equals(gnVar.f8312g)) {
            return false;
        }
        if (!this.f8307a.equals(gnVar.f8307a)) {
            return false;
        }
        String str2 = this.f8310e;
        if (str2 == null ? gnVar.f8310e != null : !str2.equals(gnVar.f8310e)) {
            return false;
        }
        String str3 = this.f8313h;
        if (str3 == null ? gnVar.f8313h != null : !str3.equals(gnVar.f8313h)) {
            return false;
        }
        Map<String, Object> map = this.f8308a;
        if (map == null ? gnVar.f8308a != null : !map.equals(gnVar.f8308a)) {
            return false;
        }
        String str4 = this.f8311f;
        if (str4 == null ? gnVar.f8311f != null : !str4.equals(gnVar.f8311f)) {
            return false;
        }
        String str5 = this.f8309d;
        String str6 = gnVar.f8309d;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f8309d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8310e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8311f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8312g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8313h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f8307a.hashCode()) * 31) + this.f8308a.hashCode()) * 31;
        C4737gr grVar = this.f8306a;
        if (grVar != null) {
            i = grVar.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: j */
    public String mo29251j() {
        if ("ID_NOT_AVAILABLE".equals(this.f8310e)) {
            return null;
        }
        if (this.f8310e == null) {
            this.f8310e = m14061i();
        }
        return this.f8310e;
    }

    /* renamed from: k */
    public String mo29252k() {
        return this.f8313h;
    }

    /* renamed from: k */
    public void mo29253k(String str) {
        this.f8310e = str;
    }

    /* renamed from: l */
    public String mo29254l() {
        return this.f8311f;
    }

    /* renamed from: l */
    public void mo29255l(String str) {
        this.f8313h = str;
    }

    /* renamed from: m */
    public String mo29256m() {
        return this.f8312g;
    }

    /* renamed from: m */
    public void mo29257m(String str) {
        this.f8311f = str;
    }

    /* renamed from: n */
    public String mo29258n() {
        return this.f8314i;
    }

    /* renamed from: n */
    public void mo29259n(String str) {
        this.f8312g = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:63|64|(2:66|67)|(2:70|71)|72|73) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r4 == null) goto L_0x010d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0122 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[SYNTHETIC, Splitter:B:55:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118 A[SYNTHETIC, Splitter:B:66:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011f A[SYNTHETIC, Splitter:B:70:0x011f] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo29260o() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r0.<init>()     // Catch:{ all -> 0x012e }
            java.util.Collection r1 = r6.mo29223a()     // Catch:{ all -> 0x012e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x012e }
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x012e }
            com.xiaomi.push.go r2 = (com.xiaomi.push.C4732go) r2     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.mo29221d()     // Catch:{ all -> 0x012e }
            r0.append(r2)     // Catch:{ all -> 0x012e }
            goto L_0x000e
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f8308a     // Catch:{ all -> 0x012e }
            if (r1 == 0) goto L_0x0128
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x012e }
            if (r1 != 0) goto L_0x0128
            java.lang.String r1 = "<properties xmlns=\"http://www.jivesoftware.com/xmlns/xmpp/properties\">"
            r0.append(r1)     // Catch:{ all -> 0x012e }
            java.util.Collection r1 = r6.mo29226b()     // Catch:{ all -> 0x012e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x012e }
        L_0x0039:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0123
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x012e }
            java.lang.Object r3 = r6.mo29228a((java.lang.String) r2)     // Catch:{ all -> 0x012e }
            java.lang.String r4 = "<property>"
            r0.append(r4)     // Catch:{ all -> 0x012e }
            java.lang.String r4 = "<name>"
            r0.append(r4)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = com.xiaomi.push.C4745gy.m14115a((java.lang.String) r2)     // Catch:{ all -> 0x012e }
            r0.append(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</name>"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "<value type=\""
            r0.append(r2)     // Catch:{ all -> 0x012e }
            boolean r2 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = "integer\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            r0.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
        L_0x0072:
            r0.append(r2)     // Catch:{ all -> 0x012e }
            goto L_0x010d
        L_0x0077:
            boolean r2 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = "long\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            r0.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
            goto L_0x0072
        L_0x0086:
            boolean r2 = r3 instanceof java.lang.Float     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = "float\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            r0.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
            goto L_0x0072
        L_0x0095:
            boolean r2 = r3 instanceof java.lang.Double     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = "double\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            r0.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
            goto L_0x0072
        L_0x00a4:
            boolean r2 = r3 instanceof java.lang.Boolean     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00b3
            java.lang.String r2 = "boolean\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            r0.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
            goto L_0x0072
        L_0x00b3:
            boolean r2 = r3 instanceof java.lang.String     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = "string\">"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012e }
            java.lang.String r2 = com.xiaomi.push.C4745gy.m14115a((java.lang.String) r3)     // Catch:{ all -> 0x012e }
            r0.append(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "</value>"
            goto L_0x0072
        L_0x00c8:
            r2 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00fc, all -> 0x00f9 }
            r4.<init>()     // Catch:{ Exception -> 0x00fc, all -> 0x00f9 }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00f6, all -> 0x00f4 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00f6, all -> 0x00f4 }
            r5.writeObject(r3)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r2 = "java-object\">"
            r0.append(r2)     // Catch:{ Exception -> 0x00f2 }
            byte[] r2 = r4.toByteArray()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r2 = com.xiaomi.push.C4745gy.m14117a((byte[]) r2)     // Catch:{ Exception -> 0x00f2 }
            r0.append(r2)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r2 = "</value>"
            r0.append(r2)     // Catch:{ Exception -> 0x00f2 }
            r5.close()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            r4.close()     // Catch:{ Exception -> 0x010d }
            goto L_0x010d
        L_0x00f2:
            r2 = move-exception
            goto L_0x0100
        L_0x00f4:
            r0 = move-exception
            goto L_0x0116
        L_0x00f6:
            r3 = move-exception
            r5 = r2
            goto L_0x00ff
        L_0x00f9:
            r0 = move-exception
            r4 = r2
            goto L_0x0116
        L_0x00fc:
            r3 = move-exception
            r4 = r2
            r5 = r4
        L_0x00ff:
            r2 = r3
        L_0x0100:
            r2.printStackTrace()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x010a
            r5.close()     // Catch:{ Exception -> 0x0109 }
            goto L_0x010a
        L_0x0109:
        L_0x010a:
            if (r4 == 0) goto L_0x010d
            goto L_0x00ee
        L_0x010d:
            java.lang.String r2 = "</property>"
            r0.append(r2)     // Catch:{ all -> 0x012e }
            goto L_0x0039
        L_0x0114:
            r0 = move-exception
            r2 = r5
        L_0x0116:
            if (r2 == 0) goto L_0x011d
            r2.close()     // Catch:{ Exception -> 0x011c }
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            if (r4 == 0) goto L_0x0122
            r4.close()     // Catch:{ Exception -> 0x0122 }
        L_0x0122:
            throw r0     // Catch:{ all -> 0x012e }
        L_0x0123:
            java.lang.String r1 = "</properties>"
            r0.append(r1)     // Catch:{ all -> 0x012e }
        L_0x0128:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012e }
            monitor-exit(r6)
            return r0
        L_0x012e:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x0132
        L_0x0131:
            throw r0
        L_0x0132:
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4731gn.mo29260o():java.lang.String");
    }

    /* renamed from: o */
    public void mo29261o(String str) {
        this.f8314i = str;
    }

    /* renamed from: p */
    public String mo29262p() {
        return this.f8309d;
    }
}
