package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0911g;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.l1 */
final class C0807l1 implements C0897c.C0900c, C0786h2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0722a.C0730f f694a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0752b f695b;
    @Nullable

    /* renamed from: c */
    private C0911g f696c = null;
    @Nullable

    /* renamed from: d */
    private Set f697d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f698e = false;

    /* renamed from: f */
    final /* synthetic */ C0778g f699f;

    public C0807l1(C0778g gVar, C0722a.C0730f fVar, C0752b bVar) {
        this.f699f = gVar;
        this.f694a = fVar;
        this.f695b = bVar;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m942h() {
        C0911g gVar;
        if (this.f698e && (gVar = this.f696c) != null) {
            this.f694a.mo11831c(gVar, this.f697d);
        }
    }

    /* renamed from: a */
    public final void mo11950a(@NonNull ConnectionResult connectionResult) {
        this.f699f.f632p.post(new C0802k1(this, connectionResult));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo11996b(ConnectionResult connectionResult) {
        C0785h1 h1Var = (C0785h1) this.f699f.f628l.get(this.f695b);
        if (h1Var != null) {
            h1Var.mo11982I(connectionResult);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo11997c(@Nullable C0911g gVar, @Nullable Set set) {
        if (gVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo11996b(new ConnectionResult(4));
            return;
        }
        this.f696c = gVar;
        this.f697d = set;
        m942h();
    }
}
