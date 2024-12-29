package com.yeelight.yeelib.data;

import android.net.Uri;

/* renamed from: com.yeelight.yeelib.data.a */
public class C6038a {

    /* renamed from: a */
    public static final Uri f12308a = Uri.parse("content://com.yeelight.cherry.database.configuration");

    /* renamed from: com.yeelight.yeelib.data.a$a */
    public static class C6039a {

        /* renamed from: a */
        public static final Uri f12309a = Uri.withAppendedPath(C6038a.f12308a, "configuration");

        /* renamed from: com.yeelight.yeelib.data.a$a$a */
        public static class C6040a {

            /* renamed from: a */
            public static String f12310a = "configuration_key";

            /* renamed from: b */
            public static String f12311b = "configuration_value";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.a$b */
    public static class C6041b {

        /* renamed from: a */
        public static final Uri f12312a = Uri.withAppendedPath(C6038a.f12308a, "sharehistory");

        /* renamed from: b */
        public static final String f12313b = (C6042a.f12318e + " DESC");

        /* renamed from: com.yeelight.yeelib.data.a$b$a */
        public static class C6042a {

            /* renamed from: a */
            public static String f12314a = "_id";

            /* renamed from: b */
            public static String f12315b = "user_id";

            /* renamed from: c */
            public static String f12316c = "user_name";

            /* renamed from: d */
            public static String f12317d = "user_profile_url";

            /* renamed from: e */
            public static String f12318e = "shared_time";
        }
    }
}
