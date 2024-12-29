package com.p146mi.iot.manager.handler;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.instance.Property;
import java.util.List;

/* renamed from: com.mi.iot.manager.handler.IControlHandler */
public interface IControlHandler extends IInterface {

    /* renamed from: com.mi.iot.manager.handler.IControlHandler$Stub */
    public static abstract class Stub extends Binder implements IControlHandler {
        private static final String DESCRIPTOR = "com.mi.iot.manager.handler.IControlHandler";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResult = 1;

        /* renamed from: com.mi.iot.manager.handler.IControlHandler$Stub$Proxy */
        private static class Proxy implements IControlHandler {
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

            public void onError(IotError iotError) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iotError != null) {
                        obtain.writeInt(1);
                        iotError.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResult(List<Property> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

        public static IControlHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IControlHandler)) ? new Proxy(iBinder) : (IControlHandler) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onResult(parcel.createTypedArrayList(Property.CREATOR));
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt() != 0 ? IotError.CREATOR.createFromParcel(parcel) : null);
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

    void onError(IotError iotError);

    void onResult(List<Property> list);
}
