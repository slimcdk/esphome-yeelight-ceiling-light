package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.parser.xml.DddTag;
import com.yeelight.yeelib.data.C7574b;

/* renamed from: com.yeelight.yeelib.data.c */
public class C7579c {

    /* renamed from: a */
    public static final Uri f15356a;

    /* renamed from: b */
    public static final Uri f15357b;

    /* renamed from: c */
    public static final Uri f15358c = Uri.withAppendedPath(f15356a, "all_except_device");

    /* renamed from: d */
    public static final Uri f15359d = Uri.withAppendedPath(f15356a, "bulb");

    /* renamed from: e */
    public static final Uri f15360e = Uri.withAppendedPath(f15356a, "lamp");

    /* renamed from: f */
    public static final Uri f15361f = Uri.withAppendedPath(f15356a, "group");

    /* renamed from: g */
    public static final Uri f15362g = Uri.withAppendedPath(f15356a, "cherry");

    /* renamed from: h */
    public static final Uri f15363h = Uri.withAppendedPath(f15356a, "light");

    /* renamed from: i */
    public static final Uri f15364i = Uri.withAppendedPath(f15356a, "light_dn2grp");

    /* renamed from: j */
    public static final Uri f15365j = Uri.withAppendedPath(f15356a, "light_mb1grp");

    /* renamed from: k */
    public static final Uri f15366k = Uri.withAppendedPath(f15356a, "light_mb2grp");

    /* renamed from: l */
    public static final Uri f15367l = Uri.withAppendedPath(f15356a, "light_sp1grp");

    /* renamed from: com.yeelight.yeelib.data.c$a */
    public static class C7580a {

        /* renamed from: a */
        public static final Uri f15368a = Uri.withAppendedPath(C7579c.f15356a, DddTag.DEVICE);

        /* renamed from: b */
        public static String[] f15369b = {C7581a.f15370a, C7581a.f15371b, C7581a.f15372c, C7581a.f15375f, C7581a.f15376g, C7581a.f15377h, C7581a.f15380k, C7581a.f15381l};

        /* renamed from: com.yeelight.yeelib.data.c$a$a */
        public static class C7581a {

            /* renamed from: a */
            public static String f15370a = "_id";

            /* renamed from: b */
            public static String f15371b = C7574b.C7575a.C7577b.f15345b;

            /* renamed from: c */
            public static String f15372c = "device_id";

            /* renamed from: d */
            public static String f15373d = C7574b.C7575a.C7577b.f15347d;

            /* renamed from: e */
            public static String f15374e = "user_id";

            /* renamed from: f */
            public static String f15375f = C7574b.C7575a.C7577b.f15348e;

            /* renamed from: g */
            public static String f15376g = C7574b.C7575a.C7577b.f15349f;

            /* renamed from: h */
            public static String f15377h = C7574b.C7575a.C7577b.f15350g;

            /* renamed from: i */
            public static String f15378i = C7574b.C7575a.C7577b.f15352i;

            /* renamed from: j */
            public static String f15379j = C7574b.C7575a.C7577b.f15353j;

            /* renamed from: k */
            public static String f15380k = "mesh_id";

            /* renamed from: l */
            public static String f15381l = C7574b.C7575a.C7577b.f15354k;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$b */
    public static class C7582b {

        /* renamed from: a */
        public static final Uri f15382a = Uri.withAppendedPath(C7579c.f15356a, "device_group");

        /* renamed from: com.yeelight.yeelib.data.c$b$a */
        public static class C7583a {

            /* renamed from: a */
            public static String f15383a = "_id";

            /* renamed from: b */
            public static String f15384b = "user_id";

            /* renamed from: c */
            public static String f15385c = C7574b.C7575a.C7577b.f15348e;

            /* renamed from: d */
            public static String f15386d = C7574b.C7575a.C7577b.f15352i;

            /* renamed from: e */
            public static String f15387e = C7574b.C7575a.C7577b.f15354k;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$c */
    public static class C7584c {

        /* renamed from: a */
        public static final Uri f15388a = Uri.withAppendedPath(C7579c.f15356a, "device_log");

        /* renamed from: com.yeelight.yeelib.data.c$c$a */
        public static class C7585a {

            /* renamed from: a */
            public static String f15389a = "_id";

            /* renamed from: b */
            public static String f15390b = "device_id";

            /* renamed from: c */
            public static String f15391c = "log_operate";

            /* renamed from: d */
            public static String f15392d = "log_operate_at";

            /* renamed from: e */
            public static String f15393e = "log_operate_extra";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$d */
    public static class C7586d {

        /* renamed from: a */
        public static final Uri f15394a = Uri.withAppendedPath(C7579c.f15356a, "device_records");

        /* renamed from: com.yeelight.yeelib.data.c$d$a */
        public static class C7587a {

            /* renamed from: a */
            public static String f15395a = "_id";

            /* renamed from: b */
            public static String f15396b = "device_id";

            /* renamed from: c */
            public static String f15397c = "color_mode_time";

            /* renamed from: d */
            public static String f15398d = "ct_mode_time";

            /* renamed from: e */
            public static String f15399e = "cf_mode_time";

            /* renamed from: f */
            public static String f15400f = "color_red_time";

            /* renamed from: g */
            public static String f15401g = "color_yellow_time";

            /* renamed from: h */
            public static String f15402h = "color_green_time";

            /* renamed from: i */
            public static String f15403i = "color_cyan_time";

            /* renamed from: j */
            public static String f15404j = "color_blue_time";

            /* renamed from: k */
            public static String f15405k = "color_purple_time";

            /* renamed from: l */
            public static String f15406l = "ct_level_1_time";

            /* renamed from: m */
            public static String f15407m = "ct_level_2_time";

            /* renamed from: n */
            public static String f15408n = "ct_level_3_time";

            /* renamed from: o */
            public static String f15409o = "ct_level_4_time";

            /* renamed from: p */
            public static String f15410p = "color_b_1_time";

            /* renamed from: q */
            public static String f15411q = "color_b_2_time";

            /* renamed from: r */
            public static String f15412r = "color_b_3_time";

            /* renamed from: s */
            public static String f15413s = "ct_b_1_time";

            /* renamed from: t */
            public static String f15414t = "ct_b_2_time";

            /* renamed from: u */
            public static String f15415u = "ct_b_3_time";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$e */
    public static class C7588e {

        /* renamed from: a */
        public static final Uri f15416a = Uri.withAppendedPath(C7579c.f15356a, "group_device_rel");

        /* renamed from: com.yeelight.yeelib.data.c$e$a */
        public static class C7589a {

            /* renamed from: a */
            public static String f15417a = "group_id";

            /* renamed from: b */
            public static String f15418b = "device_id";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$f */
    public static class C7590f {

        /* renamed from: a */
        public static final Uri f15419a = Uri.withAppendedPath(C7579c.f15356a, "mesh_network");

        /* renamed from: b */
        public static String[] f15420b = {C7591a.f15421a, C7591a.f15422b, C7591a.f15423c, C7591a.f15424d};

        /* renamed from: com.yeelight.yeelib.data.c$f$a */
        public static class C7591a {

            /* renamed from: a */
            public static String f15421a = "mesh_id";

            /* renamed from: b */
            public static String f15422b = "mesh_name";

            /* renamed from: c */
            public static String f15423c = "name";

            /* renamed from: d */
            public static String f15424d = "mesh_password";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$g */
    public static class C7592g {

        /* renamed from: a */
        public static final Uri f15425a = Uri.withAppendedPath(C7579c.f15356a, "room");

        /* renamed from: b */
        public static String[] f15426b = {C7593a.f15428b, C7593a.f15429c, C7593a.f15430d, C7593a.f15431e, C7593a.f15432f, C7593a.f15433g, C7593a.f15434h};

        /* renamed from: com.yeelight.yeelib.data.c$g$a */
        public static class C7593a {

            /* renamed from: a */
            public static String f15427a = "_id";

            /* renamed from: b */
            public static String f15428b = "local_id";

            /* renamed from: c */
            public static String f15429c = "room_type";

            /* renamed from: d */
            public static String f15430d = "user_id";

            /* renamed from: e */
            public static String f15431e = "name";

            /* renamed from: f */
            public static String f15432f = "timestamp";

            /* renamed from: g */
            public static String f15433g = "deleted";

            /* renamed from: h */
            public static String f15434h = "server";

            /* renamed from: i */
            public static String f15435i = C7574b.C7575a.C7577b.f15352i;
        }
    }

    /* renamed from: com.yeelight.yeelib.data.c$h */
    public static class C7594h {

        /* renamed from: a */
        public static final Uri f15436a = Uri.withAppendedPath(C7579c.f15356a, "room_widget");

        /* renamed from: com.yeelight.yeelib.data.c$h$a */
        public static class C7595a {

            /* renamed from: a */
            public static String f15437a = "room_id";

            /* renamed from: b */
            public static String f15438b = "widget_id";

            /* renamed from: c */
            public static String f15439c = "user_id";
        }
    }

    static {
        Uri parse = Uri.parse("content://com.yeelight.cherry.device.database");
        f15356a = parse;
        f15357b = Uri.withAppendedPath(parse, "all");
    }
}
