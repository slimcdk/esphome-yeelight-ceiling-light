package com.yeelight.yeelib_tasker.p195c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yeelight.yeelib_tasker.C10568a;

/* renamed from: com.yeelight.yeelib_tasker.c.b */
public final class C10572b {
    /* renamed from: a */
    public static Bundle m25878a(Context context, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.yeelight.tasker.extra.INT_VERSION_CODE", C10568a.m25864a(context));
        bundle.putString("com.yeelight.tasker.extra.DEVICE_TYPE", str);
        bundle.putString("com.yeelight.tasker.extra.DEVICE_ID", str2);
        bundle.putString("com.yeelight.tasker.extra.ACTION", str3);
        bundle.putString("com.yeelight.tasker.extra.PARAM", str4);
        return bundle;
    }

    /* renamed from: b */
    public static boolean m25879b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (!bundle.containsKey("com.yeelight.tasker.extra.DEVICE_TYPE") || !bundle.containsKey("com.yeelight.tasker.extra.DEVICE_ID") || !bundle.containsKey("com.yeelight.tasker.extra.ACTION") || !bundle.containsKey("com.yeelight.tasker.extra.PARAM")) {
            String.format("bundle must contain extra %s and %s", new Object[]{"com.yeelight.tasker.extra.DEVICE_ID", "com.yeelight.tasker.extra.ACTION"});
            return false;
        } else if (!bundle.containsKey("com.yeelight.tasker.extra.INT_VERSION_CODE")) {
            String.format("bundle must contain extra %s", new Object[]{"com.yeelight.tasker.extra.INT_VERSION_CODE"});
            return false;
        } else if (5 != bundle.keySet().size() && 6 != bundle.keySet().size()) {
            String.format("bundle must contain 5/6 keys, but currently contains %d keys: %s", new Object[]{Integer.valueOf(bundle.keySet().size()), bundle.keySet()});
            return false;
        } else if (TextUtils.isEmpty(bundle.getString("com.yeelight.tasker.extra.DEVICE_ID"))) {
            String.format("bundle extra %s appears to be null or empty.  It must be a non-empty string", new Object[]{"com.yeelight.tasker.extra.DEVICE_ID"});
            return false;
        } else if (TextUtils.isEmpty(bundle.getString("com.yeelight.tasker.extra.ACTION"))) {
            String.format("bundle extra %s appears to be null or empty.  It must be a non-empty string", new Object[]{"com.yeelight.tasker.extra.ACTION"});
            return false;
        } else if (bundle.getInt("com.yeelight.tasker.extra.INT_VERSION_CODE", 0) == bundle.getInt("com.yeelight.tasker.extra.INT_VERSION_CODE", 1)) {
            return true;
        } else {
            String.format("bundle extra %s appears to be the wrong type.  It must be an int", new Object[]{"com.yeelight.tasker.extra.INT_VERSION_CODE"});
            return false;
        }
    }
}
