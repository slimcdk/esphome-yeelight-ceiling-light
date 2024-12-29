package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p101u.C3709d;
import p101u.C3710e;

/* renamed from: com.google.android.gms.common.v */
final class C0963v extends C0964w {

    /* renamed from: e */
    private final Callable f1175e;

    /* synthetic */ C0963v(Callable callable, C3709d dVar) {
        super(false, 1, 5, (String) null, (Throwable) null, (C3710e) null);
        this.f1175e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12432a() {
        try {
            return (String) this.f1175e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
