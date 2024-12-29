package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import p011c.p012a.p019b.p028b.p038e.C0612c;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.b1 */
final /* synthetic */ class C3209b1 implements C0612c {

    /* renamed from: a */
    private final boolean f6204a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f6205b;

    C3209b1(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f6204a = z;
        this.f6205b = pendingResult;
    }

    /* renamed from: b */
    public final void mo8639b(C0619h hVar) {
        FirebaseInstanceIdReceiver.m10022b(this.f6204a, this.f6205b, hVar);
    }
}
