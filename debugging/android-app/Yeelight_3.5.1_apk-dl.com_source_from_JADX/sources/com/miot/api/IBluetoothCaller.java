package com.miot.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.api.IResponse;

public interface IBluetoothCaller extends IInterface {

    public static class Default implements IBluetoothCaller {
        public IBinder asBinder() {
            return null;
        }

        public void callBluetoothApi(int i, Bundle bundle, IResponse iResponse) {
        }
    }

    public static abstract class Stub extends Binder implements IBluetoothCaller {
        private static final String DESCRIPTOR = "com.miot.api.IBluetoothCaller";
        static final int TRANSACTION_callBluetoothApi = 1;

        private static class Proxy implements IBluetoothCaller {
            public static IBluetoothCaller sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void callBluetoothApi(int i, Bundle bundle, IResponse iResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iResponse != null ? iResponse.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle.readFromParcel(obtain2);
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().callBluetoothApi(i, bundle, iResponse);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBluetoothCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBluetoothCaller)) ? new Proxy(iBinder) : (IBluetoothCaller) queryLocalInterface;
        }

        public static IBluetoothCaller getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBluetoothCaller iBluetoothCaller) {
            if (Proxy.sDefaultImpl != null || iBluetoothCaller == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBluetoothCaller;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                callBluetoothApi(readInt, bundle, IResponse.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void callBluetoothApi(int i, Bundle bundle, IResponse iResponse);
}