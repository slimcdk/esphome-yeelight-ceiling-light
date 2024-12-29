package p011c.p012a.p019b.p028b.p032c.p033a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.a.a */
public class C0565a implements IInterface {

    /* renamed from: a */
    private final IBinder f227a;

    /* renamed from: b */
    private final String f228b;

    protected C0565a(IBinder iBinder, String str) {
        this.f227a = iBinder;
        this.f228b = str;
    }

    public IBinder asBinder() {
        return this.f227a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo8541c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f228b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo8542e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f227a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
