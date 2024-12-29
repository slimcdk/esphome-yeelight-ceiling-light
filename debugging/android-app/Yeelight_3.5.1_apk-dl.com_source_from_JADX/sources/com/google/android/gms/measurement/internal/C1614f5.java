package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1023b1;
import com.google.android.gms.internal.measurement.C1107g5;
import com.google.android.gms.internal.measurement.C1139i5;
import com.google.android.gms.internal.measurement.C1180ke;
import com.google.android.gms.internal.measurement.C1195ld;
import com.google.android.gms.internal.measurement.C1249p3;
import com.google.android.gms.internal.measurement.C1265q3;
import com.google.android.gms.internal.measurement.C1297s3;
import com.google.android.gms.internal.measurement.C1313t3;
import com.google.android.gms.internal.measurement.C1373x3;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkm;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.manager.timer.TimerCodec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
public final class C1614f5 extends C1606ea implements C1608f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f2074d = new ArrayMap();
    @VisibleForTesting

    /* renamed from: e */
    final Map f2075e = new ArrayMap();
    @VisibleForTesting

    /* renamed from: f */
    final Map f2076f = new ArrayMap();
    @VisibleForTesting

    /* renamed from: g */
    final Map f2077g = new ArrayMap();

    /* renamed from: h */
    private final Map f2078h = new ArrayMap();

    /* renamed from: i */
    private final Map f2079i = new ArrayMap();
    @VisibleForTesting

    /* renamed from: j */
    final LruCache f2080j = new C1562b5(this, 20);

    /* renamed from: k */
    final C1180ke f2081k = new C1575c5(this);

    /* renamed from: l */
    private final Map f2082l = new ArrayMap();

    /* renamed from: m */
    private final Map f2083m = new ArrayMap();

    /* renamed from: n */
    private final Map f2084n = new ArrayMap();

    C1614f5(C1770ra raVar) {
        super(raVar);
    }

    @WorkerThread
    /* renamed from: m */
    private final C1313t3 m4184m(String str, byte[] bArr) {
        if (bArr == null) {
            return C1313t3.m2986E();
        }
        try {
            C1313t3 t3Var = (C1313t3) ((C1297s3) C1794ta.m4742C(C1313t3.m2984C(), bArr)).mo12838q();
            C1859z3 v = this.f2143a.mo14228b().mo14039v();
            String str2 = null;
            Long valueOf = t3Var.mo13378P() ? Long.valueOf(t3Var.mo13381z()) : null;
            if (t3Var.mo13377O()) {
                str2 = t3Var.mo13370F();
            }
            v.mo14695c("Parsed config. version, gmp_app_id", valueOf, str2);
            return t3Var;
        } catch (zzkm | RuntimeException e) {
            this.f2143a.mo14228b().mo14040w().mo14695c("Unable to merge remote config. appId", C1574c4.m4083z(str), e);
            return C1313t3.m2986E();
        }
    }

    /* renamed from: n */
    private final void m4185n(String str, C1297s3 s3Var) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (s3Var != null) {
            C1195ld.m2247b();
            if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2480z0)) {
                for (C1249p3 y : s3Var.mo13275D()) {
                    hashSet.add(y.mo13060y());
                }
            }
            for (int i = 0; i < s3Var.mo13276t(); i++) {
                C1265q3 q3Var = (C1265q3) s3Var.mo13277u(i).mo12916l();
                if (q3Var.mo13081w().isEmpty()) {
                    this.f2143a.mo14228b().mo14040w().mo14693a("EventConfig contained null event name");
                } else {
                    String w = q3Var.mo13081w();
                    String b = C1693l6.m4467b(q3Var.mo13081w());
                    if (!TextUtils.isEmpty(b)) {
                        q3Var.mo13080u(b);
                        s3Var.mo13279x(i, q3Var);
                    }
                    if (q3Var.mo13076C() && q3Var.mo13082x()) {
                        arrayMap.put(w, Boolean.TRUE);
                    }
                    if (q3Var.mo13077D() && q3Var.mo13083y()) {
                        arrayMap2.put(q3Var.mo13081w(), Boolean.TRUE);
                    }
                    if (q3Var.mo13078E()) {
                        if (q3Var.mo13079t() < 2 || q3Var.mo13079t() > 65535) {
                            this.f2143a.mo14228b().mo14040w().mo14695c("Invalid sampling rate. Event name, sample rate", q3Var.mo13081w(), Integer.valueOf(q3Var.mo13079t()));
                        } else {
                            arrayMap3.put(q3Var.mo13081w(), Integer.valueOf(q3Var.mo13079t()));
                        }
                    }
                }
            }
        }
        this.f2075e.put(str, hashSet);
        this.f2076f.put(str, arrayMap);
        this.f2077g.put(str, arrayMap2);
        this.f2079i.put(str, arrayMap3);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4186o(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo14128i()
            r12.mo14009h()
            com.google.android.gms.common.internal.C0917i.m1415f(r13)
            java.util.Map r0 = r12.f2078h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.ra r0 = r12.f2045b
            com.google.android.gms.measurement.internal.l r0 = r0.mo14466V()
            com.google.android.gms.common.internal.C0917i.m1415f(r13)
            r0.mo14009h()
            r0.mo14128i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo14320P()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r3 != 0) goto L_0x0047
            goto L_0x00a6
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.n5 r5 = r0.f2143a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.g r5 = r5.mo14402z()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.n3 r6 = com.google.android.gms.measurement.internal.C1727o3.f2411K0     // Catch:{ SQLiteException -> 0x0089 }
            boolean r5 = r5.mo14163B(r1, r6)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r6 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.n5 r6 = r0.f2143a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14035r()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r13)     // Catch:{ SQLiteException -> 0x0089 }
            r6.mo14694b(r7, r8)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x00a6
        L_0x0080:
            com.google.android.gms.measurement.internal.i r6 = new com.google.android.gms.measurement.internal.i     // Catch:{ SQLiteException -> 0x0089 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0089 }
            r2.close()
            goto L_0x00aa
        L_0x0089:
            r3 = move-exception
            goto L_0x0091
        L_0x008b:
            r13 = move-exception
            goto L_0x0123
        L_0x008e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0091:
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r13)     // Catch:{ all -> 0x0121 }
            r0.mo14695c(r4, r5, r3)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00a9
        L_0x00a6:
            r2.close()
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 != 0) goto L_0x00da
            java.util.Map r0 = r12.f2074d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2076f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2075e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2077g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2078h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2082l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2083m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2084n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2079i
        L_0x00d6:
            r0.put(r13, r1)
            return
        L_0x00da:
            byte[] r0 = r6.f2151a
            com.google.android.gms.internal.measurement.t3 r0 = r12.m4184m(r13, r0)
            com.google.android.gms.internal.measurement.g8 r0 = r0.mo12916l()
            com.google.android.gms.internal.measurement.s3 r0 = (com.google.android.gms.internal.measurement.C1297s3) r0
            r12.m4185n(r13, r0)
            java.util.Map r1 = r12.f2074d
            com.google.android.gms.internal.measurement.k8 r2 = r0.mo12838q()
            com.google.android.gms.internal.measurement.t3 r2 = (com.google.android.gms.internal.measurement.C1313t3) r2
            java.util.Map r2 = m4188q(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f2078h
            com.google.android.gms.internal.measurement.k8 r2 = r0.mo12838q()
            com.google.android.gms.internal.measurement.t3 r2 = (com.google.android.gms.internal.measurement.C1313t3) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.k8 r1 = r0.mo12838q()
            com.google.android.gms.internal.measurement.t3 r1 = (com.google.android.gms.internal.measurement.C1313t3) r1
            r12.m4187p(r13, r1)
            java.util.Map r1 = r12.f2082l
            java.lang.String r0 = r0.mo13280y()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f2083m
            java.lang.String r1 = r6.f2152b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f2084n
            java.lang.String r1 = r6.f2153c
            goto L_0x00d6
        L_0x0121:
            r13 = move-exception
            r1 = r2
        L_0x0123:
            if (r1 == 0) goto L_0x0128
            r1.close()
        L_0x0128:
            throw r13
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1614f5.m4186o(java.lang.String):void");
    }

    @WorkerThread
    /* renamed from: p */
    private final void m4187p(String str, C1313t3 t3Var) {
        if (t3Var.mo13379x() != 0) {
            this.f2143a.mo14228b().mo14039v().mo14694b("EES programs found", Integer.valueOf(t3Var.mo13379x()));
            C1139i5 i5Var = (C1139i5) t3Var.mo13374J().get(0);
            try {
                C1023b1 b1Var = new C1023b1();
                b1Var.mo12565d("internal.remoteConfig", new C1848y4(this, str));
                b1Var.mo12565d("internal.appMetadata", new C1860z4(this, str));
                b1Var.mo12565d("internal.logger", new C1549a5(this));
                b1Var.mo12564c(i5Var);
                this.f2080j.put(str, b1Var);
                this.f2143a.mo14228b().mo14039v().mo14695c("EES program loaded for appId, activities", str, Integer.valueOf(i5Var.mo12875x().mo12743x()));
                for (C1107g5 y : i5Var.mo12875x().mo12742A()) {
                    this.f2143a.mo14228b().mo14039v().mo14694b("EES program activity", y.mo12826y());
                }
            } catch (zzd unused) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Failed to load EES program. appId", str);
            }
        } else {
            this.f2080j.remove(str);
        }
    }

    /* renamed from: q */
    private static final Map m4188q(C1313t3 t3Var) {
        ArrayMap arrayMap = new ArrayMap();
        if (t3Var != null) {
            for (C1373x3 x3Var : t3Var.mo13375K()) {
                arrayMap.put(x3Var.mo13482y(), x3Var.mo13483z());
            }
        }
        return arrayMap;
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ C1023b1 m4189s(C1614f5 f5Var, String str) {
        f5Var.mo14128i();
        C0917i.m1415f(str);
        if (!f5Var.mo14138C(str)) {
            return null;
        }
        if (!f5Var.f2078h.containsKey(str) || f5Var.f2078h.get(str) == null) {
            f5Var.m4186o(str);
        } else {
            f5Var.m4187p(str, (C1313t3) f5Var.f2078h.get(str));
        }
        return (C1023b1) f5Var.f2080j.snapshot().get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final void mo14136A(String str) {
        mo14009h();
        this.f2078h.remove(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: B */
    public final boolean mo14137B(String str) {
        mo14009h();
        C1313t3 t = mo14151t(str);
        if (t == null) {
            return false;
        }
        return t.mo13376N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (com.google.android.gms.internal.measurement.C1313t3) r2.f2078h.get(r3);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14138C(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f2078h
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.t3 r3 = (com.google.android.gms.internal.measurement.C1313t3) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.mo13379x()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1614f5.mo14138C(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo14139D(String str) {
        return TimerCodec.ENABLE.equals(mo14122e(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public final boolean mo14140E(String str, String str2) {
        Boolean bool;
        mo14009h();
        m4186o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f2077g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: F */
    public final boolean mo14141F(String str, String str2) {
        Boolean bool;
        mo14009h();
        m4186o(str);
        if (mo14139D(str) && C1854ya.m4831W(str2)) {
            return true;
        }
        if (mo14142G(str) && C1854ya.m4832X(str2)) {
            return true;
        }
        Map map = (Map) this.f2076f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo14142G(String str) {
        return TimerCodec.ENABLE.equals(mo14122e(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: H */
    public final boolean mo14143H(String str, byte[] bArr, String str2, String str3) {
        mo14128i();
        mo14009h();
        C0917i.m1415f(str);
        C1297s3 s3Var = (C1297s3) m4184m(str, bArr).mo12916l();
        if (s3Var == null) {
            return false;
        }
        m4185n(str, s3Var);
        m4187p(str, (C1313t3) s3Var.mo12838q());
        this.f2078h.put(str, (C1313t3) s3Var.mo12838q());
        this.f2082l.put(str, s3Var.mo13280y());
        this.f2083m.put(str, str2);
        this.f2084n.put(str, str3);
        this.f2074d.put(str, m4188q((C1313t3) s3Var.mo12838q()));
        this.f2045b.mo14466V().mo14339n(str, new ArrayList(s3Var.mo13274C()));
        try {
            s3Var.mo13278w();
            bArr = ((C1313t3) s3Var.mo12838q()).mo13507j();
        } catch (RuntimeException e) {
            this.f2143a.mo14228b().mo14040w().mo14695c("Unable to serialize reduced-size config. Storing full config instead. appId", C1574c4.m4083z(str), e);
        }
        C1686l V = this.f2045b.mo14466V();
        C0917i.m1415f(str);
        V.mo14009h();
        V.mo14128i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (V.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2411K0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) V.mo14320P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                V.f2143a.mo14228b().mo14035r().mo14694b("Failed to update remote config (got 0). appId", C1574c4.m4083z(str));
            }
        } catch (SQLiteException e2) {
            V.f2143a.mo14228b().mo14035r().mo14695c("Error storing remote config. appId", C1574c4.m4083z(str), e2);
        }
        this.f2078h.put(str, (C1313t3) s3Var.mo12838q());
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: I */
    public final boolean mo14144I(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && ((Set) this.f2075e.get(str)).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: J */
    public final boolean mo14145J(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && (((Set) this.f2075e.get(str)).contains(SmartConfigDataProvider.KEY_DEVICE_MODEL) || ((Set) this.f2075e.get(str)).contains("device_info"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: K */
    public final boolean mo14146K(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && ((Set) this.f2075e.get(str)).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: L */
    public final boolean mo14147L(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && ((Set) this.f2075e.get(str)).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: M */
    public final boolean mo14148M(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && (((Set) this.f2075e.get(str)).contains("os_version") || ((Set) this.f2075e.get(str)).contains("device_info"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: N */
    public final boolean mo14149N(String str) {
        mo14009h();
        m4186o(str);
        return this.f2075e.get(str) != null && ((Set) this.f2075e.get(str)).contains("user_id");
    }

    @WorkerThread
    /* renamed from: e */
    public final String mo14122e(String str, String str2) {
        mo14009h();
        m4186o(str);
        Map map = (Map) this.f2074d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final int mo14150r(String str, String str2) {
        Integer num;
        mo14009h();
        m4186o(str);
        Map map = (Map) this.f2079i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: t */
    public final C1313t3 mo14151t(String str) {
        mo14128i();
        mo14009h();
        C0917i.m1415f(str);
        m4186o(str);
        return (C1313t3) this.f2078h.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final String mo14152u(String str) {
        mo14009h();
        return (String) this.f2084n.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: v */
    public final String mo14153v(String str) {
        mo14009h();
        return (String) this.f2083m.get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final String mo14154w(String str) {
        mo14009h();
        m4186o(str);
        return (String) this.f2082l.get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final Set mo14155y(String str) {
        mo14009h();
        m4186o(str);
        return (Set) this.f2075e.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: z */
    public final void mo14156z(String str) {
        mo14009h();
        this.f2083m.put(str, (Object) null);
    }
}
