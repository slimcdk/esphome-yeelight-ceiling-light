package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.z */
final class C1897z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1896y f2961a;

    /* renamed from: b */
    final /* synthetic */ Callable f2962b;

    C1897z(C1896y yVar, Callable callable) {
        this.f2961a = yVar;
        this.f2962b = callable;
    }

    public final void run() {
        try {
            this.f2961a.mo14775r(this.f2962b.call());
        } catch (Exception e) {
            this.f2961a.mo14774q(e);
        } catch (Throwable th) {
            this.f2961a.mo14774q(new RuntimeException(th));
        }
    }
}
