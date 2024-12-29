package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.c */
final /* synthetic */ class C3270c implements Runnable {

    /* renamed from: a */
    private final C3274g f6329a;

    private C3270c(C3274g gVar) {
        this.f6329a = gVar;
    }

    /* renamed from: b */
    public static Runnable m10142b(C3274g gVar) {
        return new C3270c(gVar);
    }

    public void run() {
        this.f6329a.m10153i();
    }
}
