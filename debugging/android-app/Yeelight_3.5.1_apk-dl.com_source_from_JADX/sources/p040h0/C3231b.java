package p040h0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: h0.b */
public class C3231b extends Binder implements IInterface {
    protected C3231b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public boolean mo23788D0(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo23788D0(i, parcel, parcel2, i2);
    }
}
