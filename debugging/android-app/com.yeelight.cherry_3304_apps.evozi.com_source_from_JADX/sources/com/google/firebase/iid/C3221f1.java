package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import androidx.annotation.NonNull;

/* renamed from: com.google.firebase.iid.f1 */
public final class C3221f1 implements C3224g1 {

    /* renamed from: a */
    private final IBinder f6240a;

    C3221f1(@NonNull IBinder iBinder) {
        this.f6240a = iBinder;
    }

    /* renamed from: F0 */
    public final void mo17830F0(@NonNull Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f6240a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @NonNull
    public final IBinder asBinder() {
        return this.f6240a;
    }
}
