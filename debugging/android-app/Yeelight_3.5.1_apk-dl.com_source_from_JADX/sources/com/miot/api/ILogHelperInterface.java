package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ILogHelperInterface extends IInterface {

    public static class Default implements ILogHelperInterface {
        public IBinder asBinder() {
            return null;
        }

        public void enableLog(boolean z) {
        }

        public void log(String str, String str2) {
        }
    }

    public static abstract class Stub extends Binder implements ILogHelperInterface {
        private static final String DESCRIPTOR = "com.miot.api.ILogHelperInterface";
        static final int TRANSACTION_enableLog = 1;
        static final int TRANSACTION_log = 2;

        private static class Proxy implements ILogHelperInterface {
            public static ILogHelperInterface sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void enableLog(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().enableLog(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void log(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().log(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ILogHelperInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ILogHelperInterface)) ? new Proxy(iBinder) : (ILogHelperInterface) queryLocalInterface;
        }

        public static ILogHelperInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ILogHelperInterface iLogHelperInterface) {
            if (Proxy.sDefaultImpl != null || iLogHelperInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = iLogHelperInterface;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                enableLog(parcel.readInt() != 0);
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                log(parcel.readString(), parcel.readString());
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

    void enableLog(boolean z);

    void log(String str, String str2);
}
