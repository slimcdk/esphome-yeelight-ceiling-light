package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.ExecutorService;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.iid.i1 */
final class C3230i1 implements C3211c0 {

    /* renamed from: a */
    private final ExecutorService f6248a;

    C3230i1(ExecutorService executorService) {
        this.f6248a = executorService;
    }

    /* renamed from: b */
    public final C0619h<Integer> mo17810b(Intent intent) {
        return C0623k.m536c(this.f6248a, new C3227h1(intent));
    }
}
