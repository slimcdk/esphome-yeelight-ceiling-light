package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IAddTimerCompletionHandler extends IInterface {

    public static class Default implements IAddTimerCompletionHandler {
        public IBinder asBinder() {
            return null;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(long j) {
        }
    }

    public static abstract class Stub extends Binder implements IAddTimerCompletionHandler {
        private static final String DESCRIPTOR = "com.miot.api.IAddTimerCompletionHandler";
        static final int TRANSACTION_onFailed = 2;
        static final int TRANSACTION_onSucceed = 1;

        private static class Proxy implements IAddTimerCompletionHandler {
            public static IAddTimerCompletionHandler sDefaultImpl;
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

            public void onFailed(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFailed(i, str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onSucceed(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSucceed(j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAddTimerCompletionHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAddTimerCompletionHandler)) ? new Proxy(iBinder) : (IAddTimerCompletionHandler) queryLocalInterface;
        }

        public static IAddTimerCompletionHandler getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAddTimerCompletionHandler iAddTimerCompletionHandler) {
            if (Proxy.sDefaultImpl != null || iAddTimerCompletionHandler == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAddTimerCompletionHandler;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucceed(parcel.readLong());
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailed(parcel.readInt(), parcel.readString());
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

    void onFailed(int i, String str);

    void onSucceed(long j);
}