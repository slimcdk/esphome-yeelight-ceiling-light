package p023d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.b */
public class C3121b implements IInterface {

    /* renamed from: a */
    private final IBinder f4999a;

    /* renamed from: b */
    private final String f5000b;

    protected C3121b(IBinder iBinder, String str) {
        this.f4999a = iBinder;
        this.f5000b = str;
    }

    public IBinder asBinder() {
        return this.f4999a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo23589c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5000b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo23590e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4999a.transact(i, parcel, parcel, 0);
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
    public final void mo23591f(int i, Parcel parcel) {
        try {
            this.f4999a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
