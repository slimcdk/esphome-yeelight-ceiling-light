package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.p6 */
public abstract class C1252p6 {

    /* renamed from: g */
    private static final Object f1516g = new Object();
    @Nullable

    /* renamed from: h */
    private static volatile C1220n6 f1517h;

    /* renamed from: i */
    private static final AtomicInteger f1518i = new AtomicInteger();

    /* renamed from: j */
    public static final /* synthetic */ int f1519j = 0;

    /* renamed from: a */
    final C1204m6 f1520a;

    /* renamed from: b */
    final String f1521b;

    /* renamed from: c */
    private final Object f1522c;

    /* renamed from: d */
    private volatile int f1523d = -1;

    /* renamed from: e */
    private volatile Object f1524e;

    /* renamed from: f */
    private final boolean f1525f;

    static {
        new AtomicReference();
        new C1300s6(C1124h6.f1363a, (byte[]) null);
    }

    /* synthetic */ C1252p6(C1204m6 m6Var, String str, Object obj, boolean z, C1236o6 o6Var) {
        if (m6Var.f1420b != null) {
            this.f1520a = m6Var;
            this.f1521b = str;
            this.f1522c = obj;
            this.f1525f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    static void m2451d() {
        f1518i.incrementAndGet();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m2452e(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.n6 r0 = f1517h
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f1516g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.n6 r1 = f1517h     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.n6 r1 = f1517h     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo13017a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.measurement.C1345v5.m3113e()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C1268q6.m2521c()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C1060d6.m1811e()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.g6 r1 = new com.google.android.gms.internal.measurement.g6     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.u6 r1 = com.google.android.gms.internal.measurement.C1361w6.m3153a(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.s5 r2 = new com.google.android.gms.internal.measurement.s5     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f1517h = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f1518i     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1252p6.m2452e(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo12877a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r2 = r2.mo12525a(mo13070c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13069b() {
        /*
            r6 = this;
            boolean r0 = r6.f1525f
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.f1521b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f1518i
            int r0 = r0.get()
            int r1 = r6.f1523d
            if (r1 >= r0) goto L_0x00d2
            monitor-enter(r6)
            int r1 = r6.f1523d     // Catch:{ all -> 0x00cf }
            if (r1 >= r0) goto L_0x00cd
            com.google.android.gms.internal.measurement.n6 r1 = f1517h     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00c7
            com.google.android.gms.internal.measurement.m6 r2 = r6.f1520a     // Catch:{ all -> 0x00cf }
            boolean r3 = r2.f1424f     // Catch:{ all -> 0x00cf }
            android.net.Uri r2 = r2.f1420b     // Catch:{ all -> 0x00cf }
            r3 = 0
            if (r2 == 0) goto L_0x004e
            android.content.Context r2 = r1.mo13017a()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.m6 r4 = r6.f1520a     // Catch:{ all -> 0x00cf }
            android.net.Uri r4 = r4.f1420b     // Catch:{ all -> 0x00cf }
            boolean r2 = com.google.android.gms.internal.measurement.C1076e6.m1893a(r2, r4)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.m6 r2 = r6.f1520a     // Catch:{ all -> 0x00cf }
            boolean r2 = r2.f1426h     // Catch:{ all -> 0x00cf }
            android.content.Context r2 = r1.mo13017a()     // Catch:{ all -> 0x00cf }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.m6 r4 = r6.f1520a     // Catch:{ all -> 0x00cf }
            android.net.Uri r4 = r4.f1420b     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.v5 r2 = com.google.android.gms.internal.measurement.C1345v5.m3112b(r2, r4)     // Catch:{ all -> 0x00cf }
            goto L_0x005a
        L_0x004c:
            r2 = r3
            goto L_0x005a
        L_0x004e:
            android.content.Context r2 = r1.mo13017a()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.m6 r4 = r6.f1520a     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = r4.f1419a     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.q6 r2 = com.google.android.gms.internal.measurement.C1268q6.m2520b(r2, r3)     // Catch:{ all -> 0x00cf }
        L_0x005a:
            if (r2 == 0) goto L_0x006b
            java.lang.String r4 = r6.mo13070c()     // Catch:{ all -> 0x00cf }
            java.lang.Object r2 = r2.mo12525a(r4)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r6.mo12877a(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x006c
        L_0x006b:
            r2 = r3
        L_0x006c:
            if (r2 == 0) goto L_0x006f
            goto L_0x0097
        L_0x006f:
            com.google.android.gms.internal.measurement.m6 r2 = r6.f1520a     // Catch:{ all -> 0x00cf }
            boolean r2 = r2.f1423e     // Catch:{ all -> 0x00cf }
            if (r2 != 0) goto L_0x0092
            android.content.Context r2 = r1.mo13017a()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.d6 r2 = com.google.android.gms.internal.measurement.C1060d6.m1810b(r2)     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.m6 r4 = r6.f1520a     // Catch:{ all -> 0x00cf }
            boolean r4 = r4.f1423e     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x0085
            r4 = r3
            goto L_0x0087
        L_0x0085:
            java.lang.String r4 = r6.f1521b     // Catch:{ all -> 0x00cf }
        L_0x0087:
            java.lang.String r2 = r2.mo12525a(r4)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.mo12877a(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x0093
        L_0x0092:
            r2 = r3
        L_0x0093:
            if (r2 != 0) goto L_0x0097
            java.lang.Object r2 = r6.f1522c     // Catch:{ all -> 0x00cf }
        L_0x0097:
            com.google.android.gms.internal.measurement.u6 r1 = r1.mo13018b()     // Catch:{ all -> 0x00cf }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.zzid r1 = (com.google.android.gms.internal.measurement.zzid) r1     // Catch:{ all -> 0x00cf }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00c2
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.x5 r1 = (com.google.android.gms.internal.measurement.C1375x5) r1     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.m6 r2 = r6.f1520a     // Catch:{ all -> 0x00cf }
            android.net.Uri r4 = r2.f1420b     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = r2.f1422d     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r6.f1521b     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = r1.mo13494a(r4, r3, r2, r5)     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x00be
            java.lang.Object r2 = r6.f1522c     // Catch:{ all -> 0x00cf }
            goto L_0x00c2
        L_0x00be:
            java.lang.Object r2 = r6.mo12877a(r1)     // Catch:{ all -> 0x00cf }
        L_0x00c2:
            r6.f1524e = r2     // Catch:{ all -> 0x00cf }
            r6.f1523d = r0     // Catch:{ all -> 0x00cf }
            goto L_0x00cd
        L_0x00c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00cf }
            r0.<init>(r2)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            goto L_0x00d2
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00cf }
            throw r0
        L_0x00d2:
            java.lang.Object r0 = r6.f1524e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1252p6.mo13069b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo13070c() {
        String str = this.f1520a.f1422d;
        return this.f1521b;
    }
}
