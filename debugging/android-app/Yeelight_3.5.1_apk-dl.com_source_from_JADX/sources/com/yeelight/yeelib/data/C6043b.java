package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.parser.xml.DddTag;
import com.yeelight.yeelib.data.DeviceBrowserContract;

/* renamed from: com.yeelight.yeelib.data.b */
public class C6043b {

    /* renamed from: a */
    public static final Uri f12319a;

    /* renamed from: b */
    public static final Uri f12320b;

    /* renamed from: c */
    public static final Uri f12321c;

    /* renamed from: d */
    public static final Uri f12322d;

    /* renamed from: e */
    public static final Uri f12323e;

    /* renamed from: f */
    public static final Uri f12324f;

    /* renamed from: g */
    public static final Uri f12325g;

    /* renamed from: h */
    public static final Uri f12326h;

    /* renamed from: com.yeelight.yeelib.data.b$a */
    public static class C6044a {

        /* renamed from: a */
        public static final Uri f12327a = Uri.withAppendedPath(C6043b.f12319a, DddTag.DEVICE);

        /* renamed from: b */
        public static String[] f12328b = {C6045a.f12329a, C6045a.f12330b, C6045a.f12331c, C6045a.f12334f, C6045a.f12335g, C6045a.f12336h, C6045a.f12339k, C6045a.f12340l};

        /* renamed from: com.yeelight.yeelib.data.b$a$a */
        public static class C6045a {

            /* renamed from: a */
            public static String f12329a = "_id";

            /* renamed from: b */
            public static String f12330b = DeviceBrowserContract.DeviceBrowser.C6034a.f12284b;

            /* renamed from: c */
            public static String f12331c = "device_id";

            /* renamed from: d */
            public static String f12332d = DeviceBrowserContract.DeviceBrowser.C6034a.f12286d;

            /* renamed from: e */
            public static String f12333e = "user_id";

            /* renamed from: f */
            public static String f12334f = DeviceBrowserContract.DeviceBrowser.C6034a.f12287e;

            /* renamed from: g */
            public static String f12335g = DeviceBrowserContract.DeviceBrowser.C6034a.f12288f;

            /* renamed from: h */
            public static String f12336h = DeviceBrowserContract.DeviceBrowser.C6034a.f12289g;

            /* renamed from: i */
            public static String f12337i = DeviceBrowserContract.DeviceBrowser.C6034a.f12291i;

            /* renamed from: j */
            public static String f12338j = DeviceBrowserContract.DeviceBrowser.C6034a.f12292j;

            /* renamed from: k */
            public static String f12339k = "mesh_id";

            /* renamed from: l */
            public static String f12340l = DeviceBrowserContract.DeviceBrowser.C6034a.f12293k;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$b */
    public static class C6046b {

        /* renamed from: a */
        public static final Uri f12341a = Uri.withAppendedPath(C6043b.f12319a, "device_group");

        /* renamed from: com.yeelight.yeelib.data.b$b$a */
        public static class C6047a {

            /* renamed from: a */
            public static String f12342a = "_id";

            /* renamed from: b */
            public static String f12343b = "user_id";

            /* renamed from: c */
            public static String f12344c = DeviceBrowserContract.DeviceBrowser.C6034a.f12287e;

            /* renamed from: d */
            public static String f12345d = DeviceBrowserContract.DeviceBrowser.C6034a.f12291i;

            /* renamed from: e */
            public static String f12346e = DeviceBrowserContract.DeviceBrowser.C6034a.f12293k;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$c */
    public static class C6048c {

        /* renamed from: a */
        public static final Uri f12347a = Uri.withAppendedPath(C6043b.f12319a, "device_log");

        /* renamed from: com.yeelight.yeelib.data.b$c$a */
        public static class C6049a {

            /* renamed from: a */
            public static String f12348a = "_id";

            /* renamed from: b */
            public static String f12349b = "device_id";

            /* renamed from: c */
            public static String f12350c = "log_operate";

            /* renamed from: d */
            public static String f12351d = "log_operate_at";

            /* renamed from: e */
            public static String f12352e = "log_operate_extra";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$d */
    public static class C6050d {

        /* renamed from: a */
        public static final Uri f12353a = Uri.withAppendedPath(C6043b.f12319a, "device_records");

        /* renamed from: com.yeelight.yeelib.data.b$d$a */
        public static class C6051a {

            /* renamed from: a */
            public static String f12354a = "_id";

            /* renamed from: b */
            public static String f12355b = "device_id";

            /* renamed from: c */
            public static String f12356c = "color_mode_time";

            /* renamed from: d */
            public static String f12357d = "ct_mode_time";

            /* renamed from: e */
            public static String f12358e = "cf_mode_time";

            /* renamed from: f */
            public static String f12359f = "color_red_time";

            /* renamed from: g */
            public static String f12360g = "color_yellow_time";

            /* renamed from: h */
            public static String f12361h = "color_green_time";

            /* renamed from: i */
            public static String f12362i = "color_cyan_time";

            /* renamed from: j */
            public static String f12363j = "color_blue_time";

            /* renamed from: k */
            public static String f12364k = "color_purple_time";

            /* renamed from: l */
            public static String f12365l = "ct_level_1_time";

            /* renamed from: m */
            public static String f12366m = "ct_level_2_time";

            /* renamed from: n */
            public static String f12367n = "ct_level_3_time";

            /* renamed from: o */
            public static String f12368o = "ct_level_4_time";

            /* renamed from: p */
            public static String f12369p = "color_b_1_time";

            /* renamed from: q */
            public static String f12370q = "color_b_2_time";

            /* renamed from: r */
            public static String f12371r = "color_b_3_time";

            /* renamed from: s */
            public static String f12372s = "ct_b_1_time";

            /* renamed from: t */
            public static String f12373t = "ct_b_2_time";

            /* renamed from: u */
            public static String f12374u = "ct_b_3_time";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$e */
    public static class C6052e {

        /* renamed from: a */
        public static final Uri f12375a = Uri.withAppendedPath(C6043b.f12319a, "group_device_rel");

        /* renamed from: com.yeelight.yeelib.data.b$e$a */
        public static class C6053a {

            /* renamed from: a */
            public static String f12376a = "group_id";

            /* renamed from: b */
            public static String f12377b = "device_id";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$f */
    public static class C6054f {

        /* renamed from: a */
        public static final Uri f12378a = Uri.withAppendedPath(C6043b.f12319a, "mesh_network");

        /* renamed from: b */
        public static String[] f12379b = {C6055a.f12380a, C6055a.f12381b, C6055a.f12382c, C6055a.f12383d};

        /* renamed from: com.yeelight.yeelib.data.b$f$a */
        public static class C6055a {

            /* renamed from: a */
            public static String f12380a = "mesh_id";

            /* renamed from: b */
            public static String f12381b = "mesh_name";

            /* renamed from: c */
            public static String f12382c = "name";

            /* renamed from: d */
            public static String f12383d = "mesh_password";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$g */
    public static class C6056g {

        /* renamed from: a */
        public static final Uri f12384a = Uri.withAppendedPath(C6043b.f12319a, "room");

        /* renamed from: b */
        public static String[] f12385b = {C6057a.f12387b, C6057a.f12388c, C6057a.f12389d, C6057a.f12390e, C6057a.f12391f, C6057a.f12392g, C6057a.f12393h};

        /* renamed from: com.yeelight.yeelib.data.b$g$a */
        public static class C6057a {

            /* renamed from: a */
            public static String f12386a = "_id";

            /* renamed from: b */
            public static String f12387b = "local_id";

            /* renamed from: c */
            public static String f12388c = "room_type";

            /* renamed from: d */
            public static String f12389d = "user_id";

            /* renamed from: e */
            public static String f12390e = "name";

            /* renamed from: f */
            public static String f12391f = "timestamp";

            /* renamed from: g */
            public static String f12392g = "deleted";

            /* renamed from: h */
            public static String f12393h = "server";

            /* renamed from: i */
            public static String f12394i = DeviceBrowserContract.DeviceBrowser.C6034a.f12291i;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.b$h */
    public static class C6058h {

        /* renamed from: a */
        public static final Uri f12395a = Uri.withAppendedPath(C6043b.f12319a, "room_widget");

        /* renamed from: com.yeelight.yeelib.data.b$h$a */
        public static class C6059a {

            /* renamed from: a */
            public static String f12396a = "room_id";

            /* renamed from: b */
            public static String f12397b = "widget_id";

            /* renamed from: c */
            public static String f12398c = "user_id";
        }
    }

    static {
        Uri parse = Uri.parse("content://com.yeelight.cherry.device.database");
        f12319a = parse;
        f12320b = Uri.withAppendedPath(parse, "all");
        f12321c = Uri.withAppendedPath(parse, "all_except_device");
        Uri.withAppendedPath(parse, "bulb");
        Uri.withAppendedPath(parse, "lamp");
        Uri.withAppendedPath(parse, "group");
        Uri.withAppendedPath(parse, "cherry");
        f12322d = Uri.withAppendedPath(parse, "light");
        f12323e = Uri.withAppendedPath(parse, "light_dn2grp");
        f12324f = Uri.withAppendedPath(parse, "light_mb1grp");
        f12325g = Uri.withAppendedPath(parse, "light_mb2grp");
        f12326h = Uri.withAppendedPath(parse, "light_sp1grp");
    }
}
