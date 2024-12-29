package com.google.android.gms.internal.wearable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.wearable.a */
public class C1414a implements IInterface {

    /* renamed from: a */
    private final IBinder f1754a;

    /* renamed from: b */
    private final String f1755b;

    protected C1414a(IBinder iBinder, String str) {
        this.f1754a = iBinder;
        this.f1755b = str;
    }

    public final IBinder asBinder() {
        return this.f1754a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo13577c(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1754a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo13578e() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1755b);
        return obtain;
    }
}
