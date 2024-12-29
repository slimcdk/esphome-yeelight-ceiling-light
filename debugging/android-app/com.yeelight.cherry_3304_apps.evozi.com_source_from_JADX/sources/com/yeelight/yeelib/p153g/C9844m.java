package com.yeelight.yeelib.p153g;

import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.g.m */
public class C9844m {

    /* renamed from: e */
    private static final String f17838e = "m";

    /* renamed from: a */
    private int f17839a;

    /* renamed from: b */
    private C9845n f17840b;

    /* renamed from: c */
    private int f17841c;

    /* renamed from: d */
    private int f17842d;

    public C9844m(int i, C9845n nVar, int i2, int i3) {
        this.f17839a = i;
        this.f17840b = nVar;
        this.f17841c = i2;
        this.f17842d = i3;
    }

    /* renamed from: a */
    public static C9844m m23985a(String str) {
        "build flow item with string: " + str;
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length == 4) {
            return new C9844m(Integer.valueOf(split[0]).intValue(), C9845n.values()[Integer.valueOf(split[1]).intValue()], Integer.valueOf(split[2]).intValue(), Integer.valueOf(split[3]).intValue());
        }
        C4308b.m12139r(f17838e, "invalid flow item string: " + str + ", length: " + split.length);
        return null;
    }

    /* renamed from: b */
    public int mo31787b() {
        return this.f17842d;
    }

    /* renamed from: c */
    public int mo31788c() {
        return this.f17839a;
    }

    /* renamed from: d */
    public C9845n mo31789d() {
        return this.f17840b;
    }

    /* renamed from: e */
    public int mo31790e() {
        return this.f17841c;
    }

    /* renamed from: f */
    public void mo31791f(int i) {
        this.f17842d = i;
    }

    /* renamed from: g */
    public void mo31792g(int i) {
        this.f17839a = i;
    }

    /* renamed from: h */
    public void mo31793h(int i) {
        this.f17841c = i;
    }

    /* renamed from: i */
    public String mo31794i() {
        return mo31788c() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo31789d().ordinal() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo31790e() + Constants.ACCEPT_TIME_SEPARATOR_SP + mo31787b();
    }
}
