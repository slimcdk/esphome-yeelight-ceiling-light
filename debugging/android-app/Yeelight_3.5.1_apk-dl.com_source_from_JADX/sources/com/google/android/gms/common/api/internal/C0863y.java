package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.common.api.internal.y */
public final class C0863y extends C0762c3 {

    /* renamed from: f */
    private final ArraySet f850f = new ArraySet();

    /* renamed from: g */
    private final C0778g f851g;

    @VisibleForTesting
    C0863y(C0788i iVar, C0778g gVar, C0721a aVar) {
        super(iVar, aVar);
        this.f851g = gVar;
        this.f572a.mo11998b("ConnectionlessLifecycleHelper", this);
    }

    @MainThread
    /* renamed from: u */
    public static void m1170u(Activity activity, C0778g gVar, C0752b bVar) {
        C0788i c = LifecycleCallback.m727c(activity);
        C0863y yVar = (C0863y) c.mo11999h("ConnectionlessLifecycleHelper", C0863y.class);
        if (yVar == null) {
            yVar = new C0863y(c, gVar, C0721a.m617p());
        }
        C0917i.m1420k(bVar, "ApiKey cannot be null");
        yVar.f850f.add(bVar);
        gVar.mo11961c(yVar);
    }

    /* renamed from: v */
    private final void m1171v() {
        if (!this.f850f.isEmpty()) {
            this.f851g.mo11961c(this);
        }
    }

    /* renamed from: h */
    public final void mo11896h() {
        super.mo11896h();
        m1171v();
    }

    /* renamed from: j */
    public final void mo11898j() {
        super.mo11898j();
        m1171v();
    }

    /* renamed from: k */
    public final void mo11899k() {
        super.mo11899k();
        this.f851g.mo11962d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11924m(ConnectionResult connectionResult, int i) {
        this.f851g.mo11958I(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11925n() {
        this.f851g.mo11959a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ArraySet mo12096t() {
        return this.f850f;
    }
}
