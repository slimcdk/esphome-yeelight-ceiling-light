package com.yeelight.yeelib.models;

import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.yeelib.models.k */
public class C8319k {

    /* renamed from: e */
    private static final String f14293e = "k";

    /* renamed from: a */
    private int f14294a;

    /* renamed from: b */
    private FlowItemMode f14295b;

    /* renamed from: c */
    private int f14296c;

    /* renamed from: d */
    private int f14297d;

    public C8319k(int i, FlowItemMode flowItemMode, int i2, int i3) {
        this.f14294a = i;
        this.f14295b = flowItemMode;
        this.f14296c = i2;
        this.f14297d = i3;
    }

    /* renamed from: a */
    public static C8319k m19747a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("build flow item with string: ");
        sb.append(str);
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length == 4) {
            return new C8319k(Integer.valueOf(split[0]).intValue(), FlowItemMode.values()[Integer.valueOf(split[1]).intValue()], Integer.valueOf(split[2]).intValue(), Integer.valueOf(split[3]).intValue());
        }
        String str2 = f14293e;
        AppUtils.m8300u(str2, "invalid flow item string: " + str + ", length: " + split.length);
        return null;
    }

    /* renamed from: b */
    public int mo35374b() {
        return this.f14297d;
    }

    /* renamed from: c */
    public int mo35375c() {
        return this.f14294a;
    }

    /* renamed from: d */
    public FlowItemMode mo35376d() {
        return this.f14295b;
    }

    /* renamed from: e */
    public int mo35377e() {
        return this.f14296c;
    }

    /* renamed from: f */
    public void mo35378f(int i) {
        this.f14297d = i;
    }

    /* renamed from: g */
    public void mo35379g(int i) {
        this.f14294a = i;
    }

    /* renamed from: h */
    public void mo35380h(int i) {
        this.f14296c = i;
    }

    /* renamed from: i */
    public String mo35381i() {
        return mo35375c() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo35376d().ordinal() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo35377e() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo35374b();
    }
}
