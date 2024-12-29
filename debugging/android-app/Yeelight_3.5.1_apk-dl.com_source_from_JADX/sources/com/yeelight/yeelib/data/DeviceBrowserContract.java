package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.Device;
import java.util.HashMap;

public class DeviceBrowserContract {

    /* renamed from: a */
    public static final Uri f12255a = Uri.parse("content://com.yeelight.cherry.device");

    public static class DeviceBrowser {

        /* renamed from: A */
        private static HashMap<String, String> f12256A = new HashMap<String, String>() {
            {
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-dnlight2", "yeelink.light.dnlight2");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-meshbulb1", "yeelink.light.meshbulb1");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-meshbulb2", "yeelink.light.meshbulb2");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-spot1", "yeelink.light.spot1");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-dn2grp", "yeelink.light.dn2grp");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-mb1grp", "yeelink.light.mb1grp");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-mb2grp", "yeelink.light.mb2grp");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-sp1grp", "yeelink.light.sp1grp");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-ml1", "yeelink.light.ml1");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-ml2", "yeelink.light.ml2");
                put("urn:miot-spec-v2:device:curtain:0000A00C:yeelink-ctmt1", "yeelink.curtain.ctmt1");
                put("urn:miot-spec-v2:device:switch:0000A003:yeelink-sw1", "yeelink.switch.sw1");
                put("urn:miot-spec-v2:device:outlet:0000A002:yeelink-plug", "yeelink.plug.plug");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl1", "yeelink.light.fancl1");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl2", "yeelink.light.fancl2");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl5", "yeelink.light.fancl5");
                put("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl6", "yeelink.light.fancl6");
            }
        };

        /* renamed from: a */
        public static final Uri f12257a;

        /* renamed from: b */
        public static final Uri f12258b;

        /* renamed from: c */
        public static final Uri f12259c;

        /* renamed from: d */
        public static final Uri f12260d;

        /* renamed from: e */
        public static final Uri f12261e;

        /* renamed from: f */
        public static final Uri f12262f;

        /* renamed from: g */
        public static final Uri f12263g;

        /* renamed from: h */
        public static final Uri f12264h;

        /* renamed from: i */
        public static final Uri f12265i;

        /* renamed from: j */
        public static final Uri f12266j;

        /* renamed from: k */
        public static final Uri f12267k;

        /* renamed from: l */
        public static final Uri f12268l;

        /* renamed from: m */
        public static final Uri f12269m;

        /* renamed from: n */
        public static final Uri f12270n;

        /* renamed from: o */
        public static final Uri f12271o;

        /* renamed from: p */
        public static final Uri f12272p;

        /* renamed from: q */
        public static final Uri f12273q;

        /* renamed from: r */
        public static final Uri f12274r;

        /* renamed from: s */
        public static final Uri f12275s;

        /* renamed from: t */
        public static final Uri f12276t;

        /* renamed from: u */
        public static final Uri f12277u;

        /* renamed from: v */
        public static final Uri f12278v;

        /* renamed from: w */
        public static final Uri f12279w;

        /* renamed from: x */
        public static final Uri f12280x;

        /* renamed from: y */
        public static final Uri f12281y;

        /* renamed from: z */
        public static String[] f12282z = {C6034a.f12283a, C6034a.f12284b, C6034a.f12285c, C6034a.f12287e, C6034a.f12288f, C6034a.f12289g, C6034a.f12290h};

        /* renamed from: com.yeelight.yeelib.data.DeviceBrowserContract$DeviceBrowser$a */
        public static class C6034a {

            /* renamed from: a */
            public static String f12283a = "_id";

            /* renamed from: b */
            public static String f12284b = "device_type";

            /* renamed from: c */
            public static String f12285c = "device_id";

            /* renamed from: d */
            public static String f12286d = "mac_address";

            /* renamed from: e */
            public static String f12287e = "name";

            /* renamed from: f */
            public static String f12288f = "model";

            /* renamed from: g */
            public static String f12289g = "ownership";

            /* renamed from: h */
            public static String f12290h = "bind";

            /* renamed from: i */
            public static String f12291i = "delay_off";

            /* renamed from: j */
            public static String f12292j = "room_id";

            /* renamed from: k */
            public static String f12293k = "server";
        }

        /* renamed from: com.yeelight.yeelib.data.DeviceBrowserContract$DeviceBrowser$b */
        public static class C6035b {

            /* renamed from: a */
            public static String f12294a = Device.Ownership.MINE.name();

            static {
                Device.Ownership.NOONES.name();
                Device.Ownership.OTHERS.name();
            }
        }

        static {
            Uri uri = DeviceBrowserContract.f12255a;
            Uri withAppendedPath = Uri.withAppendedPath(uri, "all");
            f12257a = withAppendedPath;
            Uri.withAppendedPath(uri, "lamp");
            f12258b = Uri.withAppendedPath(uri, "bulb");
            f12259c = Uri.withAppendedPath(uri, "strip");
            f12260d = Uri.withAppendedPath(uri, "panel");
            f12261e = Uri.withAppendedPath(uri, "plate");
            f12262f = Uri.withAppendedPath(uri, "mesh");
            f12263g = Uri.withAppendedPath(uri, "cherry");
            f12264h = Uri.withAppendedPath(uri, "ceiling");
            f12265i = Uri.withAppendedPath(uri, "mango");
            f12266j = Uri.withAppendedPath(uri, "elf");
            f12267k = Uri.withAppendedPath(uri, "muse");
            f12268l = Uri.withAppendedPath(uri, "vision");
            f12269m = Uri.withAppendedPath(uri, "doris");
            f12270n = Uri.withAppendedPath(uri, "libra");
            f12271o = Uri.withAppendedPath(uri, "bslamp");
            f12272p = Uri.withAppendedPath(uri, "bslamp2");
            f12273q = Uri.withAppendedPath(uri, "bslamp3");
            f12274r = Uri.withAppendedPath(uri, "gingko");
            f12275s = Uri.withAppendedPath(uri, "speaker");
            f12276t = Uri.withAppendedPath(uri, "bath_heater");
            f12277u = Uri.withAppendedPath(uri, "mesh_gateway");
            f12278v = Uri.withAppendedPath(uri, "curtain");
            f12279w = Uri.withAppendedPath(uri, "switch");
            f12280x = Uri.withAppendedPath(uri, "plug");
            f12281y = withAppendedPath;
        }

        /* renamed from: a */
        public static String m17585a(String str) {
            return f12256A.get(str);
        }
    }
}
