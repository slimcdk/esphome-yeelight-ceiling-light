package org.eclipse.jetty.client;

import org.eclipse.jetty.p195io.Buffers;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11939c;
import p225w5.C11940d;
import p225w5.C11950k;
import p229x5.C11983a;

/* renamed from: org.eclipse.jetty.client.c */
public class C9867c extends C9861a implements C11983a {

    /* renamed from: s */
    private static final C9003c f17902s = C9001b.m21450a(C9867c.class);

    /* renamed from: p */
    private boolean f17903p;

    /* renamed from: q */
    private C11940d f17904q;

    /* renamed from: r */
    private final C11939c f17905r;

    C9867c(Buffers buffers, Buffers buffers2, C11950k kVar) {
        super(buffers, buffers2, kVar);
        this.f17905r = (C11939c) kVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0154 A[Catch:{ all -> 0x035b }] */
    /* renamed from: c */
    public p225w5.C11949j mo39556c() {
        /*
            r16 = this;
            r1 = r16
            r2 = 0
            r3 = 1
            r4 = r1
            r0 = 1
            r5 = 0
        L_0x0007:
            r6 = 2
            if (r0 == 0) goto L_0x0378
            if (r4 != r1) goto L_0x0378
            e6.c r7 = f17902s     // Catch:{ all -> 0x035b }
            java.lang.String r8 = "while open={} more={} progress={}"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x035b }
            w5.k r11 = r1.f21821b     // Catch:{ all -> 0x035b }
            boolean r11 = r11.isOpen()     // Catch:{ all -> 0x035b }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x035b }
            r10[r2] = r11     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.http.m r11 = r1.f17886f     // Catch:{ all -> 0x035b }
            boolean r11 = r11.mo39848n()     // Catch:{ all -> 0x035b }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x035b }
            r10[r3] = r11     // Catch:{ all -> 0x035b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x035b }
            r10[r6] = r0     // Catch:{ all -> 0x035b }
            r7.mo36850e(r8, r10)     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.j r8 = r1.f17891k     // Catch:{ all -> 0x035b }
            java.lang.String r0 = "exchange {} on {}"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x035b }
            r10[r2] = r8     // Catch:{ all -> 0x035b }
            r10[r3] = r1     // Catch:{ all -> 0x035b }
            r7.mo36850e(r0, r10)     // Catch:{ all -> 0x035b }
            r10 = 101(0x65, float:1.42E-43)
            r11 = 4
            r12 = 0
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01dc }
            boolean r0 = r0.mo39720g()     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0067
            if (r8 == 0) goto L_0x0067
            int r0 = r8.mo39636s()     // Catch:{ all -> 0x01dc }
            if (r0 != r6) goto L_0x0067
            java.lang.String r0 = "commit {}"
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x01dc }
            r13[r2] = r8     // Catch:{ all -> 0x01dc }
            r7.mo36850e(r0, r13)     // Catch:{ all -> 0x01dc }
            r16.mo39522n()     // Catch:{ all -> 0x0063 }
            r13 = 1
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r13 = 1
            goto L_0x01de
        L_0x0067:
            r13 = 0
        L_0x0068:
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39720g()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x00d7
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39718e()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x00d7
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            int r0 = r0.mo39724k()     // Catch:{ all -> 0x01da }
            if (r0 <= 0) goto L_0x0088
            java.lang.String r0 = "flushed"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            r13 = 1
        L_0x0088:
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39710D(r6)     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x00d7
            w5.d r0 = r1.f17904q     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x009a
            w5.d r0 = r8.mo39631n(r12)     // Catch:{ all -> 0x01da }
            r1.f17904q = r0     // Catch:{ all -> 0x01da }
        L_0x009a:
            w5.d r0 = r1.f17904q     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "complete {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01da }
            r14[r2] = r8     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x0063 }
            r0.complete()     // Catch:{ all -> 0x0063 }
        L_0x00ac:
            r13 = 1
            goto L_0x00d7
        L_0x00ae:
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39830H()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "addChunk"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            w5.d r0 = r1.f17904q     // Catch:{ all -> 0x0063 }
            w5.d r13 = r8.mo39631n(r12)     // Catch:{ all -> 0x0063 }
            r1.f17904q = r13     // Catch:{ all -> 0x0063 }
            org.eclipse.jetty.http.i r14 = r1.f17885e     // Catch:{ all -> 0x0063 }
            if (r13 != 0) goto L_0x00cb
            r13 = 1
            goto L_0x00cc
        L_0x00cb:
            r13 = 0
        L_0x00cc:
            r14.mo39753l(r0, r13)     // Catch:{ all -> 0x0063 }
            w5.d r0 = r1.f17904q     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x00ac
            r8.mo39616X(r11)     // Catch:{ all -> 0x0063 }
            goto L_0x00ac
        L_0x00d7:
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39718e()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r1.f17903p     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "requestComplete {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01da }
            r14[r2] = r8     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            r1.f17903p = r3     // Catch:{ all -> 0x0063 }
            org.eclipse.jetty.client.h r0 = r8.mo39628k()     // Catch:{ all -> 0x0063 }
            r0.mo39549k()     // Catch:{ all -> 0x0063 }
            r13 = 1
        L_0x00f6:
            org.eclipse.jetty.http.m r0 = r1.f17886f     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39839e()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0110
            org.eclipse.jetty.http.m r0 = r1.f17886f     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39836b()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "parsed {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01da }
            r14[r2] = r8     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            r13 = 1
        L_0x0110:
            w5.k r0 = r1.f21821b     // Catch:{ all -> 0x01da }
            r0.flush()     // Catch:{ all -> 0x01da }
            w5.c r0 = r1.f17905r     // Catch:{ all -> 0x01da }
            boolean r0 = r0.mo39653d()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "hasProgressed {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01da }
            r14[r2] = r8     // Catch:{ all -> 0x01da }
            r7.mo36850e(r0, r14)     // Catch:{ all -> 0x01da }
            r13 = 1
        L_0x0127:
            java.lang.String r0 = "finally {} on {} progress={} {}"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x035b }
            r11[r2] = r8     // Catch:{ all -> 0x035b }
            r11[r3] = r1     // Catch:{ all -> 0x035b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x035b }
            r11[r6] = r8     // Catch:{ all -> 0x035b }
            w5.k r8 = r1.f21821b     // Catch:{ all -> 0x035b }
            r11[r9] = r8     // Catch:{ all -> 0x035b }
            r7.mo36850e(r0, r11)     // Catch:{ all -> 0x035b }
            if (r5 != 0) goto L_0x0151
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x035b }
            boolean r0 = r0.mo39718e()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x014f
            org.eclipse.jetty.http.m r0 = r1.f17886f     // Catch:{ all -> 0x035b }
            boolean r0 = r0.mo39839e()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r0 = 0
            goto L_0x0152
        L_0x0151:
            r0 = 1
        L_0x0152:
            if (r0 == 0) goto L_0x01d7
            if (r5 != 0) goto L_0x0168
            org.eclipse.jetty.http.m r0 = r1.f17886f     // Catch:{ all -> 0x035b }
            boolean r0 = r0.mo39840f()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0168
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x035b }
            boolean r0 = r0.mo39719f()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0168
            r0 = 1
            goto L_0x0169
        L_0x0168:
            r0 = 0
        L_0x0169:
            org.eclipse.jetty.http.i r7 = r1.f17885e     // Catch:{ all -> 0x035b }
            r7.mo39715c(r0)     // Catch:{ all -> 0x035b }
            r16.mo39526q()     // Catch:{ all -> 0x035b }
            if (r0 == 0) goto L_0x0183
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.g r8 = r8.mo39498h()     // Catch:{ all -> 0x035b }
            long r8 = r8.mo39568T0()     // Catch:{ all -> 0x035b }
            int r9 = (int) r8     // Catch:{ all -> 0x035b }
            r7.mo39659i(r9)     // Catch:{ all -> 0x035b }
        L_0x0183:
            monitor-enter(r16)     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.j r7 = r1.f17891k     // Catch:{ all -> 0x01d4 }
            r1.f17891k = r12     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x0193
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x01d4 }
            org.eclipse.jetty.client.g r8 = r8.mo39498h()     // Catch:{ all -> 0x01d4 }
            r7.mo39624f(r8)     // Catch:{ all -> 0x01d4 }
        L_0x0193:
            int r8 = r1.f17888h     // Catch:{ all -> 0x01d4 }
            if (r8 != r10) goto L_0x01ab
            w5.k r8 = r1.f21821b     // Catch:{ all -> 0x01d4 }
            w5.j r7 = r7.mo39601I(r8)     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x01ab
            org.eclipse.jetty.client.j r4 = r1.f17892l     // Catch:{ all -> 0x01d4 }
            if (r4 == 0) goto L_0x01a8
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x01d4 }
            r8.mo39512u(r4)     // Catch:{ all -> 0x01d4 }
        L_0x01a8:
            r1.f17892l = r12     // Catch:{ all -> 0x01d4 }
            r4 = r7
        L_0x01ab:
            org.eclipse.jetty.client.j r7 = r1.f17892l     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x01be
            if (r0 == 0) goto L_0x01b7
            if (r4 == r1) goto L_0x01b4
            goto L_0x01b7
        L_0x01b4:
            r1.f17891k = r7     // Catch:{ all -> 0x01d4 }
            goto L_0x01bc
        L_0x01b7:
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x01d4 }
            r8.mo39512u(r7)     // Catch:{ all -> 0x01d4 }
        L_0x01bc:
            r1.f17892l = r12     // Catch:{ all -> 0x01d4 }
        L_0x01be:
            org.eclipse.jetty.client.j r7 = r1.f17891k     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x01d2
            boolean r7 = r16.mo39525p()     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x01d2
            org.eclipse.jetty.client.HttpDestination r7 = r1.f17884d     // Catch:{ all -> 0x01d4 }
            if (r0 != 0) goto L_0x01ce
            r0 = 1
            goto L_0x01cf
        L_0x01ce:
            r0 = 0
        L_0x01cf:
            r7.mo39508r(r1, r0)     // Catch:{ all -> 0x01d4 }
        L_0x01d2:
            monitor-exit(r16)     // Catch:{ all -> 0x01d4 }
            goto L_0x01d7
        L_0x01d4:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01d4 }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x01d7:
            r0 = r13
            goto L_0x0007
        L_0x01da:
            r0 = move-exception
            goto L_0x01de
        L_0x01dc:
            r0 = move-exception
            r13 = 0
        L_0x01de:
            e6.c r7 = f17902s     // Catch:{ all -> 0x02a7 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a7 }
            r14.<init>()     // Catch:{ all -> 0x02a7 }
            java.lang.String r15 = "Failure on "
            r14.append(r15)     // Catch:{ all -> 0x02a7 }
            org.eclipse.jetty.client.j r15 = r1.f17891k     // Catch:{ all -> 0x02a7 }
            r14.append(r15)     // Catch:{ all -> 0x02a7 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x02a7 }
            r7.mo36854h(r14, r0)     // Catch:{ all -> 0x02a7 }
            monitor-enter(r16)     // Catch:{ all -> 0x02a4 }
            if (r8 == 0) goto L_0x0286
            int r5 = r8.mo39636s()     // Catch:{ all -> 0x02a1 }
            r14 = 10
            if (r5 == r14) goto L_0x021e
            int r5 = r8.mo39636s()     // Catch:{ all -> 0x02a1 }
            r14 = 11
            if (r5 == r14) goto L_0x021e
            boolean r5 = r8.mo39641w()     // Catch:{ all -> 0x02a1 }
            if (r5 != 0) goto L_0x021e
            r5 = 9
            boolean r5 = r8.mo39616X(r5)     // Catch:{ all -> 0x02a1 }
            if (r5 == 0) goto L_0x021e
            org.eclipse.jetty.client.h r5 = r8.mo39628k()     // Catch:{ all -> 0x02a1 }
            r5.mo39547i(r0)     // Catch:{ all -> 0x02a1 }
        L_0x021e:
            monitor-exit(r16)     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "finally {} on {} progress={} {}"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x035b }
            r5[r2] = r8     // Catch:{ all -> 0x035b }
            r5[r3] = r1     // Catch:{ all -> 0x035b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x035b }
            r5[r6] = r8     // Catch:{ all -> 0x035b }
            w5.k r8 = r1.f21821b     // Catch:{ all -> 0x035b }
            r5[r9] = r8     // Catch:{ all -> 0x035b }
            r7.mo36850e(r0, r5)     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.http.i r0 = r1.f17885e     // Catch:{ all -> 0x035b }
            r0.mo39715c(r2)     // Catch:{ all -> 0x035b }
            r16.mo39526q()     // Catch:{ all -> 0x035b }
            monitor-enter(r16)     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.j r0 = r1.f17891k     // Catch:{ all -> 0x0283 }
            r1.f17891k = r12     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x024c
            org.eclipse.jetty.client.HttpDestination r5 = r1.f17884d     // Catch:{ all -> 0x0283 }
            org.eclipse.jetty.client.g r5 = r5.mo39498h()     // Catch:{ all -> 0x0283 }
            r0.mo39624f(r5)     // Catch:{ all -> 0x0283 }
        L_0x024c:
            int r5 = r1.f17888h     // Catch:{ all -> 0x0283 }
            if (r5 != r10) goto L_0x0264
            w5.k r5 = r1.f21821b     // Catch:{ all -> 0x0283 }
            w5.j r0 = r0.mo39601I(r5)     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x0264
            org.eclipse.jetty.client.j r4 = r1.f17892l     // Catch:{ all -> 0x0283 }
            if (r4 == 0) goto L_0x0261
            org.eclipse.jetty.client.HttpDestination r5 = r1.f17884d     // Catch:{ all -> 0x0283 }
            r5.mo39512u(r4)     // Catch:{ all -> 0x0283 }
        L_0x0261:
            r1.f17892l = r12     // Catch:{ all -> 0x0283 }
            r4 = r0
        L_0x0264:
            org.eclipse.jetty.client.j r0 = r1.f17892l     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x026f
            org.eclipse.jetty.client.HttpDestination r5 = r1.f17884d     // Catch:{ all -> 0x0283 }
            r5.mo39512u(r0)     // Catch:{ all -> 0x0283 }
            r1.f17892l = r12     // Catch:{ all -> 0x0283 }
        L_0x026f:
            org.eclipse.jetty.client.j r0 = r1.f17891k     // Catch:{ all -> 0x0283 }
            if (r0 != 0) goto L_0x027e
            boolean r0 = r16.mo39525p()     // Catch:{ all -> 0x0283 }
            if (r0 != 0) goto L_0x027e
            org.eclipse.jetty.client.HttpDestination r0 = r1.f17884d     // Catch:{ all -> 0x0283 }
            r0.mo39508r(r1, r3)     // Catch:{ all -> 0x0283 }
        L_0x027e:
            monitor-exit(r16)     // Catch:{ all -> 0x0283 }
            r0 = r13
            r5 = 1
            goto L_0x0007
        L_0x0283:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0283 }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x0286:
            boolean r5 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x02a1 }
            if (r5 != 0) goto L_0x029e
            boolean r5 = r0 instanceof java.lang.Error     // Catch:{ all -> 0x02a1 }
            if (r5 != 0) goto L_0x029b
            boolean r5 = r0 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x02a1 }
            if (r5 == 0) goto L_0x0295
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x0295:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x02a1 }
            r5.<init>(r0)     // Catch:{ all -> 0x02a1 }
            throw r5     // Catch:{ all -> 0x02a1 }
        L_0x029b:
            java.lang.Error r0 = (java.lang.Error) r0     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x029e:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            r5 = 1
            goto L_0x02a8
        L_0x02a7:
            r0 = move-exception
        L_0x02a8:
            e6.c r7 = f17902s     // Catch:{ all -> 0x035b }
            java.lang.String r14 = "finally {} on {} progress={} {}"
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x035b }
            r11[r2] = r8     // Catch:{ all -> 0x035b }
            r11[r3] = r1     // Catch:{ all -> 0x035b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x035b }
            r11[r6] = r8     // Catch:{ all -> 0x035b }
            w5.k r8 = r1.f21821b     // Catch:{ all -> 0x035b }
            r11[r9] = r8     // Catch:{ all -> 0x035b }
            r7.mo36850e(r14, r11)     // Catch:{ all -> 0x035b }
            if (r5 != 0) goto L_0x02d4
            org.eclipse.jetty.http.i r7 = r1.f17885e     // Catch:{ all -> 0x035b }
            boolean r7 = r7.mo39718e()     // Catch:{ all -> 0x035b }
            if (r7 == 0) goto L_0x02d2
            org.eclipse.jetty.http.m r7 = r1.f17886f     // Catch:{ all -> 0x035b }
            boolean r7 = r7.mo39839e()     // Catch:{ all -> 0x035b }
            if (r7 == 0) goto L_0x02d2
            goto L_0x02d4
        L_0x02d2:
            r7 = 0
            goto L_0x02d5
        L_0x02d4:
            r7 = 1
        L_0x02d5:
            if (r7 == 0) goto L_0x035a
            if (r5 != 0) goto L_0x02eb
            org.eclipse.jetty.http.m r5 = r1.f17886f     // Catch:{ all -> 0x035b }
            boolean r5 = r5.mo39840f()     // Catch:{ all -> 0x035b }
            if (r5 == 0) goto L_0x02eb
            org.eclipse.jetty.http.i r5 = r1.f17885e     // Catch:{ all -> 0x035b }
            boolean r5 = r5.mo39719f()     // Catch:{ all -> 0x035b }
            if (r5 == 0) goto L_0x02eb
            r5 = 1
            goto L_0x02ec
        L_0x02eb:
            r5 = 0
        L_0x02ec:
            org.eclipse.jetty.http.i r7 = r1.f17885e     // Catch:{ all -> 0x035b }
            r7.mo39715c(r5)     // Catch:{ all -> 0x035b }
            r16.mo39526q()     // Catch:{ all -> 0x035b }
            if (r5 == 0) goto L_0x0306
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.g r8 = r8.mo39498h()     // Catch:{ all -> 0x035b }
            long r8 = r8.mo39568T0()     // Catch:{ all -> 0x035b }
            int r9 = (int) r8     // Catch:{ all -> 0x035b }
            r7.mo39659i(r9)     // Catch:{ all -> 0x035b }
        L_0x0306:
            monitor-enter(r16)     // Catch:{ all -> 0x035b }
            org.eclipse.jetty.client.j r7 = r1.f17891k     // Catch:{ all -> 0x0357 }
            r1.f17891k = r12     // Catch:{ all -> 0x0357 }
            if (r7 == 0) goto L_0x0316
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x0357 }
            org.eclipse.jetty.client.g r8 = r8.mo39498h()     // Catch:{ all -> 0x0357 }
            r7.mo39624f(r8)     // Catch:{ all -> 0x0357 }
        L_0x0316:
            int r8 = r1.f17888h     // Catch:{ all -> 0x0357 }
            if (r8 != r10) goto L_0x032e
            w5.k r8 = r1.f21821b     // Catch:{ all -> 0x0357 }
            w5.j r7 = r7.mo39601I(r8)     // Catch:{ all -> 0x0357 }
            if (r7 == 0) goto L_0x032e
            org.eclipse.jetty.client.j r4 = r1.f17892l     // Catch:{ all -> 0x0357 }
            if (r4 == 0) goto L_0x032b
            org.eclipse.jetty.client.HttpDestination r8 = r1.f17884d     // Catch:{ all -> 0x0357 }
            r8.mo39512u(r4)     // Catch:{ all -> 0x0357 }
        L_0x032b:
            r1.f17892l = r12     // Catch:{ all -> 0x0357 }
            r4 = r7
        L_0x032e:
            org.eclipse.jetty.client.j r7 = r1.f17892l     // Catch:{ all -> 0x0357 }
            if (r7 == 0) goto L_0x0341
            if (r5 == 0) goto L_0x033a
            if (r4 == r1) goto L_0x0337
            goto L_0x033a
        L_0x0337:
            r1.f17891k = r7     // Catch:{ all -> 0x0357 }
            goto L_0x033f
        L_0x033a:
            org.eclipse.jetty.client.HttpDestination r4 = r1.f17884d     // Catch:{ all -> 0x0357 }
            r4.mo39512u(r7)     // Catch:{ all -> 0x0357 }
        L_0x033f:
            r1.f17892l = r12     // Catch:{ all -> 0x0357 }
        L_0x0341:
            org.eclipse.jetty.client.j r4 = r1.f17891k     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x0355
            boolean r4 = r16.mo39525p()     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x0355
            org.eclipse.jetty.client.HttpDestination r4 = r1.f17884d     // Catch:{ all -> 0x0357 }
            if (r5 != 0) goto L_0x0351
            r5 = 1
            goto L_0x0352
        L_0x0351:
            r5 = 0
        L_0x0352:
            r4.mo39508r(r1, r5)     // Catch:{ all -> 0x0357 }
        L_0x0355:
            monitor-exit(r16)     // Catch:{ all -> 0x0357 }
            goto L_0x035a
        L_0x0357:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0357 }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x035a:
            throw r0     // Catch:{ all -> 0x035b }
        L_0x035b:
            r0 = move-exception
            org.eclipse.jetty.http.m r4 = r1.f17886f
            r4.mo39838d()
            org.eclipse.jetty.http.i r4 = r1.f17885e
            r4.mo39717d()
            e6.c r4 = f17902s
            java.lang.String r5 = "unhandle {} on {}"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            org.eclipse.jetty.client.j r7 = r1.f17891k
            r6[r2] = r7
            w5.k r2 = r1.f21821b
            r6[r3] = r2
            r4.mo36850e(r5, r6)
            throw r0
        L_0x0378:
            org.eclipse.jetty.http.m r0 = r1.f17886f
            r0.mo39838d()
            org.eclipse.jetty.http.i r0 = r1.f17885e
            r0.mo39717d()
            e6.c r0 = f17902s
            java.lang.String r5 = "unhandle {} on {}"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            org.eclipse.jetty.client.j r7 = r1.f17891k
            r6[r2] = r7
            w5.k r2 = r1.f21821b
            r6[r3] = r2
            r0.mo36850e(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.C9867c.mo39556c():w5.j");
    }

    /* renamed from: e */
    public void mo39557e() {
        if (this.f17885e.mo39713a()) {
            this.f21821b.mo39670t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo39526q() {
        this.f17903p = false;
        super.mo39526q();
    }

    /* renamed from: r */
    public boolean mo39527r(C9877j jVar) {
        boolean r = super.mo39527r(jVar);
        if (r) {
            this.f17905r.mo39649A();
        }
        return r;
    }
}
