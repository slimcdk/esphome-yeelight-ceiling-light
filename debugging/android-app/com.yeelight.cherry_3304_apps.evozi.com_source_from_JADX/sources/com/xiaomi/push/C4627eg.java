package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.eg */
public class C4627eg extends C4624ed {
    public C4627eg(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public int mo22734a() {
        return 23;
    }

    /* renamed from: a */
    public C4741ho m13820a() {
        return C4741ho.Storage;
    }

    /* renamed from: a */
    public String m13821a() {
        return "ram:" + C4753i.m14745b() + Constants.ACCEPT_TIME_SEPARATOR_SP + "rom:" + C4753i.m14751c() + "|" + "ramOriginal:" + C4753i.m14755d() + Constants.ACCEPT_TIME_SEPARATOR_SP + "romOriginal:" + C4753i.m14758e();
    }
}
