package p130b5;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b5.a */
public interface C3999a extends IInterface {

    /* renamed from: b5.a$a */
    public static abstract class C4000a extends Binder implements C3999a {

        /* renamed from: b5.a$a$a */
        private static class C4001a implements C3999a {

            /* renamed from: a */
            private IBinder f6756a;

            C4001a(IBinder iBinder) {
                this.f6756a = iBinder;
            }

            public IBinder asBinder() {
                return this.f6756a;
            }

            public Bundle getMiCloudAccessToken(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miui.net.IXiaomiAuthService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6756a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void invalidateAccessToken(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("miui.net.IXiaomiAuthService");
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6756a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: c */
        public static C3999a m11615c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("miui.net.IXiaomiAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3999a)) ? new C4001a(iBinder) : (C3999a) queryLocalInterface;
        }
    }

    Bundle getMiCloudAccessToken(Account account, Bundle bundle);

    void invalidateAccessToken(Account account, Bundle bundle);
}
