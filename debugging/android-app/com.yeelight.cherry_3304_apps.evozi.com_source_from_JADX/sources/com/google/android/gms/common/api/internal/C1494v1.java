package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1418c;
import com.google.android.gms.common.api.internal.C1426e;

/* renamed from: com.google.android.gms.common.api.internal.v1 */
public final class C1494v1<A extends C1418c<? extends C1507j, C1382a.C1384b>> extends C1461l0 {

    /* renamed from: a */
    private final A f2823a;

    public C1494v1(int i, A a) {
        super(i);
        this.f2823a = a;
    }

    /* renamed from: b */
    public final void mo10986b(@NonNull Status status) {
        this.f2823a.mo10894y(status);
    }

    /* renamed from: c */
    public final void mo10987c(C1426e.C1427a<?> aVar) {
        try {
            this.f2823a.mo10893w(aVar.mo10929p());
        } catch (RuntimeException e) {
            mo10989e(e);
        }
    }

    /* renamed from: d */
    public final void mo10988d(@NonNull C1474p pVar, boolean z) {
        pVar.mo10998b(this.f2823a, z);
    }

    /* renamed from: e */
    public final void mo10989e(@NonNull RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f2823a.mo10894y(new Status(10, sb.toString()));
    }
}
