package com.google.firebase.crashlytics.p110c.p125p;

/* renamed from: com.google.firebase.crashlytics.c.p.e */
public class C3044e {

    /* renamed from: a */
    public final String f5927a;

    /* renamed from: b */
    public final String f5928b;

    /* renamed from: c */
    public final StackTraceElement[] f5929c;

    /* renamed from: d */
    public final C3044e f5930d;

    public C3044e(Throwable th, C3043d dVar) {
        this.f5927a = th.getLocalizedMessage();
        this.f5928b = th.getClass().getName();
        this.f5929c = dVar.mo17428a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f5930d = cause != null ? new C3044e(cause, dVar) : null;
    }
}
