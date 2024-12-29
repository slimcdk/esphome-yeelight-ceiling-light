package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
public class C1214n0 implements IInterface {

    /* renamed from: a */
    private final IBinder f1433a;

    /* renamed from: b */
    private final String f1434b;

    protected C1214n0(IBinder iBinder, String str) {
        this.f1433a = iBinder;
        this.f1434b = str;
    }

    public final IBinder asBinder() {
        return this.f1433a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo13002c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1434b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo13003e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f1433a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo13004f(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1433a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
