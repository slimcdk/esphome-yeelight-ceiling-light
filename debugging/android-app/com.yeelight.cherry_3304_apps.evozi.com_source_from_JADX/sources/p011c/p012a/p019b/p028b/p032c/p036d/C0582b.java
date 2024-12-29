package p011c.p012a.p019b.p028b.p032c.p036d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.d.b */
public class C0582b extends Binder implements IInterface {
    protected C0582b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8558a(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo8558a(i, parcel, parcel2, i2);
    }
}
