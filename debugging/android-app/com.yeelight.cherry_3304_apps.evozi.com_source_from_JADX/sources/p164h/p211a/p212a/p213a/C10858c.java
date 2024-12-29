package p164h.p211a.p212a.p213a;

import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.p219v.C10954a;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.c */
public class C10858c extends C10852a implements C10954a {

    /* renamed from: s */
    private static final C11158c f20950s = C11156b.m29015a(C10858c.class);

    /* renamed from: p */
    private boolean f20951p;

    /* renamed from: q */
    private C10929e f20952q;

    /* renamed from: r */
    private final C10928d f20953r;

    C10858c(C10935i iVar, C10935i iVar2, C10942n nVar) {
        super(iVar, iVar2, nVar);
        this.f20953r = (C10928d) nVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0166 A[Catch:{ all -> 0x037f }] */
    /* renamed from: c */
    public p164h.p211a.p212a.p217d.C10941m mo34225c() {
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
            if (r0 == 0) goto L_0x039c
            if (r4 != r1) goto L_0x039c
            h.a.a.h.y.c r7 = f20950s     // Catch:{ all -> 0x037f }
            java.lang.String r8 = "while open={} more={} progress={}"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x037f }
            h.a.a.d.n r11 = r1.f21308b     // Catch:{ all -> 0x037f }
            boolean r11 = r11.isOpen()     // Catch:{ all -> 0x037f }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x037f }
            r10[r2] = r11     // Catch:{ all -> 0x037f }
            h.a.a.c.n r11 = r1.f20934f     // Catch:{ all -> 0x037f }
            boolean r11 = r11.mo34526n()     // Catch:{ all -> 0x037f }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x037f }
            r10[r3] = r11     // Catch:{ all -> 0x037f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x037f }
            r10[r6] = r0     // Catch:{ all -> 0x037f }
            r7.mo35489e(r8, r10)     // Catch:{ all -> 0x037f }
            h.a.a.a.k r7 = r1.f20939k     // Catch:{ all -> 0x037f }
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x037f }
            java.lang.String r8 = "exchange {} on {}"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x037f }
            r10[r2] = r7     // Catch:{ all -> 0x037f }
            r10[r3] = r1     // Catch:{ all -> 0x037f }
            r0.mo35489e(r8, r10)     // Catch:{ all -> 0x037f }
            r8 = 101(0x65, float:1.42E-43)
            r10 = 4
            r11 = 0
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f4 }
            boolean r0 = r0.mo34399g()     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x006b
            if (r7 == 0) goto L_0x006b
            int r0 = r7.mo34335s()     // Catch:{ all -> 0x01f4 }
            if (r0 != r6) goto L_0x006b
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f4 }
            java.lang.String r12 = "commit {}"
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f4 }
            r13[r2] = r7     // Catch:{ all -> 0x01f4 }
            r0.mo35489e(r12, r13)     // Catch:{ all -> 0x01f4 }
            r16.mo34190n()     // Catch:{ all -> 0x0067 }
            r12 = 1
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            r12 = 1
            goto L_0x01f6
        L_0x006b:
            r12 = 0
        L_0x006c:
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34399g()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x00e1
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34397e()     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x00e1
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            int r0 = r0.mo34402j()     // Catch:{ all -> 0x01f2 }
            if (r0 <= 0) goto L_0x008e
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "flushed"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            r12 = 1
        L_0x008e:
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34388A(r6)     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x00e1
            h.a.a.d.e r0 = r1.f20952q     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x00a0
            h.a.a.d.e r0 = r7.mo34330n(r11)     // Catch:{ all -> 0x01f2 }
            r1.f20952q = r0     // Catch:{ all -> 0x01f2 }
        L_0x00a0:
            h.a.a.d.e r0 = r1.f20952q     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x00b6
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "complete {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f2 }
            r14[r2] = r7     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x0067 }
            r0.complete()     // Catch:{ all -> 0x0067 }
        L_0x00b4:
            r12 = 1
            goto L_0x00e1
        L_0x00b6:
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34508F()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x00e1
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "addChunk"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            h.a.a.d.e r0 = r1.f20952q     // Catch:{ all -> 0x0067 }
            h.a.a.d.e r12 = r7.mo34330n(r11)     // Catch:{ all -> 0x0067 }
            r1.f20952q = r12     // Catch:{ all -> 0x0067 }
            h.a.a.c.j r13 = r1.f20933e     // Catch:{ all -> 0x0067 }
            if (r12 != 0) goto L_0x00d5
            r12 = 1
            goto L_0x00d6
        L_0x00d5:
            r12 = 0
        L_0x00d6:
            r13.mo34432o(r0, r12)     // Catch:{ all -> 0x0067 }
            h.a.a.d.e r0 = r1.f20952q     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x00b4
            r7.mo34315X(r10)     // Catch:{ all -> 0x0067 }
            goto L_0x00b4
        L_0x00e1:
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34397e()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x0102
            boolean r0 = r1.f20951p     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x0102
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "requestComplete {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f2 }
            r14[r2] = r7     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            r1.f20951p = r3     // Catch:{ all -> 0x0067 }
            h.a.a.a.i r0 = r7.mo34327k()     // Catch:{ all -> 0x0067 }
            r0.mo34218k()     // Catch:{ all -> 0x0067 }
            r12 = 1
        L_0x0102:
            h.a.a.c.n r0 = r1.f20934f     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34517e()     // Catch:{ all -> 0x01f2 }
            if (r0 != 0) goto L_0x011e
            h.a.a.c.n r0 = r1.f20934f     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34514b()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x011e
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "parsed {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f2 }
            r14[r2] = r7     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            r12 = 1
        L_0x011e:
            h.a.a.d.n r0 = r1.f21308b     // Catch:{ all -> 0x01f2 }
            r0.flush()     // Catch:{ all -> 0x01f2 }
            h.a.a.d.d r0 = r1.f20953r     // Catch:{ all -> 0x01f2 }
            boolean r0 = r0.mo34352d()     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x0137
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "hasProgressed {}"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f2 }
            r14[r2] = r7     // Catch:{ all -> 0x01f2 }
            r0.mo35489e(r13, r14)     // Catch:{ all -> 0x01f2 }
            r12 = 1
        L_0x0137:
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x037f }
            java.lang.String r13 = "finally {} on {} progress={} {}"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x037f }
            r10[r2] = r7     // Catch:{ all -> 0x037f }
            r10[r3] = r1     // Catch:{ all -> 0x037f }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x037f }
            r10[r6] = r7     // Catch:{ all -> 0x037f }
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x037f }
            r10[r9] = r7     // Catch:{ all -> 0x037f }
            r0.mo35489e(r13, r10)     // Catch:{ all -> 0x037f }
            if (r5 != 0) goto L_0x0163
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x037f }
            boolean r0 = r0.mo34397e()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x0161
            h.a.a.c.n r0 = r1.f20934f     // Catch:{ all -> 0x037f }
            boolean r0 = r0.mo34517e()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r0 = 0
            goto L_0x0164
        L_0x0163:
            r0 = 1
        L_0x0164:
            if (r0 == 0) goto L_0x01ef
            if (r5 != 0) goto L_0x017a
            h.a.a.c.n r0 = r1.f20934f     // Catch:{ all -> 0x037f }
            boolean r0 = r0.mo34518f()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x017a
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x037f }
            boolean r0 = r0.mo34398f()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x017a
            r0 = 1
            goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            h.a.a.c.j r7 = r1.f20933e     // Catch:{ all -> 0x037f }
            r7.mo34394c(r0)     // Catch:{ all -> 0x037f }
            r16.mo34194q()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x0195
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x037f }
            h.a.a.a.h r9 = r1.f20932d     // Catch:{ all -> 0x037f }
            h.a.a.a.g r9 = r9.mo34272h()     // Catch:{ all -> 0x037f }
            long r9 = r9.mo34237O0()     // Catch:{ all -> 0x037f }
            int r10 = (int) r9     // Catch:{ all -> 0x037f }
            r7.mo34360j(r10)     // Catch:{ all -> 0x037f }
        L_0x0195:
            monitor-enter(r16)     // Catch:{ all -> 0x037f }
            h.a.a.a.k r7 = r1.f20939k     // Catch:{ all -> 0x01ec }
            r1.f20939k = r11     // Catch:{ all -> 0x01ec }
            if (r7 == 0) goto L_0x01a5
            h.a.a.a.h r9 = r1.f20932d     // Catch:{ all -> 0x01ec }
            h.a.a.a.g r9 = r9.mo34272h()     // Catch:{ all -> 0x01ec }
            r7.mo34323f(r9)     // Catch:{ all -> 0x01ec }
        L_0x01a5:
            int r9 = r1.f20936h     // Catch:{ all -> 0x01ec }
            if (r9 != r8) goto L_0x01bf
            h.a.a.d.n r8 = r1.f21308b     // Catch:{ all -> 0x01ec }
            h.a.a.d.m r7 = r7.mo34300I(r8)     // Catch:{ all -> 0x01ec }
            if (r7 == 0) goto L_0x01bf
            h.a.a.a.k r4 = r1.f20940l     // Catch:{ all -> 0x01ec }
            if (r4 == 0) goto L_0x01bc
            h.a.a.a.h r4 = r1.f20932d     // Catch:{ all -> 0x01ec }
            h.a.a.a.k r8 = r1.f20940l     // Catch:{ all -> 0x01ec }
            r4.mo34286u(r8)     // Catch:{ all -> 0x01ec }
        L_0x01bc:
            r1.f20940l = r11     // Catch:{ all -> 0x01ec }
            r4 = r7
        L_0x01bf:
            h.a.a.a.k r7 = r1.f20940l     // Catch:{ all -> 0x01ec }
            if (r7 == 0) goto L_0x01d6
            if (r0 == 0) goto L_0x01cd
            if (r4 == r1) goto L_0x01c8
            goto L_0x01cd
        L_0x01c8:
            h.a.a.a.k r7 = r1.f20940l     // Catch:{ all -> 0x01ec }
            r1.f20939k = r7     // Catch:{ all -> 0x01ec }
            goto L_0x01d4
        L_0x01cd:
            h.a.a.a.h r7 = r1.f20932d     // Catch:{ all -> 0x01ec }
            h.a.a.a.k r8 = r1.f20940l     // Catch:{ all -> 0x01ec }
            r7.mo34286u(r8)     // Catch:{ all -> 0x01ec }
        L_0x01d4:
            r1.f20940l = r11     // Catch:{ all -> 0x01ec }
        L_0x01d6:
            h.a.a.a.k r7 = r1.f20939k     // Catch:{ all -> 0x01ec }
            if (r7 != 0) goto L_0x01ea
            boolean r7 = r16.mo34193p()     // Catch:{ all -> 0x01ec }
            if (r7 != 0) goto L_0x01ea
            h.a.a.a.h r7 = r1.f20932d     // Catch:{ all -> 0x01ec }
            if (r0 != 0) goto L_0x01e6
            r0 = 1
            goto L_0x01e7
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            r7.mo34282r(r1, r0)     // Catch:{ all -> 0x01ec }
        L_0x01ea:
            monitor-exit(r16)     // Catch:{ all -> 0x01ec }
            goto L_0x01ef
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01ec }
            throw r0     // Catch:{ all -> 0x037f }
        L_0x01ef:
            r0 = r12
            goto L_0x0007
        L_0x01f2:
            r0 = move-exception
            goto L_0x01f6
        L_0x01f4:
            r0 = move-exception
            r12 = 0
        L_0x01f6:
            h.a.a.h.y.c r13 = f20950s     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r14.<init>()     // Catch:{ all -> 0x02c5 }
            java.lang.String r15 = "Failure on "
            r14.append(r15)     // Catch:{ all -> 0x02c5 }
            h.a.a.a.k r15 = r1.f20939k     // Catch:{ all -> 0x02c5 }
            r14.append(r15)     // Catch:{ all -> 0x02c5 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x02c5 }
            r13.mo35493i(r14, r0)     // Catch:{ all -> 0x02c5 }
            monitor-enter(r16)     // Catch:{ all -> 0x02c2 }
            if (r7 == 0) goto L_0x02a4
            int r5 = r7.mo34335s()     // Catch:{ all -> 0x02bf }
            r13 = 10
            if (r5 == r13) goto L_0x0236
            int r5 = r7.mo34335s()     // Catch:{ all -> 0x02bf }
            r13 = 11
            if (r5 == r13) goto L_0x0236
            boolean r5 = r7.mo34340w()     // Catch:{ all -> 0x02bf }
            if (r5 != 0) goto L_0x0236
            r5 = 9
            boolean r5 = r7.mo34315X(r5)     // Catch:{ all -> 0x02bf }
            if (r5 == 0) goto L_0x0236
            h.a.a.a.i r5 = r7.mo34327k()     // Catch:{ all -> 0x02bf }
            r5.mo34215h(r0)     // Catch:{ all -> 0x02bf }
        L_0x0236:
            monitor-exit(r16)     // Catch:{ all -> 0x02bf }
            h.a.a.h.y.c r0 = f20950s     // Catch:{ all -> 0x037f }
            java.lang.String r5 = "finally {} on {} progress={} {}"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x037f }
            r10[r2] = r7     // Catch:{ all -> 0x037f }
            r10[r3] = r1     // Catch:{ all -> 0x037f }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x037f }
            r10[r6] = r7     // Catch:{ all -> 0x037f }
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x037f }
            r10[r9] = r7     // Catch:{ all -> 0x037f }
            r0.mo35489e(r5, r10)     // Catch:{ all -> 0x037f }
            h.a.a.c.j r0 = r1.f20933e     // Catch:{ all -> 0x037f }
            r0.mo34394c(r2)     // Catch:{ all -> 0x037f }
            r16.mo34194q()     // Catch:{ all -> 0x037f }
            monitor-enter(r16)     // Catch:{ all -> 0x037f }
            h.a.a.a.k r0 = r1.f20939k     // Catch:{ all -> 0x02a1 }
            r1.f20939k = r11     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x0266
            h.a.a.a.h r5 = r1.f20932d     // Catch:{ all -> 0x02a1 }
            h.a.a.a.g r5 = r5.mo34272h()     // Catch:{ all -> 0x02a1 }
            r0.mo34323f(r5)     // Catch:{ all -> 0x02a1 }
        L_0x0266:
            int r5 = r1.f20936h     // Catch:{ all -> 0x02a1 }
            if (r5 != r8) goto L_0x0280
            h.a.a.d.n r5 = r1.f21308b     // Catch:{ all -> 0x02a1 }
            h.a.a.d.m r0 = r0.mo34300I(r5)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x0280
            h.a.a.a.k r4 = r1.f20940l     // Catch:{ all -> 0x02a1 }
            if (r4 == 0) goto L_0x027d
            h.a.a.a.h r4 = r1.f20932d     // Catch:{ all -> 0x02a1 }
            h.a.a.a.k r5 = r1.f20940l     // Catch:{ all -> 0x02a1 }
            r4.mo34286u(r5)     // Catch:{ all -> 0x02a1 }
        L_0x027d:
            r1.f20940l = r11     // Catch:{ all -> 0x02a1 }
            r4 = r0
        L_0x0280:
            h.a.a.a.k r0 = r1.f20940l     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x028d
            h.a.a.a.h r0 = r1.f20932d     // Catch:{ all -> 0x02a1 }
            h.a.a.a.k r5 = r1.f20940l     // Catch:{ all -> 0x02a1 }
            r0.mo34286u(r5)     // Catch:{ all -> 0x02a1 }
            r1.f20940l = r11     // Catch:{ all -> 0x02a1 }
        L_0x028d:
            h.a.a.a.k r0 = r1.f20939k     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x029c
            boolean r0 = r16.mo34193p()     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x029c
            h.a.a.a.h r0 = r1.f20932d     // Catch:{ all -> 0x02a1 }
            r0.mo34282r(r1, r3)     // Catch:{ all -> 0x02a1 }
        L_0x029c:
            monitor-exit(r16)     // Catch:{ all -> 0x02a1 }
            r0 = r12
            r5 = 1
            goto L_0x0007
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x037f }
        L_0x02a4:
            boolean r5 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x02bf }
            if (r5 != 0) goto L_0x02bc
            boolean r5 = r0 instanceof java.lang.Error     // Catch:{ all -> 0x02bf }
            if (r5 != 0) goto L_0x02b9
            boolean r5 = r0 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x02bf }
            if (r5 == 0) goto L_0x02b3
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x02b3:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x02bf }
            r5.<init>(r0)     // Catch:{ all -> 0x02bf }
            throw r5     // Catch:{ all -> 0x02bf }
        L_0x02b9:
            java.lang.Error r0 = (java.lang.Error) r0     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x02bc:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x02bf:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02c2 }
        L_0x02c2:
            r0 = move-exception
            r5 = 1
            goto L_0x02c6
        L_0x02c5:
            r0 = move-exception
        L_0x02c6:
            h.a.a.h.y.c r13 = f20950s     // Catch:{ all -> 0x037f }
            java.lang.String r14 = "finally {} on {} progress={} {}"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x037f }
            r10[r2] = r7     // Catch:{ all -> 0x037f }
            r10[r3] = r1     // Catch:{ all -> 0x037f }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x037f }
            r10[r6] = r7     // Catch:{ all -> 0x037f }
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x037f }
            r10[r9] = r7     // Catch:{ all -> 0x037f }
            r13.mo35489e(r14, r10)     // Catch:{ all -> 0x037f }
            if (r5 != 0) goto L_0x02f2
            h.a.a.c.j r7 = r1.f20933e     // Catch:{ all -> 0x037f }
            boolean r7 = r7.mo34397e()     // Catch:{ all -> 0x037f }
            if (r7 == 0) goto L_0x02f0
            h.a.a.c.n r7 = r1.f20934f     // Catch:{ all -> 0x037f }
            boolean r7 = r7.mo34517e()     // Catch:{ all -> 0x037f }
            if (r7 == 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r7 = 0
            goto L_0x02f3
        L_0x02f2:
            r7 = 1
        L_0x02f3:
            if (r7 == 0) goto L_0x037e
            if (r5 != 0) goto L_0x0309
            h.a.a.c.n r5 = r1.f20934f     // Catch:{ all -> 0x037f }
            boolean r5 = r5.mo34518f()     // Catch:{ all -> 0x037f }
            if (r5 == 0) goto L_0x0309
            h.a.a.c.j r5 = r1.f20933e     // Catch:{ all -> 0x037f }
            boolean r5 = r5.mo34398f()     // Catch:{ all -> 0x037f }
            if (r5 == 0) goto L_0x0309
            r5 = 1
            goto L_0x030a
        L_0x0309:
            r5 = 0
        L_0x030a:
            h.a.a.c.j r7 = r1.f20933e     // Catch:{ all -> 0x037f }
            r7.mo34394c(r5)     // Catch:{ all -> 0x037f }
            r16.mo34194q()     // Catch:{ all -> 0x037f }
            if (r5 == 0) goto L_0x0324
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x037f }
            h.a.a.a.h r9 = r1.f20932d     // Catch:{ all -> 0x037f }
            h.a.a.a.g r9 = r9.mo34272h()     // Catch:{ all -> 0x037f }
            long r9 = r9.mo34237O0()     // Catch:{ all -> 0x037f }
            int r10 = (int) r9     // Catch:{ all -> 0x037f }
            r7.mo34360j(r10)     // Catch:{ all -> 0x037f }
        L_0x0324:
            monitor-enter(r16)     // Catch:{ all -> 0x037f }
            h.a.a.a.k r7 = r1.f20939k     // Catch:{ all -> 0x037b }
            r1.f20939k = r11     // Catch:{ all -> 0x037b }
            if (r7 == 0) goto L_0x0334
            h.a.a.a.h r9 = r1.f20932d     // Catch:{ all -> 0x037b }
            h.a.a.a.g r9 = r9.mo34272h()     // Catch:{ all -> 0x037b }
            r7.mo34323f(r9)     // Catch:{ all -> 0x037b }
        L_0x0334:
            int r9 = r1.f20936h     // Catch:{ all -> 0x037b }
            if (r9 != r8) goto L_0x034e
            h.a.a.d.n r8 = r1.f21308b     // Catch:{ all -> 0x037b }
            h.a.a.d.m r7 = r7.mo34300I(r8)     // Catch:{ all -> 0x037b }
            if (r7 == 0) goto L_0x034e
            h.a.a.a.k r4 = r1.f20940l     // Catch:{ all -> 0x037b }
            if (r4 == 0) goto L_0x034b
            h.a.a.a.h r4 = r1.f20932d     // Catch:{ all -> 0x037b }
            h.a.a.a.k r8 = r1.f20940l     // Catch:{ all -> 0x037b }
            r4.mo34286u(r8)     // Catch:{ all -> 0x037b }
        L_0x034b:
            r1.f20940l = r11     // Catch:{ all -> 0x037b }
            r4 = r7
        L_0x034e:
            h.a.a.a.k r7 = r1.f20940l     // Catch:{ all -> 0x037b }
            if (r7 == 0) goto L_0x0365
            if (r5 == 0) goto L_0x035c
            if (r4 == r1) goto L_0x0357
            goto L_0x035c
        L_0x0357:
            h.a.a.a.k r4 = r1.f20940l     // Catch:{ all -> 0x037b }
            r1.f20939k = r4     // Catch:{ all -> 0x037b }
            goto L_0x0363
        L_0x035c:
            h.a.a.a.h r4 = r1.f20932d     // Catch:{ all -> 0x037b }
            h.a.a.a.k r7 = r1.f20940l     // Catch:{ all -> 0x037b }
            r4.mo34286u(r7)     // Catch:{ all -> 0x037b }
        L_0x0363:
            r1.f20940l = r11     // Catch:{ all -> 0x037b }
        L_0x0365:
            h.a.a.a.k r4 = r1.f20939k     // Catch:{ all -> 0x037b }
            if (r4 != 0) goto L_0x0379
            boolean r4 = r16.mo34193p()     // Catch:{ all -> 0x037b }
            if (r4 != 0) goto L_0x0379
            h.a.a.a.h r4 = r1.f20932d     // Catch:{ all -> 0x037b }
            if (r5 != 0) goto L_0x0375
            r5 = 1
            goto L_0x0376
        L_0x0375:
            r5 = 0
        L_0x0376:
            r4.mo34282r(r1, r5)     // Catch:{ all -> 0x037b }
        L_0x0379:
            monitor-exit(r16)     // Catch:{ all -> 0x037b }
            goto L_0x037e
        L_0x037b:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x037b }
            throw r0     // Catch:{ all -> 0x037f }
        L_0x037e:
            throw r0     // Catch:{ all -> 0x037f }
        L_0x037f:
            r0 = move-exception
            h.a.a.c.n r4 = r1.f20934f
            r4.mo34516d()
            h.a.a.c.j r4 = r1.f20933e
            r4.mo34396d()
            h.a.a.h.y.c r4 = f20950s
            java.lang.String r5 = "unhandle {} on {}"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            h.a.a.a.k r7 = r1.f20939k
            r6[r2] = r7
            h.a.a.d.n r2 = r1.f21308b
            r6[r3] = r2
            r4.mo35489e(r5, r6)
            throw r0
        L_0x039c:
            h.a.a.c.n r0 = r1.f20934f
            r0.mo34516d()
            h.a.a.c.j r0 = r1.f20933e
            r0.mo34396d()
            h.a.a.h.y.c r0 = f20950s
            java.lang.String r5 = "unhandle {} on {}"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            h.a.a.a.k r7 = r1.f20939k
            r6[r2] = r7
            h.a.a.d.n r2 = r1.f21308b
            r6[r3] = r2
            r0.mo35489e(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p213a.C10858c.mo34225c():h.a.a.d.m");
    }

    /* renamed from: e */
    public void mo34226e() {
        if (this.f20933e.mo34392a()) {
            this.f21308b.mo34370t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo34194q() {
        this.f20951p = false;
        super.mo34194q();
    }

    /* renamed from: r */
    public boolean mo34195r(C10871k kVar) {
        boolean r = super.mo34195r(kVar);
        if (r) {
            this.f20953r.mo34376y();
        }
        return r;
    }
}
