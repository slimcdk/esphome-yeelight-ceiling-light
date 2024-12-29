package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hp */
public enum C4766hp {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: a */
    private final int f8635a;

    private C4766hp(int i) {
        this.f8635a = i;
    }

    /* renamed from: a */
    public static C4766hp m14233a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    /* renamed from: a */
    public int mo29323a() {
        return this.f8635a;
    }
}
