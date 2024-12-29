package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.CountDownLatch;
import p065m0.C3333a;
import p065m0.C3339g;

/* renamed from: com.google.firebase.crashlytics.internal.common.f0 */
public final /* synthetic */ class C2214f0 implements C3333a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f3539a;

    public /* synthetic */ C2214f0(CountDownLatch countDownLatch) {
        this.f3539a = countDownLatch;
    }

    /* renamed from: a */
    public final Object mo18508a(C3339g gVar) {
        return this.f3539a.countDown();
    }
}
