package com.google.firebase.iid;

import java.util.concurrent.CountDownLatch;
import p011c.p012a.p019b.p028b.p038e.C0612c;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.w0 */
final /* synthetic */ class C3258w0 implements C0612c {

    /* renamed from: a */
    private final CountDownLatch f6303a;

    C3258w0(CountDownLatch countDownLatch) {
        this.f6303a = countDownLatch;
    }

    /* renamed from: b */
    public final void mo8639b(C0619h hVar) {
        this.f6303a.countDown();
    }
}
