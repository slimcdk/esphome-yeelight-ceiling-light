package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1507j;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.g */
public abstract class C1403g<R extends C1507j> {

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.api.g$a */
    public interface C1404a {
        @KeepForSdk
        /* renamed from: a */
        void mo10841a(Status status);
    }

    @KeepForSdk
    /* renamed from: b */
    public abstract void mo10839b(@NonNull C1404a aVar);

    @NonNull
    /* renamed from: c */
    public abstract R mo10840c(long j, @NonNull TimeUnit timeUnit);
}
