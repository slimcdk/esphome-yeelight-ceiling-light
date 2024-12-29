package com.p022mi.iot.manager.listener;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p022mi.iot.common.instance.Property;
import java.util.List;

/* renamed from: com.mi.iot.manager.listener.IPropertiesChangedListener */
public interface IPropertiesChangedListener extends IInterface {

    /* renamed from: com.mi.iot.manager.listener.IPropertiesChangedListener$Default */
    public static class Default implements IPropertiesChangedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onChanged(List<Property> list) {
        }
    }

    /* renamed from: com.mi.iot.manager.listener.IPropertiesChangedListener$Stub */
    public static abstract class Stub extends Binder implements IPropertiesChangedListener {
        private static final String DESCRIPTOR = "com.mi.iot.manager.listener.IPropertiesChangedListener";
        static final int TRANSACTION_onChanged = 1;

        /* renamed from: com.mi.iot.manager.listener.IPropertiesChangedListener$Stub$Proxy */
        private static class Proxy implements IPropertiesChangedListener {
            public static IPropertiesChangedListener sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onChanged(List<Property> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onChanged(list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPropertiesChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPropertiesChangedListener)) ? new Proxy(iBinder) : (IPropertiesChangedListener) queryLocalInterface;
        }

        public static IPropertiesChangedListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPropertiesChangedListener iPropertiesChangedListener) {
            if (Proxy.sDefaultImpl != null || iPropertiesChangedListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPropertiesChangedListener;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onChanged(parcel.createTypedArrayList(Property.CREATOR));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onChanged(List<Property> list);
}
