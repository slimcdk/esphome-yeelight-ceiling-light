package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hx */
public enum C4774hx {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: a */
    private final int f8805a;

    private C4774hx(int i) {
        this.f8805a = i;
    }

    /* renamed from: a */
    public static C4774hx m14360a(int i) {
        if (i == 0) {
            return RegIdExpired;
        }
        if (i == 1) {
            return PackageUnregistered;
        }
        if (i != 2) {
            return null;
        }
        return Init;
    }

    /* renamed from: a */
    public int mo29426a() {
        return this.f8805a;
    }
}
