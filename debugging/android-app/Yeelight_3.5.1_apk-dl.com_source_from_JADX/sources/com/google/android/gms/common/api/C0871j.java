package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0744h;

/* renamed from: com.google.android.gms.common.api.j */
public abstract class C0871j<R extends C0744h> implements C0745i<R> {
    @KeepForSdk
    /* renamed from: a */
    public final void mo11879a(@NonNull R r) {
        Status N = r.mo11805N();
        if (N.mo11812g0()) {
            mo12111c(r);
            return;
        }
        mo12110b(N);
        if (r instanceof C0743g) {
            try {
                ((C0743g) r).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo12110b(@NonNull Status status);

    /* renamed from: c */
    public abstract void mo12111c(@NonNull R r);
}
