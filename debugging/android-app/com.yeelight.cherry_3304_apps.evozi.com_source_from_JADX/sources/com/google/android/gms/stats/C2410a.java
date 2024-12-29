package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.p104i.C1535a;
import com.google.android.gms.common.util.C1662p;
import com.google.android.gms.common.util.C1664r;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ShowFirstParty
@KeepForSdk
@ThreadSafe
/* renamed from: com.google.android.gms.stats.a */
public class C2410a {

    /* renamed from: l */
    private static ScheduledExecutorService f4823l;

    /* renamed from: a */
    private final Object f4824a;

    /* renamed from: b */
    private final PowerManager.WakeLock f4825b;

    /* renamed from: c */
    private WorkSource f4826c;

    /* renamed from: d */
    private final int f4827d;

    /* renamed from: e */
    private final String f4828e;

    /* renamed from: f */
    private final String f4829f;

    /* renamed from: g */
    private final Context f4830g;

    /* renamed from: h */
    private boolean f4831h;

    /* renamed from: i */
    private final Map<String, Integer[]> f4832i;

    /* renamed from: j */
    private int f4833j;

    /* renamed from: k */
    private AtomicInteger f4834k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    public C2410a(@NonNull Context context, int i, @NonNull String str) {
        this(context, i, str, (String) null, context == null ? null : context.getPackageName());
    }

    private C2410a(@NonNull Context context, int i, @NonNull String str, @Nullable String str2, @NonNull String str3) {
        this(context, i, str, (String) null, str3, (String) null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C2410a(@NonNull Context context, int i, @NonNull String str, @Nullable String str2, @NonNull String str3, @Nullable String str4) {
        this.f4824a = this;
        this.f4831h = true;
        this.f4832i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f4834k = new AtomicInteger(0);
        C1609u.m4476l(context, "WakeLock: context must not be null");
        C1609u.m4472h(str, "WakeLock: wakeLockName must not be empty");
        this.f4827d = i;
        this.f4829f = null;
        this.f4830g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f4828e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f4828e = str;
        }
        this.f4825b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C1664r.m4619c(context)) {
            WorkSource a = C1664r.m4617a(context, C1662p.m4614a(str3) ? context.getPackageName() : str3);
            this.f4826c = a;
            if (a != null && C1664r.m4619c(this.f4830g)) {
                WorkSource workSource = this.f4826c;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.f4826c = a;
                }
                try {
                    this.f4825b.setWorkSource(this.f4826c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f4823l == null) {
            f4823l = C1535a.m4167a().mo11096a();
        }
    }

    /* renamed from: c */
    private final String m7836c(String str) {
        return this.f4831h ? !TextUtils.isEmpty(str) ? str : this.f4829f : this.f4829f;
    }

    /* renamed from: d */
    private final List<String> m7837d() {
        return C1664r.m4618b(this.f4826c);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m7838e(int i) {
        if (this.f4825b.isHeld()) {
            try {
                this.f4825b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.f4828e).concat(" was already released!");
                } else {
                    throw e;
                }
            }
            this.f4825b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f4833j == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C1643d.m4558a().mo11373b(r13.f4830g, com.google.android.gms.common.stats.C1642c.m4555a(r13.f4825b, r6), 7, r13.f4828e, r6, (java.lang.String) null, r13.f4827d, m7837d(), r14);
        r13.f4833j++;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13182a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f4834k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m7836c(r0)
            java.lang.Object r0 = r13.f4824a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f4832i     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f4833j     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f4825b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f4832i     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f4833j = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f4831h     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f4832i     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f4832i     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f4831h     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f4833j     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C1643d.m4558a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f4830g     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f4825b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.C1642c.m4555a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f4828e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f4827d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.m7837d()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo11373b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f4833j     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f4833j = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f4825b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f4823l
            com.google.android.gms.stats.b r1 = new com.google.android.gms.stats.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C2410a.mo13182a(long):void");
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo13183b(boolean z) {
        this.f4825b.setReferenceCounted(z);
        this.f4831h = z;
    }
}
