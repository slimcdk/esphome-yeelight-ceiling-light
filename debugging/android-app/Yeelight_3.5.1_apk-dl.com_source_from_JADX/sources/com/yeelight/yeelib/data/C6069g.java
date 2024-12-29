package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.yeelight.yeelib.data.g */
public class C6069g {

    /* renamed from: a */
    public static final Uri f12426a = Uri.parse("content://com.yeelight.cherry.landevice");

    /* renamed from: com.yeelight.yeelib.data.g$a */
    public static class C6070a {

        /* renamed from: a */
        public static String[] f12427a = {C6071a.f12428a, C6071a.f12429b};

        /* renamed from: com.yeelight.yeelib.data.g$a$a */
        public static class C6071a {

            /* renamed from: a */
            public static String f12428a = "_id";

            /* renamed from: b */
            public static String f12429b = "device_id";
        }

        static {
            Uri.withAppendedPath(C6069g.f12426a, DddTag.DEVICE);
        }
    }
}
