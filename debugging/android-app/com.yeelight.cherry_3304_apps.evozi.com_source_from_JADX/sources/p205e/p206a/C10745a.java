package p205e.p206a;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.a.a */
public interface C10745a extends IInterface {

    /* renamed from: e.a.a$a */
    public static abstract class C10746a extends Binder implements C10745a {

        /* renamed from: e.a.a$a$a */
        private static class C10747a implements C10745a {

            /* renamed from: a */
            private IBinder f20621a;

            C10747a(IBinder iBinder) {
                this.f20621a = iBinder;
            }

            public IBinder asBinder() {
                return this.f20621a;
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
                    this.f20621a.transact(2, obtain, obtain2, 0);
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
                    this.f20621a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C10745a m26607a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("miui.net.IXiaomiAuthService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C10745a)) ? new C10747a(iBinder) : (C10745a) queryLocalInterface;
        }
    }

    Bundle getMiCloudAccessToken(Account account, Bundle bundle);

    void invalidateAccessToken(Account account, Bundle bundle);
}
