package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1011a5;
import com.google.android.gms.internal.measurement.C1027b5;
import com.google.android.gms.internal.measurement.C1081eb;
import com.google.android.gms.internal.measurement.C1106g4;
import com.google.android.gms.internal.measurement.C1122h4;
import com.google.android.gms.internal.measurement.C1170k4;
import com.google.android.gms.internal.measurement.C1186l4;
import com.google.android.gms.internal.measurement.C1195ld;
import com.google.android.gms.internal.measurement.C1282r4;
import com.google.android.gms.internal.measurement.C1291rd;
import com.google.android.gms.internal.measurement.C1313t3;
import com.google.android.gms.internal.measurement.C1338ud;
import com.google.android.gms.internal.measurement.C1411zb;
import com.google.android.gms.internal.measurement.zzcl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p014c0.C0616e;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.measurement.internal.ra */
public final class C1770ra implements C1667j6 {

    /* renamed from: F */
    private static volatile C1770ra f2601F;

    /* renamed from: A */
    private final Map f2602A;

    /* renamed from: B */
    private final Map f2603B;

    /* renamed from: C */
    private C1552a8 f2604C;

    /* renamed from: D */
    private String f2605D;

    /* renamed from: E */
    private final C1842xa f2606E = new C1710ma(this);

    /* renamed from: a */
    private final C1614f5 f2607a;

    /* renamed from: b */
    private final C1652i4 f2608b;

    /* renamed from: c */
    private C1686l f2609c;

    /* renamed from: d */
    private C1678k4 f2610d;

    /* renamed from: e */
    private C1580ca f2611e;

    /* renamed from: f */
    private C1556b f2612f;

    /* renamed from: g */
    private final C1794ta f2613g;

    /* renamed from: h */
    private C1851y7 f2614h;

    /* renamed from: i */
    private C1696l9 f2615i;

    /* renamed from: j */
    private final C1632ga f2616j;

    /* renamed from: k */
    private C1800u4 f2617k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1717n5 f2618l;

    /* renamed from: m */
    private boolean f2619m = false;

    /* renamed from: n */
    private boolean f2620n;
    @VisibleForTesting

    /* renamed from: o */
    long f2621o;

    /* renamed from: p */
    private List f2622p;

    /* renamed from: q */
    private int f2623q;

    /* renamed from: r */
    private int f2624r;

    /* renamed from: s */
    private boolean f2625s;

    /* renamed from: t */
    private boolean f2626t;

    /* renamed from: u */
    private boolean f2627u;

    /* renamed from: v */
    private FileLock f2628v;

    /* renamed from: w */
    private FileChannel f2629w;

    /* renamed from: x */
    private List f2630x;

    /* renamed from: y */
    private List f2631y;

    /* renamed from: z */
    private long f2632z;

    C1770ra(C1782sa saVar, C1717n5 n5Var) {
        C0917i.m1419j(saVar);
        this.f2618l = C1717n5.m4485H(saVar.f2666a, (zzcl) null, (Long) null);
        this.f2632z = -1;
        this.f2616j = new C1632ga(this);
        C1794ta taVar = new C1794ta(this);
        taVar.mo14129j();
        this.f2613g = taVar;
        C1652i4 i4Var = new C1652i4(this);
        i4Var.mo14129j();
        this.f2608b = i4Var;
        C1614f5 f5Var = new C1614f5(this);
        f5Var.mo14129j();
        this.f2607a = f5Var;
        this.f2602A = new HashMap();
        this.f2603B = new HashMap();
        mo14227a().mo14310z(new C1645ha(this, saVar));
    }

    @VisibleForTesting
    /* renamed from: E */
    static final void m4617E(C1106g4 g4Var, int i, String str) {
        List U = g4Var.mo12819U();
        int i2 = 0;
        while (i2 < U.size()) {
            if (!"_err".equals(((C1186l4) U.get(i2)).mo12953E())) {
                i2++;
            } else {
                return;
            }
        }
        C1170k4 C = C1186l4.m2202C();
        C.mo12899L("_err");
        C.mo12898K(Long.valueOf((long) i).longValue());
        C1170k4 C2 = C1186l4.m2202C();
        C2.mo12899L("_ev");
        C2.mo12900M(str);
        g4Var.mo12809C((C1186l4) C.mo12838q());
        g4Var.mo12809C((C1186l4) C2.mo12838q());
    }

    @VisibleForTesting
    /* renamed from: G */
    static final void m4618G(C1106g4 g4Var, @NonNull String str) {
        List U = g4Var.mo12819U();
        for (int i = 0; i < U.size(); i++) {
            if (str.equals(((C1186l4) U.get(i)).mo12953E())) {
                g4Var.mo12811E(i);
                return;
            }
        }
    }

    @WorkerThread
    /* renamed from: H */
    private final zzq m4619H(String str) {
        C1859z3 q;
        String str2;
        Object obj;
        String str3 = str;
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C1589d6 R = lVar.mo14322R(str3);
        if (R == null || TextUtils.isEmpty(R.mo14095h0())) {
            q = mo14228b().mo14034q();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean I = m4620I(R);
            if (I == null || I.booleanValue()) {
                C1589d6 d6Var = R;
                return new zzq(str, R.mo14099j0(), R.mo14095h0(), R.mo14066M(), R.mo14093g0(), R.mo14077X(), R.mo14074U(), (String) null, R.mo14064K(), false, R.mo14097i0(), d6Var.mo14054A(), 0, 0, d6Var.mo14063J(), false, d6Var.mo14085c0(), d6Var.mo14083b0(), d6Var.mo14075V(), d6Var.mo14084c(), (String) null, mo14465U(str).mo14219h(), "", (String) null);
            }
            q = mo14228b().mo14035r();
            str2 = "App version does not match; dropping. appId";
            obj = C1574c4.m4083z(str);
        }
        q.mo14694b(str2, obj);
        return null;
    }

    @WorkerThread
    /* renamed from: I */
    private final Boolean m4620I(C1589d6 d6Var) {
        try {
            if (d6Var.mo14066M() != -2147483648L) {
                if (d6Var.mo14066M() == ((long) C3144c.m8403a(this.f2618l.mo14231f()).mo23629d(d6Var.mo14089e0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C3144c.m8403a(this.f2618l.mo14231f()).mo23629d(d6Var.mo14089e0(), 0).versionName;
                String h0 = d6Var.mo14095h0();
                if (h0 != null && h0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: J */
    private final void m4621J() {
        mo14227a().mo14009h();
        if (this.f2625s || this.f2626t || this.f2627u) {
            mo14228b().mo14039v().mo14696d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f2625s), Boolean.valueOf(this.f2626t), Boolean.valueOf(this.f2627u));
            return;
        }
        mo14228b().mo14039v().mo14693a("Stopping uploading service(s)");
        List<Runnable> list = this.f2622p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C0917i.m1419j(this.f2622p)).clear();
        }
    }

    @VisibleForTesting
    /* renamed from: K */
    private final void m4622K(C1282r4 r4Var, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C1818va X = lVar.mo14327X(r4Var.mo13165Y0(), str);
        C1818va vaVar = (X == null || X.f2734e == null) ? new C1818va(r4Var.mo13165Y0(), "auto", str, mo14229c().mo11029a(), Long.valueOf(j)) : new C1818va(r4Var.mo13165Y0(), "auto", str, mo14229c().mo11029a(), Long.valueOf(((Long) X.f2734e).longValue() + j));
        C1011a5 A = C1027b5.m1714A();
        A.mo12517C(str);
        A.mo12518D(mo14229c().mo11029a());
        A.mo12524y(((Long) vaVar.f2734e).longValue());
        C1027b5 b5Var = (C1027b5) A.mo12838q();
        int w = C1794ta.m4757w(r4Var, str);
        if (w >= 0) {
            r4Var.mo13159T0(w, b5Var);
        } else {
            r4Var.mo13190q1(b5Var);
        }
        if (j > 0) {
            C1686l lVar2 = this.f2609c;
            m4628Q(lVar2);
            lVar2.mo14349x(vaVar);
            mo14228b().mo14039v().mo14695c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", vaVar.f2734e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021c  */
    @androidx.annotation.WorkerThread
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4623L() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.k5 r1 = r20.mo14227a()
            r1.mo14009h()
            r20.mo14476g()
            long r1 = r0.f2621o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            c0.e r5 = r20.mo14229c()
            long r5 = r5.mo11030b()
            long r7 = r0.f2621o
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.c4 r3 = r20.mo14228b()
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14039v()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo14694b(r2, r1)
            com.google.android.gms.measurement.internal.k4 r1 = r20.mo14469Y()
            r1.mo14302c()
            com.google.android.gms.measurement.internal.ca r1 = r0.f2611e
            m4628Q(r1)
            r1.mo14047m()
            return
        L_0x004c:
            r0.f2621o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.n5 r1 = r0.f2618l
            boolean r1 = r1.mo14398r()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r20.m4625N()
            if (r1 != 0) goto L_0x005e
            goto L_0x0239
        L_0x005e:
            c0.e r1 = r20.mo14229c()
            long r1 = r1.mo11029a()
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2390A
            r6 = 0
            java.lang.Object r5 = r5.mo14366a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.l r5 = r0.f2609c
            m4628Q(r5)
            boolean r5 = r5.mo14345t()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.l r5 = r0.f2609c
            m4628Q(r5)
            boolean r5 = r5.mo14344s()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.g r5 = r20.mo14464T()
            java.lang.String r5 = r5.mo14180u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00b1
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00b1
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2471v
            goto L_0x00bc
        L_0x00b1:
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2469u
            goto L_0x00bc
        L_0x00b7:
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2467t
        L_0x00bc:
            java.lang.Object r5 = r5.mo14366a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            com.google.android.gms.measurement.internal.l9 r5 = r0.f2615i
            com.google.android.gms.measurement.internal.n4 r5 = r5.f2285j
            long r13 = r5.mo14368a()
            com.google.android.gms.measurement.internal.l9 r5 = r0.f2615i
            com.google.android.gms.measurement.internal.n4 r5 = r5.f2286k
            long r15 = r5.mo14368a()
            com.google.android.gms.measurement.internal.l r5 = r0.f2609c
            m4628Q(r5)
            r17 = r10
            long r9 = r5.mo14317M()
            com.google.android.gms.measurement.internal.l r5 = r0.f2609c
            m4628Q(r5)
            r18 = r7
            long r6 = r5.mo14318N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x00fb
        L_0x00f8:
            r7 = r3
            goto L_0x0173
        L_0x00fb:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x0120
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x0120:
            com.google.android.gms.measurement.internal.ta r13 = r0.f2613g
            m4628Q(r13)
            boolean r13 = r13.mo14586M(r1, r11)
            if (r13 != 0) goto L_0x012d
            long r7 = r1 + r11
        L_0x012d:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0173
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0173
            r1 = 0
        L_0x0136:
            r20.mo14464T()
            r2 = 20
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2394C
            r6 = 0
            java.lang.Object r5 = r5.mo14366a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x00f8
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r2 = com.google.android.gms.measurement.internal.C1727o3.f2392B
            java.lang.Object r2 = r2.mo14366a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0173
            int r1 = r1 + 1
            goto L_0x0136
        L_0x0173:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.i4 r1 = r0.f2608b
            m4628Q(r1)
            boolean r1 = r1.mo14237m()
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.l9 r1 = r0.f2615i
            com.google.android.gms.measurement.internal.n4 r1 = r1.f2284i
            long r1 = r1.mo14368a()
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2463r
            r6 = 0
            java.lang.Object r5 = r5.mo14366a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ta r9 = r0.f2613g
            m4628Q(r9)
            boolean r9 = r9.mo14586M(r1, r5)
            if (r9 != 0) goto L_0x01ae
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ae:
            com.google.android.gms.measurement.internal.k4 r1 = r20.mo14469Y()
            r1.mo14302c()
            c0.e r1 = r20.mo14229c()
            long r1 = r1.mo11029a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01e5
            r20.mo14464T()
            com.google.android.gms.measurement.internal.n3 r1 = com.google.android.gms.measurement.internal.C1727o3.f2473w
            r2 = 0
            java.lang.Object r1 = r1.mo14366a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.l9 r1 = r0.f2615i
            com.google.android.gms.measurement.internal.n4 r1 = r1.f2285j
            c0.e r2 = r20.mo14229c()
            long r2 = r2.mo11029a()
            r1.mo14369b(r2)
        L_0x01e5:
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo14694b(r3, r2)
            com.google.android.gms.measurement.internal.ca r1 = r0.f2611e
            m4628Q(r1)
            r1.mo14048n(r7)
            return
        L_0x01ff:
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.String r2 = "No network"
            r1.mo14693a(r2)
            com.google.android.gms.measurement.internal.k4 r1 = r20.mo14469Y()
            r1.mo14301b()
            com.google.android.gms.measurement.internal.ca r1 = r0.f2611e
            m4628Q(r1)
            r1.mo14047m()
            return
        L_0x021c:
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo14693a(r2)
            com.google.android.gms.measurement.internal.k4 r1 = r20.mo14469Y()
            r1.mo14302c()
            com.google.android.gms.measurement.internal.ca r1 = r0.f2611e
            m4628Q(r1)
            r1.mo14047m()
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo14228b()
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo14693a(r2)
            com.google.android.gms.measurement.internal.k4 r1 = r20.mo14469Y()
            r1.mo14302c()
            com.google.android.gms.measurement.internal.ca r1 = r0.f2611e
            m4628Q(r1)
            r1.mo14047m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.m4623L():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b76, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.C1621g.m4215i() + r8)) goto L_0x0b78;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0888 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x08ff A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0901 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0909 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0932 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b66 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0bed A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0c09 A[Catch:{ SQLiteException -> 0x0c21 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0c70 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0ca1 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d0d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0cfb=Splitter:B:420:0x0cfb} */
    @androidx.annotation.WorkerThread
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4624M(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.l r4 = r1.f2609c
            m4628Q(r4)
            r4.mo14334e0()
            com.google.android.gms.measurement.internal.oa r4 = new com.google.android.gms.measurement.internal.oa     // Catch:{ all -> 0x0d0d }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            r6 = 0
            long r9 = r1.f2632z     // Catch:{ all -> 0x0d0d }
            r7 = r43
            r11 = r4
            r5.mo14314G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r4.f2497c     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0cfb
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x002e
            goto L_0x0cfb
        L_0x002e:
            com.google.android.gms.internal.measurement.s4 r5 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g8 r5 = r5.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.r4 r5 = (com.google.android.gms.internal.measurement.C1282r4) r5     // Catch:{ all -> 0x0d0d }
            r5.mo13199v1()     // Catch:{ all -> 0x0d0d }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f2497c     // Catch:{ all -> 0x0d0d }
            int r12 = r12.size()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f2497c     // Catch:{ all -> 0x0d0d }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r3 = (com.google.android.gms.internal.measurement.C1122h4) r3     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g8 r3 = r3.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g4 r3 = (com.google.android.gms.internal.measurement.C1106g4) r3     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.f5 r12 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r2 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r20 = r9
            java.lang.String r9 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.mo14141F(r2, r9)     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.c4 r2 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.s4 r7 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r12 = r1.f2618l     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo14373D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r15 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo14617d(r15)     // Catch:{ all -> 0x0d0d }
            r2.mo14695c(r6, r7, r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.f5 r2 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r6 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo13311T1()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo14139D(r6)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.f5 r2 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r6 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo13311T1()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo14142G(r6)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.ya r21 = r41.mo14477g0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.xa r2 = r1.f2606E     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r6 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r23 = r6.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            r27 = 0
            r22 = r2
            r21.mo14645B(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d0d }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = com.google.android.gms.measurement.internal.C1693l6.m4466a(r18)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo12812K(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r12 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r12 = r12.mo14039v()     // Catch:{ all -> 0x0d0d }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo14693a(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r2 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo14031C()     // Catch:{ all -> 0x0d0d }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo12821t()     // Catch:{ all -> 0x0d0d }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.l4 r21 = r3.mo12817R(r2)     // Catch:{ all -> 0x0d0d }
            r22 = r8
            java.lang.String r8 = r21.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.l4 r8 = r3.mo12817R(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo12954F()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.l4 r12 = r3.mo12817R(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo12954F()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.c4 r8 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo14041x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo14693a(r12)     // Catch:{ all -> 0x0d0d }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.f5 r2 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r8 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.mo14140E(r8, r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.ta r12 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C0917i.m1415f(r12)     // Catch:{ all -> 0x0d0d }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d0d }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo12821t()     // Catch:{ all -> 0x0d0d }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.l4 r7 = r3.mo12817R(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.l4 r5 = r3.mo12817R(r10)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g8 r5 = r5.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r5 = (com.google.android.gms.internal.measurement.C1170k4) r5     // Catch:{ all -> 0x0d0d }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo12898K(r13)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r5 = r5.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r5 = (com.google.android.gms.internal.measurement.C1186l4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo12814M(r10, r5)     // Catch:{ all -> 0x0d0d }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.l4 r13 = r3.mo12817R(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.l4 r5 = r3.mo12817R(r10)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g8 r5 = r5.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r5 = (com.google.android.gms.internal.measurement.C1170k4) r5     // Catch:{ all -> 0x0d0d }
            r12 = 1
            r5.mo12898K(r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r5 = r5.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r5 = (com.google.android.gms.internal.measurement.C1186l4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo12814M(r10, r5)     // Catch:{ all -> 0x0d0d }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.c4 r10 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14039v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.n5 r13 = r1.f2618l     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.w3 r13 = r13.mo14373D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo14617d(r14)     // Catch:{ all -> 0x0d0d }
            r10.mo14694b(r11, r13)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r10 = com.google.android.gms.internal.measurement.C1186l4.m2202C()     // Catch:{ all -> 0x0d0d }
            r10.mo12899L(r8)     // Catch:{ all -> 0x0d0d }
            r13 = 1
            r10.mo12898K(r13)     // Catch:{ all -> 0x0d0d }
            r3.mo12825y(r10)     // Catch:{ all -> 0x0d0d }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.c4 r10 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14039v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.n5 r12 = r1.f2618l     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo14373D()     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo14617d(r13)     // Catch:{ all -> 0x0d0d }
            r10.mo14694b(r11, r12)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r10 = com.google.android.gms.internal.measurement.C1186l4.m2202C()     // Catch:{ all -> 0x0d0d }
            r10.mo12899L(r5)     // Catch:{ all -> 0x0d0d }
            r11 = 1
            r10.mo12898K(r11)     // Catch:{ all -> 0x0d0d }
            r3.mo12825y(r10)     // Catch:{ all -> 0x0d0d }
        L_0x02a8:
            com.google.android.gms.measurement.internal.l r10 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r10)     // Catch:{ all -> 0x0d0d }
            long r27 = r41.mo14461F()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r11 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r29 = r11.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.j r10 = r26.mo14324T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d0d }
            long r10 = r10.f2179e     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.g r12 = r41.mo14464T()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r13 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r13.mo13311T1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n3 r14 = com.google.android.gms.measurement.internal.C1727o3.f2457o     // Catch:{ all -> 0x0d0d }
            int r12 = r12.mo14174o(r13, r14)     // Catch:{ all -> 0x0d0d }
            long r12 = (long) r12     // Catch:{ all -> 0x0d0d }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02e2
            m4618G(r3, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r5 = com.google.android.gms.measurement.internal.C1854ya.m4832X(r5)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            long r27 = r41.mo14461F()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r10 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r29 = r10.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.j r5 = r26.mo14324T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d0d }
            long r10 = r5.f2177c     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.g r5 = r41.mo14464T()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r12 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo13311T1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n3 r13 = com.google.android.gms.measurement.internal.C1727o3.f2455n     // Catch:{ all -> 0x0d0d }
            int r5 = r5.mo14174o(r12, r13)     // Catch:{ all -> 0x0d0d }
            long r12 = (long) r5     // Catch:{ all -> 0x0d0d }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.c4 r5 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.s4 r11 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r11)     // Catch:{ all -> 0x0d0d }
            r5.mo14694b(r10, r11)     // Catch:{ all -> 0x0d0d }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo12821t()     // Catch:{ all -> 0x0d0d }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.l4 r13 = r3.mo12817R(r10)     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = r13.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d0d }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.g8 r5 = r13.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r5 = (com.google.android.gms.internal.measurement.C1170k4) r5     // Catch:{ all -> 0x0d0d }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo12811E(r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.g8 r5 = r5.clone()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k4 r5 = (com.google.android.gms.internal.measurement.C1170k4) r5     // Catch:{ all -> 0x0d0d }
            r5.mo12899L(r9)     // Catch:{ all -> 0x0d0d }
            r9 = 10
            r5.mo12898K(r9)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r5 = r5.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r5 = (com.google.android.gms.internal.measurement.C1186l4) r5     // Catch:{ all -> 0x0d0d }
            r3.mo12814M(r12, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.c4 r5 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.s4 r10 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = r10.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0d0d }
            r5.mo14694b(r9, r10)     // Catch:{ all -> 0x0d0d }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r3.mo12819U()     // Catch:{ all -> 0x0d0d }
            r2.<init>(r5)     // Catch:{ all -> 0x0d0d }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1186l4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1186l4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r5 = (com.google.android.gms.internal.measurement.C1186l4) r5     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo12958T()     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r5 = (com.google.android.gms.internal.measurement.C1186l4) r5     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo12956R()     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.c4 r2 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14041x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo14693a(r5)     // Catch:{ all -> 0x0d0d }
            r3.mo12811E(r9)     // Catch:{ all -> 0x0d0d }
            m4618G(r3, r8)     // Catch:{ all -> 0x0d0d }
            r2 = 18
            m4617E(r3, r2, r13)     // Catch:{ all -> 0x0d0d }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r2 = (com.google.android.gms.internal.measurement.C1186l4) r2     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r2.mo12954F()     // Catch:{ all -> 0x0d0d }
            int r10 = r2.length()     // Catch:{ all -> 0x0d0d }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d0d }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d0d }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d0d }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.c4 r2 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14041x()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo14693a(r10)     // Catch:{ all -> 0x0d0d }
            r3.mo12811E(r9)     // Catch:{ all -> 0x0d0d }
            m4618G(r3, r8)     // Catch:{ all -> 0x0d0d }
            r2 = 19
            m4617E(r3, r2, r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d0d }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.ta r2 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r2 = r3.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r2 = com.google.android.gms.measurement.internal.C1794ta.m4748n(r2, r6)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo12823w()     // Catch:{ all -> 0x0d0d }
            long r12 = r3.mo12823w()     // Catch:{ all -> 0x0d0d }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d0d }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.g8 r2 = r7.clone()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g4 r2 = (com.google.android.gms.internal.measurement.C1106g4) r2     // Catch:{ all -> 0x0d0d }
            boolean r6 = r1.m4626O(r3, r2)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.mo13167a0(r6, r2)     // Catch:{ all -> 0x0d0d }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo12818S()     // Catch:{ all -> 0x0d0d }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.ta r2 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r2 = r3.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ all -> 0x0d0d }
            r11 = r24
            com.google.android.gms.internal.measurement.l4 r2 = com.google.android.gms.measurement.internal.C1794ta.m4748n(r2, r11)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.mo12823w()     // Catch:{ all -> 0x0d0d }
            long r13 = r3.mo12823w()     // Catch:{ all -> 0x0d0d }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d0d }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.g8 r2 = r23.clone()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g4 r2 = (com.google.android.gms.internal.measurement.C1106g4) r2     // Catch:{ all -> 0x0d0d }
            boolean r7 = r1.m4626O(r2, r3)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.mo13167a0(r8, r2)     // Catch:{ all -> 0x0d0d }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f2497c     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r6 = r3.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r6 = (com.google.android.gms.internal.measurement.C1122h4) r6     // Catch:{ all -> 0x0d0d }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d0d }
            int r9 = r20 + 1
            r10.mo13187o1(r3)     // Catch:{ all -> 0x0d0d }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.h4 r12 = r10.mo13177i1(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r13 = r12.mo12854F()     // Catch:{ all -> 0x0d0d }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.ta r13 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r13)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r13 = com.google.android.gms.measurement.internal.C1794ta.m4748n(r12, r6)     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x056e
            r10.mo13194t(r5)     // Catch:{ all -> 0x0d0d }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.ta r13 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r13)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r12 = com.google.android.gms.measurement.internal.C1794ta.m4748n(r12, r11)     // Catch:{ all -> 0x0d0d }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo12958T()     // Catch:{ all -> 0x0d0d }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo12952A()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d0d }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d0d }
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d0d }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.m4622K(r10, r7, r5)     // Catch:{ all -> 0x0d0d }
            java.util.List r5 = r10.mo13170c1()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r11 = (com.google.android.gms.internal.measurement.C1122h4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo12854F()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r10.mo13165Y0()     // Catch:{ all -> 0x0d0d }
            r5.mo14338m(r6, r9)     // Catch:{ all -> 0x0d0d }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C1794ta.m4757w(r10, r5)     // Catch:{ all -> 0x0d0d }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.m4622K(r10, r7, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.C1794ta.m4757w(r10, r9)     // Catch:{ all -> 0x0d0d }
            if (r5 < 0) goto L_0x05fa
            r10.mo13197u(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r5 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.s4 r7 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r7)     // Catch:{ all -> 0x0d0d }
            r5.mo14694b(r6, r7)     // Catch:{ all -> 0x0d0d }
        L_0x05fa:
            com.google.android.gms.measurement.internal.ta r5 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r6 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14039v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo14693a(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.ra r6 = r5.f2045b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.f5 r6 = r6.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r10.mo13165Y0()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.mo14137B(r7)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.ra r6 = r5.f2045b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r6 = r6.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r10.mo13165Y0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.d6 r6 = r6.mo14322R(r7)     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo14063J()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.n5 r6 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.p r6 = r6.mo14370A()     // Catch:{ all -> 0x0d0d }
            boolean r6 = r6.mo14418s()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.n5 r6 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14034q()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo14693a(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.a5 r6 = com.google.android.gms.internal.measurement.C1027b5.m1714A()     // Catch:{ all -> 0x0d0d }
            r7 = r17
            r6.mo12517C(r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.p r5 = r5.mo14370A()     // Catch:{ all -> 0x0d0d }
            long r8 = r5.mo14414o()     // Catch:{ all -> 0x0d0d }
            r6.mo12518D(r8)     // Catch:{ all -> 0x0d0d }
            r8 = 1
            r6.mo12524y(r8)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r5 = r6.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.b5 r5 = (com.google.android.gms.internal.measurement.C1027b5) r5     // Catch:{ all -> 0x0d0d }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo13173e1()     // Catch:{ all -> 0x0d0d }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.b5 r8 = r10.mo13163X0(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r8.mo12570D()     // Catch:{ all -> 0x0d0d }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x068b
            r10.mo13159T0(r6, r5)     // Catch:{ all -> 0x0d0d }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo13190q1(r5)     // Catch:{ all -> 0x0d0d }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo13152O0(r5)     // Catch:{ all -> 0x0d0d }
            r5 = -9223372036854775808
            r10.mo13164Y(r5)     // Catch:{ all -> 0x0d0d }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo13185n0()     // Catch:{ all -> 0x0d0d }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.h4 r6 = r10.mo13177i1(r5)     // Catch:{ all -> 0x0d0d }
            long r7 = r6.mo12852A()     // Catch:{ all -> 0x0d0d }
            long r11 = r10.mo13175h1()     // Catch:{ all -> 0x0d0d }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06bc
            long r7 = r6.mo12852A()     // Catch:{ all -> 0x0d0d }
            r10.mo13152O0(r7)     // Catch:{ all -> 0x0d0d }
        L_0x06bc:
            long r7 = r6.mo12852A()     // Catch:{ all -> 0x0d0d }
            long r11 = r10.mo13174f1()     // Catch:{ all -> 0x0d0d }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06cf
            long r6 = r6.mo12852A()     // Catch:{ all -> 0x0d0d }
            r10.mo13164Y(r6)     // Catch:{ all -> 0x0d0d }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo13142D1()     // Catch:{ all -> 0x0d0d }
            r10.mo13193s1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.b r5 = r1.f2612f     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.String r21 = r10.mo13165Y0()     // Catch:{ all -> 0x0d0d }
            java.util.List r22 = r10.mo13170c1()     // Catch:{ all -> 0x0d0d }
            java.util.List r23 = r10.mo13171d1()     // Catch:{ all -> 0x0d0d }
            long r6 = r10.mo13175h1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            long r6 = r10.mo13174f1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            r20 = r5
            java.util.List r5 = r20.mo14019m(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d0d }
            r10.mo13179j1(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.g r5 = r41.mo14464T()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r6 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo13311T1()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.mo14167F(r6)     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0a49
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d0d }
            r5.<init>()     // Catch:{ all -> 0x0d0d }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d0d }
            r6.<init>()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.ya r7 = r41.mo14477g0()     // Catch:{ all -> 0x0d0d }
            java.security.SecureRandom r7 = r7.mo14683u()     // Catch:{ all -> 0x0d0d }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo13185n0()     // Catch:{ all -> 0x0d0d }
            if (r8 >= r9) goto L_0x0a0f
            com.google.android.gms.internal.measurement.h4 r9 = r10.mo13177i1(r8)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g8 r9 = r9.mo12916l()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.g4 r9 = (com.google.android.gms.internal.measurement.C1106g4) r9     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.ta r11 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r11)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r11 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r11 = (com.google.android.gms.internal.measurement.C1122h4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r11, r14)     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d0d }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r14 = (com.google.android.gms.measurement.internal.C1759r) r14     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.l r14 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r14)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r15 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r15 = r15.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r17 = com.google.android.gms.common.internal.C0917i.m1419j(r11)     // Catch:{ all -> 0x0d0d }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r14 = r14.mo14326V(r15, r2)     // Catch:{ all -> 0x0d0d }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d0d }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.f2554i     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.f2555j     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d0d }
            r17 = 1
            int r11 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.ta r2 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = r14.f2555j     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C1794ta.m4746P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
        L_0x079a:
            java.lang.Boolean r2 = r14.f2556k     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.ta r2 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C1794ta.m4746P(r9, r12, r11)     // Catch:{ all -> 0x0d0d }
        L_0x07b2:
            com.google.android.gms.internal.measurement.k8 r2 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
        L_0x07bb:
            r10.mo13167a0(r8, r9)     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a03
        L_0x07c8:
            com.google.android.gms.measurement.internal.f5 r2 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r3 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r3 = r3.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo14122e(r3, r11)     // Catch:{ all -> 0x0d0d }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo14695c(r14, r3, r11)     // Catch:{ all -> 0x0d0d }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.ya r11 = r41.mo14477g0()     // Catch:{ all -> 0x0d0d }
            long r14 = r9.mo12823w()     // Catch:{ all -> 0x0d0d }
            long r14 = r11.mo14681s0(r14, r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r11 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r11 = (com.google.android.gms.internal.measurement.C1122h4) r11     // Catch:{ all -> 0x0d0d }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d0d }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.mo12855G()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.l4 r11 = (com.google.android.gms.internal.measurement.C1186l4) r11     // Catch:{ all -> 0x0d0d }
            r22 = r3
            java.lang.String r3 = r11.mo12953E()     // Catch:{ all -> 0x0d0d }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d0d }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.mo12952A()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.f5 r2 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r3 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r3 = r3.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            int r2 = r2.mo14150r(r3, r11)     // Catch:{ all -> 0x0d0d }
        L_0x0866:
            if (r2 > 0) goto L_0x0888
            com.google.android.gms.measurement.internal.c4 r3 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            r3.mo14695c(r11, r12, r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r2 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
            goto L_0x07bb
        L_0x0888:
            java.lang.String r3 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r3 = (com.google.android.gms.measurement.internal.C1759r) r3     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x08e8
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r3)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r11 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = r11.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r3 = r3.mo14326V(r11, r12)     // Catch:{ all -> 0x0d0d }
            if (r3 != 0) goto L_0x08e8
            com.google.android.gms.measurement.internal.c4 r3 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.s4 r12 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = r12.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r22 = r14
            java.lang.String r14 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            r3.mo14695c(r11, r12, r14)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r11 = r4.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r25 = r11.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.String r26 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.mo12823w()     // Catch:{ all -> 0x0d0d }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d0d }
            goto L_0x08ea
        L_0x08e8:
            r22 = r14
        L_0x08ea:
            com.google.android.gms.measurement.internal.ta r11 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r11)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r11 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r11 = (com.google.android.gms.internal.measurement.C1122h4) r11     // Catch:{ all -> 0x0d0d }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r11, r12)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0901
            r12 = 1
            goto L_0x0902
        L_0x0901:
            r12 = 0
        L_0x0902:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d0d }
            r14 = 1
            if (r2 != r14) goto L_0x0932
            com.google.android.gms.internal.measurement.k8 r2 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ all -> 0x0d0d }
            r6.add(r2)     // Catch:{ all -> 0x0d0d }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07bb
            java.lang.Long r2 = r3.f2554i     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x0924
            java.lang.Long r2 = r3.f2555j     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x0924
            java.lang.Boolean r2 = r3.f2556k     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x07bb
        L_0x0924:
            r2 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo14442a(r2, r2, r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            goto L_0x07bb
        L_0x0932:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d0d }
            if (r14 != 0) goto L_0x0974
            com.google.android.gms.measurement.internal.ta r11 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r11)     // Catch:{ all -> 0x0d0d }
            long r14 = (long) r2     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C1794ta.m4746P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r11 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r11 = (com.google.android.gms.internal.measurement.C1122h4) r11     // Catch:{ all -> 0x0d0d }
            r6.add(r11)     // Catch:{ all -> 0x0d0d }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0959
            r11 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo14442a(r11, r2, r11)     // Catch:{ all -> 0x0d0d }
        L_0x0959:
            java.lang.String r2 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            long r11 = r9.mo12823w()     // Catch:{ all -> 0x0d0d }
            r14 = r22
            com.google.android.gms.measurement.internal.r r3 = r3.mo14443b(r11, r14)     // Catch:{ all -> 0x0d0d }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a00
        L_0x0974:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.f2553h     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0989
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x099f
        L_0x0989:
            com.google.android.gms.measurement.internal.ya r7 = r41.mo14477g0()     // Catch:{ all -> 0x0d0d }
            r25 = r10
            r23 = r11
            long r10 = r9.mo12822u()     // Catch:{ all -> 0x0d0d }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.mo14681s0(r10, r4)     // Catch:{ all -> 0x0d0d }
        L_0x099f:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09e8
            com.google.android.gms.measurement.internal.ta r4 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r4)     // Catch:{ all -> 0x0d0d }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d0d }
            r10 = r44
            com.google.android.gms.measurement.internal.C1794ta.m4746P(r9, r10, r7)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.ta r7 = r1.f2613g     // Catch:{ all -> 0x0d0d }
            m4628Q(r7)     // Catch:{ all -> 0x0d0d }
            long r10 = (long) r2     // Catch:{ all -> 0x0d0d }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.C1794ta.m4746P(r9, r13, r2)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r7 = r9.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.h4 r7 = (com.google.android.gms.internal.measurement.C1122h4) r7     // Catch:{ all -> 0x0d0d }
            r6.add(r7)     // Catch:{ all -> 0x0d0d }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x09d6
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r10 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo14442a(r10, r2, r7)     // Catch:{ all -> 0x0d0d }
        L_0x09d6:
            java.lang.String r2 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            long r10 = r9.mo12823w()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r3 = r3.mo14443b(r10, r14)     // Catch:{ all -> 0x0d0d }
            r7 = r26
        L_0x09e4:
            r7.put(r2, r3)     // Catch:{ all -> 0x0d0d }
            goto L_0x09fe
        L_0x09e8:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x09fe
            java.lang.String r2 = r9.mo12818S()     // Catch:{ all -> 0x0d0d }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.r r3 = r3.mo14442a(r11, r10, r10)     // Catch:{ all -> 0x0d0d }
            goto L_0x09e4
        L_0x09fe:
            r2 = r25
        L_0x0a00:
            r2.mo13167a0(r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0a03:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a0f:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d0d }
            int r4 = r2.mo13185n0()     // Catch:{ all -> 0x0d0d }
            if (r3 >= r4) goto L_0x0a23
            r2.mo13199v1()     // Catch:{ all -> 0x0d0d }
            r2.mo13180k1(r6)     // Catch:{ all -> 0x0d0d }
        L_0x0a23:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0a2b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r4 == 0) goto L_0x0a46
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d0d }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.r r4 = (com.google.android.gms.measurement.internal.C1759r) r4     // Catch:{ all -> 0x0d0d }
            r5.mo14342q(r4)     // Catch:{ all -> 0x0d0d }
            goto L_0x0a2b
        L_0x0a46:
            r3 = r24
            goto L_0x0a4b
        L_0x0a49:
            r2 = r10
            r3 = r4
        L_0x0a4b:
            com.google.android.gms.internal.measurement.s4 r4 = r3.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r4 = r4.mo13311T1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.d6 r5 = r5.mo14322R(r4)     // Catch:{ all -> 0x0d0d }
            if (r5 != 0) goto L_0x0a74
            com.google.android.gms.measurement.internal.c4 r5 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.s4 r7 = r3.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = r7.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r7)     // Catch:{ all -> 0x0d0d }
            r5.mo14694b(r6, r7)     // Catch:{ all -> 0x0d0d }
            goto L_0x0ad0
        L_0x0a74:
            int r6 = r2.mo13185n0()     // Catch:{ all -> 0x0d0d }
            if (r6 <= 0) goto L_0x0ad0
            long r6 = r5.mo14078Y()     // Catch:{ all -> 0x0d0d }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a88
            r2.mo13195t0(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0a8b
        L_0x0a88:
            r2.mo13206z1()     // Catch:{ all -> 0x0d0d }
        L_0x0a8b:
            long r8 = r5.mo14081a0()     // Catch:{ all -> 0x0d0d }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a96
            goto L_0x0a97
        L_0x0a96:
            r6 = r8
        L_0x0a97:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0a9f
            r2.mo13136B0(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0aa2
        L_0x0a9f:
            r2.mo13135A1()     // Catch:{ all -> 0x0d0d }
        L_0x0aa2:
            r5.mo14088e()     // Catch:{ all -> 0x0d0d }
            long r6 = r5.mo14079Z()     // Catch:{ all -> 0x0d0d }
            int r7 = (int) r6     // Catch:{ all -> 0x0d0d }
            r2.mo13149L(r7)     // Catch:{ all -> 0x0d0d }
            long r6 = r2.mo13175h1()     // Catch:{ all -> 0x0d0d }
            r5.mo14057D(r6)     // Catch:{ all -> 0x0d0d }
            long r6 = r2.mo13174f1()     // Catch:{ all -> 0x0d0d }
            r5.mo14055B(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r5.mo14087d0()     // Catch:{ all -> 0x0d0d }
            if (r6 == 0) goto L_0x0ac5
            r2.mo13178j0(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0ac8
        L_0x0ac5:
            r2.mo13201w1()     // Catch:{ all -> 0x0d0d }
        L_0x0ac8:
            com.google.android.gms.measurement.internal.l r6 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r6)     // Catch:{ all -> 0x0d0d }
            r6.mo14341p(r5)     // Catch:{ all -> 0x0d0d }
        L_0x0ad0:
            int r5 = r2.mo13185n0()     // Catch:{ all -> 0x0d0d }
            if (r5 <= 0) goto L_0x0c52
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2618l     // Catch:{ all -> 0x0d0d }
            r5.mo14230d()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r6 = r3.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = r6.mo13311T1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.t3 r5 = r5.mo14151t(r6)     // Catch:{ all -> 0x0d0d }
            r6 = -1
            if (r5 == 0) goto L_0x0afd
            boolean r8 = r5.mo13378P()     // Catch:{ all -> 0x0d0d }
            if (r8 != 0) goto L_0x0af5
            goto L_0x0afd
        L_0x0af5:
            long r8 = r5.mo13381z()     // Catch:{ all -> 0x0d0d }
            r2.mo13151O(r8)     // Catch:{ all -> 0x0d0d }
            goto L_0x0b24
        L_0x0afd:
            com.google.android.gms.internal.measurement.s4 r5 = r3.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = r5.mo13288E()     // Catch:{ all -> 0x0d0d }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d0d }
            if (r5 == 0) goto L_0x0b0d
            r2.mo13151O(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0b24
        L_0x0b0d:
            com.google.android.gms.measurement.internal.c4 r5 = r41.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.s4 r9 = r3.f2495a     // Catch:{ all -> 0x0d0d }
            java.lang.String r9 = r9.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r9)     // Catch:{ all -> 0x0d0d }
            r5.mo14694b(r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0b24:
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r5)     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.k8 r2 = r2.mo12838q()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.internal.measurement.s4 r2 = (com.google.android.gms.internal.measurement.C1298s4) r2     // Catch:{ all -> 0x0d0d }
            r5.mo14009h()     // Catch:{ all -> 0x0d0d }
            r5.mo14128i()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C0917i.m1419j(r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C0917i.m1415f(r8)     // Catch:{ all -> 0x0d0d }
            boolean r8 = r2.mo13322l1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C0917i.m1423n(r8)     // Catch:{ all -> 0x0d0d }
            r5.mo14337h0()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r8 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            c0.e r8 = r8.mo14229c()     // Catch:{ all -> 0x0d0d }
            long r8 = r8.mo11029a()     // Catch:{ all -> 0x0d0d }
            long r10 = r2.mo13295H1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r12 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            r12.mo14402z()     // Catch:{ all -> 0x0d0d }
            long r12 = com.google.android.gms.measurement.internal.C1621g.m4215i()     // Catch:{ all -> 0x0d0d }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b78
            long r10 = r2.mo13295H1()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.n5 r12 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            r12.mo14402z()     // Catch:{ all -> 0x0d0d }
            long r12 = com.google.android.gms.measurement.internal.C1621g.m4215i()     // Catch:{ all -> 0x0d0d }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0b9b
        L_0x0b78:
            com.google.android.gms.measurement.internal.n5 r10 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r10 = r10.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14040w()     // Catch:{ all -> 0x0d0d }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r12)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d0d }
            long r13 = r2.mo13295H1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d0d }
            r10.mo14696d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d0d }
        L_0x0b9b:
            byte[] r8 = r2.mo13507j()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.ra r9 = r5.f2045b     // Catch:{ IOException -> 0x0c3b }
            com.google.android.gms.measurement.internal.ta r9 = r9.f2613g     // Catch:{ IOException -> 0x0c3b }
            m4628Q(r9)     // Catch:{ IOException -> 0x0c3b }
            byte[] r8 = r9.mo14587O(r8)     // Catch:{ IOException -> 0x0c3b }
            com.google.android.gms.measurement.internal.n5 r9 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14039v()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d0d }
            r9.mo14694b(r10, r11)     // Catch:{ all -> 0x0d0d }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d0d }
            r9.<init>()     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo13295H1()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d0d }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d0d }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d0d }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d0d }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d0d }
            boolean r8 = r2.mo13328r1()     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x0bfa
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo13282A1()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d0d }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d0d }
        L_0x0bfa:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo14320P()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c21 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c52
            com.google.android.gms.measurement.internal.n5 r6 = r5.f2143a     // Catch:{ SQLiteException -> 0x0c21 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo14228b()     // Catch:{ SQLiteException -> 0x0c21 }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14035r()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo13311T1()     // Catch:{ SQLiteException -> 0x0c21 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r8)     // Catch:{ SQLiteException -> 0x0c21 }
            r6.mo14694b(r7, r8)     // Catch:{ SQLiteException -> 0x0c21 }
            goto L_0x0c52
        L_0x0c21:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r2)     // Catch:{ all -> 0x0d0d }
        L_0x0c37:
            r5.mo14695c(r7, r2, r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0c52
        L_0x0c3b:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo13311T1()     // Catch:{ all -> 0x0d0d }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r2)     // Catch:{ all -> 0x0d0d }
            goto L_0x0c37
        L_0x0c52:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            java.util.List r3 = r3.f2496b     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.common.internal.C0917i.m1419j(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo14009h()     // Catch:{ all -> 0x0d0d }
            r2.mo14128i()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d0d }
            r6 = 0
        L_0x0c6a:
            int r7 = r3.size()     // Catch:{ all -> 0x0d0d }
            if (r6 >= r7) goto L_0x0c87
            if (r6 == 0) goto L_0x0c77
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d0d }
        L_0x0c77:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d0d }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d0d }
            r5.append(r7)     // Catch:{ all -> 0x0d0d }
            int r6 = r6 + 1
            goto L_0x0c6a
        L_0x0c87:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d0d }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo14320P()     // Catch:{ all -> 0x0d0d }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d0d }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d0d }
            int r6 = r3.size()     // Catch:{ all -> 0x0d0d }
            if (r5 == r6) goto L_0x0cbc
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d0d }
            int r3 = r3.size()     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d0d }
            r2.mo14695c(r6, r5, r3)     // Catch:{ all -> 0x0d0d }
        L_0x0cbc:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo14320P()     // Catch:{ all -> 0x0d0d }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cd4 }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cd4 }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cd4 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cd4 }
            goto L_0x0ce9
        L_0x0cd4:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0d0d }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r4)     // Catch:{ all -> 0x0d0d }
            r2.mo14695c(r5, r4, r3)     // Catch:{ all -> 0x0d0d }
        L_0x0ce9:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            r2.mo14340o()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            r2 = 1
            return r2
        L_0x0cfb:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0d0d }
            m4628Q(r2)     // Catch:{ all -> 0x0d0d }
            r2.mo14340o()     // Catch:{ all -> 0x0d0d }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            r2 = 0
            return r2
        L_0x0d0d:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c
            m4628Q(r3)
            r3.mo14335f0()
            goto L_0x0d19
        L_0x0d18:
            throw r2
        L_0x0d19:
            goto L_0x0d18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.m4624M(java.lang.String, long):boolean");
    }

    /* renamed from: N */
    private final boolean m4625N() {
        mo14227a().mo14009h();
        mo14476g();
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        if (lVar.mo14343r()) {
            return true;
        }
        C1686l lVar2 = this.f2609c;
        m4628Q(lVar2);
        return !TextUtils.isEmpty(lVar2.mo14329Z());
    }

    /* renamed from: O */
    private final boolean m4626O(C1106g4 g4Var, C1106g4 g4Var2) {
        C0917i.m1410a("_e".equals(g4Var.mo12818S()));
        m4628Q(this.f2613g);
        C1186l4 n = C1794ta.m4748n((C1122h4) g4Var.mo12838q(), "_sc");
        String str = null;
        String F = n == null ? null : n.mo12954F();
        m4628Q(this.f2613g);
        C1186l4 n2 = C1794ta.m4748n((C1122h4) g4Var2.mo12838q(), "_pc");
        if (n2 != null) {
            str = n2.mo12954F();
        }
        if (str == null || !str.equals(F)) {
            return false;
        }
        C0917i.m1410a("_e".equals(g4Var.mo12818S()));
        m4628Q(this.f2613g);
        C1186l4 n3 = C1794ta.m4748n((C1122h4) g4Var.mo12838q(), "_et");
        if (n3 == null || !n3.mo12958T() || n3.mo12952A() <= 0) {
            return true;
        }
        long A = n3.mo12952A();
        m4628Q(this.f2613g);
        C1186l4 n4 = C1794ta.m4748n((C1122h4) g4Var2.mo12838q(), "_et");
        if (n4 != null && n4.mo12952A() > 0) {
            A += n4.mo12952A();
        }
        m4628Q(this.f2613g);
        C1794ta.m4746P(g4Var2, "_et", Long.valueOf(A));
        m4628Q(this.f2613g);
        C1794ta.m4746P(g4Var, "_fr", 1L);
        return true;
    }

    /* renamed from: P */
    private static final boolean m4627P(zzq zzq) {
        return !TextUtils.isEmpty(zzq.f2867b) || !TextUtils.isEmpty(zzq.f2882q);
    }

    /* renamed from: Q */
    private static final C1606ea m4628Q(C1606ea eaVar) {
        if (eaVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (eaVar.mo14130k()) {
            return eaVar;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(eaVar.getClass())));
        }
    }

    /* renamed from: e0 */
    public static C1770ra m4630e0(Context context) {
        C0917i.m1419j(context);
        C0917i.m1419j(context.getApplicationContext());
        if (f2601F == null) {
            synchronized (C1770ra.class) {
                if (f2601F == null) {
                    f2601F = new C1770ra((C1782sa) C0917i.m1419j(new C1782sa(context)), (C1717n5) null);
                }
            }
        }
        return f2601F;
    }

    /* renamed from: j0 */
    static /* bridge */ /* synthetic */ void m4631j0(C1770ra raVar, C1782sa saVar) {
        raVar.mo14227a().mo14009h();
        raVar.f2617k = new C1800u4(raVar);
        C1686l lVar = new C1686l(raVar);
        lVar.mo14129j();
        raVar.f2609c = lVar;
        raVar.mo14464T().mo14185z((C1608f) C0917i.m1419j(raVar.f2607a));
        C1696l9 l9Var = new C1696l9(raVar);
        l9Var.mo14129j();
        raVar.f2615i = l9Var;
        C1556b bVar = new C1556b(raVar);
        bVar.mo14129j();
        raVar.f2612f = bVar;
        C1851y7 y7Var = new C1851y7(raVar);
        y7Var.mo14129j();
        raVar.f2614h = y7Var;
        C1580ca caVar = new C1580ca(raVar);
        caVar.mo14129j();
        raVar.f2611e = caVar;
        raVar.f2610d = new C1678k4(raVar);
        if (raVar.f2623q != raVar.f2624r) {
            raVar.mo14228b().mo14035r().mo14695c("Not all upload components initialized", Integer.valueOf(raVar.f2623q), Integer.valueOf(raVar.f2624r));
        }
        raVar.f2619m = true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final void mo14457A(zzlo zzlo, zzq zzq) {
        C1686l lVar;
        String str;
        long j;
        zzlo zzlo2 = zzlo;
        zzq zzq2 = zzq;
        mo14227a().mo14009h();
        mo14476g();
        if (m4627P(zzq)) {
            if (!zzq2.f2873h) {
                mo14462R(zzq2);
                return;
            }
            int n0 = mo14477g0().mo14672n0(zzlo2.f2860b);
            if (n0 != 0) {
                C1854ya g0 = mo14477g0();
                String str2 = zzlo2.f2860b;
                mo14464T();
                String r = g0.mo14678r(str2, 24, true);
                String str3 = zzlo2.f2860b;
                mo14477g0().mo14645B(this.f2606E, zzq2.f2866a, n0, "_ev", r, str3 != null ? str3.length() : 0);
                return;
            }
            int j0 = mo14477g0().mo14668j0(zzlo2.f2860b, zzlo.mo14714V());
            if (j0 != 0) {
                C1854ya g02 = mo14477g0();
                String str4 = zzlo2.f2860b;
                mo14464T();
                String r2 = g02.mo14678r(str4, 24, true);
                Object V = zzlo.mo14714V();
                mo14477g0().mo14645B(this.f2606E, zzq2.f2866a, j0, "_ev", r2, (V == null || (!(V instanceof String) && !(V instanceof CharSequence))) ? 0 : V.toString().length());
                return;
            }
            Object p = mo14477g0().mo14675p(zzlo2.f2860b, zzlo.mo14714V());
            if (p != null) {
                if ("_sid".equals(zzlo2.f2860b)) {
                    long j2 = zzlo2.f2861c;
                    String str5 = zzlo2.f2864f;
                    String str6 = (String) C0917i.m1419j(zzq2.f2866a);
                    C1686l lVar2 = this.f2609c;
                    m4628Q(lVar2);
                    C1818va X = lVar2.mo14327X(str6, "_sno");
                    if (X != null) {
                        Object obj = X.f2734e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo14457A(new zzlo("_sno", j2, Long.valueOf(j + 1), str5), zzq2);
                        }
                    }
                    if (X != null) {
                        mo14228b().mo14040w().mo14694b("Retrieved last session number from database does not contain a valid (long) value", X.f2734e);
                    }
                    C1686l lVar3 = this.f2609c;
                    m4628Q(lVar3);
                    C1759r V2 = lVar3.mo14326V(str6, "_s");
                    if (V2 != null) {
                        j = V2.f2548c;
                        mo14228b().mo14039v().mo14694b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo14457A(new zzlo("_sno", j2, Long.valueOf(j + 1), str5), zzq2);
                }
                C1818va vaVar = new C1818va((String) C0917i.m1419j(zzq2.f2866a), (String) C0917i.m1419j(zzlo2.f2864f), zzlo2.f2860b, zzlo2.f2861c, p);
                mo14228b().mo14039v().mo14695c("Setting user property", this.f2618l.mo14373D().mo14619f(vaVar.f2732c), p);
                C1686l lVar4 = this.f2609c;
                m4628Q(lVar4);
                lVar4.mo14334e0();
                try {
                    C1081eb.m1900b();
                    if (this.f2618l.mo14402z().mo14163B((String) null, C1727o3.f2452l0) && "_id".equals(vaVar.f2732c)) {
                        if (this.f2618l.mo14402z().mo14163B((String) null, C1727o3.f2458o0)) {
                            C1686l lVar5 = this.f2609c;
                            m4628Q(lVar5);
                            C1818va X2 = lVar5.mo14327X(zzq2.f2866a, "_id");
                            if (X2 != null && !vaVar.f2734e.equals(X2.f2734e)) {
                                lVar = this.f2609c;
                                m4628Q(lVar);
                                str = zzq2.f2866a;
                            }
                        } else {
                            lVar = this.f2609c;
                            m4628Q(lVar);
                            str = zzq2.f2866a;
                        }
                        lVar.mo14338m(str, "_lair");
                    }
                    mo14462R(zzq2);
                    C1686l lVar6 = this.f2609c;
                    m4628Q(lVar6);
                    boolean x = lVar6.mo14349x(vaVar);
                    C1686l lVar7 = this.f2609c;
                    m4628Q(lVar7);
                    lVar7.mo14340o();
                    if (!x) {
                        mo14228b().mo14035r().mo14695c("Too many unique user properties are set. Ignoring user property", this.f2618l.mo14373D().mo14619f(vaVar.f2732c), vaVar.f2734e);
                        mo14477g0().mo14645B(this.f2606E, zzq2.f2866a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    C1686l lVar8 = this.f2609c;
                    m4628Q(lVar8);
                    lVar8.mo14335f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:262|263) */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x026e, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        mo14228b().mo14035r().mo14695c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C1574c4.m4083z(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0612, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0613, code lost:
        r2 = r0;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0682, code lost:
        if (r12 != null) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06a9, code lost:
        r2 = r0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        if (r11 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:132:0x026b, B:143:0x0281] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:262:0x05ff */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029a A[SYNTHETIC, Splitter:B:146:0x029a] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a3 A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x049d A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04ad A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04bc A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0591 A[Catch:{ MalformedURLException -> 0x05ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x059f A[Catch:{ MalformedURLException -> 0x05ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0617 A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x068c A[Catch:{ all -> 0x0612, all -> 0x06a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06a4 A[SYNTHETIC, Splitter:B:303:0x06a4] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04d2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123 A[Catch:{ all -> 0x011e, all -> 0x06ac }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:143:0x0281=Splitter:B:143:0x0281, B:293:0x0686=Splitter:B:293:0x0686, B:132:0x026b=Splitter:B:132:0x026b, B:276:0x065c=Splitter:B:276:0x065c, B:262:0x05ff=Splitter:B:262:0x05ff} */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14458B() {
        /*
            r26 = this;
            r1 = r26
            com.google.android.gms.measurement.internal.k5 r2 = r26.mo14227a()
            r2.mo14009h()
            r26.mo14476g()
            r2 = 1
            r1.f2627u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.n5 r4 = r1.f2618l     // Catch:{ all -> 0x06ac }
            r4.mo14230d()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.n5 r4 = r1.f2618l     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.j9 r4 = r4.mo14380L()     // Catch:{ all -> 0x06ac }
            java.lang.Boolean r4 = r4.mo14270J()     // Catch:{ all -> 0x06ac }
            if (r4 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()     // Catch:{ all -> 0x06ac }
            java.lang.String r4 = "Upload data called on the client side before use of service was decided"
        L_0x002b:
            r2.mo14693a(r4)     // Catch:{ all -> 0x06ac }
        L_0x002e:
            r1.f2627u = r3
        L_0x0030:
            r26.m4621J()
            return
        L_0x0034:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x06ac }
            if (r4 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x06ac }
            java.lang.String r4 = "Upload called in the client side when service should be used"
            goto L_0x002b
        L_0x0045:
            long r4 = r1.f2621o     // Catch:{ all -> 0x06ac }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0051
        L_0x004d:
            r26.m4623L()     // Catch:{ all -> 0x06ac }
            goto L_0x002e
        L_0x0051:
            com.google.android.gms.measurement.internal.k5 r4 = r26.mo14227a()     // Catch:{ all -> 0x06ac }
            r4.mo14009h()     // Catch:{ all -> 0x06ac }
            java.util.List r4 = r1.f2630x     // Catch:{ all -> 0x06ac }
            if (r4 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()     // Catch:{ all -> 0x06ac }
            java.lang.String r4 = "Uploading requested multiple times"
            goto L_0x002b
        L_0x0067:
            com.google.android.gms.measurement.internal.i4 r4 = r1.f2608b     // Catch:{ all -> 0x06ac }
            m4628Q(r4)     // Catch:{ all -> 0x06ac }
            boolean r4 = r4.mo14237m()     // Catch:{ all -> 0x06ac }
            if (r4 != 0) goto L_0x0080
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()     // Catch:{ all -> 0x06ac }
            java.lang.String r4 = "Network not connected, ignoring upload request"
            r2.mo14693a(r4)     // Catch:{ all -> 0x06ac }
            goto L_0x004d
        L_0x0080:
            c0.e r4 = r26.mo14229c()     // Catch:{ all -> 0x06ac }
            long r4 = r4.mo11029a()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.g r8 = r26.mo14464T()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2419Q     // Catch:{ all -> 0x06ac }
            r10 = 0
            int r8 = r8.mo14174o(r10, r9)     // Catch:{ all -> 0x06ac }
            r26.mo14464T()     // Catch:{ all -> 0x06ac }
            long r11 = com.google.android.gms.measurement.internal.C1621g.m4214I()     // Catch:{ all -> 0x06ac }
            long r11 = r4 - r11
            r9 = 0
        L_0x009d:
            if (r9 >= r8) goto L_0x00a8
            boolean r13 = r1.m4624M(r10, r11)     // Catch:{ all -> 0x06ac }
            if (r13 == 0) goto L_0x00a8
            int r9 = r9 + 1
            goto L_0x009d
        L_0x00a8:
            com.google.android.gms.measurement.internal.l9 r8 = r1.f2615i     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.n4 r8 = r8.f2285j     // Catch:{ all -> 0x06ac }
            long r8 = r8.mo14368a()     // Catch:{ all -> 0x06ac }
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.c4 r6 = r26.mo14228b()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo14034q()     // Catch:{ all -> 0x06ac }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r4 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x06ac }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x06ac }
            r6.mo14694b(r7, r8)     // Catch:{ all -> 0x06ac }
        L_0x00cb:
            com.google.android.gms.measurement.internal.l r6 = r1.f2609c     // Catch:{ all -> 0x06ac }
            m4628Q(r6)     // Catch:{ all -> 0x06ac }
            java.lang.String r6 = r6.mo14329Z()     // Catch:{ all -> 0x06ac }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06ac }
            r8 = -1
            if (r7 != 0) goto L_0x061b
            long r11 = r1.f2632z     // Catch:{ all -> 0x06ac }
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0127
            com.google.android.gms.measurement.internal.l r7 = r1.f2609c     // Catch:{ all -> 0x06ac }
            m4628Q(r7)     // Catch:{ all -> 0x06ac }
            android.database.sqlite.SQLiteDatabase r11 = r7.mo14320P()     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r11.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x0106, all -> 0x0103 }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r12 != 0) goto L_0x00fb
        L_0x00f7:
            r11.close()     // Catch:{ all -> 0x06ac }
            goto L_0x011b
        L_0x00fb:
            long r8 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f7
        L_0x0100:
            r0 = move-exception
            r12 = r0
            goto L_0x0109
        L_0x0103:
            r0 = move-exception
            r2 = r0
            goto L_0x0121
        L_0x0106:
            r0 = move-exception
            r12 = r0
            r11 = r10
        L_0x0109:
            com.google.android.gms.measurement.internal.n5 r7 = r7.f2143a     // Catch:{ all -> 0x011e }
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo14228b()     // Catch:{ all -> 0x011e }
            com.google.android.gms.measurement.internal.z3 r7 = r7.mo14035r()     // Catch:{ all -> 0x011e }
            java.lang.String r13 = "Error querying raw events"
            r7.mo14694b(r13, r12)     // Catch:{ all -> 0x011e }
            if (r11 == 0) goto L_0x011b
            goto L_0x00f7
        L_0x011b:
            r1.f2632z = r8     // Catch:{ all -> 0x06ac }
            goto L_0x0127
        L_0x011e:
            r0 = move-exception
            r2 = r0
            r10 = r11
        L_0x0121:
            if (r10 == 0) goto L_0x0126
            r10.close()     // Catch:{ all -> 0x06ac }
        L_0x0126:
            throw r2     // Catch:{ all -> 0x06ac }
        L_0x0127:
            com.google.android.gms.measurement.internal.g r7 = r26.mo14464T()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.n3 r8 = com.google.android.gms.measurement.internal.C1727o3.f2441g     // Catch:{ all -> 0x06ac }
            int r7 = r7.mo14174o(r6, r8)     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.g r8 = r26.mo14464T()     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2443h     // Catch:{ all -> 0x06ac }
            int r8 = r8.mo14174o(r6, r9)     // Catch:{ all -> 0x06ac }
            int r8 = java.lang.Math.max(r3, r8)     // Catch:{ all -> 0x06ac }
            com.google.android.gms.measurement.internal.l r9 = r1.f2609c     // Catch:{ all -> 0x06ac }
            m4628Q(r9)     // Catch:{ all -> 0x06ac }
            r9.mo14009h()     // Catch:{ all -> 0x06ac }
            r9.mo14128i()     // Catch:{ all -> 0x06ac }
            if (r7 <= 0) goto L_0x014e
            r11 = 1
            goto L_0x014f
        L_0x014e:
            r11 = 0
        L_0x014f:
            com.google.android.gms.common.internal.C0917i.m1410a(r11)     // Catch:{ all -> 0x06ac }
            if (r8 <= 0) goto L_0x0156
            r11 = 1
            goto L_0x0157
        L_0x0156:
            r11 = 0
        L_0x0157:
            com.google.android.gms.common.internal.C0917i.m1410a(r11)     // Catch:{ all -> 0x06ac }
            com.google.android.gms.common.internal.C0917i.m1415f(r6)     // Catch:{ all -> 0x06ac }
            android.database.sqlite.SQLiteDatabase r12 = r9.mo14320P()     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r14 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            java.lang.String r13 = "queue"
            java.lang.String r16 = "app_id=?"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            r7 = r15
            r15 = r16
            r16 = r7
            android.database.Cursor r7 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x027c, all -> 0x0277 }
            boolean r12 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0272 }
            if (r12 != 0) goto L_0x019d
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0197 }
            r7.close()     // Catch:{ all -> 0x06ac }
            r20 = r4
            goto L_0x029d
        L_0x0197:
            r0 = move-exception
            r2 = r0
            r20 = r4
            goto L_0x0281
        L_0x019d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0272 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0272 }
            r13 = 0
        L_0x01a3:
            long r14 = r7.getLong(r3)     // Catch:{ SQLiteException -> 0x0272 }
            byte[] r10 = r7.getBlob(r2)     // Catch:{ IOException -> 0x0246 }
            com.google.android.gms.measurement.internal.ra r2 = r9.f2045b     // Catch:{ IOException -> 0x0246 }
            com.google.android.gms.measurement.internal.ta r2 = r2.f2613g     // Catch:{ IOException -> 0x0246 }
            m4628Q(r2)     // Catch:{ IOException -> 0x0246 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0230 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x0230 }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0230 }
            r10.<init>(r3)     // Catch:{ IOException -> 0x0230 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0230 }
            r11.<init>()     // Catch:{ IOException -> 0x0230 }
            r20 = r4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x022e }
        L_0x01c7:
            int r5 = r10.read(r4)     // Catch:{ IOException -> 0x022e }
            if (r5 > 0) goto L_0x0225
            r10.close()     // Catch:{ IOException -> 0x022e }
            r3.close()     // Catch:{ IOException -> 0x022e }
            byte[] r2 = r11.toByteArray()     // Catch:{ IOException -> 0x022e }
            boolean r3 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0270 }
            if (r3 != 0) goto L_0x01e3
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x0270 }
            int r3 = r3 + r13
            if (r3 <= r8) goto L_0x01e3
            goto L_0x026b
        L_0x01e3:
            com.google.android.gms.internal.measurement.r4 r3 = com.google.android.gms.internal.measurement.C1298s4.m2790P1()     // Catch:{ IOException -> 0x020f }
            com.google.android.gms.internal.measurement.k9 r3 = com.google.android.gms.measurement.internal.C1794ta.m4742C(r3, r2)     // Catch:{ IOException -> 0x020f }
            com.google.android.gms.internal.measurement.r4 r3 = (com.google.android.gms.internal.measurement.C1282r4) r3     // Catch:{ IOException -> 0x020f }
            r4 = 2
            boolean r5 = r7.isNull(r4)     // Catch:{ SQLiteException -> 0x0270 }
            if (r5 != 0) goto L_0x01fb
            int r5 = r7.getInt(r4)     // Catch:{ SQLiteException -> 0x0270 }
            r3.mo13145G0(r5)     // Catch:{ SQLiteException -> 0x0270 }
        L_0x01fb:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x0270 }
            int r13 = r13 + r2
            com.google.android.gms.internal.measurement.k8 r2 = r3.mo12838q()     // Catch:{ SQLiteException -> 0x0270 }
            com.google.android.gms.internal.measurement.s4 r2 = (com.google.android.gms.internal.measurement.C1298s4) r2     // Catch:{ SQLiteException -> 0x0270 }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0270 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0270 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0270 }
            goto L_0x025b
        L_0x020f:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ SQLiteException -> 0x0270 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0270 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x0270 }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ SQLiteException -> 0x0270 }
        L_0x0221:
            r3.mo14695c(r4, r5, r2)     // Catch:{ SQLiteException -> 0x0270 }
            goto L_0x025b
        L_0x0225:
            r22 = r3
            r3 = 0
            r11.write(r4, r3, r5)     // Catch:{ IOException -> 0x022e }
            r3 = r22
            goto L_0x01c7
        L_0x022e:
            r0 = move-exception
            goto L_0x0233
        L_0x0230:
            r0 = move-exception
            r20 = r4
        L_0x0233:
            r3 = r0
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ IOException -> 0x0244 }
            java.lang.String r4 = "Failed to ungzip content"
            r2.mo14694b(r4, r3)     // Catch:{ IOException -> 0x0244 }
            throw r3     // Catch:{ IOException -> 0x0244 }
        L_0x0244:
            r0 = move-exception
            goto L_0x0249
        L_0x0246:
            r0 = move-exception
            r20 = r4
        L_0x0249:
            r2 = r0
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ SQLiteException -> 0x0270 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0270 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x0270 }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ SQLiteException -> 0x0270 }
            goto L_0x0221
        L_0x025b:
            boolean r2 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x0270 }
            if (r2 == 0) goto L_0x026b
            if (r13 <= r8) goto L_0x0264
            goto L_0x026b
        L_0x0264:
            r4 = r20
            r2 = 1
            r3 = 0
            r10 = 0
            goto L_0x01a3
        L_0x026b:
            r7.close()     // Catch:{ all -> 0x06a8 }
            r8 = r12
            goto L_0x029d
        L_0x0270:
            r0 = move-exception
            goto L_0x0275
        L_0x0272:
            r0 = move-exception
            r20 = r4
        L_0x0275:
            r2 = r0
            goto L_0x0281
        L_0x0277:
            r0 = move-exception
            r2 = r0
            r10 = 0
            goto L_0x0615
        L_0x027c:
            r0 = move-exception
            r20 = r4
            r2 = r0
            r7 = 0
        L_0x0281:
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ all -> 0x0612 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x0612 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x0612 }
            java.lang.String r4 = "Error querying bundles. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ all -> 0x0612 }
            r3.mo14695c(r4, r5, r2)     // Catch:{ all -> 0x0612 }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0612 }
            if (r7 == 0) goto L_0x029d
            r7.close()     // Catch:{ all -> 0x06a8 }
        L_0x029d:
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x06a8 }
            if (r2 != 0) goto L_0x069a
            com.google.android.gms.measurement.internal.h r2 = r1.mo14465U(r6)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.zzah r3 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06a8 }
            boolean r2 = r2.mo14221i(r3)     // Catch:{ all -> 0x06a8 }
            if (r2 == 0) goto L_0x0304
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x06a8 }
        L_0x02b3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x06a8 }
            if (r3 == 0) goto L_0x02d2
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x06a8 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x06a8 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.s4 r3 = (com.google.android.gms.internal.measurement.C1298s4) r3     // Catch:{ all -> 0x06a8 }
            java.lang.String r4 = r3.mo13296I()     // Catch:{ all -> 0x06a8 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x06a8 }
            if (r4 != 0) goto L_0x02b3
            java.lang.String r2 = r3.mo13296I()     // Catch:{ all -> 0x06a8 }
            goto L_0x02d3
        L_0x02d2:
            r2 = 0
        L_0x02d3:
            if (r2 == 0) goto L_0x0304
            r3 = 0
        L_0x02d6:
            int r4 = r8.size()     // Catch:{ all -> 0x06a8 }
            if (r3 >= r4) goto L_0x0304
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x06a8 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x06a8 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.s4 r4 = (com.google.android.gms.internal.measurement.C1298s4) r4     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r4.mo13296I()     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x02f1
            goto L_0x0301
        L_0x02f1:
            java.lang.String r4 = r4.mo13296I()     // Catch:{ all -> 0x06a8 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x06a8 }
            if (r4 != 0) goto L_0x0301
            r4 = 0
            java.util.List r8 = r8.subList(r4, r3)     // Catch:{ all -> 0x06a8 }
            goto L_0x0304
        L_0x0301:
            int r3 = r3 + 1
            goto L_0x02d6
        L_0x0304:
            com.google.android.gms.internal.measurement.o4 r2 = com.google.android.gms.internal.measurement.C1266q4.m2503x()     // Catch:{ all -> 0x06a8 }
            int r3 = r8.size()     // Catch:{ all -> 0x06a8 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x06a8 }
            int r5 = r8.size()     // Catch:{ all -> 0x06a8 }
            r4.<init>(r5)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14164C(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x032d
            com.google.android.gms.measurement.internal.h r5 = r1.mo14465U(r6)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.zzah r7 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14221i(r7)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x032d
            r5 = 1
            goto L_0x032e
        L_0x032d:
            r5 = 0
        L_0x032e:
            com.google.android.gms.measurement.internal.h r7 = r1.mo14465U(r6)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x06a8 }
            boolean r7 = r7.mo14221i(r9)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.h r9 = r1.mo14465U(r6)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.zzah r10 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x06a8 }
            boolean r9 = r9.mo14221i(r10)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.C1338ud.m3082b()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r10 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r11 = com.google.android.gms.measurement.internal.C1727o3.f2401F0     // Catch:{ all -> 0x06a8 }
            r12 = 0
            boolean r10 = r10.mo14163B(r12, r11)     // Catch:{ all -> 0x06a8 }
            r11 = 0
        L_0x0351:
            if (r11 >= r3) goto L_0x04e2
            java.lang.Object r12 = r8.get(r11)     // Catch:{ all -> 0x06a8 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x06a8 }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.s4 r12 = (com.google.android.gms.internal.measurement.C1298s4) r12     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.g8 r12 = r12.mo12916l()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.r4 r12 = (com.google.android.gms.internal.measurement.C1282r4) r12     // Catch:{ all -> 0x06a8 }
            java.lang.Object r13 = r8.get(r11)     // Catch:{ all -> 0x06a8 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x06a8 }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x06a8 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x06a8 }
            r4.add(r13)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r13 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            r13.mo14176q()     // Catch:{ all -> 0x06a8 }
            r13 = 64000(0xfa00, double:3.162E-319)
            r12.mo13157R0(r13)     // Catch:{ all -> 0x06a8 }
            r13 = r20
            r12.mo13155Q0(r13)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n5 r15 = r1.f2618l     // Catch:{ all -> 0x06a8 }
            r15.mo14230d()     // Catch:{ all -> 0x06a8 }
            r15 = 0
            r12.mo13146I0(r15)     // Catch:{ all -> 0x06a8 }
            if (r5 != 0) goto L_0x0390
            r12.mo13198u1()     // Catch:{ all -> 0x06a8 }
        L_0x0390:
            if (r7 != 0) goto L_0x0398
            r12.mo13137B1()     // Catch:{ all -> 0x06a8 }
            r12.mo13203x1()     // Catch:{ all -> 0x06a8 }
        L_0x0398:
            if (r9 != 0) goto L_0x039d
            r12.mo13191r1()     // Catch:{ all -> 0x06a8 }
        L_0x039d:
            com.google.android.gms.internal.measurement.C1195ld.m2247b()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r15 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            r20 = r5
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2391A0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r15.mo14163B(r6, r5)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x03bc
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            java.util.Set r5 = r5.mo14155y(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x03bc
            r12.mo13184m1(r5)     // Catch:{ all -> 0x06a8 }
        L_0x03bc:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r15 = com.google.android.gms.measurement.internal.C1727o3.f2395C0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r15)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x03e4
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14145J(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x03d6
            r12.mo13196t1()     // Catch:{ all -> 0x06a8 }
        L_0x03d6:
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14148M(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x03e4
            r12.mo13205y1()     // Catch:{ all -> 0x06a8 }
        L_0x03e4:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r15 = com.google.android.gms.measurement.internal.C1727o3.f2397D0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r15)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0407
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14149N(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0407
            java.lang.String r5 = "_id"
            int r5 = com.google.android.gms.measurement.internal.C1794ta.m4757w(r12, r5)     // Catch:{ all -> 0x06a8 }
            r15 = -1
            if (r5 == r15) goto L_0x0407
            r12.mo13197u(r5)     // Catch:{ all -> 0x06a8 }
        L_0x0407:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r15 = com.google.android.gms.measurement.internal.C1727o3.f2399E0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r15)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0421
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14147L(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0421
            r12.mo13198u1()     // Catch:{ all -> 0x06a8 }
        L_0x0421:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r15 = com.google.android.gms.measurement.internal.C1727o3.f2405H0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r15)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x048c
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14144I(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x048c
            r12.mo13191r1()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r15 = com.google.android.gms.measurement.internal.C1727o3.f2407I0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r15)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x048c
            java.util.Map r5 = r1.f2603B     // Catch:{ all -> 0x06a8 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.qa r5 = (com.google.android.gms.measurement.internal.C1758qa) r5     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0476
            r21 = r7
            r15 = r8
            long r7 = r5.f2545b     // Catch:{ all -> 0x06a8 }
            r22 = r5
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            r23 = r9
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2421S     // Catch:{ all -> 0x06a8 }
            long r24 = r5.mo14177r(r6, r9)     // Catch:{ all -> 0x06a8 }
            long r7 = r7 + r24
            c0.e r5 = r26.mo14229c()     // Catch:{ all -> 0x06a8 }
            long r24 = r5.mo11030b()     // Catch:{ all -> 0x06a8 }
            int r5 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x0473
            goto L_0x047b
        L_0x0473:
            r5 = r22
            goto L_0x0486
        L_0x0476:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x047b:
            com.google.android.gms.measurement.internal.qa r5 = new com.google.android.gms.measurement.internal.qa     // Catch:{ all -> 0x06a8 }
            r7 = 0
            r5.<init>((com.google.android.gms.measurement.internal.C1770ra) r1)     // Catch:{ all -> 0x06a8 }
            java.util.Map r7 = r1.f2603B     // Catch:{ all -> 0x06a8 }
            r7.put(r6, r5)     // Catch:{ all -> 0x06a8 }
        L_0x0486:
            java.lang.String r5 = r5.f2544a     // Catch:{ all -> 0x06a8 }
            r12.mo13166Z(r5)     // Catch:{ all -> 0x06a8 }
            goto L_0x0491
        L_0x048c:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x0491:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r7 = com.google.android.gms.measurement.internal.C1727o3.f2409J0     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r7)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.measurement.internal.f5 r5 = r1.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14146K(r6)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x04ab
            r12.mo13140C1()     // Catch:{ all -> 0x06a8 }
        L_0x04ab:
            if (r10 != 0) goto L_0x04b0
            r12.mo13140C1()     // Catch:{ all -> 0x06a8 }
        L_0x04b0:
            com.google.android.gms.measurement.internal.g r5 = r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r7 = com.google.android.gms.measurement.internal.C1727o3.f2424V     // Catch:{ all -> 0x06a8 }
            boolean r5 = r5.mo14163B(r6, r7)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x04d2
            com.google.android.gms.internal.measurement.k8 r5 = r12.mo12838q()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.s4 r5 = (com.google.android.gms.internal.measurement.C1298s4) r5     // Catch:{ all -> 0x06a8 }
            byte[] r5 = r5.mo13507j()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.ta r7 = r1.f2613g     // Catch:{ all -> 0x06a8 }
            m4628Q(r7)     // Catch:{ all -> 0x06a8 }
            long r7 = r7.mo14588x(r5)     // Catch:{ all -> 0x06a8 }
            r12.mo13150M(r7)     // Catch:{ all -> 0x06a8 }
        L_0x04d2:
            r2.mo13037t(r12)     // Catch:{ all -> 0x06a8 }
            int r11 = r11 + 1
            r8 = r15
            r5 = r20
            r7 = r21
            r9 = r23
            r20 = r13
            goto L_0x0351
        L_0x04e2:
            r13 = r20
            com.google.android.gms.measurement.internal.c4 r5 = r26.mo14228b()     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r5.mo14031C()     // Catch:{ all -> 0x06a8 }
            r7 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r7)     // Catch:{ all -> 0x06a8 }
            if (r5 == 0) goto L_0x0504
            com.google.android.gms.measurement.internal.ta r5 = r1.f2613g     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.k8 r7 = r2.mo12838q()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.q4 r7 = (com.google.android.gms.internal.measurement.C1266q4) r7     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r5.mo14579D(r7)     // Catch:{ all -> 0x06a8 }
            r12 = r5
            goto L_0x0505
        L_0x0504:
            r12 = 0
        L_0x0505:
            com.google.android.gms.measurement.internal.ta r5 = r1.f2613g     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.k8 r5 = r2.mo12838q()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.q4 r5 = (com.google.android.gms.internal.measurement.C1266q4) r5     // Catch:{ all -> 0x06a8 }
            byte[] r15 = r5.mo13507j()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.ga r5 = r1.f2616j     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.internal.measurement.C1195ld.m2247b()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n5 r7 = r5.f2143a     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.g r7 = r7.mo14402z()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.n3 r8 = com.google.android.gms.measurement.internal.C1727o3.f2393B0     // Catch:{ all -> 0x06a8 }
            boolean r7 = r7.mo14163B(r6, r8)     // Catch:{ all -> 0x06a8 }
            if (r7 == 0) goto L_0x0577
            com.google.android.gms.measurement.internal.ra r5 = r5.f2045b     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.f5 r5 = r5.f2607a     // Catch:{ all -> 0x06a8 }
            m4628Q(r5)     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r5.mo14154w(r6)     // Catch:{ all -> 0x06a8 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x06a8 }
            if (r7 != 0) goto L_0x056d
            com.google.android.gms.measurement.internal.n3 r7 = com.google.android.gms.measurement.internal.C1727o3.f2461q     // Catch:{ all -> 0x06a8 }
            r8 = 0
            java.lang.Object r7 = r7.mo14366a(r8)     // Catch:{ all -> 0x06a8 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x06a8 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x06a8 }
            android.net.Uri$Builder r8 = r7.buildUpon()     // Catch:{ all -> 0x06a8 }
            java.lang.String r7 = r7.getAuthority()     // Catch:{ all -> 0x06a8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06a8 }
            r9.<init>()     // Catch:{ all -> 0x06a8 }
            r9.append(r5)     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = "."
            r9.append(r5)     // Catch:{ all -> 0x06a8 }
            r9.append(r7)     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x06a8 }
            r8.authority(r5)     // Catch:{ all -> 0x06a8 }
            android.net.Uri r5 = r8.build()     // Catch:{ all -> 0x06a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x06a8 }
            goto L_0x057f
        L_0x056d:
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2461q     // Catch:{ all -> 0x06a8 }
            r7 = 0
            java.lang.Object r5 = r5.mo14366a(r7)     // Catch:{ all -> 0x06a8 }
        L_0x0574:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06a8 }
            goto L_0x057f
        L_0x0577:
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2461q     // Catch:{ all -> 0x06a8 }
            r7 = 0
            java.lang.Object r5 = r5.mo14366a(r7)     // Catch:{ all -> 0x06a8 }
            goto L_0x0574
        L_0x057f:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x05ff }
            r7.<init>(r5)     // Catch:{ MalformedURLException -> 0x05ff }
            boolean r8 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x05ff }
            r9 = 1
            r8 = r8 ^ r9
            com.google.android.gms.common.internal.C0917i.m1410a(r8)     // Catch:{ MalformedURLException -> 0x05ff }
            java.util.List r8 = r1.f2630x     // Catch:{ MalformedURLException -> 0x05ff }
            if (r8 == 0) goto L_0x059f
            com.google.android.gms.measurement.internal.c4 r4 = r26.mo14228b()     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()     // Catch:{ MalformedURLException -> 0x05ff }
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r4.mo14693a(r8)     // Catch:{ MalformedURLException -> 0x05ff }
            goto L_0x05a6
        L_0x059f:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x05ff }
            r8.<init>(r4)     // Catch:{ MalformedURLException -> 0x05ff }
            r1.f2630x = r8     // Catch:{ MalformedURLException -> 0x05ff }
        L_0x05a6:
            com.google.android.gms.measurement.internal.l9 r4 = r1.f2615i     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.n4 r4 = r4.f2286k     // Catch:{ MalformedURLException -> 0x05ff }
            r4.mo14369b(r13)     // Catch:{ MalformedURLException -> 0x05ff }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x05ba
            r3 = 0
            com.google.android.gms.internal.measurement.s4 r2 = r2.mo13038u(r3)     // Catch:{  }
            java.lang.String r4 = r2.mo13311T1()     // Catch:{ MalformedURLException -> 0x05ff }
        L_0x05ba:
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()     // Catch:{ MalformedURLException -> 0x05ff }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r8 = r15.length     // Catch:{ MalformedURLException -> 0x05ff }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x05ff }
            r2.mo14696d(r3, r4, r8, r12)     // Catch:{ MalformedURLException -> 0x05ff }
            r2 = 1
            r1.f2626t = r2     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.i4 r12 = r1.f2608b     // Catch:{ MalformedURLException -> 0x05ff }
            m4628Q(r12)     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.ia r2 = new com.google.android.gms.measurement.internal.ia     // Catch:{ MalformedURLException -> 0x05ff }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x05ff }
            r12.mo14009h()     // Catch:{ MalformedURLException -> 0x05ff }
            r12.mo14128i()     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.common.internal.C0917i.m1419j(r7)     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.common.internal.C0917i.m1419j(r15)     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.common.internal.C0917i.m1419j(r2)     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.n5 r3 = r12.f2143a     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.k5 r3 = r3.mo14227a()     // Catch:{ MalformedURLException -> 0x05ff }
            com.google.android.gms.measurement.internal.h4 r4 = new com.google.android.gms.measurement.internal.h4     // Catch:{ MalformedURLException -> 0x05ff }
            r16 = 0
            r11 = r4
            r13 = r6
            r14 = r7
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException -> 0x05ff }
            r3.mo14309y(r4)     // Catch:{ MalformedURLException -> 0x05ff }
            goto L_0x069a
        L_0x05ff:
            com.google.android.gms.measurement.internal.c4 r2 = r26.mo14228b()     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x06a8 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ all -> 0x06a8 }
            r2.mo14695c(r3, r4, r5)     // Catch:{ all -> 0x06a8 }
            goto L_0x069a
        L_0x0612:
            r0 = move-exception
            r2 = r0
            r10 = r7
        L_0x0615:
            if (r10 == 0) goto L_0x061a
            r10.close()     // Catch:{ all -> 0x06a8 }
        L_0x061a:
            throw r2     // Catch:{ all -> 0x06a8 }
        L_0x061b:
            r13 = r4
            r7 = r10
            r1.f2632z = r8     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x06a8 }
            m4628Q(r2)     // Catch:{ all -> 0x06a8 }
            r26.mo14464T()     // Catch:{ all -> 0x06a8 }
            long r3 = com.google.android.gms.measurement.internal.C1621g.m4214I()     // Catch:{ all -> 0x06a8 }
            long r3 = r13 - r3
            r2.mo14009h()     // Catch:{ all -> 0x06a8 }
            r2.mo14128i()     // Catch:{ all -> 0x06a8 }
            android.database.sqlite.SQLiteDatabase r5 = r2.mo14320P()     // Catch:{ SQLiteException -> 0x0670, all -> 0x066c }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0670, all -> 0x066c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x0670, all -> 0x066c }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x0670, all -> 0x066c }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r12 = r5.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x0670, all -> 0x066c }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0669 }
            if (r3 != 0) goto L_0x0660
            com.google.android.gms.measurement.internal.n5 r3 = r2.f2143a     // Catch:{ SQLiteException -> 0x0669 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0669 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14039v()     // Catch:{ SQLiteException -> 0x0669 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r3.mo14693a(r4)     // Catch:{ SQLiteException -> 0x0669 }
        L_0x065c:
            r12.close()     // Catch:{ all -> 0x06a8 }
            goto L_0x0685
        L_0x0660:
            r3 = 0
            java.lang.String r10 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0669 }
            r12.close()     // Catch:{ all -> 0x06a8 }
            goto L_0x0686
        L_0x0669:
            r0 = move-exception
            r3 = r0
            goto L_0x0673
        L_0x066c:
            r0 = move-exception
            r2 = r0
            r10 = r7
            goto L_0x06a2
        L_0x0670:
            r0 = move-exception
            r3 = r0
            r12 = r7
        L_0x0673:
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ all -> 0x069f }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x069f }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x069f }
            java.lang.String r4 = "Error selecting expired configs"
            r2.mo14694b(r4, r3)     // Catch:{ all -> 0x069f }
            if (r12 == 0) goto L_0x0685
            goto L_0x065c
        L_0x0685:
            r10 = r7
        L_0x0686:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x06a8 }
            if (r2 != 0) goto L_0x069a
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x06a8 }
            m4628Q(r2)     // Catch:{ all -> 0x06a8 }
            com.google.android.gms.measurement.internal.d6 r2 = r2.mo14322R(r10)     // Catch:{ all -> 0x06a8 }
            if (r2 == 0) goto L_0x069a
            r1.mo14478h(r2)     // Catch:{ all -> 0x06a8 }
        L_0x069a:
            r2 = 0
            r1.f2627u = r2
            goto L_0x0030
        L_0x069f:
            r0 = move-exception
            r2 = r0
            r10 = r12
        L_0x06a2:
            if (r10 == 0) goto L_0x06a7
            r10.close()     // Catch:{ all -> 0x06a8 }
        L_0x06a7:
            throw r2     // Catch:{ all -> 0x06a8 }
        L_0x06a8:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x06ae
        L_0x06ac:
            r0 = move-exception
            r2 = r0
        L_0x06ae:
            r1.f2627u = r3
            r26.m4621J()
            goto L_0x06b5
        L_0x06b4:
            throw r2
        L_0x06b5:
            goto L_0x06b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.mo14458B():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0761, code lost:
        if (r14.isEmpty() != false) goto L_0x0763;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02e8 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0332 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0335 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0399 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0529 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0568 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05e1 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x062e A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x063b A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0648 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0672 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0683 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06c4 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06df A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0766 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0787 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x07f4 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0801 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x081a A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x08b3 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x08d2 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0964 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0a0f A[Catch:{ SQLiteException -> 0x0a2a }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0970 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192 A[SYNTHETIC, Splitter:B:51:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0210 A[Catch:{ NumberFormatException -> 0x074b, all -> 0x0aa6 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14459C(com.google.android.gms.measurement.internal.zzaw r35, com.google.android.gms.measurement.internal.zzq r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C0917i.m1419j(r36)
            java.lang.String r8 = r3.f2866a
            com.google.android.gms.common.internal.C0917i.m1415f(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.k5 r10 = r34.mo14227a()
            r10.mo14009h()
            r34.mo14476g()
            java.lang.String r10 = r3.f2866a
            com.google.android.gms.measurement.internal.ta r11 = r1.f2613g
            m4628Q(r11)
            boolean r11 = com.google.android.gms.measurement.internal.C1794ta.m4747m(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f2873h
            if (r11 == 0) goto L_0x0ab1
            com.google.android.gms.measurement.internal.f5 r11 = r1.f2607a
            m4628Q(r11)
            java.lang.String r12 = r2.f2855a
            boolean r11 = r11.mo14141F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.c4 r3 = r34.mo14228b()
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2618l
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()
            java.lang.String r6 = r2.f2855a
            java.lang.String r5 = r5.mo14617d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo14695c(r6, r4, r5)
            com.google.android.gms.measurement.internal.f5 r3 = r1.f2607a
            m4628Q(r3)
            boolean r3 = r3.mo14139D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.f5 r3 = r1.f2607a
            m4628Q(r3)
            boolean r3 = r3.mo14142G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f2855a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()
            com.google.android.gms.measurement.internal.xa r12 = r1.f2606E
            r14 = 11
            java.lang.String r2 = r2.f2855a
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo14645B(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            com.google.android.gms.measurement.internal.d6 r2 = r2.mo14322R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo14076W()
            long r5 = r2.mo14067N()
            long r3 = java.lang.Math.max(r3, r5)
            c0.e r5 = r34.mo14229c()
            long r5 = r5.mo11029a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo14464T()
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2479z
            java.lang.Object r5 = r5.mo14366a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.c4 r3 = r34.mo14228b()
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14034q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo14693a(r4)
            r1.mo14478h(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.d4 r2 = com.google.android.gms.measurement.internal.C1587d4.m4105b(r35)
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()
            com.google.android.gms.measurement.internal.g r12 = r34.mo14464T()
            int r12 = r12.mo14173n(r10)
            r11.mo14644A(r2, r12)
            com.google.android.gms.measurement.internal.zzaw r2 = r2.mo14052a()
            com.google.android.gms.measurement.internal.c4 r11 = r34.mo14228b()
            java.lang.String r11 = r11.mo14031C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.c4 r11 = r34.mo14228b()
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo14039v()
            com.google.android.gms.measurement.internal.n5 r12 = r1.f2618l
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo14373D()
            java.lang.String r12 = r12.mo14616c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo14694b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c
            m4628Q(r11)
            r11.mo14334e0()
            r1.mo14462R(r3)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.internal.measurement.C1081eb.m1900b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r11 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r12 = com.google.android.gms.measurement.internal.C1727o3.f2452l0     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11.mo14163B(r14, r12)     // Catch:{ all -> 0x0aa6 }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.g r11 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r12 = com.google.android.gms.measurement.internal.C1727o3.f2454m0     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11.mo14163B(r14, r12)     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r11)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = "_lair"
            r11.mo14338m(r12, r13)     // Catch:{ all -> 0x0aa6 }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x0171
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0aa6 }
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aa6 }
            if (r9 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0aa6 }
            if (r11 != 0) goto L_0x0186
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0186
        L_0x0180:
            r33 = r4
            r8 = r15
        L_0x0183:
            r4 = 2
            goto L_0x031f
        L_0x0186:
            com.google.android.gms.measurement.internal.zzau r11 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo14708h0(r13)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.zzau r9 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            java.lang.Double r9 = r9.mo14705d0(r13)     // Catch:{ all -> 0x0aa6 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0aa6 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x01bc
            com.google.android.gms.measurement.internal.zzau r9 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r9 = r9.mo14706f0(r13)     // Catch:{ all -> 0x0aa6 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0aa6 }
            double r13 = (double) r14
            java.lang.Double.isNaN(r13)
            double r17 = r13 * r19
            goto L_0x01be
        L_0x01bc:
            r21 = r15
        L_0x01be:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01d8
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01d8
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aa6 }
            if (r9 == 0) goto L_0x020a
            long r13 = -r13
            goto L_0x020a
        L_0x01d8:
            com.google.android.gms.measurement.internal.c4 r2 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14040w()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0aa6 }
            r2.mo14695c(r3, r4, r5)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            r2.mo14340o()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            return
        L_0x01fe:
            r21 = r15
            com.google.android.gms.measurement.internal.zzau r9 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r9 = r9.mo14706f0(r13)     // Catch:{ all -> 0x0aa6 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0aa6 }
        L_0x020a:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0aa6 }
            if (r9 != 0) goto L_0x0319
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x0319
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r11)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r11 = r11.mo14327X(r10, r9)     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x0264
            java.lang.Object r11 = r11.f2734e     // Catch:{ all -> 0x0aa6 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aa6 }
            if (r12 != 0) goto L_0x0236
            goto L_0x0264
        L_0x0236:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0aa6 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r18 = new com.google.android.gms.measurement.internal.va     // Catch:{ all -> 0x0aa6 }
            java.lang.String r15 = r2.f2857c     // Catch:{ all -> 0x0aa6 }
            c0.e r17 = r34.mo14229c()     // Catch:{ all -> 0x0aa6 }
            long r19 = r17.mo11029a()     // Catch:{ all -> 0x0aa6 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0aa6 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aa6 }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02dd
        L_0x0264:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r11)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r12 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r8 = com.google.android.gms.measurement.internal.C1727o3.f2398E     // Catch:{ all -> 0x0aa6 }
            int r8 = r12.mo14174o(r10, r8)     // Catch:{ all -> 0x0aa6 }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.C0917i.m1415f(r10)     // Catch:{ all -> 0x0aa6 }
            r11.mo14009h()     // Catch:{ all -> 0x0aa6 }
            r11.mo14128i()     // Catch:{ all -> 0x0aa6 }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo14320P()     // Catch:{ SQLiteException -> 0x02a7 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02a3 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a3 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02a3 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x02a1 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x02a1 }
            goto L_0x02c1
        L_0x02a1:
            r0 = move-exception
            goto L_0x02ad
        L_0x02a3:
            r0 = move-exception
            r33 = r4
            goto L_0x02ac
        L_0x02a7:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x02ac:
            r4 = 2
        L_0x02ad:
            r8 = r0
            com.google.android.gms.measurement.internal.n5 r11 = r11.f2143a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            r11.mo14695c(r12, r15, r8)     // Catch:{ all -> 0x0aa6 }
        L_0x02c1:
            com.google.android.gms.measurement.internal.va r18 = new com.google.android.gms.measurement.internal.va     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r2.f2857c     // Catch:{ all -> 0x0aa6 }
            c0.e r11 = r34.mo14229c()     // Catch:{ all -> 0x0aa6 }
            long r15 = r11.mo11029a()     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0aa6 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aa6 }
            r9 = r18
        L_0x02dd:
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r11)     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11.mo14349x(r9)     // Catch:{ all -> 0x0aa6 }
            if (r11 != 0) goto L_0x031f
            com.google.android.gms.measurement.internal.c4 r11 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r14 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.w3 r14 = r14.mo14373D()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r15 = r9.f2732c     // Catch:{ all -> 0x0aa6 }
            java.lang.String r14 = r14.mo14619f(r15)     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r9 = r9.f2734e     // Catch:{ all -> 0x0aa6 }
            r11.mo14696d(r12, r13, r14, r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.xa r12 = r1.f2606E     // Catch:{ all -> 0x0aa6 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14645B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa6 }
            goto L_0x031f
        L_0x0319:
            r33 = r4
            r8 = r21
            goto L_0x0183
        L_0x031f:
            java.lang.String r9 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r9 = com.google.android.gms.measurement.internal.C1854ya.m4832X(r9)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0aa6 }
            r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.zzau r11 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            if (r11 != 0) goto L_0x0335
            r16 = 0
            goto L_0x0355
        L_0x0335:
            com.google.android.gms.measurement.internal.s r12 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0aa6 }
            r12.<init>(r11)     // Catch:{ all -> 0x0aa6 }
            r16 = 0
        L_0x033c:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0aa6 }
            if (r13 == 0) goto L_0x0355
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r13 = r11.mo14707g0(r13)     // Catch:{ all -> 0x0aa6 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0aa6 }
            if (r14 == 0) goto L_0x033c
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0aa6 }
            int r13 = r13.length     // Catch:{ all -> 0x0aa6 }
            long r13 = (long) r13     // Catch:{ all -> 0x0aa6 }
            long r16 = r16 + r13
            goto L_0x033c
        L_0x0355:
            r22 = 1
            long r16 = r16 + r22
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r11)     // Catch:{ all -> 0x0aa6 }
            long r12 = r34.mo14461F()     // Catch:{ all -> 0x0aa6 }
            r20 = 1
            r21 = 0
            r24 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r8
            r21 = r24
            com.google.android.gms.measurement.internal.j r11 = r11.mo14325U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0aa6 }
            long r12 = r11.f2176b     // Catch:{ all -> 0x0aa6 }
            r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r14 = com.google.android.gms.measurement.internal.C1727o3.f2449k     // Catch:{ all -> 0x0aa6 }
            r15 = 0
            java.lang.Object r14 = r14.mo14366a(r15)     // Catch:{ all -> 0x0aa6 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0aa6 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0aa6 }
            long r4 = (long) r14     // Catch:{ all -> 0x0aa6 }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x03c6
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.c4 r2 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            long r5 = r11.f2176b     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa6 }
            r2.mo14695c(r3, r4, r5)     // Catch:{ all -> 0x0aa6 }
        L_0x03b5:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            r2.mo14340o()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            return
        L_0x03c6:
            if (r9 == 0) goto L_0x0424
            long r12 = r11.f2175a     // Catch:{ all -> 0x0aa6 }
            r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r14 = com.google.android.gms.measurement.internal.C1727o3.f2453m     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r14 = r14.mo14366a(r15)     // Catch:{ all -> 0x0aa6 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0aa6 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0aa6 }
            long r4 = (long) r14     // Catch:{ all -> 0x0aa6 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0424
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03ff
            com.google.android.gms.measurement.internal.c4 r3 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            long r6 = r11.f2175a     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0aa6 }
            r3.mo14695c(r4, r5, r6)     // Catch:{ all -> 0x0aa6 }
        L_0x03ff:
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.xa r12 = r1.f2606E     // Catch:{ all -> 0x0aa6 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo14645B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            r2.mo14340o()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            return
        L_0x0424:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0474
            long r12 = r11.f2178d     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r5 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r14 = com.google.android.gms.measurement.internal.C1727o3.f2451l     // Catch:{ all -> 0x0aa6 }
            int r5 = r5.mo14174o(r8, r14)     // Catch:{ all -> 0x0aa6 }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0aa6 }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0aa6 }
            long r4 = (long) r5     // Catch:{ all -> 0x0aa6 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0474
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0463
            com.google.android.gms.measurement.internal.c4 r2 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            long r5 = r11.f2178d     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa6 }
            r2.mo14695c(r3, r4, r5)     // Catch:{ all -> 0x0aa6 }
        L_0x0463:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            r2.mo14340o()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            return
        L_0x0474:
            com.google.android.gms.measurement.internal.zzau r4 = r2.f2856b     // Catch:{ all -> 0x0aa6 }
            android.os.Bundle r4 = r4.mo14704c0()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ya r5 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f2857c     // Catch:{ all -> 0x0aa6 }
            r5.mo14646C(r4, r11, r12)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ya r5 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            boolean r5 = r5.mo14663T(r10)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r14 = "_r"
            if (r5 == 0) goto L_0x04a5
            com.google.android.gms.measurement.internal.ya r5 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = "_dbg"
            r5.mo14646C(r4, r12, r11)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ya r5 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            r5.mo14646C(r4, r14, r11)     // Catch:{ all -> 0x0aa6 }
        L_0x04a5:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0aa6 }
            if (r5 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r5)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r5 = r5.mo14327X(r11, r7)     // Catch:{ all -> 0x0aa6 }
            if (r5 == 0) goto L_0x04cb
            java.lang.Object r11 = r5.f2734e     // Catch:{ all -> 0x0aa6 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r5 = r5.f2734e     // Catch:{ all -> 0x0aa6 }
            r11.mo14646C(r4, r7, r5)     // Catch:{ all -> 0x0aa6 }
        L_0x04cb:
            com.google.android.gms.measurement.internal.l r5 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r5)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1415f(r10)     // Catch:{ all -> 0x0aa6 }
            r5.mo14009h()     // Catch:{ all -> 0x0aa6 }
            r5.mo14128i()     // Catch:{ all -> 0x0aa6 }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo14320P()     // Catch:{ SQLiteException -> 0x050b }
            com.google.android.gms.measurement.internal.n5 r11 = r5.f2143a     // Catch:{ SQLiteException -> 0x050b }
            com.google.android.gms.measurement.internal.g r11 = r11.mo14402z()     // Catch:{ SQLiteException -> 0x050b }
            com.google.android.gms.measurement.internal.n3 r12 = com.google.android.gms.measurement.internal.C1727o3.f2459p     // Catch:{ SQLiteException -> 0x050b }
            int r11 = r11.mo14174o(r10, r12)     // Catch:{ SQLiteException -> 0x050b }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x050b }
            r13 = 0
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ SQLiteException -> 0x0509 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0509 }
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0509 }
            r11[r13] = r10     // Catch:{ SQLiteException -> 0x0509 }
            r12 = 1
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0509 }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r11)     // Catch:{ SQLiteException -> 0x0509 }
            long r7 = (long) r5
            goto L_0x0523
        L_0x0509:
            r0 = move-exception
            goto L_0x050d
        L_0x050b:
            r0 = move-exception
            r13 = 0
        L_0x050d:
            r7 = r0
            com.google.android.gms.measurement.internal.n5 r5 = r5.f2143a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            r5.mo14695c(r8, r11, r7)     // Catch:{ all -> 0x0aa6 }
            r7 = 0
        L_0x0523:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x053e
            com.google.android.gms.measurement.internal.c4 r5 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14040w()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0aa6 }
            r5.mo14695c(r11, r12, r7)     // Catch:{ all -> 0x0aa6 }
        L_0x053e:
            com.google.android.gms.measurement.internal.q r5 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r12 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = r2.f2857c     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r2.f2855a     // Catch:{ all -> 0x0aa6 }
            long r2 = r2.f2858d     // Catch:{ all -> 0x0aa6 }
            r18 = 0
            r11 = r5
            r31 = 0
            r13 = r7
            r7 = r14
            r14 = r10
            r32 = r6
            r6 = r15
            r15 = r8
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.C1717n5) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = r5.f2521b     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo14326V(r10, r3)     // Catch:{ all -> 0x0aa6 }
            if (r2 != 0) goto L_0x05e1
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            long r2 = r2.mo14319O(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r4 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            int r4 = r4.mo14171l(r10)     // Catch:{ all -> 0x0aa6 }
            long r11 = (long) r4     // Catch:{ all -> 0x0aa6 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05c3
            if (r9 == 0) goto L_0x05c3
            com.google.android.gms.measurement.internal.c4 r2 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r6 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo14373D()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r5 = r5.f2521b     // Catch:{ all -> 0x0aa6 }
            java.lang.String r5 = r6.mo14617d(r5)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r6 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            int r6 = r6.mo14171l(r10)     // Catch:{ all -> 0x0aa6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0aa6 }
            r2.mo14696d(r3, r4, r5, r6)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ya r11 = r34.mo14477g0()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.xa r12 = r1.f2606E     // Catch:{ all -> 0x0aa6 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo14645B(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            return
        L_0x05c3:
            com.google.android.gms.measurement.internal.r r2 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = r5.f2521b     // Catch:{ all -> 0x0aa6 }
            long r3 = r5.f2523d     // Catch:{ all -> 0x0aa6 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0aa6 }
            goto L_0x05ef
        L_0x05e1:
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            long r8 = r2.f2551f     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.q r5 = r5.mo14424a(r3, r8)     // Catch:{ all -> 0x0aa6 }
            long r3 = r5.f2523d     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo14444c(r3)     // Catch:{ all -> 0x0aa6 }
        L_0x05ef:
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r3)     // Catch:{ all -> 0x0aa6 }
            r3.mo14342q(r2)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.k5 r2 = r34.mo14227a()     // Catch:{ all -> 0x0aa6 }
            r2.mo14009h()     // Catch:{ all -> 0x0aa6 }
            r34.mo14476g()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1419j(r5)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1419j(r36)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r2 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1415f(r2)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r2 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            r3 = r36
            java.lang.String r4 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1410a(r2)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.internal.measurement.r4 r2 = com.google.android.gms.internal.measurement.C1298s4.m2790P1()     // Catch:{ all -> 0x0aa6 }
            r4 = 1
            r2.mo13139C0(r4)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = "android"
            r2.mo13189q0(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x0633
            java.lang.String r8 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            r2.mo13204y(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x0633:
            java.lang.String r8 = r3.f2869d     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x0640
            java.lang.String r8 = r3.f2869d     // Catch:{ all -> 0x0aa6 }
            r2.mo13141D(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x0640:
            java.lang.String r8 = r3.f2868c     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x064d
            java.lang.String r8 = r3.f2868c     // Catch:{ all -> 0x0aa6 }
            r2.mo13143E(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x064d:
            com.google.android.gms.internal.measurement.C1338ud.m3082b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r8 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2401F0     // Catch:{ all -> 0x0aa6 }
            boolean r8 = r8.mo14163B(r6, r9)     // Catch:{ all -> 0x0aa6 }
            if (r8 == 0) goto L_0x0669
            java.lang.String r8 = r3.f2889x     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x0669
            java.lang.String r8 = r3.f2889x     // Catch:{ all -> 0x0aa6 }
            r2.mo13148K0(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x0669:
            long r8 = r3.f2875j     // Catch:{ all -> 0x0aa6 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0676
            int r9 = (int) r8     // Catch:{ all -> 0x0aa6 }
            r2.mo13147K(r9)     // Catch:{ all -> 0x0aa6 }
        L_0x0676:
            long r8 = r3.f2870e     // Catch:{ all -> 0x0aa6 }
            r2.mo13176i0(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r3.f2867b     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x0688
            java.lang.String r8 = r3.f2867b     // Catch:{ all -> 0x0aa6 }
            r2.mo13172e0(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x0688:
            java.lang.String r8 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r8 = r1.mo14465U(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r3.f2887v     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r9 = com.google.android.gms.measurement.internal.C1634h.m4273b(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r8 = r8.mo14214c(r9)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r8.mo14219h()     // Catch:{ all -> 0x0aa6 }
            r2.mo13154Q(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r2.mo13168a1()     // Catch:{ all -> 0x0aa6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0aa6 }
            if (r8 == 0) goto L_0x06bc
            java.lang.String r8 = r3.f2882q     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x06bc
            java.lang.String r8 = r3.f2882q     // Catch:{ all -> 0x0aa6 }
            r2.mo13200w(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x06bc:
            long r8 = r3.f2871f     // Catch:{ all -> 0x0aa6 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06c7
            r2.mo13156R(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x06c7:
            long r8 = r3.f2884s     // Catch:{ all -> 0x0aa6 }
            r2.mo13162X(r8)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ta r8 = r1.f2613g     // Catch:{ all -> 0x0aa6 }
            m4628Q(r8)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ra r9 = r8.f2045b     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r9 = r9.f2618l     // Catch:{ all -> 0x0aa6 }
            android.content.Context r9 = r9.mo14231f()     // Catch:{ all -> 0x0aa6 }
            java.util.Map r9 = com.google.android.gms.measurement.internal.C1727o3.m4537c(r9)     // Catch:{ all -> 0x0aa6 }
            if (r9 == 0) goto L_0x0763
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0aa6 }
            if (r10 == 0) goto L_0x06e7
            goto L_0x0763
        L_0x06e7:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0aa6 }
            r14.<init>()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r10 = com.google.android.gms.measurement.internal.C1727o3.f2418P     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r10 = r10.mo14366a(r6)     // Catch:{ all -> 0x0aa6 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0aa6 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0aa6 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0aa6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0aa6 }
        L_0x0700:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x075d
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0aa6 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0aa6 }
            if (r12 == 0) goto L_0x0700
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x074b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x074b }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x074b }
            if (r11 == 0) goto L_0x0700
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x074b }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x074b }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x074b }
            if (r11 < r10) goto L_0x0700
            com.google.android.gms.measurement.internal.n5 r11 = r8.f2143a     // Catch:{ NumberFormatException -> 0x074b }
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo14228b()     // Catch:{ NumberFormatException -> 0x074b }
            com.google.android.gms.measurement.internal.z3 r11 = r11.mo14040w()     // Catch:{ NumberFormatException -> 0x074b }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x074b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x074b }
            r11.mo14694b(r12, r13)     // Catch:{ NumberFormatException -> 0x074b }
            goto L_0x075d
        L_0x074b:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.n5 r12 = r8.f2143a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r12 = r12.mo14040w()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo14694b(r13, r11)     // Catch:{ all -> 0x0aa6 }
            goto L_0x0700
        L_0x075d:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0aa6 }
            if (r8 == 0) goto L_0x0764
        L_0x0763:
            r14 = r6
        L_0x0764:
            if (r14 == 0) goto L_0x0769
            r2.mo13182l1(r14)     // Catch:{ all -> 0x0aa6 }
        L_0x0769:
            java.lang.String r8 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r8 = r1.mo14465U(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r3.f2887v     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r9 = com.google.android.gms.measurement.internal.C1634h.m4273b(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.h r8 = r8.mo14214c(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0aa6 }
            boolean r10 = r8.mo14221i(r9)     // Catch:{ all -> 0x0aa6 }
            if (r10 == 0) goto L_0x07b1
            com.google.android.gms.measurement.internal.l9 r10 = r1.f2615i     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            android.util.Pair r10 = r10.mo14355n(r11, r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0aa6 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0aa6 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0aa6 }
            if (r11 != 0) goto L_0x07b1
            boolean r11 = r3.f2880o     // Catch:{ all -> 0x0aa6 }
            if (r11 == 0) goto L_0x07b1
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0aa6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0aa6 }
            r2.mo13144F0(r11)     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0aa6 }
            if (r10 == 0) goto L_0x07b1
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0aa6 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0aa6 }
            r2.mo13181l0(r10)     // Catch:{ all -> 0x0aa6 }
        L_0x07b1:
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.p r10 = r10.mo14370A()     // Catch:{ all -> 0x0aa6 }
            r10.mo14241k()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0aa6 }
            r2.mo13158S(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.p r10 = r10.mo14370A()     // Catch:{ all -> 0x0aa6 }
            r10.mo14241k()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0aa6 }
            r2.mo13183m0(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.p r10 = r10.mo14370A()     // Catch:{ all -> 0x0aa6 }
            long r10 = r10.mo14415p()     // Catch:{ all -> 0x0aa6 }
            int r11 = (int) r10     // Catch:{ all -> 0x0aa6 }
            r2.mo13153P0(r11)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.p r10 = r10.mo14370A()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r10 = r10.mo14416q()     // Catch:{ all -> 0x0aa6 }
            r2.mo13161W0(r10)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r10 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r11 = com.google.android.gms.measurement.internal.C1727o3.f2444h0     // Catch:{ all -> 0x0aa6 }
            boolean r10 = r10.mo14163B(r6, r11)     // Catch:{ all -> 0x0aa6 }
            if (r10 != 0) goto L_0x07f9
            long r12 = r3.f2877l     // Catch:{ all -> 0x0aa6 }
            r2.mo13202x(r12)     // Catch:{ all -> 0x0aa6 }
        L_0x07f9:
            com.google.android.gms.measurement.internal.n5 r10 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            boolean r10 = r10.mo14395o()     // Catch:{ all -> 0x0aa6 }
            if (r10 == 0) goto L_0x080d
            r2.mo13165Y0()     // Catch:{ all -> 0x0aa6 }
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0aa6 }
            if (r10 != 0) goto L_0x080d
            r2.mo13160U(r6)     // Catch:{ all -> 0x0aa6 }
        L_0x080d:
            com.google.android.gms.measurement.internal.l r10 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r10)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.d6 r10 = r10.mo14322R(r12)     // Catch:{ all -> 0x0aa6 }
            if (r10 != 0) goto L_0x088a
            com.google.android.gms.measurement.internal.d6 r10 = new com.google.android.gms.measurement.internal.d6     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n5 r12 = r1.f2618l     // Catch:{ all -> 0x0aa6 }
            java.lang.String r13 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            r10.<init>(r12, r13)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r1.mo14479h0(r8)     // Catch:{ all -> 0x0aa6 }
            r10.mo14096i(r12)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r3.f2876k     // Catch:{ all -> 0x0aa6 }
            r10.mo14113w(r12)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r3.f2867b     // Catch:{ all -> 0x0aa6 }
            r10.mo14114x(r12)     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r8.mo14221i(r9)     // Catch:{ all -> 0x0aa6 }
            if (r9 == 0) goto L_0x0845
            com.google.android.gms.measurement.internal.l9 r9 = r1.f2615i     // Catch:{ all -> 0x0aa6 }
            java.lang.String r12 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r9.mo14356o(r12)     // Catch:{ all -> 0x0aa6 }
            r10.mo14060G(r9)     // Catch:{ all -> 0x0aa6 }
        L_0x0845:
            r12 = 0
            r10.mo14056C(r12)     // Catch:{ all -> 0x0aa6 }
            r10.mo14057D(r12)     // Catch:{ all -> 0x0aa6 }
            r10.mo14055B(r12)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r3.f2868c     // Catch:{ all -> 0x0aa6 }
            r10.mo14100k(r9)     // Catch:{ all -> 0x0aa6 }
            long r12 = r3.f2875j     // Catch:{ all -> 0x0aa6 }
            r10.mo14102l(r12)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r3.f2869d     // Catch:{ all -> 0x0aa6 }
            r10.mo14098j(r9)     // Catch:{ all -> 0x0aa6 }
            long r12 = r3.f2870e     // Catch:{ all -> 0x0aa6 }
            r10.mo14115y(r12)     // Catch:{ all -> 0x0aa6 }
            long r12 = r3.f2871f     // Catch:{ all -> 0x0aa6 }
            r10.mo14110t(r12)     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r3.f2873h     // Catch:{ all -> 0x0aa6 }
            r10.mo14058E(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r9 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            boolean r9 = r9.mo14163B(r6, r11)     // Catch:{ all -> 0x0aa6 }
            if (r9 != 0) goto L_0x087d
            long r11 = r3.f2877l     // Catch:{ all -> 0x0aa6 }
            r10.mo14094h(r11)     // Catch:{ all -> 0x0aa6 }
        L_0x087d:
            long r11 = r3.f2884s     // Catch:{ all -> 0x0aa6 }
            r10.mo14111u(r11)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r9 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r9)     // Catch:{ all -> 0x0aa6 }
            r9.mo14341p(r10)     // Catch:{ all -> 0x0aa6 }
        L_0x088a:
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0aa6 }
            boolean r8 = r8.mo14221i(r9)     // Catch:{ all -> 0x0aa6 }
            if (r8 == 0) goto L_0x08a9
            java.lang.String r8 = r10.mo14091f0()     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x08a9
            java.lang.String r8 = r10.mo14091f0()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa6 }
            r2.mo13138C(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x08a9:
            java.lang.String r8 = r10.mo14097i0()     // Catch:{ all -> 0x0aa6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa6 }
            if (r8 != 0) goto L_0x08c0
            java.lang.String r8 = r10.mo14097i0()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r8 = com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa6 }
            r2.mo13169b0(r8)     // Catch:{ all -> 0x0aa6 }
        L_0x08c0:
            com.google.android.gms.measurement.internal.l r8 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = r3.f2866a     // Catch:{ all -> 0x0aa6 }
            java.util.List r3 = r8.mo14332c0(r3)     // Catch:{ all -> 0x0aa6 }
            r13 = 0
        L_0x08cc:
            int r8 = r3.size()     // Catch:{ all -> 0x0aa6 }
            if (r13 >= r8) goto L_0x0902
            com.google.android.gms.internal.measurement.a5 r8 = com.google.android.gms.internal.measurement.C1027b5.m1714A()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r9 = (com.google.android.gms.measurement.internal.C1818va) r9     // Catch:{ all -> 0x0aa6 }
            java.lang.String r9 = r9.f2732c     // Catch:{ all -> 0x0aa6 }
            r8.mo12517C(r9)     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r9 = (com.google.android.gms.measurement.internal.C1818va) r9     // Catch:{ all -> 0x0aa6 }
            long r9 = r9.f2733d     // Catch:{ all -> 0x0aa6 }
            r8.mo12518D(r9)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ta r9 = r1.f2613g     // Catch:{ all -> 0x0aa6 }
            m4628Q(r9)     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.va r10 = (com.google.android.gms.measurement.internal.C1818va) r10     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r10 = r10.f2734e     // Catch:{ all -> 0x0aa6 }
            r9.mo14585K(r8, r10)     // Catch:{ all -> 0x0aa6 }
            r2.mo13188p1(r8)     // Catch:{ all -> 0x0aa6 }
            int r13 = r13 + 1
            goto L_0x08cc
        L_0x0902:
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c     // Catch:{ IOException -> 0x0a5c }
            m4628Q(r3)     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.internal.measurement.k8 r8 = r2.mo12838q()     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.internal.measurement.s4 r8 = (com.google.android.gms.internal.measurement.C1298s4) r8     // Catch:{ IOException -> 0x0a5c }
            r3.mo14009h()     // Catch:{ IOException -> 0x0a5c }
            r3.mo14128i()     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ IOException -> 0x0a5c }
            java.lang.String r9 = r8.mo13311T1()     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.common.internal.C0917i.m1415f(r9)     // Catch:{ IOException -> 0x0a5c }
            byte[] r9 = r8.mo13507j()     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.measurement.internal.ra r10 = r3.f2045b     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.measurement.internal.ta r10 = r10.f2613g     // Catch:{ IOException -> 0x0a5c }
            m4628Q(r10)     // Catch:{ IOException -> 0x0a5c }
            long r10 = r10.mo14588x(r9)     // Catch:{ IOException -> 0x0a5c }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a5c }
            r12.<init>()     // Catch:{ IOException -> 0x0a5c }
            java.lang.String r13 = r8.mo13311T1()     // Catch:{ IOException -> 0x0a5c }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a5c }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a5c }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a5c }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a5c }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo14320P()     // Catch:{ SQLiteException -> 0x0a42 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0a42 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.zzau r3 = r5.f2525f     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.s r4 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x0aa6 }
            r4.<init>(r3)     // Catch:{ all -> 0x0aa6 }
        L_0x095e:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0aa6 }
            if (r3 == 0) goto L_0x0970
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0aa6 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0aa6 }
            if (r3 == 0) goto L_0x095e
        L_0x096e:
            r13 = 1
            goto L_0x09b1
        L_0x0970:
            com.google.android.gms.measurement.internal.f5 r3 = r1.f2607a     // Catch:{ all -> 0x0aa6 }
            m4628Q(r3)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r4 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = r5.f2521b     // Catch:{ all -> 0x0aa6 }
            boolean r3 = r3.mo14140E(r4, r7)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r4 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r4)     // Catch:{ all -> 0x0aa6 }
            long r17 = r34.mo14461F()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.j r4 = r16.mo14324T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0aa6 }
            if (r3 == 0) goto L_0x09b0
            long r3 = r4.f2179e     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.g r7 = r34.mo14464T()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r8 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.n3 r9 = com.google.android.gms.measurement.internal.C1727o3.f2457o     // Catch:{ all -> 0x0aa6 }
            int r7 = r7.mo14174o(r8, r9)     // Catch:{ all -> 0x0aa6 }
            long r7 = (long) r7     // Catch:{ all -> 0x0aa6 }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x09b0
            goto L_0x096e
        L_0x09b0:
            r13 = 0
        L_0x09b1:
            r2.mo14009h()     // Catch:{ all -> 0x0aa6 }
            r2.mo14128i()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1419j(r5)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.common.internal.C0917i.m1415f(r3)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ra r3 = r2.f2045b     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.ta r3 = r3.f2613g     // Catch:{ all -> 0x0aa6 }
            m4628Q(r3)     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.internal.measurement.h4 r3 = r3.mo14578B(r5)     // Catch:{ all -> 0x0aa6 }
            byte[] r3 = r3.mo13507j()     // Catch:{ all -> 0x0aa6 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0aa6 }
            r4.<init>()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f2521b     // Catch:{ all -> 0x0aa6 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f2523d     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0aa6 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0aa6 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0aa6 }
            r4.put(r15, r7)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0aa6 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0aa6 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0aa6 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo14320P()     // Catch:{ SQLiteException -> 0x0a2a }
            r7 = r32
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x0a2a }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0a25
            com.google.android.gms.measurement.internal.n5 r3 = r2.f2143a     // Catch:{ SQLiteException -> 0x0a2a }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0a2a }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x0a2a }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f2520a     // Catch:{ SQLiteException -> 0x0a2a }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ SQLiteException -> 0x0a2a }
            r3.mo14694b(r4, r6)     // Catch:{ SQLiteException -> 0x0a2a }
            goto L_0x0a73
        L_0x0a25:
            r3 = 0
            r1.f2621o = r3     // Catch:{ all -> 0x0aa6 }
            goto L_0x0a73
        L_0x0a2a:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f2520a     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r5)     // Catch:{ all -> 0x0aa6 }
            r2.mo14695c(r4, r5, r3)     // Catch:{ all -> 0x0aa6 }
            goto L_0x0a73
        L_0x0a42:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ IOException -> 0x0a5c }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ IOException -> 0x0a5c }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo13311T1()     // Catch:{ IOException -> 0x0a5c }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r6)     // Catch:{ IOException -> 0x0a5c }
            r3.mo14695c(r5, r6, r4)     // Catch:{ IOException -> 0x0a5c }
            throw r4     // Catch:{ IOException -> 0x0a5c }
        L_0x0a5c:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.c4 r4 = r34.mo14228b()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo14035r()     // Catch:{ all -> 0x0aa6 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo13165Y0()     // Catch:{ all -> 0x0aa6 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r2)     // Catch:{ all -> 0x0aa6 }
            r4.mo14695c(r5, r2, r3)     // Catch:{ all -> 0x0aa6 }
        L_0x0a73:
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c     // Catch:{ all -> 0x0aa6 }
            m4628Q(r2)     // Catch:{ all -> 0x0aa6 }
            r2.mo14340o()     // Catch:{ all -> 0x0aa6 }
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            r34.m4623L()
            com.google.android.gms.measurement.internal.c4 r2 = r34.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14039v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo14694b(r4, r3)
            return
        L_0x0aa6:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c
            m4628Q(r3)
            r3.mo14335f0()
            throw r2
        L_0x0ab1:
            r1.mo14462R(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.mo14459C(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: D */
    public final boolean mo14460D() {
        String str;
        C1859z3 z3Var;
        mo14227a().mo14009h();
        FileLock fileLock = this.f2628v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f2609c.f2143a.mo14402z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f2618l.mo14231f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f2629w = channel;
                FileLock tryLock = channel.tryLock();
                this.f2628v = tryLock;
                if (tryLock != null) {
                    mo14228b().mo14039v().mo14693a("Storage concurrent access okay");
                    return true;
                }
                mo14228b().mo14035r().mo14693a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                e = e;
                z3Var = mo14228b().mo14035r();
                str = "Failed to acquire storage lock";
                z3Var.mo14694b(str, e);
                return false;
            } catch (IOException e2) {
                e = e2;
                z3Var = mo14228b().mo14035r();
                str = "Failed to access storage lock file";
                z3Var.mo14694b(str, e);
                return false;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                z3Var = mo14228b().mo14040w();
                str = "Storage lock already acquired";
                z3Var.mo14694b(str, e);
                return false;
            }
        } else {
            mo14228b().mo14039v().mo14693a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo14461F() {
        long a = mo14229c().mo11029a();
        C1696l9 l9Var = this.f2615i;
        l9Var.mo14128i();
        l9Var.mo14009h();
        long a2 = l9Var.f2287l.mo14368a();
        if (a2 == 0) {
            a2 = ((long) l9Var.f2143a.mo14382N().mo14683u().nextInt(86400000)) + 1;
            l9Var.f2287l.mo14369b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: R */
    public final C1589d6 mo14462R(zzq zzq) {
        mo14227a().mo14009h();
        mo14476g();
        C0917i.m1419j(zzq);
        C0917i.m1415f(zzq.f2866a);
        C1195ld.m2247b();
        if (mo14464T().mo14163B(zzq.f2866a, C1727o3.f2405H0) && !zzq.f2888w.isEmpty()) {
            this.f2603B.put(zzq.f2866a, new C1758qa(this, zzq.f2888w));
        }
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C1589d6 R = lVar.mo14322R(zzq.f2866a);
        C1634h c = mo14465U(zzq.f2866a).mo14214c(C1634h.m4273b(zzq.f2887v));
        zzah zzah = zzah.AD_STORAGE;
        String o = c.mo14221i(zzah) ? this.f2615i.mo14356o(zzq.f2866a) : "";
        if (R == null) {
            R = new C1589d6(this.f2618l, zzq.f2866a);
            if (c.mo14221i(zzah.ANALYTICS_STORAGE)) {
                R.mo14096i(mo14479h0(c));
            }
            if (c.mo14221i(zzah)) {
                R.mo14060G(o);
            }
        } else if (c.mo14221i(zzah) && o != null && !o.equals(R.mo14080a())) {
            R.mo14060G(o);
            C1081eb.m1900b();
            C1621g T = mo14464T();
            C1715n3 n3Var = C1727o3.f2452l0;
            if (!T.mo14163B((String) null, n3Var) || !mo14464T().mo14163B((String) null, C1727o3.f2462q0) || !"00000000-0000-0000-0000-000000000000".equals(this.f2615i.mo14355n(zzq.f2866a, c).first)) {
                R.mo14096i(mo14479h0(c));
            }
            C1081eb.m1900b();
            if (mo14464T().mo14163B((String) null, n3Var) && !"00000000-0000-0000-0000-000000000000".equals(this.f2615i.mo14355n(zzq.f2866a, c).first)) {
                C1686l lVar2 = this.f2609c;
                m4628Q(lVar2);
                if (lVar2.mo14327X(zzq.f2866a, "_id") != null) {
                    C1686l lVar3 = this.f2609c;
                    m4628Q(lVar3);
                    if (lVar3.mo14327X(zzq.f2866a, "_lair") == null) {
                        C1818va vaVar = new C1818va(zzq.f2866a, "auto", "_lair", mo14229c().mo11029a(), 1L);
                        C1686l lVar4 = this.f2609c;
                        m4628Q(lVar4);
                        lVar4.mo14349x(vaVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo14091f0()) && c.mo14221i(zzah.ANALYTICS_STORAGE)) {
            R.mo14096i(mo14479h0(c));
        }
        R.mo14114x(zzq.f2867b);
        R.mo14090f(zzq.f2882q);
        if (!TextUtils.isEmpty(zzq.f2876k)) {
            R.mo14113w(zzq.f2876k);
        }
        long j = zzq.f2870e;
        if (j != 0) {
            R.mo14115y(j);
        }
        if (!TextUtils.isEmpty(zzq.f2868c)) {
            R.mo14100k(zzq.f2868c);
        }
        R.mo14102l(zzq.f2875j);
        String str = zzq.f2869d;
        if (str != null) {
            R.mo14098j(str);
        }
        R.mo14110t(zzq.f2871f);
        R.mo14058E(zzq.f2873h);
        if (!TextUtils.isEmpty(zzq.f2872g)) {
            R.mo14116z(zzq.f2872g);
        }
        if (!mo14464T().mo14163B((String) null, C1727o3.f2444h0)) {
            R.mo14094h(zzq.f2877l);
        }
        R.mo14092g(zzq.f2880o);
        R.mo14059F(zzq.f2883r);
        R.mo14111u(zzq.f2884s);
        C1338ud.m3082b();
        if (mo14464T().mo14163B((String) null, C1727o3.f2401F0)) {
            R.mo14062I(zzq.f2889x);
        }
        C1411zb.m3413b();
        if (mo14464T().mo14163B((String) null, C1727o3.f2476x0)) {
            R.mo14061H(zzq.f2885t);
        } else {
            C1411zb.m3413b();
            if (mo14464T().mo14163B((String) null, C1727o3.f2474w0)) {
                R.mo14061H((List) null);
            }
        }
        if (R.mo14065L()) {
            C1686l lVar5 = this.f2609c;
            m4628Q(lVar5);
            lVar5.mo14341p(R);
        }
        return R;
    }

    /* renamed from: S */
    public final C1556b mo14463S() {
        C1556b bVar = this.f2612f;
        m4628Q(bVar);
        return bVar;
    }

    /* renamed from: T */
    public final C1621g mo14464T() {
        return ((C1717n5) C0917i.m1419j(this.f2618l)).mo14402z();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: U */
    public final C1634h mo14465U(String str) {
        String str2;
        C1634h hVar = C1634h.f2129b;
        mo14227a().mo14009h();
        mo14476g();
        C1634h hVar2 = (C1634h) this.f2602A.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C0917i.m1419j(str);
        lVar.mo14009h();
        lVar.mo14128i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = lVar.mo14320P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            C1634h b = C1634h.m4273b(str2);
            mo14499z(str, b);
            return b;
        } catch (SQLiteException e) {
            lVar.f2143a.mo14228b().mo14035r().mo14695c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: V */
    public final C1686l mo14466V() {
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        return lVar;
    }

    /* renamed from: W */
    public final C1823w3 mo14467W() {
        return this.f2618l.mo14373D();
    }

    /* renamed from: X */
    public final C1652i4 mo14468X() {
        C1652i4 i4Var = this.f2608b;
        m4628Q(i4Var);
        return i4Var;
    }

    /* renamed from: Y */
    public final C1678k4 mo14469Y() {
        C1678k4 k4Var = this.f2610d;
        if (k4Var != null) {
            return k4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: Z */
    public final C1614f5 mo14470Z() {
        C1614f5 f5Var = this.f2607a;
        m4628Q(f5Var);
        return f5Var;
    }

    /* renamed from: a */
    public final C1679k5 mo14227a() {
        return ((C1717n5) C0917i.m1419j(this.f2618l)).mo14227a();
    }

    /* renamed from: b */
    public final C1574c4 mo14228b() {
        return ((C1717n5) C0917i.m1419j(this.f2618l)).mo14228b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final C1717n5 mo14471b0() {
        return this.f2618l;
    }

    /* renamed from: c */
    public final C0616e mo14229c() {
        return ((C1717n5) C0917i.m1419j(this.f2618l)).mo14229c();
    }

    /* renamed from: c0 */
    public final C1851y7 mo14472c0() {
        C1851y7 y7Var = this.f2614h;
        m4628Q(y7Var);
        return y7Var;
    }

    /* renamed from: d */
    public final C1569c mo14230d() {
        throw null;
    }

    /* renamed from: d0 */
    public final C1696l9 mo14473d0() {
        return this.f2615i;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: e */
    public final void mo14474e() {
        C1859z3 r;
        Integer valueOf;
        Integer valueOf2;
        String str;
        mo14227a().mo14009h();
        mo14476g();
        if (!this.f2620n) {
            this.f2620n = true;
            if (mo14460D()) {
                FileChannel fileChannel = this.f2629w;
                mo14227a().mo14009h();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo14228b().mo14035r().mo14693a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo14228b().mo14040w().mo14694b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo14228b().mo14035r().mo14694b("Failed to read from channel", e);
                    }
                }
                int p = this.f2618l.mo14371B().mo14505p();
                mo14227a().mo14009h();
                if (i > p) {
                    r = mo14228b().mo14035r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (i < p) {
                    FileChannel fileChannel2 = this.f2629w;
                    mo14227a().mo14009h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo14228b().mo14035r().mo14693a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo14228b().mo14035r().mo14694b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            r = mo14228b().mo14039v();
                            valueOf = Integer.valueOf(i);
                            valueOf2 = Integer.valueOf(p);
                            str = "Storage version upgraded. Previous, current version";
                        } catch (IOException e2) {
                            mo14228b().mo14035r().mo14694b("Failed to write to channel", e2);
                        }
                    }
                    r = mo14228b().mo14035r();
                    valueOf = Integer.valueOf(i);
                    valueOf2 = Integer.valueOf(p);
                    str = "Storage version upgrade failed. Previous, current version";
                } else {
                    return;
                }
                r.mo14695c(str, valueOf, valueOf2);
            }
        }
    }

    /* renamed from: f */
    public final Context mo14231f() {
        return this.f2618l.mo14231f();
    }

    /* renamed from: f0 */
    public final C1794ta mo14475f0() {
        C1794ta taVar = this.f2613g;
        m4628Q(taVar);
        return taVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14476g() {
        if (!this.f2619m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: g0 */
    public final C1854ya mo14477g0() {
        return ((C1717n5) C0917i.m1419j(this.f2618l)).mo14382N();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h */
    public final void mo14478h(C1589d6 d6Var) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        mo14227a().mo14009h();
        if (!TextUtils.isEmpty(d6Var.mo14099j0()) || !TextUtils.isEmpty(d6Var.mo14085c0())) {
            C1632ga gaVar = this.f2616j;
            Uri.Builder builder = new Uri.Builder();
            String j0 = d6Var.mo14099j0();
            if (TextUtils.isEmpty(j0)) {
                j0 = d6Var.mo14085c0();
            }
            ArrayMap arrayMap3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C1727o3.f2437e.mo14366a((Object) null)).encodedAuthority((String) C1727o3.f2439f.mo14366a((Object) null)).path("config/app/".concat(String.valueOf(j0))).appendQueryParameter("platform", "android");
            gaVar.f2143a.mo14402z().mo14176q();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(64000)).appendQueryParameter("runtime_version", TimerCodec.DISENABLE);
            C1195ld.m2247b();
            if (!gaVar.f2143a.mo14402z().mo14163B(d6Var.mo14089e0(), C1727o3.f2478y0)) {
                builder.appendQueryParameter("app_instance_id", d6Var.mo14091f0());
            }
            String uri = builder.build().toString();
            try {
                String str = (String) C0917i.m1419j(d6Var.mo14089e0());
                URL url = new URL(uri);
                mo14228b().mo14039v().mo14694b("Fetching remote configuration", str);
                C1614f5 f5Var = this.f2607a;
                m4628Q(f5Var);
                C1313t3 t = f5Var.mo14151t(str);
                C1614f5 f5Var2 = this.f2607a;
                m4628Q(f5Var2);
                String v = f5Var2.mo14153v(str);
                if (t != null) {
                    if (!TextUtils.isEmpty(v)) {
                        arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", v);
                    } else {
                        arrayMap2 = null;
                    }
                    C1195ld.m2247b();
                    if (mo14464T().mo14163B((String) null, C1727o3.f2411K0)) {
                        C1614f5 f5Var3 = this.f2607a;
                        m4628Q(f5Var3);
                        String u = f5Var3.mo14152u(str);
                        if (!TextUtils.isEmpty(u)) {
                            if (arrayMap2 == null) {
                                arrayMap2 = new ArrayMap();
                            }
                            arrayMap3 = arrayMap2;
                            arrayMap3.put("If-None-Match", u);
                        }
                    }
                    arrayMap = arrayMap2;
                    this.f2625s = true;
                    C1652i4 i4Var = this.f2608b;
                    m4628Q(i4Var);
                    C1671ja jaVar = new C1671ja(this);
                    i4Var.mo14009h();
                    i4Var.mo14128i();
                    C0917i.m1419j(url);
                    C0917i.m1419j(jaVar);
                    i4Var.f2143a.mo14227a().mo14309y(new C1639h4(i4Var, str, url, (byte[]) null, arrayMap, jaVar));
                }
                arrayMap = arrayMap3;
                this.f2625s = true;
                C1652i4 i4Var2 = this.f2608b;
                m4628Q(i4Var2);
                C1671ja jaVar2 = new C1671ja(this);
                i4Var2.mo14009h();
                i4Var2.mo14128i();
                C0917i.m1419j(url);
                C0917i.m1419j(jaVar2);
                i4Var2.f2143a.mo14227a().mo14309y(new C1639h4(i4Var2, str, url, (byte[]) null, arrayMap, jaVar2));
            } catch (MalformedURLException unused) {
                mo14228b().mo14035r().mo14695c("Failed to parse config URL. Not fetching. appId", C1574c4.m4083z(d6Var.mo14089e0()), uri);
            }
        } else {
            mo14486m((String) C0917i.m1419j(d6Var.mo14089e0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h0 */
    public final String mo14479h0(C1634h hVar) {
        if (!hVar.mo14221i(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo14477g0().mo14683u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i */
    public final void mo14480i(zzaw zzaw, zzq zzq) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        C1859z3 r;
        String str;
        Object z;
        String f;
        Object obj;
        String str2;
        zzq zzq2 = zzq;
        C0917i.m1419j(zzq);
        C0917i.m1415f(zzq2.f2866a);
        mo14227a().mo14009h();
        mo14476g();
        String str3 = zzq2.f2866a;
        zzaw zzaw3 = zzaw;
        long j = zzaw3.f2858d;
        C1291rd.m2726b();
        C1552a8 a8Var = null;
        if (mo14464T().mo14163B((String) null, C1727o3.f2464r0)) {
            C1587d4 b = C1587d4.m4105b(zzaw);
            mo14227a().mo14009h();
            if (!(this.f2604C == null || (str2 = this.f2605D) == null || !str2.equals(str3))) {
                a8Var = this.f2604C;
            }
            C1854ya.m4845y(a8Var, b.f2003d, false);
            zzaw3 = b.mo14052a();
        }
        m4628Q(this.f2613g);
        if (C1794ta.m4747m(zzaw3, zzq2)) {
            if (!zzq2.f2873h) {
                mo14462R(zzq2);
                return;
            }
            List list4 = zzq2.f2885t;
            if (list4 == null) {
                zzaw2 = zzaw3;
            } else if (list4.contains(zzaw3.f2855a)) {
                Bundle c0 = zzaw3.f2856b.mo14704c0();
                c0.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(zzaw3.f2855a, new zzau(c0), zzaw3.f2857c, zzaw3.f2858d);
            } else {
                mo14228b().mo14034q().mo14696d("Dropping non-safelisted event. appId, event name, origin", str3, zzaw3.f2855a, zzaw3.f2857c);
                return;
            }
            C1686l lVar = this.f2609c;
            m4628Q(lVar);
            lVar.mo14334e0();
            try {
                C1686l lVar2 = this.f2609c;
                m4628Q(lVar2);
                C0917i.m1415f(str3);
                lVar2.mo14009h();
                lVar2.mo14128i();
                if (j < 0) {
                    lVar2.f2143a.mo14228b().mo14040w().mo14695c("Invalid time querying timed out conditional properties", C1574c4.m4083z(str3), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = lVar2.mo14331b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        mo14228b().mo14039v().mo14696d("User property timed out", zzac.f2843a, this.f2618l.mo14373D().mo14619f(zzac.f2845c.f2860b), zzac.f2845c.mo14714V());
                        zzaw zzaw4 = zzac.f2849g;
                        if (zzaw4 != null) {
                            mo14459C(new zzaw(zzaw4, j), zzq2);
                        }
                        C1686l lVar3 = this.f2609c;
                        m4628Q(lVar3);
                        lVar3.mo14315J(str3, zzac.f2845c.f2860b);
                    }
                }
                C1686l lVar4 = this.f2609c;
                m4628Q(lVar4);
                C0917i.m1415f(str3);
                lVar4.mo14009h();
                lVar4.mo14128i();
                if (j < 0) {
                    lVar4.f2143a.mo14228b().mo14040w().mo14695c("Invalid time querying expired conditional properties", C1574c4.m4083z(str3), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = lVar4.mo14331b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        mo14228b().mo14039v().mo14696d("User property expired", zzac2.f2843a, this.f2618l.mo14373D().mo14619f(zzac2.f2845c.f2860b), zzac2.f2845c.mo14714V());
                        C1686l lVar5 = this.f2609c;
                        m4628Q(lVar5);
                        lVar5.mo14338m(str3, zzac2.f2845c.f2860b);
                        zzaw zzaw5 = zzac2.f2853k;
                        if (zzaw5 != null) {
                            arrayList.add(zzaw5);
                        }
                        C1686l lVar6 = this.f2609c;
                        m4628Q(lVar6);
                        lVar6.mo14315J(str3, zzac2.f2845c.f2860b);
                    }
                }
                for (zzaw zzaw6 : arrayList) {
                    mo14459C(new zzaw(zzaw6, j), zzq2);
                }
                C1686l lVar7 = this.f2609c;
                m4628Q(lVar7);
                String str4 = zzaw2.f2855a;
                C0917i.m1415f(str3);
                C0917i.m1415f(str4);
                lVar7.mo14009h();
                lVar7.mo14128i();
                if (j < 0) {
                    lVar7.f2143a.mo14228b().mo14040w().mo14696d("Invalid time querying triggered conditional properties", C1574c4.m4083z(str3), lVar7.f2143a.mo14373D().mo14617d(str4), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = lVar7.mo14331b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzlo zzlo = zzac3.f2845c;
                        C1818va vaVar = new C1818va((String) C0917i.m1419j(zzac3.f2843a), zzac3.f2844b, zzlo.f2860b, j, C0917i.m1419j(zzlo.mo14714V()));
                        C1686l lVar8 = this.f2609c;
                        m4628Q(lVar8);
                        if (lVar8.mo14349x(vaVar)) {
                            r = mo14228b().mo14039v();
                            str = "User property triggered";
                            z = zzac3.f2843a;
                            f = this.f2618l.mo14373D().mo14619f(vaVar.f2732c);
                            obj = vaVar.f2734e;
                        } else {
                            r = mo14228b().mo14035r();
                            str = "Too many active user properties, ignoring";
                            z = C1574c4.m4083z(zzac3.f2843a);
                            f = this.f2618l.mo14373D().mo14619f(vaVar.f2732c);
                            obj = vaVar.f2734e;
                        }
                        r.mo14696d(str, z, f, obj);
                        zzaw zzaw7 = zzac3.f2851i;
                        if (zzaw7 != null) {
                            arrayList2.add(zzaw7);
                        }
                        zzac3.f2845c = new zzlo(vaVar);
                        zzac3.f2847e = true;
                        C1686l lVar9 = this.f2609c;
                        m4628Q(lVar9);
                        lVar9.mo14348w(zzac3);
                    }
                }
                mo14459C(zzaw2, zzq2);
                for (zzaw zzaw8 : arrayList2) {
                    mo14459C(new zzaw(zzaw8, j), zzq2);
                }
                C1686l lVar10 = this.f2609c;
                m4628Q(lVar10);
                lVar10.mo14340o();
            } finally {
                C1686l lVar11 = this.f2609c;
                m4628Q(lVar11);
                lVar11.mo14335f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final String mo14481i0(zzq zzq) {
        try {
            return (String) mo14227a().mo14307s(new C1684ka(this, zzq)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo14228b().mo14035r().mo14695c("Failed to get app instance id. appId", C1574c4.m4083z(zzq.f2866a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j */
    public final void mo14482j(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C1589d6 R = lVar.mo14322R(str2);
        if (R == null || TextUtils.isEmpty(R.mo14095h0())) {
            mo14228b().mo14034q().mo14694b("No app data available; dropping event", str2);
            return;
        }
        Boolean I = m4620I(R);
        if (I == null) {
            if (!"_ui".equals(zzaw2.f2855a)) {
                mo14228b().mo14040w().mo14694b("Could not find package. appId", C1574c4.m4083z(str));
            }
        } else if (!I.booleanValue()) {
            mo14228b().mo14035r().mo14694b("App version does not match; dropping event. appId", C1574c4.m4083z(str));
            return;
        }
        zzq zzq = r2;
        C1589d6 d6Var = R;
        zzq zzq2 = new zzq(str, R.mo14099j0(), R.mo14095h0(), R.mo14066M(), R.mo14093g0(), R.mo14077X(), R.mo14074U(), (String) null, R.mo14064K(), false, d6Var.mo14097i0(), d6Var.mo14054A(), 0, 0, d6Var.mo14063J(), false, d6Var.mo14085c0(), d6Var.mo14083b0(), d6Var.mo14075V(), d6Var.mo14084c(), (String) null, mo14465U(str2).mo14219h(), "", (String) null);
        mo14483k(zzaw2, zzq);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final void mo14483k(zzaw zzaw, zzq zzq) {
        C0917i.m1415f(zzq.f2866a);
        C1587d4 b = C1587d4.m4105b(zzaw);
        C1854ya g0 = mo14477g0();
        Bundle bundle = b.f2003d;
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        g0.mo14689z(bundle, lVar.mo14321Q(zzq.f2866a));
        mo14477g0().mo14644A(b, mo14464T().mo14173n(zzq.f2866a));
        zzaw a = b.mo14052a();
        if ("_cmp".equals(a.f2855a) && "referrer API v2".equals(a.f2856b.mo14708h0("_cis"))) {
            String h0 = a.f2856b.mo14708h0("gclid");
            if (!TextUtils.isEmpty(h0)) {
                mo14457A(new zzlo("_lgclid", a.f2858d, h0, "auto"), zzq);
            }
        }
        mo14480i(a, zzq);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k0 */
    public final void mo14484k0(Runnable runnable) {
        mo14227a().mo14009h();
        if (this.f2622p == null) {
            this.f2622p = new ArrayList();
        }
        this.f2622p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo14485l() {
        this.f2624r++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[Catch:{ all -> 0x0193, all -> 0x019d }] */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14486m(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.k5 r0 = r8.mo14227a()
            r0.mo14009h()
            r8.mo14476g()
            com.google.android.gms.common.internal.C0917i.m1415f(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x019d }
        L_0x0012:
            com.google.android.gms.measurement.internal.c4 r1 = r8.mo14228b()     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo14039v()     // Catch:{ all -> 0x019d }
            int r2 = r12.length     // Catch:{ all -> 0x019d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo14694b(r3, r2)     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.l r1 = r8.f2609c     // Catch:{ all -> 0x019d }
            m4628Q(r1)     // Catch:{ all -> 0x019d }
            r1.mo14334e0()     // Catch:{ all -> 0x019d }
            com.google.android.gms.measurement.internal.l r1 = r8.f2609c     // Catch:{ all -> 0x0193 }
            m4628Q(r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.d6 r1 = r1.mo14322R(r9)     // Catch:{ all -> 0x0193 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0043
            if (r10 != r4) goto L_0x0047
            r10 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r11 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.c4 r10 = r8.mo14228b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14040w()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r9)     // Catch:{ all -> 0x0193 }
            r10.mo14694b(r11, r9)     // Catch:{ all -> 0x0193 }
            goto L_0x0185
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r10 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            c0.e r12 = r8.mo14229c()     // Catch:{ all -> 0x0193 }
            long r12 = r12.mo11029a()     // Catch:{ all -> 0x0193 }
            r1.mo14112v(r12)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l r12 = r8.f2609c     // Catch:{ all -> 0x0193 }
            m4628Q(r12)     // Catch:{ all -> 0x0193 }
            r12.mo14341p(r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.c4 r12 = r8.mo14228b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.z3 r12 = r12.mo14039v()     // Catch:{ all -> 0x0193 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r12.mo14695c(r13, r1, r11)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.f5 r11 = r8.f2607a     // Catch:{ all -> 0x0193 }
            m4628Q(r11)     // Catch:{ all -> 0x0193 }
            r11.mo14156z(r9)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l9 r9 = r8.f2615i     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n4 r9 = r9.f2286k     // Catch:{ all -> 0x0193 }
            c0.e r11 = r8.mo14229c()     // Catch:{ all -> 0x0193 }
            long r11 = r11.mo11029a()     // Catch:{ all -> 0x0193 }
            r9.mo14369b(r11)     // Catch:{ all -> 0x0193 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a7
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.l9 r9 = r8.f2615i     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n4 r9 = r9.f2284i     // Catch:{ all -> 0x0193 }
            c0.e r10 = r8.mo14229c()     // Catch:{ all -> 0x0193 }
            long r10 = r10.mo11029a()     // Catch:{ all -> 0x0193 }
            r9.mo14369b(r10)     // Catch:{ all -> 0x0193 }
        L_0x00b6:
            r8.m4623L()     // Catch:{ all -> 0x0193 }
            goto L_0x0185
        L_0x00bb:
            r11 = 0
            if (r13 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0193 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0193 }
            goto L_0x00c8
        L_0x00c7:
            r3 = r11
        L_0x00c8:
            if (r3 == 0) goto L_0x00d7
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r6 != 0) goto L_0x00d7
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0193 }
            goto L_0x00d8
        L_0x00d7:
            r3 = r11
        L_0x00d8:
            com.google.android.gms.internal.measurement.C1195ld.m2247b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.g r6 = r8.mo14464T()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.n3 r7 = com.google.android.gms.measurement.internal.C1727o3.f2411K0     // Catch:{ all -> 0x0193 }
            boolean r6 = r6.mo14163B(r11, r7)     // Catch:{ all -> 0x0193 }
            if (r6 == 0) goto L_0x0102
            if (r13 == 0) goto L_0x00f2
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0193 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0193 }
            goto L_0x00f3
        L_0x00f2:
            r13 = r11
        L_0x00f3:
            if (r13 == 0) goto L_0x0102
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r6 != 0) goto L_0x0102
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0193 }
            goto L_0x0103
        L_0x0102:
            r13 = r11
        L_0x0103:
            if (r10 == r5) goto L_0x0121
            if (r10 != r4) goto L_0x0108
            goto L_0x0121
        L_0x0108:
            com.google.android.gms.measurement.internal.f5 r11 = r8.f2607a     // Catch:{ all -> 0x0193 }
            m4628Q(r11)     // Catch:{ all -> 0x0193 }
            boolean r11 = r11.mo14143H(r9, r12, r3, r13)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.l r9 = r8.f2609c     // Catch:{ all -> 0x019d }
            m4628Q(r9)     // Catch:{ all -> 0x019d }
        L_0x0118:
            r9.mo14335f0()     // Catch:{ all -> 0x019d }
            r8.f2625s = r0
            r8.m4621J()
            return
        L_0x0121:
            com.google.android.gms.measurement.internal.f5 r12 = r8.f2607a     // Catch:{ all -> 0x0193 }
            m4628Q(r12)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.measurement.t3 r12 = r12.mo14151t(r9)     // Catch:{ all -> 0x0193 }
            if (r12 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.f5 r12 = r8.f2607a     // Catch:{ all -> 0x0193 }
            m4628Q(r12)     // Catch:{ all -> 0x0193 }
            boolean r11 = r12.mo14143H(r9, r11, r11, r11)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x013d
            com.google.android.gms.measurement.internal.l r9 = r8.f2609c     // Catch:{ all -> 0x019d }
            m4628Q(r9)     // Catch:{ all -> 0x019d }
            goto L_0x0118
        L_0x013d:
            c0.e r11 = r8.mo14229c()     // Catch:{ all -> 0x0193 }
            long r11 = r11.mo11029a()     // Catch:{ all -> 0x0193 }
            r1.mo14103m(r11)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l r11 = r8.f2609c     // Catch:{ all -> 0x0193 }
            m4628Q(r11)     // Catch:{ all -> 0x0193 }
            r11.mo14341p(r1)     // Catch:{ all -> 0x0193 }
            if (r10 != r5) goto L_0x0160
            com.google.android.gms.measurement.internal.c4 r10 = r8.mo14228b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo14041x()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo14694b(r11, r9)     // Catch:{ all -> 0x0193 }
            goto L_0x0171
        L_0x0160:
            com.google.android.gms.measurement.internal.c4 r9 = r8.mo14228b()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo14039v()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r9.mo14695c(r11, r10, r2)     // Catch:{ all -> 0x0193 }
        L_0x0171:
            com.google.android.gms.measurement.internal.i4 r9 = r8.f2608b     // Catch:{ all -> 0x0193 }
            m4628Q(r9)     // Catch:{ all -> 0x0193 }
            boolean r9 = r9.mo14237m()     // Catch:{ all -> 0x0193 }
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r8.m4625N()     // Catch:{ all -> 0x0193 }
            if (r9 == 0) goto L_0x00b6
            r8.mo14458B()     // Catch:{ all -> 0x0193 }
        L_0x0185:
            com.google.android.gms.measurement.internal.l r9 = r8.f2609c     // Catch:{ all -> 0x0193 }
            m4628Q(r9)     // Catch:{ all -> 0x0193 }
            r9.mo14340o()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.l r9 = r8.f2609c     // Catch:{ all -> 0x019d }
            m4628Q(r9)     // Catch:{ all -> 0x019d }
            goto L_0x0118
        L_0x0193:
            r9 = move-exception
            com.google.android.gms.measurement.internal.l r10 = r8.f2609c     // Catch:{ all -> 0x019d }
            m4628Q(r10)     // Catch:{ all -> 0x019d }
            r10.mo14335f0()     // Catch:{ all -> 0x019d }
            throw r9     // Catch:{ all -> 0x019d }
        L_0x019d:
            r9 = move-exception
            r8.f2625s = r0
            r8.m4621J()
            goto L_0x01a5
        L_0x01a4:
            throw r9
        L_0x01a5:
            goto L_0x01a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.mo14486m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo14487n(boolean z) {
        m4623L();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: o */
    public final void mo14488o(int i, Throwable th, byte[] bArr, String str) {
        C1686l lVar;
        mo14227a().mo14009h();
        mo14476g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f2626t = false;
                m4621J();
                throw th2;
            }
        }
        List<Long> list = (List) C0917i.m1419j(this.f2630x);
        this.f2630x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo14228b().mo14039v().mo14695c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f2615i.f2286k.mo14369b(mo14229c().mo11029a());
            if (i == 503 || i == 429) {
                this.f2615i.f2284i.mo14369b(mo14229c().mo11029a());
            }
            C1686l lVar2 = this.f2609c;
            m4628Q(lVar2);
            lVar2.mo14336g0(list);
            m4623L();
            this.f2626t = false;
            m4621J();
        }
        if (th == null) {
            try {
                this.f2615i.f2285j.mo14369b(mo14229c().mo11029a());
                this.f2615i.f2286k.mo14369b(0);
                m4623L();
                mo14228b().mo14039v().mo14695c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C1686l lVar3 = this.f2609c;
                m4628Q(lVar3);
                lVar3.mo14334e0();
                try {
                    for (Long l : list) {
                        try {
                            lVar = this.f2609c;
                            m4628Q(lVar);
                            long longValue = l.longValue();
                            lVar.mo14009h();
                            lVar.mo14128i();
                            if (lVar.mo14320P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            lVar.f2143a.mo14228b().mo14035r().mo14694b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f2631y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    C1686l lVar4 = this.f2609c;
                    m4628Q(lVar4);
                    lVar4.mo14340o();
                    C1686l lVar5 = this.f2609c;
                    m4628Q(lVar5);
                    lVar5.mo14335f0();
                    this.f2631y = null;
                    C1652i4 i4Var = this.f2608b;
                    m4628Q(i4Var);
                    if (!i4Var.mo14237m() || !m4625N()) {
                        this.f2632z = -1;
                        m4623L();
                    } else {
                        mo14458B();
                    }
                    this.f2621o = 0;
                } catch (Throwable th3) {
                    C1686l lVar6 = this.f2609c;
                    m4628Q(lVar6);
                    lVar6.mo14335f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo14228b().mo14035r().mo14694b("Database error while trying to delete uploaded bundles", e3);
                this.f2621o = mo14229c().mo11030b();
                mo14228b().mo14039v().mo14694b("Disable upload, time", Long.valueOf(this.f2621o));
            }
            this.f2626t = false;
            m4621J();
        }
        mo14228b().mo14039v().mo14695c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f2615i.f2286k.mo14369b(mo14229c().mo11029a());
        this.f2615i.f2284i.mo14369b(mo14229c().mo11029a());
        C1686l lVar22 = this.f2609c;
        m4628Q(lVar22);
        lVar22.mo14336g0(list);
        m4623L();
        this.f2626t = false;
        m4621J();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c2 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ee A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0405 A[SYNTHETIC, Splitter:B:129:0x0405] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04c9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x052d A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0559 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14489p(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.k5 r8 = r23.mo14227a()
            r8.mo14009h()
            r23.mo14476g()
            com.google.android.gms.common.internal.C0917i.m1419j(r24)
            java.lang.String r8 = r2.f2866a
            com.google.android.gms.common.internal.C0917i.m1415f(r8)
            boolean r8 = m4627P(r24)
            if (r8 == 0) goto L_0x0563
            com.google.android.gms.measurement.internal.l r8 = r1.f2609c
            m4628Q(r8)
            java.lang.String r9 = r2.f2866a
            com.google.android.gms.measurement.internal.d6 r8 = r8.mo14322R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo14099j0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f2867b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo14103m(r9)
            com.google.android.gms.measurement.internal.l r11 = r1.f2609c
            m4628Q(r11)
            r11.mo14341p(r8)
            com.google.android.gms.measurement.internal.f5 r8 = r1.f2607a
            m4628Q(r8)
            java.lang.String r11 = r2.f2866a
            r8.mo14136A(r11)
        L_0x005e:
            boolean r8 = r2.f2873h
            if (r8 != 0) goto L_0x0066
            r23.mo14462R(r24)
            return
        L_0x0066:
            long r11 = r2.f2878m
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            c0.e r8 = r23.mo14229c()
            long r11 = r8.mo11029a()
        L_0x0074:
            com.google.android.gms.measurement.internal.n5 r8 = r1.f2618l
            com.google.android.gms.measurement.internal.p r8 = r8.mo14370A()
            r8.mo14417r()
            int r8 = r2.f2879n
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.c4 r13 = r23.mo14228b()
            com.google.android.gms.measurement.internal.z3 r13 = r13.mo14040w()
            java.lang.String r14 = r2.f2866a
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo14695c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.l r9 = r1.f2609c
            m4628Q(r9)
            r9.mo14334e0()
            com.google.android.gms.measurement.internal.l r9 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r9)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f2866a     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.va r9 = r9.mo14327X(r10, r13)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f2731b     // Catch:{ all -> 0x0559 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f2883r     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzlo r10 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f2883r     // Catch:{ all -> 0x0559 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0559 }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0559 }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = 1
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f2734e     // Catch:{ all -> 0x0559 }
            java.lang.Long r13 = r10.f2862d     // Catch:{ all -> 0x0559 }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x0559 }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo14457A(r10, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzlo r9 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo14493t(r9, r2)     // Catch:{ all -> 0x0559 }
        L_0x0119:
            com.google.android.gms.measurement.internal.l r9 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r9)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f2866a     // Catch:{ all -> 0x0559 }
            java.lang.Object r10 = com.google.android.gms.common.internal.C0917i.m1419j(r10)     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.d6 r9 = r9.mo14322R(r10)     // Catch:{ all -> 0x0559 }
            if (r9 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.ya r13 = r23.mo14477g0()     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = r2.f2867b     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = r9.mo14099j0()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r2.f2882q     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = r9.mo14085c0()     // Catch:{ all -> 0x0559 }
            boolean r3 = r13.mo14666b0(r14, r15, r10, r3)     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.c4 r3 = r23.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo14089e0()     // Catch:{ all -> 0x0559 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r13)     // Catch:{ all -> 0x0559 }
            r3.mo14694b(r10, r13)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l r3 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r3)     // Catch:{ all -> 0x0559 }
            java.lang.String r9 = r9.mo14089e0()     // Catch:{ all -> 0x0559 }
            r3.mo14128i()     // Catch:{ all -> 0x0559 }
            r3.mo14009h()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.internal.C0917i.m1415f(r9)     // Catch:{ all -> 0x0559 }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo14320P()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cd }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.n5 r0 = r3.f2143a     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cd }
            r0.mo14695c(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01e1
        L_0x01cd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r3.f2143a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r9)     // Catch:{ all -> 0x0559 }
            r3.mo14695c(r10, r9, r0)     // Catch:{ all -> 0x0559 }
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 == 0) goto L_0x0239
            long r13 = r9.mo14066M()     // Catch:{ all -> 0x0559 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r13 = r9.mo14066M()     // Catch:{ all -> 0x0559 }
            r3 = r5
            long r4 = r2.f2875j     // Catch:{ all -> 0x0559 }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r5
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r4 = r9.mo14095h0()     // Catch:{ all -> 0x0559 }
            long r13 = r9.mo14066M()     // Catch:{ all -> 0x0559 }
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            java.lang.String r5 = r2.f2868c     // Catch:{ all -> 0x0559 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0559 }
            if (r5 != 0) goto L_0x0216
            r15 = 1
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x023a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_pv"
            r0.putString(r5, r4)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzaw r4 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            r1.mo14480i(r4, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            r23.mo14462R(r24)     // Catch:{ all -> 0x0559 }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.l r0 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r4 = r2.f2866a     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.r r0 = r0.mo14326V(r4, r5)     // Catch:{ all -> 0x0559 }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.l r0 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r4 = r2.f2866a     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.r r0 = r0.mo14326V(r4, r5)     // Catch:{ all -> 0x0559 }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x052d
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r4
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r14 = "_r"
            java.lang.String r13 = "_c"
            if (r15 != 0) goto L_0x04e3
            com.google.android.gms.measurement.internal.zzlo r0 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r8 = r13
            r13 = r0
            r9 = r14
            r14 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo14457A(r0, r2)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.k5 r0 = r23.mo14227a()     // Catch:{ all -> 0x0559 }
            r0.mo14009h()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.u4 r0 = r1.f2617k     // Catch:{ all -> 0x0559 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C0917i.m1419j(r0)     // Catch:{ all -> 0x0559 }
            r13 = r0
            com.google.android.gms.measurement.internal.u4 r13 = (com.google.android.gms.measurement.internal.C1800u4) r13     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = r2.f2866a     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x0382
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0559 }
            if (r14 == 0) goto L_0x02a3
            goto L_0x0382
        L_0x02a3:
            com.google.android.gms.measurement.internal.n5 r14 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.k5 r14 = r14.mo14227a()     // Catch:{ all -> 0x0559 }
            r14.mo14009h()     // Catch:{ all -> 0x0559 }
            boolean r14 = r13.mo14602a()     // Catch:{ all -> 0x0559 }
            if (r14 != 0) goto L_0x02c3
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14038u()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Install Referrer Reporter is not available"
        L_0x02be:
            r0.mo14693a(r3)     // Catch:{ all -> 0x0559 }
            goto L_0x0390
        L_0x02c3:
            com.google.android.gms.measurement.internal.t4 r14 = new com.google.android.gms.measurement.internal.t4     // Catch:{ all -> 0x0559 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.k5 r0 = r0.mo14227a()     // Catch:{ all -> 0x0559 }
            r0.mo14009h()     // Catch:{ all -> 0x0559 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0559 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0559 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r3, r10)     // Catch:{ all -> 0x0559 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n5 r10 = r13.f2703a     // Catch:{ all -> 0x0559 }
            android.content.Context r10 = r10.mo14231f()     // Catch:{ all -> 0x0559 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ all -> 0x0559 }
            if (r10 != 0) goto L_0x02fb
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14042y()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02be
        L_0x02fb:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r0, r15)     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0374
            boolean r17 = r10.isEmpty()     // Catch:{ all -> 0x0559 }
            if (r17 != 0) goto L_0x0374
            java.lang.Object r10 = r10.get(r15)     // Catch:{ all -> 0x0559 }
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch:{ all -> 0x0559 }
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0390
            java.lang.String r15 = r10.packageName     // Catch:{ all -> 0x0559 }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0559 }
            if (r10 == 0) goto L_0x0366
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0366
            boolean r3 = r13.mo14602a()     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0366
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0559 }
            r3.<init>(r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C0956a.m1580b()     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.n5 r10 = r13.f2703a     // Catch:{ RuntimeException -> 0x0351 }
            android.content.Context r10 = r10.mo14231f()     // Catch:{ RuntimeException -> 0x0351 }
            r15 = 1
            boolean r0 = r0.mo12423a(r10, r3, r14, r15)     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.n5 r3 = r13.f2703a     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ RuntimeException -> 0x0351 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14039v()     // Catch:{ RuntimeException -> 0x0351 }
            java.lang.String r14 = "Install Referrer Service is"
            java.lang.String r15 = "available"
            java.lang.String r16 = "not available"
            r10 = 1
            if (r10 == r0) goto L_0x034d
            r15 = r16
        L_0x034d:
            r3.mo14694b(r14, r15)     // Catch:{ RuntimeException -> 0x0351 }
            goto L_0x0390
        L_0x0351:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0559 }
            r3.mo14694b(r13, r0)     // Catch:{ all -> 0x0559 }
            goto L_0x0390
        L_0x0366:
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02be
        L_0x0374:
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14038u()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02be
        L_0x0382:
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2703a     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14042y()     // Catch:{ all -> 0x0559 }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02be
        L_0x0390:
            com.google.android.gms.measurement.internal.k5 r0 = r23.mo14227a()     // Catch:{ all -> 0x0559 }
            r0.mo14009h()     // Catch:{ all -> 0x0559 }
            r23.mo14476g()     // Catch:{ all -> 0x0559 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r3.<init>()     // Catch:{ all -> 0x0559 }
            r13 = 1
            r3.putLong(r8, r13)     // Catch:{ all -> 0x0559 }
            r3.putLong(r9, r13)     // Catch:{ all -> 0x0559 }
            r8 = 0
            r3.putLong(r7, r8)     // Catch:{ all -> 0x0559 }
            r3.putLong(r6, r8)     // Catch:{ all -> 0x0559 }
            r15 = r22
            r3.putLong(r15, r8)     // Catch:{ all -> 0x0559 }
            r14 = r21
            r3.putLong(r14, r8)     // Catch:{ all -> 0x0559 }
            r8 = 1
            r3.putLong(r5, r8)     // Catch:{ all -> 0x0559 }
            boolean r0 = r2.f2881p     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x03c5
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0559 }
        L_0x03c5:
            java.lang.String r0 = r2.f2866a     // Catch:{ all -> 0x0559 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C0917i.m1419j(r0)     // Catch:{ all -> 0x0559 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l r0 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r0)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.common.internal.C0917i.m1415f(r4)     // Catch:{ all -> 0x0559 }
            r0.mo14009h()     // Catch:{ all -> 0x0559 }
            r0.mo14128i()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "first_open_count"
            long r8 = r0.mo14316L(r4, r5)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2618l     // Catch:{ all -> 0x0559 }
            android.content.Context r0 = r0.mo14231f()     // Catch:{ all -> 0x0559 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0559 }
            if (r0 != 0) goto L_0x0405
            com.google.android.gms.measurement.internal.c4 r0 = r23.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ all -> 0x0559 }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r4)     // Catch:{ all -> 0x0559 }
            r0.mo14694b(r5, r4)     // Catch:{ all -> 0x0559 }
            r22 = r6
        L_0x0401:
            r4 = 0
            goto L_0x04c5
        L_0x0405:
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2618l     // Catch:{ NameNotFoundException -> 0x0415 }
            android.content.Context r0 = r0.mo14231f()     // Catch:{ NameNotFoundException -> 0x0415 }
            e0.b r0 = p028e0.C3144c.m8403a(r0)     // Catch:{ NameNotFoundException -> 0x0415 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.mo23629d(r4, r5)     // Catch:{ NameNotFoundException -> 0x0415 }
            goto L_0x0428
        L_0x0415:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r23.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r4)     // Catch:{ all -> 0x0559 }
            r5.mo14695c(r13, r10, r0)     // Catch:{ all -> 0x0559 }
            r0 = 0
        L_0x0428:
            if (r0 == 0) goto L_0x0484
            r21 = r14
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x0559 }
            r17 = 0
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            r22 = r6
            if (r5 == 0) goto L_0x0480
            long r5 = r0.lastUpdateTime     // Catch:{ all -> 0x0559 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0460
            com.google.android.gms.measurement.internal.g r0 = r23.mo14464T()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.n3 r5 = com.google.android.gms.measurement.internal.C1727o3.f2436d0     // Catch:{ all -> 0x0559 }
            r6 = 0
            boolean r0 = r0.mo14163B(r6, r5)     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x045a
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0458
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0559 }
            r0 = 0
            r8 = 0
            goto L_0x0462
        L_0x0458:
            r0 = 0
            goto L_0x0462
        L_0x045a:
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0559 }
            goto L_0x0458
        L_0x0460:
            r6 = 0
            r0 = 1
        L_0x0462:
            com.google.android.gms.measurement.internal.zzlo r5 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x046c
            r16 = 0
            goto L_0x046e
        L_0x046c:
            r16 = 1
        L_0x046e:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r13 = r5
            r7 = r21
            r6 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo14457A(r5, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0488
        L_0x0480:
            r6 = r15
            r7 = r21
            goto L_0x0488
        L_0x0484:
            r22 = r6
            r7 = r14
            r6 = r15
        L_0x0488:
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2618l     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.Context r0 = r0.mo14231f()     // Catch:{ NameNotFoundException -> 0x0498 }
            e0.b r0 = p028e0.C3144c.m8403a(r0)     // Catch:{ NameNotFoundException -> 0x0498 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo23627b(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            goto L_0x04ab
        L_0x0498:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r23.mo14228b()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0559 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r4)     // Catch:{ all -> 0x0559 }
            r5.mo14695c(r13, r4, r0)     // Catch:{ all -> 0x0559 }
            r0 = 0
        L_0x04ab:
            if (r0 == 0) goto L_0x0401
            int r4 = r0.flags     // Catch:{ all -> 0x0559 }
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x04b8
            r4 = 1
            r3.putLong(r6, r4)     // Catch:{ all -> 0x0559 }
        L_0x04b8:
            int r0 = r0.flags     // Catch:{ all -> 0x0559 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0401
            r4 = 1
            r3.putLong(r7, r4)     // Catch:{ all -> 0x0559 }
            goto L_0x0401
        L_0x04c5:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04ce
            r4 = r22
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0559 }
        L_0x04ce:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0559 }
            r15.<init>(r3)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            r1.mo14483k(r0, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0548
        L_0x04e3:
            r6 = r13
            r3 = r14
            com.google.android.gms.measurement.internal.zzlo r0 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0559 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0559 }
            r1.mo14457A(r0, r2)     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.k5 r0 = r23.mo14227a()     // Catch:{ all -> 0x0559 }
            r0.mo14009h()     // Catch:{ all -> 0x0559 }
            r23.mo14476g()     // Catch:{ all -> 0x0559 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0559 }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0559 }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x0559 }
            boolean r3 = r2.f2881p     // Catch:{ all -> 0x0559 }
            if (r3 == 0) goto L_0x0518
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0559 }
        L_0x0518:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
        L_0x0529:
            r1.mo14483k(r3, r2)     // Catch:{ all -> 0x0559 }
            goto L_0x0548
        L_0x052d:
            boolean r0 = r2.f2874i     // Catch:{ all -> 0x0559 }
            if (r0 == 0) goto L_0x0548
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0559 }
            r0.<init>()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x0559 }
            r15.<init>(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0559 }
            goto L_0x0529
        L_0x0548:
            com.google.android.gms.measurement.internal.l r0 = r1.f2609c     // Catch:{ all -> 0x0559 }
            m4628Q(r0)     // Catch:{ all -> 0x0559 }
            r0.mo14340o()     // Catch:{ all -> 0x0559 }
            com.google.android.gms.measurement.internal.l r0 = r1.f2609c
            m4628Q(r0)
            r0.mo14335f0()
            return
        L_0x0559:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r1.f2609c
            m4628Q(r2)
            r2.mo14335f0()
            throw r0
        L_0x0563:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1770ra.mo14489p(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo14490q() {
        this.f2623q++;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo14491r(zzac zzac) {
        zzq H = m4619H((String) C0917i.m1419j(zzac.f2843a));
        if (H != null) {
            mo14492s(zzac, H);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo14492s(zzac zzac, zzq zzq) {
        C0917i.m1419j(zzac);
        C0917i.m1415f(zzac.f2843a);
        C0917i.m1419j(zzac.f2845c);
        C0917i.m1415f(zzac.f2845c.f2860b);
        mo14227a().mo14009h();
        mo14476g();
        if (m4627P(zzq)) {
            if (zzq.f2873h) {
                C1686l lVar = this.f2609c;
                m4628Q(lVar);
                lVar.mo14334e0();
                try {
                    mo14462R(zzq);
                    String str = (String) C0917i.m1419j(zzac.f2843a);
                    C1686l lVar2 = this.f2609c;
                    m4628Q(lVar2);
                    zzac S = lVar2.mo14323S(str, zzac.f2845c.f2860b);
                    if (S != null) {
                        mo14228b().mo14034q().mo14695c("Removing conditional user property", zzac.f2843a, this.f2618l.mo14373D().mo14619f(zzac.f2845c.f2860b));
                        C1686l lVar3 = this.f2609c;
                        m4628Q(lVar3);
                        lVar3.mo14315J(str, zzac.f2845c.f2860b);
                        if (S.f2847e) {
                            C1686l lVar4 = this.f2609c;
                            m4628Q(lVar4);
                            lVar4.mo14338m(str, zzac.f2845c.f2860b);
                        }
                        zzaw zzaw = zzac.f2853k;
                        if (zzaw != null) {
                            zzau zzau = zzaw.f2856b;
                            mo14459C((zzaw) C0917i.m1419j(mo14477g0().mo14687w0(str, ((zzaw) C0917i.m1419j(zzac.f2853k)).f2855a, zzau != null ? zzau.mo14704c0() : null, S.f2844b, zzac.f2853k.f2858d, true, true)), zzq);
                        }
                    } else {
                        mo14228b().mo14040w().mo14695c("Conditional user property doesn't exist", C1574c4.m4083z(zzac.f2843a), this.f2618l.mo14373D().mo14619f(zzac.f2845c.f2860b));
                    }
                    C1686l lVar5 = this.f2609c;
                    m4628Q(lVar5);
                    lVar5.mo14340o();
                } finally {
                    C1686l lVar6 = this.f2609c;
                    m4628Q(lVar6);
                    lVar6.mo14335f0();
                }
            } else {
                mo14462R(zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo14493t(zzlo zzlo, zzq zzq) {
        mo14227a().mo14009h();
        mo14476g();
        if (m4627P(zzq)) {
            if (!zzq.f2873h) {
                mo14462R(zzq);
            } else if (!"_npa".equals(zzlo.f2860b) || zzq.f2883r == null) {
                mo14228b().mo14034q().mo14694b("Removing user property", this.f2618l.mo14373D().mo14619f(zzlo.f2860b));
                C1686l lVar = this.f2609c;
                m4628Q(lVar);
                lVar.mo14334e0();
                try {
                    mo14462R(zzq);
                    C1081eb.m1900b();
                    if (this.f2618l.mo14402z().mo14163B((String) null, C1727o3.f2452l0) && this.f2618l.mo14402z().mo14163B((String) null, C1727o3.f2456n0) && "_id".equals(zzlo.f2860b)) {
                        C1686l lVar2 = this.f2609c;
                        m4628Q(lVar2);
                        lVar2.mo14338m((String) C0917i.m1419j(zzq.f2866a), "_lair");
                    }
                    C1686l lVar3 = this.f2609c;
                    m4628Q(lVar3);
                    lVar3.mo14338m((String) C0917i.m1419j(zzq.f2866a), zzlo.f2860b);
                    C1686l lVar4 = this.f2609c;
                    m4628Q(lVar4);
                    lVar4.mo14340o();
                    mo14228b().mo14034q().mo14694b("User property removed", this.f2618l.mo14373D().mo14619f(zzlo.f2860b));
                } finally {
                    C1686l lVar5 = this.f2609c;
                    m4628Q(lVar5);
                    lVar5.mo14335f0();
                }
            } else {
                mo14228b().mo14034q().mo14693a("Falling back to manifest metadata value for ad personalization");
                mo14457A(new zzlo("_npa", mo14229c().mo11029a(), Long.valueOf(true != zzq.f2883r.booleanValue() ? 0 : 1), "auto"), zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: u */
    public final void mo14494u(zzq zzq) {
        if (this.f2630x != null) {
            ArrayList arrayList = new ArrayList();
            this.f2631y = arrayList;
            arrayList.addAll(this.f2630x);
        }
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        String str = (String) C0917i.m1419j(zzq.f2866a);
        C0917i.m1415f(str);
        lVar.mo14009h();
        lVar.mo14128i();
        try {
            SQLiteDatabase P = lVar.mo14320P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                lVar.f2143a.mo14228b().mo14039v().mo14695c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            lVar.f2143a.mo14228b().mo14035r().mo14695c("Error resetting analytics data. appId, error", C1574c4.m4083z(str), e);
        }
        if (zzq.f2873h) {
            mo14489p(zzq);
        }
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo14495v(String str, C1552a8 a8Var) {
        mo14227a().mo14009h();
        String str2 = this.f2605D;
        if (str2 == null || str2.equals(str) || a8Var != null) {
            this.f2605D = str;
            this.f2604C = a8Var;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: w */
    public final void mo14496w() {
        mo14227a().mo14009h();
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        lVar.mo14337h0();
        if (this.f2615i.f2285j.mo14368a() == 0) {
            this.f2615i.f2285j.mo14369b(mo14229c().mo11029a());
        }
        m4623L();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo14497x(zzac zzac) {
        zzq H = m4619H((String) C0917i.m1419j(zzac.f2843a));
        if (H != null) {
            mo14498y(zzac, H);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo14498y(zzac zzac, zzq zzq) {
        C1859z3 r;
        String str;
        Object z;
        String f;
        Object V;
        C1859z3 r2;
        String str2;
        Object z2;
        String f2;
        Object obj;
        C0917i.m1419j(zzac);
        C0917i.m1415f(zzac.f2843a);
        C0917i.m1419j(zzac.f2844b);
        C0917i.m1419j(zzac.f2845c);
        C0917i.m1415f(zzac.f2845c.f2860b);
        mo14227a().mo14009h();
        mo14476g();
        if (m4627P(zzq)) {
            if (!zzq.f2873h) {
                mo14462R(zzq);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z3 = false;
            zzac2.f2847e = false;
            C1686l lVar = this.f2609c;
            m4628Q(lVar);
            lVar.mo14334e0();
            try {
                C1686l lVar2 = this.f2609c;
                m4628Q(lVar2);
                zzac S = lVar2.mo14323S((String) C0917i.m1419j(zzac2.f2843a), zzac2.f2845c.f2860b);
                if (S != null && !S.f2844b.equals(zzac2.f2844b)) {
                    mo14228b().mo14040w().mo14696d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f2618l.mo14373D().mo14619f(zzac2.f2845c.f2860b), zzac2.f2844b, S.f2844b);
                }
                if (S != null && S.f2847e) {
                    zzac2.f2844b = S.f2844b;
                    zzac2.f2846d = S.f2846d;
                    zzac2.f2850h = S.f2850h;
                    zzac2.f2848f = S.f2848f;
                    zzac2.f2851i = S.f2851i;
                    zzac2.f2847e = true;
                    zzlo zzlo = zzac2.f2845c;
                    zzac2.f2845c = new zzlo(zzlo.f2860b, S.f2845c.f2861c, zzlo.mo14714V(), S.f2845c.f2864f);
                } else if (TextUtils.isEmpty(zzac2.f2848f)) {
                    zzlo zzlo2 = zzac2.f2845c;
                    zzac2.f2845c = new zzlo(zzlo2.f2860b, zzac2.f2846d, zzlo2.mo14714V(), zzac2.f2845c.f2864f);
                    zzac2.f2847e = true;
                    z3 = true;
                }
                if (zzac2.f2847e) {
                    zzlo zzlo3 = zzac2.f2845c;
                    C1818va vaVar = new C1818va((String) C0917i.m1419j(zzac2.f2843a), zzac2.f2844b, zzlo3.f2860b, zzlo3.f2861c, C0917i.m1419j(zzlo3.mo14714V()));
                    C1686l lVar3 = this.f2609c;
                    m4628Q(lVar3);
                    if (lVar3.mo14349x(vaVar)) {
                        r2 = mo14228b().mo14034q();
                        str2 = "User property updated immediately";
                        z2 = zzac2.f2843a;
                        f2 = this.f2618l.mo14373D().mo14619f(vaVar.f2732c);
                        obj = vaVar.f2734e;
                    } else {
                        r2 = mo14228b().mo14035r();
                        str2 = "(2)Too many active user properties, ignoring";
                        z2 = C1574c4.m4083z(zzac2.f2843a);
                        f2 = this.f2618l.mo14373D().mo14619f(vaVar.f2732c);
                        obj = vaVar.f2734e;
                    }
                    r2.mo14696d(str2, z2, f2, obj);
                    if (z3 && zzac2.f2851i != null) {
                        mo14459C(new zzaw(zzac2.f2851i, zzac2.f2846d), zzq);
                    }
                }
                C1686l lVar4 = this.f2609c;
                m4628Q(lVar4);
                if (lVar4.mo14348w(zzac2)) {
                    r = mo14228b().mo14034q();
                    str = "Conditional property added";
                    z = zzac2.f2843a;
                    f = this.f2618l.mo14373D().mo14619f(zzac2.f2845c.f2860b);
                    V = zzac2.f2845c.mo14714V();
                } else {
                    r = mo14228b().mo14035r();
                    str = "Too many conditional properties, ignoring";
                    z = C1574c4.m4083z(zzac2.f2843a);
                    f = this.f2618l.mo14373D().mo14619f(zzac2.f2845c.f2860b);
                    V = zzac2.f2845c.mo14714V();
                }
                r.mo14696d(str, z, f, V);
                C1686l lVar5 = this.f2609c;
                m4628Q(lVar5);
                lVar5.mo14340o();
            } finally {
                C1686l lVar6 = this.f2609c;
                m4628Q(lVar6);
                lVar6.mo14335f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: z */
    public final void mo14499z(String str, C1634h hVar) {
        mo14227a().mo14009h();
        mo14476g();
        this.f2602A.put(str, hVar);
        C1686l lVar = this.f2609c;
        m4628Q(lVar);
        C0917i.m1419j(str);
        C0917i.m1419j(hVar);
        lVar.mo14009h();
        lVar.mo14128i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("consent_state", hVar.mo14219h());
        try {
            if (lVar.mo14320P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                lVar.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert/update consent setting (got -1). appId", C1574c4.m4083z(str));
            }
        } catch (SQLiteException e) {
            lVar.f2143a.mo14228b().mo14035r().mo14695c("Error storing consent setting. appId, error", C1574c4.m4083z(str), e);
        }
    }
}
