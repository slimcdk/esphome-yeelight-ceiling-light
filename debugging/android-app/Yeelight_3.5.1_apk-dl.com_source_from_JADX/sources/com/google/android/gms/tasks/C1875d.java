package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p065m0.C3340h;

/* renamed from: com.google.android.gms.tasks.d */
final class C1875d<T> implements C1876e<T> {

    /* renamed from: a */
    private final CountDownLatch f2908a = new CountDownLatch(1);

    /* synthetic */ C1875d(C3340h hVar) {
    }

    /* renamed from: a */
    public final void mo14741a(T t) {
        this.f2908a.countDown();
    }

    /* renamed from: b */
    public final void mo14742b() {
        this.f2908a.await();
    }

    /* renamed from: c */
    public final void mo14743c() {
        this.f2908a.countDown();
    }

    /* renamed from: d */
    public final void mo14744d(@NonNull Exception exc) {
        this.f2908a.countDown();
    }

    /* renamed from: e */
    public final boolean mo14745e(long j, TimeUnit timeUnit) {
        return this.f2908a.await(j, timeUnit);
    }
}
