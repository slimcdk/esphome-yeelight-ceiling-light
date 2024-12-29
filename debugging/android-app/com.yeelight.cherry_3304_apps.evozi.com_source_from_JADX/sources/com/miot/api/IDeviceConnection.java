package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.Device;
import com.miot.common.people.People;

public interface IDeviceConnection extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceConnection {
        private static final String DESCRIPTOR = "com.miot.api.IDeviceConnection";
        static final int TRANSACTION_connectToCloud = 1;
        static final int TRANSACTION_enableHttpLog = 3;
        static final int TRANSACTION_getQrCode = 4;
        static final int TRANSACTION_setHttpUserAgent = 2;

        private static class Proxy implements IDeviceConnection {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void connectToCloud(People people, Device device, ICompletionHandler iCompletionHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (people != null) {
                        obtain.writeInt(1);
                        people.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void enableHttpLog() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void getQrCode(String str, String str2, String str3, People people, ICommonHandler iCommonHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (people != null) {
                        obtain.writeInt(1);
                        people.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setHttpUserAgent(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

        public static IDeviceConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceConnection)) ? new Proxy(iBinder) : (IDeviceConnection) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.miot.common.device.Device} */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.miot.common.people.People] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
            /*
                r9 = this;
                r0 = 0
                java.lang.String r1 = "com.miot.api.IDeviceConnection"
                r2 = 1
                if (r10 == r2) goto L_0x005e
                r3 = 2
                if (r10 == r3) goto L_0x0053
                r3 = 3
                if (r10 == r3) goto L_0x004c
                r3 = 4
                if (r10 == r3) goto L_0x001d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r10 == r0) goto L_0x0019
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            L_0x0019:
                r12.writeString(r1)
                return r2
            L_0x001d:
                r11.enforceInterface(r1)
                java.lang.String r4 = r11.readString()
                java.lang.String r5 = r11.readString()
                java.lang.String r6 = r11.readString()
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x003b
                android.os.Parcelable$Creator<com.miot.common.people.People> r10 = com.miot.common.people.People.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r0 = r10
                com.miot.common.people.People r0 = (com.miot.common.people.People) r0
            L_0x003b:
                r7 = r0
                android.os.IBinder r10 = r11.readStrongBinder()
                com.miot.api.ICommonHandler r8 = com.miot.api.ICommonHandler.Stub.asInterface(r10)
                r3 = r9
                r3.getQrCode(r4, r5, r6, r7, r8)
            L_0x0048:
                r12.writeNoException()
                return r2
            L_0x004c:
                r11.enforceInterface(r1)
                r9.enableHttpLog()
                goto L_0x0048
            L_0x0053:
                r11.enforceInterface(r1)
                java.lang.String r10 = r11.readString()
                r9.setHttpUserAgent(r10)
                goto L_0x0048
            L_0x005e:
                r11.enforceInterface(r1)
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x0070
                android.os.Parcelable$Creator<com.miot.common.people.People> r10 = com.miot.common.people.People.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                com.miot.common.people.People r10 = (com.miot.common.people.People) r10
                goto L_0x0071
            L_0x0070:
                r10 = r0
            L_0x0071:
                int r13 = r11.readInt()
                if (r13 == 0) goto L_0x0080
                android.os.Parcelable$Creator<com.miot.common.device.Device> r13 = com.miot.common.device.Device.CREATOR
                java.lang.Object r13 = r13.createFromParcel(r11)
                r0 = r13
                com.miot.common.device.Device r0 = (com.miot.common.device.Device) r0
            L_0x0080:
                android.os.IBinder r11 = r11.readStrongBinder()
                com.miot.api.ICompletionHandler r11 = com.miot.api.ICompletionHandler.Stub.asInterface(r11)
                r9.connectToCloud(r10, r0, r11)
                goto L_0x0048
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.api.IDeviceConnection.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void connectToCloud(People people, Device device, ICompletionHandler iCompletionHandler);

    void enableHttpLog();

    void getQrCode(String str, String str2, String str3, People people, ICommonHandler iCommonHandler);

    void setHttpUserAgent(String str);
}
