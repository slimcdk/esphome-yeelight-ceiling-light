package p036g0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g0.a */
public class C3207a implements IInterface {

    /* renamed from: a */
    private final IBinder f5177a;

    /* renamed from: b */
    private final String f5178b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C3207a(IBinder iBinder, String str) {
        this.f5177a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f5177a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo23772c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5178b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo23773e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f5177a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
