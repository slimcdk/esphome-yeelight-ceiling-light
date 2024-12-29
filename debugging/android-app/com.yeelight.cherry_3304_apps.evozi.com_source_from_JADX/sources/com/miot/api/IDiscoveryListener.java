package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.Device;

public interface IDiscoveryListener extends IInterface {

    public static abstract class Stub extends Binder implements IDiscoveryListener {
        private static final String DESCRIPTOR = "com.miot.api.IDiscoveryListener";
        static final int TRANSACTION_onDeviceFound = 1;
        static final int TRANSACTION_onDeviceLost = 2;
        static final int TRANSACTION_onDeviceUpdate = 3;

        private static class Proxy implements IDiscoveryListener {
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

            public void onDeviceFound(Device device, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDeviceLost(Device device, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDeviceUpdate(Device device, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDiscoveryListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDiscoveryListener)) ? new Proxy(iBinder) : (IDiscoveryListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Device device = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    device = Device.CREATOR.createFromParcel(parcel);
                }
                onDeviceFound(device, parcel.readInt(), parcel.readInt());
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    device = Device.CREATOR.createFromParcel(parcel);
                }
                onDeviceLost(device, parcel.readInt(), parcel.readInt());
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    device = Device.CREATOR.createFromParcel(parcel);
                }
                onDeviceUpdate(device, parcel.readInt(), parcel.readInt());
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onDeviceFound(Device device, int i, int i2);

    void onDeviceLost(Device device, int i, int i2);

    void onDeviceUpdate(Device device, int i, int i2);
}
