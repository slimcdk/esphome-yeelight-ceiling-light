package p011c.p012a.p013a.p014a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.a.a.a */
public class C0450a extends Binder implements IInterface {
    protected C0450a(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8379a(int i, Parcel parcel) {
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
        return mo8379a(i, parcel);
    }
}
