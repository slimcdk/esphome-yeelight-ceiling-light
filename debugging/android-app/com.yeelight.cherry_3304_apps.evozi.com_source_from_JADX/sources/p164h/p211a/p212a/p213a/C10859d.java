package p164h.p211a.p212a.p213a;

import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.d */
public class C10859d extends C10852a {

    /* renamed from: r */
    private static final C11158c f20954r = C11156b.m29015a(C10859d.class);

    /* renamed from: p */
    private boolean f20955p;

    /* renamed from: q */
    private C10929e f20956q;

    C10859d(C10935i iVar, C10935i iVar2, C10942n nVar) {
        super(iVar, iVar2, nVar);
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
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0003 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0150 A[Catch:{ all -> 0x0370 }] */
    /* renamed from: c */
    public p164h.p211a.p212a.p217d.C10941m mo34225c() {
        /*
            r13 = this;
            r0 = 0
            r2 = 0
            r1 = r13
        L_0x0003:
            h.a.a.d.n r3 = r13.f21308b     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.isOpen()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x0365
            if (r1 != r13) goto L_0x0365
            h.a.a.h.y.c r3 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r4 = "open={} more={}"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0370 }
            h.a.a.d.n r7 = r13.f21308b     // Catch:{ all -> 0x0370 }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x0370 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0370 }
            r6[r0] = r7     // Catch:{ all -> 0x0370 }
            h.a.a.c.n r7 = r13.f20934f     // Catch:{ all -> 0x0370 }
            boolean r7 = r7.mo34526n()     // Catch:{ all -> 0x0370 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0370 }
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x0370 }
            r3.mo35489e(r4, r6)     // Catch:{ all -> 0x0370 }
            monitor-enter(r13)     // Catch:{ all -> 0x0370 }
            h.a.a.a.k r3 = r13.f20939k     // Catch:{ all -> 0x0362 }
        L_0x0033:
            if (r3 != 0) goto L_0x0041
            r13.wait()     // Catch:{ InterruptedException -> 0x003b }
            h.a.a.a.k r3 = r13.f20939k     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x0033
        L_0x003b:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0362 }
            r0.<init>()     // Catch:{ all -> 0x0362 }
            throw r0     // Catch:{ all -> 0x0362 }
        L_0x0041:
            monitor-exit(r13)     // Catch:{ all -> 0x0362 }
            h.a.a.h.y.c r4 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r6 = "exchange {}"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0370 }
            r7[r0] = r3     // Catch:{ all -> 0x0370 }
            r4.mo35489e(r6, r7)     // Catch:{ all -> 0x0370 }
            r4 = 101(0x65, float:1.42E-43)
            r6 = 0
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34399g()     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            int r7 = r3.mo34335s()     // Catch:{ all -> 0x01d4 }
            if (r7 != r5) goto L_0x006c
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "commit"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
            r13.mo34190n()     // Catch:{ all -> 0x01d4 }
        L_0x006c:
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34399g()     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x00de
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34397e()     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x00de
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            int r7 = r7.mo34402j()     // Catch:{ all -> 0x01d4 }
            if (r7 <= 0) goto L_0x008d
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "flushed"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
        L_0x008d:
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34388A(r5)     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x006c
            h.a.a.d.e r7 = r13.f20956q     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x009f
            h.a.a.d.e r7 = r3.mo34330n(r6)     // Catch:{ all -> 0x01d4 }
            r13.f20956q = r7     // Catch:{ all -> 0x01d4 }
        L_0x009f:
            h.a.a.d.e r7 = r13.f20956q     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x00b2
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "complete"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            r7.complete()     // Catch:{ all -> 0x01d4 }
            goto L_0x006c
        L_0x00b2:
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34508F()     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x006c
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "addChunk"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
            h.a.a.d.e r7 = r13.f20956q     // Catch:{ all -> 0x01d4 }
            h.a.a.d.e r9 = r3.mo34330n(r6)     // Catch:{ all -> 0x01d4 }
            r13.f20956q = r9     // Catch:{ all -> 0x01d4 }
            h.a.a.c.j r10 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            if (r9 != 0) goto L_0x00d1
            r9 = 1
            goto L_0x00d2
        L_0x00d1:
            r9 = 0
        L_0x00d2:
            r10.mo34432o(r7, r9)     // Catch:{ all -> 0x01d4 }
            h.a.a.d.e r7 = r13.f20956q     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x006c
            r7 = 4
            r3.mo34315X(r7)     // Catch:{ all -> 0x01d4 }
            goto L_0x006c
        L_0x00de:
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34397e()     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x00fc
            boolean r7 = r13.f20955p     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x00fc
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "requestComplete"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
            r13.f20955p = r8     // Catch:{ all -> 0x01d4 }
            h.a.a.a.i r7 = r3.mo34327k()     // Catch:{ all -> 0x01d4 }
            r7.mo34218k()     // Catch:{ all -> 0x01d4 }
        L_0x00fc:
            h.a.a.c.n r7 = r13.f20934f     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34517e()     // Catch:{ all -> 0x01d4 }
            if (r7 != 0) goto L_0x0115
            h.a.a.c.n r7 = r13.f20934f     // Catch:{ all -> 0x01d4 }
            boolean r7 = r7.mo34514b()     // Catch:{ all -> 0x01d4 }
            if (r7 == 0) goto L_0x0115
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = "parsed"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x01d4 }
            r7.mo35489e(r9, r10)     // Catch:{ all -> 0x01d4 }
        L_0x0115:
            h.a.a.d.n r7 = r13.f21308b     // Catch:{ all -> 0x01d4 }
            r7.flush()     // Catch:{ all -> 0x01d4 }
            h.a.a.h.y.c r3 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r7 = "{} {}"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0370 }
            h.a.a.c.j r9 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r5[r0] = r9     // Catch:{ all -> 0x0370 }
            h.a.a.c.n r9 = r13.f20934f     // Catch:{ all -> 0x0370 }
            r5[r8] = r9     // Catch:{ all -> 0x0370 }
            r3.mo35489e(r7, r5)     // Catch:{ all -> 0x0370 }
            h.a.a.h.y.c r3 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r5 = "{}"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0370 }
            h.a.a.d.n r9 = r13.f21308b     // Catch:{ all -> 0x0370 }
            r7[r0] = r9     // Catch:{ all -> 0x0370 }
            r3.mo35489e(r5, r7)     // Catch:{ all -> 0x0370 }
            if (r2 != 0) goto L_0x014d
            h.a.a.c.j r3 = r13.f20933e     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34397e()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x014b
            h.a.a.c.n r3 = r13.f20934f     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34517e()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r3 = 0
            goto L_0x014e
        L_0x014d:
            r3 = 1
        L_0x014e:
            if (r3 == 0) goto L_0x0003
            if (r2 != 0) goto L_0x0164
            h.a.a.c.n r3 = r13.f20934f     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34518f()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x0164
            h.a.a.c.j r3 = r13.f20933e     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34398f()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x0164
            r3 = 1
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            h.a.a.c.j r5 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r5.mo34394c(r3)     // Catch:{ all -> 0x0370 }
            r13.mo34194q()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x017f
            h.a.a.d.n r5 = r13.f21308b     // Catch:{ all -> 0x0370 }
            h.a.a.a.h r7 = r13.f20932d     // Catch:{ all -> 0x0370 }
            h.a.a.a.g r7 = r7.mo34272h()     // Catch:{ all -> 0x0370 }
            long r9 = r7.mo34237O0()     // Catch:{ all -> 0x0370 }
            int r7 = (int) r9     // Catch:{ all -> 0x0370 }
            r5.mo34360j(r7)     // Catch:{ all -> 0x0370 }
        L_0x017f:
            monitor-enter(r13)     // Catch:{ all -> 0x0370 }
            h.a.a.a.k r5 = r13.f20939k     // Catch:{ all -> 0x01d1 }
            r13.f20939k = r6     // Catch:{ all -> 0x01d1 }
            if (r5 == 0) goto L_0x018f
            h.a.a.a.h r7 = r13.f20932d     // Catch:{ all -> 0x01d1 }
            h.a.a.a.g r7 = r7.mo34272h()     // Catch:{ all -> 0x01d1 }
            r5.mo34323f(r7)     // Catch:{ all -> 0x01d1 }
        L_0x018f:
            int r7 = r13.f20936h     // Catch:{ all -> 0x01d1 }
            if (r7 != r4) goto L_0x01a4
            h.a.a.d.n r1 = r13.f21308b     // Catch:{ all -> 0x01d1 }
            h.a.a.d.m r1 = r5.mo34300I(r1)     // Catch:{ all -> 0x01d1 }
            r13.f20940l = r6     // Catch:{ all -> 0x01d1 }
            if (r6 == 0) goto L_0x01a2
            h.a.a.a.h r4 = r13.f20932d     // Catch:{ all -> 0x01d1 }
            r4.mo34286u(r6)     // Catch:{ all -> 0x01d1 }
        L_0x01a2:
            r13.f20940l = r6     // Catch:{ all -> 0x01d1 }
        L_0x01a4:
            h.a.a.a.k r4 = r13.f20940l     // Catch:{ all -> 0x01d1 }
            if (r4 == 0) goto L_0x01bb
            if (r3 == 0) goto L_0x01b2
            if (r1 == r13) goto L_0x01ad
            goto L_0x01b2
        L_0x01ad:
            h.a.a.a.k r4 = r13.f20940l     // Catch:{ all -> 0x01d1 }
            r13.f20939k = r4     // Catch:{ all -> 0x01d1 }
            goto L_0x01b9
        L_0x01b2:
            h.a.a.a.h r4 = r13.f20932d     // Catch:{ all -> 0x01d1 }
            h.a.a.a.k r5 = r13.f20940l     // Catch:{ all -> 0x01d1 }
            r4.mo34286u(r5)     // Catch:{ all -> 0x01d1 }
        L_0x01b9:
            r13.f20940l = r6     // Catch:{ all -> 0x01d1 }
        L_0x01bb:
            h.a.a.a.k r4 = r13.f20939k     // Catch:{ all -> 0x01d1 }
            if (r4 != 0) goto L_0x01ce
            boolean r4 = r13.mo34193p()     // Catch:{ all -> 0x01d1 }
            if (r4 != 0) goto L_0x01ce
            h.a.a.a.h r4 = r13.f20932d     // Catch:{ all -> 0x01d1 }
            if (r3 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r8 = 0
        L_0x01cb:
            r4.mo34282r(r13, r8)     // Catch:{ all -> 0x01d1 }
        L_0x01ce:
            monitor-exit(r13)     // Catch:{ all -> 0x01d1 }
            goto L_0x0003
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01d1 }
            throw r0     // Catch:{ all -> 0x0370 }
        L_0x01d4:
            r7 = move-exception
            h.a.a.h.y.c r9 = f20954r     // Catch:{ all -> 0x02a5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a5 }
            r10.<init>()     // Catch:{ all -> 0x02a5 }
            java.lang.String r11 = "Failure on "
            r10.append(r11)     // Catch:{ all -> 0x02a5 }
            h.a.a.a.k r11 = r13.f20939k     // Catch:{ all -> 0x02a5 }
            r10.append(r11)     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x02a5 }
            r9.mo35493i(r10, r7)     // Catch:{ all -> 0x02a5 }
            monitor-enter(r13)     // Catch:{ all -> 0x02a2 }
            if (r3 == 0) goto L_0x0284
            int r2 = r3.mo34335s()     // Catch:{ all -> 0x029f }
            r9 = 10
            if (r2 == r9) goto L_0x0215
            int r2 = r3.mo34335s()     // Catch:{ all -> 0x029f }
            r9 = 11
            if (r2 == r9) goto L_0x0215
            boolean r2 = r3.mo34340w()     // Catch:{ all -> 0x029f }
            if (r2 != 0) goto L_0x0215
            r2 = 9
            boolean r2 = r3.mo34315X(r2)     // Catch:{ all -> 0x029f }
            if (r2 == 0) goto L_0x0215
            h.a.a.a.i r2 = r3.mo34327k()     // Catch:{ all -> 0x029f }
            r2.mo34215h(r7)     // Catch:{ all -> 0x029f }
        L_0x0215:
            monitor-exit(r13)     // Catch:{ all -> 0x029f }
            h.a.a.h.y.c r2 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = "{} {}"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0370 }
            h.a.a.c.j r7 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r5[r0] = r7     // Catch:{ all -> 0x0370 }
            h.a.a.c.n r7 = r13.f20934f     // Catch:{ all -> 0x0370 }
            r5[r8] = r7     // Catch:{ all -> 0x0370 }
            r2.mo35489e(r3, r5)     // Catch:{ all -> 0x0370 }
            h.a.a.h.y.c r2 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r3 = "{}"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0370 }
            h.a.a.d.n r7 = r13.f21308b     // Catch:{ all -> 0x0370 }
            r5[r0] = r7     // Catch:{ all -> 0x0370 }
            r2.mo35489e(r3, r5)     // Catch:{ all -> 0x0370 }
            h.a.a.c.j r2 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r2.mo34394c(r0)     // Catch:{ all -> 0x0370 }
            r13.mo34194q()     // Catch:{ all -> 0x0370 }
            monitor-enter(r13)     // Catch:{ all -> 0x0370 }
            h.a.a.a.k r2 = r13.f20939k     // Catch:{ all -> 0x0281 }
            r13.f20939k = r6     // Catch:{ all -> 0x0281 }
            if (r2 == 0) goto L_0x024c
            h.a.a.a.h r3 = r13.f20932d     // Catch:{ all -> 0x0281 }
            h.a.a.a.g r3 = r3.mo34272h()     // Catch:{ all -> 0x0281 }
            r2.mo34323f(r3)     // Catch:{ all -> 0x0281 }
        L_0x024c:
            int r3 = r13.f20936h     // Catch:{ all -> 0x0281 }
            if (r3 != r4) goto L_0x0261
            h.a.a.d.n r1 = r13.f21308b     // Catch:{ all -> 0x0281 }
            h.a.a.d.m r1 = r2.mo34300I(r1)     // Catch:{ all -> 0x0281 }
            r13.f20940l = r6     // Catch:{ all -> 0x0281 }
            if (r6 == 0) goto L_0x025f
            h.a.a.a.h r2 = r13.f20932d     // Catch:{ all -> 0x0281 }
            r2.mo34286u(r6)     // Catch:{ all -> 0x0281 }
        L_0x025f:
            r13.f20940l = r6     // Catch:{ all -> 0x0281 }
        L_0x0261:
            h.a.a.a.k r2 = r13.f20940l     // Catch:{ all -> 0x0281 }
            if (r2 == 0) goto L_0x026e
            h.a.a.a.h r2 = r13.f20932d     // Catch:{ all -> 0x0281 }
            h.a.a.a.k r3 = r13.f20940l     // Catch:{ all -> 0x0281 }
            r2.mo34286u(r3)     // Catch:{ all -> 0x0281 }
            r13.f20940l = r6     // Catch:{ all -> 0x0281 }
        L_0x026e:
            h.a.a.a.k r2 = r13.f20939k     // Catch:{ all -> 0x0281 }
            if (r2 != 0) goto L_0x027d
            boolean r2 = r13.mo34193p()     // Catch:{ all -> 0x0281 }
            if (r2 != 0) goto L_0x027d
            h.a.a.a.h r2 = r13.f20932d     // Catch:{ all -> 0x0281 }
            r2.mo34282r(r13, r8)     // Catch:{ all -> 0x0281 }
        L_0x027d:
            monitor-exit(r13)     // Catch:{ all -> 0x0281 }
            r2 = 1
            goto L_0x0003
        L_0x0281:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0281 }
            throw r0     // Catch:{ all -> 0x0370 }
        L_0x0284:
            boolean r2 = r7 instanceof java.io.IOException     // Catch:{ all -> 0x029f }
            if (r2 != 0) goto L_0x029c
            boolean r2 = r7 instanceof java.lang.Error     // Catch:{ all -> 0x029f }
            if (r2 != 0) goto L_0x0299
            boolean r2 = r7 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x029f }
            if (r2 == 0) goto L_0x0293
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7     // Catch:{ all -> 0x029f }
            throw r7     // Catch:{ all -> 0x029f }
        L_0x0293:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x029f }
            r2.<init>(r7)     // Catch:{ all -> 0x029f }
            throw r2     // Catch:{ all -> 0x029f }
        L_0x0299:
            java.lang.Error r7 = (java.lang.Error) r7     // Catch:{ all -> 0x029f }
            throw r7     // Catch:{ all -> 0x029f }
        L_0x029c:
            java.io.IOException r7 = (java.io.IOException) r7     // Catch:{ all -> 0x029f }
            throw r7     // Catch:{ all -> 0x029f }
        L_0x029f:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x029f }
            throw r2     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r2 = move-exception
            r3 = 1
            goto L_0x02a9
        L_0x02a5:
            r3 = move-exception
            r12 = r3
            r3 = r2
            r2 = r12
        L_0x02a9:
            h.a.a.h.y.c r7 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r9 = "{} {}"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0370 }
            h.a.a.c.j r10 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r5[r0] = r10     // Catch:{ all -> 0x0370 }
            h.a.a.c.n r10 = r13.f20934f     // Catch:{ all -> 0x0370 }
            r5[r8] = r10     // Catch:{ all -> 0x0370 }
            r7.mo35489e(r9, r5)     // Catch:{ all -> 0x0370 }
            h.a.a.h.y.c r5 = f20954r     // Catch:{ all -> 0x0370 }
            java.lang.String r7 = "{}"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0370 }
            h.a.a.d.n r10 = r13.f21308b     // Catch:{ all -> 0x0370 }
            r9[r0] = r10     // Catch:{ all -> 0x0370 }
            r5.mo35489e(r7, r9)     // Catch:{ all -> 0x0370 }
            if (r3 != 0) goto L_0x02dc
            h.a.a.c.j r5 = r13.f20933e     // Catch:{ all -> 0x0370 }
            boolean r5 = r5.mo34397e()     // Catch:{ all -> 0x0370 }
            if (r5 == 0) goto L_0x02da
            h.a.a.c.n r5 = r13.f20934f     // Catch:{ all -> 0x0370 }
            boolean r5 = r5.mo34517e()     // Catch:{ all -> 0x0370 }
            if (r5 == 0) goto L_0x02da
            goto L_0x02dc
        L_0x02da:
            r5 = 0
            goto L_0x02dd
        L_0x02dc:
            r5 = 1
        L_0x02dd:
            if (r5 == 0) goto L_0x0361
            if (r3 != 0) goto L_0x02f3
            h.a.a.c.n r3 = r13.f20934f     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34518f()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x02f3
            h.a.a.c.j r3 = r13.f20933e     // Catch:{ all -> 0x0370 }
            boolean r3 = r3.mo34398f()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x02f3
            r3 = 1
            goto L_0x02f4
        L_0x02f3:
            r3 = 0
        L_0x02f4:
            h.a.a.c.j r5 = r13.f20933e     // Catch:{ all -> 0x0370 }
            r5.mo34394c(r3)     // Catch:{ all -> 0x0370 }
            r13.mo34194q()     // Catch:{ all -> 0x0370 }
            if (r3 == 0) goto L_0x030e
            h.a.a.d.n r5 = r13.f21308b     // Catch:{ all -> 0x0370 }
            h.a.a.a.h r7 = r13.f20932d     // Catch:{ all -> 0x0370 }
            h.a.a.a.g r7 = r7.mo34272h()     // Catch:{ all -> 0x0370 }
            long r9 = r7.mo34237O0()     // Catch:{ all -> 0x0370 }
            int r7 = (int) r9     // Catch:{ all -> 0x0370 }
            r5.mo34360j(r7)     // Catch:{ all -> 0x0370 }
        L_0x030e:
            monitor-enter(r13)     // Catch:{ all -> 0x0370 }
            h.a.a.a.k r5 = r13.f20939k     // Catch:{ all -> 0x035e }
            r13.f20939k = r6     // Catch:{ all -> 0x035e }
            if (r5 == 0) goto L_0x031e
            h.a.a.a.h r7 = r13.f20932d     // Catch:{ all -> 0x035e }
            h.a.a.a.g r7 = r7.mo34272h()     // Catch:{ all -> 0x035e }
            r5.mo34323f(r7)     // Catch:{ all -> 0x035e }
        L_0x031e:
            int r7 = r13.f20936h     // Catch:{ all -> 0x035e }
            if (r7 != r4) goto L_0x0333
            h.a.a.d.n r1 = r13.f21308b     // Catch:{ all -> 0x035e }
            h.a.a.d.m r1 = r5.mo34300I(r1)     // Catch:{ all -> 0x035e }
            r13.f20940l = r6     // Catch:{ all -> 0x035e }
            if (r6 == 0) goto L_0x0331
            h.a.a.a.h r4 = r13.f20932d     // Catch:{ all -> 0x035e }
            r4.mo34286u(r6)     // Catch:{ all -> 0x035e }
        L_0x0331:
            r13.f20940l = r6     // Catch:{ all -> 0x035e }
        L_0x0333:
            h.a.a.a.k r4 = r13.f20940l     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x034a
            if (r3 == 0) goto L_0x0341
            if (r1 == r13) goto L_0x033c
            goto L_0x0341
        L_0x033c:
            h.a.a.a.k r1 = r13.f20940l     // Catch:{ all -> 0x035e }
            r13.f20939k = r1     // Catch:{ all -> 0x035e }
            goto L_0x0348
        L_0x0341:
            h.a.a.a.h r1 = r13.f20932d     // Catch:{ all -> 0x035e }
            h.a.a.a.k r4 = r13.f20940l     // Catch:{ all -> 0x035e }
            r1.mo34286u(r4)     // Catch:{ all -> 0x035e }
        L_0x0348:
            r13.f20940l = r6     // Catch:{ all -> 0x035e }
        L_0x034a:
            h.a.a.a.k r1 = r13.f20939k     // Catch:{ all -> 0x035e }
            if (r1 != 0) goto L_0x035c
            boolean r1 = r13.mo34193p()     // Catch:{ all -> 0x035e }
            if (r1 != 0) goto L_0x035c
            h.a.a.a.h r1 = r13.f20932d     // Catch:{ all -> 0x035e }
            if (r3 != 0) goto L_0x0359
            r0 = 1
        L_0x0359:
            r1.mo34282r(r13, r0)     // Catch:{ all -> 0x035e }
        L_0x035c:
            monitor-exit(r13)     // Catch:{ all -> 0x035e }
            goto L_0x0361
        L_0x035e:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x035e }
            throw r0     // Catch:{ all -> 0x0370 }
        L_0x0361:
            throw r2     // Catch:{ all -> 0x0370 }
        L_0x0362:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0362 }
            throw r0     // Catch:{ all -> 0x0370 }
        L_0x0365:
            h.a.a.c.n r0 = r13.f20934f
            r0.mo34516d()
            h.a.a.c.j r0 = r13.f20933e
            r0.mo34396d()
            return r1
        L_0x0370:
            r0 = move-exception
            h.a.a.c.n r1 = r13.f20934f
            r1.mo34516d()
            h.a.a.c.j r1 = r13.f20933e
            r1.mo34396d()
            goto L_0x037d
        L_0x037c:
            throw r0
        L_0x037d:
            goto L_0x037c
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p213a.C10859d.mo34225c():h.a.a.d.m");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo34194q() {
        this.f20955p = false;
        super.mo34194q();
    }

    /* renamed from: r */
    public boolean mo34195r(C10871k kVar) {
        boolean r = super.mo34195r(kVar);
        if (r) {
            synchronized (this) {
                notifyAll();
            }
        }
        return r;
    }
}
