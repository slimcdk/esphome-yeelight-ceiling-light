package com.yeelight.yeelib.data;

import android.net.Uri;

/* renamed from: com.yeelight.yeelib.data.a */
public class C7569a {

    /* renamed from: a */
    public static final Uri f15305a = Uri.parse("content://com.yeelight.cherry.database.configuration");

    /* renamed from: com.yeelight.yeelib.data.a$a */
    public static class C7570a {

        /* renamed from: a */
        public static final Uri f15306a = Uri.withAppendedPath(C7569a.f15305a, "configuration");

        /* renamed from: com.yeelight.yeelib.data.a$a$a */
        public static class C7571a {

            /* renamed from: a */
            public static String f15307a = "configuration_key";

            /* renamed from: b */
            public static String f15308b = "configuration_value";
        }
    }

    /* renamed from: com.yeelight.yeelib.data.a$b */
    public static class C7572b {

        /* renamed from: a */
        public static final Uri f15309a = Uri.withAppendedPath(C7569a.f15305a, "sharehistory");

        /* renamed from: b */
        public static final String f15310b = (C7573a.f15315e + " DESC");

        /* renamed from: com.yeelight.yeelib.data.a$b$a */
        public static class C7573a {

            /* renamed from: a */
            public static String f15311a = "_id";

            /* renamed from: b */
            public static String f15312b = "user_id";

            /* renamed from: c */
            public static String f15313c = "user_name";

            /* renamed from: d */
            public static String f15314d = "user_profile_url";

            /* renamed from: e */
            public static String f15315e = "shared_time";
        }
    }
}
