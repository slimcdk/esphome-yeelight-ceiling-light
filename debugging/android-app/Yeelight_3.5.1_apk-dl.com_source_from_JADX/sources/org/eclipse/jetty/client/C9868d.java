package org.eclipse.jetty.client;

import org.eclipse.jetty.p195io.Buffers;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11950k;

/* renamed from: org.eclipse.jetty.client.d */
public class C9868d extends C9861a {

    /* renamed from: r */
    private static final C9003c f17906r = C9001b.m21450a(C9868d.class);

    /* renamed from: p */
    private boolean f17907p;

    /* renamed from: q */
    private C11940d f17908q;

    C9868d(Buffers buffers, Buffers buffers2, C11950k kVar) {
        super(buffers, buffers2, kVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0003 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a A[Catch:{ all -> 0x0328 }] */
    /* renamed from: c */
    public p225w5.C11949j mo39556c() {
        /*
            r13 = this;
            r0 = 0
            r2 = 0
            r1 = r13
        L_0x0003:
            w5.k r3 = r13.f21821b     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.isOpen()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x031d
            if (r1 != r13) goto L_0x031d
            e6.c r3 = f17906r     // Catch:{ all -> 0x0328 }
            java.lang.String r4 = "open={} more={}"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
            w5.k r7 = r13.f21821b     // Catch:{ all -> 0x0328 }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x0328 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0328 }
            r6[r0] = r7     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.m r7 = r13.f17886f     // Catch:{ all -> 0x0328 }
            boolean r7 = r7.mo39848n()     // Catch:{ all -> 0x0328 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0328 }
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x0328 }
            r3.mo36850e(r4, r6)     // Catch:{ all -> 0x0328 }
            monitor-enter(r13)     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.j r3 = r13.f17891k     // Catch:{ all -> 0x031a }
        L_0x0033:
            if (r3 != 0) goto L_0x0041
            r13.wait()     // Catch:{ InterruptedException -> 0x003b }
            org.eclipse.jetty.client.j r3 = r13.f17891k     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x0033
        L_0x003b:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x031a }
            r0.<init>()     // Catch:{ all -> 0x031a }
            throw r0     // Catch:{ all -> 0x031a }
        L_0x0041:
            monitor-exit(r13)     // Catch:{ all -> 0x031a }
            e6.c r4 = f17906r     // Catch:{ all -> 0x0328 }
            java.lang.String r6 = "exchange {}"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0328 }
            r7[r0] = r3     // Catch:{ all -> 0x0328 }
            r4.mo36850e(r6, r7)     // Catch:{ all -> 0x0328 }
            r6 = 101(0x65, float:1.42E-43)
            r7 = 0
            org.eclipse.jetty.http.i r9 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r9 = r9.mo39720g()     // Catch:{ all -> 0x01c3 }
            if (r9 != 0) goto L_0x0068
            int r9 = r3.mo39636s()     // Catch:{ all -> 0x01c3 }
            if (r9 != r5) goto L_0x0068
            java.lang.String r9 = "commit"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
            r13.mo39522n()     // Catch:{ all -> 0x01c3 }
        L_0x0068:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39720g()     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x00da
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39718e()     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x00da
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            int r4 = r4.mo39724k()     // Catch:{ all -> 0x01c3 }
            if (r4 <= 0) goto L_0x0089
            e6.c r4 = f17906r     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "flushed"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
        L_0x0089:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39710D(r5)     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x0068
            w5.d r4 = r13.f17908q     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x009b
            w5.d r4 = r3.mo39631n(r7)     // Catch:{ all -> 0x01c3 }
            r13.f17908q = r4     // Catch:{ all -> 0x01c3 }
        L_0x009b:
            w5.d r4 = r13.f17908q     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x00ae
            e6.c r4 = f17906r     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "complete"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            r4.complete()     // Catch:{ all -> 0x01c3 }
            goto L_0x0068
        L_0x00ae:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39830H()     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x0068
            e6.c r4 = f17906r     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "addChunk"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
            w5.d r4 = r13.f17908q     // Catch:{ all -> 0x01c3 }
            w5.d r9 = r3.mo39631n(r7)     // Catch:{ all -> 0x01c3 }
            r13.f17908q = r9     // Catch:{ all -> 0x01c3 }
            org.eclipse.jetty.http.i r10 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            if (r9 != 0) goto L_0x00cd
            r9 = 1
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            r10.mo39753l(r4, r9)     // Catch:{ all -> 0x01c3 }
            w5.d r4 = r13.f17908q     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x0068
            r4 = 4
            r3.mo39616X(r4)     // Catch:{ all -> 0x01c3 }
            goto L_0x0068
        L_0x00da:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39718e()     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x00f8
            boolean r4 = r13.f17907p     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x00f8
            e6.c r4 = f17906r     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "requestComplete"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
            r13.f17907p = r8     // Catch:{ all -> 0x01c3 }
            org.eclipse.jetty.client.h r4 = r3.mo39628k()     // Catch:{ all -> 0x01c3 }
            r4.mo39549k()     // Catch:{ all -> 0x01c3 }
        L_0x00f8:
            org.eclipse.jetty.http.m r4 = r13.f17886f     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39839e()     // Catch:{ all -> 0x01c3 }
            if (r4 != 0) goto L_0x0111
            org.eclipse.jetty.http.m r4 = r13.f17886f     // Catch:{ all -> 0x01c3 }
            boolean r4 = r4.mo39836b()     // Catch:{ all -> 0x01c3 }
            if (r4 == 0) goto L_0x0111
            e6.c r4 = f17906r     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "parsed"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01c3 }
            r4.mo36850e(r9, r10)     // Catch:{ all -> 0x01c3 }
        L_0x0111:
            w5.k r4 = r13.f21821b     // Catch:{ all -> 0x01c3 }
            r4.flush()     // Catch:{ all -> 0x01c3 }
            e6.c r3 = f17906r     // Catch:{ all -> 0x0328 }
            java.lang.String r4 = "{} {}"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.i r9 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r5[r0] = r9     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.m r9 = r13.f17886f     // Catch:{ all -> 0x0328 }
            r5[r8] = r9     // Catch:{ all -> 0x0328 }
            r3.mo36850e(r4, r5)     // Catch:{ all -> 0x0328 }
            java.lang.String r4 = "{}"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0328 }
            w5.k r9 = r13.f21821b     // Catch:{ all -> 0x0328 }
            r5[r0] = r9     // Catch:{ all -> 0x0328 }
            r3.mo36850e(r4, r5)     // Catch:{ all -> 0x0328 }
            if (r2 != 0) goto L_0x0147
            org.eclipse.jetty.http.i r3 = r13.f17885e     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39718e()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x0145
            org.eclipse.jetty.http.m r3 = r13.f17886f     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39839e()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r3 = 0
            goto L_0x0148
        L_0x0147:
            r3 = 1
        L_0x0148:
            if (r3 == 0) goto L_0x0003
            if (r2 != 0) goto L_0x015e
            org.eclipse.jetty.http.m r3 = r13.f17886f     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39840f()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x015e
            org.eclipse.jetty.http.i r3 = r13.f17885e     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39719f()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x015e
            r3 = 1
            goto L_0x015f
        L_0x015e:
            r3 = 0
        L_0x015f:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r4.mo39715c(r3)     // Catch:{ all -> 0x0328 }
            r13.mo39526q()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x0179
            w5.k r4 = r13.f21821b     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.HttpDestination r5 = r13.f17884d     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.g r5 = r5.mo39498h()     // Catch:{ all -> 0x0328 }
            long r9 = r5.mo39568T0()     // Catch:{ all -> 0x0328 }
            int r5 = (int) r9     // Catch:{ all -> 0x0328 }
            r4.mo39659i(r5)     // Catch:{ all -> 0x0328 }
        L_0x0179:
            monitor-enter(r13)     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.j r4 = r13.f17891k     // Catch:{ all -> 0x01c0 }
            r13.f17891k = r7     // Catch:{ all -> 0x01c0 }
            if (r4 == 0) goto L_0x0189
            org.eclipse.jetty.client.HttpDestination r5 = r13.f17884d     // Catch:{ all -> 0x01c0 }
            org.eclipse.jetty.client.g r5 = r5.mo39498h()     // Catch:{ all -> 0x01c0 }
            r4.mo39624f(r5)     // Catch:{ all -> 0x01c0 }
        L_0x0189:
            int r5 = r13.f17888h     // Catch:{ all -> 0x01c0 }
            if (r5 != r6) goto L_0x0197
            w5.k r1 = r13.f21821b     // Catch:{ all -> 0x01c0 }
            w5.j r1 = r4.mo39601I(r1)     // Catch:{ all -> 0x01c0 }
            r13.f17892l = r7     // Catch:{ all -> 0x01c0 }
            r13.f17892l = r7     // Catch:{ all -> 0x01c0 }
        L_0x0197:
            org.eclipse.jetty.client.j r4 = r13.f17892l     // Catch:{ all -> 0x01c0 }
            if (r4 == 0) goto L_0x01aa
            if (r3 == 0) goto L_0x01a3
            if (r1 == r13) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            r13.f17891k = r4     // Catch:{ all -> 0x01c0 }
            goto L_0x01a8
        L_0x01a3:
            org.eclipse.jetty.client.HttpDestination r5 = r13.f17884d     // Catch:{ all -> 0x01c0 }
            r5.mo39512u(r4)     // Catch:{ all -> 0x01c0 }
        L_0x01a8:
            r13.f17892l = r7     // Catch:{ all -> 0x01c0 }
        L_0x01aa:
            org.eclipse.jetty.client.j r4 = r13.f17891k     // Catch:{ all -> 0x01c0 }
            if (r4 != 0) goto L_0x01bd
            boolean r4 = r13.mo39525p()     // Catch:{ all -> 0x01c0 }
            if (r4 != 0) goto L_0x01bd
            org.eclipse.jetty.client.HttpDestination r4 = r13.f17884d     // Catch:{ all -> 0x01c0 }
            if (r3 != 0) goto L_0x01b9
            goto L_0x01ba
        L_0x01b9:
            r8 = 0
        L_0x01ba:
            r4.mo39508r(r13, r8)     // Catch:{ all -> 0x01c0 }
        L_0x01bd:
            monitor-exit(r13)     // Catch:{ all -> 0x01c0 }
            goto L_0x0003
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x01c3:
            r4 = move-exception
            e6.c r9 = f17906r     // Catch:{ all -> 0x026a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x026a }
            r10.<init>()     // Catch:{ all -> 0x026a }
            java.lang.String r11 = "Failure on "
            r10.append(r11)     // Catch:{ all -> 0x026a }
            org.eclipse.jetty.client.j r11 = r13.f17891k     // Catch:{ all -> 0x026a }
            r10.append(r11)     // Catch:{ all -> 0x026a }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x026a }
            r9.mo36854h(r10, r4)     // Catch:{ all -> 0x026a }
            monitor-enter(r13)     // Catch:{ all -> 0x0267 }
            int r2 = r3.mo39636s()     // Catch:{ all -> 0x0264 }
            r10 = 10
            if (r2 == r10) goto L_0x0202
            int r2 = r3.mo39636s()     // Catch:{ all -> 0x0264 }
            r10 = 11
            if (r2 == r10) goto L_0x0202
            boolean r2 = r3.mo39641w()     // Catch:{ all -> 0x0264 }
            if (r2 != 0) goto L_0x0202
            r2 = 9
            boolean r2 = r3.mo39616X(r2)     // Catch:{ all -> 0x0264 }
            if (r2 == 0) goto L_0x0202
            org.eclipse.jetty.client.h r2 = r3.mo39628k()     // Catch:{ all -> 0x0264 }
            r2.mo39547i(r4)     // Catch:{ all -> 0x0264 }
        L_0x0202:
            monitor-exit(r13)     // Catch:{ all -> 0x0264 }
            java.lang.String r2 = "{} {}"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r3[r0] = r4     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.m r4 = r13.f17886f     // Catch:{ all -> 0x0328 }
            r3[r8] = r4     // Catch:{ all -> 0x0328 }
            r9.mo36850e(r2, r3)     // Catch:{ all -> 0x0328 }
            java.lang.String r2 = "{}"
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x0328 }
            w5.k r4 = r13.f21821b     // Catch:{ all -> 0x0328 }
            r3[r0] = r4     // Catch:{ all -> 0x0328 }
            r9.mo36850e(r2, r3)     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.i r2 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r2.mo39715c(r0)     // Catch:{ all -> 0x0328 }
            r13.mo39526q()     // Catch:{ all -> 0x0328 }
            monitor-enter(r13)     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.j r2 = r13.f17891k     // Catch:{ all -> 0x0261 }
            r13.f17891k = r7     // Catch:{ all -> 0x0261 }
            if (r2 == 0) goto L_0x0235
            org.eclipse.jetty.client.HttpDestination r3 = r13.f17884d     // Catch:{ all -> 0x0261 }
            org.eclipse.jetty.client.g r3 = r3.mo39498h()     // Catch:{ all -> 0x0261 }
            r2.mo39624f(r3)     // Catch:{ all -> 0x0261 }
        L_0x0235:
            int r3 = r13.f17888h     // Catch:{ all -> 0x0261 }
            if (r3 != r6) goto L_0x0243
            w5.k r1 = r13.f21821b     // Catch:{ all -> 0x0261 }
            w5.j r1 = r2.mo39601I(r1)     // Catch:{ all -> 0x0261 }
            r13.f17892l = r7     // Catch:{ all -> 0x0261 }
            r13.f17892l = r7     // Catch:{ all -> 0x0261 }
        L_0x0243:
            org.eclipse.jetty.client.j r2 = r13.f17892l     // Catch:{ all -> 0x0261 }
            if (r2 == 0) goto L_0x024e
            org.eclipse.jetty.client.HttpDestination r3 = r13.f17884d     // Catch:{ all -> 0x0261 }
            r3.mo39512u(r2)     // Catch:{ all -> 0x0261 }
            r13.f17892l = r7     // Catch:{ all -> 0x0261 }
        L_0x024e:
            org.eclipse.jetty.client.j r2 = r13.f17891k     // Catch:{ all -> 0x0261 }
            if (r2 != 0) goto L_0x025d
            boolean r2 = r13.mo39525p()     // Catch:{ all -> 0x0261 }
            if (r2 != 0) goto L_0x025d
            org.eclipse.jetty.client.HttpDestination r2 = r13.f17884d     // Catch:{ all -> 0x0261 }
            r2.mo39508r(r13, r8)     // Catch:{ all -> 0x0261 }
        L_0x025d:
            monitor-exit(r13)     // Catch:{ all -> 0x0261 }
            r2 = 1
            goto L_0x0003
        L_0x0261:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0261 }
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x0264:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0264 }
            throw r2     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r2 = move-exception
            r3 = 1
            goto L_0x026e
        L_0x026a:
            r3 = move-exception
            r12 = r3
            r3 = r2
            r2 = r12
        L_0x026e:
            e6.c r4 = f17906r     // Catch:{ all -> 0x0328 }
            java.lang.String r9 = "{} {}"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.i r10 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r5[r0] = r10     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.http.m r10 = r13.f17886f     // Catch:{ all -> 0x0328 }
            r5[r8] = r10     // Catch:{ all -> 0x0328 }
            r4.mo36850e(r9, r5)     // Catch:{ all -> 0x0328 }
            java.lang.String r5 = "{}"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0328 }
            w5.k r10 = r13.f21821b     // Catch:{ all -> 0x0328 }
            r9[r0] = r10     // Catch:{ all -> 0x0328 }
            r4.mo36850e(r5, r9)     // Catch:{ all -> 0x0328 }
            if (r3 != 0) goto L_0x029f
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x0328 }
            boolean r4 = r4.mo39718e()     // Catch:{ all -> 0x0328 }
            if (r4 == 0) goto L_0x029d
            org.eclipse.jetty.http.m r4 = r13.f17886f     // Catch:{ all -> 0x0328 }
            boolean r4 = r4.mo39839e()     // Catch:{ all -> 0x0328 }
            if (r4 == 0) goto L_0x029d
            goto L_0x029f
        L_0x029d:
            r4 = 0
            goto L_0x02a0
        L_0x029f:
            r4 = 1
        L_0x02a0:
            if (r4 == 0) goto L_0x0319
            if (r3 != 0) goto L_0x02b6
            org.eclipse.jetty.http.m r3 = r13.f17886f     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39840f()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x02b6
            org.eclipse.jetty.http.i r3 = r13.f17885e     // Catch:{ all -> 0x0328 }
            boolean r3 = r3.mo39719f()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x02b6
            r3 = 1
            goto L_0x02b7
        L_0x02b6:
            r3 = 0
        L_0x02b7:
            org.eclipse.jetty.http.i r4 = r13.f17885e     // Catch:{ all -> 0x0328 }
            r4.mo39715c(r3)     // Catch:{ all -> 0x0328 }
            r13.mo39526q()     // Catch:{ all -> 0x0328 }
            if (r3 == 0) goto L_0x02d1
            w5.k r4 = r13.f21821b     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.HttpDestination r5 = r13.f17884d     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.g r5 = r5.mo39498h()     // Catch:{ all -> 0x0328 }
            long r9 = r5.mo39568T0()     // Catch:{ all -> 0x0328 }
            int r5 = (int) r9     // Catch:{ all -> 0x0328 }
            r4.mo39659i(r5)     // Catch:{ all -> 0x0328 }
        L_0x02d1:
            monitor-enter(r13)     // Catch:{ all -> 0x0328 }
            org.eclipse.jetty.client.j r4 = r13.f17891k     // Catch:{ all -> 0x0316 }
            r13.f17891k = r7     // Catch:{ all -> 0x0316 }
            if (r4 == 0) goto L_0x02e1
            org.eclipse.jetty.client.HttpDestination r5 = r13.f17884d     // Catch:{ all -> 0x0316 }
            org.eclipse.jetty.client.g r5 = r5.mo39498h()     // Catch:{ all -> 0x0316 }
            r4.mo39624f(r5)     // Catch:{ all -> 0x0316 }
        L_0x02e1:
            int r5 = r13.f17888h     // Catch:{ all -> 0x0316 }
            if (r5 != r6) goto L_0x02ef
            w5.k r1 = r13.f21821b     // Catch:{ all -> 0x0316 }
            w5.j r1 = r4.mo39601I(r1)     // Catch:{ all -> 0x0316 }
            r13.f17892l = r7     // Catch:{ all -> 0x0316 }
            r13.f17892l = r7     // Catch:{ all -> 0x0316 }
        L_0x02ef:
            org.eclipse.jetty.client.j r4 = r13.f17892l     // Catch:{ all -> 0x0316 }
            if (r4 == 0) goto L_0x0302
            if (r3 == 0) goto L_0x02fb
            if (r1 == r13) goto L_0x02f8
            goto L_0x02fb
        L_0x02f8:
            r13.f17891k = r4     // Catch:{ all -> 0x0316 }
            goto L_0x0300
        L_0x02fb:
            org.eclipse.jetty.client.HttpDestination r1 = r13.f17884d     // Catch:{ all -> 0x0316 }
            r1.mo39512u(r4)     // Catch:{ all -> 0x0316 }
        L_0x0300:
            r13.f17892l = r7     // Catch:{ all -> 0x0316 }
        L_0x0302:
            org.eclipse.jetty.client.j r1 = r13.f17891k     // Catch:{ all -> 0x0316 }
            if (r1 != 0) goto L_0x0314
            boolean r1 = r13.mo39525p()     // Catch:{ all -> 0x0316 }
            if (r1 != 0) goto L_0x0314
            org.eclipse.jetty.client.HttpDestination r1 = r13.f17884d     // Catch:{ all -> 0x0316 }
            if (r3 != 0) goto L_0x0311
            r0 = 1
        L_0x0311:
            r1.mo39508r(r13, r0)     // Catch:{ all -> 0x0316 }
        L_0x0314:
            monitor-exit(r13)     // Catch:{ all -> 0x0316 }
            goto L_0x0319
        L_0x0316:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0316 }
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x0319:
            throw r2     // Catch:{ all -> 0x0328 }
        L_0x031a:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x031a }
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x031d:
            org.eclipse.jetty.http.m r0 = r13.f17886f
            r0.mo39838d()
            org.eclipse.jetty.http.i r0 = r13.f17885e
            r0.mo39717d()
            return r1
        L_0x0328:
            r0 = move-exception
            org.eclipse.jetty.http.m r1 = r13.f17886f
            r1.mo39838d()
            org.eclipse.jetty.http.i r1 = r13.f17885e
            r1.mo39717d()
            goto L_0x0335
        L_0x0334:
            throw r0
        L_0x0335:
            goto L_0x0334
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.C9868d.mo39556c():w5.j");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo39526q() {
        this.f17907p = false;
        super.mo39526q();
    }

    /* renamed from: r */
    public boolean mo39527r(C9877j jVar) {
        boolean r = super.mo39527r(jVar);
        if (r) {
            synchronized (this) {
                notifyAll();
            }
        }
        return r;
    }
}
