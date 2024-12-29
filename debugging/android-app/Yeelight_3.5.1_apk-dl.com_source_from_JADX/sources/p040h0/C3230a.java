package p040h0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h0.a */
public class C3230a implements IInterface {

    /* renamed from: a */
    private final IBinder f5213a;

    /* renamed from: b */
    private final String f5214b;

    protected C3230a(IBinder iBinder, String str) {
        this.f5213a = iBinder;
        this.f5214b = str;
    }

    public final IBinder asBinder() {
        return this.f5213a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo23785c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5214b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo23786e(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5213a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo23787f(int i, Parcel parcel) {
        try {
            this.f5213a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
