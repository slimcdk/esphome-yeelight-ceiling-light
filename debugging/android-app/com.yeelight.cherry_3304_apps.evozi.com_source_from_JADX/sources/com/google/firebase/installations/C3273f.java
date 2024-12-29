package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.f */
final /* synthetic */ class C3273f implements Runnable {

    /* renamed from: a */
    private final C3274g f6332a;

    /* renamed from: b */
    private final boolean f6333b;

    private C3273f(C3274g gVar, boolean z) {
        this.f6332a = gVar;
        this.f6333b = z;
    }

    /* renamed from: b */
    public static Runnable m10145b(C3274g gVar, boolean z) {
        return new C3273f(gVar, z);
    }

    public void run() {
        this.f6332a.m10154j(this.f6333b);
    }
}
