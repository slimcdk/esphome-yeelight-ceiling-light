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

/* renamed from: com.xiaomi.push.gj */
public abstract class C4701gj {

    /* renamed from: a */
    private static long f8836a = 0;

    /* renamed from: a */
    protected static final String f8837a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: a */
    public static final DateFormat f8838a;

    /* renamed from: b */
    private static String f8839b = null;

    /* renamed from: c */
    private static String f8840c = (C4715gu.m14460a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    private C4707gn f8841a = null;

    /* renamed from: a */
    private List<C4697gg> f8842a = new CopyOnWriteArrayList();

    /* renamed from: a */
    private final Map<String, Object> f8843a = new HashMap();

    /* renamed from: d */
    private String f8844d = f8839b;

    /* renamed from: e */
    private String f8845e = null;

    /* renamed from: f */
    private String f8846f = null;

    /* renamed from: g */
    private String f8847g = null;

    /* renamed from: h */
    private String f8848h = null;

    /* renamed from: i */
    private String f8849i = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f8838a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public C4701gj() {
    }

    public C4701gj(Bundle bundle) {
        this.f8846f = bundle.getString("ext_to");
        this.f8847g = bundle.getString("ext_from");
        this.f8848h = bundle.getString("ext_chid");
        this.f8845e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f8842a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4697gg a = C4697gg.m14367a((Bundle) parcelable);
                if (a != null) {
                    this.f8842a.add(a);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f8841a = new C4707gn(bundle2);
        }
    }

    /* renamed from: i */
    public static synchronized String m14407i() {
        String sb;
        synchronized (C4701gj.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f8840c);
            long j = f8836a;
            f8836a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: q */
    public static String m14408q() {
        return f8837a;
    }

    /* renamed from: a */
    public Bundle mo25186a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f8844d)) {
            bundle.putString("ext_ns", this.f8844d);
        }
        if (!TextUtils.isEmpty(this.f8847g)) {
            bundle.putString("ext_from", this.f8847g);
        }
        if (!TextUtils.isEmpty(this.f8846f)) {
            bundle.putString("ext_to", this.f8846f);
        }
        if (!TextUtils.isEmpty(this.f8845e)) {
            bundle.putString("ext_pkt_id", this.f8845e);
        }
        if (!TextUtils.isEmpty(this.f8848h)) {
            bundle.putString("ext_chid", this.f8848h);
        }
        C4707gn gnVar = this.f8841a;
        if (gnVar != null) {
            bundle.putBundle("ext_ERROR", gnVar.mo25230a());
        }
        List<C4697gg> list = this.f8842a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4697gg a : this.f8842a) {
                Bundle a2 = a.mo25180a();
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
    public C4697gg mo25191a(String str) {
        return mo25192a(str, (String) null);
    }

    /* renamed from: a */
    public C4697gg mo25192a(String str, String str2) {
        for (C4697gg next : this.f8842a) {
            if ((str2 == null || str2.equals(next.mo25182b())) && str.equals(next.mo25180a())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C4707gn m14412a() {
        return this.f8841a;
    }

    /* renamed from: a */
    public synchronized Object m14413a(String str) {
        if (this.f8843a == null) {
            return null;
        }
        return this.f8843a.get(str);
    }

    /* renamed from: a */
    public abstract String m14414a();

    /* renamed from: a */
    public synchronized Collection<C4697gg> m14415a() {
        if (this.f8842a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f8842a));
    }

    /* renamed from: a */
    public void mo25212a(C4697gg ggVar) {
        this.f8842a.add(ggVar);
    }

    /* renamed from: a */
    public void mo25213a(C4707gn gnVar) {
        this.f8841a = gnVar;
    }

    /* renamed from: b */
    public synchronized Collection<String> mo25189b() {
        if (this.f8843a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f8843a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4701gj gjVar = (C4701gj) obj;
        C4707gn gnVar = this.f8841a;
        if (gnVar == null ? gjVar.f8841a != null : !gnVar.equals(gjVar.f8841a)) {
            return false;
        }
        String str = this.f8847g;
        if (str == null ? gjVar.f8847g != null : !str.equals(gjVar.f8847g)) {
            return false;
        }
        if (!this.f8842a.equals(gjVar.f8842a)) {
            return false;
        }
        String str2 = this.f8845e;
        if (str2 == null ? gjVar.f8845e != null : !str2.equals(gjVar.f8845e)) {
            return false;
        }
        String str3 = this.f8848h;
        if (str3 == null ? gjVar.f8848h != null : !str3.equals(gjVar.f8848h)) {
            return false;
        }
        Map<String, Object> map = this.f8843a;
        if (map == null ? gjVar.f8843a != null : !map.equals(gjVar.f8843a)) {
            return false;
        }
        String str4 = this.f8846f;
        if (str4 == null ? gjVar.f8846f != null : !str4.equals(gjVar.f8846f)) {
            return false;
        }
        String str5 = this.f8844d;
        String str6 = gjVar.f8844d;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f8844d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8845e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8846f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8847g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8848h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f8842a.hashCode()) * 31) + this.f8843a.hashCode()) * 31;
        C4707gn gnVar = this.f8841a;
        if (gnVar != null) {
            i = gnVar.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: j */
    public String mo25214j() {
        if ("ID_NOT_AVAILABLE".equals(this.f8845e)) {
            return null;
        }
        if (this.f8845e == null) {
            this.f8845e = m14407i();
        }
        return this.f8845e;
    }

    /* renamed from: k */
    public String mo25215k() {
        return this.f8848h;
    }

    /* renamed from: k */
    public void mo25216k(String str) {
        this.f8845e = str;
    }

    /* renamed from: l */
    public String mo25217l() {
        return this.f8846f;
    }

    /* renamed from: l */
    public void mo25218l(String str) {
        this.f8848h = str;
    }

    /* renamed from: m */
    public String mo25219m() {
        return this.f8847g;
    }

    /* renamed from: m */
    public void mo25220m(String str) {
        this.f8846f = str;
    }

    /* renamed from: n */
    public String mo25221n() {
        return this.f8849i;
    }

    /* renamed from: n */
    public void mo25222n(String str) {
        this.f8847g = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:63|64|(2:66|67)|(2:70|71)|72|73) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010c, code lost:
        if (r4 == null) goto L_0x010f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0124 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[SYNTHETIC, Splitter:B:55:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011a A[SYNTHETIC, Splitter:B:66:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0121 A[SYNTHETIC, Splitter:B:70:0x0121] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo25223o() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            java.util.Collection r1 = r6.mo25186a()     // Catch:{ all -> 0x0130 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0130 }
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0130 }
            com.xiaomi.push.gk r2 = (com.xiaomi.push.C4702gk) r2     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = r2.mo25184d()     // Catch:{ all -> 0x0130 }
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            goto L_0x000e
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f8843a     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x012a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f8843a     // Catch:{ all -> 0x0130 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r1 != 0) goto L_0x012a
            java.lang.String r1 = "<properties xmlns=\"http://www.jivesoftware.com/xmlns/xmpp/properties\">"
            r0.append(r1)     // Catch:{ all -> 0x0130 }
            java.util.Collection r1 = r6.mo25189b()     // Catch:{ all -> 0x0130 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0130 }
        L_0x003b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0125
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0130 }
            java.lang.Object r3 = r6.mo25191a((java.lang.String) r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r4 = "<property>"
            r0.append(r4)     // Catch:{ all -> 0x0130 }
            java.lang.String r4 = "<name>"
            r0.append(r4)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = com.xiaomi.push.C4715gu.m14461a((java.lang.String) r2)     // Catch:{ all -> 0x0130 }
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</name>"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "<value type=\""
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            boolean r2 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = "integer\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            r0.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
        L_0x0074:
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            goto L_0x010f
        L_0x0079:
            boolean r2 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = "long\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            r0.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x0088:
            boolean r2 = r3 instanceof java.lang.Float     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "float\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            r0.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x0097:
            boolean r2 = r3 instanceof java.lang.Double     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = "double\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            r0.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00a6:
            boolean r2 = r3 instanceof java.lang.Boolean     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x00b5
            java.lang.String r2 = "boolean\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            r0.append(r3)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00b5:
            boolean r2 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0130 }
            if (r2 == 0) goto L_0x00ca
            java.lang.String r2 = "string\">"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = com.xiaomi.push.C4715gu.m14461a((java.lang.String) r3)     // Catch:{ all -> 0x0130 }
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00ca:
            r2 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00fe, all -> 0x00fb }
            r4.<init>()     // Catch:{ Exception -> 0x00fe, all -> 0x00fb }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00f8, all -> 0x00f6 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00f8, all -> 0x00f6 }
            r5.writeObject(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = "java-object\">"
            r0.append(r2)     // Catch:{ Exception -> 0x00f4 }
            byte[] r2 = r4.toByteArray()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = com.xiaomi.push.C4715gu.m14463a((byte[]) r2)     // Catch:{ Exception -> 0x00f4 }
            r0.append(r2)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = "</value>"
            r0.append(r2)     // Catch:{ Exception -> 0x00f4 }
            r5.close()     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            r4.close()     // Catch:{ Exception -> 0x010f }
            goto L_0x010f
        L_0x00f4:
            r2 = move-exception
            goto L_0x0102
        L_0x00f6:
            r0 = move-exception
            goto L_0x0118
        L_0x00f8:
            r3 = move-exception
            r5 = r2
            goto L_0x0101
        L_0x00fb:
            r0 = move-exception
            r4 = r2
            goto L_0x0118
        L_0x00fe:
            r3 = move-exception
            r4 = r2
            r5 = r4
        L_0x0101:
            r2 = r3
        L_0x0102:
            r2.printStackTrace()     // Catch:{ all -> 0x0116 }
            if (r5 == 0) goto L_0x010c
            r5.close()     // Catch:{ Exception -> 0x010b }
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            if (r4 == 0) goto L_0x010f
            goto L_0x00f0
        L_0x010f:
            java.lang.String r2 = "</property>"
            r0.append(r2)     // Catch:{ all -> 0x0130 }
            goto L_0x003b
        L_0x0116:
            r0 = move-exception
            r2 = r5
        L_0x0118:
            if (r2 == 0) goto L_0x011f
            r2.close()     // Catch:{ Exception -> 0x011e }
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            if (r4 == 0) goto L_0x0124
            r4.close()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0125:
            java.lang.String r1 = "</properties>"
            r0.append(r1)     // Catch:{ all -> 0x0130 }
        L_0x012a:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0130 }
            monitor-exit(r6)
            return r0
        L_0x0130:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x0134
        L_0x0133:
            throw r0
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4701gj.mo25223o():java.lang.String");
    }

    /* renamed from: o */
    public void mo25224o(String str) {
        this.f8849i = str;
    }

    /* renamed from: p */
    public String mo25225p() {
        return this.f8844d;
    }
}
