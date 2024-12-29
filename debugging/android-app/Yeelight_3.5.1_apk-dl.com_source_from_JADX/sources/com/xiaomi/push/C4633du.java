package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.du */
public class C4633du extends C4632dt {
    public C4633du(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public C4762hl mo28479a() {
        return C4762hl.Storage;
    }

    /* renamed from: a */
    public String m13354a() {
        return "23";
    }

    /* renamed from: b */
    public String mo28920b() {
        return "ram:" + C4805j.m14859a() + Constants.ACCEPT_TIME_SEPARATOR_SP + "rom:" + C4805j.m14868b() + "|" + "ramOriginal:" + C4805j.m14873c() + Constants.ACCEPT_TIME_SEPARATOR_SP + "romOriginal:" + C4805j.m14878d();
    }
}
