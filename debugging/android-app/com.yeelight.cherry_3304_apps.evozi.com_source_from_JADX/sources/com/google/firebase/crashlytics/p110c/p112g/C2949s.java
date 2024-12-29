package com.google.firebase.crashlytics.p110c.p112g;

/* renamed from: com.google.firebase.crashlytics.c.g.s */
public enum C2949s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: a */
    private final int f5733a;

    private C2949s(int i) {
        this.f5733a = i;
    }

    /* renamed from: a */
    public static C2949s m9042a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: b */
    public int mo17291b() {
        return this.f5733a;
    }

    public String toString() {
        return Integer.toString(this.f5733a);
    }
}
