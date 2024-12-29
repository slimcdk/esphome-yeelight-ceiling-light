package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;

/* renamed from: com.xiaomi.push.w */
public class C4995w {

    /* renamed from: com.xiaomi.push.w$a */
    public static class C4996a {

        /* renamed from: a */
        private final String f9765a;

        /* renamed from: a */
        private final StringBuilder f9766a;

        /* renamed from: b */
        private final String f9767b;

        public C4996a() {
            this(Constants.COLON_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SP);
        }

        public C4996a(String str, String str2) {
            this.f9766a = new StringBuilder();
            this.f9765a = str;
            this.f9767b = str2;
        }

        /* renamed from: a */
        public C4996a mo30094a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f9766a.length() > 0) {
                    this.f9766a.append(this.f9767b);
                }
                StringBuilder sb = this.f9766a;
                sb.append(str);
                sb.append(this.f9765a);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f9766a.toString();
        }
    }

    /* renamed from: a */
    public static int m15744a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static boolean m15745a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* renamed from: a */
    public static boolean m15746a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return Build.VERSION.SDK_INT >= 20 ? powerManager != null && powerManager.isInteractive() : powerManager != null && powerManager.isScreenOn();
    }

    /* renamed from: a */
    public static boolean m15747a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: b */
    public static int m15748b(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }
}
