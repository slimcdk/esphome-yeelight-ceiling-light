package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.eh */
public class C4628eh extends C4624ed {

    /* renamed from: a */
    private SharedPreferences f8448a;

    public C4628eh(Context context, int i) {
        super(context, i);
        this.f8448a = context.getSharedPreferences("mipush_extra", 0);
    }

    /* renamed from: a */
    public int mo22734a() {
        return 9;
    }

    /* renamed from: a */
    public C4741ho m13823a() {
        return C4741ho.TopApp;
    }

    /* renamed from: a */
    public String m13824a() {
        return null;
    }
}
