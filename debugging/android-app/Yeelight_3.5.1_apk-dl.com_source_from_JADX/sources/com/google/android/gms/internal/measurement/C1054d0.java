package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
public final class C1054d0 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        r1 = r22.mo12772r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f9, code lost:
        r2 = r22.mo12772r();
        r4 = new com.google.android.gms.internal.measurement.C1085f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0207, code lost:
        if (r24.size() <= 1) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0209, code lost:
        r5 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.C1267q5.m2508a(r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(1)).mo12761c().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0225, code lost:
        if (r5 <= 0) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0227, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022e, code lost:
        if (r6 >= java.lang.Math.min(r2, r1 + r5)) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0230, code lost:
        r4.mo12758A(r4.mo12772r(), r9.mo12773t(r1));
        r9.mo12780z(r1);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0246, code lost:
        if (r24.size() <= 2) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0248, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024d, code lost:
        if (r2 >= r24.size()) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024f, code lost:
        r5 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025b, code lost:
        if ((r5 instanceof com.google.android.gms.internal.measurement.C1117h) != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025d, code lost:
        r9.mo12779y((r1 + r2) - 2, r5);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026e, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026f, code lost:
        if (r1 >= r2) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0271, code lost:
        r4.mo12758A(r4.mo12772r(), r9.mo12773t(r1));
        r9.mo12758A(r1, (com.google.android.gms.internal.measurement.C1261q) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0285, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2517j("sort", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0294, code lost:
        if (r22.mo12772r() >= 2) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0297, code lost:
        r1 = r22.mo12777w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        if (r24.isEmpty() != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a1, code lost:
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ae, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1149j) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b0, code lost:
        r0 = (com.google.android.gms.internal.measurement.C1149j) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ba, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bb, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bc, code lost:
        java.util.Collections.sort(r1, new com.google.android.gms.internal.measurement.C1038c0(r0, r3));
        r22.mo12778x();
        r0 = r1.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d0, code lost:
        if (r0.hasNext() == false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d2, code lost:
        r9.mo12758A(r2, (com.google.android.gms.internal.measurement.C1261q) r0.next());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02df, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e0, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("some", 1, r0);
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f7, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1149j) == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fd, code lost:
        if (r22.mo12772r() != 0) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0302, code lost:
        r0 = (com.google.android.gms.internal.measurement.C1149j) r0;
        r1 = r22.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030c, code lost:
        if (r1.hasNext() == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030e, code lost:
        r2 = ((java.lang.Integer) r1.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031c, code lost:
        if (r9.mo12759B(r2) == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0348, code lost:
        if (r0.mo12586a(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C1261q[]{r9.mo12773t(r2), new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf((double) r2)), r9})).mo12763e().booleanValue() == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0354, code lost:
        throw new java.lang.IllegalArgumentException(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0355, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2517j("slice", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0363, code lost:
        if (r24.isEmpty() == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036b, code lost:
        r4 = (double) r22.mo12772r();
        r6 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0)).mo12761c().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0389, code lost:
        if (r6 >= 0.0d) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038b, code lost:
        java.lang.Double.isNaN(r4);
        r6 = java.lang.Math.max(r6 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0394, code lost:
        r6 = java.lang.Math.min(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x039d, code lost:
        if (r24.size() != 2) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039f, code lost:
        r10 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(1)).mo12761c().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03b8, code lost:
        if (r10 >= 0.0d) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ba, code lost:
        java.lang.Double.isNaN(r4);
        r4 = java.lang.Math.max(r4 + r10, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c3, code lost:
        r4 = java.lang.Math.min(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c7, code lost:
        r0 = new com.google.android.gms.internal.measurement.C1085f();
        r1 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03d0, code lost:
        if (((double) r1) >= r4) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d2, code lost:
        r0.mo12758A(r0.mo12772r(), r9.mo12773t(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e1, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("shift", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03ed, code lost:
        if (r22.mo12772r() != 0) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f2, code lost:
        r0 = r9.mo12773t(0);
        r9.mo12780z(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03fa, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("reverse", 0, r24);
        r0 = r22.mo12772r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0406, code lost:
        if (r0 == 0) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0408, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x040b, code lost:
        if (r2 >= (r0 / 2)) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0411, code lost:
        if (r9.mo12759B(r2) == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0413, code lost:
        r1 = r9.mo12773t(r2);
        r9.mo12758A(r2, (com.google.android.gms.internal.measurement.C1261q) null);
        r3 = (r0 - 1) - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0422, code lost:
        if (r9.mo12759B(r3) == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0424, code lost:
        r9.mo12758A(r2, r9.mo12773t(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042b, code lost:
        r9.mo12758A(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x042e, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0431, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x043d, code lost:
        return m1791c(r22, r23, r24, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0449, code lost:
        return m1791c(r22, r23, r24, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x044a, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0454, code lost:
        if (r24.isEmpty() != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0456, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x045e, code lost:
        if (r0.hasNext() == false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0460, code lost:
        r9.mo12758A(r22.mo12772r(), r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0480, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf((double) r22.mo12772r()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0481, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("pop", 0, r24);
        r0 = r22.mo12772r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x048d, code lost:
        if (r0 != 0) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0492, code lost:
        r0 = r0 - 1;
        r1 = r9.mo12773t(r0);
        r9.mo12780z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x049d, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("map", 1, r0);
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b6, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1245p) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04bc, code lost:
        if (r22.mo12772r() != 0) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04d1, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04d2, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2517j("lastIndexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.C1261q.f1536D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e2, code lost:
        if (r24.isEmpty() != false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04e4, code lost:
        r4 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ef, code lost:
        r5 = (double) (r22.mo12772r() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fb, code lost:
        if (r24.size() <= 1) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04fd, code lost:
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0513, code lost:
        if (java.lang.Double.isNaN(r0.mo12761c().doubleValue()) == false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0515, code lost:
        r5 = (double) (r22.mo12772r() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x051d, code lost:
        r5 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r0.mo12761c().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x052b, code lost:
        if (r5 >= 0.0d) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x052d, code lost:
        r7 = (double) r22.mo12772r();
        java.lang.Double.isNaN(r7);
        r5 = r5 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0538, code lost:
        if (r5 >= 0.0d) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0544, code lost:
        r0 = (int) java.lang.Math.min((double) r22.mo12772r(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x054e, code lost:
        if (r0 < 0) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0554, code lost:
        if (r9.mo12759B(r0) == false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x055e, code lost:
        if (com.google.android.gms.internal.measurement.C1267q5.m2519l(r9.mo12773t(r0), r4) == false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x056c, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0579, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2517j("join", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0587, code lost:
        if (r22.mo12772r() != 0) goto L_0x058c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0590, code lost:
        if (r24.isEmpty() != false) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0592, code lost:
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x059f, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1229o) != false) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05a3, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1339v) == false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05a6, code lost:
        r0 = r0.mo12762d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05ab, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05ae, code lost:
        r0 = com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05bb, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2517j("indexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.C1261q.f1536D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05cb, code lost:
        if (r24.isEmpty() != false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05cd, code lost:
        r4 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05dd, code lost:
        if (r24.size() <= 1) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05df, code lost:
        r5 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(1)).mo12761c().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05fc, code lost:
        if (r5 < ((double) r22.mo12772r())) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x060a, code lost:
        if (r5 >= 0.0d) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x060c, code lost:
        r0 = (double) r22.mo12772r();
        java.lang.Double.isNaN(r0);
        r1 = r0 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0617, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0618, code lost:
        r0 = r22.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0620, code lost:
        if (r0.hasNext() == false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0622, code lost:
        r3 = ((java.lang.Integer) r0.next()).intValue();
        r5 = (double) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x062f, code lost:
        if (r5 < r1) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0639, code lost:
        if (com.google.android.gms.internal.measurement.C1267q5.m2519l(r9.mo12773t(r3), r4) == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x064f, code lost:
        r1 = r21;
        r9 = r22;
        r0 = r24;
        r3 = r23;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("forEach", 1, r0);
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0669, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1245p) == false) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x066f, code lost:
        if (r22.mo12771o() != 0) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0672, code lost:
        m1790b(r9, r3, (com.google.android.gms.internal.measurement.C1245p) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x067a, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1536D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0680, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0681, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2515h(r20, 1, r0);
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x069c, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1245p) == false) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06a2, code lost:
        if (r22.mo12771o() != 0) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06aa, code lost:
        r1 = r22.mo12760b();
        r0 = m1790b(r9, r3, (com.google.android.gms.internal.measurement.C1245p) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new com.google.android.gms.internal.measurement.C1085f();
        r0 = r0.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06c4, code lost:
        if (r0.hasNext() == false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06c6, code lost:
        r2.mo12758A(r2.mo12772r(), ((com.google.android.gms.internal.measurement.C1085f) r1).mo12773t(((java.lang.Integer) r0.next()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06e6, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06e7, code lost:
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C1267q5.m2515h("every", 1, r0);
        r0 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0700, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C1245p) == false) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0706, code lost:
        if (r22.mo12772r() != 0) goto L_0x070b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x071d, code lost:
        if (m1790b(r2, r3, (com.google.android.gms.internal.measurement.C1245p) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).mo12772r() == r22.mo12772r()) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0727, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0728, code lost:
        r2 = r22;
        r3 = r23;
        r0 = r24;
        r1 = r22.mo12760b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0736, code lost:
        if (r24.isEmpty() != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0738, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0740, code lost:
        if (r0.hasNext() == false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0742, code lost:
        r2 = r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x074e, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C1117h) != false) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0750, code lost:
        r4 = (com.google.android.gms.internal.measurement.C1085f) r1;
        r5 = r4.mo12772r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0759, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C1085f) == false) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x075b, code lost:
        r2 = (com.google.android.gms.internal.measurement.C1085f) r2;
        r6 = r2.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0765, code lost:
        if (r6.hasNext() == false) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0767, code lost:
        r7 = (java.lang.Integer) r6.next();
        r4.mo12758A(r7.intValue() + r5, r2.mo12773t(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x077e, code lost:
        r4.mo12758A(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0789, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x078a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return new com.google.android.gms.internal.measurement.C1085f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1541I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1542J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return r22.mo12760b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1536D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1536D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return m1790b(r9, r3, (com.google.android.gms.internal.measurement.C1245p) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return new com.google.android.gms.internal.measurement.C1085f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf((double) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return new com.google.android.gms.internal.measurement.C1324u(r9.mo12775u(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1543K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return new com.google.android.gms.internal.measurement.C1085f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1542J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return com.google.android.gms.internal.measurement.C1261q.f1541I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fb, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fc, code lost:
        r20 = "filter";
        r21 = "Callback should be a method";
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        switch(r0) {
            case 0: goto L_0x0728;
            case 1: goto L_0x06e7;
            case 2: goto L_0x0681;
            case 3: goto L_0x064f;
            case 4: goto L_0x05bb;
            case 5: goto L_0x0579;
            case 6: goto L_0x04d2;
            case 7: goto L_0x049d;
            case 8: goto L_0x0481;
            case 9: goto L_0x044a;
            case 10: goto L_0x043e;
            case 11: goto L_0x0432;
            case 12: goto L_0x03fa;
            case 13: goto L_0x03e1;
            case 14: goto L_0x0355;
            case 15: goto L_0x02e0;
            case 16: goto L_0x0285;
            case 17: goto L_0x01b8;
            case 18: goto L_0x01a3;
            case 19: goto L_0x0111;
            default: goto L_0x0109;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0110, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0115, code lost:
        if (r24.isEmpty() != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        r0 = new com.google.android.gms.internal.measurement.C1085f();
        r1 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r1.hasNext() == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        r2 = r23.mo13062b((com.google.android.gms.internal.measurement.C1261q) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C1117h) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
        r0.mo12758A(r0.mo12772r(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0145, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0146, code lost:
        r1 = r0.mo12772r();
        r2 = r22.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0152, code lost:
        if (r2.hasNext() == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0154, code lost:
        r3 = (java.lang.Integer) r2.next();
        r0.mo12758A(r3.intValue() + r1, r22.mo12773t(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016d, code lost:
        r9 = r22;
        r22.mo12778x();
        r1 = r0.mo12776v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017a, code lost:
        if (r1.hasNext() == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        r2 = (java.lang.Integer) r1.next();
        r9.mo12758A(r2.intValue(), r0.mo12773t(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0192, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a2, code lost:
        return new com.google.android.gms.internal.measurement.C1133i(java.lang.Double.valueOf((double) r22.mo12772r()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a3, code lost:
        com.google.android.gms.internal.measurement.C1267q5.m2515h(r4, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b7, code lost:
        return new com.google.android.gms.internal.measurement.C1324u(r22.mo12775u(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b8, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c3, code lost:
        if (r24.isEmpty() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cc, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.C1267q5.m2508a(r3.mo13062b((com.google.android.gms.internal.measurement.C1261q) r0.get(0)).mo12761c().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e3, code lost:
        if (r1 >= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e5, code lost:
        r1 = java.lang.Math.max(0, r1 + r22.mo12772r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f3, code lost:
        if (r1 <= r22.mo12772r()) goto L_0x01f9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C1261q m1789a(java.lang.String r21, com.google.android.gms.internal.measurement.C1085f r22, com.google.android.gms.internal.measurement.C1250p4 r23, java.util.List r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            int r4 = r21.hashCode()
            java.lang.String r5 = "indexOf"
            java.lang.String r6 = "reverse"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "shift"
            java.lang.String r9 = "every"
            java.lang.String r10 = "sort"
            java.lang.String r11 = "some"
            java.lang.String r12 = "join"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "map"
            java.lang.String r15 = "lastIndexOf"
            java.lang.String r3 = "forEach"
            java.lang.String r1 = "filter"
            java.lang.String r2 = "toString"
            r16 = -1
            r17 = r2
            switch(r4) {
                case -1776922004: goto L_0x00f0;
                case -1354795244: goto L_0x00e4;
                case -1274492040: goto L_0x00da;
                case -934873754: goto L_0x00cd;
                case -895859076: goto L_0x00c2;
                case -678635926: goto L_0x00ba;
                case -467511597: goto L_0x00b2;
                case -277637751: goto L_0x00a7;
                case 107868: goto L_0x009f;
                case 111185: goto L_0x0096;
                case 3267882: goto L_0x008e;
                case 3452698: goto L_0x0083;
                case 3536116: goto L_0x007a;
                case 3536286: goto L_0x0071;
                case 96891675: goto L_0x0066;
                case 109407362: goto L_0x005c;
                case 109526418: goto L_0x0052;
                case 965561430: goto L_0x0046;
                case 1099846370: goto L_0x003c;
                case 1943291465: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r4 = r17
            goto L_0x00fb
        L_0x0033:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x00d7
        L_0x003c:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x002f
            r0 = 12
            goto L_0x00d7
        L_0x0046:
            java.lang.String r4 = "reduceRight"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 11
            goto L_0x00d7
        L_0x0052:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x002f
            r0 = 14
            goto L_0x00d7
        L_0x005c:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x002f
            r0 = 13
            goto L_0x00d7
        L_0x0066:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 1
            goto L_0x00fc
        L_0x0071:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x002f
            r0 = 16
            goto L_0x00d7
        L_0x007a:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x002f
            r0 = 15
            goto L_0x00d7
        L_0x0083:
            java.lang.String r4 = "push"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 9
            goto L_0x00d7
        L_0x008e:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x002f
            r0 = 5
            goto L_0x00d7
        L_0x0096:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x002f
            r0 = 8
            goto L_0x00d7
        L_0x009f:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x002f
            r0 = 7
            goto L_0x00d7
        L_0x00a7:
            java.lang.String r4 = "unshift"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 19
            goto L_0x00d7
        L_0x00b2:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x002f
            r0 = 6
            goto L_0x00d7
        L_0x00ba:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002f
            r0 = 3
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r4 = "splice"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            goto L_0x00d7
        L_0x00cd:
            java.lang.String r4 = "reduce"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 10
        L_0x00d7:
            r4 = r17
            goto L_0x00fc
        L_0x00da:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 2
            goto L_0x00fc
        L_0x00e4:
            java.lang.String r4 = "concat"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 0
            goto L_0x00fc
        L_0x00f0:
            r4 = r17
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00fb
            r0 = 18
            goto L_0x00fc
        L_0x00fb:
            r0 = -1
        L_0x00fc:
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r2 = "Callback should be a method"
            r20 = r1
            r21 = r2
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0728;
                case 1: goto L_0x06e7;
                case 2: goto L_0x0681;
                case 3: goto L_0x064f;
                case 4: goto L_0x05bb;
                case 5: goto L_0x0579;
                case 6: goto L_0x04d2;
                case 7: goto L_0x049d;
                case 8: goto L_0x0481;
                case 9: goto L_0x044a;
                case 10: goto L_0x043e;
                case 11: goto L_0x0432;
                case 12: goto L_0x03fa;
                case 13: goto L_0x03e1;
                case 14: goto L_0x0355;
                case 15: goto L_0x02e0;
                case 16: goto L_0x0285;
                case 17: goto L_0x01b8;
                case 18: goto L_0x01a3;
                case 19: goto L_0x0111;
                default: goto L_0x0109;
            }
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0111:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0192
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L_0x0120:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0146
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C1261q) r2
            r3 = r23
            com.google.android.gms.internal.measurement.q r2 = r3.mo13062b(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r4 != 0) goto L_0x013e
            int r4 = r0.mo12772r()
            r0.mo12758A(r4, r2)
            goto L_0x0120
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0146:
            int r1 = r0.mo12772r()
            java.util.Iterator r2 = r22.mo12776v()
        L_0x014e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016d
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r22
            com.google.android.gms.internal.measurement.q r3 = r9.mo12773t(r3)
            r0.mo12758A(r4, r3)
            goto L_0x014e
        L_0x016d:
            r9 = r22
            r22.mo12778x()
            java.util.Iterator r1 = r0.mo12776v()
        L_0x0176:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0194
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.q r2 = r0.mo12773t(r2)
            r9.mo12758A(r3, r2)
            goto L_0x0176
        L_0x0192:
            r9 = r22
        L_0x0194:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r22.mo12772r()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x01a3:
            r9 = r22
            r0 = r24
            r1 = r4
            r2 = 0
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r1, r2, r0)
            com.google.android.gms.internal.measurement.u r0 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = ","
            java.lang.String r1 = r9.mo12775u(r1)
            r0.<init>(r1)
            return r0
        L_0x01b8:
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            boolean r1 = r24.isEmpty()
            if (r1 == 0) goto L_0x01cc
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x0284
        L_0x01cc:
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C1261q) r1
            com.google.android.gms.internal.measurement.q r1 = r3.mo13062b(r1)
            java.lang.Double r1 = r1.mo12761c()
            double r4 = r1.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r4)
            int r1 = (int) r4
            if (r1 >= 0) goto L_0x01ef
            int r4 = r22.mo12772r()
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x01f9
        L_0x01ef:
            int r2 = r22.mo12772r()
            if (r1 <= r2) goto L_0x01f9
            int r1 = r22.mo12772r()
        L_0x01f9:
            int r2 = r22.mo12772r()
            com.google.android.gms.internal.measurement.f r4 = new com.google.android.gms.internal.measurement.f
            r4.<init>()
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x026f
            java.lang.Object r5 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r5 = (com.google.android.gms.internal.measurement.C1261q) r5
            com.google.android.gms.internal.measurement.q r5 = r3.mo13062b(r5)
            java.lang.Double r5 = r5.mo12761c()
            double r5 = r5.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r5)
            int r5 = (int) r5
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            if (r5 <= 0) goto L_0x0241
            r6 = r1
        L_0x0228:
            int r7 = r1 + r5
            int r7 = java.lang.Math.min(r2, r7)
            if (r6 >= r7) goto L_0x0241
            com.google.android.gms.internal.measurement.q r7 = r9.mo12773t(r1)
            int r8 = r4.mo12772r()
            r4.mo12758A(r8, r7)
            r9.mo12780z(r1)
            int r6 = r6 + 1
            goto L_0x0228
        L_0x0241:
            int r2 = r24.size()
            r5 = 2
            if (r2 <= r5) goto L_0x0283
            r2 = 2
        L_0x0249:
            int r5 = r24.size()
            if (r2 >= r5) goto L_0x0283
            java.lang.Object r5 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r5 = (com.google.android.gms.internal.measurement.C1261q) r5
            com.google.android.gms.internal.measurement.q r5 = r3.mo13062b(r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r6 != 0) goto L_0x0267
            int r6 = r1 + r2
            int r6 = r6 + -2
            r9.mo12779y(r6, r5)
            int r2 = r2 + 1
            goto L_0x0249
        L_0x0267:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x026f:
            if (r1 >= r2) goto L_0x0283
            com.google.android.gms.internal.measurement.q r0 = r9.mo12773t(r1)
            int r3 = r4.mo12772r()
            r4.mo12758A(r3, r0)
            r0 = 0
            r9.mo12758A(r1, r0)
            int r1 = r1 + 1
            goto L_0x026f
        L_0x0283:
            r0 = r4
        L_0x0284:
            return r0
        L_0x0285:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r10, r1, r0)
            int r1 = r22.mo12772r()
            r2 = 2
            if (r1 >= r2) goto L_0x0297
            goto L_0x02df
        L_0x0297:
            java.util.List r1 = r22.mo12777w()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x02bb
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C1149j
            if (r2 == 0) goto L_0x02b3
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C1149j) r0
            goto L_0x02bc
        L_0x02b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x02bb:
            r0 = 0
        L_0x02bc:
            com.google.android.gms.internal.measurement.c0 r2 = new com.google.android.gms.internal.measurement.c0
            r2.<init>(r0, r3)
            java.util.Collections.sort(r1, r2)
            r22.mo12778x()
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        L_0x02cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02df
            int r1 = r2 + 1
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C1261q) r3
            r9.mo12758A(r2, r3)
            r2 = r1
            goto L_0x02cc
        L_0x02df:
            return r9
        L_0x02e0:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r11, r1, r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1149j
            if (r1 == 0) goto L_0x034d
            int r1 = r22.mo12772r()
            if (r1 != 0) goto L_0x0302
        L_0x02ff:
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1542J
            goto L_0x034c
        L_0x0302:
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C1149j) r0
            java.util.Iterator r1 = r22.mo12776v()
        L_0x0308:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02ff
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r9.mo12759B(r2)
            if (r4 == 0) goto L_0x0308
            r4 = 3
            com.google.android.gms.internal.measurement.q[] r4 = new com.google.android.gms.internal.measurement.C1261q[r4]
            com.google.android.gms.internal.measurement.q r5 = r9.mo12773t(r2)
            r6 = 0
            r4[r6] = r5
            com.google.android.gms.internal.measurement.i r5 = new com.google.android.gms.internal.measurement.i
            double r6 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r5.<init>(r2)
            r2 = 1
            r4[r2] = r5
            r2 = 2
            r4[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.q r2 = r0.mo12586a(r3, r2)
            java.lang.Boolean r2 = r2.mo12763e()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0308
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1541I
        L_0x034c:
            return r0
        L_0x034d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r21
            r0.<init>(r1)
            throw r0
        L_0x0355:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r7, r4, r0)
            boolean r4 = r24.isEmpty()
            if (r4 == 0) goto L_0x036b
            com.google.android.gms.internal.measurement.q r0 = r22.mo12760b()
            goto L_0x03e0
        L_0x036b:
            int r4 = r22.mo12772r()
            double r4 = (double) r4
            r6 = 0
            java.lang.Object r6 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r6 = (com.google.android.gms.internal.measurement.C1261q) r6
            com.google.android.gms.internal.measurement.q r6 = r3.mo13062b(r6)
            java.lang.Double r6 = r6.mo12761c()
            double r6 = r6.doubleValue()
            double r6 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r6)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0394
            java.lang.Double.isNaN(r4)
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r1)
            goto L_0x0398
        L_0x0394:
            double r6 = java.lang.Math.min(r6, r4)
        L_0x0398:
            int r8 = r24.size()
            r10 = 2
            if (r8 != r10) goto L_0x03c7
            r8 = 1
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            java.lang.Double r0 = r0.mo12761c()
            double r10 = r0.doubleValue()
            double r10 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r10)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c3
            java.lang.Double.isNaN(r4)
            double r4 = r4 + r10
            double r4 = java.lang.Math.max(r4, r1)
            goto L_0x03c7
        L_0x03c3:
            double r4 = java.lang.Math.min(r4, r10)
        L_0x03c7:
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            int r1 = (int) r6
        L_0x03cd:
            double r2 = (double) r1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03e0
            com.google.android.gms.internal.measurement.q r2 = r9.mo12773t(r1)
            int r3 = r0.mo12772r()
            r0.mo12758A(r3, r2)
            int r1 = r1 + 1
            goto L_0x03cd
        L_0x03e0:
            return r0
        L_0x03e1:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r8, r1, r0)
            int r0 = r22.mo12772r()
            if (r0 != 0) goto L_0x03f2
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1536D
            goto L_0x03f9
        L_0x03f2:
            com.google.android.gms.internal.measurement.q r0 = r9.mo12773t(r1)
            r9.mo12780z(r1)
        L_0x03f9:
            return r0
        L_0x03fa:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r6, r1, r0)
            int r0 = r22.mo12772r()
            if (r0 == 0) goto L_0x0431
            r2 = 0
        L_0x0409:
            int r1 = r0 / 2
            if (r2 >= r1) goto L_0x0431
            boolean r1 = r9.mo12759B(r2)
            if (r1 == 0) goto L_0x042e
            com.google.android.gms.internal.measurement.q r1 = r9.mo12773t(r2)
            r3 = 0
            r9.mo12758A(r2, r3)
            int r3 = r0 + -1
            int r3 = r3 - r2
            boolean r4 = r9.mo12759B(r3)
            if (r4 == 0) goto L_0x042b
            com.google.android.gms.internal.measurement.q r4 = r9.mo12773t(r3)
            r9.mo12758A(r2, r4)
        L_0x042b:
            r9.mo12758A(r3, r1)
        L_0x042e:
            int r2 = r2 + 1
            goto L_0x0409
        L_0x0431:
            return r9
        L_0x0432:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.q r0 = m1791c(r9, r3, r0, r1)
            return r0
        L_0x043e:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.q r0 = m1791c(r9, r3, r0, r1)
            return r0
        L_0x044a:
            r9 = r22
            r3 = r23
            r0 = r24
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x0472
            java.util.Iterator r0 = r24.iterator()
        L_0x045a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0472
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C1261q) r1
            com.google.android.gms.internal.measurement.q r1 = r3.mo13062b(r1)
            int r2 = r22.mo12772r()
            r9.mo12758A(r2, r1)
            goto L_0x045a
        L_0x0472:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r22.mo12772r()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x0481:
            r9 = r22
            r0 = r24
            r2 = 0
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r13, r2, r0)
            int r0 = r22.mo12772r()
            if (r0 != 0) goto L_0x0492
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1536D
            goto L_0x049c
        L_0x0492:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.q r1 = r9.mo12773t(r0)
            r9.mo12780z(r0)
            r0 = r1
        L_0x049c:
            return r0
        L_0x049d:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            r4 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r14, r4, r0)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C1245p
            if (r2 == 0) goto L_0x04cc
            int r1 = r22.mo12772r()
            if (r1 != 0) goto L_0x04c4
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x04cb
        L_0x04c4:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C1245p) r0
            r1 = 0
            com.google.android.gms.internal.measurement.f r0 = m1790b(r9, r3, r0, r1, r1)
        L_0x04cb:
            return r0
        L_0x04cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04d2:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r15, r4, r0)
            com.google.android.gms.internal.measurement.q r4 = com.google.android.gms.internal.measurement.C1261q.f1536D
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x04ef
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.q r4 = (com.google.android.gms.internal.measurement.C1261q) r4
            com.google.android.gms.internal.measurement.q r4 = r3.mo13062b(r4)
        L_0x04ef:
            int r5 = r22.mo12772r()
            int r5 = r5 + -1
            double r5 = (double) r5
            int r7 = r24.size()
            r8 = 1
            if (r7 <= r8) goto L_0x0536
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            java.lang.Double r3 = r0.mo12761c()
            double r5 = r3.doubleValue()
            boolean r3 = java.lang.Double.isNaN(r5)
            if (r3 == 0) goto L_0x051d
            int r0 = r22.mo12772r()
            int r0 = r0 + -1
            double r5 = (double) r0
            goto L_0x0529
        L_0x051d:
            java.lang.Double r0 = r0.mo12761c()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r5)
        L_0x0529:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0536
            int r0 = r22.mo12772r()
            double r7 = (double) r0
            java.lang.Double.isNaN(r7)
            double r5 = r5 + r7
        L_0x0536:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0544
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x0578
        L_0x0544:
            int r0 = r22.mo12772r()
            double r0 = (double) r0
            double r0 = java.lang.Math.min(r0, r5)
            int r0 = (int) r0
        L_0x054e:
            if (r0 < 0) goto L_0x056f
            boolean r1 = r9.mo12759B(r0)
            if (r1 == 0) goto L_0x056c
            com.google.android.gms.internal.measurement.q r1 = r9.mo12773t(r0)
            boolean r1 = com.google.android.gms.internal.measurement.C1267q5.m2519l(r1, r4)
            if (r1 == 0) goto L_0x056c
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            r0 = r1
            goto L_0x0578
        L_0x056c:
            int r0 = r0 + -1
            goto L_0x054e
        L_0x056f:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x0578:
            return r0
        L_0x0579:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r12, r1, r0)
            int r1 = r22.mo12772r()
            if (r1 != 0) goto L_0x058c
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1543K
            goto L_0x05ba
        L_0x058c:
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x05ae
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1229o
            if (r1 != 0) goto L_0x05ab
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1339v
            if (r1 == 0) goto L_0x05a6
            goto L_0x05ab
        L_0x05a6:
            java.lang.String r0 = r0.mo12762d()
            goto L_0x05b0
        L_0x05ab:
            java.lang.String r0 = ""
            goto L_0x05b0
        L_0x05ae:
            java.lang.String r0 = ","
        L_0x05b0:
            com.google.android.gms.internal.measurement.u r1 = new com.google.android.gms.internal.measurement.u
            java.lang.String r0 = r9.mo12775u(r0)
            r1.<init>(r0)
            r0 = r1
        L_0x05ba:
            return r0
        L_0x05bb:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r5, r4, r0)
            com.google.android.gms.internal.measurement.q r4 = com.google.android.gms.internal.measurement.C1261q.f1536D
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x05d8
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.q r4 = (com.google.android.gms.internal.measurement.C1261q) r4
            com.google.android.gms.internal.measurement.q r4 = r3.mo13062b(r4)
        L_0x05d8:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0618
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            java.lang.Double r0 = r0.mo12761c()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C1267q5.m2508a(r5)
            int r0 = r22.mo12772r()
            double r7 = (double) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0608
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x064e
        L_0x0608:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0617
            int r0 = r22.mo12772r()
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r1 = r0 + r5
            goto L_0x0618
        L_0x0617:
            r1 = r5
        L_0x0618:
            java.util.Iterator r0 = r22.mo12776v()
        L_0x061c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0645
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            double r5 = (double) r3
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x061c
            com.google.android.gms.internal.measurement.q r3 = r9.mo12773t(r3)
            boolean r3 = com.google.android.gms.internal.measurement.C1267q5.m2519l(r3, r4)
            if (r3 == 0) goto L_0x061c
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x064e
        L_0x0645:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x064e:
            return r0
        L_0x064f:
            r1 = r21
            r9 = r22
            r0 = r24
            r2 = r3
            r4 = 1
            r3 = r23
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C1245p
            if (r2 == 0) goto L_0x067b
            int r1 = r22.mo12771o()
            if (r1 != 0) goto L_0x0672
            goto L_0x0678
        L_0x0672:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C1245p) r0
            r1 = 0
            m1790b(r9, r3, r0, r1, r1)
        L_0x0678:
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1536D
            return r0
        L_0x067b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0681:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = r20
            r4 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C1245p
            if (r2 == 0) goto L_0x06e1
            int r1 = r22.mo12771o()
            if (r1 != 0) goto L_0x06aa
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x06e0
        L_0x06aa:
            com.google.android.gms.internal.measurement.q r1 = r22.mo12760b()
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C1245p) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            com.google.android.gms.internal.measurement.f r0 = m1790b(r9, r3, r0, r4, r2)
            com.google.android.gms.internal.measurement.f r2 = new com.google.android.gms.internal.measurement.f
            r2.<init>()
            java.util.Iterator r0 = r0.mo12776v()
        L_0x06c0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06df
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C1085f) r4
            com.google.android.gms.internal.measurement.q r3 = r4.mo12773t(r3)
            int r4 = r2.mo12772r()
            r2.mo12758A(r4, r3)
            goto L_0x06c0
        L_0x06df:
            r0 = r2
        L_0x06e0:
            return r0
        L_0x06e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x06e7:
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r24
            r4 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2515h(r9, r4, r0)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C1261q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo13062b(r0)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.C1245p
            if (r4 == 0) goto L_0x0722
            int r1 = r22.mo12772r()
            if (r1 != 0) goto L_0x070b
        L_0x0708:
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1541I
            goto L_0x0721
        L_0x070b:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C1245p) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.f r0 = m1790b(r2, r3, r0, r1, r4)
            int r0 = r0.mo12772r()
            int r1 = r22.mo12772r()
            if (r0 == r1) goto L_0x0708
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C1261q.f1542J
        L_0x0721:
            return r0
        L_0x0722:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0728:
            r2 = r22
            r3 = r23
            r0 = r24
            com.google.android.gms.internal.measurement.q r1 = r22.mo12760b()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x078a
            java.util.Iterator r0 = r24.iterator()
        L_0x073c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x078a
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C1261q) r2
            com.google.android.gms.internal.measurement.q r2 = r3.mo13062b(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r4 != 0) goto L_0x0782
            r4 = r1
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C1085f) r4
            int r5 = r4.mo12772r()
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.C1085f
            if (r6 == 0) goto L_0x077e
            com.google.android.gms.internal.measurement.f r2 = (com.google.android.gms.internal.measurement.C1085f) r2
            java.util.Iterator r6 = r2.mo12776v()
        L_0x0761:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x073c
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            com.google.android.gms.internal.measurement.q r7 = r2.mo12773t(r7)
            int r8 = r8 + r5
            r4.mo12758A(r8, r7)
            goto L_0x0761
        L_0x077e:
            r4.mo12758A(r5, r2)
            goto L_0x073c
        L_0x0782:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x078a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1054d0.m1789a(java.lang.String, com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.p4, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: b */
    private static C1085f m1790b(C1085f fVar, C1250p4 p4Var, C1149j jVar, Boolean bool, Boolean bool2) {
        C1085f fVar2 = new C1085f();
        Iterator v = fVar.mo12776v();
        while (v.hasNext()) {
            int intValue = ((Integer) v.next()).intValue();
            if (fVar.mo12759B(intValue)) {
                C1261q a = jVar.mo12586a(p4Var, Arrays.asList(new C1261q[]{fVar.mo12773t(intValue), new C1133i(Double.valueOf((double) intValue)), fVar}));
                if (a.mo12763e().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || a.mo12763e().equals(bool2)) {
                    fVar2.mo12758A(intValue, a);
                }
            }
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.C1261q m1791c(com.google.android.gms.internal.measurement.C1085f r9, com.google.android.gms.internal.measurement.C1250p4 r10, java.util.List r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.C1267q5.m2516i(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.C1267q5.m2517j(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C1261q) r3
            com.google.android.gms.internal.measurement.q r3 = r10.mo13062b(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C1149j
            if (r4 == 0) goto L_0x00a0
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.q r11 = (com.google.android.gms.internal.measurement.C1261q) r11
            com.google.android.gms.internal.measurement.q r11 = r10.mo13062b(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.mo12772r()
            if (r11 == 0) goto L_0x0098
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.j r3 = (com.google.android.gms.internal.measurement.C1149j) r3
            int r4 = r9.mo12772r()
            if (r12 == 0) goto L_0x0047
            r5 = 0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.q r11 = r9.mo12773t(r5)
            goto L_0x0095
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0097
            boolean r12 = r9.mo12759B(r5)
            if (r12 == 0) goto L_0x0095
            r12 = 4
            com.google.android.gms.internal.measurement.q[] r12 = new com.google.android.gms.internal.measurement.C1261q[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.q r11 = r9.mo12773t(r5)
            r12[r1] = r11
            com.google.android.gms.internal.measurement.i r11 = new com.google.android.gms.internal.measurement.i
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.q r11 = r3.mo12586a(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.C1117h
            if (r12 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            goto L_0x00a9
        L_0x00a8:
            throw r9
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1054d0.m1791c(com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.p4, java.util.List, boolean):com.google.android.gms.internal.measurement.q");
    }
}
