package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.C2402h;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p118y0.C3909a;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.o */
class C2245o implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C2246a f3625a;

    /* renamed from: b */
    private final C2402h f3626b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f3627c;

    /* renamed from: d */
    private final C3909a f3628d;

    /* renamed from: e */
    private final AtomicBoolean f3629e = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.o$a */
    interface C2246a {
        /* renamed from: a */
        void mo18565a(C2402h hVar, Thread thread, Throwable th);
    }

    public C2245o(C2246a aVar, C2402h hVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3909a aVar2) {
        this.f3625a = aVar;
        this.f3626b = hVar;
        this.f3627c = uncaughtExceptionHandler;
        this.f3628d = aVar2;
    }

    /* renamed from: b */
    private boolean m5745b(Thread thread, Throwable th) {
        if (thread == null) {
            C3916f.m11190f().mo26401d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C3916f.m11190f().mo26401d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f3628d.mo26388b()) {
            return true;
        } else {
            C3916f.m11190f().mo26399b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo18604a() {
        return this.f3629e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f3629e.set(true);
        try {
            if (m5745b(thread, th)) {
                this.f3625a.mo18565a(this.f3626b, thread, th);
            } else {
                C3916f.m11190f().mo26399b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C3916f.m11190f().mo26402e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C3916f.m11190f().mo26399b("Completed exception processing. Invoking default exception handler.");
            this.f3627c.uncaughtException(thread, th);
            this.f3629e.set(false);
            throw th2;
        }
        C3916f.m11190f().mo26399b("Completed exception processing. Invoking default exception handler.");
        this.f3627c.uncaughtException(thread, th);
        this.f3629e.set(false);
    }
}
