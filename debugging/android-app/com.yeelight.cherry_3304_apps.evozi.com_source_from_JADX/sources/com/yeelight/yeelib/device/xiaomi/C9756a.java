package com.yeelight.yeelib.device.xiaomi;

/* renamed from: com.yeelight.yeelib.device.xiaomi.a */
public class C9756a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yeelight.yeelib.p150c.p151i.C6050n m23653a(com.p146mi.iot.common.abstractdevice.AbstractDevice r16) {
        /*
            r0 = 0
            if (r16 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.mi.iot.common.instance.Device r1 = r16.getDevice()
            com.mi.iot.common.urn.UrnType r1 = r1.getDeviceType()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = com.yeelight.yeelib.data.C7574b.C7575a.m22443a(r1)
            int r2 = r4.hashCode()
            java.lang.String r3 = "yeelink.light.dnlight2"
            java.lang.String r5 = "yeelink.light.meshbulb2"
            java.lang.String r6 = "yeelink.light.meshbulb1"
            java.lang.String r7 = "yeelink.light.ml2"
            java.lang.String r8 = "yeelink.light.ml1"
            java.lang.String r9 = "yeelink.curtain.ctmt1"
            java.lang.String r10 = "yeelink.light.spot1"
            java.lang.String r11 = "yeelink.light.sp1grp"
            java.lang.String r12 = "yeelink.light.mb2grp"
            java.lang.String r13 = "yeelink.light.mb1grp"
            java.lang.String r14 = "yeelink.light.fancl2"
            java.lang.String r15 = "yeelink.light.fancl1"
            java.lang.String r1 = "yeelink.light.dn2grp"
            switch(r2) {
                case -1282176368: goto L_0x00b6;
                case -1235140472: goto L_0x00ad;
                case -1235140471: goto L_0x00a4;
                case -1235140468: goto L_0x0099;
                case -1235140467: goto L_0x008e;
                case -1035626052: goto L_0x0086;
                case -1035596261: goto L_0x007e;
                case -850921852: goto L_0x0076;
                case -443031172: goto L_0x006e;
                case 674030242: goto L_0x0065;
                case 1201766335: goto L_0x005c;
                case 1201766336: goto L_0x0052;
                case 2102612488: goto L_0x0049;
                case 2102612489: goto L_0x0040;
                case 2146130361: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x00be
        L_0x0037:
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x00be
            r2 = 0
            goto L_0x00bf
        L_0x0040:
            boolean r2 = r4.equals(r5)
            if (r2 == 0) goto L_0x00be
            r2 = 2
            goto L_0x00bf
        L_0x0049:
            boolean r2 = r4.equals(r6)
            if (r2 == 0) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x0052:
            boolean r2 = r4.equals(r7)
            if (r2 == 0) goto L_0x00be
            r2 = 9
            goto L_0x00bf
        L_0x005c:
            boolean r2 = r4.equals(r8)
            if (r2 == 0) goto L_0x00be
            r2 = 8
            goto L_0x00bf
        L_0x0065:
            boolean r2 = r4.equals(r9)
            if (r2 == 0) goto L_0x00be
            r2 = 10
            goto L_0x00bf
        L_0x006e:
            boolean r2 = r4.equals(r10)
            if (r2 == 0) goto L_0x00be
            r2 = 3
            goto L_0x00bf
        L_0x0076:
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L_0x00be
            r2 = 7
            goto L_0x00bf
        L_0x007e:
            boolean r2 = r4.equals(r12)
            if (r2 == 0) goto L_0x00be
            r2 = 6
            goto L_0x00bf
        L_0x0086:
            boolean r2 = r4.equals(r13)
            if (r2 == 0) goto L_0x00be
            r2 = 5
            goto L_0x00bf
        L_0x008e:
            java.lang.String r2 = "yeelink.light.fancl6"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00be
            r2 = 14
            goto L_0x00bf
        L_0x0099:
            java.lang.String r2 = "yeelink.light.fancl5"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00be
            r2 = 13
            goto L_0x00bf
        L_0x00a4:
            boolean r2 = r4.equals(r14)
            if (r2 == 0) goto L_0x00be
            r2 = 12
            goto L_0x00bf
        L_0x00ad:
            boolean r2 = r4.equals(r15)
            if (r2 == 0) goto L_0x00be
            r2 = 11
            goto L_0x00bf
        L_0x00b6:
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x00be
            r2 = 4
            goto L_0x00bf
        L_0x00be:
            r2 = -1
        L_0x00bf:
            switch(r2) {
                case 0: goto L_0x01fd;
                case 1: goto L_0x01e7;
                case 2: goto L_0x01d1;
                case 3: goto L_0x01bb;
                case 4: goto L_0x01a5;
                case 5: goto L_0x018f;
                case 6: goto L_0x0179;
                case 7: goto L_0x0163;
                case 8: goto L_0x014d;
                case 9: goto L_0x0137;
                case 10: goto L_0x0121;
                case 11: goto L_0x010b;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00dc;
                case 14: goto L_0x00c3;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            return r0
        L_0x00c3:
            com.yeelight.yeelib.c.m.d0 r0 = new com.yeelight.yeelib.c.m.d0
            java.lang.String r3 = r16.getDeviceId()
            java.lang.String r5 = r16.getName()
            r6 = 2431(0x97f, float:3.407E-42)
            com.mi.iot.common.instance.Device r1 = r16.getDevice()
            java.lang.String r7 = r1.getRealID()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x00dc:
            com.yeelight.yeelib.c.m.c0 r0 = new com.yeelight.yeelib.c.m.c0
            java.lang.String r3 = r16.getDeviceId()
            java.lang.String r5 = r16.getName()
            r6 = 2214(0x8a6, float:3.102E-42)
            com.mi.iot.common.instance.Device r1 = r16.getDevice()
            java.lang.String r7 = r1.getRealID()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x00f5:
            com.yeelight.yeelib.c.m.b0 r0 = new com.yeelight.yeelib.c.m.b0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r14, r2, r3)
            return r0
        L_0x010b:
            com.yeelight.yeelib.c.m.a0 r0 = new com.yeelight.yeelib.c.m.a0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r15, r2, r3)
            return r0
        L_0x0121:
            com.yeelight.yeelib.c.m.y r0 = new com.yeelight.yeelib.c.m.y
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r9, r2, r3)
            return r0
        L_0x0137:
            com.yeelight.yeelib.c.m.u0 r0 = new com.yeelight.yeelib.c.m.u0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r7, r2, r3)
            return r0
        L_0x014d:
            com.yeelight.yeelib.c.m.t0 r0 = new com.yeelight.yeelib.c.m.t0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r8, r2, r3)
            return r0
        L_0x0163:
            com.yeelight.yeelib.c.m.r0 r0 = new com.yeelight.yeelib.c.m.r0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r11, r2, r3)
            return r0
        L_0x0179:
            com.yeelight.yeelib.c.m.q0 r0 = new com.yeelight.yeelib.c.m.q0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r12, r2, r3)
            return r0
        L_0x018f:
            com.yeelight.yeelib.c.m.p0 r0 = new com.yeelight.yeelib.c.m.p0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r13, r2, r3)
            return r0
        L_0x01a5:
            com.yeelight.yeelib.c.m.m0 r0 = new com.yeelight.yeelib.c.m.m0
            java.lang.String r2 = r16.getDeviceId()
            java.lang.String r3 = r16.getName()
            com.mi.iot.common.instance.Device r4 = r16.getDevice()
            java.lang.String r4 = r4.getRealID()
            r0.<init>(r2, r1, r3, r4)
            return r0
        L_0x01bb:
            com.yeelight.yeelib.c.m.s0 r0 = new com.yeelight.yeelib.c.m.s0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r10, r2, r3)
            return r0
        L_0x01d1:
            com.yeelight.yeelib.c.m.l0 r0 = new com.yeelight.yeelib.c.m.l0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r5, r2, r3)
            return r0
        L_0x01e7:
            com.yeelight.yeelib.c.m.k0 r0 = new com.yeelight.yeelib.c.m.k0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r3 = r16.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r6, r2, r3)
            return r0
        L_0x01fd:
            com.yeelight.yeelib.c.m.n0 r0 = new com.yeelight.yeelib.c.m.n0
            java.lang.String r1 = r16.getDeviceId()
            java.lang.String r2 = r16.getName()
            com.mi.iot.common.instance.Device r4 = r16.getDevice()
            java.lang.String r4 = r4.getRealID()
            r0.<init>(r1, r3, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.C9756a.m23653a(com.mi.iot.common.abstractdevice.AbstractDevice):com.yeelight.yeelib.c.i.n");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yeelight.yeelib.p150c.p151i.C6050n m23654b(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = r7.hashCode()
            switch(r0) {
                case -1282176368: goto L_0x00a1;
                case -1235140472: goto L_0x0096;
                case -1235140471: goto L_0x008b;
                case -1235140468: goto L_0x0080;
                case -1235140467: goto L_0x0075;
                case -1035626052: goto L_0x006b;
                case -1035596261: goto L_0x0061;
                case -850921852: goto L_0x0057;
                case -443031172: goto L_0x004d;
                case 674030242: goto L_0x0042;
                case 1201766335: goto L_0x0036;
                case 1201766336: goto L_0x002a;
                case 2102612488: goto L_0x001f;
                case 2102612489: goto L_0x0014;
                case 2146130361: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x00ab
        L_0x0009:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            goto L_0x00ac
        L_0x0014:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 2
            goto L_0x00ac
        L_0x001f:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 1
            goto L_0x00ac
        L_0x002a:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 9
            goto L_0x00ac
        L_0x0036:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 8
            goto L_0x00ac
        L_0x0042:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 10
            goto L_0x00ac
        L_0x004d:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 3
            goto L_0x00ac
        L_0x0057:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 7
            goto L_0x00ac
        L_0x0061:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 6
            goto L_0x00ac
        L_0x006b:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 5
            goto L_0x00ac
        L_0x0075:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 14
            goto L_0x00ac
        L_0x0080:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 13
            goto L_0x00ac
        L_0x008b:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 12
            goto L_0x00ac
        L_0x0096:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 11
            goto L_0x00ac
        L_0x00a1:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 4
            goto L_0x00ac
        L_0x00ab:
            r0 = -1
        L_0x00ac:
            java.lang.String r4 = ""
            switch(r0) {
                case 0: goto L_0x0117;
                case 1: goto L_0x0111;
                case 2: goto L_0x010b;
                case 3: goto L_0x0105;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00f3;
                case 7: goto L_0x00ed;
                case 8: goto L_0x00e7;
                case 9: goto L_0x00e1;
                case 10: goto L_0x00db;
                case 11: goto L_0x00d5;
                case 12: goto L_0x00cf;
                case 13: goto L_0x00c1;
                case 14: goto L_0x00b3;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            r0 = 0
            return r0
        L_0x00b3:
            com.yeelight.yeelib.c.m.d0 r6 = new com.yeelight.yeelib.c.m.d0
            r4 = 2431(0x97f, float:3.407E-42)
            java.lang.String r5 = ""
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x00c1:
            com.yeelight.yeelib.c.m.c0 r6 = new com.yeelight.yeelib.c.m.c0
            r4 = 2214(0x8a6, float:3.102E-42)
            java.lang.String r5 = ""
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x00cf:
            com.yeelight.yeelib.c.m.b0 r0 = new com.yeelight.yeelib.c.m.b0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00d5:
            com.yeelight.yeelib.c.m.a0 r0 = new com.yeelight.yeelib.c.m.a0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00db:
            com.yeelight.yeelib.c.m.y r0 = new com.yeelight.yeelib.c.m.y
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00e1:
            com.yeelight.yeelib.c.m.u0 r0 = new com.yeelight.yeelib.c.m.u0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00e7:
            com.yeelight.yeelib.c.m.t0 r0 = new com.yeelight.yeelib.c.m.t0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00ed:
            com.yeelight.yeelib.c.m.r0 r0 = new com.yeelight.yeelib.c.m.r0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00f3:
            com.yeelight.yeelib.c.m.q0 r0 = new com.yeelight.yeelib.c.m.q0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00f9:
            com.yeelight.yeelib.c.m.p0 r0 = new com.yeelight.yeelib.c.m.p0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x00ff:
            com.yeelight.yeelib.c.m.m0 r0 = new com.yeelight.yeelib.c.m.m0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x0105:
            com.yeelight.yeelib.c.m.s0 r0 = new com.yeelight.yeelib.c.m.s0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x010b:
            com.yeelight.yeelib.c.m.l0 r0 = new com.yeelight.yeelib.c.m.l0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x0111:
            com.yeelight.yeelib.c.m.k0 r0 = new com.yeelight.yeelib.c.m.k0
            r0.<init>(r8, r7, r9, r4)
            return r0
        L_0x0117:
            com.yeelight.yeelib.c.m.n0 r0 = new com.yeelight.yeelib.c.m.n0
            r0.<init>(r8, r7, r9, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.C9756a.m23654b(java.lang.String, java.lang.String, java.lang.String):com.yeelight.yeelib.c.i.n");
    }
}
