package com.yeelight.yeelib.device.xiaomi.base;

import com.p022mi.iot.common.instance.Device;
import com.yeelight.yeelib.data.DeviceBrowserContract;

/* renamed from: com.yeelight.yeelib.device.xiaomi.base.b */
public class C8252b {
    /* renamed from: a */
    public static int[] m19449a(Device device) {
        if (device == null) {
            return null;
        }
        String a = DeviceBrowserContract.DeviceBrowser.m17585a(device.getDeviceType().toString());
        a.hashCode();
        char c = 65535;
        switch (a.hashCode()) {
            case -1494338802:
                if (a.equals("yeelink.switch.sw1")) {
                    c = 0;
                    break;
                }
                break;
            case -1350780909:
                if (a.equals("yeelink.plug.plug")) {
                    c = 1;
                    break;
                }
                break;
            case -1282176368:
                if (a.equals("yeelink.light.dn2grp")) {
                    c = 2;
                    break;
                }
                break;
            case -1235140472:
                if (a.equals("yeelink.light.fancl1")) {
                    c = 3;
                    break;
                }
                break;
            case -1235140471:
                if (a.equals("yeelink.light.fancl2")) {
                    c = 4;
                    break;
                }
                break;
            case -1235140468:
                if (a.equals("yeelink.light.fancl5")) {
                    c = 5;
                    break;
                }
                break;
            case -1235140467:
                if (a.equals("yeelink.light.fancl6")) {
                    c = 6;
                    break;
                }
                break;
            case -1035626052:
                if (a.equals("yeelink.light.mb1grp")) {
                    c = 7;
                    break;
                }
                break;
            case -1035596261:
                if (a.equals("yeelink.light.mb2grp")) {
                    c = 8;
                    break;
                }
                break;
            case -850921852:
                if (a.equals("yeelink.light.sp1grp")) {
                    c = 9;
                    break;
                }
                break;
            case -443031172:
                if (a.equals("yeelink.light.spot1")) {
                    c = 10;
                    break;
                }
                break;
            case 674030242:
                if (a.equals("yeelink.curtain.ctmt1")) {
                    c = 11;
                    break;
                }
                break;
            case 1201766335:
                if (a.equals("yeelink.light.ml1")) {
                    c = 12;
                    break;
                }
                break;
            case 1201766336:
                if (a.equals("yeelink.light.ml2")) {
                    c = 13;
                    break;
                }
                break;
            case 2102612488:
                if (a.equals("yeelink.light.meshbulb1")) {
                    c = 14;
                    break;
                }
                break;
            case 2102612489:
                if (a.equals("yeelink.light.meshbulb2")) {
                    c = 15;
                    break;
                }
                break;
            case 2146130361:
                if (a.equals("yeelink.light.dnlight2")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new int[]{2, 3, 4};
            case 1:
                return new int[]{3};
            case 2:
                return new int[]{2, 3};
            case 3:
                return new int[]{2, 3, 4, 5};
            case 4:
                return new int[]{2, 3, 4, 5};
            case 5:
                return new int[]{2, 3, 4, 5};
            case 6:
                return new int[]{2, 6, 4, 5};
            case 7:
                return new int[]{2, 3};
            case 8:
                return new int[]{2, 3};
            case 9:
                return new int[]{2, 3};
            case 10:
                return new int[]{2, 3};
            case 11:
                return new int[]{2, 3};
            case 12:
                return new int[]{2, 3};
            case 13:
                return new int[]{2, 3};
            case 14:
                return new int[]{2, 3};
            case 15:
                return new int[]{2, 3};
            case 16:
                return new int[]{2, 3};
            default:
                return null;
        }
    }
}
