package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.Device;
import java.util.HashMap;

/* renamed from: com.yeelight.yeelib.data.b */
public class C7574b {

    /* renamed from: a */
    public static final Uri f15316a = Uri.parse("content://com.yeelight.cherry.device");

    /* renamed from: com.yeelight.yeelib.data.b$a */
    public static class C7575a {

        /* renamed from: A */
        private static HashMap<String, String> f15317A = new C7576a();

        /* renamed from: a */
        public static final Uri f15318a = Uri.withAppendedPath(C7574b.f15316a, "all");

        /* renamed from: b */
        public static final Uri f15319b = Uri.withAppendedPath(C7574b.f15316a, "lamp");

        /* renamed from: c */
        public static final Uri f15320c = Uri.withAppendedPath(C7574b.f15316a, "bulb");

        /* renamed from: d */
        public static final Uri f15321d = Uri.withAppendedPath(C7574b.f15316a, "strip");

        /* renamed from: e */
        public static final Uri f15322e = Uri.withAppendedPath(C7574b.f15316a, "panel");

        /* renamed from: f */
        public static final Uri f15323f = Uri.withAppendedPath(C7574b.f15316a, "mesh");

        /* renamed from: g */
        public static final Uri f15324g = Uri.withAppendedPath(C7574b.f15316a, "cherry");

        /* renamed from: h */
        public static final Uri f15325h = Uri.withAppendedPath(C7574b.f15316a, "ceiling");

        /* renamed from: i */
        public static final Uri f15326i = Uri.withAppendedPath(C7574b.f15316a, "mango");

        /* renamed from: j */
        public static final Uri f15327j = Uri.withAppendedPath(C7574b.f15316a, "elf");

        /* renamed from: k */
        public static final Uri f15328k = Uri.withAppendedPath(C7574b.f15316a, "muse");

        /* renamed from: l */
        public static final Uri f15329l = Uri.withAppendedPath(C7574b.f15316a, "vision");

        /* renamed from: m */
        public static final Uri f15330m = Uri.withAppendedPath(C7574b.f15316a, "doris");

        /* renamed from: n */
        public static final Uri f15331n = Uri.withAppendedPath(C7574b.f15316a, "libra");

        /* renamed from: o */
        public static final Uri f15332o = Uri.withAppendedPath(C7574b.f15316a, "bslamp");

        /* renamed from: p */
        public static final Uri f15333p = Uri.withAppendedPath(C7574b.f15316a, "bslamp2");

        /* renamed from: q */
        public static final Uri f15334q = Uri.withAppendedPath(C7574b.f15316a, "bslamp3");

        /* renamed from: r */
        public static final Uri f15335r = Uri.withAppendedPath(C7574b.f15316a, "gingko");

        /* renamed from: s */
        public static final Uri f15336s = Uri.withAppendedPath(C7574b.f15316a, "speaker");

        /* renamed from: t */
        public static final Uri f15337t = Uri.withAppendedPath(C7574b.f15316a, "bath_heater");

        /* renamed from: u */
        public static final Uri f15338u = Uri.withAppendedPath(C7574b.f15316a, "mesh_gateway");

        /* renamed from: v */
        public static final Uri f15339v = Uri.withAppendedPath(C7574b.f15316a, "curtain");

        /* renamed from: w */
        public static final Uri f15340w = Uri.withAppendedPath(C7574b.f15316a, "switch");

        /* renamed from: x */
        public static final Uri f15341x = Uri.withAppendedPath(C7574b.f15316a, "plug");

        /* renamed from: y */
        public static final Uri f15342y = f15318a;

        /* renamed from: z */
        public static String[] f15343z = {C7577b.f15344a, C7577b.f15345b, C7577b.f15346c, C7577b.f15348e, C7577b.f15349f, C7577b.f15350g, C7577b.f15351h};

        /* renamed from: com.yeelight.yeelib.data.b$a$a */
        static class C7576a extends HashMap<String, String> {
            C7576a() {
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
        }

        /* renamed from: com.yeelight.yeelib.data.b$a$b */
        public static class C7577b {

            /* renamed from: a */
            public static String f15344a = "_id";

            /* renamed from: b */
            public static String f15345b = "device_type";

            /* renamed from: c */
            public static String f15346c = "device_id";

            /* renamed from: d */
            public static String f15347d = "mac_address";

            /* renamed from: e */
            public static String f15348e = "name";

            /* renamed from: f */
            public static String f15349f = "model";

            /* renamed from: g */
            public static String f15350g = "ownership";

            /* renamed from: h */
            public static String f15351h = "bind";

            /* renamed from: i */
            public static String f15352i = "delay_off";

            /* renamed from: j */
            public static String f15353j = "room_id";

            /* renamed from: k */
            public static String f15354k = "server";
        }

        /* renamed from: com.yeelight.yeelib.data.b$a$c */
        public static class C7578c {

            /* renamed from: a */
            public static String f15355a = Device.Ownership.MINE.name();

            static {
                Device.Ownership.NOONES.name();
                Device.Ownership.OTHERS.name();
            }
        }

        /* renamed from: a */
        public static String m22443a(String str) {
            return f15317A.get(str);
        }
    }
}
