package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.f0 */
public final class C3220f0 extends Binder {

    /* renamed from: a */
    private final C3226h0 f6239a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17829a(C3232j0 j0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            this.f6239a.mo17833b(j0Var.f6250a).mo8642c(C3250s0.m10106a(), new C3229i0(j0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
