package com.google.firebase.iid;

import java.util.concurrent.ScheduledFuture;
import p011c.p012a.p019b.p028b.p038e.C0612c;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.l0 */
final /* synthetic */ class C3236l0 implements C0612c {

    /* renamed from: a */
    private final ScheduledFuture f6262a;

    C3236l0(ScheduledFuture scheduledFuture) {
        this.f6262a = scheduledFuture;
    }

    /* renamed from: b */
    public final void mo8639b(C0619h hVar) {
        this.f6262a.cancel(false);
    }
}
