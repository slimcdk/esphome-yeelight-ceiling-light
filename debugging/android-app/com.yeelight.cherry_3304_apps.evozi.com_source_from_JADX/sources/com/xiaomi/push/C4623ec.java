package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ec */
public class C4623ec extends C4624ed {

    /* renamed from: a */
    public static String f8435a = "";

    /* renamed from: b */
    public static String f8436b = "";

    public C4623ec(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    private String m13793a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length <= 10) {
            return str2;
        }
        int length = split.length;
        while (true) {
            length--;
            if (length < split.length - 10) {
                return str;
            }
            str = str + split[length];
        }
    }

    /* renamed from: a */
    public int mo22734a() {
        return 12;
    }

    /* renamed from: a */
    public C4741ho m13795a() {
        return C4741ho.BroadcastAction;
    }

    /* renamed from: a */
    public String m13796a() {
        String str;
        if (!TextUtils.isEmpty(f8435a)) {
            str = "" + m13793a(C4615dv.f8429a, f8435a);
            f8435a = "";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(f8436b)) {
            return str;
        }
        String str2 = str + m13793a(C4615dv.f8430b, f8436b);
        f8436b = "";
        return str2;
    }
}
