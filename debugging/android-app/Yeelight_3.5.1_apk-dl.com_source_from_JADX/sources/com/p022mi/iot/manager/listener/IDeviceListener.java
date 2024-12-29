package com.p022mi.iot.manager.listener;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.instance.Device;

/* renamed from: com.mi.iot.manager.listener.IDeviceListener */
public interface IDeviceListener extends IInterface {

    /* renamed from: com.mi.iot.manager.listener.IDeviceListener$Default */
    public static class Default implements IDeviceListener {
        public IBinder asBinder() {
            return null;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed(Device device, int i, int i2) {
        }
    }

    /* renamed from: com.mi.iot.manager.listener.IDeviceListener$Stub */
    public static abstract class Stub extends Binder implements IDeviceListener {
        private static final String DESCRIPTOR = "com.mi.iot.manager.listener.IDeviceListener";
        static final int TRANSACTION_onFailed = 2;
        static final int TRANSACTION_onSucceed = 1;

        /* renamed from: com.mi.iot.manager.listener.IDeviceListener$Stub$Proxy */
        private static class Proxy implements IDeviceListener {
            public static IDeviceListener sDefaultImpl;
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

            public void onFailed(IotError iotError) {
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
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFailed(iotError);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSucceed(Device device, int i, int i2) {
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
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSucceed(device, i, i2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceListener)) ? new Proxy(iBinder) : (IDeviceListener) queryLocalInterface;
        }

        public static IDeviceListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceListener iDeviceListener) {
            if (Proxy.sDefaultImpl != null || iDeviceListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceListener;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.mi.iot.common.error.IotError} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.mi.iot.manager.listener.IDeviceListener"
                if (r5 == r1) goto L_0x0030
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r2)
                return r1
            L_0x0017:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator<com.mi.iot.common.error.IotError> r5 = com.p022mi.iot.common.error.IotError.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.mi.iot.common.error.IotError r0 = (com.p022mi.iot.common.error.IotError) r0
            L_0x0029:
                r4.onFailed(r0)
            L_0x002c:
                r7.writeNoException()
                return r1
            L_0x0030:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0042
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r5 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0042:
                int r5 = r6.readInt()
                int r6 = r6.readInt()
                r4.onSucceed(r0, r5, r6)
                goto L_0x002c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p022mi.iot.manager.listener.IDeviceListener.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onFailed(IotError iotError);

    void onSucceed(Device device, int i, int i2);
}
