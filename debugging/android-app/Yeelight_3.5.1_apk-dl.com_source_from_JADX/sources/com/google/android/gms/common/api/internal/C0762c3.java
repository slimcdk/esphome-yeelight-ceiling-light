package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;
import p040h0.C3239j;

/* renamed from: com.google.android.gms.common.api.internal.c3 */
public abstract class C0762c3 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f594b;

    /* renamed from: c */
    protected final AtomicReference f595c = new AtomicReference((Object) null);

    /* renamed from: d */
    private final Handler f596d = new C3239j(Looper.getMainLooper());

    /* renamed from: e */
    protected final C0721a f597e;

    @VisibleForTesting
    C0762c3(C0788i iVar, C0721a aVar) {
        super(iVar);
        this.f597e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m761l(ConnectionResult connectionResult, int i) {
        this.f595c.set((Object) null);
        mo11924m(connectionResult, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m762o() {
        this.f595c.set((Object) null);
        mo11925n();
    }

    /* renamed from: p */
    private static final int m763p(@Nullable C0870z2 z2Var) {
        if (z2Var == null) {
            return -1;
        }
        return z2Var.mo12108a();
    }

    /* renamed from: e */
    public final void mo11893e(int i, int i2, Intent intent) {
        C0870z2 z2Var = (C0870z2) this.f595c.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f597e.mo11773i(mo11892b());
                if (i3 == 0) {
                    m762o();
                    return;
                } else if (z2Var != null) {
                    if (z2Var.mo12109b().mo11751V() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m762o();
            return;
        } else if (i2 == 0) {
            if (z2Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m761l(new ConnectionResult(i4, (PendingIntent) null, z2Var.mo12109b().toString()), m763p(z2Var));
                return;
            }
            return;
        }
        if (z2Var != null) {
            m761l(z2Var.mo12109b(), z2Var.mo12108a());
        }
    }

    /* renamed from: f */
    public final void mo11894f(@Nullable Bundle bundle) {
        super.mo11894f(bundle);
        if (bundle != null) {
            this.f595c.set(bundle.getBoolean("resolving_error", false) ? new C0870z2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: i */
    public final void mo11897i(Bundle bundle) {
        super.mo11897i(bundle);
        C0870z2 z2Var = (C0870z2) this.f595c.get();
        if (z2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", z2Var.mo12108a());
            bundle.putInt("failed_status", z2Var.mo12109b().mo11751V());
            bundle.putParcelable("failed_resolution", z2Var.mo12109b().mo11753c0());
        }
    }

    /* renamed from: j */
    public void mo11898j() {
        super.mo11898j();
        this.f594b = true;
    }

    /* renamed from: k */
    public void mo11899k() {
        super.mo11899k();
        this.f594b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo11924m(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo11925n();

    public final void onCancel(DialogInterface dialogInterface) {
        m761l(new ConnectionResult(13, (PendingIntent) null), m763p((C0870z2) this.f595c.get()));
    }

    /* renamed from: s */
    public final void mo11927s(ConnectionResult connectionResult, int i) {
        C0870z2 z2Var = new C0870z2(connectionResult, i);
        AtomicReference atomicReference = this.f595c;
        while (!atomicReference.compareAndSet((Object) null, z2Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f596d.post(new C0756b3(this, z2Var));
    }
}
