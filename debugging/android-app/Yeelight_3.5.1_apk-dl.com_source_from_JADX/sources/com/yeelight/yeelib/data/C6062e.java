package com.yeelight.yeelib.data;

import android.net.Uri;

/* renamed from: com.yeelight.yeelib.data.e */
public class C6062e {

    /* renamed from: a */
    public static final Uri f12407a = Uri.parse("content://com.yeelight.cherry.database.interaction");

    /* renamed from: com.yeelight.yeelib.data.e$a */
    public static class C6063a {

        /* renamed from: a */
        public static final Uri f12408a = Uri.withAppendedPath(C6062e.f12407a, "interactions");

        /* renamed from: com.yeelight.yeelib.data.e$a$a */
        public static class C6064a {

            /* renamed from: a */
            public static String f12409a = "_id";

            /* renamed from: b */
            public static String f12410b = "action_device_id";

            /* renamed from: c */
            public static String f12411c = "action_id";

            /* renamed from: d */
            public static String f12412d = "event_device_id";

            /* renamed from: e */
            public static String f12413e = "event_id";

            /* renamed from: f */
            public static String f12414f = "enabled";
        }

        static {
            String str = C6064a.f12410b;
            String str2 = C6064a.f12411c;
            String str3 = C6064a.f12412d;
            String str4 = C6064a.f12413e;
        }
    }
}
