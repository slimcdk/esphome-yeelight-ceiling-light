package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.common.a */
public class C0988a implements IInterface {

    /* renamed from: a */
    private final IBinder f1213a;

    /* renamed from: b */
    private final String f1214b;

    protected C0988a(IBinder iBinder, String str) {
        this.f1213a = iBinder;
        this.f1214b = str;
    }

    public final IBinder asBinder() {
        return this.f1213a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo12458c(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f1213a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo12459e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1214b);
        return obtain;
    }
}
