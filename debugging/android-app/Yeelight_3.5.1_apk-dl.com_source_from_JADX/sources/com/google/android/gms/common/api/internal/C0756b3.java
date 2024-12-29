package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
final class C0756b3 implements Runnable {

    /* renamed from: a */
    private final C0870z2 f585a;

    /* renamed from: b */
    final /* synthetic */ C0762c3 f586b;

    C0756b3(C0762c3 c3Var, C0870z2 z2Var) {
        this.f586b = c3Var;
        this.f585a = z2Var;
    }

    @MainThread
    public final void run() {
        if (this.f586b.f594b) {
            ConnectionResult b = this.f585a.mo12109b();
            if (b.mo11754d0()) {
                C0762c3 c3Var = this.f586b;
                c3Var.f572a.startActivityForResult(GoogleApiActivity.m636a(c3Var.mo11892b(), (PendingIntent) C0917i.m1419j(b.mo11753c0()), this.f585a.mo12108a(), false), 1);
                return;
            }
            C0762c3 c3Var2 = this.f586b;
            if (c3Var2.f597e.mo11770d(c3Var2.mo11892b(), b.mo11751V(), (String) null) != null) {
                C0762c3 c3Var3 = this.f586b;
                c3Var3.f597e.mo11786y(c3Var3.mo11892b(), this.f586b.f572a, b.mo11751V(), 2, this.f586b);
            } else if (b.mo11751V() == 18) {
                C0762c3 c3Var4 = this.f586b;
                Dialog t = c3Var4.f597e.mo11781t(c3Var4.mo11892b(), this.f586b);
                C0762c3 c3Var5 = this.f586b;
                c3Var5.f597e.mo11782u(c3Var5.mo11892b().getApplicationContext(), new C0751a3(this, t));
            } else {
                this.f586b.m761l(b, this.f585a.mo12108a());
            }
        }
    }
}
