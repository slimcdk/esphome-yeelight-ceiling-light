package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.n2 */
abstract class C0818n2 extends C0832q1 {

    /* renamed from: b */
    protected final C1872a f712b;

    public C0818n2(int i, C1872a aVar) {
        super(i);
        this.f712b = aVar;
    }

    /* renamed from: a */
    public final void mo12035a(@NonNull Status status) {
        this.f712b.mo14739d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo12036b(@NonNull Exception exc) {
        this.f712b.mo14739d(exc);
    }

    /* renamed from: c */
    public final void mo12037c(C0785h1 h1Var) {
        try {
            mo12038h(h1Var);
        } catch (DeadObjectException e) {
            mo12035a(C0854v2.m1136e(e));
            throw e;
        } catch (RemoteException e2) {
            mo12035a(C0854v2.m1136e(e2));
        } catch (RuntimeException e3) {
            this.f712b.mo14739d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo12038h(C0785h1 h1Var);
}
