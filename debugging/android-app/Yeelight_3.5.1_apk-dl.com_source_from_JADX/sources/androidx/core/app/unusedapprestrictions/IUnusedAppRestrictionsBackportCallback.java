package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
        private static final String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
        static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;

        private static class Proxy implements IUnusedAppRestrictionsBackportCallback {
            public static IUnusedAppRestrictionsBackportCallback sDefaultImpl;
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

            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i = 0;
                    obtain.writeInt(z ? 1 : 0);
                    if (z2) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onIsPermissionRevocationEnabledForAppResult(z, z2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new Proxy(iBinder) : (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
        }

        public static IUnusedAppRestrictionsBackportCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iUnusedAppRestrictionsBackportCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iUnusedAppRestrictionsBackportCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onIsPermissionRevocationEnabledForAppResult(z2, z);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2);
}
