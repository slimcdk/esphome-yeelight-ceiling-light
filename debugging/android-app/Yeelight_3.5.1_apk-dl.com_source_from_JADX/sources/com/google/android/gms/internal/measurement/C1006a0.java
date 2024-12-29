package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
public final class C1006a0 extends C1369x {
    protected C1006a0() {
        this.f1702a.add(zzbl.APPLY);
        this.f1702a.add(zzbl.BLOCK);
        this.f1702a.add(zzbl.BREAK);
        this.f1702a.add(zzbl.CASE);
        this.f1702a.add(zzbl.DEFAULT);
        this.f1702a.add(zzbl.CONTINUE);
        this.f1702a.add(zzbl.DEFINE_FUNCTION);
        this.f1702a.add(zzbl.FN);
        this.f1702a.add(zzbl.IF);
        this.f1702a.add(zzbl.QUOTE);
        this.f1702a.add(zzbl.RETURN);
        this.f1702a.add(zzbl.SWITCH);
        this.f1702a.add(zzbl.TERNARY);
    }

    /* renamed from: c */
    private static C1261q m1665c(C1250p4 p4Var, List list) {
        C1267q5.m2516i(zzbl.FN.name(), 2, list);
        C1261q b = p4Var.mo13062b((C1261q) list.get(0));
        C1261q b2 = p4Var.mo13062b((C1261q) list.get(1));
        if (b2 instanceof C1085f) {
            List w = ((C1085f) b2).mo12777w();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C1245p(b.mo12762d(), w, arrayList, p4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r8.equals("continue") == false) goto L_0x0127;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1261q mo12511a(java.lang.String r8, com.google.android.gms.internal.measurement.C1250p4 r9, java.util.List r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.C1267q5.m2512e(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0205
            r5 = 15
            if (r0 == r5) goto L_0x01f9
            r5 = 25
            if (r0 == r5) goto L_0x01f4
            r5 = 41
            if (r0 == r5) goto L_0x01a2
            r5 = 54
            if (r0 == r5) goto L_0x019c
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0179
            r5 = 19
            if (r0 == r5) goto L_0x015b
            r5 = 20
            if (r0 == r5) goto L_0x013a
            r5 = 60
            if (r0 == r5) goto L_0x0085
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x015b;
                default: goto L_0x0039;
            }
        L_0x0039:
            com.google.android.gms.internal.measurement.q r8 = super.mo13469b(r8)
            return r8
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r4, r10)
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1539G
            return r8
        L_0x004a:
            com.google.android.gms.internal.measurement.p4 r8 = r9.mo13061a()
            com.google.android.gms.internal.measurement.f r9 = new com.google.android.gms.internal.measurement.f
            r9.<init>(r10)
            com.google.android.gms.internal.measurement.q r8 = r8.mo13063c(r9)
            return r8
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            java.lang.Boolean r8 = r8.mo12763e()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r10.get(r3)
            goto L_0x007e
        L_0x007a:
            java.lang.Object r8 = r10.get(r2)
        L_0x007e:
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            return r8
        L_0x0085:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo13062b(r0)
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C1261q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo13062b(r10)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1085f
            if (r1 == 0) goto L_0x0132
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.C1085f
            if (r1 == 0) goto L_0x012a
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C1085f) r0
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C1085f) r10
            r1 = 0
            r2 = 0
        L_0x00ba:
            int r5 = r0.mo12772r()
            if (r1 >= r5) goto L_0x00f5
            if (r2 != 0) goto L_0x00d3
            com.google.android.gms.internal.measurement.q r2 = r0.mo12773t(r1)
            com.google.android.gms.internal.measurement.q r2 = r9.mo13062b(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r2 = 0
            goto L_0x00f2
        L_0x00d3:
            com.google.android.gms.internal.measurement.q r2 = r10.mo12773t(r1)
            com.google.android.gms.internal.measurement.q r2 = r9.mo13062b(r2)
            boolean r5 = r2 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r5 == 0) goto L_0x00f1
            r8 = r2
            com.google.android.gms.internal.measurement.h r8 = (com.google.android.gms.internal.measurement.C1117h) r8
            java.lang.String r8 = r8.mo12849f()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0126
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1536D
            return r8
        L_0x00f1:
            r2 = 1
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00ba
        L_0x00f5:
            int r8 = r0.mo12772r()
            int r8 = r8 + r3
            int r1 = r10.mo12772r()
            if (r8 != r1) goto L_0x0127
            int r8 = r0.mo12772r()
            com.google.android.gms.internal.measurement.q r8 = r10.mo12773t(r8)
            com.google.android.gms.internal.measurement.q r2 = r9.mo13062b(r8)
            boolean r8 = r2 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r8 == 0) goto L_0x0127
            r8 = r2
            com.google.android.gms.internal.measurement.h r8 = (com.google.android.gms.internal.measurement.C1117h) r8
            java.lang.String r8 = r8.mo12849f()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x0126
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            return r2
        L_0x0127:
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1536D
            return r8
        L_0x012a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0132:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x013a:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2516i(r8, r2, r10)
            com.google.android.gms.internal.measurement.q r8 = m1665c(r9, r10)
            r10 = r8
            com.google.android.gms.internal.measurement.j r10 = (com.google.android.gms.internal.measurement.C1149j) r10
            java.lang.String r0 = r10.mo12891f()
            if (r0 != 0) goto L_0x0153
            java.lang.String r10 = ""
            goto L_0x0157
        L_0x0153:
            java.lang.String r10 = r10.mo12891f()
        L_0x0157:
            r9.mo13067g(r10, r8)
            return r8
        L_0x015b:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0164
        L_0x0161:
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1536D
            goto L_0x0178
        L_0x0164:
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            boolean r10 = r8 instanceof com.google.android.gms.internal.measurement.C1085f
            if (r10 == 0) goto L_0x0161
            com.google.android.gms.internal.measurement.f r8 = (com.google.android.gms.internal.measurement.C1085f) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13063c(r8)
        L_0x0178:
            return r8
        L_0x0179:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0182
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1540H
            goto L_0x019b
        L_0x0182:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            com.google.android.gms.internal.measurement.h r9 = new com.google.android.gms.internal.measurement.h
            r9.<init>(r6, r8)
            r8 = r9
        L_0x019b:
            return r8
        L_0x019c:
            com.google.android.gms.internal.measurement.f r8 = new com.google.android.gms.internal.measurement.f
            r8.<init>(r10)
            return r8
        L_0x01a2:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2516i(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo13062b(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01d0
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C1261q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo13062b(r10)
            goto L_0x01d1
        L_0x01d0:
            r10 = 0
        L_0x01d1:
            com.google.android.gms.internal.measurement.q r1 = com.google.android.gms.internal.measurement.C1261q.f1536D
            java.lang.Boolean r8 = r8.mo12763e()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01e4
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C1085f) r0
            com.google.android.gms.internal.measurement.q r8 = r9.mo13063c(r0)
            goto L_0x01ee
        L_0x01e4:
            if (r10 == 0) goto L_0x01ed
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C1085f) r10
            com.google.android.gms.internal.measurement.q r8 = r9.mo13063c(r10)
            goto L_0x01ee
        L_0x01ed:
            r8 = r1
        L_0x01ee:
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r9 == 0) goto L_0x01f3
            return r8
        L_0x01f3:
            return r1
        L_0x01f4:
            com.google.android.gms.internal.measurement.q r8 = m1665c(r9, r10)
            return r8
        L_0x01f9:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r4, r10)
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C1261q.f1538F
            return r8
        L_0x0205:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C1261q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo13062b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo13062b(r0)
            java.lang.String r0 = r0.mo12762d()
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C1261q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo13062b(r10)
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.C1085f
            if (r1 == 0) goto L_0x024d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0245
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C1085f) r10
            java.util.List r10 = r10.mo12777w()
            com.google.android.gms.internal.measurement.q r8 = r8.mo12637l(r0, r9, r10)
            return r8
        L_0x0245:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x024d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            goto L_0x0266
        L_0x0265:
            throw r8
        L_0x0266:
            goto L_0x0265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1006a0.mo12511a(java.lang.String, com.google.android.gms.internal.measurement.p4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
