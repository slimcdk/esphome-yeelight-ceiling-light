package com.xiaomi.smarthome.core.server.bluetooth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.inuker.bluetooth.library.IResponse;

public interface IBleChannelWriter extends IInterface {

    public static abstract class Stub extends Binder implements IBleChannelWriter {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter";
        static final int TRANSACTION_write = 1;

        private static class Proxy implements IBleChannelWriter {
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

            public void write(byte[] bArr, int i, IResponse iResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        obtain.writeInt(-1);
                    } else {
                        obtain.writeInt(bArr.length);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iResponse != null ? iResponse.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.readByteArray(bArr);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBleChannelWriter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBleChannelWriter)) ? new Proxy(iBinder) : (IBleChannelWriter) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int readInt = parcel.readInt();
                byte[] bArr = readInt < 0 ? null : new byte[readInt];
                write(bArr, parcel.readInt(), IResponse.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeByteArray(bArr);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void write(byte[] bArr, int i, IResponse iResponse);
}
