package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c9 */
public final class C1047c9 extends C1213n {

    /* renamed from: b */
    private final C1037c f1267b;

    public C1047c9(C1037c cVar) {
        this.f1267b = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1261q mo12637l(java.lang.String r17, com.google.android.gms.internal.measurement.C1250p4 r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.android.gms.internal.measurement.q r1 = super.mo12637l(r17, r18, r19)
            return r1
        L_0x0064:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C1261q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo13062b(r1)
            java.lang.String r1 = r1.mo12762d()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C1261q) r3
            com.google.android.gms.internal.measurement.q r2 = r2.mo13062b(r3)
            com.google.android.gms.internal.measurement.c r3 = r0.f1267b
            com.google.android.gms.internal.measurement.b r3 = r3.mo12593b()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C1267q5.m2513f(r2)
            r3.mo12558g(r1, r4)
            return r2
        L_0x008d:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C1261q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo13062b(r1)
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C1261q.f1536D
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C1261q.f1537E
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.c r2 = r0.f1267b
            com.google.android.gms.internal.measurement.b r2 = r2.mo12593b()
            java.lang.String r3 = r1.mo12762d()
            r2.mo12557f(r3)
            com.google.android.gms.internal.measurement.u r2 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = r1.mo12762d()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r12, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f1267b
            com.google.android.gms.internal.measurement.b r1 = r1.mo12593b()
            com.google.android.gms.internal.measurement.i r2 = new com.google.android.gms.internal.measurement.i
            long r3 = r1.mo12550a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r10, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f1267b
            com.google.android.gms.internal.measurement.b r1 = r1.mo12593b()
            java.util.Map r1 = r1.mo12555e()
            com.google.android.gms.internal.measurement.n r2 = new com.google.android.gms.internal.measurement.n
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.q r5 = com.google.android.gms.internal.measurement.C1284r6.m2684b(r5)
            r2.mo12769m(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C1261q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo13062b(r1)
            java.lang.String r1 = r1.mo12762d()
            com.google.android.gms.internal.measurement.c r2 = r0.f1267b
            com.google.android.gms.internal.measurement.b r2 = r2.mo12593b()
            java.lang.Object r1 = r2.mo12552c(r1)
            com.google.android.gms.internal.measurement.q r1 = com.google.android.gms.internal.measurement.C1284r6.m2684b(r1)
            return r1
        L_0x0134:
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r13, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f1267b
            com.google.android.gms.internal.measurement.b r1 = r1.mo12593b()
            com.google.android.gms.internal.measurement.u r2 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = r1.mo12554d()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1047c9.mo12637l(java.lang.String, com.google.android.gms.internal.measurement.p4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
