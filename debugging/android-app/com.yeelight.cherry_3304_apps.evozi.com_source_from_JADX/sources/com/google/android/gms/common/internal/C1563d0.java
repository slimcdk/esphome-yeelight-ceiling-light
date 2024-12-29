package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C1403g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1605t;
import java.util.concurrent.TimeUnit;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.internal.d0 */
final class C1563d0 implements C1403g.C1404a {

    /* renamed from: a */
    private final /* synthetic */ C1403g f3012a;

    /* renamed from: b */
    private final /* synthetic */ C0620i f3013b;

    /* renamed from: c */
    private final /* synthetic */ C1605t.C1606a f3014c;

    /* renamed from: d */
    private final /* synthetic */ C1605t.C1607b f3015d;

    C1563d0(C1403g gVar, C0620i iVar, C1605t.C1606a aVar, C1605t.C1607b bVar) {
        this.f3012a = gVar;
        this.f3013b = iVar;
        this.f3014c = aVar;
        this.f3015d = bVar;
    }

    /* renamed from: a */
    public final void mo10841a(Status status) {
        if (status.mo10776T()) {
            this.f3013b.mo8668c(this.f3014c.mo11288a(this.f3012a.mo10840c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f3013b.mo8667b(this.f3015d.mo11139a(status));
    }
}
