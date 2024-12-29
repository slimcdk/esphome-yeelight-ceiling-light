package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ht */
public enum C4746ht {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);
    

    /* renamed from: a */
    private final int f9190a;

    private C4746ht(int i) {
        this.f9190a = i;
    }

    /* renamed from: a */
    public static C4746ht m14608a(int i) {
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
