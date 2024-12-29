package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.crashlytics.internal.common.y */
public final class C2259y {

    /* renamed from: a */
    private final AtomicInteger f3656a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f3657b = new AtomicInteger();

    /* renamed from: a */
    public void mo18618a() {
        this.f3657b.getAndIncrement();
    }

    /* renamed from: b */
    public void mo18619b() {
        this.f3656a.getAndIncrement();
    }

    /* renamed from: c */
    public void mo18620c() {
        this.f3657b.set(0);
    }
}
