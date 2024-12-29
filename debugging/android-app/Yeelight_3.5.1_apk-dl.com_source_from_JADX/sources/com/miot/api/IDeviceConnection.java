package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.Device;
import com.miot.common.people.People;

public interface IDeviceConnection extends IInterface {

    public static class Default implements IDeviceConnection {
        public IBinder asBinder() {
            return null;
        }

        public void connectToCloud(People people, Device device, IConfigHandler iConfigHandler) {
        }

        public void enableHttpLog() {
        }

        public void getQrCode(String str, String str2, String str3, People people, ICommonHandler iCommonHandler) {
        }

        public void setHttpUserAgent(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceConnection {
        private static final String DESCRIPTOR = "com.miot.api.IDeviceConnection";
        static final int TRANSACTION_connectToCloud = 1;
        static final int TRANSACTION_enableHttpLog = 3;
        static final int TRANSACTION_getQrCode = 4;
        static final int TRANSACTION_setHttpUserAgent = 2;

        private static class Proxy implements IDeviceConnection {
            public static IDeviceConnection sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void connectToCloud(People people, Device device, IConfigHandler iConfigHandler) {
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
                    obtain.writeStrongBinder(iConfigHandler != null ? iConfigHandler.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().connectToCloud(people, device, iConfigHandler);
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
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().enableHttpLog();
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
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getQrCode(str, str2, str3, people, iCommonHandler);
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
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setHttpUserAgent(str);
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

        public static IDeviceConnection getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceConnection iDeviceConnection) {
            if (Proxy.sDefaultImpl != null || iDeviceConnection == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceConnection;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.miot.common.device.Device} */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.miot.common.people.People] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
            /*
                r8 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.miot.api.IDeviceConnection"
                if (r9 == r1) goto L_0x005e
                r3 = 2
                if (r9 == r3) goto L_0x0053
                r3 = 3
                if (r9 == r3) goto L_0x004c
                r3 = 4
                if (r9 == r3) goto L_0x001d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r9 == r0) goto L_0x0019
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            L_0x0019:
                r11.writeString(r2)
                return r1
            L_0x001d:
                r10.enforceInterface(r2)
                java.lang.String r3 = r10.readString()
                java.lang.String r4 = r10.readString()
                java.lang.String r5 = r10.readString()
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x003b
                android.os.Parcelable$Creator<com.miot.common.people.People> r9 = com.miot.common.people.People.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                r0 = r9
                com.miot.common.people.People r0 = (com.miot.common.people.People) r0
            L_0x003b:
                r6 = r0
                android.os.IBinder r9 = r10.readStrongBinder()
                com.miot.api.ICommonHandler r7 = com.miot.api.ICommonHandler.Stub.asInterface(r9)
                r2 = r8
                r2.getQrCode(r3, r4, r5, r6, r7)
            L_0x0048:
                r11.writeNoException()
                return r1
            L_0x004c:
                r10.enforceInterface(r2)
                r8.enableHttpLog()
                goto L_0x0048
            L_0x0053:
                r10.enforceInterface(r2)
                java.lang.String r9 = r10.readString()
                r8.setHttpUserAgent(r9)
                goto L_0x0048
            L_0x005e:
                r10.enforceInterface(r2)
                int r9 = r10.readInt()
                if (r9 == 0) goto L_0x0070
                android.os.Parcelable$Creator<com.miot.common.people.People> r9 = com.miot.common.people.People.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r10)
                com.miot.common.people.People r9 = (com.miot.common.people.People) r9
                goto L_0x0071
            L_0x0070:
                r9 = r0
            L_0x0071:
                int r12 = r10.readInt()
                if (r12 == 0) goto L_0x0080
                android.os.Parcelable$Creator<com.miot.common.device.Device> r12 = com.miot.common.device.Device.CREATOR
                java.lang.Object r12 = r12.createFromParcel(r10)
                r0 = r12
                com.miot.common.device.Device r0 = (com.miot.common.device.Device) r0
            L_0x0080:
                android.os.IBinder r10 = r10.readStrongBinder()
                com.miot.api.IConfigHandler r10 = com.miot.api.IConfigHandler.Stub.asInterface(r10)
                r8.connectToCloud(r9, r0, r10)
                goto L_0x0048
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.api.IDeviceConnection.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void connectToCloud(People people, Device device, IConfigHandler iConfigHandler);

    void enableHttpLog();

    void getQrCode(String str, String str2, String str3, People people, ICommonHandler iCommonHandler);

    void setHttpUserAgent(String str);
}
