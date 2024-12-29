package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1651e;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1715b1;
import com.google.android.gms.internal.measurement.C1832ia;
import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1905n0;
import com.google.android.gms.internal.measurement.C1994t0;
import com.google.android.gms.internal.measurement.C2024v0;
import com.google.android.gms.internal.measurement.C2036v9;
import com.google.android.gms.internal.measurement.C2056x0;
import com.google.android.gms.internal.measurement.zzaa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
public class C2245l9 implements C2385y5 {

    /* renamed from: x */
    private static volatile C2245l9 f4315x;

    /* renamed from: a */
    private C2351v4 f4316a;

    /* renamed from: b */
    private C2158e4 f4317b;

    /* renamed from: c */
    private C2129c f4318c;

    /* renamed from: d */
    private C2194h4 f4319d;

    /* renamed from: e */
    private C2199h9 f4320e;

    /* renamed from: f */
    private C2116aa f4321f;

    /* renamed from: g */
    private final C2290p9 f4322g;

    /* renamed from: h */
    private C2232k7 f4323h;

    /* renamed from: i */
    private final C2111a5 f4324i;

    /* renamed from: j */
    private boolean f4325j;

    /* renamed from: k */
    private boolean f4326k;
    @VisibleForTesting

    /* renamed from: l */
    private long f4327l;

    /* renamed from: m */
    private List<Runnable> f4328m;

    /* renamed from: n */
    private int f4329n;

    /* renamed from: o */
    private int f4330o;

    /* renamed from: p */
    private boolean f4331p;

    /* renamed from: q */
    private boolean f4332q;

    /* renamed from: r */
    private boolean f4333r;

    /* renamed from: s */
    private FileLock f4334s;

    /* renamed from: t */
    private FileChannel f4335t;

    /* renamed from: u */
    private List<Long> f4336u;

    /* renamed from: v */
    private List<Long> f4337v;

    /* renamed from: w */
    private long f4338w;

    /* renamed from: com.google.android.gms.measurement.internal.l9$a */
    class C2246a implements C2153e {

        /* renamed from: a */
        C2056x0 f4339a;

        /* renamed from: b */
        List<Long> f4340b;

        /* renamed from: c */
        List<C1994t0> f4341c;

        /* renamed from: d */
        private long f4342d;

        private C2246a(C2245l9 l9Var) {
        }

        /* synthetic */ C2246a(C2245l9 l9Var, C2234k9 k9Var) {
            this(l9Var);
        }

        /* renamed from: c */
        private static long m7281c(C1994t0 t0Var) {
            return ((t0Var.mo12067W() / 1000) / 60) / 60;
        }

        /* renamed from: a */
        public final void mo12649a(C2056x0 x0Var) {
            C1609u.m4475k(x0Var);
            this.f4339a = x0Var;
        }

        /* renamed from: b */
        public final boolean mo12650b(long j, C1994t0 t0Var) {
            C1609u.m4475k(t0Var);
            if (this.f4341c == null) {
                this.f4341c = new ArrayList();
            }
            if (this.f4340b == null) {
                this.f4340b = new ArrayList();
            }
            if (this.f4341c.size() > 0 && m7281c(this.f4341c.get(0)) != m7281c(t0Var)) {
                return false;
            }
            long j2 = this.f4342d + ((long) t0Var.mo11846j());
            if (j2 >= ((long) Math.max(0, C2302r.f4517i.mo12867a(null).intValue()))) {
                return false;
            }
            this.f4342d = j2;
            this.f4341c.add(t0Var);
            this.f4340b.add(Long.valueOf(j));
            return this.f4341c.size() < Math.max(1, C2302r.f4519j.mo12867a(null).intValue());
        }
    }

    private C2245l9(C2301q9 q9Var) {
        this(q9Var, (C2111a5) null);
    }

    private C2245l9(C2301q9 q9Var, C2111a5 a5Var) {
        this.f4325j = false;
        C1609u.m4475k(q9Var);
        this.f4324i = C2111a5.m6707d(q9Var.f4456a, (zzaa) null, (Long) null);
        this.f4338w = -1;
        C2290p9 p9Var = new C2290p9(this);
        p9Var.mo12750s();
        this.f4322g = p9Var;
        C2158e4 e4Var = new C2158e4(this);
        e4Var.mo12750s();
        this.f4317b = e4Var;
        C2351v4 v4Var = new C2351v4(this);
        v4Var.mo12750s();
        this.f4316a = v4Var;
        this.f4324i.mo12426a().mo13122y(new C2234k9(this, q9Var));
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: B */
    private final boolean m7217B(int i, FileChannel fileChannel) {
        m7233i0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f4324i.mo12427b().mo13096F().mo13130a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.f4324i.mo12443x().mo12474s(C2302r.f4458A0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f4324i.mo12427b().mo13096F().mo13131b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f4324i.mo12427b().mo13096F().mo13131b("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: C */
    private final boolean m7218C(C1994t0.C1995a aVar, C1994t0.C1995a aVar2) {
        C1609u.m4465a("_e".equals(aVar.mo12081O()));
        mo12822Y();
        C2024v0 x = C2290p9.m7351x((C1994t0) ((C1889m4) aVar.mo11851I()), "_sc");
        String str = null;
        String T = x == null ? null : x.mo12106T();
        mo12822Y();
        C2024v0 x2 = C2290p9.m7351x((C1994t0) ((C1889m4) aVar2.mo11851I()), "_pc");
        if (x2 != null) {
            str = x2.mo12106T();
        }
        if (str == null || !str.equals(T)) {
            return false;
        }
        m7223J(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023f, code lost:
        if (r5 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r5 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021b, code lost:
        if (r5 == null) goto L_0x0243;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0247 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0255 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0397 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0399 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x039c A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x039d A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x058b A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0662 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x07fd A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0819 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0833 A[Catch:{ SQLiteException -> 0x0ee9, all -> 0x0f24 }] */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0f0c A[SYNTHETIC, Splitter:B:550:0x0f0c] */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0f20 A[SYNTHETIC, Splitter:B:557:0x0f20] */
    @androidx.annotation.WorkerThread
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m7219D(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_npa"
            java.lang.String r3 = ""
            com.google.android.gms.measurement.internal.c r4 = r43.mo12819U()
            r4.mo12524u0()
            com.google.android.gms.measurement.internal.l9$a r4 = new com.google.android.gms.measurement.internal.l9$a     // Catch:{ all -> 0x0f24 }
            r5 = 0
            r4.<init>(r1, r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.c r6 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            long r7 = r1.f4338w     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.common.internal.C1609u.m4475k(r4)     // Catch:{ all -> 0x0f24 }
            r6.mo12567h()     // Catch:{ all -> 0x0f24 }
            r6.mo12749r()     // Catch:{ all -> 0x0f24 }
            r10 = -1
            r12 = 2
            r13 = 0
            r14 = 1
            android.database.sqlite.SQLiteDatabase r15 = r6.mo12525v()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            if (r16 == 0) goto L_0x0097
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x0049
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r16 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r13] = r16     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r16 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x0044 }
            r9[r14] = r16     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r7 = r0
            r9 = r5
            goto L_0x022e
        L_0x0049:
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r16 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9[r13] = r16     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        L_0x0051:
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 == 0) goto L_0x005a
            java.lang.String r16 = "rowid <= ? and "
            r45 = r16
            goto L_0x005c
        L_0x005a:
            r45 = r3
        L_0x005c:
            int r5 = r45.length()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            int r5 = r5 + 148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r12.<init>(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = "select app_id, metadata_fingerprint from raw_events where "
            r12.append(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r5 = r45
            r12.append(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r12.append(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = r12.toString()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0222 }
            if (r9 != 0) goto L_0x008b
            if (r5 == 0) goto L_0x0243
        L_0x0086:
            r5.close()     // Catch:{ all -> 0x0f24 }
            goto L_0x0243
        L_0x008b:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0222 }
            java.lang.String r12 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x021f }
            r5.close()     // Catch:{ SQLiteException -> 0x021f }
            goto L_0x00e6
        L_0x0097:
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a8
            r5 = 2
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r5 = 0
            r9[r13] = r5     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9[r14] = r5     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            goto L_0x00ad
        L_0x00a8:
            r5 = 0
            java.lang.String[] r9 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        L_0x00ad:
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00b4
            java.lang.String r5 = " and rowid <= ?"
            goto L_0x00b5
        L_0x00b4:
            r5 = r3
        L_0x00b5:
            int r12 = r5.length()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            int r12 = r12 + 84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r10.<init>(r12)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.append(r11)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r10.append(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = " order by rowid limit 1;"
            r10.append(r5)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r5 = r10.toString()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0222 }
            if (r9 != 0) goto L_0x00de
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x00de:
            java.lang.String r12 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0222 }
            r5.close()     // Catch:{ SQLiteException -> 0x0222 }
            r9 = 0
        L_0x00e6:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r10 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x021f }
            r11[r13] = r9     // Catch:{ SQLiteException -> 0x021f }
            r11[r14] = r12     // Catch:{ SQLiteException -> 0x021f }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "2"
            r10 = r15
            r15 = r10
            r19 = r11
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x021f }
            boolean r11 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021f }
            if (r11 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.w3 r7 = r6.mo12427b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13096F()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ SQLiteException -> 0x021f }
            r7.mo13131b(r8, r10)     // Catch:{ SQLiteException -> 0x021f }
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x0122:
            byte[] r11 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.x0$a r15 = com.google.android.gms.internal.measurement.C2056x0.m6324N0()     // Catch:{ IOException -> 0x0208 }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r15, r11)     // Catch:{ IOException -> 0x0208 }
            com.google.android.gms.internal.measurement.x0$a r15 = (com.google.android.gms.internal.measurement.C2056x0.C2057a) r15     // Catch:{ IOException -> 0x0208 }
            com.google.android.gms.internal.measurement.x5 r11 = r15.mo11851I()     // Catch:{ IOException -> 0x0208 }
            com.google.android.gms.internal.measurement.m4 r11 = (com.google.android.gms.internal.measurement.C1889m4) r11     // Catch:{ IOException -> 0x0208 }
            com.google.android.gms.internal.measurement.x0 r11 = (com.google.android.gms.internal.measurement.C2056x0) r11     // Catch:{ IOException -> 0x0208 }
            boolean r15 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021f }
            if (r15 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.w3 r15 = r6.mo12427b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.y3 r15 = r15.mo13099J()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ SQLiteException -> 0x021f }
            r15.mo13131b(r14, r13)     // Catch:{ SQLiteException -> 0x021f }
        L_0x014e:
            r5.close()     // Catch:{ SQLiteException -> 0x021f }
            r4.mo12649a(r11)     // Catch:{ SQLiteException -> 0x021f }
            r13 = -1
            int r11 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0171
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x021f }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x021f }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x021f }
            r8 = 2
            r14[r8] = r7     // Catch:{ SQLiteException -> 0x021f }
            r18 = r11
            r19 = r14
            goto L_0x0180
        L_0x0171:
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x021f }
            r8 = 0
            r11[r8] = r9     // Catch:{ SQLiteException -> 0x021f }
            r8 = 1
            r11[r8] = r12     // Catch:{ SQLiteException -> 0x021f }
            r18 = r7
            r19 = r11
        L_0x0180:
            java.lang.String r16 = "raw_events"
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r11 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r17 = new java.lang.String[]{r7, r8, r11, r12}     // Catch:{ SQLiteException -> 0x021f }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            r23 = 0
            r15 = r10
            android.database.Cursor r5 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x021f }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021f }
            if (r7 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.w3 r7 = r6.mo12427b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13099J()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ SQLiteException -> 0x021f }
            r7.mo13131b(r8, r10)     // Catch:{ SQLiteException -> 0x021f }
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x01b6:
            r7 = 0
            long r10 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x021f }
            r7 = 3
            byte[] r8 = r5.getBlob(r7)     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.t0$a r7 = com.google.android.gms.internal.measurement.C1994t0.m5974c0()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r7, r8)     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.t0$a r7 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r7     // Catch:{ IOException -> 0x01eb }
            r8 = 1
            java.lang.String r12 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x021f }
            r7.mo12074A(r12)     // Catch:{ SQLiteException -> 0x021f }
            r8 = 2
            long r12 = r5.getLong(r8)     // Catch:{ SQLiteException -> 0x021f }
            r7.mo12086w(r12)     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.x5 r7 = r7.mo11851I()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.m4 r7 = (com.google.android.gms.internal.measurement.C1889m4) r7     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.t0 r7 = (com.google.android.gms.internal.measurement.C1994t0) r7     // Catch:{ SQLiteException -> 0x021f }
            boolean r7 = r4.mo12650b(r10, r7)     // Catch:{ SQLiteException -> 0x021f }
            if (r7 != 0) goto L_0x01fe
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x01eb:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.w3 r8 = r6.mo12427b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13096F()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ SQLiteException -> 0x021f }
            r8.mo13132c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x021f }
        L_0x01fe:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021f }
            if (r7 != 0) goto L_0x01b6
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x0208:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.w3 r8 = r6.mo12427b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13096F()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ SQLiteException -> 0x021f }
            r8.mo13132c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x021f }
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x021f:
            r0 = move-exception
            r7 = r0
            goto L_0x022e
        L_0x0222:
            r0 = move-exception
            r7 = r0
            goto L_0x022d
        L_0x0225:
            r0 = move-exception
            r2 = r0
            r5 = 0
            goto L_0x0f1e
        L_0x022a:
            r0 = move-exception
            r7 = r0
            r5 = 0
        L_0x022d:
            r9 = 0
        L_0x022e:
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()     // Catch:{ all -> 0x0f1c }
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13096F()     // Catch:{ all -> 0x0f1c }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ all -> 0x0f1c }
            r6.mo13132c(r8, r9, r7)     // Catch:{ all -> 0x0f1c }
            if (r5 == 0) goto L_0x0243
            goto L_0x0086
        L_0x0243:
            java.util.List<com.google.android.gms.internal.measurement.t0> r5 = r4.f4341c     // Catch:{ all -> 0x0f24 }
            if (r5 == 0) goto L_0x0252
            java.util.List<com.google.android.gms.internal.measurement.t0> r5 = r4.f4341c     // Catch:{ all -> 0x0f24 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0f24 }
            if (r5 == 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r5 = 0
            goto L_0x0253
        L_0x0252:
            r5 = 1
        L_0x0253:
            if (r5 != 0) goto L_0x0f0c
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r5 = r5.mo11850u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0$a r5 = (com.google.android.gms.internal.measurement.C2056x0.C2057a) r5     // Catch:{ all -> 0x0f24 }
            r5.mo12283Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r6 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r7 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2302r.f4496V     // Catch:{ all -> 0x0f24 }
            boolean r6 = r6.mo12456B(r7, r8)     // Catch:{ all -> 0x0f24 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x027b:
            java.util.List<com.google.android.gms.internal.measurement.t0> r9 = r4.f4341c     // Catch:{ all -> 0x0f24 }
            int r9 = r9.size()     // Catch:{ all -> 0x0f24 }
            r18 = r3
            java.lang.String r3 = "_fr"
            r19 = r13
            java.lang.String r13 = "_et"
            r20 = r2
            java.lang.String r2 = "_e"
            r21 = r14
            r22 = r15
            if (r12 >= r9) goto L_0x088c
            java.util.List<com.google.android.gms.internal.measurement.t0> r9 = r4.f4341c     // Catch:{ all -> 0x0f24 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r9 = (com.google.android.gms.internal.measurement.C1994t0) r9     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r9 = r9.mo11850u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0$a r9 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r9     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.v4 r14 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r15 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = r15.mo12206I2()     // Catch:{ all -> 0x0f24 }
            r16 = r12
            java.lang.String r12 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r12 = r14.mo13067A(r15, r12)     // Catch:{ all -> 0x0f24 }
            java.lang.String r14 = "_err"
            if (r12 == 0) goto L_0x0336
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.x0 r12 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = r12.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r12)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r13 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo12413H()     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r13 = r13.mo12995v(r15)     // Catch:{ all -> 0x0f24 }
            r2.mo13132c(r3, r12, r13)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.v4 r2 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r3 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r3.mo12206I2()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo13074H(r3)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x0303
            com.google.android.gms.measurement.internal.v4 r2 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r3 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r3.mo12206I2()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo13075J(r3)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r2 = 0
            goto L_0x0304
        L_0x0303:
            r2 = 1
        L_0x0304:
            if (r2 != 0) goto L_0x0329
            java.lang.String r2 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x0329
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.s9 r24 = r2.mo12412G()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r2 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r25 = r2.mo12206I2()     // Catch:{ all -> 0x0f24 }
            r26 = 11
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            r29 = 0
            r24.mo12965U(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0f24 }
        L_0x0329:
            r26 = r6
            r12 = r16
            r13 = r19
            r14 = r21
            r15 = r22
            r6 = r5
            goto L_0x0881
        L_0x0336:
            com.google.android.gms.measurement.internal.v4 r12 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r15 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = r15.mo12206I2()     // Catch:{ all -> 0x0f24 }
            r26 = r6
            java.lang.String r6 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r6 = r12.mo13069C(r15, r6)     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x03a8
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.common.internal.C1609u.m4471g(r15)     // Catch:{ all -> 0x0f24 }
            r27 = r7
            int r7 = r15.hashCode()     // Catch:{ all -> 0x0f24 }
            r28 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r7 == r10) goto L_0x0384
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r7 == r10) goto L_0x037a
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r7 == r10) goto L_0x0370
            goto L_0x038e
        L_0x0370:
            java.lang.String r7 = "_ui"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x038e
            r7 = 1
            goto L_0x038f
        L_0x037a:
            java.lang.String r7 = "_ug"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x038e
            r7 = 2
            goto L_0x038f
        L_0x0384:
            java.lang.String r7 = "_in"
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x038e
            r7 = 0
            goto L_0x038f
        L_0x038e:
            r7 = -1
        L_0x038f:
            if (r7 == 0) goto L_0x0399
            r10 = 1
            if (r7 == r10) goto L_0x0399
            r10 = 2
            if (r7 == r10) goto L_0x0399
            r7 = 0
            goto L_0x039a
        L_0x0399:
            r7 = 1
        L_0x039a:
            if (r7 == 0) goto L_0x039d
            goto L_0x03ac
        L_0x039d:
            r30 = r5
            r31 = r8
            r10 = r11
            r29 = r13
            r13 = r2
            r11 = r3
            goto L_0x0589
        L_0x03a8:
            r27 = r7
            r28 = r10
        L_0x03ac:
            r29 = r13
            r7 = 0
            r10 = 0
            r15 = 0
        L_0x03b1:
            int r13 = r9.mo12077E()     // Catch:{ all -> 0x0f24 }
            r30 = r5
            java.lang.String r5 = "_r"
            if (r15 >= r13) goto L_0x041b
            com.google.android.gms.internal.measurement.v0 r13 = r9.mo12075B(r15)     // Catch:{ all -> 0x0f24 }
            java.lang.String r13 = r13.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x0f24 }
            if (r13 == 0) goto L_0x03e7
            com.google.android.gms.internal.measurement.v0 r5 = r9.mo12075B(r15)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r5 = r5.mo11850u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r5 = (com.google.android.gms.internal.measurement.C2024v0.C2025a) r5     // Catch:{ all -> 0x0f24 }
            r13 = r8
            r7 = 1
            r5.mo12120w(r7)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r5 = r5.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C1889m4) r5     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r5 = (com.google.android.gms.internal.measurement.C2024v0) r5     // Catch:{ all -> 0x0f24 }
            r9.mo12085v(r15, r5)     // Catch:{ all -> 0x0f24 }
            r8 = r11
            r7 = 1
            goto L_0x0414
        L_0x03e7:
            r13 = r8
            com.google.android.gms.internal.measurement.v0 r8 = r9.mo12075B(r15)     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = r8.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0f24 }
            if (r5 == 0) goto L_0x0413
            com.google.android.gms.internal.measurement.v0 r5 = r9.mo12075B(r15)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r5 = r5.mo11850u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r5 = (com.google.android.gms.internal.measurement.C2024v0.C2025a) r5     // Catch:{ all -> 0x0f24 }
            r8 = r11
            r10 = 1
            r5.mo12120w(r10)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r5 = r5.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C1889m4) r5     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r5 = (com.google.android.gms.internal.measurement.C2024v0) r5     // Catch:{ all -> 0x0f24 }
            r9.mo12085v(r15, r5)     // Catch:{ all -> 0x0f24 }
            r10 = 1
            goto L_0x0414
        L_0x0413:
            r8 = r11
        L_0x0414:
            int r15 = r15 + 1
            r11 = r8
            r8 = r13
            r5 = r30
            goto L_0x03b1
        L_0x041b:
            r13 = r8
            r8 = r11
            if (r7 != 0) goto L_0x0452
            if (r6 == 0) goto L_0x0452
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13104O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.a5 r15 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.u3 r15 = r15.mo12413H()     // Catch:{ all -> 0x0f24 }
            r31 = r13
            java.lang.String r13 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r13 = r15.mo12995v(r13)     // Catch:{ all -> 0x0f24 }
            r7.mo13131b(r11, r13)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r7 = com.google.android.gms.internal.measurement.C2024v0.m6072d0()     // Catch:{ all -> 0x0f24 }
            r7.mo12123z(r12)     // Catch:{ all -> 0x0f24 }
            r13 = r2
            r11 = r3
            r2 = 1
            r7.mo12120w(r2)     // Catch:{ all -> 0x0f24 }
            r9.mo12087x(r7)     // Catch:{ all -> 0x0f24 }
            goto L_0x0456
        L_0x0452:
            r11 = r3
            r31 = r13
            r13 = r2
        L_0x0456:
            if (r10 != 0) goto L_0x0486
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13104O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12413H()     // Catch:{ all -> 0x0f24 }
            java.lang.String r10 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12995v(r10)     // Catch:{ all -> 0x0f24 }
            r2.mo13131b(r3, r7)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r2 = com.google.android.gms.internal.measurement.C2024v0.m6072d0()     // Catch:{ all -> 0x0f24 }
            r2.mo12123z(r5)     // Catch:{ all -> 0x0f24 }
            r3 = r8
            r7 = 1
            r2.mo12120w(r7)     // Catch:{ all -> 0x0f24 }
            r9.mo12087x(r2)     // Catch:{ all -> 0x0f24 }
            goto L_0x0487
        L_0x0486:
            r3 = r8
        L_0x0487:
            com.google.android.gms.measurement.internal.c r32 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            long r33 = r43.m7234j0()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r2 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r35 = r2.mo12206I2()     // Catch:{ all -> 0x0f24 }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            com.google.android.gms.measurement.internal.f r2 = r32.mo12490B(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f24 }
            long r7 = r2.f4105e     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r10 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r10 = r10.mo12206I2()     // Catch:{ all -> 0x0f24 }
            int r2 = r2.mo12475t(r10)     // Catch:{ all -> 0x0f24 }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x0f24 }
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x04bf
            m7237l(r9, r5)     // Catch:{ all -> 0x0f24 }
            goto L_0x04c1
        L_0x04bf:
            r19 = 1
        L_0x04c1:
            java.lang.String r2 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r2 = com.google.android.gms.measurement.internal.C2323s9.m7567b0(r2)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0589
            if (r6 == 0) goto L_0x0589
            com.google.android.gms.measurement.internal.c r32 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            long r33 = r43.m7234j0()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r2 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r35 = r2.mo12206I2()     // Catch:{ all -> 0x0f24 }
            r36 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            com.google.android.gms.measurement.internal.f r2 = r32.mo12490B(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0f24 }
            long r2 = r2.f4103c     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r5 = r5.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r7 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2302r.f4527n     // Catch:{ all -> 0x0f24 }
            int r5 = r5.mo12476u(r7, r8)     // Catch:{ all -> 0x0f24 }
            long r7 = (long) r5     // Catch:{ all -> 0x0f24 }
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0589
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x0f24 }
            r2.mo13131b(r3, r5)     // Catch:{ all -> 0x0f24 }
            r2 = -1
            r3 = 0
            r5 = 0
            r7 = 0
        L_0x051f:
            int r8 = r9.mo12077E()     // Catch:{ all -> 0x0f24 }
            if (r7 >= r8) goto L_0x054a
            com.google.android.gms.internal.measurement.v0 r8 = r9.mo12075B(r7)     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = r8.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x0f24 }
            if (r15 == 0) goto L_0x053c
            com.google.android.gms.internal.measurement.m4$b r2 = r8.mo11850u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r2 = (com.google.android.gms.internal.measurement.C2024v0.C2025a) r2     // Catch:{ all -> 0x0f24 }
            r3 = r2
            r2 = r7
            goto L_0x0547
        L_0x053c:
            java.lang.String r8 = r8.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x0f24 }
            if (r8 == 0) goto L_0x0547
            r5 = 1
        L_0x0547:
            int r7 = r7 + 1
            goto L_0x051f
        L_0x054a:
            if (r5 == 0) goto L_0x0552
            if (r3 == 0) goto L_0x0552
            r9.mo12078F(r2)     // Catch:{ all -> 0x0f24 }
            goto L_0x0589
        L_0x0552:
            if (r3 == 0) goto L_0x0570
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r3 = (com.google.android.gms.internal.measurement.C1889m4.C1891b) r3     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0$a r3 = (com.google.android.gms.internal.measurement.C2024v0.C2025a) r3     // Catch:{ all -> 0x0f24 }
            r3.mo12123z(r14)     // Catch:{ all -> 0x0f24 }
            r7 = 10
            r3.mo12120w(r7)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r3 = r3.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r3 = (com.google.android.gms.internal.measurement.C1889m4) r3     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C2024v0) r3     // Catch:{ all -> 0x0f24 }
            r9.mo12085v(r2, r3)     // Catch:{ all -> 0x0f24 }
            goto L_0x0589
        L_0x0570:
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x0f24 }
            r2.mo13131b(r3, r5)     // Catch:{ all -> 0x0f24 }
        L_0x0589:
            if (r6 == 0) goto L_0x064c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0f24 }
            java.util.List r3 = r9.mo12076D()     // Catch:{ all -> 0x0f24 }
            r2.<init>(r3)     // Catch:{ all -> 0x0f24 }
            r3 = 0
            r5 = -1
            r6 = -1
        L_0x0597:
            int r7 = r2.size()     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r7) goto L_0x05c7
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r7 = (com.google.android.gms.internal.measurement.C2024v0) r7     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x05b3
            r5 = r3
            goto L_0x05c4
        L_0x05b3:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r7 = (com.google.android.gms.internal.measurement.C2024v0) r7     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x05c4
            r6 = r3
        L_0x05c4:
            int r3 = r3 + 1
            goto L_0x0597
        L_0x05c7:
            r3 = -1
            if (r5 == r3) goto L_0x064d
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C2024v0) r3     // Catch:{ all -> 0x0f24 }
            boolean r3 = r3.mo12107W()     // Catch:{ all -> 0x0f24 }
            if (r3 != 0) goto L_0x05fd
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C2024v0) r3     // Catch:{ all -> 0x0f24 }
            boolean r3 = r3.mo12109Y()     // Catch:{ all -> 0x0f24 }
            if (r3 != 0) goto L_0x05fd
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13101L()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.mo13130a(r3)     // Catch:{ all -> 0x0f24 }
            r9.mo12078F(r5)     // Catch:{ all -> 0x0f24 }
            m7237l(r9, r12)     // Catch:{ all -> 0x0f24 }
            r2 = 18
            m7235k(r9, r2, r14)     // Catch:{ all -> 0x0f24 }
            goto L_0x064c
        L_0x05fd:
            r3 = -1
            if (r6 != r3) goto L_0x0603
            r2 = 1
            r7 = 3
            goto L_0x062f
        L_0x0603:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r2 = (com.google.android.gms.internal.measurement.C2024v0) r2     // Catch:{ all -> 0x0f24 }
            java.lang.String r2 = r2.mo12106T()     // Catch:{ all -> 0x0f24 }
            int r6 = r2.length()     // Catch:{ all -> 0x0f24 }
            r7 = 3
            if (r6 == r7) goto L_0x0616
        L_0x0614:
            r2 = 1
            goto L_0x062f
        L_0x0616:
            r6 = 0
        L_0x0617:
            int r14 = r2.length()     // Catch:{ all -> 0x0f24 }
            if (r6 >= r14) goto L_0x062e
            int r14 = r2.codePointAt(r6)     // Catch:{ all -> 0x0f24 }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0f24 }
            if (r15 != 0) goto L_0x0628
            goto L_0x0614
        L_0x0628:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0f24 }
            int r6 = r6 + r14
            goto L_0x0617
        L_0x062e:
            r2 = 0
        L_0x062f:
            if (r2 == 0) goto L_0x064e
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13101L()     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo13130a(r6)     // Catch:{ all -> 0x0f24 }
            r9.mo12078F(r5)     // Catch:{ all -> 0x0f24 }
            m7237l(r9, r12)     // Catch:{ all -> 0x0f24 }
            r2 = 19
            m7235k(r9, r2, r8)     // Catch:{ all -> 0x0f24 }
            goto L_0x064e
        L_0x064c:
            r3 = -1
        L_0x064d:
            r7 = 3
        L_0x064e:
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2302r.f4495U     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo12456B(r5, r6)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x07fd
            java.lang.String r2 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            r5 = r13
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f24 }
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06c8
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r2 = r9.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C1889m4) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.C1994t0) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r2 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r2, r11)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x06be
            if (r10 == 0) goto L_0x06b2
            long r14 = r10.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r24 = r9.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r14 = r14 - r24
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0f24 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x06b2
            java.lang.Object r2 = r10.clone()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r2 = (com.google.android.gms.internal.measurement.C1889m4.C1891b) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0$a r2 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r2     // Catch:{ all -> 0x0f24 }
            boolean r6 = r1.m7218C(r9, r2)     // Catch:{ all -> 0x0f24 }
            if (r6 == 0) goto L_0x06b2
            r6 = r30
            r8 = r31
            r6.mo12314v(r8, r2)     // Catch:{ all -> 0x0f24 }
            r7 = r27
            r14 = r29
        L_0x06ad:
            r10 = 0
        L_0x06ae:
            r28 = 0
            goto L_0x0807
        L_0x06b2:
            r6 = r30
            r8 = r31
            r28 = r9
            r7 = r21
            r14 = r29
            goto L_0x0807
        L_0x06be:
            r6 = r30
            r8 = r31
            r11 = r27
            r14 = r29
            goto L_0x0806
        L_0x06c8:
            r6 = r30
            r8 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0720
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r2 = r9.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C1889m4) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.C1994t0) r2     // Catch:{ all -> 0x0f24 }
            r14 = r29
            com.google.android.gms.internal.measurement.v0 r2 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r2, r14)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x071c
            if (r28 == 0) goto L_0x0714
            long r10 = r28.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r24 = r9.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r10 = r10 - r24
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0f24 }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0714
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r2 = (com.google.android.gms.internal.measurement.C1889m4.C1891b) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0$a r2 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r2     // Catch:{ all -> 0x0f24 }
            boolean r10 = r1.m7218C(r2, r9)     // Catch:{ all -> 0x0f24 }
            if (r10 == 0) goto L_0x0714
            r11 = r27
            r6.mo12314v(r11, r2)     // Catch:{ all -> 0x0f24 }
            r7 = r11
            goto L_0x06ad
        L_0x0714:
            r11 = r27
            r10 = r9
            r7 = r11
            r8 = r21
            goto L_0x0807
        L_0x071c:
            r11 = r27
            goto L_0x0806
        L_0x0720:
            r11 = r27
            r14 = r29
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r12 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = r12.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2302r.f4540t0     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo12456B(r12, r13)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0806
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0806
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r2 = r9.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C1889m4) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.C1994t0) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r2 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r2, r14)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x0806
            if (r28 == 0) goto L_0x0806
            long r12 = r28.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r24 = r9.mo12082P()     // Catch:{ all -> 0x0f24 }
            long r12 = r12 - r24
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f24 }
            r24 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0806
            java.lang.Object r2 = r28.clone()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4$b r2 = (com.google.android.gms.internal.measurement.C1889m4.C1891b) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0$a r2 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r2     // Catch:{ all -> 0x0f24 }
            r1.m7223J(r2, r9)     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = r2.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r12 = r5.equals(r12)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.common.internal.C1609u.m4465a(r12)     // Catch:{ all -> 0x0f24 }
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r12 = r2.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r12 = (com.google.android.gms.internal.measurement.C1889m4) r12     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r12 = (com.google.android.gms.internal.measurement.C1994t0) r12     // Catch:{ all -> 0x0f24 }
            java.lang.String r13 = "_sn"
            com.google.android.gms.internal.measurement.v0 r12 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r12, r13)     // Catch:{ all -> 0x0f24 }
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r13 = r2.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r13 = (com.google.android.gms.internal.measurement.C1889m4) r13     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r13 = (com.google.android.gms.internal.measurement.C1994t0) r13     // Catch:{ all -> 0x0f24 }
            java.lang.String r15 = "_sc"
            com.google.android.gms.internal.measurement.v0 r13 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r13, r15)     // Catch:{ all -> 0x0f24 }
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r15 = r2.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r15 = (com.google.android.gms.internal.measurement.C1889m4) r15     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r15 = (com.google.android.gms.internal.measurement.C1994t0) r15     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "_si"
            com.google.android.gms.internal.measurement.v0 r3 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r15, r3)     // Catch:{ all -> 0x0f24 }
            if (r12 == 0) goto L_0x07bb
            java.lang.String r12 = r12.mo12106T()     // Catch:{ all -> 0x0f24 }
            goto L_0x07bd
        L_0x07bb:
            r12 = r18
        L_0x07bd:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0f24 }
            if (r15 != 0) goto L_0x07cc
            com.google.android.gms.measurement.internal.p9 r15 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = "_sn"
            r15.mo12886G(r9, r7, r12)     // Catch:{ all -> 0x0f24 }
        L_0x07cc:
            if (r13 == 0) goto L_0x07d3
            java.lang.String r7 = r13.mo12106T()     // Catch:{ all -> 0x0f24 }
            goto L_0x07d5
        L_0x07d3:
            r7 = r18
        L_0x07d5:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0f24 }
            if (r12 != 0) goto L_0x07e4
            com.google.android.gms.measurement.internal.p9 r12 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.String r13 = "_sc"
            r12.mo12886G(r9, r13, r7)     // Catch:{ all -> 0x0f24 }
        L_0x07e4:
            if (r3 == 0) goto L_0x07f7
            com.google.android.gms.measurement.internal.p9 r7 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = "_si"
            long r24 = r3.mo12108X()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r3 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0f24 }
            r7.mo12886G(r9, r12, r3)     // Catch:{ all -> 0x0f24 }
        L_0x07f7:
            r6.mo12314v(r11, r2)     // Catch:{ all -> 0x0f24 }
            r7 = r11
            goto L_0x06ae
        L_0x07fd:
            r5 = r13
            r11 = r27
            r14 = r29
            r6 = r30
            r8 = r31
        L_0x0806:
            r7 = r11
        L_0x0807:
            if (r26 != 0) goto L_0x0865
            java.lang.String r2 = r9.mo12081O()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0865
            int r2 = r9.mo12077E()     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x0833
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x0f24 }
        L_0x082f:
            r2.mo13131b(r3, r5)     // Catch:{ all -> 0x0f24 }
            goto L_0x0865
        L_0x0833:
            com.google.android.gms.measurement.internal.p9 r2 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r3 = r9.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r3 = (com.google.android.gms.internal.measurement.C1889m4) r3     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r3 = (com.google.android.gms.internal.measurement.C1994t0) r3     // Catch:{ all -> 0x0f24 }
            java.lang.Object r2 = r2.mo12890U(r3, r14)     // Catch:{ all -> 0x0f24 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x085e
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x0f24 }
            goto L_0x082f
        L_0x085e:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f24 }
            long r2 = r22 + r2
            goto L_0x0867
        L_0x0865:
            r2 = r22
        L_0x0867:
            java.util.List<com.google.android.gms.internal.measurement.t0> r5 = r4.f4341c     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r11 = r9.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r11 = (com.google.android.gms.internal.measurement.C1889m4) r11     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r11 = (com.google.android.gms.internal.measurement.C1994t0) r11     // Catch:{ all -> 0x0f24 }
            r12 = r16
            r5.set(r12, r11)     // Catch:{ all -> 0x0f24 }
            int r14 = r21 + 1
            r6.mo12317y(r9)     // Catch:{ all -> 0x0f24 }
            r15 = r2
            r11 = r10
            r13 = r19
            r10 = r28
        L_0x0881:
            int r12 = r12 + 1
            r5 = r6
            r3 = r18
            r2 = r20
            r6 = r26
            goto L_0x027b
        L_0x088c:
            r11 = r3
            r26 = r6
            r14 = r13
            r6 = r5
            r5 = r2
            if (r26 == 0) goto L_0x08e9
            r2 = r21
            r15 = r22
            r3 = 0
        L_0x0899:
            if (r3 >= r2) goto L_0x08e7
            com.google.android.gms.internal.measurement.t0 r7 = r6.mo12270N(r3)     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = r7.mo12065U()     // Catch:{ all -> 0x0f24 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0f24 }
            if (r8 == 0) goto L_0x08ba
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r8 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r7, r11)     // Catch:{ all -> 0x0f24 }
            if (r8 == 0) goto L_0x08ba
            r6.mo12286b0(r3)     // Catch:{ all -> 0x0f24 }
            int r2 = r2 + -1
            int r3 = r3 + -1
            goto L_0x08e4
        L_0x08ba:
            r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r7 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r7, r14)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x08e4
            boolean r8 = r7.mo12107W()     // Catch:{ all -> 0x0f24 }
            if (r8 == 0) goto L_0x08d2
            long r7 = r7.mo12108X()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f24 }
            goto L_0x08d3
        L_0x08d2:
            r7 = 0
        L_0x08d3:
            if (r7 == 0) goto L_0x08e4
            long r8 = r7.longValue()     // Catch:{ all -> 0x0f24 }
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x08e4
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f24 }
            long r15 = r15 + r7
        L_0x08e4:
            r7 = 1
            int r3 = r3 + r7
            goto L_0x0899
        L_0x08e7:
            r2 = r15
            goto L_0x08eb
        L_0x08e9:
            r2 = r22
        L_0x08eb:
            r5 = 0
            r1.m7240n(r6, r2, r5)     // Catch:{ all -> 0x0f24 }
            java.util.List r5 = r6.mo12264F()     // Catch:{ all -> 0x0f24 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0f24 }
        L_0x08f7:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x0911
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r7 = (com.google.android.gms.internal.measurement.C1994t0) r7     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.mo12065U()     // Catch:{ all -> 0x0f24 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x08f7
            r5 = 1
            goto L_0x0912
        L_0x0911:
            r5 = 0
        L_0x0912:
            java.lang.String r7 = "_se"
            if (r5 == 0) goto L_0x0921
            com.google.android.gms.measurement.internal.c r5 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = r6.mo12290d1()     // Catch:{ all -> 0x0f24 }
            r5.mo12514k0(r8, r7)     // Catch:{ all -> 0x0f24 }
        L_0x0921:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.C2290p9.m7350u(r6, r5)     // Catch:{ all -> 0x0f24 }
            if (r5 < 0) goto L_0x092b
            r5 = 1
            goto L_0x092c
        L_0x092b:
            r5 = 0
        L_0x092c:
            if (r5 == 0) goto L_0x0933
            r5 = 1
            r1.m7240n(r6, r2, r5)     // Catch:{ all -> 0x0f24 }
            goto L_0x0955
        L_0x0933:
            int r2 = com.google.android.gms.measurement.internal.C2290p9.m7350u(r6, r7)     // Catch:{ all -> 0x0f24 }
            if (r2 < 0) goto L_0x0955
            r6.mo12312t0(r2)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.x0 r5 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r5.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x0f24 }
            r2.mo13131b(r3, r5)     // Catch:{ all -> 0x0f24 }
        L_0x0955:
            com.google.android.gms.measurement.internal.p9 r2 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r3 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13104O()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = "Checking account type status for ad personalization signals"
            r3.mo13130a(r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.v4 r3 = r2.mo12780p()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r6.mo12290d1()     // Catch:{ all -> 0x0f24 }
            boolean r3 = r3.mo13072F(r5)     // Catch:{ all -> 0x0f24 }
            if (r3 == 0) goto L_0x09e3
            com.google.android.gms.measurement.internal.c r3 = r2.mo12779o()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = r6.mo12290d1()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.d5 r3 = r3.mo12512i0(r5)     // Catch:{ all -> 0x0f24 }
            if (r3 == 0) goto L_0x09e3
            boolean r3 = r3.mo12624l()     // Catch:{ all -> 0x0f24 }
            if (r3 == 0) goto L_0x09e3
            com.google.android.gms.measurement.internal.l r3 = r2.mo13108i()     // Catch:{ all -> 0x0f24 }
            boolean r3 = r3.mo12794y()     // Catch:{ all -> 0x0f24 }
            if (r3 == 0) goto L_0x09e3
            com.google.android.gms.measurement.internal.w3 r3 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13103N()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r3.mo13130a(r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.b1$a r3 = com.google.android.gms.internal.measurement.C1715b1.m4739Y()     // Catch:{ all -> 0x0f24 }
            r5 = r20
            r3.mo11449x(r5)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.l r2 = r2.mo13108i()     // Catch:{ all -> 0x0f24 }
            long r7 = r2.mo12792w()     // Catch:{ all -> 0x0f24 }
            r3.mo11448w(r7)     // Catch:{ all -> 0x0f24 }
            r7 = 1
            r3.mo11451z(r7)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r2 = r3.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C1889m4) r2     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.b1 r2 = (com.google.android.gms.internal.measurement.C1715b1) r2     // Catch:{ all -> 0x0f24 }
            r3 = 0
        L_0x09c1:
            int r7 = r6.mo12311s0()     // Catch:{ all -> 0x0f24 }
            if (r3 >= r7) goto L_0x09dd
            com.google.android.gms.internal.measurement.b1 r7 = r6.mo12306p0(r3)     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo11437P()     // Catch:{ all -> 0x0f24 }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0f24 }
            if (r7 == 0) goto L_0x09da
            r6.mo12315w(r3, r2)     // Catch:{ all -> 0x0f24 }
            r3 = 1
            goto L_0x09de
        L_0x09da:
            int r3 = r3 + 1
            goto L_0x09c1
        L_0x09dd:
            r3 = 0
        L_0x09de:
            if (r3 != 0) goto L_0x09e3
            r6.mo12257A(r2)     // Catch:{ all -> 0x0f24 }
        L_0x09e3:
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r6.mo12290d1()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2302r.f4530o0     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo12456B(r3, r5)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x09f8
            m7239m(r6)     // Catch:{ all -> 0x0f24 }
        L_0x09f8:
            r6.mo12302l1()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.aa r7 = r43.mo12820W()     // Catch:{ all -> 0x0f24 }
            java.lang.String r8 = r6.mo12290d1()     // Catch:{ all -> 0x0f24 }
            java.util.List r9 = r6.mo12264F()     // Catch:{ all -> 0x0f24 }
            java.util.List r10 = r6.mo12308q0()     // Catch:{ all -> 0x0f24 }
            long r2 = r6.mo12263E0()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f24 }
            long r2 = r6.mo12269M0()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f24 }
            java.util.List r2 = r7.mo12454v(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0f24 }
            r6.mo12292g0(r2)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r3 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r3.mo12206I2()     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo12460F(r3)     // Catch:{ all -> 0x0f24 }
            if (r2 == 0) goto L_0x0d64
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d5f }
            r2.<init>()     // Catch:{ all -> 0x0d5f }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d5f }
            r3.<init>()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.s9 r5 = r5.mo12412G()     // Catch:{ all -> 0x0d5f }
            java.security.SecureRandom r5 = r5.mo12950F0()     // Catch:{ all -> 0x0d5f }
            r7 = 0
        L_0x0a49:
            int r8 = r6.mo12265G()     // Catch:{ all -> 0x0d5f }
            if (r7 >= r8) goto L_0x0d2a
            com.google.android.gms.internal.measurement.t0 r8 = r6.mo12270N(r7)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4$b r8 = r8.mo11850u()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0$a r8 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r8     // Catch:{ all -> 0x0d5f }
            java.lang.String r9 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d5f }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0add
            com.google.android.gms.measurement.internal.p9 r9 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r11 = r8.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r11 = (com.google.android.gms.internal.measurement.C1889m4) r11     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r11 = (com.google.android.gms.internal.measurement.C1994t0) r11     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.mo12890U(r11, r12)     // Catch:{ all -> 0x0f24 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f24 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.m r11 = (com.google.android.gms.measurement.internal.C2247m) r11     // Catch:{ all -> 0x0f24 }
            if (r11 != 0) goto L_0x0a94
            com.google.android.gms.measurement.internal.c r11 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r12 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = r12.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.m r11 = r11.mo12492C(r12, r9)     // Catch:{ all -> 0x0f24 }
            r2.put(r9, r11)     // Catch:{ all -> 0x0f24 }
        L_0x0a94:
            java.lang.Long r9 = r11.f4351i     // Catch:{ all -> 0x0f24 }
            if (r9 != 0) goto L_0x0ad3
            java.lang.Long r9 = r11.f4352j     // Catch:{ all -> 0x0f24 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0f24 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0aad
            com.google.android.gms.measurement.internal.p9 r9 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r12 = r11.f4352j     // Catch:{ all -> 0x0f24 }
            r9.mo12886G(r8, r10, r12)     // Catch:{ all -> 0x0f24 }
        L_0x0aad:
            java.lang.Boolean r9 = r11.f4353k     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0ac8
            java.lang.Boolean r9 = r11.f4353k     // Catch:{ all -> 0x0f24 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0ac8
            com.google.android.gms.measurement.internal.p9 r9 = r43.mo12822Y()     // Catch:{ all -> 0x0f24 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f24 }
            r9.mo12886G(r8, r10, r13)     // Catch:{ all -> 0x0f24 }
        L_0x0ac8:
            com.google.android.gms.internal.measurement.x5 r9 = r8.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r9 = (com.google.android.gms.internal.measurement.C1889m4) r9     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r9 = (com.google.android.gms.internal.measurement.C1994t0) r9     // Catch:{ all -> 0x0f24 }
            r3.add(r9)     // Catch:{ all -> 0x0f24 }
        L_0x0ad3:
            r6.mo12314v(r7, r8)     // Catch:{ all -> 0x0f24 }
        L_0x0ad6:
            r44 = r4
            r15 = r5
            r5 = r6
            r1 = r7
            goto L_0x0d20
        L_0x0add:
            com.google.android.gms.measurement.internal.v4 r9 = r43.mo12815Q()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x0 r11 = r4.f4339a     // Catch:{ all -> 0x0d5f }
            java.lang.String r11 = r11.mo12206I2()     // Catch:{ all -> 0x0d5f }
            long r11 = r9.mo13073G(r11)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.a5 r9 = r1.f4324i     // Catch:{ all -> 0x0d5f }
            r9.mo12412G()     // Catch:{ all -> 0x0d5f }
            long r13 = r8.mo12082P()     // Catch:{ all -> 0x0d5f }
            long r13 = com.google.android.gms.measurement.internal.C2323s9.m7579v(r13, r11)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x5 r9 = r8.mo11851I()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4 r9 = (com.google.android.gms.internal.measurement.C1889m4) r9     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0 r9 = (com.google.android.gms.internal.measurement.C1994t0) r9     // Catch:{ all -> 0x0d5f }
            java.lang.String r15 = "_dbg"
            r20 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d5f }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0d5f }
            if (r12 != 0) goto L_0x0b6a
            if (r11 != 0) goto L_0x0b13
            goto L_0x0b6a
        L_0x0b13:
            java.util.List r9 = r9.mo12073z()     // Catch:{ all -> 0x0f24 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f24 }
        L_0x0b1b:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0f24 }
            if (r12 == 0) goto L_0x0b6a
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.v0 r12 = (com.google.android.gms.internal.measurement.C2024v0) r12     // Catch:{ all -> 0x0f24 }
            r44 = r9
            java.lang.String r9 = r12.mo12104L()     // Catch:{ all -> 0x0f24 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0b67
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0b45
            long r15 = r12.mo12108X()     // Catch:{ all -> 0x0f24 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0f24 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f24 }
            if (r9 != 0) goto L_0x0b65
        L_0x0b45:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0b53
            java.lang.String r9 = r12.mo12106T()     // Catch:{ all -> 0x0f24 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f24 }
            if (r9 != 0) goto L_0x0b65
        L_0x0b53:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0b6a
            double r15 = r12.mo12110Z()     // Catch:{ all -> 0x0f24 }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x0f24 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f24 }
            if (r9 == 0) goto L_0x0b6a
        L_0x0b65:
            r9 = 1
            goto L_0x0b6b
        L_0x0b67:
            r9 = r44
            goto L_0x0b1b
        L_0x0b6a:
            r9 = 0
        L_0x0b6b:
            if (r9 != 0) goto L_0x0b80
            com.google.android.gms.measurement.internal.v4 r9 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r11 = r4.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r11 = r11.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.String r12 = r8.mo12081O()     // Catch:{ all -> 0x0f24 }
            int r9 = r9.mo13070D(r11, r12)     // Catch:{ all -> 0x0f24 }
            goto L_0x0b81
        L_0x0b80:
            r9 = 1
        L_0x0b81:
            if (r9 > 0) goto L_0x0ba7
            com.google.android.gms.measurement.internal.a5 r10 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r10 = r10.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.mo12081O()     // Catch:{ all -> 0x0f24 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0f24 }
            r10.mo13132c(r11, r12, r9)     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r9 = r8.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r9 = (com.google.android.gms.internal.measurement.C1889m4) r9     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.t0 r9 = (com.google.android.gms.internal.measurement.C1994t0) r9     // Catch:{ all -> 0x0f24 }
            r3.add(r9)     // Catch:{ all -> 0x0f24 }
            goto L_0x0ad3
        L_0x0ba7:
            java.lang.String r11 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r11 = (com.google.android.gms.measurement.internal.C2247m) r11     // Catch:{ all -> 0x0d5f }
            if (r11 != 0) goto L_0x0c05
            com.google.android.gms.measurement.internal.c r11 = r43.mo12819U()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x0 r12 = r4.f4339a     // Catch:{ all -> 0x0d5f }
            java.lang.String r12 = r12.mo12206I2()     // Catch:{ all -> 0x0d5f }
            java.lang.String r15 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r11 = r11.mo12492C(r12, r15)     // Catch:{ all -> 0x0d5f }
            if (r11 != 0) goto L_0x0c05
            com.google.android.gms.measurement.internal.a5 r11 = r1.f4324i     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.w3 r11 = r11.mo12427b()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.y3 r11 = r11.mo13099J()     // Catch:{ all -> 0x0d5f }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.x0 r15 = r4.f4339a     // Catch:{ all -> 0x0d5f }
            java.lang.String r15 = r15.mo12206I2()     // Catch:{ all -> 0x0d5f }
            java.lang.String r1 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            r11.mo13132c(r12, r15, r1)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r11 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x0 r1 = r4.f4339a     // Catch:{ all -> 0x0d5f }
            java.lang.String r27 = r1.mo12206I2()     // Catch:{ all -> 0x0d5f }
            java.lang.String r28 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r8.mo12082P()     // Catch:{ all -> 0x0d5f }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r11
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d5f }
        L_0x0c05:
            com.google.android.gms.measurement.internal.p9 r1 = r43.mo12822Y()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x5 r12 = r8.mo11851I()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4 r12 = (com.google.android.gms.internal.measurement.C1889m4) r12     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0 r12 = (com.google.android.gms.internal.measurement.C1994t0) r12     // Catch:{ all -> 0x0d5f }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.mo12890U(r12, r15)     // Catch:{ all -> 0x0d5f }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0d5f }
            if (r1 == 0) goto L_0x0c1d
            r12 = 1
            goto L_0x0c1e
        L_0x0c1d:
            r12 = 0
        L_0x0c1e:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d5f }
            r15 = 1
            if (r9 != r15) goto L_0x0c53
            com.google.android.gms.internal.measurement.x5 r1 = r8.mo11851I()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0 r1 = (com.google.android.gms.internal.measurement.C1994t0) r1     // Catch:{ all -> 0x0d5f }
            r3.add(r1)     // Catch:{ all -> 0x0d5f }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5f }
            if (r1 == 0) goto L_0x0c4e
            java.lang.Long r1 = r11.f4351i     // Catch:{ all -> 0x0d5f }
            if (r1 != 0) goto L_0x0c42
            java.lang.Long r1 = r11.f4352j     // Catch:{ all -> 0x0d5f }
            if (r1 != 0) goto L_0x0c42
            java.lang.Boolean r1 = r11.f4353k     // Catch:{ all -> 0x0d5f }
            if (r1 == 0) goto L_0x0c4e
        L_0x0c42:
            r1 = 0
            com.google.android.gms.measurement.internal.m r9 = r11.mo12843c(r1, r1, r1)     // Catch:{ all -> 0x0d5f }
            java.lang.String r1 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            r2.put(r1, r9)     // Catch:{ all -> 0x0d5f }
        L_0x0c4e:
            r6.mo12314v(r7, r8)     // Catch:{ all -> 0x0d5f }
            goto L_0x0ad6
        L_0x0c53:
            int r15 = r5.nextInt(r9)     // Catch:{ all -> 0x0d5f }
            if (r15 != 0) goto L_0x0c95
            com.google.android.gms.measurement.internal.p9 r1 = r43.mo12822Y()     // Catch:{ all -> 0x0d5f }
            r44 = r4
            r15 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x0d5f }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d5f }
            r1.mo12886G(r8, r10, r9)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x5 r1 = r8.mo11851I()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0 r1 = (com.google.android.gms.internal.measurement.C1994t0) r1     // Catch:{ all -> 0x0d5f }
            r3.add(r1)     // Catch:{ all -> 0x0d5f }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5f }
            if (r1 == 0) goto L_0x0c82
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d5f }
            r4 = 0
            com.google.android.gms.measurement.internal.m r11 = r11.mo12843c(r4, r1, r4)     // Catch:{ all -> 0x0d5f }
        L_0x0c82:
            java.lang.String r1 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            long r4 = r8.mo12082P()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r4 = r11.mo12842b(r4, r13)     // Catch:{ all -> 0x0d5f }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d5f }
            r5 = r6
            r1 = r7
            goto L_0x0d1d
        L_0x0c95:
            r44 = r4
            r15 = r5
            java.lang.Long r4 = r11.f4350h     // Catch:{ all -> 0x0d5f }
            if (r4 == 0) goto L_0x0ca7
            java.lang.Long r4 = r11.f4350h     // Catch:{ all -> 0x0d5f }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d5f }
            r30 = r6
            r16 = r7
            goto L_0x0cbc
        L_0x0ca7:
            r4 = r43
            com.google.android.gms.measurement.internal.a5 r5 = r4.f4324i     // Catch:{ all -> 0x0d5f }
            r5.mo12412G()     // Catch:{ all -> 0x0d5f }
            long r4 = r8.mo12083U()     // Catch:{ all -> 0x0d5f }
            r30 = r6
            r16 = r7
            r6 = r20
            long r4 = com.google.android.gms.measurement.internal.C2323s9.m7579v(r4, r6)     // Catch:{ all -> 0x0d5f }
        L_0x0cbc:
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0d07
            com.google.android.gms.measurement.internal.p9 r1 = r43.mo12822Y()     // Catch:{ all -> 0x0d5f }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5f }
            r1.mo12886G(r8, r4, r7)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.p9 r1 = r43.mo12822Y()     // Catch:{ all -> 0x0d5f }
            long r5 = (long) r9     // Catch:{ all -> 0x0d5f }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5f }
            r1.mo12886G(r8, r10, r4)     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.x5 r1 = r8.mo11851I()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.internal.measurement.t0 r1 = (com.google.android.gms.internal.measurement.C1994t0) r1     // Catch:{ all -> 0x0d5f }
            r3.add(r1)     // Catch:{ all -> 0x0d5f }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0d5f }
            if (r1 == 0) goto L_0x0cf7
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d5f }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d5f }
            r5 = 0
            com.google.android.gms.measurement.internal.m r11 = r11.mo12843c(r5, r1, r4)     // Catch:{ all -> 0x0d5f }
        L_0x0cf7:
            java.lang.String r1 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            long r4 = r8.mo12082P()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r4 = r11.mo12842b(r4, r13)     // Catch:{ all -> 0x0d5f }
            r2.put(r1, r4)     // Catch:{ all -> 0x0d5f }
            goto L_0x0d19
        L_0x0d07:
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x0d5f }
            if (r4 == 0) goto L_0x0d19
            java.lang.String r4 = r8.mo12081O()     // Catch:{ all -> 0x0d5f }
            r5 = 0
            com.google.android.gms.measurement.internal.m r1 = r11.mo12843c(r1, r5, r5)     // Catch:{ all -> 0x0d5f }
            r2.put(r4, r1)     // Catch:{ all -> 0x0d5f }
        L_0x0d19:
            r1 = r16
            r5 = r30
        L_0x0d1d:
            r5.mo12314v(r1, r8)     // Catch:{ all -> 0x0d5f }
        L_0x0d20:
            int r7 = r1 + 1
            r1 = r43
            r4 = r44
            r6 = r5
            r5 = r15
            goto L_0x0a49
        L_0x0d2a:
            r44 = r4
            r5 = r6
            int r1 = r3.size()     // Catch:{ all -> 0x0d5f }
            int r4 = r5.mo12265G()     // Catch:{ all -> 0x0d5f }
            if (r1 >= r4) goto L_0x0d3d
            r5.mo12283Y()     // Catch:{ all -> 0x0d5f }
            r5.mo12259B(r3)     // Catch:{ all -> 0x0d5f }
        L_0x0d3d:
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x0d5f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0d5f }
        L_0x0d45:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0d5f }
            if (r2 == 0) goto L_0x0d67
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0d5f }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.c r3 = r43.mo12819U()     // Catch:{ all -> 0x0d5f }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0d5f }
            com.google.android.gms.measurement.internal.m r2 = (com.google.android.gms.measurement.internal.C2247m) r2     // Catch:{ all -> 0x0d5f }
            r3.mo12502M(r2)     // Catch:{ all -> 0x0d5f }
            goto L_0x0d45
        L_0x0d5f:
            r0 = move-exception
            r1 = r43
            goto L_0x0f25
        L_0x0d64:
            r44 = r4
            r5 = r6
        L_0x0d67:
            r1 = r43
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo12443x()     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r5.mo12290d1()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2302r.f4530o0     // Catch:{ all -> 0x0f24 }
            boolean r2 = r2.mo12456B(r3, r4)     // Catch:{ all -> 0x0f24 }
            if (r2 != 0) goto L_0x0d7e
            m7239m(r5)     // Catch:{ all -> 0x0f24 }
        L_0x0d7e:
            r2 = r44
            com.google.android.gms.internal.measurement.x0 r3 = r2.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r3 = r3.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.c r4 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.d5 r4 = r4.mo12512i0(r3)     // Catch:{ all -> 0x0f24 }
            if (r4 != 0) goto L_0x0daa
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.x0 r7 = r2.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r7)     // Catch:{ all -> 0x0f24 }
            r4.mo13131b(r6, r7)     // Catch:{ all -> 0x0f24 }
            goto L_0x0e05
        L_0x0daa:
            int r6 = r5.mo12265G()     // Catch:{ all -> 0x0f24 }
            if (r6 <= 0) goto L_0x0e05
            long r6 = r4.mo12593R()     // Catch:{ all -> 0x0f24 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0dbe
            r5.mo12258A0(r6)     // Catch:{ all -> 0x0f24 }
            goto L_0x0dc1
        L_0x0dbe:
            r5.mo12281W0()     // Catch:{ all -> 0x0f24 }
        L_0x0dc1:
            long r8 = r4.mo12591P()     // Catch:{ all -> 0x0f24 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0dcc
            goto L_0x0dcd
        L_0x0dcc:
            r6 = r8
        L_0x0dcd:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0dd5
            r5.mo12296i0(r6)     // Catch:{ all -> 0x0f24 }
            goto L_0x0dd8
        L_0x0dd5:
            r5.mo12276R0()     // Catch:{ all -> 0x0f24 }
        L_0x0dd8:
            r4.mo12619i0()     // Catch:{ all -> 0x0f24 }
            long r6 = r4.mo12613f0()     // Catch:{ all -> 0x0f24 }
            int r7 = (int) r6     // Catch:{ all -> 0x0f24 }
            r5.mo12271N0(r7)     // Catch:{ all -> 0x0f24 }
            long r6 = r5.mo12263E0()     // Catch:{ all -> 0x0f24 }
            r4.mo12602a(r6)     // Catch:{ all -> 0x0f24 }
            long r6 = r5.mo12269M0()     // Catch:{ all -> 0x0f24 }
            r4.mo12631q(r6)     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = r4.mo12620j()     // Catch:{ all -> 0x0f24 }
            if (r6 == 0) goto L_0x0dfb
            r5.mo12288c1(r6)     // Catch:{ all -> 0x0f24 }
            goto L_0x0dfe
        L_0x0dfb:
            r5.mo12291f1()     // Catch:{ all -> 0x0f24 }
        L_0x0dfe:
            com.google.android.gms.measurement.internal.c r6 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            r6.mo12503N(r4)     // Catch:{ all -> 0x0f24 }
        L_0x0e05:
            int r4 = r5.mo12265G()     // Catch:{ all -> 0x0f24 }
            if (r4 <= 0) goto L_0x0e6b
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            r4.mo12414I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.v4 r4 = r43.mo12815Q()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r6 = r2.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = r6.mo12206I2()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.n0 r4 = r4.mo13076u(r6)     // Catch:{ all -> 0x0f24 }
            if (r4 == 0) goto L_0x0e2f
            boolean r6 = r4.mo11875D()     // Catch:{ all -> 0x0f24 }
            if (r6 != 0) goto L_0x0e27
            goto L_0x0e2f
        L_0x0e27:
            long r6 = r4.mo11876E()     // Catch:{ all -> 0x0f24 }
            r5.mo12284Z0(r6)     // Catch:{ all -> 0x0f24 }
            goto L_0x0e5a
        L_0x0e2f:
            com.google.android.gms.internal.measurement.x0 r4 = r2.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r4 = r4.mo12232j0()     // Catch:{ all -> 0x0f24 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f24 }
            if (r4 == 0) goto L_0x0e41
            r6 = -1
            r5.mo12284Z0(r6)     // Catch:{ all -> 0x0f24 }
            goto L_0x0e5a
        L_0x0e41:
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.x0 r7 = r2.f4339a     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = r7.mo12206I2()     // Catch:{ all -> 0x0f24 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r7)     // Catch:{ all -> 0x0f24 }
            r4.mo13131b(r6, r7)     // Catch:{ all -> 0x0f24 }
        L_0x0e5a:
            com.google.android.gms.measurement.internal.c r4 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x5 r5 = r5.mo11851I()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.m4 r5 = (com.google.android.gms.internal.measurement.C1889m4) r5     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.internal.measurement.x0 r5 = (com.google.android.gms.internal.measurement.C2056x0) r5     // Catch:{ all -> 0x0f24 }
            r13 = r19
            r4.mo12506Q(r5, r13)     // Catch:{ all -> 0x0f24 }
        L_0x0e6b:
            com.google.android.gms.measurement.internal.c r4 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            java.util.List<java.lang.Long> r2 = r2.f4340b     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.common.internal.C1609u.m4475k(r2)     // Catch:{ all -> 0x0f24 }
            r4.mo12567h()     // Catch:{ all -> 0x0f24 }
            r4.mo12749r()     // Catch:{ all -> 0x0f24 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f24 }
            r6 = 0
        L_0x0e82:
            int r7 = r2.size()     // Catch:{ all -> 0x0f24 }
            if (r6 >= r7) goto L_0x0e9f
            if (r6 == 0) goto L_0x0e8f
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f24 }
        L_0x0e8f:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f24 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f24 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f24 }
            r5.append(r7)     // Catch:{ all -> 0x0f24 }
            int r6 = r6 + 1
            goto L_0x0e82
        L_0x0e9f:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f24 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo12525v()     // Catch:{ all -> 0x0f24 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f24 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f24 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f24 }
            if (r5 == r6) goto L_0x0ed2
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ all -> 0x0f24 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f24 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f24 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f24 }
            r4.mo13132c(r6, r5, r2)     // Catch:{ all -> 0x0f24 }
        L_0x0ed2:
            com.google.android.gms.measurement.internal.c r2 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo12525v()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0ee9 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0ee9 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0ee9 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0ee9 }
            goto L_0x0efc
        L_0x0ee9:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x0f24 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r3)     // Catch:{ all -> 0x0f24 }
            r2.mo13132c(r5, r3, r4)     // Catch:{ all -> 0x0f24 }
        L_0x0efc:
            com.google.android.gms.measurement.internal.c r2 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            r2.mo12523u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.c r2 = r43.mo12819U()
            r2.mo12533z0()
            r2 = 1
            return r2
        L_0x0f0c:
            com.google.android.gms.measurement.internal.c r2 = r43.mo12819U()     // Catch:{ all -> 0x0f24 }
            r2.mo12523u()     // Catch:{ all -> 0x0f24 }
            com.google.android.gms.measurement.internal.c r2 = r43.mo12819U()
            r2.mo12533z0()
            r2 = 0
            return r2
        L_0x0f1c:
            r0 = move-exception
            r2 = r0
        L_0x0f1e:
            if (r5 == 0) goto L_0x0f23
            r5.close()     // Catch:{ all -> 0x0f24 }
        L_0x0f23:
            throw r2     // Catch:{ all -> 0x0f24 }
        L_0x0f24:
            r0 = move-exception
        L_0x0f25:
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r43.mo12819U()
            r3.mo12533z0()
            goto L_0x0f2f
        L_0x0f2e:
            throw r2
        L_0x0f2f:
            goto L_0x0f2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.m7219D(java.lang.String, long):boolean");
    }

    @WorkerThread
    /* renamed from: E */
    private final void m7220E() {
        m7233i0();
        if (this.f4331p || this.f4332q || this.f4333r) {
            this.f4324i.mo12427b().mo13104O().mo13133d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f4331p), Boolean.valueOf(this.f4332q), Boolean.valueOf(this.f4333r));
            return;
        }
        this.f4324i.mo12427b().mo13104O().mo13130a("Stopping uploading service(s)");
        List<Runnable> list = this.f4328m;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f4328m.clear();
        }
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: F */
    private final boolean m7221F() {
        String str;
        C2383y3 y3Var;
        FileLock fileLock;
        m7233i0();
        if (!this.f4324i.mo12443x().mo12474s(C2302r.f4528n0) || (fileLock = this.f4334s) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f4324i.mo12428c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f4335t = channel;
                FileLock tryLock = channel.tryLock();
                this.f4334s = tryLock;
                if (tryLock != null) {
                    this.f4324i.mo12427b().mo13104O().mo13130a("Storage concurrent access okay");
                    return true;
                }
                this.f4324i.mo12427b().mo13096F().mo13130a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                e = e;
                y3Var = this.f4324i.mo12427b().mo13096F();
                str = "Failed to acquire storage lock";
                y3Var.mo13131b(str, e);
                return false;
            } catch (IOException e2) {
                e = e2;
                y3Var = this.f4324i.mo12427b().mo13096F();
                str = "Failed to access storage lock file";
                y3Var.mo13131b(str, e);
                return false;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                y3Var = this.f4324i.mo12427b().mo13099J();
                str = "Storage lock already acquired";
                y3Var.mo13131b(str, e);
                return false;
            }
        } else {
            this.f4324i.mo12427b().mo13104O().mo13130a("Storage concurrent access okay");
            return true;
        }
    }

    @WorkerThread
    /* renamed from: H */
    private final Boolean m7222H(C2147d5 d5Var) {
        try {
            if (d5Var.mo12597V() != -2147483648L) {
                if (d5Var.mo12597V() == ((long) C1620c.m4502a(this.f4324i.mo12428c()).mo11303e(d5Var.mo12634t(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C1620c.m4502a(this.f4324i.mo12428c()).mo11303e(d5Var.mo12634t(), 0).versionName;
                if (d5Var.mo12595T() != null && d5Var.mo12595T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: J */
    private final void m7223J(C1994t0.C1995a aVar, C1994t0.C1995a aVar2) {
        C1609u.m4465a("_e".equals(aVar.mo12081O()));
        mo12822Y();
        C2024v0 x = C2290p9.m7351x((C1994t0) ((C1889m4) aVar.mo11851I()), "_et");
        if (x.mo12107W() && x.mo12108X() > 0) {
            long X = x.mo12108X();
            mo12822Y();
            C2024v0 x2 = C2290p9.m7351x((C1994t0) ((C1889m4) aVar2.mo11851I()), "_et");
            if (x2 != null && x2.mo12108X() > 0) {
                X += x2.mo12108X();
            }
            mo12822Y().mo12886G(aVar2, "_et", Long.valueOf(X));
            mo12822Y().mo12886G(aVar, "_fr", 1L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0396 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03cd A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0403 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0412 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0446 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0730 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x076f A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x078a A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0831 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x083e A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0858 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x08d7 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x08e8 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0900 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0947 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x09a1 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022f A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0237 A[Catch:{ SQLiteException -> 0x035e, all -> 0x09f0 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7224K(com.google.android.gms.measurement.internal.zzaq r30, com.google.android.gms.measurement.internal.zzm r31) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.C1609u.m4475k(r31)
            java.lang.String r5 = r3.f4777a
            com.google.android.gms.common.internal.C1609u.m4471g(r5)
            long r5 = java.lang.System.nanoTime()
            r29.m7233i0()
            r29.mo12825b0()
            java.lang.String r15 = r3.f4777a
            r29.mo12822Y()
            boolean r7 = com.google.android.gms.measurement.internal.C2290p9.m7347R(r30, r31)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.f4784h
            if (r7 != 0) goto L_0x002e
            r1.mo12816R(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.v4 r7 = r29.mo12815Q()
            java.lang.String r8 = r2.f4766a
            boolean r7 = r7.mo13067A(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13099J()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo12413H()
            java.lang.String r6 = r2.f4766a
            java.lang.String r5 = r5.mo12995v(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo13132c(r6, r4, r5)
            com.google.android.gms.measurement.internal.v4 r3 = r29.mo12815Q()
            boolean r3 = r3.mo13074H(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.v4 r3 = r29.mo12815Q()
            boolean r3 = r3.mo13075J(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.f4766a
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i
            com.google.android.gms.measurement.internal.s9 r7 = r4.mo12412G()
            r9 = 11
            java.lang.String r11 = r2.f4766a
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.mo12965U(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            com.google.android.gms.measurement.internal.d5 r2 = r2.mo12512i0(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.mo12617h0()
            long r5 = r2.mo12615g0()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i
            com.google.android.gms.common.util.e r5 = r5.mo12429f()
            long r5 = r5.mo11378a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2302r.f4551z
            java.lang.Object r5 = r5.mo12867a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13103N()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo13130a(r4)
            r1.m7241q(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = com.google.android.gms.internal.measurement.C1973r8.m5912a()
            if (r7 == 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2302r.f4480L0
            boolean r7 = r7.mo12474s(r8)
            if (r7 == 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.a4 r7 = new com.google.android.gms.measurement.internal.a4
            java.lang.String r8 = r2.f4766a
            java.lang.String r9 = r2.f4768c
            com.google.android.gms.measurement.internal.zzal r10 = r2.f4767b
            android.os.Bundle r19 = r10.mo13151T()
            long r11 = r2.f4769d
            r16 = r7
            r17 = r8
            r18 = r9
            r20 = r11
            r16.<init>(r17, r18, r19, r20)
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i
            com.google.android.gms.measurement.internal.s9 r2 = r2.mo12412G()
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i
            com.google.android.gms.measurement.internal.b r8 = r8.mo12443x()
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C2302r.f4473I
            r10 = 25
            r11 = 100
            int r8 = r8.mo12470o(r15, r9, r10, r11)
            java.util.TreeSet r9 = new java.util.TreeSet
            android.os.Bundle r10 = r7.f3909d
            java.util.Set r10 = r10.keySet()
            r9.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x012c:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0199
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = com.google.android.gms.measurement.internal.C2323s9.m7567b0(r11)
            if (r12 == 0) goto L_0x018b
            int r10 = r10 + 1
            if (r10 <= r8) goto L_0x018b
            r12 = 48
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r12 = "Event can't contain more than "
            r13.append(r12)
            r13.append(r8)
            java.lang.String r12 = " params"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.google.android.gms.measurement.internal.w3 r13 = r2.mo12427b()
            com.google.android.gms.measurement.internal.y3 r13 = r13.mo13098H()
            r30 = r8
            com.google.android.gms.measurement.internal.u3 r8 = r2.mo13109j()
            r17 = r9
            java.lang.String r9 = r7.f3906a
            java.lang.String r8 = r8.mo12995v(r9)
            com.google.android.gms.measurement.internal.u3 r9 = r2.mo13109j()
            r18 = r2
            android.os.Bundle r2 = r7.f3909d
            java.lang.String r2 = r9.mo12993t(r2)
            r13.mo13132c(r12, r8, r2)
            android.os.Bundle r2 = r7.f3909d
            r8 = 5
            com.google.android.gms.measurement.internal.C2323s9.m7575r0(r2, r8)
            android.os.Bundle r2 = r7.f3909d
            r2.remove(r11)
            goto L_0x0191
        L_0x018b:
            r18 = r2
            r30 = r8
            r17 = r9
        L_0x0191:
            r8 = r30
            r9 = r17
            r2 = r18
            r13 = 0
            goto L_0x012c
        L_0x0199:
            com.google.android.gms.measurement.internal.zzaq r2 = new com.google.android.gms.measurement.internal.zzaq
            java.lang.String r8 = r7.f3906a
            com.google.android.gms.measurement.internal.zzal r9 = new com.google.android.gms.measurement.internal.zzal
            android.os.Bundle r10 = new android.os.Bundle
            android.os.Bundle r11 = r7.f3909d
            r10.<init>(r11)
            r9.<init>(r10)
            java.lang.String r10 = r7.f3907b
            long r11 = r7.f3908c
            r22 = r2
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r22.<init>(r23, r24, r25, r26)
        L_0x01ba:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()
            r8 = 2
            boolean r7 = r7.mo13095B(r8)
            if (r7 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13104O()
            com.google.android.gms.measurement.internal.a5 r9 = r1.f4324i
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo12413H()
            java.lang.String r9 = r9.mo12994u(r2)
            java.lang.String r10 = "Logging event"
            r7.mo13131b(r10, r9)
        L_0x01e0:
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()
            r7.mo12524u0()
            r1.mo12816R(r3)     // Catch:{ all -> 0x09f0 }
            boolean r7 = com.google.android.gms.internal.measurement.C2065x8.m6570a()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4478K0     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12474s(r9)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0200
            r7 = 1
            goto L_0x0201
        L_0x0200:
            r7 = 0
        L_0x0201:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x09f0 }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0224
            if (r7 == 0) goto L_0x0222
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0224
            java.lang.String r7 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            r7 = 0
            goto L_0x0225
        L_0x0224:
            r7 = 1
        L_0x0225:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x09f0 }
            if (r9 != 0) goto L_0x0234
            if (r7 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            r9 = 0
            goto L_0x0235
        L_0x0234:
            r9 = 1
        L_0x0235:
            if (r9 == 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.zzal r9 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.mo13154X(r11)     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x02b5
            com.google.android.gms.measurement.internal.zzal r7 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            java.lang.Double r7 = r7.mo13153W(r11)     // Catch:{ all -> 0x09f0 }
            double r12 = r7.doubleValue()     // Catch:{ all -> 0x09f0 }
            r17 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r12 = r12 * r17
            r19 = 0
            int r7 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x026a
            com.google.android.gms.measurement.internal.zzal r7 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            java.lang.Long r7 = r7.mo13152V(r11)     // Catch:{ all -> 0x09f0 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09f0 }
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            double r12 = r11 * r17
        L_0x026a:
            r17 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 > 0) goto L_0x0298
            r17 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0298
            long r11 = java.lang.Math.round(r12)     // Catch:{ all -> 0x09f0 }
            boolean r7 = com.google.android.gms.internal.measurement.C2065x8.m6570a()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x02bf
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2302r.f4478K0     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12474s(r13)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x02bf
            java.lang.String r7 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x02bf
            long r11 = -r11
            goto L_0x02bf
        L_0x0298:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13099J()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)     // Catch:{ all -> 0x09f0 }
            java.lang.Double r10 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x09f0 }
            r7.mo13132c(r8, r9, r10)     // Catch:{ all -> 0x09f0 }
            r22 = r5
            r5 = 0
            r11 = 0
            goto L_0x03cb
        L_0x02b5:
            com.google.android.gms.measurement.internal.zzal r7 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            java.lang.Long r7 = r7.mo13152V(r11)     // Catch:{ all -> 0x09f0 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09f0 }
        L_0x02bf:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x03c7
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09f0 }
            if (r9 == 0) goto L_0x03c7
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09f0 }
            int r10 = r7.length()     // Catch:{ all -> 0x09f0 }
            if (r10 == 0) goto L_0x02e4
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09f0 }
            goto L_0x02e9
        L_0x02e4:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09f0 }
            r7.<init>(r9)     // Catch:{ all -> 0x09f0 }
        L_0x02e9:
            r10 = r7
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r7 = r7.mo12516n0(r15, r10)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0325
            java.lang.Object r9 = r7.f4630e     // Catch:{ all -> 0x09f0 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09f0 }
            if (r9 != 0) goto L_0x02fb
            goto L_0x0325
        L_0x02fb:
            java.lang.Object r7 = r7.f4630e     // Catch:{ all -> 0x09f0 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09f0 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r17 = new com.google.android.gms.measurement.internal.t9     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = r2.f4768c     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r13 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.util.e r13 = r13.mo12429f()     // Catch:{ all -> 0x09f0 }
            long r18 = r13.mo11378a()     // Catch:{ all -> 0x09f0 }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f0 }
            r7 = r17
            r8 = r15
            r22 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f0 }
        L_0x0322:
            r6 = r17
            goto L_0x038c
        L_0x0325:
            r22 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r9 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r9 = r9.mo12443x()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C2302r.f4465E     // Catch:{ all -> 0x09f0 }
            int r9 = r9.mo12476u(r15, r13)     // Catch:{ all -> 0x09f0 }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.C1609u.m4471g(r15)     // Catch:{ all -> 0x09f0 }
            r7.mo12567h()     // Catch:{ all -> 0x09f0 }
            r7.mo12749r()     // Catch:{ all -> 0x09f0 }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo12525v()     // Catch:{ SQLiteException -> 0x035e }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x035e }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x035e }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x035e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x035e }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x035e }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x035e }
            goto L_0x0371
        L_0x035e:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)     // Catch:{ all -> 0x09f0 }
            r7.mo13132c(r8, r9, r6)     // Catch:{ all -> 0x09f0 }
        L_0x0371:
            com.google.android.gms.measurement.internal.t9 r17 = new com.google.android.gms.measurement.internal.t9     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = r2.f4768c     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r6 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.util.e r6 = r6.mo12429f()     // Catch:{ all -> 0x09f0 }
            long r18 = r6.mo11378a()     // Catch:{ all -> 0x09f0 }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09f0 }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f0 }
            goto L_0x0322
        L_0x038c:
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12508S(r6)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r10 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.u3 r10 = r10.mo12413H()     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = r6.f4628c     // Catch:{ all -> 0x09f0 }
            java.lang.String r10 = r10.mo12997z(r11)     // Catch:{ all -> 0x09f0 }
            java.lang.Object r6 = r6.f4630e     // Catch:{ all -> 0x09f0 }
            r7.mo13133d(r8, r9, r10, r6)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r6 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r6.mo12412G()     // Catch:{ all -> 0x09f0 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.mo12965U(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f0 }
            goto L_0x03ca
        L_0x03c7:
            r22 = r5
            r5 = 0
        L_0x03ca:
            r11 = 1
        L_0x03cb:
            if (r11 != 0) goto L_0x03df
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12523u()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            return
        L_0x03dc:
            r22 = r5
            r5 = 0
        L_0x03df:
            java.lang.String r6 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r6 = com.google.android.gms.measurement.internal.C2323s9.m7567b0(r6)     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09f0 }
            boolean r7 = com.google.android.gms.internal.measurement.C2065x8.m6570a()     // Catch:{ all -> 0x09f0 }
            r19 = 1
            if (r7 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4470G0     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12456B(r8, r9)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            r7.mo12412G()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.zzal r7 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            long r7 = com.google.android.gms.measurement.internal.C2323s9.m7580x(r7)     // Catch:{ all -> 0x09f0 }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x0414
        L_0x0412:
            r11 = r19
        L_0x0414:
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            long r8 = r29.m7234j0()     // Catch:{ all -> 0x09f0 }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r30 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.f r7 = r7.mo12488A(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09f0 }
            long r8 = r7.f4102b     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C2302r.f4521k     // Catch:{ all -> 0x09f0 }
            r14 = 0
            java.lang.Object r10 = r10.mo12867a(r14)     // Catch:{ all -> 0x09f0 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09f0 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09f0 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f0 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x0473
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0464
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r30)     // Catch:{ all -> 0x09f0 }
            long r5 = r7.f4102b     // Catch:{ all -> 0x09f0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f0 }
            r2.mo13132c(r3, r4, r5)     // Catch:{ all -> 0x09f0 }
        L_0x0464:
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12523u()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            return
        L_0x0473:
            if (r6 == 0) goto L_0x04c8
            long r8 = r7.f4101a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C2302r.f4525m     // Catch:{ all -> 0x09f0 }
            java.lang.Object r15 = r15.mo12867a(r14)     // Catch:{ all -> 0x09f0 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09f0 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09f0 }
            long r14 = (long) r15     // Catch:{ all -> 0x09f0 }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x04c8
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x04a7
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r30)     // Catch:{ all -> 0x09f0 }
            long r6 = r7.f4101a     // Catch:{ all -> 0x09f0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09f0 }
            r3.mo13132c(r4, r5, r6)     // Catch:{ all -> 0x09f0 }
        L_0x04a7:
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r3.mo12412G()     // Catch:{ all -> 0x09f0 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            r12 = 0
            r8 = r30
            r7.mo12965U(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12523u()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            return
        L_0x04c8:
            if (r18 == 0) goto L_0x0517
            long r8 = r7.f4104d     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r10 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r10 = r10.mo12443x()     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C2302r.f4523l     // Catch:{ all -> 0x09f0 }
            int r10 = r10.mo12476u(r11, r14)     // Catch:{ all -> 0x09f0 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09f0 }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09f0 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f0 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0517
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0508
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r30)     // Catch:{ all -> 0x09f0 }
            long r5 = r7.f4104d     // Catch:{ all -> 0x09f0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f0 }
            r2.mo13132c(r3, r4, r5)     // Catch:{ all -> 0x09f0 }
        L_0x0508:
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12523u()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            return
        L_0x0517:
            com.google.android.gms.measurement.internal.zzal r7 = r2.f4767b     // Catch:{ all -> 0x09f0 }
            android.os.Bundle r14 = r7.mo13151T()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r7.mo12412G()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f4768c     // Catch:{ all -> 0x09f0 }
            r7.mo12956M(r14, r8, r9)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r7.mo12412G()     // Catch:{ all -> 0x09f0 }
            r15 = r30
            boolean r7 = r7.mo12946B0(r15)     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0556
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r7.mo12412G()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f0 }
            r7.mo12956M(r14, r8, r9)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r7.mo12412G()     // Catch:{ all -> 0x09f0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f0 }
            r7.mo12956M(r14, r11, r8)     // Catch:{ all -> 0x09f0 }
        L_0x0556:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x057d
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r7 = r7.mo12516n0(r8, r4)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x057d
            java.lang.Object r8 = r7.f4630e     // Catch:{ all -> 0x09f0 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09f0 }
            if (r8 == 0) goto L_0x057d
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r8 = r8.mo12412G()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r7 = r7.f4630e     // Catch:{ all -> 0x09f0 }
            r8.mo12956M(r14, r4, r7)     // Catch:{ all -> 0x09f0 }
        L_0x057d:
            com.google.android.gms.measurement.internal.c r4 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            long r7 = r4.mo12515m0(r15)     // Catch:{ all -> 0x09f0 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x05a0
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13099J()     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)     // Catch:{ all -> 0x09f0 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f0 }
            r4.mo13132c(r9, r10, r7)     // Catch:{ all -> 0x09f0 }
        L_0x05a0:
            com.google.android.gms.measurement.internal.k r4 = new com.google.android.gms.measurement.internal.k     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = r2.f4768c     // Catch:{ all -> 0x09f0 }
            java.lang.String r10 = r2.f4766a     // Catch:{ all -> 0x09f0 }
            long r12 = r2.f4769d     // Catch:{ all -> 0x09f0 }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r28 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.C2111a5) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r4.f4254b     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.m r7 = r7.mo12492C(r2, r8)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x063e
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            long r7 = r7.mo12530x0(r2)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r9 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r9 = r9.mo12443x()     // Catch:{ all -> 0x09f0 }
            int r9 = r9.mo12469n(r2)     // Catch:{ all -> 0x09f0 }
            long r9 = (long) r9     // Catch:{ all -> 0x09f0 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0624
            if (r6 == 0) goto L_0x0624
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r2)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo12413H()     // Catch:{ all -> 0x09f0 }
            java.lang.String r4 = r4.f4254b     // Catch:{ all -> 0x09f0 }
            java.lang.String r4 = r7.mo12995v(r4)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            int r7 = r7.mo12469n(r2)     // Catch:{ all -> 0x09f0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09f0 }
            r3.mo13133d(r5, r6, r4, r7)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r7 = r3.mo12412G()     // Catch:{ all -> 0x09f0 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.mo12965U(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            return
        L_0x0624:
            com.google.android.gms.measurement.internal.m r6 = new com.google.android.gms.measurement.internal.m     // Catch:{ all -> 0x09f0 }
            java.lang.String r9 = r4.f4254b     // Catch:{ all -> 0x09f0 }
            r10 = 0
            r12 = 0
            long r14 = r4.f4256d     // Catch:{ all -> 0x09f0 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09f0 }
            goto L_0x064c
        L_0x063e:
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            long r8 = r7.f4348f     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.k r4 = r4.mo12781a(r2, r8)     // Catch:{ all -> 0x09f0 }
            long r8 = r4.f4256d     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.m r6 = r7.mo12841a(r8)     // Catch:{ all -> 0x09f0 }
        L_0x064c:
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12502M(r6)     // Catch:{ all -> 0x09f0 }
            r29.m7233i0()     // Catch:{ all -> 0x09f0 }
            r29.mo12825b0()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.internal.C1609u.m4475k(r4)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.internal.C1609u.m4475k(r31)     // Catch:{ all -> 0x09f0 }
            java.lang.String r2 = r4.f4253a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.internal.C1609u.m4471g(r2)     // Catch:{ all -> 0x09f0 }
            java.lang.String r2 = r4.f4253a     // Catch:{ all -> 0x09f0 }
            java.lang.String r6 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.common.internal.C1609u.m4465a(r2)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.internal.measurement.x0$a r2 = com.google.android.gms.internal.measurement.C2056x0.m6324N0()     // Catch:{ all -> 0x09f0 }
            r6 = 1
            r2.mo12313u(r6)     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = "android"
            r2.mo12261D(r7)     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0689
            java.lang.String r7 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            r2.mo12268L0(r7)     // Catch:{ all -> 0x09f0 }
        L_0x0689:
            java.lang.String r7 = r3.f4780d     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0696
            java.lang.String r7 = r3.f4780d     // Catch:{ all -> 0x09f0 }
            r2.mo12260C0(r7)     // Catch:{ all -> 0x09f0 }
        L_0x0696:
            java.lang.String r7 = r3.f4779c     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x06a3
            java.lang.String r7 = r3.f4779c     // Catch:{ all -> 0x09f0 }
            r2.mo12275P0(r7)     // Catch:{ all -> 0x09f0 }
        L_0x06a3:
            long r7 = r3.f4786j     // Catch:{ all -> 0x09f0 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06b2
            long r7 = r3.f4786j     // Catch:{ all -> 0x09f0 }
            int r8 = (int) r7     // Catch:{ all -> 0x09f0 }
            r2.mo12277T0(r8)     // Catch:{ all -> 0x09f0 }
        L_0x06b2:
            long r7 = r3.f4781e     // Catch:{ all -> 0x09f0 }
            r2.mo12267K0(r7)     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = r3.f4778b     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x06c4
            java.lang.String r7 = r3.f4778b     // Catch:{ all -> 0x09f0 }
            r2.mo12295h1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x06c4:
            boolean r7 = com.google.android.gms.internal.measurement.C1832ia.m5256a()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0713
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4532p0     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12456B(r8, r9)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0713
            java.lang.String r7 = r2.mo12300k1()     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x06f1
            java.lang.String r7 = r3.f4798v     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x06f1
            java.lang.String r7 = r3.f4798v     // Catch:{ all -> 0x09f0 }
            r2.mo12310r1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x06f1:
            java.lang.String r7 = r2.mo12300k1()     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0728
            java.lang.String r7 = r2.mo12309q1()     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0728
            java.lang.String r7 = r3.f4794r     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0728
            java.lang.String r7 = r3.f4794r     // Catch:{ all -> 0x09f0 }
        L_0x070f:
            r2.mo12307p1(r7)     // Catch:{ all -> 0x09f0 }
            goto L_0x0728
        L_0x0713:
            java.lang.String r7 = r2.mo12300k1()     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0728
            java.lang.String r7 = r3.f4794r     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0728
            java.lang.String r7 = r3.f4794r     // Catch:{ all -> 0x09f0 }
            goto L_0x070f
        L_0x0728:
            long r7 = r3.f4782f     // Catch:{ all -> 0x09f0 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0735
            long r7 = r3.f4782f     // Catch:{ all -> 0x09f0 }
            r2.mo12279U0(r7)     // Catch:{ all -> 0x09f0 }
        L_0x0735:
            long r7 = r3.f4796t     // Catch:{ all -> 0x09f0 }
            r2.mo12293g1(r7)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2302r.f4498X     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12456B(r8, r11)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0757
            com.google.android.gms.measurement.internal.p9 r7 = r29.mo12822Y()     // Catch:{ all -> 0x09f0 }
            java.util.List r7 = r7.mo12893X()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x0757
            r2.mo12299k0(r7)     // Catch:{ all -> 0x09f0 }
        L_0x0757:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.j4 r7 = r7.mo12406A()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            android.util.Pair r7 = r7.mo12764t(r8)     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x078a
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x09f0 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x09f0 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09f0 }
            if (r8 != 0) goto L_0x078a
            boolean r8 = r3.f4791o     // Catch:{ all -> 0x09f0 }
            if (r8 == 0) goto L_0x07ec
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x09f0 }
            r2.mo12280V0(r8)     // Catch:{ all -> 0x09f0 }
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x09f0 }
            if (r8 == 0) goto L_0x07ec
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x09f0 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x09f0 }
            r2.mo12262E(r7)     // Catch:{ all -> 0x09f0 }
            goto L_0x07ec
        L_0x078a:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            android.content.Context r8 = r8.mo12428c()     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12789t(r8)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x07ec
            boolean r7 = r3.f4792p     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x07ec
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            android.content.Context r7 = r7.mo12428c()     // Catch:{ all -> 0x09f0 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x07cc
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13099J()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r2.mo12290d1()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r11)     // Catch:{ all -> 0x09f0 }
            r7.mo13131b(r8, r11)     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = "null"
            goto L_0x07e9
        L_0x07cc:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x09f0 }
            if (r8 == 0) goto L_0x07e9
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r8 = r8.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13099J()     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r2.mo12290d1()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r12)     // Catch:{ all -> 0x09f0 }
            r8.mo13131b(r11, r12)     // Catch:{ all -> 0x09f0 }
        L_0x07e9:
            r2.mo12303m1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x07ec:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()     // Catch:{ all -> 0x09f0 }
            r7.mo13079o()     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x09f0 }
            r2.mo12294h0(r7)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()     // Catch:{ all -> 0x09f0 }
            r7.mo13079o()     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09f0 }
            r2.mo12274P(r7)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()     // Catch:{ all -> 0x09f0 }
            long r7 = r7.mo12790u()     // Catch:{ all -> 0x09f0 }
            int r8 = (int) r7     // Catch:{ all -> 0x09f0 }
            r2.mo12266H0(r8)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()     // Catch:{ all -> 0x09f0 }
            java.lang.String r7 = r7.mo12791v()     // Catch:{ all -> 0x09f0 }
            r2.mo12301l0(r7)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C2302r.f4484N0     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12474s(r8)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x0836
            long r7 = r3.f4788l     // Catch:{ all -> 0x09f0 }
            r2.mo12287b1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x0836:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            boolean r7 = r7.mo12436p()     // Catch:{ all -> 0x09f0 }
            if (r7 == 0) goto L_0x084c
            r2.mo12290d1()     // Catch:{ all -> 0x09f0 }
            boolean r7 = android.text.TextUtils.isEmpty(r28)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x084c
            r7 = r28
            r2.mo12305o1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x084c:
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.d5 r7 = r7.mo12512i0(r8)     // Catch:{ all -> 0x09f0 }
            if (r7 != 0) goto L_0x08cd
            com.google.android.gms.measurement.internal.d5 r7 = new com.google.android.gms.measurement.internal.d5     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            r7.<init>(r8, r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.s9 r8 = r8.mo12412G()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r8.mo12955L0()     // Catch:{ all -> 0x09f0 }
            r7.mo12606c(r8)     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4787k     // Catch:{ all -> 0x09f0 }
            r7.mo12581F(r8)     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4778b     // Catch:{ all -> 0x09f0 }
            r7.mo12632r(r8)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.j4 r8 = r8.mo12406A()     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r8.mo12767w(r11)     // Catch:{ all -> 0x09f0 }
            r7.mo12578C(r8)     // Catch:{ all -> 0x09f0 }
            r7.mo12583H(r9)     // Catch:{ all -> 0x09f0 }
            r7.mo12602a(r9)     // Catch:{ all -> 0x09f0 }
            r7.mo12631q(r9)     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4779c     // Catch:{ all -> 0x09f0 }
            r7.mo12584I(r8)     // Catch:{ all -> 0x09f0 }
            long r11 = r3.f4786j     // Catch:{ all -> 0x09f0 }
            r7.mo12635u(r11)     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r3.f4780d     // Catch:{ all -> 0x09f0 }
            r7.mo12587L(r8)     // Catch:{ all -> 0x09f0 }
            long r11 = r3.f4781e     // Catch:{ all -> 0x09f0 }
            r7.mo12639y(r11)     // Catch:{ all -> 0x09f0 }
            long r11 = r3.f4782f     // Catch:{ all -> 0x09f0 }
            r7.mo12577B(r11)     // Catch:{ all -> 0x09f0 }
            boolean r8 = r3.f4784h     // Catch:{ all -> 0x09f0 }
            r7.mo12610e(r8)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r8 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r8 = r8.mo12443x()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2302r.f4484N0     // Catch:{ all -> 0x09f0 }
            boolean r8 = r8.mo12474s(r11)     // Catch:{ all -> 0x09f0 }
            if (r8 != 0) goto L_0x08c1
            long r11 = r3.f4788l     // Catch:{ all -> 0x09f0 }
            r7.mo12607c0(r11)     // Catch:{ all -> 0x09f0 }
        L_0x08c1:
            long r11 = r3.f4796t     // Catch:{ all -> 0x09f0 }
            r7.mo12580E(r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r8 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r8.mo12503N(r7)     // Catch:{ all -> 0x09f0 }
        L_0x08cd:
            java.lang.String r8 = r7.mo12638x()     // Catch:{ all -> 0x09f0 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09f0 }
            if (r8 != 0) goto L_0x08de
            java.lang.String r8 = r7.mo12638x()     // Catch:{ all -> 0x09f0 }
            r2.mo12285a1(r8)     // Catch:{ all -> 0x09f0 }
        L_0x08de:
            java.lang.String r8 = r7.mo12588M()     // Catch:{ all -> 0x09f0 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09f0 }
            if (r8 != 0) goto L_0x08ef
            java.lang.String r7 = r7.mo12588M()     // Catch:{ all -> 0x09f0 }
            r2.mo12298j1(r7)     // Catch:{ all -> 0x09f0 }
        L_0x08ef:
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            java.lang.String r3 = r3.f4777a     // Catch:{ all -> 0x09f0 }
            java.util.List r3 = r7.mo12498G(r3)     // Catch:{ all -> 0x09f0 }
            r11 = 0
        L_0x08fa:
            int r7 = r3.size()     // Catch:{ all -> 0x09f0 }
            if (r11 >= r7) goto L_0x092f
            com.google.android.gms.internal.measurement.b1$a r7 = com.google.android.gms.internal.measurement.C1715b1.m4739Y()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r8 = (com.google.android.gms.measurement.internal.C2334t9) r8     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r8.f4628c     // Catch:{ all -> 0x09f0 }
            r7.mo11449x(r8)     // Catch:{ all -> 0x09f0 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r8 = (com.google.android.gms.measurement.internal.C2334t9) r8     // Catch:{ all -> 0x09f0 }
            long r12 = r8.f4629d     // Catch:{ all -> 0x09f0 }
            r7.mo11448w(r12)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.p9 r8 = r29.mo12822Y()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.t9 r12 = (com.google.android.gms.measurement.internal.C2334t9) r12     // Catch:{ all -> 0x09f0 }
            java.lang.Object r12 = r12.f4630e     // Catch:{ all -> 0x09f0 }
            r8.mo12888J(r7, r12)     // Catch:{ all -> 0x09f0 }
            r2.mo12318z(r7)     // Catch:{ all -> 0x09f0 }
            int r11 = r11 + 1
            goto L_0x08fa
        L_0x092f:
            com.google.android.gms.measurement.internal.c r3 = r29.mo12819U()     // Catch:{ IOException -> 0x09a4 }
            com.google.android.gms.internal.measurement.x5 r7 = r2.mo11851I()     // Catch:{ IOException -> 0x09a4 }
            com.google.android.gms.internal.measurement.m4 r7 = (com.google.android.gms.internal.measurement.C1889m4) r7     // Catch:{ IOException -> 0x09a4 }
            com.google.android.gms.internal.measurement.x0 r7 = (com.google.android.gms.internal.measurement.C2056x0) r7     // Catch:{ IOException -> 0x09a4 }
            long r2 = r3.mo12529x(r7)     // Catch:{ IOException -> 0x09a4 }
            com.google.android.gms.measurement.internal.c r7 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.zzal r8 = r4.f4258f     // Catch:{ all -> 0x09f0 }
            if (r8 == 0) goto L_0x099a
            com.google.android.gms.measurement.internal.zzal r8 = r4.f4258f     // Catch:{ all -> 0x09f0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09f0 }
        L_0x094d:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09f0 }
            if (r11 == 0) goto L_0x0961
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09f0 }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09f0 }
            if (r11 == 0) goto L_0x094d
        L_0x095f:
            r11 = 1
            goto L_0x099b
        L_0x0961:
            com.google.android.gms.measurement.internal.v4 r5 = r29.mo12815Q()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r4.f4253a     // Catch:{ all -> 0x09f0 }
            java.lang.String r11 = r4.f4254b     // Catch:{ all -> 0x09f0 }
            boolean r5 = r5.mo13069C(r8, r11)     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r11 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            long r12 = r29.m7234j0()     // Catch:{ all -> 0x09f0 }
            java.lang.String r14 = r4.f4253a     // Catch:{ all -> 0x09f0 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.f r8 = r11.mo12490B(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09f0 }
            if (r5 == 0) goto L_0x099a
            long r11 = r8.f4105e     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.b r5 = r5.mo12443x()     // Catch:{ all -> 0x09f0 }
            java.lang.String r8 = r4.f4253a     // Catch:{ all -> 0x09f0 }
            int r5 = r5.mo12475t(r8)     // Catch:{ all -> 0x09f0 }
            long r13 = (long) r5     // Catch:{ all -> 0x09f0 }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x099a
            goto L_0x095f
        L_0x099a:
            r11 = 0
        L_0x099b:
            boolean r2 = r7.mo12507R(r4, r2, r11)     // Catch:{ all -> 0x09f0 }
            if (r2 == 0) goto L_0x09bd
            r1.f4327l = r9     // Catch:{ all -> 0x09f0 }
            goto L_0x09bd
        L_0x09a4:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ all -> 0x09f0 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo12290d1()     // Catch:{ all -> 0x09f0 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r2)     // Catch:{ all -> 0x09f0 }
            r4.mo13132c(r5, r2, r3)     // Catch:{ all -> 0x09f0 }
        L_0x09bd:
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()     // Catch:{ all -> 0x09f0 }
            r2.mo12523u()     // Catch:{ all -> 0x09f0 }
            com.google.android.gms.measurement.internal.c r2 = r29.mo12819U()
            r2.mo12533z0()
            r29.m7238l0()
            com.google.android.gms.measurement.internal.a5 r2 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13104O()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo13131b(r4, r3)
            return
        L_0x09f0:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.c r3 = r29.mo12819U()
            r3.mo12533z0()
            goto L_0x09fb
        L_0x09fa:
            throw r2
        L_0x09fb:
            goto L_0x09fa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.m7224K(com.google.android.gms.measurement.internal.zzaq, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: L */
    private static void m7225L(C2211i9 i9Var) {
        if (i9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!i9Var.mo12748q()) {
            String valueOf = String.valueOf(i9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: V */
    private final boolean m7226V(zzm zzm) {
        return (!C1832ia.m5256a() || !this.f4324i.mo12443x().mo12456B(zzm.f4777a, C2302r.f4532p0)) ? !TextUtils.isEmpty(zzm.f4778b) || !TextUtils.isEmpty(zzm.f4794r) : !TextUtils.isEmpty(zzm.f4778b) || !TextUtils.isEmpty(zzm.f4798v) || !TextUtils.isEmpty(zzm.f4794r);
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: d */
    private final int m7227d(FileChannel fileChannel) {
        m7233i0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f4324i.mo12427b().mo13096F().mo13130a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f4324i.mo12427b().mo13099J().mo13131b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.f4324i.mo12427b().mo13096F().mo13131b("Failed to read from channel", e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.C2147d5 m7228e(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.C2147d5 r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.d5 r10 = new com.google.android.gms.measurement.internal.d5
            com.google.android.gms.measurement.internal.a5 r1 = r8.f4324i
            java.lang.String r2 = r9.f4777a
            r10.<init>(r1, r2)
            com.google.android.gms.measurement.internal.a5 r1 = r8.f4324i
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo12412G()
            java.lang.String r1 = r1.mo12955L0()
            r10.mo12606c(r1)
            r10.mo12578C(r11)
        L_0x001c:
            r11 = 1
            goto L_0x003a
        L_0x001e:
            java.lang.String r1 = r10.mo12585J()
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0039
            r10.mo12578C(r11)
            com.google.android.gms.measurement.internal.a5 r11 = r8.f4324i
            com.google.android.gms.measurement.internal.s9 r11 = r11.mo12412G()
            java.lang.String r11 = r11.mo12955L0()
            r10.mo12606c(r11)
            goto L_0x001c
        L_0x0039:
            r11 = 0
        L_0x003a:
            java.lang.String r1 = r9.f4778b
            java.lang.String r2 = r10.mo12576A()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r11 = r9.f4778b
            r10.mo12632r(r11)
            r11 = 1
        L_0x004c:
            java.lang.String r1 = r9.f4794r
            java.lang.String r2 = r10.mo12579D()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r11 = r9.f4794r
            r10.mo12636v(r11)
            r11 = 1
        L_0x005e:
            boolean r1 = com.google.android.gms.internal.measurement.C1832ia.m5256a()
            if (r1 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.a5 r1 = r8.f4324i
            com.google.android.gms.measurement.internal.b r1 = r1.mo12443x()
            java.lang.String r2 = r10.mo12634t()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2302r.f4532p0
            boolean r1 = r1.mo12456B(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r9.f4798v
            java.lang.String r2 = r10.mo12582G()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r11 = r9.f4798v
            r10.mo12640z(r11)
            r11 = 1
        L_0x0088:
            java.lang.String r1 = r9.f4787k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r9.f4787k
            java.lang.String r2 = r10.mo12588M()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r11 = r9.f4787k
            r10.mo12581F(r11)
            r11 = 1
        L_0x00a2:
            long r1 = r9.f4781e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            long r5 = r10.mo12601Z()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            long r1 = r9.f4781e
            r10.mo12639y(r1)
            r11 = 1
        L_0x00b8:
            java.lang.String r1 = r9.f4779c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = r9.f4779c
            java.lang.String r2 = r10.mo12595T()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r11 = r9.f4779c
            r10.mo12584I(r11)
            r11 = 1
        L_0x00d2:
            long r1 = r9.f4786j
            long r5 = r10.mo12597V()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            long r1 = r9.f4786j
            r10.mo12635u(r1)
            r11 = 1
        L_0x00e2:
            java.lang.String r1 = r9.f4780d
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r10.mo12599X()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            java.lang.String r11 = r9.f4780d
            r10.mo12587L(r11)
            r11 = 1
        L_0x00f6:
            long r1 = r9.f4782f
            long r5 = r10.mo12605b0()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0106
            long r1 = r9.f4782f
            r10.mo12577B(r1)
            r11 = 1
        L_0x0106:
            boolean r1 = r9.f4784h
            boolean r2 = r10.mo12611e0()
            if (r1 == r2) goto L_0x0114
            boolean r11 = r9.f4784h
            r10.mo12610e(r11)
            r11 = 1
        L_0x0114:
            java.lang.String r1 = r9.f4783g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012e
            java.lang.String r1 = r9.f4783g
            java.lang.String r2 = r10.mo12618i()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012e
            java.lang.String r11 = r9.f4783g
            r10.mo12590O(r11)
            r11 = 1
        L_0x012e:
            com.google.android.gms.measurement.internal.a5 r1 = r8.f4324i
            com.google.android.gms.measurement.internal.b r1 = r1.mo12443x()
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4484N0
            boolean r1 = r1.mo12474s(r2)
            if (r1 != 0) goto L_0x014c
            long r1 = r9.f4788l
            long r5 = r10.mo12622k()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x014c
            long r1 = r9.f4788l
            r10.mo12607c0(r1)
            r11 = 1
        L_0x014c:
            boolean r1 = r9.f4791o
            boolean r2 = r10.mo12624l()
            if (r1 == r2) goto L_0x015a
            boolean r11 = r9.f4791o
            r10.mo12633s(r11)
            r11 = 1
        L_0x015a:
            boolean r1 = r9.f4792p
            boolean r2 = r10.mo12626m()
            if (r1 == r2) goto L_0x0168
            boolean r11 = r9.f4792p
            r10.mo12637w(r11)
            r11 = 1
        L_0x0168:
            java.lang.Boolean r1 = r9.f4795s
            java.lang.Boolean r2 = r10.mo12628n()
            if (r1 == r2) goto L_0x0176
            java.lang.Boolean r11 = r9.f4795s
            r10.mo12604b(r11)
            r11 = 1
        L_0x0176:
            long r1 = r9.f4796t
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r3 = r10.mo12609d0()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018a
            long r1 = r9.f4796t
            r10.mo12580E(r1)
            goto L_0x018b
        L_0x018a:
            r0 = r11
        L_0x018b:
            if (r0 == 0) goto L_0x0194
            com.google.android.gms.measurement.internal.c r9 = r8.mo12819U()
            r9.mo12503N(r10)
        L_0x0194:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.m7228e(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.d5, java.lang.String):com.google.android.gms.measurement.internal.d5");
    }

    /* renamed from: g */
    public static C2245l9 m7229g(Context context) {
        C1609u.m4475k(context);
        C1609u.m4475k(context.getApplicationContext());
        if (f4315x == null) {
            synchronized (C2245l9.class) {
                if (f4315x == null) {
                    f4315x = new C2245l9(new C2301q9(context));
                }
            }
        }
        return f4315x;
    }

    /* renamed from: g0 */
    private final C2194h4 m7230g0() {
        C2194h4 h4Var = this.f4319d;
        if (h4Var != null) {
            return h4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @WorkerThread
    /* renamed from: h */
    private final zzm m7231h(String str) {
        String str2 = str;
        C2147d5 i0 = mo12819U().mo12512i0(str2);
        if (i0 == null || TextUtils.isEmpty(i0.mo12595T())) {
            this.f4324i.mo12427b().mo13103N().mo13131b("No app data available; dropping", str2);
            return null;
        }
        Boolean H = m7222H(i0);
        if (H == null || H.booleanValue()) {
            return new zzm(str, i0.mo12576A(), i0.mo12595T(), i0.mo12597V(), i0.mo12599X(), i0.mo12601Z(), i0.mo12605b0(), (String) null, i0.mo12611e0(), false, i0.mo12588M(), i0.mo12622k(), 0, 0, i0.mo12624l(), i0.mo12626m(), false, i0.mo12579D(), i0.mo12628n(), i0.mo12609d0(), i0.mo12629o(), (!C1832ia.m5256a() || !this.f4324i.mo12443x().mo12456B(str2, C2302r.f4532p0)) ? null : i0.mo12582G());
        }
        this.f4324i.mo12427b().mo13096F().mo13131b("App version does not match; dropping. appId", C2361w3.m7696w(str));
        return null;
    }

    /* renamed from: h0 */
    private final C2199h9 m7232h0() {
        m7225L(this.f4320e);
        return this.f4320e;
    }

    @WorkerThread
    /* renamed from: i0 */
    private final void m7233i0() {
        this.f4324i.mo12426a().mo12567h();
    }

    /* renamed from: j0 */
    private final long m7234j0() {
        long a = this.f4324i.mo12429f().mo11378a();
        C2218j4 A = this.f4324i.mo12406A();
        A.mo13079o();
        A.mo12567h();
        long a2 = A.f4226i.mo12849a();
        if (a2 == 0) {
            a2 = 1 + ((long) A.mo13110k().mo12950F0().nextInt(86400000));
            A.f4226i.mo12850b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    @VisibleForTesting
    /* renamed from: k */
    private static void m7235k(C1994t0.C1995a aVar, int i, String str) {
        List<C2024v0> D = aVar.mo12076D();
        int i2 = 0;
        while (i2 < D.size()) {
            if (!"_err".equals(D.get(i2).mo12104L())) {
                i2++;
            } else {
                return;
            }
        }
        C2024v0.C2025a d0 = C2024v0.m6072d0();
        d0.mo12123z("_err");
        d0.mo12120w(Long.valueOf((long) i).longValue());
        C2024v0.C2025a d02 = C2024v0.m6072d0();
        d02.mo12123z("_ev");
        d02.mo12114B(str);
        aVar.mo12088y((C2024v0) ((C1889m4) d0.mo11851I()));
        aVar.mo12088y((C2024v0) ((C1889m4) d02.mo11851I()));
    }

    /* renamed from: k0 */
    private final boolean m7236k0() {
        m7233i0();
        mo12825b0();
        return mo12819U().mo12495E0() || !TextUtils.isEmpty(mo12819U().mo12527w());
    }

    @VisibleForTesting
    /* renamed from: l */
    private static void m7237l(C1994t0.C1995a aVar, @NonNull String str) {
        List<C2024v0> D = aVar.mo12076D();
        for (int i = 0; i < D.size(); i++) {
            if (str.equals(D.get(i).mo12104L())) {
                aVar.mo12078F(i);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    @androidx.annotation.WorkerThread
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7238l0() {
        /*
            r21 = this;
            r0 = r21
            r21.m7233i0()
            r21.mo12825b0()
            long r1 = r0.f4327l
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.common.util.e r1 = r1.mo12429f()
            long r1 = r1.mo11379b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f4327l
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo13131b(r3, r2)
            com.google.android.gms.measurement.internal.h4 r1 = r21.m7230g0()
            r1.mo12694c()
            com.google.android.gms.measurement.internal.h9 r1 = r21.m7232h0()
            r1.mo12738v()
            return
        L_0x004b:
            r0.f4327l = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            boolean r1 = r1.mo12441u()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r21.m7236k0()
            if (r1 != 0) goto L_0x005d
            goto L_0x0239
        L_0x005d:
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.common.util.e r1 = r1.mo12429f()
            long r1 = r1.mo11378a()
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2302r.f4457A
            r6 = 0
            java.lang.Object r5 = r5.mo12867a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.c r5 = r21.mo12819U()
            boolean r5 = r5.mo12497F0()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.c r5 = r21.mo12819U()
            boolean r5 = r5.mo12489A0()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00b0
            com.google.android.gms.measurement.internal.a5 r10 = r0.f4324i
            com.google.android.gms.measurement.internal.b r10 = r10.mo12443x()
            java.lang.String r10 = r10.mo12466O()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00ad
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2302r.f4543v
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2302r.f4541u
            goto L_0x00b2
        L_0x00b0:
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C2302r.f4539t
        L_0x00b2:
            java.lang.Object r10 = r10.mo12867a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.a5 r12 = r0.f4324i
            com.google.android.gms.measurement.internal.j4 r12 = r12.mo12406A()
            com.google.android.gms.measurement.internal.n4 r12 = r12.f4222e
            long r12 = r12.mo12849a()
            com.google.android.gms.measurement.internal.a5 r14 = r0.f4324i
            com.google.android.gms.measurement.internal.j4 r14 = r14.mo12406A()
            com.google.android.gms.measurement.internal.n4 r14 = r14.f4223f
            long r14 = r14.mo12849a()
            com.google.android.gms.measurement.internal.c r16 = r21.mo12819U()
            r17 = r10
            long r9 = r16.mo12493C0()
            com.google.android.gms.measurement.internal.c r11 = r21.mo12819U()
            r19 = r7
            long r6 = r11.mo12494D0()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
        L_0x00f4:
            r10 = r3
            goto L_0x016c
        L_0x00f7:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x011d
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x011d:
            com.google.android.gms.measurement.internal.p9 r5 = r21.mo12822Y()
            r12 = r17
            boolean r5 = r5.mo12889Q(r8, r12)
            if (r5 != 0) goto L_0x012b
            long r10 = r8 + r12
        L_0x012b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x016c
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x016c
            r5 = 0
        L_0x0134:
            r6 = 20
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2302r.f4461C
            r8 = 0
            java.lang.Object r7 = r7.mo12867a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f4
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C2302r.f4459B
            java.lang.Object r12 = r12.mo12867a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            int r5 = r5 + 1
            goto L_0x0134
        L_0x016c:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo13130a(r2)
            com.google.android.gms.measurement.internal.h4 r1 = r21.m7230g0()
            r1.mo12694c()
            com.google.android.gms.measurement.internal.h9 r1 = r21.m7232h0()
            r1.mo12738v()
            return
        L_0x018e:
            com.google.android.gms.measurement.internal.e4 r1 = r21.mo12817S()
            boolean r1 = r1.mo12652x()
            if (r1 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.String r2 = "No network"
            r1.mo13130a(r2)
            com.google.android.gms.measurement.internal.h4 r1 = r21.m7230g0()
            r1.mo12693b()
            com.google.android.gms.measurement.internal.h9 r1 = r21.m7232h0()
            r1.mo12738v()
            return
        L_0x01b6:
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.j4 r1 = r1.mo12406A()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f4224g
            long r1 = r1.mo12849a()
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C2302r.f4535r
            r6 = 0
            java.lang.Object r5 = r5.mo12867a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.p9 r7 = r21.mo12822Y()
            boolean r7 = r7.mo12889Q(r1, r5)
            if (r7 != 0) goto L_0x01e2
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01e2:
            com.google.android.gms.measurement.internal.h4 r1 = r21.m7230g0()
            r1.mo12694c()
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.common.util.e r1 = r1.mo12429f()
            long r1 = r1.mo11378a()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x021e
            com.google.android.gms.measurement.internal.p3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C2302r.f4545w
            r2 = 0
            java.lang.Object r1 = r1.mo12867a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.j4 r1 = r1.mo12406A()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f4222e
            com.google.android.gms.measurement.internal.a5 r2 = r0.f4324i
            com.google.android.gms.common.util.e r2 = r2.mo12429f()
            long r2 = r2.mo11378a()
            r1.mo12850b(r2)
        L_0x021e:
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo13131b(r3, r2)
            com.google.android.gms.measurement.internal.h9 r1 = r21.m7232h0()
            r1.mo12737u(r10)
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.a5 r1 = r0.f4324i
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo13130a(r2)
            com.google.android.gms.measurement.internal.h4 r1 = r21.m7230g0()
            r1.mo12694c()
            com.google.android.gms.measurement.internal.h9 r1 = r21.m7232h0()
            r1.mo12738v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.m7238l0():void");
    }

    /* renamed from: m */
    private static void m7239m(C2056x0.C2057a aVar) {
        aVar.mo12272O(Long.MAX_VALUE);
        aVar.mo12289d0(Long.MIN_VALUE);
        for (int i = 0; i < aVar.mo12265G(); i++) {
            C1994t0 N = aVar.mo12270N(i);
            if (N.mo12067W() < aVar.mo12263E0()) {
                aVar.mo12272O(N.mo12067W());
            }
            if (N.mo12067W() > aVar.mo12269M0()) {
                aVar.mo12289d0(N.mo12067W());
            }
        }
    }

    @VisibleForTesting
    /* renamed from: n */
    private final void m7240n(C2056x0.C2057a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        C2334t9 n0 = mo12819U().mo12516n0(aVar.mo12290d1(), str);
        C2334t9 t9Var = (n0 == null || n0.f4630e == null) ? new C2334t9(aVar.mo12290d1(), "auto", str, this.f4324i.mo12429f().mo11378a(), Long.valueOf(j)) : new C2334t9(aVar.mo12290d1(), "auto", str, this.f4324i.mo12429f().mo11378a(), Long.valueOf(((Long) n0.f4630e).longValue() + j));
        C1715b1.C1716a Y = C1715b1.m4739Y();
        Y.mo11449x(str);
        Y.mo11448w(this.f4324i.mo12429f().mo11378a());
        Y.mo11451z(((Long) t9Var.f4630e).longValue());
        C1715b1 b1Var = (C1715b1) ((C1889m4) Y.mo11851I());
        boolean z2 = false;
        int u = C2290p9.m7350u(aVar, str);
        if (u >= 0) {
            aVar.mo12315w(u, b1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.mo12257A(b1Var);
        }
        if (j > 0) {
            mo12819U().mo12508S(t9Var);
            this.f4324i.mo12427b().mo13104O().mo13132c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", t9Var.f4630e);
        }
    }

    @WorkerThread
    /* renamed from: q */
    private final void m7241q(C2147d5 d5Var) {
        ArrayMap arrayMap;
        m7233i0();
        if (!C1832ia.m5256a() || !this.f4324i.mo12443x().mo12456B(d5Var.mo12634t(), C2302r.f4532p0)) {
            if (TextUtils.isEmpty(d5Var.mo12576A()) && TextUtils.isEmpty(d5Var.mo12579D())) {
                mo12840z(d5Var.mo12634t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(d5Var.mo12576A()) && TextUtils.isEmpty(d5Var.mo12582G()) && TextUtils.isEmpty(d5Var.mo12579D())) {
            mo12840z(d5Var.mo12634t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String q = this.f4324i.mo12443x().mo12472q(d5Var);
        try {
            URL url = new URL(q);
            this.f4324i.mo12427b().mo13104O().mo13131b("Fetching remote configuration", d5Var.mo12634t());
            C1905n0 u = mo12815Q().mo13076u(d5Var.mo12634t());
            String z = mo12815Q().mo13078z(d5Var.mo12634t());
            if (u == null || TextUtils.isEmpty(z)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", z);
                arrayMap = arrayMap2;
            }
            this.f4331p = true;
            C2158e4 S = mo12817S();
            String t = d5Var.mo12634t();
            C2257m9 m9Var = new C2257m9(this);
            S.mo12567h();
            S.mo12749r();
            C1609u.m4475k(url);
            C1609u.m4475k(m9Var);
            S.mo12426a().mo13118B(new C2206i4(S, t, url, (byte[]) null, arrayMap, m9Var));
        } catch (MalformedURLException unused) {
            this.f4324i.mo12427b().mo13096F().mo13132c("Failed to parse config URL. Not fetching. appId", C2361w3.m7696w(d5Var.mo12634t()), q);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: t */
    public final void m7243t(C2301q9 q9Var) {
        this.f4324i.mo12426a().mo12567h();
        C2129c cVar = new C2129c(this);
        cVar.mo12750s();
        this.f4318c = cVar;
        this.f4324i.mo12443x().mo12473r(this.f4316a);
        C2116aa aaVar = new C2116aa(this);
        aaVar.mo12750s();
        this.f4321f = aaVar;
        C2232k7 k7Var = new C2232k7(this);
        k7Var.mo12750s();
        this.f4323h = k7Var;
        C2199h9 h9Var = new C2199h9(this);
        h9Var.mo12750s();
        this.f4320e = h9Var;
        this.f4319d = new C2194h4(this);
        if (this.f4329n != this.f4330o) {
            this.f4324i.mo12427b().mo13096F().mo13132c("Not all upload components initialized", Integer.valueOf(this.f4329n), Integer.valueOf(this.f4330o));
        }
        this.f4325j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo12809A(boolean z) {
        m7238l0();
    }

    /* renamed from: G */
    public final C2117b mo12810G() {
        return this.f4324i.mo12443x();
    }

    /* renamed from: I */
    public final C2176fa mo12414I() {
        return this.f4324i.mo12414I();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: M */
    public final void mo12811M(zzkn zzkn, zzm zzm) {
        m7233i0();
        mo12825b0();
        if (m7226V(zzm)) {
            if (!zzm.f4784h) {
                mo12816R(zzm);
            } else if (!"_npa".equals(zzkn.f4771b) || zzm.f4795s == null) {
                this.f4324i.mo12427b().mo13103N().mo13131b("Removing user property", this.f4324i.mo12413H().mo12997z(zzkn.f4771b));
                mo12819U().mo12524u0();
                try {
                    mo12816R(zzm);
                    mo12819U().mo12514k0(zzm.f4777a, zzkn.f4771b);
                    mo12819U().mo12523u();
                    this.f4324i.mo12427b().mo13103N().mo13131b("User property removed", this.f4324i.mo12413H().mo12997z(zzkn.f4771b));
                } finally {
                    mo12819U().mo12533z0();
                }
            } else {
                this.f4324i.mo12427b().mo13103N().mo13130a("Falling back to manifest metadata value for ad personalization");
                mo12835u(new zzkn("_npa", this.f4324i.mo12429f().mo11378a(), Long.valueOf(zzm.f4795s.booleanValue() ? 1 : 0), "auto"), zzm);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x044e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0484 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ff A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0201 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0205 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0228 A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023b A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024a A[Catch:{ SQLiteException -> 0x01b6, all -> 0x04ae }] */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12812N(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m7233i0()
            r21.mo12825b0()
            com.google.android.gms.common.internal.C1609u.m4475k(r22)
            java.lang.String r7 = r2.f4777a
            com.google.android.gms.common.internal.C1609u.m4471g(r7)
            boolean r7 = r21.m7226V(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.c r7 = r21.mo12819U()
            java.lang.String r8 = r2.f4777a
            com.google.android.gms.measurement.internal.d5 r7 = r7.mo12512i0(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.mo12576A()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f4778b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.mo12586K(r8)
            com.google.android.gms.measurement.internal.c r10 = r21.mo12819U()
            r10.mo12503N(r7)
            com.google.android.gms.measurement.internal.v4 r7 = r21.mo12815Q()
            java.lang.String r10 = r2.f4777a
            r7.mo13071E(r10)
        L_0x0056:
            boolean r7 = r2.f4784h
            if (r7 != 0) goto L_0x005e
            r21.mo12816R(r22)
            return
        L_0x005e:
            long r10 = r2.f4789m
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i
            com.google.android.gms.common.util.e r7 = r7.mo12429f()
            long r10 = r7.mo11378a()
        L_0x006e:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i
            com.google.android.gms.measurement.internal.l r7 = r7.mo12423R()
            r7.mo12793x()
            int r7 = r2.f4790n
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.a5 r12 = r1.f4324i
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo12427b()
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo13099J()
            java.lang.String r13 = r2.f4777a
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.mo13132c(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.c r12 = r21.mo12819U()
            r12.mo12524u0()
            com.google.android.gms.measurement.internal.c r12 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.t9 r14 = r12.mo12516n0(r13, r14)     // Catch:{ all -> 0x04ae }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.f4627b     // Catch:{ all -> 0x04ae }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.f4795s     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.zzkn r13 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ all -> 0x04ae }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.f4795s     // Catch:{ all -> 0x04ae }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04ae }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.f4630e     // Catch:{ all -> 0x04ae }
            java.lang.Long r12 = r8.f4773d     // Catch:{ all -> 0x04ae }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04ae }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.mo12835u(r8, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.zzkn r8 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo12811M(r8, r2)     // Catch:{ all -> 0x04ae }
        L_0x010f:
            com.google.android.gms.measurement.internal.c r8 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r9 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.d5 r8 = r8.mo12512i0(r9)     // Catch:{ all -> 0x04ae }
            if (r8 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.a5 r12 = r1.f4324i     // Catch:{ all -> 0x04ae }
            r12.mo12412G()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f4778b     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = r8.mo12576A()     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = r2.f4794r     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = r8.mo12579D()     // Catch:{ all -> 0x04ae }
            boolean r12 = com.google.android.gms.measurement.internal.C2323s9.m7568h0(r12, r13, r14, r15)     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.a5 r12 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo12427b()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo13099J()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.mo12634t()     // Catch:{ all -> 0x04ae }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r14)     // Catch:{ all -> 0x04ae }
            r12.mo13131b(r13, r14)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c r12 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r8 = r8.mo12634t()     // Catch:{ all -> 0x04ae }
            r12.mo12749r()     // Catch:{ all -> 0x04ae }
            r12.mo12567h()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.internal.C1609u.m4471g(r8)     // Catch:{ all -> 0x04ae }
            android.database.sqlite.SQLiteDatabase r13 = r12.mo12525v()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01b6 }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b6 }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.w3 r0 = r12.mo12427b()     // Catch:{ SQLiteException -> 0x01b6 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()     // Catch:{ SQLiteException -> 0x01b6 }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01b6 }
            r0.mo13132c(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01b6 }
            goto L_0x01c8
        L_0x01b6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w3 r9 = r12.mo12427b()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r9 = r9.mo13096F()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r8)     // Catch:{ all -> 0x04ae }
            r9.mo13132c(r12, r8, r0)     // Catch:{ all -> 0x04ae }
        L_0x01c8:
            r8 = 0
        L_0x01c9:
            if (r8 == 0) goto L_0x0228
            long r12 = r8.mo12597V()     // Catch:{ all -> 0x04ae }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            long r12 = r8.mo12597V()     // Catch:{ all -> 0x04ae }
            r9 = r4
            long r3 = r2.f4786j     // Catch:{ all -> 0x04ae }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e3:
            r9 = r4
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            long r3 = r8.mo12597V()     // Catch:{ all -> 0x04ae }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0201
            java.lang.String r3 = r8.mo12595T()     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x0201
            java.lang.String r3 = r8.mo12595T()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f4779c     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04ae }
            if (r3 != 0) goto L_0x0201
            r14 = 1
            goto L_0x0202
        L_0x0201:
            r14 = 0
        L_0x0202:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0229
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.mo12595T()     // Catch:{ all -> 0x04ae }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.zzal r14 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            r1.mo12832o(r3, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x0229
        L_0x0228:
            r9 = r4
        L_0x0229:
            r21.mo12816R(r22)     // Catch:{ all -> 0x04ae }
            if (r7 != 0) goto L_0x023b
            com.google.android.gms.measurement.internal.c r0 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "_f"
        L_0x0236:
            com.google.android.gms.measurement.internal.m r0 = r0.mo12492C(r3, r4)     // Catch:{ all -> 0x04ae }
            goto L_0x0248
        L_0x023b:
            r3 = 1
            if (r7 != r3) goto L_0x0247
            com.google.android.gms.measurement.internal.c r0 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "_v"
            goto L_0x0236
        L_0x0247:
            r0 = 0
        L_0x0248:
            if (r0 != 0) goto L_0x0484
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03e4
            com.google.android.gms.measurement.internal.zzkn r7 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ all -> 0x04ae }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo12835u(r7, r2)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f4778b     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2302r.f4493S     // Catch:{ all -> 0x04ae }
            boolean r7 = r7.mo12456B(r12, r13)     // Catch:{ all -> 0x04ae }
            if (r7 == 0) goto L_0x028f
            r21.m7233i0()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.s4 r7 = r7.mo12409D()     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = r2.f4777a     // Catch:{ all -> 0x04ae }
            r7.mo12939b(r12)     // Catch:{ all -> 0x04ae }
        L_0x028f:
            r21.m7233i0()     // Catch:{ all -> 0x04ae }
            r21.mo12825b0()     // Catch:{ all -> 0x04ae }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r7.<init>()     // Catch:{ all -> 0x04ae }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04ae }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04ae }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04ae }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04ae }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04ae }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo12443x()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C2302r.f4495U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo12456B(r4, r12)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x02c8
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            goto L_0x02ca
        L_0x02c8:
            r3 = 1
        L_0x02ca:
            boolean r12 = r2.f4793q     // Catch:{ all -> 0x04ae }
            if (r12 == 0) goto L_0x02d1
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04ae }
        L_0x02d1:
            com.google.android.gms.measurement.internal.c r0 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.common.internal.C1609u.m4471g(r3)     // Catch:{ all -> 0x04ae }
            r0.mo12567h()     // Catch:{ all -> 0x04ae }
            r0.mo12749r()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.mo12531y0(r3, r4)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x04ae }
            android.content.Context r0 = r0.mo12428c()     // Catch:{ all -> 0x04ae }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x030b
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r9)     // Catch:{ all -> 0x04ae }
            r0.mo13131b(r6, r9)     // Catch:{ all -> 0x04ae }
        L_0x0307:
            r12 = 0
            goto L_0x03c8
        L_0x030b:
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ NameNotFoundException -> 0x031d }
            android.content.Context r0 = r0.mo12428c()     // Catch:{ NameNotFoundException -> 0x031d }
            com.google.android.gms.common.j.b r0 = com.google.android.gms.common.p105j.C1620c.m4502a(r0)     // Catch:{ NameNotFoundException -> 0x031d }
            java.lang.String r12 = r2.f4777a     // Catch:{ NameNotFoundException -> 0x031d }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.mo11303e(r12, r13)     // Catch:{ NameNotFoundException -> 0x031d }
            goto L_0x0334
        L_0x031d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.a5 r12 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo12427b()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo13096F()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r15)     // Catch:{ all -> 0x04ae }
            r12.mo13132c(r13, r15, r0)     // Catch:{ all -> 0x04ae }
            r0 = 0
        L_0x0334:
            if (r0 == 0) goto L_0x0384
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04ae }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0384
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04ae }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04ae }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0367
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r0 = r0.mo12443x()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C2302r.f4542u0     // Catch:{ all -> 0x04ae }
            boolean r0 = r0.mo12474s(r12)     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x0362
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0365
            r12 = 1
        L_0x035e:
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04ae }
            goto L_0x0365
        L_0x0362:
            r12 = 1
            goto L_0x035e
        L_0x0365:
            r14 = 0
            goto L_0x0368
        L_0x0367:
            r14 = 1
        L_0x0368:
            com.google.android.gms.measurement.internal.zzkn r0 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0371
            r14 = 1
            goto L_0x0373
        L_0x0371:
            r14 = 0
        L_0x0373:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo12835u(r0, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x0385
        L_0x0384:
            r6 = r14
        L_0x0385:
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ NameNotFoundException -> 0x0397 }
            android.content.Context r0 = r0.mo12428c()     // Catch:{ NameNotFoundException -> 0x0397 }
            com.google.android.gms.common.j.b r0 = com.google.android.gms.common.p105j.C1620c.m4502a(r0)     // Catch:{ NameNotFoundException -> 0x0397 }
            java.lang.String r12 = r2.f4777a     // Catch:{ NameNotFoundException -> 0x0397 }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo11301c(r12, r13)     // Catch:{ NameNotFoundException -> 0x0397 }
            goto L_0x03ae
        L_0x0397:
            r0 = move-exception
            com.google.android.gms.measurement.internal.a5 r12 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo12427b()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.y3 r12 = r12.mo13096F()     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.f4777a     // Catch:{ all -> 0x04ae }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r14)     // Catch:{ all -> 0x04ae }
            r12.mo13132c(r13, r14, r0)     // Catch:{ all -> 0x04ae }
            r0 = 0
        L_0x03ae:
            if (r0 == 0) goto L_0x0307
            int r12 = r0.flags     // Catch:{ all -> 0x04ae }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03bb
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04ae }
        L_0x03bb:
            int r0 = r0.flags     // Catch:{ all -> 0x04ae }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0307
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04ae }
            goto L_0x0307
        L_0x03c8:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03cf
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04ae }
        L_0x03cf:
            com.google.android.gms.measurement.internal.zzaq r0 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.zzal r14 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x04ae }
            r14.<init>(r7)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
        L_0x03e0:
            r1.mo12832o(r0, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x043e
        L_0x03e4:
            r5 = 1
            if (r7 != r5) goto L_0x043e
            com.google.android.gms.measurement.internal.zzkn r5 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04ae }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04ae }
            r1.mo12835u(r5, r2)     // Catch:{ all -> 0x04ae }
            r21.m7233i0()     // Catch:{ all -> 0x04ae }
            r21.mo12825b0()     // Catch:{ all -> 0x04ae }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r5.<init>()     // Catch:{ all -> 0x04ae }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04ae }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo12443x()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2302r.f4495U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo12456B(r4, r6)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x0423
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            goto L_0x0425
        L_0x0423:
            r3 = 1
        L_0x0425:
            boolean r6 = r2.f4793q     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x042c
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04ae }
        L_0x042c:
            com.google.android.gms.measurement.internal.zzaq r0 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.zzal r14 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x04ae }
            r14.<init>(r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            goto L_0x03e0
        L_0x043e:
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r0 = r0.mo12443x()     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2302r.f4496V     // Catch:{ all -> 0x04ae }
            boolean r0 = r0.mo12456B(r3, r4)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x049f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.b r3 = r3.mo12443x()     // Catch:{ all -> 0x04ae }
            java.lang.String r4 = r2.f4777a     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2302r.f4495U     // Catch:{ all -> 0x04ae }
            boolean r3 = r3.mo12456B(r4, r5)     // Catch:{ all -> 0x04ae }
            if (r3 == 0) goto L_0x046f
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04ae }
        L_0x046f:
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.zzal r14 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
        L_0x0480:
            r1.mo12832o(r3, r2)     // Catch:{ all -> 0x04ae }
            goto L_0x049f
        L_0x0484:
            boolean r0 = r2.f4785i     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x049f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x04ae }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.zzal r14 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x04ae }
            r14.<init>(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04ae }
            goto L_0x0480
        L_0x049f:
            com.google.android.gms.measurement.internal.c r0 = r21.mo12819U()     // Catch:{ all -> 0x04ae }
            r0.mo12523u()     // Catch:{ all -> 0x04ae }
            com.google.android.gms.measurement.internal.c r0 = r21.mo12819U()
            r0.mo12533z0()
            return
        L_0x04ae:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c r2 = r21.mo12819U()
            r2.mo12533z0()
            goto L_0x04b8
        L_0x04b7:
            throw r0
        L_0x04b8:
            goto L_0x04b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.mo12812N(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: O */
    public final void mo12813O(zzy zzy) {
        zzm h = m7231h(zzy.f4799a);
        if (h != null) {
            mo12814P(zzy, h);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: P */
    public final void mo12814P(zzy zzy, zzm zzm) {
        C1609u.m4475k(zzy);
        C1609u.m4471g(zzy.f4799a);
        C1609u.m4475k(zzy.f4801c);
        C1609u.m4471g(zzy.f4801c.f4771b);
        m7233i0();
        mo12825b0();
        if (m7226V(zzm)) {
            if (!zzm.f4784h) {
                mo12816R(zzm);
                return;
            }
            mo12819U().mo12524u0();
            try {
                mo12816R(zzm);
                zzy o0 = mo12819U().mo12517o0(zzy.f4799a, zzy.f4801c.f4771b);
                if (o0 != null) {
                    this.f4324i.mo12427b().mo13103N().mo13132c("Removing conditional user property", zzy.f4799a, this.f4324i.mo12413H().mo12997z(zzy.f4801c.f4771b));
                    mo12819U().mo12519q0(zzy.f4799a, zzy.f4801c.f4771b);
                    if (o0.f4803e) {
                        mo12819U().mo12514k0(zzy.f4799a, zzy.f4801c.f4771b);
                    }
                    if (zzy.f4809k != null) {
                        Bundle bundle = null;
                        if (zzy.f4809k.f4767b != null) {
                            bundle = zzy.f4809k.f4767b.mo13151T();
                        }
                        Bundle bundle2 = bundle;
                        m7224K(this.f4324i.mo12412G().mo12948D(zzy.f4799a, zzy.f4809k.f4766a, bundle2, o0.f4800b, zzy.f4809k.f4769d, true, false), zzm);
                    }
                } else {
                    this.f4324i.mo12427b().mo13099J().mo13132c("Conditional user property doesn't exist", C2361w3.m7696w(zzy.f4799a), this.f4324i.mo12413H().mo12997z(zzy.f4801c.f4771b));
                }
                mo12819U().mo12523u();
            } finally {
                mo12819U().mo12533z0();
            }
        }
    }

    /* renamed from: Q */
    public final C2351v4 mo12815Q() {
        m7225L(this.f4316a);
        return this.f4316a;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: R */
    public final C2147d5 mo12816R(zzm zzm) {
        m7233i0();
        mo12825b0();
        C1609u.m4475k(zzm);
        C1609u.m4471g(zzm.f4777a);
        C2147d5 i0 = mo12819U().mo12512i0(zzm.f4777a);
        String w = this.f4324i.mo12406A().mo12767w(zzm.f4777a);
        if (!C2036v9.m6236a() || !this.f4324i.mo12443x().mo12474s(C2302r.f4544v0)) {
            return m7228e(zzm, i0, w);
        }
        if (i0 == null) {
            i0 = new C2147d5(this.f4324i, zzm.f4777a);
            i0.mo12606c(this.f4324i.mo12412G().mo12955L0());
            i0.mo12578C(w);
        } else if (!w.equals(i0.mo12585J())) {
            i0.mo12578C(w);
            i0.mo12606c(this.f4324i.mo12412G().mo12955L0());
        }
        i0.mo12632r(zzm.f4778b);
        i0.mo12636v(zzm.f4794r);
        if (C1832ia.m5256a() && this.f4324i.mo12443x().mo12456B(i0.mo12634t(), C2302r.f4532p0)) {
            i0.mo12640z(zzm.f4798v);
        }
        if (!TextUtils.isEmpty(zzm.f4787k)) {
            i0.mo12581F(zzm.f4787k);
        }
        long j = zzm.f4781e;
        if (j != 0) {
            i0.mo12639y(j);
        }
        if (!TextUtils.isEmpty(zzm.f4779c)) {
            i0.mo12584I(zzm.f4779c);
        }
        i0.mo12635u(zzm.f4786j);
        String str = zzm.f4780d;
        if (str != null) {
            i0.mo12587L(str);
        }
        i0.mo12577B(zzm.f4782f);
        i0.mo12610e(zzm.f4784h);
        if (!TextUtils.isEmpty(zzm.f4783g)) {
            i0.mo12590O(zzm.f4783g);
        }
        if (!this.f4324i.mo12443x().mo12474s(C2302r.f4484N0)) {
            i0.mo12607c0(zzm.f4788l);
        }
        i0.mo12633s(zzm.f4791o);
        i0.mo12637w(zzm.f4792p);
        i0.mo12604b(zzm.f4795s);
        i0.mo12580E(zzm.f4796t);
        if (i0.mo12612f()) {
            mo12819U().mo12503N(i0);
        }
        return i0;
    }

    /* renamed from: S */
    public final C2158e4 mo12817S() {
        m7225L(this.f4317b);
        return this.f4317b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final String mo12818T(zzm zzm) {
        try {
            return (String) this.f4324i.mo12426a().mo13121v(new C2279o9(this, zzm)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f4324i.mo12427b().mo13096F().mo13132c("Failed to get app instance id. appId", C2361w3.m7696w(zzm.f4777a), e);
            return null;
        }
    }

    /* renamed from: U */
    public final C2129c mo12819U() {
        m7225L(this.f4318c);
        return this.f4318c;
    }

    /* renamed from: W */
    public final C2116aa mo12820W() {
        m7225L(this.f4321f);
        return this.f4321f;
    }

    /* renamed from: X */
    public final C2232k7 mo12821X() {
        m7225L(this.f4323h);
        return this.f4323h;
    }

    /* renamed from: Y */
    public final C2290p9 mo12822Y() {
        m7225L(this.f4322g);
        return this.f4322g;
    }

    /* renamed from: Z */
    public final C2339u3 mo12823Z() {
        return this.f4324i.mo12413H();
    }

    /* renamed from: a */
    public final C2373x4 mo12426a() {
        return this.f4324i.mo12426a();
    }

    /* renamed from: a0 */
    public final C2323s9 mo12824a0() {
        return this.f4324i.mo12412G();
    }

    /* renamed from: b */
    public final C2361w3 mo12427b() {
        return this.f4324i.mo12427b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo12825b0() {
        if (!this.f4325j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: c */
    public final Context mo12428c() {
        return this.f4324i.mo12428c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:83|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1.f4324i.mo12427b().mo13096F().mo13132c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C2361w3.m7696w(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x02b0 */
    @androidx.annotation.WorkerThread
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12826c0() {
        /*
            r17 = this;
            r1 = r17
            r17.m7233i0()
            r17.mo12825b0()
            r0 = 1
            r1.f4333r = r0
            r2 = 0
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            r3.mo12414I()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.r7 r3 = r3.mo12422Q()     // Catch:{ all -> 0x02e9 }
            java.lang.Boolean r3 = r3.mo12925a0()     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0029:
            r0.mo13130a(r3)     // Catch:{ all -> 0x02e9 }
        L_0x002c:
            r1.f4333r = r2
            r17.m7220E()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0029
        L_0x0045:
            long r3 = r1.f4327l     // Catch:{ all -> 0x02e9 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0051
        L_0x004d:
            r17.m7238l0()     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x0051:
            r17.m7233i0()     // Catch:{ all -> 0x02e9 }
            java.util.List<java.lang.Long> r3 = r1.f4336u     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x006a
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0029
        L_0x006a:
            com.google.android.gms.measurement.internal.e4 r3 = r17.mo12817S()     // Catch:{ all -> 0x02e9 }
            boolean r3 = r3.mo12652x()     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x0084
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo13130a(r3)     // Catch:{ all -> 0x02e9 }
            goto L_0x004d
        L_0x0084:
            com.google.android.gms.measurement.internal.a5 r3 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.common.util.e r3 = r3.mo12429f()     // Catch:{ all -> 0x02e9 }
            long r3 = r3.mo11378a()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2302r.f4489Q     // Catch:{ all -> 0x02e9 }
            r9 = 0
            int r7 = r7.mo12476u(r9, r8)     // Catch:{ all -> 0x02e9 }
            long r10 = com.google.android.gms.measurement.internal.C2117b.m6763N()     // Catch:{ all -> 0x02e9 }
            long r10 = r3 - r10
            r8 = 0
        L_0x00a2:
            if (r8 >= r7) goto L_0x00ad
            boolean r12 = r1.m7219D(r9, r10)     // Catch:{ all -> 0x02e9 }
            if (r12 == 0) goto L_0x00ad
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00ad:
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.j4 r7 = r7.mo12406A()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.n4 r7 = r7.f4222e     // Catch:{ all -> 0x02e9 }
            long r7 = r7.mo12849a()     // Catch:{ all -> 0x02e9 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.a5 r5 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13103N()     // Catch:{ all -> 0x02e9 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02e9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02e9 }
            r5.mo13131b(r6, r7)     // Catch:{ all -> 0x02e9 }
        L_0x00d6:
            com.google.android.gms.measurement.internal.c r5 = r17.mo12819U()     // Catch:{ all -> 0x02e9 }
            java.lang.String r5 = r5.mo12527w()     // Catch:{ all -> 0x02e9 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02e9 }
            r7 = -1
            if (r6 != 0) goto L_0x02c5
            long r10 = r1.f4338w     // Catch:{ all -> 0x02e9 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.c r6 = r17.mo12819U()     // Catch:{ all -> 0x02e9 }
            long r6 = r6.mo12511X()     // Catch:{ all -> 0x02e9 }
            r1.f4338w = r6     // Catch:{ all -> 0x02e9 }
        L_0x00f6:
            com.google.android.gms.measurement.internal.a5 r6 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo12443x()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C2302r.f4513g     // Catch:{ all -> 0x02e9 }
            int r6 = r6.mo12476u(r5, r7)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r7 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo12443x()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C2302r.f4515h     // Catch:{ all -> 0x02e9 }
            int r7 = r7.mo12476u(r5, r8)     // Catch:{ all -> 0x02e9 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c r8 = r17.mo12819U()     // Catch:{ all -> 0x02e9 }
            java.util.List r6 = r8.mo12499H(r5, r6, r7)     // Catch:{ all -> 0x02e9 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02e9 }
            if (r7 != 0) goto L_0x002c
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02e9 }
        L_0x0124:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02e9 }
            if (r8 == 0) goto L_0x0143
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02e9 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02e9 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x0 r8 = (com.google.android.gms.internal.measurement.C2056x0) r8     // Catch:{ all -> 0x02e9 }
            java.lang.String r10 = r8.mo12221Z()     // Catch:{ all -> 0x02e9 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02e9 }
            if (r10 != 0) goto L_0x0124
            java.lang.String r7 = r8.mo12221Z()     // Catch:{ all -> 0x02e9 }
            goto L_0x0144
        L_0x0143:
            r7 = r9
        L_0x0144:
            if (r7 == 0) goto L_0x0173
            r8 = 0
        L_0x0147:
            int r10 = r6.size()     // Catch:{ all -> 0x02e9 }
            if (r8 >= r10) goto L_0x0173
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02e9 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x0 r10 = (com.google.android.gms.internal.measurement.C2056x0) r10     // Catch:{ all -> 0x02e9 }
            java.lang.String r11 = r10.mo12221Z()     // Catch:{ all -> 0x02e9 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02e9 }
            if (r11 != 0) goto L_0x0170
            java.lang.String r10 = r10.mo12221Z()     // Catch:{ all -> 0x02e9 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02e9 }
            if (r10 != 0) goto L_0x0170
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02e9 }
            goto L_0x0173
        L_0x0170:
            int r8 = r8 + 1
            goto L_0x0147
        L_0x0173:
            com.google.android.gms.internal.measurement.w0$a r7 = com.google.android.gms.internal.measurement.C2041w0.m6248D()     // Catch:{ all -> 0x02e9 }
            int r8 = r6.size()     // Catch:{ all -> 0x02e9 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02e9 }
            int r11 = r6.size()     // Catch:{ all -> 0x02e9 }
            r10.<init>(r11)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r11 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r11 = r11.mo12443x()     // Catch:{ all -> 0x02e9 }
            boolean r11 = r11.mo12458D(r5)     // Catch:{ all -> 0x02e9 }
            r12 = 0
        L_0x018f:
            if (r12 >= r8) goto L_0x01f6
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02e9 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x0 r13 = (com.google.android.gms.internal.measurement.C2056x0) r13     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.m4$b r13 = r13.mo11850u()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x0$a r13 = (com.google.android.gms.internal.measurement.C2056x0.C2057a) r13     // Catch:{ all -> 0x02e9 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x02e9 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x02e9 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x02e9 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x02e9 }
            r10.add(r14)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r14 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r14 = r14.mo12443x()     // Catch:{ all -> 0x02e9 }
            long r14 = r14.mo12457C()     // Catch:{ all -> 0x02e9 }
            r13.mo12273O0(r14)     // Catch:{ all -> 0x02e9 }
            r13.mo12316x(r3)     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.a5 r14 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            r14.mo12414I()     // Catch:{ all -> 0x02e9 }
            r13.mo12278U(r2)     // Catch:{ all -> 0x02e9 }
            if (r11 != 0) goto L_0x01cb
            r13.mo12304n1()     // Catch:{ all -> 0x02e9 }
        L_0x01cb:
            com.google.android.gms.measurement.internal.a5 r14 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.b r14 = r14.mo12443x()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C2302r.f4500Z     // Catch:{ all -> 0x02e9 }
            boolean r14 = r14.mo12456B(r5, r15)     // Catch:{ all -> 0x02e9 }
            if (r14 == 0) goto L_0x01f0
            com.google.android.gms.internal.measurement.x5 r14 = r13.mo11851I()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.m4 r14 = (com.google.android.gms.internal.measurement.C1889m4) r14     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x0 r14 = (com.google.android.gms.internal.measurement.C2056x0) r14     // Catch:{ all -> 0x02e9 }
            byte[] r14 = r14.mo12168h()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p9 r15 = r17.mo12822Y()     // Catch:{ all -> 0x02e9 }
            long r14 = r15.mo12894v(r14)     // Catch:{ all -> 0x02e9 }
            r13.mo12297i1(r14)     // Catch:{ all -> 0x02e9 }
        L_0x01f0:
            r7.mo12165u(r13)     // Catch:{ all -> 0x02e9 }
            int r12 = r12 + 1
            goto L_0x018f
        L_0x01f6:
            com.google.android.gms.measurement.internal.a5 r6 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()     // Catch:{ all -> 0x02e9 }
            r11 = 2
            boolean r6 = r6.mo13095B(r11)     // Catch:{ all -> 0x02e9 }
            if (r6 == 0) goto L_0x0214
            com.google.android.gms.measurement.internal.p9 r6 = r17.mo12822Y()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x5 r11 = r7.mo11851I()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.m4 r11 = (com.google.android.gms.internal.measurement.C1889m4) r11     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.w0 r11 = (com.google.android.gms.internal.measurement.C2041w0) r11     // Catch:{ all -> 0x02e9 }
            java.lang.String r6 = r6.mo12884B(r11)     // Catch:{ all -> 0x02e9 }
            goto L_0x0215
        L_0x0214:
            r6 = r9
        L_0x0215:
            r17.mo12822Y()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.x5 r11 = r7.mo11851I()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.m4 r11 = (com.google.android.gms.internal.measurement.C1889m4) r11     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.internal.measurement.w0 r11 = (com.google.android.gms.internal.measurement.C2041w0) r11     // Catch:{ all -> 0x02e9 }
            byte[] r14 = r11.mo12168h()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.p3<java.lang.String> r11 = com.google.android.gms.measurement.internal.C2302r.f4533q     // Catch:{ all -> 0x02e9 }
            java.lang.Object r9 = r11.mo12867a(r9)     // Catch:{ all -> 0x02e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02e9 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02b0 }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02b0 }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02b0 }
            if (r11 != 0) goto L_0x0239
            r11 = 1
            goto L_0x023a
        L_0x0239:
            r11 = 0
        L_0x023a:
            com.google.android.gms.common.internal.C1609u.m4465a(r11)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.util.List<java.lang.Long> r11 = r1.f4336u     // Catch:{ MalformedURLException -> 0x02b0 }
            if (r11 == 0) goto L_0x0251
            com.google.android.gms.measurement.internal.a5 r10 = r1.f4324i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.w3 r10 = r10.mo12427b()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo13096F()     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.mo13130a(r11)     // Catch:{ MalformedURLException -> 0x02b0 }
            goto L_0x0258
        L_0x0251:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02b0 }
            r1.f4336u = r11     // Catch:{ MalformedURLException -> 0x02b0 }
        L_0x0258:
            com.google.android.gms.measurement.internal.a5 r10 = r1.f4324i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.j4 r10 = r10.mo12406A()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.n4 r10 = r10.f4223f     // Catch:{ MalformedURLException -> 0x02b0 }
            r10.mo12850b(r3)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x026f
            com.google.android.gms.internal.measurement.x0 r3 = r7.mo12166v(r2)     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r3 = r3.mo12206I2()     // Catch:{ MalformedURLException -> 0x02b0 }
        L_0x026f:
            com.google.android.gms.measurement.internal.a5 r4 = r1.f4324i     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.w3 r4 = r4.mo12427b()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13104O()     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02b0 }
            r4.mo13133d(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02b0 }
            r1.f4332q = r0     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.e4 r11 = r17.mo12817S()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.n9 r0 = new com.google.android.gms.measurement.internal.n9     // Catch:{ MalformedURLException -> 0x02b0 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.mo12567h()     // Catch:{ MalformedURLException -> 0x02b0 }
            r11.mo12749r()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C1609u.m4475k(r13)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C1609u.m4475k(r14)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.common.internal.C1609u.m4475k(r0)     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.x4 r3 = r11.mo12426a()     // Catch:{ MalformedURLException -> 0x02b0 }
            com.google.android.gms.measurement.internal.i4 r4 = new com.google.android.gms.measurement.internal.i4     // Catch:{ MalformedURLException -> 0x02b0 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02b0 }
            r3.mo13118B(r4)     // Catch:{ MalformedURLException -> 0x02b0 }
            goto L_0x002c
        L_0x02b0:
            com.google.android.gms.measurement.internal.a5 r0 = r1.f4324i     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r5)     // Catch:{ all -> 0x02e9 }
            r0.mo13132c(r3, r4, r9)     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x02c5:
            r1.f4338w = r7     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.c r0 = r17.mo12819U()     // Catch:{ all -> 0x02e9 }
            long r5 = com.google.android.gms.measurement.internal.C2117b.m6763N()     // Catch:{ all -> 0x02e9 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo12496F(r3)     // Catch:{ all -> 0x02e9 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02e9 }
            if (r3 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.c r3 = r17.mo12819U()     // Catch:{ all -> 0x02e9 }
            com.google.android.gms.measurement.internal.d5 r0 = r3.mo12512i0(r0)     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x002c
            r1.m7241q(r0)     // Catch:{ all -> 0x02e9 }
            goto L_0x002c
        L_0x02e9:
            r0 = move-exception
            r1.f4333r = r2
            r17.m7220E()
            goto L_0x02f1
        L_0x02f0:
            throw r0
        L_0x02f1:
            goto L_0x02f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.mo12826c0():void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: d0 */
    public final void mo12827d0() {
        String str;
        C2383y3 y3Var;
        Integer num;
        Integer num2;
        m7233i0();
        mo12825b0();
        if (!this.f4326k) {
            this.f4326k = true;
            if (m7221F()) {
                int d = m7227d(this.f4335t);
                int G = this.f4324i.mo12424S().mo12986G();
                m7233i0();
                if (d > G) {
                    y3Var = this.f4324i.mo12427b().mo13096F();
                    num2 = Integer.valueOf(d);
                    num = Integer.valueOf(G);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (d >= G) {
                    return;
                } else {
                    if (m7217B(G, this.f4335t)) {
                        y3Var = this.f4324i.mo12427b().mo13104O();
                        num2 = Integer.valueOf(d);
                        num = Integer.valueOf(G);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        y3Var = this.f4324i.mo12427b().mo13096F();
                        num2 = Integer.valueOf(d);
                        num = Integer.valueOf(G);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                y3Var.mo13132c(str, num2, num);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo12828e0() {
        this.f4330o++;
    }

    /* renamed from: f */
    public final C1651e mo12429f() {
        return this.f4324i.mo12429f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final C2111a5 mo12829f0() {
        return this.f4324i;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: i */
    public final void mo12830i() {
        this.f4324i.mo12426a().mo12567h();
        mo12819U().mo12491B0();
        if (this.f4324i.mo12406A().f4222e.mo12849a() == 0) {
            this.f4324i.mo12406A().f4222e.mo12850b(this.f4324i.mo12429f().mo11378a());
        }
        m7238l0();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: j */
    public final void mo12831j(int i, Throwable th, byte[] bArr, String str) {
        C2129c U;
        m7233i0();
        mo12825b0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f4332q = false;
                m7220E();
                throw th2;
            }
        }
        List<Long> list = this.f4336u;
        this.f4336u = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f4324i.mo12406A().f4222e.mo12850b(this.f4324i.mo12429f().mo11378a());
                this.f4324i.mo12406A().f4223f.mo12850b(0);
                m7238l0();
                this.f4324i.mo12427b().mo13104O().mo13132c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo12819U().mo12524u0();
                try {
                    for (Long next : list) {
                        try {
                            U = mo12819U();
                            long longValue = next.longValue();
                            U.mo12567h();
                            U.mo12749r();
                            if (U.mo12525v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            U.mo12427b().mo13096F().mo13131b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f4337v == null || !this.f4337v.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    mo12819U().mo12523u();
                    mo12819U().mo12533z0();
                    this.f4337v = null;
                    if (!mo12817S().mo12652x() || !m7236k0()) {
                        this.f4338w = -1;
                        m7238l0();
                    } else {
                        mo12826c0();
                    }
                    this.f4327l = 0;
                } catch (Throwable th3) {
                    mo12819U().mo12533z0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f4324i.mo12427b().mo13096F().mo13131b("Database error while trying to delete uploaded bundles", e3);
                this.f4327l = this.f4324i.mo12429f().mo11379b();
                this.f4324i.mo12427b().mo13104O().mo13131b("Disable upload, time", Long.valueOf(this.f4327l));
            }
        } else {
            this.f4324i.mo12427b().mo13104O().mo13132c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f4324i.mo12406A().f4223f.mo12850b(this.f4324i.mo12429f().mo11378a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f4324i.mo12406A().f4224g.mo12850b(this.f4324i.mo12429f().mo11378a());
            }
            mo12819U().mo12505P(list);
            m7238l0();
        }
        this.f4332q = false;
        m7220E();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final void mo12832o(zzaq zzaq, zzm zzm) {
        List<zzy> list;
        List<zzy> list2;
        List<zzy> list3;
        C2383y3 F;
        String str;
        Object w;
        String z;
        Object obj;
        List<String> list4;
        zzaq zzaq2 = zzaq;
        zzm zzm2 = zzm;
        C1609u.m4475k(zzm);
        C1609u.m4471g(zzm2.f4777a);
        m7233i0();
        mo12825b0();
        String str2 = zzm2.f4777a;
        long j = zzaq2.f4769d;
        mo12822Y();
        if (C2290p9.m7347R(zzaq, zzm)) {
            if (!zzm2.f4784h) {
                mo12816R(zzm2);
                return;
            }
            if (this.f4324i.mo12443x().mo12456B(str2, C2302r.f4508d0) && (list4 = zzm2.f4797u) != null) {
                if (list4.contains(zzaq2.f4766a)) {
                    Bundle T = zzaq2.f4767b.mo13151T();
                    T.putLong("ga_safelisted", 1);
                    zzaq2 = new zzaq(zzaq2.f4766a, new zzal(T), zzaq2.f4768c, zzaq2.f4769d);
                } else {
                    this.f4324i.mo12427b().mo13103N().mo13133d("Dropping non-safelisted event. appId, event name, origin", str2, zzaq2.f4766a, zzaq2.f4768c);
                    return;
                }
            }
            mo12819U().mo12524u0();
            try {
                C2129c U = mo12819U();
                C1609u.m4471g(str2);
                U.mo12567h();
                U.mo12749r();
                if (j < 0) {
                    U.mo12427b().mo13099J().mo13132c("Invalid time querying timed out conditional properties", C2361w3.m7696w(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = U.mo12501K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzy next : list) {
                    if (next != null) {
                        this.f4324i.mo12427b().mo13104O().mo13133d("User property timed out", next.f4799a, this.f4324i.mo12413H().mo12997z(next.f4801c.f4771b), next.f4801c.mo13160Q());
                        if (next.f4805g != null) {
                            m7224K(new zzaq(next.f4805g, j), zzm2);
                        }
                        mo12819U().mo12519q0(str2, next.f4801c.f4771b);
                    }
                }
                C2129c U2 = mo12819U();
                C1609u.m4471g(str2);
                U2.mo12567h();
                U2.mo12749r();
                if (j < 0) {
                    U2.mo12427b().mo13099J().mo13132c("Invalid time querying expired conditional properties", C2361w3.m7696w(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = U2.mo12501K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzy next2 : list2) {
                    if (next2 != null) {
                        this.f4324i.mo12427b().mo13104O().mo13133d("User property expired", next2.f4799a, this.f4324i.mo12413H().mo12997z(next2.f4801c.f4771b), next2.f4801c.mo13160Q());
                        mo12819U().mo12514k0(str2, next2.f4801c.f4771b);
                        if (next2.f4809k != null) {
                            arrayList.add(next2.f4809k);
                        }
                        mo12819U().mo12519q0(str2, next2.f4801c.f4771b);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m7224K(new zzaq((zzaq) obj2, j), zzm2);
                }
                C2129c U3 = mo12819U();
                String str3 = zzaq2.f4766a;
                C1609u.m4471g(str2);
                C1609u.m4471g(str3);
                U3.mo12567h();
                U3.mo12749r();
                if (j < 0) {
                    U3.mo12427b().mo13099J().mo13133d("Invalid time querying triggered conditional properties", C2361w3.m7696w(str2), U3.mo13109j().mo12995v(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = U3.mo12501K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzy next3 : list3) {
                    if (next3 != null) {
                        zzkn zzkn = next3.f4801c;
                        C2334t9 t9Var = r4;
                        C2334t9 t9Var2 = new C2334t9(next3.f4799a, next3.f4800b, zzkn.f4771b, j, zzkn.mo13160Q());
                        if (mo12819U().mo12508S(t9Var)) {
                            F = this.f4324i.mo12427b().mo13104O();
                            str = "User property triggered";
                            w = next3.f4799a;
                            z = this.f4324i.mo12413H().mo12997z(t9Var.f4628c);
                            obj = t9Var.f4630e;
                        } else {
                            F = this.f4324i.mo12427b().mo13096F();
                            str = "Too many active user properties, ignoring";
                            w = C2361w3.m7696w(next3.f4799a);
                            z = this.f4324i.mo12413H().mo12997z(t9Var.f4628c);
                            obj = t9Var.f4630e;
                        }
                        F.mo13133d(str, w, z, obj);
                        if (next3.f4807i != null) {
                            arrayList2.add(next3.f4807i);
                        }
                        next3.f4801c = new zzkn(t9Var);
                        next3.f4803e = true;
                        mo12819U().mo12509T(next3);
                    }
                }
                m7224K(zzaq2, zzm2);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    m7224K(new zzaq((zzaq) obj3, j), zzm2);
                }
                mo12819U().mo12523u();
            } finally {
                mo12819U().mo12533z0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final void mo12833p(zzaq zzaq, String str) {
        zzaq zzaq2 = zzaq;
        C2147d5 i0 = mo12819U().mo12512i0(str);
        if (i0 == null || TextUtils.isEmpty(i0.mo12595T())) {
            this.f4324i.mo12427b().mo13103N().mo13131b("No app data available; dropping event", str);
            return;
        }
        Boolean H = m7222H(i0);
        if (H == null) {
            if (!"_ui".equals(zzaq2.f4766a)) {
                this.f4324i.mo12427b().mo13099J().mo13131b("Could not find package. appId", C2361w3.m7696w(str));
            }
        } else if (!H.booleanValue()) {
            this.f4324i.mo12427b().mo13096F().mo13131b("App version does not match; dropping event. appId", C2361w3.m7696w(str));
            return;
        }
        zzm zzm = r2;
        zzm zzm2 = new zzm(str, i0.mo12576A(), i0.mo12595T(), i0.mo12597V(), i0.mo12599X(), i0.mo12601Z(), i0.mo12605b0(), (String) null, i0.mo12611e0(), false, i0.mo12588M(), i0.mo12622k(), 0, 0, i0.mo12624l(), i0.mo12626m(), false, i0.mo12579D(), i0.mo12628n(), i0.mo12609d0(), i0.mo12629o(), (!C1832ia.m5256a() || !this.f4324i.mo12443x().mo12456B(i0.mo12634t(), C2302r.f4532p0)) ? null : i0.mo12582G());
        mo12832o(zzaq2, zzm);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo12834r(C2211i9 i9Var) {
        this.f4329n++;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final void mo12835u(zzkn zzkn, zzm zzm) {
        m7233i0();
        mo12825b0();
        if (m7226V(zzm)) {
            if (!zzm.f4784h) {
                mo12816R(zzm);
                return;
            }
            int v0 = this.f4324i.mo12412G().mo12976v0(zzkn.f4771b);
            C2111a5 a5Var = this.f4324i;
            if (v0 != 0) {
                a5Var.mo12412G();
                String G = C2323s9.m7555G(zzkn.f4771b, 24, true);
                String str = zzkn.f4771b;
                this.f4324i.mo12412G().mo12965U(zzm.f4777a, v0, "_ev", G, str != null ? str.length() : 0);
                return;
            }
            int n0 = a5Var.mo12412G().mo12973n0(zzkn.f4771b, zzkn.mo13160Q());
            if (n0 != 0) {
                this.f4324i.mo12412G();
                String G2 = C2323s9.m7555G(zzkn.f4771b, 24, true);
                Object Q = zzkn.mo13160Q();
                this.f4324i.mo12412G().mo12965U(zzm.f4777a, n0, "_ev", G2, (Q == null || (!(Q instanceof String) && !(Q instanceof CharSequence))) ? 0 : String.valueOf(Q).length());
                return;
            }
            Object w0 = this.f4324i.mo12412G().mo12978w0(zzkn.f4771b, zzkn.mo13160Q());
            if (w0 != null) {
                if ("_sid".equals(zzkn.f4771b)) {
                    long j = zzkn.f4772c;
                    String str2 = zzkn.f4775f;
                    long j2 = 0;
                    C2334t9 n02 = mo12819U().mo12516n0(zzm.f4777a, "_sno");
                    if (n02 != null) {
                        Object obj = n02.f4630e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            mo12835u(new zzkn("_sno", j, Long.valueOf(j2 + 1), str2), zzm);
                        }
                    }
                    if (n02 != null) {
                        this.f4324i.mo12427b().mo13099J().mo13131b("Retrieved last session number from database does not contain a valid (long) value", n02.f4630e);
                    }
                    C2247m C = mo12819U().mo12492C(zzm.f4777a, "_s");
                    if (C != null) {
                        j2 = C.f4345c;
                        this.f4324i.mo12427b().mo13104O().mo13131b("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                    mo12835u(new zzkn("_sno", j, Long.valueOf(j2 + 1), str2), zzm);
                }
                C2334t9 t9Var = new C2334t9(zzm.f4777a, zzkn.f4775f, zzkn.f4771b, zzkn.f4772c, w0);
                this.f4324i.mo12427b().mo13104O().mo13132c("Setting user property", this.f4324i.mo12413H().mo12997z(t9Var.f4628c), w0);
                mo12819U().mo12524u0();
                try {
                    mo12816R(zzm);
                    boolean S = mo12819U().mo12508S(t9Var);
                    mo12819U().mo12523u();
                    if (!S) {
                        this.f4324i.mo12427b().mo13096F().mo13132c("Too many unique user properties are set. Ignoring user property", this.f4324i.mo12413H().mo12997z(t9Var.f4628c), t9Var.f4630e);
                        this.f4324i.mo12412G().mo12965U(zzm.f4777a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo12819U().mo12533z0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: v */
    public final void mo12836v(zzm zzm) {
        if (this.f4336u != null) {
            ArrayList arrayList = new ArrayList();
            this.f4337v = arrayList;
            arrayList.addAll(this.f4336u);
        }
        C2129c U = mo12819U();
        String str = zzm.f4777a;
        C1609u.m4471g(str);
        U.mo12567h();
        U.mo12749r();
        try {
            SQLiteDatabase v = U.mo12525v();
            String[] strArr = {str};
            int delete = v.delete("apps", "app_id=?", strArr) + 0 + v.delete("events", "app_id=?", strArr) + v.delete("user_attributes", "app_id=?", strArr) + v.delete("conditional_properties", "app_id=?", strArr) + v.delete("raw_events", "app_id=?", strArr) + v.delete("raw_events_metadata", "app_id=?", strArr) + v.delete("queue", "app_id=?", strArr) + v.delete("audience_filter_values", "app_id=?", strArr) + v.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                U.mo12427b().mo13104O().mo13132c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            U.mo12427b().mo13096F().mo13132c("Error resetting analytics data. appId, error", C2361w3.m7696w(str), e);
        }
        if (zzm.f4784h) {
            mo12812N(zzm);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final void mo12837w(zzy zzy) {
        zzm h = m7231h(zzy.f4799a);
        if (h != null) {
            mo12838x(zzy, h);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo12838x(zzy zzy, zzm zzm) {
        C2383y3 F;
        String str;
        Object w;
        String z;
        Object Q;
        C2383y3 F2;
        String str2;
        Object w2;
        String z2;
        Object obj;
        C1609u.m4475k(zzy);
        C1609u.m4471g(zzy.f4799a);
        C1609u.m4475k(zzy.f4800b);
        C1609u.m4475k(zzy.f4801c);
        C1609u.m4471g(zzy.f4801c.f4771b);
        m7233i0();
        mo12825b0();
        if (m7226V(zzm)) {
            if (!zzm.f4784h) {
                mo12816R(zzm);
                return;
            }
            zzy zzy2 = new zzy(zzy);
            boolean z3 = false;
            zzy2.f4803e = false;
            mo12819U().mo12524u0();
            try {
                zzy o0 = mo12819U().mo12517o0(zzy2.f4799a, zzy2.f4801c.f4771b);
                if (o0 != null && !o0.f4800b.equals(zzy2.f4800b)) {
                    this.f4324i.mo12427b().mo13099J().mo13133d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f4324i.mo12413H().mo12997z(zzy2.f4801c.f4771b), zzy2.f4800b, o0.f4800b);
                }
                if (o0 != null && o0.f4803e) {
                    zzy2.f4800b = o0.f4800b;
                    zzy2.f4802d = o0.f4802d;
                    zzy2.f4806h = o0.f4806h;
                    zzy2.f4804f = o0.f4804f;
                    zzy2.f4807i = o0.f4807i;
                    zzy2.f4803e = o0.f4803e;
                    zzy2.f4801c = new zzkn(zzy2.f4801c.f4771b, o0.f4801c.f4772c, zzy2.f4801c.mo13160Q(), o0.f4801c.f4775f);
                } else if (TextUtils.isEmpty(zzy2.f4804f)) {
                    zzy2.f4801c = new zzkn(zzy2.f4801c.f4771b, zzy2.f4802d, zzy2.f4801c.mo13160Q(), zzy2.f4801c.f4775f);
                    zzy2.f4803e = true;
                    z3 = true;
                }
                if (zzy2.f4803e) {
                    zzkn zzkn = zzy2.f4801c;
                    C2334t9 t9Var = new C2334t9(zzy2.f4799a, zzy2.f4800b, zzkn.f4771b, zzkn.f4772c, zzkn.mo13160Q());
                    if (mo12819U().mo12508S(t9Var)) {
                        F2 = this.f4324i.mo12427b().mo13103N();
                        str2 = "User property updated immediately";
                        w2 = zzy2.f4799a;
                        z2 = this.f4324i.mo12413H().mo12997z(t9Var.f4628c);
                        obj = t9Var.f4630e;
                    } else {
                        F2 = this.f4324i.mo12427b().mo13096F();
                        str2 = "(2)Too many active user properties, ignoring";
                        w2 = C2361w3.m7696w(zzy2.f4799a);
                        z2 = this.f4324i.mo12413H().mo12997z(t9Var.f4628c);
                        obj = t9Var.f4630e;
                    }
                    F2.mo13133d(str2, w2, z2, obj);
                    if (z3 && zzy2.f4807i != null) {
                        m7224K(new zzaq(zzy2.f4807i, zzy2.f4802d), zzm);
                    }
                }
                if (mo12819U().mo12509T(zzy2)) {
                    F = this.f4324i.mo12427b().mo13103N();
                    str = "Conditional property added";
                    w = zzy2.f4799a;
                    z = this.f4324i.mo12413H().mo12997z(zzy2.f4801c.f4771b);
                    Q = zzy2.f4801c.mo13160Q();
                } else {
                    F = this.f4324i.mo12427b().mo13096F();
                    str = "Too many conditional properties, ignoring";
                    w = C2361w3.m7696w(zzy2.f4799a);
                    z = this.f4324i.mo12413H().mo12997z(zzy2.f4801c.f4771b);
                    Q = zzy2.f4801c.mo13160Q();
                }
                F.mo13133d(str, w, z, Q);
                mo12819U().mo12523u();
            } finally {
                mo12819U().mo12533z0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo12839y(Runnable runnable) {
        m7233i0();
        if (this.f4328m == null) {
            this.f4328m = new ArrayList();
        }
        this.f4328m.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12840z(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m7233i0()
            r6.mo12825b0()
            com.google.android.gms.common.internal.C1609u.m4471g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0182 }
        L_0x000e:
            com.google.android.gms.measurement.internal.a5 r1 = r6.f4324i     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.w3 r1 = r1.mo12427b()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13104O()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0182 }
            r1.mo13131b(r2, r3)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c r1 = r6.mo12819U()     // Catch:{ all -> 0x0182 }
            r1.mo12524u0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c r1 = r6.mo12819U()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d5 r1 = r1.mo12512i0(r7)     // Catch:{ all -> 0x0179 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.a5 r8 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.w3 r8 = r8.mo12427b()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13099J()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r7)     // Catch:{ all -> 0x0179 }
            r8.mo13131b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.a5 r10 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r10 = r10.mo12429f()     // Catch:{ all -> 0x0179 }
            long r10 = r10.mo11378a()     // Catch:{ all -> 0x0179 }
            r1.mo12589N(r10)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r10 = r6.mo12819U()     // Catch:{ all -> 0x0179 }
            r10.mo12503N(r1)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a5 r10 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.w3 r10 = r10.mo12427b()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r10 = r10.mo13104O()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            r10.mo13132c(r11, r1, r9)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.v4 r9 = r6.mo12815Q()     // Catch:{ all -> 0x0179 }
            r9.mo13068B(r7)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a5 r7 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.j4 r7 = r7.mo12406A()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.n4 r7 = r7.f4223f     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a5 r9 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo12429f()     // Catch:{ all -> 0x0179 }
            long r9 = r9.mo11378a()     // Catch:{ all -> 0x0179 }
            r7.mo12850b(r9)     // Catch:{ all -> 0x0179 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.a5 r7 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.j4 r7 = r7.mo12406A()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.n4 r7 = r7.f4224g     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.a5 r8 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r8 = r8.mo12429f()     // Catch:{ all -> 0x0179 }
            long r8 = r8.mo11378a()     // Catch:{ all -> 0x0179 }
            r7.mo12850b(r8)     // Catch:{ all -> 0x0179 }
        L_0x00c5:
            r6.m7238l0()     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0179 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x0179 }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.v4 r9 = r6.mo12815Q()     // Catch:{ all -> 0x0179 }
            boolean r9 = r9.mo13077y(r7, r10, r11)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.c r7 = r6.mo12819U()     // Catch:{ all -> 0x0182 }
        L_0x00fa:
            r7.mo12533z0()     // Catch:{ all -> 0x0182 }
            r6.f4331p = r0
            r6.m7220E()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.v4 r11 = r6.mo12815Q()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.internal.measurement.n0 r11 = r11.mo13076u(r7)     // Catch:{ all -> 0x0179 }
            if (r11 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.v4 r11 = r6.mo12815Q()     // Catch:{ all -> 0x0179 }
            boolean r9 = r11.mo13077y(r7, r9, r9)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.c r7 = r6.mo12819U()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x011c:
            com.google.android.gms.measurement.internal.a5 r9 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo12429f()     // Catch:{ all -> 0x0179 }
            long r2 = r9.mo11378a()     // Catch:{ all -> 0x0179 }
            r1.mo12586K(r2)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r9 = r6.mo12819U()     // Catch:{ all -> 0x0179 }
            r9.mo12503N(r1)     // Catch:{ all -> 0x0179 }
            if (r8 != r5) goto L_0x0142
            com.google.android.gms.measurement.internal.a5 r8 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.w3 r8 = r8.mo12427b()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13101L()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo13131b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x015a
        L_0x0142:
            com.google.android.gms.measurement.internal.a5 r7 = r6.f4324i     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo12427b()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.y3 r7 = r7.mo13104O()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            int r10 = r10.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0179 }
            r7.mo13132c(r9, r8, r10)     // Catch:{ all -> 0x0179 }
        L_0x015a:
            com.google.android.gms.measurement.internal.e4 r7 = r6.mo12817S()     // Catch:{ all -> 0x0179 }
            boolean r7 = r7.mo12652x()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r6.m7236k0()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            r6.mo12826c0()     // Catch:{ all -> 0x0179 }
        L_0x016d:
            com.google.android.gms.measurement.internal.c r7 = r6.mo12819U()     // Catch:{ all -> 0x0179 }
            r7.mo12523u()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c r7 = r6.mo12819U()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x0179:
            r7 = move-exception
            com.google.android.gms.measurement.internal.c r8 = r6.mo12819U()     // Catch:{ all -> 0x0182 }
            r8.mo12533z0()     // Catch:{ all -> 0x0182 }
            throw r7     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r7 = move-exception
            r6.f4331p = r0
            r6.m7220E()
            goto L_0x018a
        L_0x0189:
            throw r7
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245l9.mo12840z(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
