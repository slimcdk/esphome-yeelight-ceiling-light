package com.yeelight.yeelib.data;

import android.net.Uri;

/* renamed from: com.yeelight.yeelib.data.f */
public class C7598f {

    /* renamed from: a */
    public static final Uri f15448a = Uri.parse("content://com.yeelight.cherry.database.interaction");

    /* renamed from: com.yeelight.yeelib.data.f$a */
    public static class C7599a {

        /* renamed from: a */
        public static final Uri f15449a = Uri.withAppendedPath(C7598f.f15448a, "interactions");

        /* renamed from: com.yeelight.yeelib.data.f$a$a */
        public static class C7600a {

            /* renamed from: a */
            public static String f15450a = "_id";

            /* renamed from: b */
            public static String f15451b = "action_device_id";

            /* renamed from: c */
            public static String f15452c = "action_id";

            /* renamed from: d */
            public static String f15453d = "event_device_id";

            /* renamed from: e */
            public static String f15454e = "event_id";

            /* renamed from: f */
            public static String f15455f = "enabled";
        }

        static {
            String str = C7600a.f15451b;
            String str2 = C7600a.f15452c;
            String str3 = C7600a.f15453d;
            String str4 = C7600a.f15454e;
        }
    }
}
