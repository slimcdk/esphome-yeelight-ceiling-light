package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import androidx.annotation.Nullable;
import p109w.C3831c;
import p109w.C3833d;

/* renamed from: com.google.android.gms.common.internal.s */
final class C0928s implements C3833d {

    /* renamed from: a */
    private final IBinder f1060a;

    C0928s(IBinder iBinder) {
        this.f1060a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f1060a;
    }

    /* renamed from: h0 */
    public final void mo12304h0(C3831c cVar, @Nullable GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C0906d0.m1370a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1060a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
