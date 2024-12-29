package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.C0744h;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
public final class C0812m1 extends C0748a0 {
    @NotOnlyInitialized

    /* renamed from: c */
    private final C0733c f703c;

    public C0812m1(C0733c cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f703c = cVar;
    }

    /* renamed from: g */
    public final <A extends C0722a.C0724b, R extends C0744h, T extends C0763d<R, A>> T mo11863g(@NonNull T t) {
        return this.f703c.mo11850f(t);
    }

    /* renamed from: h */
    public final <A extends C0722a.C0724b, T extends C0763d<? extends C0744h, A>> T mo11864h(@NonNull T t) {
        return this.f703c.mo11853i(t);
    }

    /* renamed from: i */
    public final Looper mo11865i() {
        return this.f703c.mo11855k();
    }

    /* renamed from: m */
    public final void mo11869m(C0824o2 o2Var) {
    }
}
