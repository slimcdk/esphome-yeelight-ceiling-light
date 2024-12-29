package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ia */
public enum C4754ia {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: a */
    private final int f9347a;

    private C4754ia(int i) {
        this.f9347a = i;
    }

    /* renamed from: a */
    public static C4754ia m14771a(int i) {
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
    public int mo25395a() {
        return this.f9347a;
    }
}
