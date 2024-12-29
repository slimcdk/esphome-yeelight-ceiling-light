package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.n3 */
public final class C1715n3 {

    /* renamed from: h */
    private static final Object f2320h = new Object();

    /* renamed from: a */
    private final String f2321a;

    /* renamed from: b */
    private final C1677k3 f2322b;

    /* renamed from: c */
    private final Object f2323c;

    /* renamed from: d */
    private final Object f2324d;

    /* renamed from: e */
    private final Object f2325e = new Object();
    @GuardedBy("overrideLock")

    /* renamed from: f */
    private volatile Object f2326f = null;
    @GuardedBy("cachingLock")

    /* renamed from: g */
    private volatile Object f2327g = null;

    /* synthetic */ C1715n3(String str, Object obj, Object obj2, C1677k3 k3Var, C1703m3 m3Var) {
        this.f2321a = str;
        this.f2323c = obj;
        this.f2324d = obj2;
        this.f2322b = k3Var;
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
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* renamed from: a */
    public final java.lang.Object mo14366a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2325e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.c r4 = com.google.android.gms.measurement.internal.C1690l3.f2262a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f2323c
            return r4
        L_0x000e:
            java.lang.Object r4 = f2320h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C1569c.m4075a()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f2327g     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f2323c     // Catch:{ all -> 0x006b }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f2327g     // Catch:{ all -> 0x006b }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            java.util.List r4 = com.google.android.gms.measurement.internal.C1727o3.f2429a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            com.google.android.gms.measurement.internal.n3 r0 = (com.google.android.gms.measurement.internal.C1715n3) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = com.google.android.gms.measurement.internal.C1569c.m4075a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            com.google.android.gms.measurement.internal.k3 r2 = r0.f2322b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f2320h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f2327g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
        L_0x0059:
            com.google.android.gms.measurement.internal.k3 r4 = r3.f2322b
            if (r4 != 0) goto L_0x0060
            java.lang.Object r4 = r3.f2323c
            return r4
        L_0x0060:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0068, IllegalStateException -> 0x0065 }
            return r4
        L_0x0065:
            java.lang.Object r4 = r3.f2323c
            return r4
        L_0x0068:
            java.lang.Object r4 = r3.f2323c
            return r4
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x0071:
            throw r4
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1715n3.mo14366a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo14367b() {
        return this.f2321a;
    }
}
