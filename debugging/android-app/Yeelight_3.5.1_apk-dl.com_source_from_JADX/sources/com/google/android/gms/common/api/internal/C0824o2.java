package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0743g;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.C0745i;
import com.google.android.gms.common.api.C0871j;
import com.google.android.gms.common.api.C0872k;
import com.google.android.gms.common.api.C0873l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917i;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.o2 */
public final class C0824o2<R extends C0744h> extends C0873l<R> implements C0745i<R> {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public C0872k f729a;
    @Nullable

    /* renamed from: b */
    private C0824o2 f730b;
    @Nullable

    /* renamed from: c */
    private volatile C0871j f731c;

    /* renamed from: d */
    private final Object f732d;
    @Nullable

    /* renamed from: e */
    private Status f733e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference f734f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0813m2 f735g;

    /* renamed from: g */
    private final void m988g(Status status) {
        synchronized (this.f732d) {
            this.f733e = status;
            m989h(status);
        }
    }

    /* renamed from: h */
    private final void m989h(Status status) {
        synchronized (this.f732d) {
            C0872k kVar = this.f729a;
            if (kVar != null) {
                ((C0824o2) C0917i.m1419j(this.f730b)).m988g((Status) C0917i.m1420k(kVar.mo12112a(status), "onFailure must not return null"));
            } else if (m990i()) {
                ((C0871j) C0917i.m1419j(this.f731c)).mo12110b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: i */
    private final boolean m990i() {
        return (this.f731c == null || ((C0736d) this.f734f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m991j(C0744h hVar) {
        if (hVar instanceof C0743g) {
            try {
                ((C0743g) hVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(hVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo11879a(C0744h hVar) {
        synchronized (this.f732d) {
            if (!hVar.mo11805N().mo11812g0()) {
                m988g(hVar.mo11805N());
                m991j(hVar);
            } else if (this.f729a != null) {
                C0771e2.m793a().submit(new C0808l2(this, hVar));
            } else if (m990i()) {
                ((C0871j) C0917i.m1419j(this.f731c)).mo12111c(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo12055f() {
        this.f731c = null;
    }
}
