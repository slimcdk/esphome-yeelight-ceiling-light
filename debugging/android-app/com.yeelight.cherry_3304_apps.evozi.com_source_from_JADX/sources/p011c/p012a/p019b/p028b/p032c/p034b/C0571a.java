package p011c.p012a.p019b.p028b.p032c.p034b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.b.a */
public class C0571a implements IInterface {

    /* renamed from: a */
    private final IBinder f229a;

    /* renamed from: b */
    private final String f230b;

    protected C0571a(IBinder iBinder, String str) {
        this.f229a = iBinder;
        this.f230b = str;
    }

    public IBinder asBinder() {
        return this.f229a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo8546c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f230b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo8547e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f229a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
