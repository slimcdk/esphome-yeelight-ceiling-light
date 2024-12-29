package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.voice.VoiceResult;

public interface IVoiceInvokeHandler extends IInterface {

    public static class Default implements IVoiceInvokeHandler {
        public IBinder asBinder() {
            return null;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(VoiceResult voiceResult) {
        }
    }

    public static abstract class Stub extends Binder implements IVoiceInvokeHandler {
        private static final String DESCRIPTOR = "com.miot.api.IVoiceInvokeHandler";
        static final int TRANSACTION_onFailed = 2;
        static final int TRANSACTION_onSucceed = 1;

        private static class Proxy implements IVoiceInvokeHandler {
            public static IVoiceInvokeHandler sDefaultImpl;
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

            public void onSucceed(VoiceResult voiceResult) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (voiceResult != null) {
                        obtain.writeInt(1);
                        voiceResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSucceed(voiceResult);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IVoiceInvokeHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IVoiceInvokeHandler)) ? new Proxy(iBinder) : (IVoiceInvokeHandler) queryLocalInterface;
        }

        public static IVoiceInvokeHandler getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IVoiceInvokeHandler iVoiceInvokeHandler) {
            if (Proxy.sDefaultImpl != null || iVoiceInvokeHandler == null) {
                return false;
            }
            Proxy.sDefaultImpl = iVoiceInvokeHandler;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucceed(parcel.readInt() != 0 ? VoiceResult.CREATOR.createFromParcel(parcel) : null);
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

    void onSucceed(VoiceResult voiceResult);
}
