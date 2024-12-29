package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IBleChannelReader extends IInterface {

    public static class Default implements IBleChannelReader {
        public IBinder asBinder() {
            return null;
        }

        public void onRead(String str, byte[] bArr, int i) {
        }
    }

    public static abstract class Stub extends Binder implements IBleChannelReader {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader";
        static final int TRANSACTION_onRead = 1;

        private static class Proxy implements IBleChannelReader {
            public static IBleChannelReader sDefaultImpl;
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

            public void onRead(String str, byte[] bArr, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onRead(str, bArr, i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBleChannelReader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBleChannelReader)) ? new Proxy(iBinder) : (IBleChannelReader) queryLocalInterface;
        }

        public static IBleChannelReader getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBleChannelReader iBleChannelReader) {
            if (Proxy.sDefaultImpl != null || iBleChannelReader == null) {
                return false;
            }
            Proxy.sDefaultImpl = iBleChannelReader;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onRead(parcel.readString(), parcel.createByteArray(), parcel.readInt());
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

    void onRead(String str, byte[] bArr, int i);
}
