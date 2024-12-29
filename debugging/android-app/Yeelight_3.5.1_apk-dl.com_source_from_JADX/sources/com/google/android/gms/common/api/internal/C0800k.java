package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.k */
public class C0800k {

    /* renamed from: a */
    private final Set f678a = Collections.newSetFromMap(new WeakHashMap());

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <L> C0793j<L> m916a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        C0917i.m1420k(l, "Listener must not be null");
        C0917i.m1420k(looper, "Looper must not be null");
        C0917i.m1420k(str, "Listener type must not be null");
        return new C0793j<>(looper, l, str);
    }

    /* renamed from: b */
    public final void mo12021b() {
        for (C0793j a : this.f678a) {
            a.mo12006a();
        }
        this.f678a.clear();
    }
}
