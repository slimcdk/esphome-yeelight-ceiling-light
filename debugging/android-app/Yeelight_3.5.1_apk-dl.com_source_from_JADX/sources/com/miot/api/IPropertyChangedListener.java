package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.invocation.PropertyInfo;

public interface IPropertyChangedListener extends IInterface {

    public static class Default implements IPropertyChangedListener {
        public IBinder asBinder() {
            return null;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
        }
    }

    public static abstract class Stub extends Binder implements IPropertyChangedListener {
        private static final String DESCRIPTOR = "com.miot.api.IPropertyChangedListener";
        static final int TRANSACTION_onPropertyChanged = 1;

        private static class Proxy implements IPropertyChangedListener {
            public static IPropertyChangedListener sDefaultImpl;
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

            public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (propertyInfo != null) {
                        obtain.writeInt(1);
                        propertyInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onPropertyChanged(propertyInfo, str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPropertyChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPropertyChangedListener)) ? new Proxy(iBinder) : (IPropertyChangedListener) queryLocalInterface;
        }

        public static IPropertyChangedListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPropertyChangedListener iPropertyChangedListener) {
            if (Proxy.sDefaultImpl != null || iPropertyChangedListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPropertyChangedListener;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onPropertyChanged(parcel.readInt() != 0 ? PropertyInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
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

    void onPropertyChanged(PropertyInfo propertyInfo, String str);
}
