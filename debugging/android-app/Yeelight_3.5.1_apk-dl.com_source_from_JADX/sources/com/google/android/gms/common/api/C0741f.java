package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0744h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C0741f<R extends C0744h> {

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.f$a */
    public interface C0742a {
        @KeepForSdk
        /* renamed from: a */
        void mo11877a(@NonNull Status status);
    }

    @KeepForSdk
    /* renamed from: b */
    public abstract void mo11875b(@NonNull C0742a aVar);

    @NonNull
    /* renamed from: c */
    public abstract R mo11876c(long j, @NonNull TimeUnit timeUnit);
}
