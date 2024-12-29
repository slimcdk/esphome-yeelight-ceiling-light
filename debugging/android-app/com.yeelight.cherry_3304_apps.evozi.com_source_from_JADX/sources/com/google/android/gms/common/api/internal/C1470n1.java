package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1405h;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.C1508k;
import com.google.android.gms.common.api.C1509l;
import com.google.android.gms.common.api.C1510m;
import com.google.android.gms.common.api.C1511n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1609u;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
public final class C1470n1<R extends C1507j> extends C1511n<R> implements C1508k<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1510m<? super R, ? extends C1507j> f2773a;

    /* renamed from: b */
    private C1470n1<? extends C1507j> f2774b;

    /* renamed from: c */
    private volatile C1509l<? super R> f2775c;

    /* renamed from: d */
    private final Object f2776d;

    /* renamed from: e */
    private Status f2777e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C1399f> f2778f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1476p1 f2779g;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m3965c(C1507j jVar) {
        if (jVar instanceof C1405h) {
            try {
                ((C1405h) jVar).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: e */
    private final boolean m3966e() {
        return (this.f2775c == null || ((C1399f) this.f2778f.get()) == null) ? false : true;
    }

    /* renamed from: h */
    private final void m3969h(Status status) {
        synchronized (this.f2776d) {
            this.f2777e = status;
            m3971j(status);
        }
    }

    /* renamed from: j */
    private final void m3971j(Status status) {
        synchronized (this.f2776d) {
            if (this.f2773a != null) {
                Status a = this.f2773a.mo11030a(status);
                C1609u.m4476l(a, "onFailure must not return null");
                this.f2774b.m3969h(a);
            } else if (m3966e()) {
                this.f2775c.mo11028b(status);
            }
        }
    }

    /* renamed from: a */
    public final void mo10994a(R r) {
        synchronized (this.f2776d) {
            if (!r.mo10772K().mo10776T()) {
                m3969h(r.mo10772K());
                m3965c(r);
            } else if (this.f2773a != null) {
                C1450i1.m3876a().submit(new C1473o1(this, r));
            } else if (m3966e()) {
                this.f2775c.mo11029c(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10995d() {
        this.f2775c = null;
    }
}
