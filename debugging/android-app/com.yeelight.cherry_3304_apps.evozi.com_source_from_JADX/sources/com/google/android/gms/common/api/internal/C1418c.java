package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1384b;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1611v;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class C1418c<R extends C1507j, A extends C1382a.C1384b> extends BasePendingResult<R> implements C1422d<R> {
    @KeepForSdk

    /* renamed from: q */
    private final C1382a.C1385c<A> f2622q;
    @KeepForSdk

    /* renamed from: r */
    private final C1382a<?> f2623r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @KeepForSdk
    protected C1418c(@NonNull C1382a<?> aVar, @NonNull C1399f fVar) {
        super(fVar);
        C1609u.m4476l(fVar, "GoogleApiClient must not be null");
        C1609u.m4476l(aVar, "Api must not be null");
        this.f2622q = aVar.mo10782a();
        this.f2623r = aVar;
    }

    @KeepForSdk
    /* renamed from: x */
    private void m3723x(@NonNull RemoteException remoteException) {
        mo10894y(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @KeepForSdk
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo10888a(Object obj) {
        super.mo10847i((C1507j) obj);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: s */
    public abstract void mo10889s(@NonNull A a);

    @KeepForSdk
    /* renamed from: t */
    public final C1382a<?> mo10890t() {
        return this.f2623r;
    }

    @KeepForSdk
    /* renamed from: u */
    public final C1382a.C1385c<A> mo10891u() {
        return this.f2622q;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: v */
    public void mo10892v(@NonNull R r) {
    }

    @KeepForSdk
    /* renamed from: w */
    public final void mo10893w(@NonNull A a) {
        if (a instanceof C1611v) {
            a = ((C1611v) a).mo11289n0();
        }
        try {
            mo10889s(a);
        } catch (DeadObjectException e) {
            m3723x(e);
            throw e;
        } catch (RemoteException e2) {
            m3723x(e2);
        }
    }

    @KeepForSdk
    /* renamed from: y */
    public final void mo10894y(@NonNull Status status) {
        C1609u.m4466b(!status.mo10776T(), "Failed result must not be success");
        C1507j e = mo10844e(status);
        mo10847i(e);
        mo10892v(e);
    }
}
