package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.util.C1660n;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
public abstract class C1461l0 {
    public C1461l0(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m3952a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C1660n.m4602b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: b */
    public abstract void mo10986b(@NonNull Status status);

    /* renamed from: c */
    public abstract void mo10987c(C1426e.C1427a<?> aVar);

    /* renamed from: d */
    public abstract void mo10988d(@NonNull C1474p pVar, boolean z);

    /* renamed from: e */
    public abstract void mo10989e(@NonNull RuntimeException runtimeException);
}
