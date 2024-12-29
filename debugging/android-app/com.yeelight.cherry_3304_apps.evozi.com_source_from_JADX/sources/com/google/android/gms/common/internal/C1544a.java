package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1584m;

/* renamed from: com.google.android.gms.common.internal.a */
public class C1544a extends C1584m.C1585a {
    @KeepForSdk
    /* renamed from: e */
    public static Account m4197e(C1584m mVar) {
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mVar.mo11261j();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
