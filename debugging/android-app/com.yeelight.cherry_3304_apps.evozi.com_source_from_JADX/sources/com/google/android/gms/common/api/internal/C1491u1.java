package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1393b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1426e;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.common.api.internal.u1 */
abstract class C1491u1<T> extends C1443h1 {

    /* renamed from: a */
    protected final C0620i<T> f2820a;

    public C1491u1(int i, C0620i<T> iVar) {
        super(i);
        this.f2820a = iVar;
    }

    /* renamed from: b */
    public void mo10986b(@NonNull Status status) {
        this.f2820a.mo8669d(new C1393b(status));
    }

    /* renamed from: c */
    public final void mo10987c(C1426e.C1427a<?> aVar) {
        try {
            mo11018i(aVar);
        } catch (DeadObjectException e) {
            mo10986b(C1461l0.m3952a(e));
            throw e;
        } catch (RemoteException e2) {
            mo10986b(C1461l0.m3952a(e2));
        } catch (RuntimeException e3) {
            mo10989e(e3);
        }
    }

    /* renamed from: e */
    public void mo10989e(@NonNull RuntimeException runtimeException) {
        this.f2820a.mo8669d(runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo11018i(C1426e.C1427a<?> aVar);
}
