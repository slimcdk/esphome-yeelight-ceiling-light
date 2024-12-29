package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0911g;

/* renamed from: com.google.android.gms.common.internal.a */
public class C0893a extends C0911g.C0912a {
    @KeepForSdk
    @Nullable
    /* renamed from: f */
    public static Account m1284f(@NonNull C0911g gVar) {
        Account account = null;
        if (gVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = gVar.mo12278D();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
