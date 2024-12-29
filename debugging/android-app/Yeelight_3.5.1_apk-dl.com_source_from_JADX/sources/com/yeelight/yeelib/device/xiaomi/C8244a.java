package com.yeelight.yeelib.device.xiaomi;

import com.yeelight.yeelib.device.base.C6100g;
import p223w3.C10650b0;
import p223w3.C10701c0;
import p223w3.C10776d0;
import p223w3.C10838e0;
import p223w3.C11405l0;
import p223w3.C11451m0;
import p223w3.C11510n0;
import p223w3.C11541o0;
import p223w3.C11626q0;
import p223w3.C11640r0;
import p223w3.C11670s0;
import p223w3.C11698t0;
import p223w3.C11729u0;
import p223w3.C11762v0;
import p223w3.C11911z;

/* renamed from: com.yeelight.yeelib.device.xiaomi.a */
public class C8244a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yeelight.yeelib.device.base.C6100g m19442a(com.p022mi.iot.common.abstractdevice.AbstractDevice r17) {
        /*
            r0 = 0
            if (r17 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.mi.iot.common.instance.Device r1 = r17.getDevice()
            com.mi.iot.common.urn.UrnType r1 = r1.getDeviceType()
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = com.yeelight.yeelib.data.DeviceBrowserContract.DeviceBrowser.m17585a(r1)
            r4.hashCode()
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
                case -1282176368: goto L_0x00ec;
                case -1235140472: goto L_0x00e0;
                case -1235140471: goto L_0x00d4;
                case -1235140468: goto L_0x00c6;
                case -1235140467: goto L_0x00b8;
                case -1035626052: goto L_0x00ad;
                case -1035596261: goto L_0x00a2;
                case -850921852: goto L_0x0097;
                case -443031172: goto L_0x008a;
                case 674030242: goto L_0x007d;
                case 1201766335: goto L_0x0070;
                case 1201766336: goto L_0x0063;
                case 2102612488: goto L_0x0056;
                case 2102612489: goto L_0x0049;
                case 2146130361: goto L_0x003c;
                default: goto L_0x0038;
            }
        L_0x0038:
            r16 = -1
            goto L_0x00f7
        L_0x003c:
            boolean r2 = r4.equals(r3)
            if (r2 != 0) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            r2 = 14
            r16 = 14
            goto L_0x00f7
        L_0x0049:
            boolean r2 = r4.equals(r5)
            if (r2 != 0) goto L_0x0050
            goto L_0x0038
        L_0x0050:
            r2 = 13
            r16 = 13
            goto L_0x00f7
        L_0x0056:
            boolean r2 = r4.equals(r6)
            if (r2 != 0) goto L_0x005d
            goto L_0x0038
        L_0x005d:
            r2 = 12
            r16 = 12
            goto L_0x00f7
        L_0x0063:
            boolean r2 = r4.equals(r7)
            if (r2 != 0) goto L_0x006a
            goto L_0x0038
        L_0x006a:
            r2 = 11
            r16 = 11
            goto L_0x00f7
        L_0x0070:
            boolean r2 = r4.equals(r8)
            if (r2 != 0) goto L_0x0077
            goto L_0x0038
        L_0x0077:
            r2 = 10
            r16 = 10
            goto L_0x00f7
        L_0x007d:
            boolean r2 = r4.equals(r9)
            if (r2 != 0) goto L_0x0084
            goto L_0x0038
        L_0x0084:
            r2 = 9
            r16 = 9
            goto L_0x00f7
        L_0x008a:
            boolean r2 = r4.equals(r10)
            if (r2 != 0) goto L_0x0091
            goto L_0x0038
        L_0x0091:
            r2 = 8
            r16 = 8
            goto L_0x00f7
        L_0x0097:
            boolean r2 = r4.equals(r11)
            if (r2 != 0) goto L_0x009e
            goto L_0x0038
        L_0x009e:
            r2 = 7
            r16 = 7
            goto L_0x00f7
        L_0x00a2:
            boolean r2 = r4.equals(r12)
            if (r2 != 0) goto L_0x00a9
            goto L_0x0038
        L_0x00a9:
            r2 = 6
            r16 = 6
            goto L_0x00f7
        L_0x00ad:
            boolean r2 = r4.equals(r13)
            if (r2 != 0) goto L_0x00b4
            goto L_0x0038
        L_0x00b4:
            r2 = 5
            r16 = 5
            goto L_0x00f7
        L_0x00b8:
            java.lang.String r2 = "yeelink.light.fancl6"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00c2
            goto L_0x0038
        L_0x00c2:
            r2 = 4
            r16 = 4
            goto L_0x00f7
        L_0x00c6:
            java.lang.String r2 = "yeelink.light.fancl5"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00d0
            goto L_0x0038
        L_0x00d0:
            r2 = 3
            r16 = 3
            goto L_0x00f7
        L_0x00d4:
            boolean r2 = r4.equals(r14)
            if (r2 != 0) goto L_0x00dc
            goto L_0x0038
        L_0x00dc:
            r2 = 2
            r16 = 2
            goto L_0x00f7
        L_0x00e0:
            boolean r2 = r4.equals(r15)
            if (r2 != 0) goto L_0x00e8
            goto L_0x0038
        L_0x00e8:
            r2 = 1
            r16 = 1
            goto L_0x00f7
        L_0x00ec:
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L_0x00f4
            goto L_0x0038
        L_0x00f4:
            r2 = 0
            r16 = 0
        L_0x00f7:
            switch(r16) {
                case 0: goto L_0x0235;
                case 1: goto L_0x021f;
                case 2: goto L_0x0209;
                case 3: goto L_0x01f0;
                case 4: goto L_0x01d7;
                case 5: goto L_0x01c1;
                case 6: goto L_0x01ab;
                case 7: goto L_0x0195;
                case 8: goto L_0x017f;
                case 9: goto L_0x0169;
                case 10: goto L_0x0153;
                case 11: goto L_0x013d;
                case 12: goto L_0x0127;
                case 13: goto L_0x0111;
                case 14: goto L_0x00fb;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            return r0
        L_0x00fb:
            w3.o0 r0 = new w3.o0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r4 = r17.getDevice()
            java.lang.String r4 = r4.getRealID()
            r0.<init>(r1, r3, r2, r4)
            return r0
        L_0x0111:
            w3.m0 r0 = new w3.m0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r5, r2, r3)
            return r0
        L_0x0127:
            w3.l0 r0 = new w3.l0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r6, r2, r3)
            return r0
        L_0x013d:
            w3.v0 r0 = new w3.v0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r7, r2, r3)
            return r0
        L_0x0153:
            w3.u0 r0 = new w3.u0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r8, r2, r3)
            return r0
        L_0x0169:
            w3.z r0 = new w3.z
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r9, r2, r3)
            return r0
        L_0x017f:
            w3.t0 r0 = new w3.t0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r10, r2, r3)
            return r0
        L_0x0195:
            w3.s0 r0 = new w3.s0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r11, r2, r3)
            return r0
        L_0x01ab:
            w3.r0 r0 = new w3.r0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r12, r2, r3)
            return r0
        L_0x01c1:
            w3.q0 r0 = new w3.q0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r13, r2, r3)
            return r0
        L_0x01d7:
            w3.e0 r0 = new w3.e0
            java.lang.String r3 = r17.getDeviceId()
            java.lang.String r5 = r17.getName()
            r6 = 2431(0x97f, float:3.407E-42)
            com.mi.iot.common.instance.Device r1 = r17.getDevice()
            java.lang.String r7 = r1.getRealID()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x01f0:
            w3.d0 r0 = new w3.d0
            java.lang.String r3 = r17.getDeviceId()
            java.lang.String r5 = r17.getName()
            r6 = 2214(0x8a6, float:3.102E-42)
            com.mi.iot.common.instance.Device r1 = r17.getDevice()
            java.lang.String r7 = r1.getRealID()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0209:
            w3.c0 r0 = new w3.c0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r14, r2, r3)
            return r0
        L_0x021f:
            w3.b0 r0 = new w3.b0
            java.lang.String r1 = r17.getDeviceId()
            java.lang.String r2 = r17.getName()
            com.mi.iot.common.instance.Device r3 = r17.getDevice()
            java.lang.String r3 = r3.getRealID()
            r0.<init>(r1, r15, r2, r3)
            return r0
        L_0x0235:
            w3.n0 r0 = new w3.n0
            java.lang.String r2 = r17.getDeviceId()
            java.lang.String r3 = r17.getName()
            com.mi.iot.common.instance.Device r4 = r17.getDevice()
            java.lang.String r4 = r4.getRealID()
            r0.<init>(r2, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.C8244a.m19442a(com.mi.iot.common.abstractdevice.AbstractDevice):com.yeelight.yeelib.device.base.g");
    }

    /* renamed from: b */
    public static C6100g m19443b(String str, String str2, String str3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = 0;
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = 1;
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = 2;
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = 3;
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = 4;
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = 5;
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = 6;
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = 7;
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 8;
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 9;
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 10;
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 11;
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 12;
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 13;
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C11510n0(str2, str, str3, "");
            case 1:
                return new C10650b0(str2, str, str3, "");
            case 2:
                return new C10701c0(str2, str, str3, "");
            case 3:
                return new C10776d0(str2, str, str3, 2214, "");
            case 4:
                return new C10838e0(str2, str, str3, 2431, "");
            case 5:
                return new C11626q0(str2, str, str3, "");
            case 6:
                return new C11640r0(str2, str, str3, "");
            case 7:
                return new C11670s0(str2, str, str3, "");
            case 8:
                return new C11698t0(str2, str, str3, "");
            case 9:
                return new C11911z(str2, str, str3, "");
            case 10:
                return new C11729u0(str2, str, str3, "");
            case 11:
                return new C11762v0(str2, str, str3, "");
            case 12:
                return new C11405l0(str2, str, str3, "");
            case 13:
                return new C11451m0(str2, str, str3, "");
            case 14:
                return new C11541o0(str2, str, str3, "");
            default:
                return null;
        }
    }
}
