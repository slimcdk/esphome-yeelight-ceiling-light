package com.yeelight.yeelib.data;

import android.net.Uri;
import com.miot.common.device.parser.xml.DddTag;

/* renamed from: com.yeelight.yeelib.data.h */
public class C7605h {

    /* renamed from: a */
    public static final Uri f15467a = Uri.parse("content://com.yeelight.cherry.landevice");

    /* renamed from: com.yeelight.yeelib.data.h$a */
    public static class C7606a {

        /* renamed from: a */
        public static final Uri f15468a = Uri.withAppendedPath(C7605h.f15467a, DddTag.DEVICE);

        /* renamed from: b */
        public static String[] f15469b = {C7607a.f15470a, C7607a.f15471b};

        /* renamed from: com.yeelight.yeelib.data.h$a$a */
        public static class C7607a {

            /* renamed from: a */
            public static String f15470a = "_id";

            /* renamed from: b */
            public static String f15471b = "device_id";
        }
    }
}
