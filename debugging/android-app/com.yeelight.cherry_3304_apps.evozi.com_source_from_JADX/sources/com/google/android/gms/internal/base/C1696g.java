package com.google.android.gms.internal.base;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.base.g */
final class C1696g implements C1693d {
    private C1696g() {
    }

    @NonNull
    /* renamed from: a */
    public final ExecutorService mo11406a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
