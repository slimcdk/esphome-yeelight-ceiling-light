package com.google.firebase.crashlytics.p110c;

import android.util.Log;

/* renamed from: com.google.firebase.crashlytics.c.b */
public class C2857b {

    /* renamed from: c */
    static final C2857b f5501c = new C2857b("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f5502a;

    /* renamed from: b */
    private int f5503b = 4;

    public C2857b(String str) {
        this.f5502a = str;
    }

    /* renamed from: a */
    private boolean m8686a(int i) {
        return this.f5503b <= i || Log.isLoggable(this.f5502a, i);
    }

    /* renamed from: f */
    public static C2857b m8687f() {
        return f5501c;
    }

    /* renamed from: b */
    public void mo17130b(String str) {
        mo17131c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo17131c(String str, Throwable th) {
        boolean a = m8686a(3);
    }

    /* renamed from: d */
    public void mo17132d(String str) {
        mo17133e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo17133e(String str, Throwable th) {
        boolean a = m8686a(6);
    }

    /* renamed from: g */
    public void mo17134g(String str) {
        mo17135h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo17135h(String str, Throwable th) {
        boolean a = m8686a(4);
    }

    /* renamed from: i */
    public void mo17136i(String str) {
        mo17137j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo17137j(String str, Throwable th) {
        boolean a = m8686a(5);
    }
}
