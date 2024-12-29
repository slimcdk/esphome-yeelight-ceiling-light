package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hs */
public enum C4745hs {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: a */
    private final int f9184a;

    private C4745hs(int i) {
        this.f9184a = i;
    }

    /* renamed from: a */
    public static C4745hs m14606a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    /* renamed from: a */
    public int mo25292a() {
        return this.f9184a;
    }
}
