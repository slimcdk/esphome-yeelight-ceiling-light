package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.C0996i;

/* renamed from: com.google.android.gms.common.internal.g */
public interface C0911g extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.g$a */
    public static abstract class C0912a extends C0996i implements C0911g {
        @NonNull
        /* renamed from: e */
        public static C0911g m1394e(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C0911g ? (C0911g) queryLocalInterface : new C0918i0(iBinder);
        }
    }

    @NonNull
    /* renamed from: D */
    Account mo12278D();
}
