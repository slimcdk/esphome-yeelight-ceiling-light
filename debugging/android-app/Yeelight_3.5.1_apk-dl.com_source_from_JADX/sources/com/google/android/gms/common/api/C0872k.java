package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C0744h;

/* renamed from: com.google.android.gms.common.api.k */
public abstract class C0872k<R extends C0744h, S extends C0744h> {
    @NonNull
    /* renamed from: a */
    public Status mo12112a(@NonNull Status status) {
        return status;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public abstract C0741f<S> mo12113b(@NonNull R r);
}
