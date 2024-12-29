package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1386d;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.common.api.C1507j;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
public final class C1411a1<O extends C1382a.C1386d> extends C1486t {

    /* renamed from: c */
    private final C1396e<O> f2607c;

    public C1411a1(C1396e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f2607c = eVar;
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10827f(@NonNull T t) {
        this.f2607c.mo10814c(t);
        return t;
    }

    /* renamed from: g */
    public final Looper mo10828g() {
        return this.f2607c.mo10820i();
    }

    /* renamed from: i */
    public final void mo10830i(C1470n1 n1Var) {
    }
}
