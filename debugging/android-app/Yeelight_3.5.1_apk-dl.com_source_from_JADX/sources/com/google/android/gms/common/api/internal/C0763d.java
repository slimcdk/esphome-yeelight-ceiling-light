package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0724b;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.d */
public abstract class C0763d<R extends C0744h, A extends C0722a.C0724b> extends BasePendingResult<R> implements C0768e<R> {
    @KeepForSdk

    /* renamed from: r */
    private final C0722a.C0725c<A> f598r;
    @KeepForSdk
    @Nullable

    /* renamed from: s */
    private final C0722a<?> f599s;

    @KeepForSdk
    protected C0763d(@NonNull C0722a<?> aVar, @NonNull C0736d dVar) {
        super((C0736d) C0917i.m1420k(dVar, "GoogleApiClient must not be null"));
        C0917i.m1420k(aVar, "Api must not be null");
        this.f598r = aVar.mo11820b();
        this.f599s = aVar;
    }

    @KeepForSdk
    /* renamed from: v */
    private void m774v(@NonNull RemoteException remoteException) {
        mo11934w(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @KeepForSdk
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo11928a(@NonNull Object obj) {
        super.mo11885i((C0744h) obj);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: q */
    public abstract void mo11929q(@NonNull A a);

    @KeepForSdk
    @Nullable
    /* renamed from: r */
    public final C0722a<?> mo11930r() {
        return this.f599s;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: s */
    public final C0722a.C0725c<A> mo11931s() {
        return this.f598r;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: t */
    public void mo11932t(@NonNull R r) {
    }

    @KeepForSdk
    /* renamed from: u */
    public final void mo11933u(@NonNull A a) {
        try {
            mo11929q(a);
        } catch (DeadObjectException e) {
            m774v(e);
            throw e;
        } catch (RemoteException e2) {
            m774v(e2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public final void mo11934w(@NonNull Status status) {
        C0917i.m1411b(!status.mo11812g0(), "Failed result must not be success");
        C0744h e = mo11881e(status);
        mo11885i(e);
        mo11932t(e);
    }
}
