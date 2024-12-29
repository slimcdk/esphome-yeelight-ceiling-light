package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.v2 */
public abstract class C0854v2 {

    /* renamed from: a */
    public final int f834a;

    public C0854v2(int i) {
        this.f834a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m1136e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo12035a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo12036b(@NonNull Exception exc);

    /* renamed from: c */
    public abstract void mo12037c(C0785h1 h1Var);

    /* renamed from: d */
    public abstract void mo12071d(@NonNull C0859x xVar, boolean z);
}
