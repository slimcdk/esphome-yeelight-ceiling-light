package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.a */
public class C1698a implements IInterface {

    /* renamed from: a */
    private final IBinder f3222a;

    /* renamed from: b */
    private final String f3223b;

    protected C1698a(IBinder iBinder, String str) {
        this.f3222a = iBinder;
        this.f3223b = str;
    }

    public IBinder asBinder() {
        return this.f3222a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo11409c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3223b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo11410e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3222a.transact(i, parcel, parcel, 0);
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
    public final void mo11411f(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3222a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
