package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.base.a */
public class C1690a implements IInterface {

    /* renamed from: a */
    private final IBinder f3219a;

    /* renamed from: b */
    private final String f3220b;

    protected C1690a(IBinder iBinder, String str) {
        this.f3219a = iBinder;
        this.f3220b = str;
    }

    public IBinder asBinder() {
        return this.f3219a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo11401c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3220b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo11402e(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3219a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
