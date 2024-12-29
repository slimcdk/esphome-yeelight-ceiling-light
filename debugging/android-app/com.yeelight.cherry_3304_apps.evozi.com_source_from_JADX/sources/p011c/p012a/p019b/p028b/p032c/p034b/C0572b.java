package p011c.p012a.p019b.p028b.p032c.p034b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.b.b */
public class C0572b extends Binder implements IInterface {
    protected C0572b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8548a(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
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
        return mo8548a(i, parcel, parcel2, i2);
    }
}
