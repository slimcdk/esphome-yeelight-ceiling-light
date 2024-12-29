package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p122o.C3024e;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.c.g.o */
class C2944o implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C2945a f5713a;

    /* renamed from: b */
    private final C3024e f5714b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f5715c;

    /* renamed from: d */
    private final AtomicBoolean f5716d = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.c.g.o$a */
    interface C2945a {
        /* renamed from: a */
        void mo17252a(C3024e eVar, Thread thread, Throwable th);
    }

    public C2944o(C2945a aVar, C3024e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5713a = aVar;
        this.f5714b = eVar;
        this.f5715c = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17285a() {
        return this.f5716d.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C2857b f;
        String str;
        this.f5716d.set(true);
        if (thread == null) {
            try {
                f = C2857b.m8687f();
                str = "Could not handle uncaught exception; null thread";
            } catch (Exception e) {
                C2857b.m8687f().mo17133e("An error occurred in the uncaught exception handler", e);
            } catch (Throwable th2) {
                C2857b.m8687f().mo17130b("Crashlytics completed exception processing. Invoking default exception handler.");
                this.f5715c.uncaughtException(thread, th);
                this.f5716d.set(false);
                throw th2;
            }
        } else if (th == null) {
            f = C2857b.m8687f();
            str = "Could not handle uncaught exception; null throwable";
        } else {
            this.f5713a.mo17252a(this.f5714b, thread, th);
            C2857b.m8687f().mo17130b("Crashlytics completed exception processing. Invoking default exception handler.");
            this.f5715c.uncaughtException(thread, th);
            this.f5716d.set(false);
        }
        f.mo17132d(str);
        C2857b.m8687f().mo17130b("Crashlytics completed exception processing. Invoking default exception handler.");
        this.f5715c.uncaughtException(thread, th);
        this.f5716d.set(false);
    }
}
