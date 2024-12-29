package com.yeelight.yeelib.utils;

import android.graphics.Color;

/* renamed from: com.yeelight.yeelib.utils.f */
public class C10542f {
    /* renamed from: a */
    public static float m25732a(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i > 100) {
            i = 100;
        }
        return (((float) i) * 0.0025f) + 0.7f;
    }

    /* renamed from: b */
    public static int m25733b(int i, int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = m25732a(i2);
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public static int m25734c(int i, int i2, String str) {
        return Color.HSVToColor(new float[]{41.0f, m25739h(i, str), m25732a(i2)});
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float m25735d(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1400275319: goto L_0x00c2;
                case -1308146488: goto L_0x00b8;
                case -1063384694: goto L_0x00ad;
                case -449944730: goto L_0x00a2;
                case -449944727: goto L_0x0097;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r0) {
                case -1308146495: goto L_0x008d;
                case -1308146494: goto L_0x0083;
                case -1308146493: goto L_0x0079;
                case -1308146492: goto L_0x006f;
                case -1308146491: goto L_0x0065;
                case -1308146490: goto L_0x005a;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case -1308146447: goto L_0x004e;
                case -1308146446: goto L_0x0042;
                case -1308146445: goto L_0x0036;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case -449944724: goto L_0x002a;
                case -449944723: goto L_0x001e;
                case -449944722: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x00cc
        L_0x0012:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 16
            goto L_0x00cd
        L_0x001e:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 15
            goto L_0x00cd
        L_0x002a:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 14
            goto L_0x00cd
        L_0x0036:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 10
            goto L_0x00cd
        L_0x0042:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 9
            goto L_0x00cd
        L_0x004e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 8
            goto L_0x00cd
        L_0x005a:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 6
            goto L_0x00cd
        L_0x0065:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 5
            goto L_0x00cd
        L_0x006f:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 4
            goto L_0x00cd
        L_0x0079:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 3
            goto L_0x00cd
        L_0x0083:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 2
            goto L_0x00cd
        L_0x008d:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x0097:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 13
            goto L_0x00cd
        L_0x00a2:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 12
            goto L_0x00cd
        L_0x00ad:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 11
            goto L_0x00cd
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 7
            goto L_0x00cd
        L_0x00c2:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 0
            goto L_0x00cd
        L_0x00cc:
            r1 = -1
        L_0x00cd:
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00d5;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00d5;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00d5;
                case 12: goto L_0x00d3;
                case 13: goto L_0x00d3;
                case 14: goto L_0x00d3;
                case 15: goto L_0x00d3;
                case 16: goto L_0x00d3;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x00d5
        L_0x00d3:
            r0 = 1063256064(0x3f600000, float:0.875)
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.C10542f.m25735d(java.lang.String):float");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m25736e(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1400275319: goto L_0x00c2;
                case -1308146488: goto L_0x00b8;
                case -1063384694: goto L_0x00ad;
                case -449944730: goto L_0x00a2;
                case -449944727: goto L_0x0097;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r0) {
                case -1308146495: goto L_0x008d;
                case -1308146494: goto L_0x0083;
                case -1308146493: goto L_0x0079;
                case -1308146492: goto L_0x006f;
                case -1308146491: goto L_0x0065;
                case -1308146490: goto L_0x005a;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case -1308146447: goto L_0x004e;
                case -1308146446: goto L_0x0042;
                case -1308146445: goto L_0x0036;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case -449944724: goto L_0x002a;
                case -449944723: goto L_0x001e;
                case -449944722: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x00cc
        L_0x0012:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 15
            goto L_0x00cd
        L_0x001e:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 14
            goto L_0x00cd
        L_0x002a:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 13
            goto L_0x00cd
        L_0x0036:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 10
            goto L_0x00cd
        L_0x0042:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 9
            goto L_0x00cd
        L_0x004e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 8
            goto L_0x00cd
        L_0x005a:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 6
            goto L_0x00cd
        L_0x0065:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 5
            goto L_0x00cd
        L_0x006f:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 4
            goto L_0x00cd
        L_0x0079:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 3
            goto L_0x00cd
        L_0x0083:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 2
            goto L_0x00cd
        L_0x008d:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x0097:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 12
            goto L_0x00cd
        L_0x00a2:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 11
            goto L_0x00cd
        L_0x00ad:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 16
            goto L_0x00cd
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 7
            goto L_0x00cd
        L_0x00c2:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 0
            goto L_0x00cd
        L_0x00cc:
            r1 = -1
        L_0x00cd:
            switch(r1) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00d0;
                case 9: goto L_0x00d0;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00d0;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00d0;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00d0;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r1 = 6500(0x1964, float:9.108E-42)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.C10542f.m25736e(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float m25737f(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1400275319: goto L_0x00c2;
                case -1308146488: goto L_0x00b8;
                case -1063384694: goto L_0x00ad;
                case -449944730: goto L_0x00a2;
                case -449944727: goto L_0x0097;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r0) {
                case -1308146495: goto L_0x008d;
                case -1308146494: goto L_0x0083;
                case -1308146493: goto L_0x0079;
                case -1308146492: goto L_0x006f;
                case -1308146491: goto L_0x0065;
                case -1308146490: goto L_0x005a;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case -1308146447: goto L_0x004e;
                case -1308146446: goto L_0x0042;
                case -1308146445: goto L_0x0036;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case -449944724: goto L_0x002a;
                case -449944723: goto L_0x001e;
                case -449944722: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x00cc
        L_0x0012:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 15
            goto L_0x00cd
        L_0x001e:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 14
            goto L_0x00cd
        L_0x002a:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 13
            goto L_0x00cd
        L_0x0036:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 10
            goto L_0x00cd
        L_0x0042:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 9
            goto L_0x00cd
        L_0x004e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 8
            goto L_0x00cd
        L_0x005a:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 6
            goto L_0x00cd
        L_0x0065:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 5
            goto L_0x00cd
        L_0x006f:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 4
            goto L_0x00cd
        L_0x0079:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 3
            goto L_0x00cd
        L_0x0083:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 2
            goto L_0x00cd
        L_0x008d:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x0097:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 12
            goto L_0x00cd
        L_0x00a2:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 11
            goto L_0x00cd
        L_0x00ad:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 16
            goto L_0x00cd
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 7
            goto L_0x00cd
        L_0x00c2:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00cc
            r1 = 0
            goto L_0x00cd
        L_0x00cc:
            r1 = -1
        L_0x00cd:
            switch(r1) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00d0;
                case 9: goto L_0x00d0;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00d0;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00d0;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00d0;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r1 = 1053609165(0x3ecccccd, float:0.4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.C10542f.m25737f(java.lang.String):float");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m25738g(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x02b1;
                case -1462015191: goto L_0x02a6;
                case -1462015190: goto L_0x029b;
                case -1462015189: goto L_0x0290;
                case -1462015188: goto L_0x0285;
                case -1462015187: goto L_0x027a;
                case -1462015186: goto L_0x026f;
                case -1462015185: goto L_0x0264;
                case -1462015184: goto L_0x0259;
                case -1462015183: goto L_0x024d;
                case -1462015182: goto L_0x0241;
                case -1462015160: goto L_0x0235;
                case -1462015159: goto L_0x0229;
                case -1462015158: goto L_0x021d;
                case -1462015157: goto L_0x0211;
                case -1462015156: goto L_0x0205;
                case -1400275319: goto L_0x01fa;
                case -1317475940: goto L_0x01ee;
                case -1317475939: goto L_0x01e2;
                case -1317475937: goto L_0x01d6;
                case -1317475915: goto L_0x01ca;
                case -1317475914: goto L_0x01be;
                case -1317475913: goto L_0x01b2;
                case -1317475912: goto L_0x01a6;
                case -1308146495: goto L_0x019b;
                case -1308146494: goto L_0x0190;
                case -1308146493: goto L_0x0185;
                case -1308146492: goto L_0x017a;
                case -1308146491: goto L_0x016f;
                case -1308146490: goto L_0x0164;
                case -1308146488: goto L_0x0159;
                case -1308146447: goto L_0x014d;
                case -1308146446: goto L_0x0141;
                case -1308146445: goto L_0x0135;
                case -1235140472: goto L_0x0129;
                case -1235140471: goto L_0x011d;
                case -1235140468: goto L_0x0111;
                case -1235140467: goto L_0x0105;
                case -1063384694: goto L_0x00f9;
                case -1063384689: goto L_0x00ed;
                case -888668266: goto L_0x00e1;
                case -888668265: goto L_0x00d5;
                case -888668264: goto L_0x00c9;
                case -458141175: goto L_0x00bd;
                case -458141174: goto L_0x00b1;
                case -458141173: goto L_0x00a5;
                case -458141172: goto L_0x0099;
                case -449944730: goto L_0x008d;
                case -449944727: goto L_0x0081;
                case -449944724: goto L_0x0075;
                case -449944723: goto L_0x0069;
                case -449944722: goto L_0x005d;
                case 922669543: goto L_0x0051;
                case 922669545: goto L_0x0045;
                case 922669546: goto L_0x0039;
                case 922669547: goto L_0x002d;
                case 922669548: goto L_0x0021;
                case 922669549: goto L_0x0015;
                case 922669550: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x02bc
        L_0x0009:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 19
            goto L_0x02bd
        L_0x0015:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 18
            goto L_0x02bd
        L_0x0021:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 17
            goto L_0x02bd
        L_0x002d:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 16
            goto L_0x02bd
        L_0x0039:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 15
            goto L_0x02bd
        L_0x0045:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 14
            goto L_0x02bd
        L_0x0051:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 13
            goto L_0x02bd
        L_0x005d:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 53
            goto L_0x02bd
        L_0x0069:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 52
            goto L_0x02bd
        L_0x0075:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 51
            goto L_0x02bd
        L_0x0081:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 50
            goto L_0x02bd
        L_0x008d:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 12
            goto L_0x02bd
        L_0x0099:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 45
            goto L_0x02bd
        L_0x00a5:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 44
            goto L_0x02bd
        L_0x00b1:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 43
            goto L_0x02bd
        L_0x00bd:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 42
            goto L_0x02bd
        L_0x00c9:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 48
            goto L_0x02bd
        L_0x00d5:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 47
            goto L_0x02bd
        L_0x00e1:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 46
            goto L_0x02bd
        L_0x00ed:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 54
            goto L_0x02bd
        L_0x00f9:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 11
            goto L_0x02bd
        L_0x0105:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 58
            goto L_0x02bd
        L_0x0111:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 57
            goto L_0x02bd
        L_0x011d:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 56
            goto L_0x02bd
        L_0x0129:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 55
            goto L_0x02bd
        L_0x0135:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 10
            goto L_0x02bd
        L_0x0141:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 9
            goto L_0x02bd
        L_0x014d:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 8
            goto L_0x02bd
        L_0x0159:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 7
            goto L_0x02bd
        L_0x0164:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 6
            goto L_0x02bd
        L_0x016f:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 5
            goto L_0x02bd
        L_0x017a:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 4
            goto L_0x02bd
        L_0x0185:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 3
            goto L_0x02bd
        L_0x0190:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 2
            goto L_0x02bd
        L_0x019b:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 1
            goto L_0x02bd
        L_0x01a6:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 41
            goto L_0x02bd
        L_0x01b2:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 40
            goto L_0x02bd
        L_0x01be:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 39
            goto L_0x02bd
        L_0x01ca:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 38
            goto L_0x02bd
        L_0x01d6:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 37
            goto L_0x02bd
        L_0x01e2:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 36
            goto L_0x02bd
        L_0x01ee:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 35
            goto L_0x02bd
        L_0x01fa:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 0
            goto L_0x02bd
        L_0x0205:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 34
            goto L_0x02bd
        L_0x0211:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 33
            goto L_0x02bd
        L_0x021d:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 32
            goto L_0x02bd
        L_0x0229:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 31
            goto L_0x02bd
        L_0x0235:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 30
            goto L_0x02bd
        L_0x0241:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 29
            goto L_0x02bd
        L_0x024d:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 28
            goto L_0x02bd
        L_0x0259:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 27
            goto L_0x02bd
        L_0x0264:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 26
            goto L_0x02bd
        L_0x026f:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 25
            goto L_0x02bd
        L_0x027a:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 24
            goto L_0x02bd
        L_0x0285:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 23
            goto L_0x02bd
        L_0x0290:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 22
            goto L_0x02bd
        L_0x029b:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 21
            goto L_0x02bd
        L_0x02a6:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 20
            goto L_0x02bd
        L_0x02b1:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02bc
            r1 = 49
            goto L_0x02bd
        L_0x02bc:
            r1 = -1
        L_0x02bd:
            r0 = 1700(0x6a4, float:2.382E-42)
            switch(r1) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02c5;
                case 2: goto L_0x02c5;
                case 3: goto L_0x02c5;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02c5;
                case 6: goto L_0x02c5;
                case 7: goto L_0x02c5;
                case 8: goto L_0x02c5;
                case 9: goto L_0x02c5;
                case 10: goto L_0x02c5;
                case 11: goto L_0x02c5;
                case 12: goto L_0x02c3;
                case 13: goto L_0x02c3;
                case 14: goto L_0x02c3;
                case 15: goto L_0x02c3;
                case 16: goto L_0x02c3;
                case 17: goto L_0x02c3;
                case 18: goto L_0x02c3;
                case 19: goto L_0x02c3;
                case 20: goto L_0x02c3;
                case 21: goto L_0x02c3;
                case 22: goto L_0x02c3;
                case 23: goto L_0x02c3;
                case 24: goto L_0x02c3;
                case 25: goto L_0x02c3;
                case 26: goto L_0x02c3;
                case 27: goto L_0x02c3;
                case 28: goto L_0x02c3;
                case 29: goto L_0x02c3;
                case 30: goto L_0x02c3;
                case 31: goto L_0x02c3;
                case 32: goto L_0x02c3;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02c3;
                case 35: goto L_0x02c3;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02c3;
                case 38: goto L_0x02c3;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02c3;
                case 41: goto L_0x02c3;
                case 42: goto L_0x02c3;
                case 43: goto L_0x02c3;
                case 44: goto L_0x02c3;
                case 45: goto L_0x02c3;
                case 46: goto L_0x02c3;
                case 47: goto L_0x02c3;
                case 48: goto L_0x02c3;
                case 49: goto L_0x02c3;
                case 50: goto L_0x02c3;
                case 51: goto L_0x02c3;
                case 52: goto L_0x02c3;
                case 53: goto L_0x02c3;
                case 54: goto L_0x02c3;
                case 55: goto L_0x02c3;
                case 56: goto L_0x02c3;
                case 57: goto L_0x02c3;
                case 58: goto L_0x02c3;
                default: goto L_0x02c2;
            }
        L_0x02c2:
            goto L_0x02c5
        L_0x02c3:
            r0 = 2700(0xa8c, float:3.784E-42)
        L_0x02c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.C10542f.m25738g(java.lang.String):int");
    }

    /* renamed from: h */
    public static float m25739h(int i, String str) {
        float d = m25735d(str);
        float f = m25737f(str);
        int g = m25738g(str);
        int e = m25736e(str);
        if (i < g) {
            i = g;
        }
        if (i > e) {
            i = e;
        }
        return f + (((float) (e - i)) * ((d - f) / ((float) (e - g))));
    }
}
