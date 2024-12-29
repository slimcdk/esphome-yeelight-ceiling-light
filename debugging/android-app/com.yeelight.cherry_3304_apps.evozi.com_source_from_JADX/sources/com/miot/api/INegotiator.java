package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.config.AppConfiguration;
import com.miot.common.model.DeviceModel;
import java.util.List;

public interface INegotiator extends IInterface {

    public static abstract class Stub extends Binder implements INegotiator {
        private static final String DESCRIPTOR = "com.miot.api.INegotiator";
        static final int TRANSACTION_addDeviceModels = 4;
        static final int TRANSACTION_addSpecModels = 5;
        static final int TRANSACTION_addSpecUrn = 6;
        static final int TRANSACTION_getServiceSupportedVersions = 1;
        static final int TRANSACTION_setAppConfig = 3;
        static final int TRANSACTION_setClientVersion = 2;
        static final int TRANSACTION_setMiPushAlias = 7;
        static final int TRANSACTION_subscribeTopic = 9;
        static final int TRANSACTION_unsetMiPushAlias = 8;
        static final int TRANSACTION_unsubscribeTopic = 10;

        private static class Proxy implements INegotiator {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void addDeviceModels(List<DeviceModel> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void addSpecModels(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void addSpecUrn(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public List<String> getServiceSupportedVersions() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setAppConfig(AppConfiguration appConfiguration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (appConfiguration != null) {
                        obtain.writeInt(1);
                        appConfiguration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean setClientVersion(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setMiPushAlias(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean subscribeTopic(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unsetMiPushAlias(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean unsubscribeTopic(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INegotiator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INegotiator)) ? new Proxy(iBinder) : (INegotiator) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<String> serviceSupportedVersions = getServiceSupportedVersions();
                        parcel2.writeNoException();
                        parcel2.writeStringList(serviceSupportedVersions);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean clientVersion = setClientVersion(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(clientVersion ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        setAppConfig(parcel.readInt() != 0 ? AppConfiguration.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        addDeviceModels(parcel.createTypedArrayList(DeviceModel.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        addSpecModels(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        addSpecUrn(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        setMiPushAlias(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        unsetMiPushAlias(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean subscribeTopic = subscribeTopic(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(subscribeTopic ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean unsubscribeTopic = unsubscribeTopic(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(unsubscribeTopic ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void addDeviceModels(List<DeviceModel> list);

    void addSpecModels(List<String> list);

    void addSpecUrn(String str, String str2);

    List<String> getServiceSupportedVersions();

    void setAppConfig(AppConfiguration appConfiguration);

    boolean setClientVersion(String str);

    void setMiPushAlias(String str, String str2);

    boolean subscribeTopic(String str, String str2);

    void unsetMiPushAlias(String str, String str2);

    boolean unsubscribeTopic(String str, String str2);
}
