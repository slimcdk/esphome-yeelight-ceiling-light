package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.p3 */
public final class C2284p3<V> {

    /* renamed from: h */
    private static final Object f4419h = new Object();

    /* renamed from: a */
    private final String f4420a;

    /* renamed from: b */
    private final C2262n3<V> f4421b;

    /* renamed from: c */
    private final V f4422c;

    /* renamed from: d */
    private final V f4423d;

    /* renamed from: e */
    private final Object f4424e;
    @GuardedBy("overrideLock")

    /* renamed from: f */
    private volatile V f4425f;
    @GuardedBy("cachingLock")

    /* renamed from: g */
    private volatile V f4426g;

    private C2284p3(@NonNull String str, @NonNull V v, @NonNull V v2, @Nullable C2262n3<V> n3Var) {
        this.f4424e = new Object();
        this.f4425f = null;
        this.f4426g = null;
        this.f4420a = str;
        this.f4422c = v;
        this.f4423d = v2;
        this.f4421b = n3Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0048 */
    /* renamed from: a */
    public final V mo12867a(@androidx.annotation.Nullable V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4424e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.fa r4 = com.google.android.gms.measurement.internal.C2251m3.f4357a
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f4422c
            return r4
        L_0x000e:
            java.lang.Object r4 = f4419h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C2176fa.m7021a()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.f4426g     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.f4422c     // Catch:{ all -> 0x006d }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.f4426g     // Catch:{ all -> 0x006d }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            java.util.List r4 = com.google.android.gms.measurement.internal.C2302r.f4501a     // Catch:{ SecurityException -> 0x005a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005a }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005a }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005a }
            com.google.android.gms.measurement.internal.p3 r0 = (com.google.android.gms.measurement.internal.C2284p3) r0     // Catch:{ SecurityException -> 0x005a }
            boolean r1 = com.google.android.gms.measurement.internal.C2176fa.m7021a()     // Catch:{ SecurityException -> 0x005a }
            if (r1 != 0) goto L_0x0052
            r1 = 0
            com.google.android.gms.measurement.internal.n3<V> r2 = r0.f4421b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.n3<V> r2 = r0.f4421b     // Catch:{ IllegalStateException -> 0x0048 }
            java.lang.Object r1 = r2.mo12403C()     // Catch:{ IllegalStateException -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = f4419h     // Catch:{ SecurityException -> 0x005a }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005a }
            r0.f4426g = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002b
        L_0x004f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005a }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005a }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x005a:
        L_0x005b:
            com.google.android.gms.measurement.internal.n3<V> r4 = r3.f4421b
            if (r4 != 0) goto L_0x0062
            V r4 = r3.f4422c
            return r4
        L_0x0062:
            java.lang.Object r4 = r4.mo12403C()     // Catch:{ SecurityException -> 0x006a, IllegalStateException -> 0x0067 }
            return r4
        L_0x0067:
            V r4 = r3.f4422c
            return r4
        L_0x006a:
            V r4 = r3.f4422c
            return r4
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r4
        L_0x0072:
            r4 = move-exception
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2284p3.mo12867a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo12868b() {
        return this.f4420a;
    }
}
