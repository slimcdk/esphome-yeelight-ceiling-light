package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hq */
public enum C4767hq {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);
    

    /* renamed from: a */
    private final int f8641a;

    private C4767hq(int i) {
        this.f8641a = i;
    }

    /* renamed from: a */
    public static C4767hq m14235a(int i) {
        if (i == 1) {
            return INT;
        }
        if (i == 2) {
            return LONG;
        }
        if (i == 3) {
            return STRING;
        }
        if (i != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
