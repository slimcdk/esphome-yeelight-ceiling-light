package p011c.p012a.p013a.p014a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.a.a.b */
public class C0451b implements IInterface {

    /* renamed from: a */
    private final IBinder f45a;

    /* renamed from: b */
    private final String f46b;

    protected C0451b(IBinder iBinder, String str) {
        this.f45a = iBinder;
        this.f46b = str;
    }

    public IBinder asBinder() {
        return this.f45a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo8383c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Parcel mo8384e(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f45a.transact(i, parcel, parcel, 0);
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
    public final void mo8385f(int i, Parcel parcel) {
        try {
            this.f45a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
