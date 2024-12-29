package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.x */
final class C1674x extends C1672v {

    /* renamed from: e */
    private final Callable<String> f3198e;

    private C1674x(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f3198e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11385a() {
        try {
            return this.f3198e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
