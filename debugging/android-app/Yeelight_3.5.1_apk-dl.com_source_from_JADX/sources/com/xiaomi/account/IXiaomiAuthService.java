package com.xiaomi.account;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IXiaomiAuthService extends IInterface {

    public static abstract class Stub extends Binder implements IXiaomiAuthService {
        private static final String DESCRIPTOR = "com.xiaomi.account.IXiaomiAuthService";
        static final int TRANSACTION_getAccessTokenInResponse = 6;
        static final int TRANSACTION_getMiCloudAccessToken = 2;
        static final int TRANSACTION_getMiCloudUserInfo = 1;
        static final int TRANSACTION_getSnsAccessToken = 3;
        static final int TRANSACTION_getVersionNum = 7;
        static final int TRANSACTION_invalidateAccessToken = 4;
        static final int TRANSACTION_isSupport = 8;
        static final int TRANSACTION_supportResponseWay = 5;

        private static class Proxy implements IXiaomiAuthService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void getAccessTokenInResponse(IXiaomiAuthResponse iXiaomiAuthResponse, Bundle bundle, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iXiaomiAuthResponse != null ? iXiaomiAuthResponse.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Bundle getMiCloudAccessToken(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getMiCloudUserInfo(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getSnsAccessToken(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getVersionNum() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void invalidateAccessToken(Account account, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
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
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isSupport(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(8, obtain, obtain2, 0);
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

            public boolean supportResponseWay() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
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

        public static IXiaomiAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IXiaomiAuthService)) ? new Proxy(iBinder) : (IXiaomiAuthService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "com.xiaomi.account.IXiaomiAuthService"
                r2 = 1
                if (r5 == r0) goto L_0x0134
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00fe;
                    case 2: goto L_0x00c8;
                    case 3: goto L_0x0092;
                    case 4: goto L_0x0069;
                    case 5: goto L_0x005b;
                    case 6: goto L_0x0032;
                    case 7: goto L_0x0024;
                    case 8: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                boolean r5 = r4.isSupport(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0024:
                r6.enforceInterface(r1)
                int r5 = r4.getVersionNum()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0032:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.xiaomi.account.IXiaomiAuthResponse r5 = com.xiaomi.account.IXiaomiAuthResponse.Stub.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x004c
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                r3 = r8
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x004c:
                int r8 = r6.readInt()
                int r6 = r6.readInt()
                r4.getAccessTokenInResponse(r5, r3, r8, r6)
                r7.writeNoException()
                return r2
            L_0x005b:
                r6.enforceInterface(r1)
                boolean r5 = r4.supportResponseWay()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0069:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x007b
                android.os.Parcelable$Creator r5 = android.accounts.Account.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.accounts.Account r5 = (android.accounts.Account) r5
                goto L_0x007c
            L_0x007b:
                r5 = r3
            L_0x007c:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x008b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x008b:
                r4.invalidateAccessToken(r5, r3)
                r7.writeNoException()
                return r2
            L_0x0092:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00a4
                android.os.Parcelable$Creator r5 = android.accounts.Account.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.accounts.Account r5 = (android.accounts.Account) r5
                goto L_0x00a5
            L_0x00a4:
                r5 = r3
            L_0x00a5:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00b4:
                android.os.Bundle r5 = r4.getSnsAccessToken(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00c4
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x00c7
            L_0x00c4:
                r7.writeInt(r0)
            L_0x00c7:
                return r2
            L_0x00c8:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00da
                android.os.Parcelable$Creator r5 = android.accounts.Account.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.accounts.Account r5 = (android.accounts.Account) r5
                goto L_0x00db
            L_0x00da:
                r5 = r3
            L_0x00db:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00ea
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00ea:
                android.os.Bundle r5 = r4.getMiCloudAccessToken(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00fa
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x00fd
            L_0x00fa:
                r7.writeInt(r0)
            L_0x00fd:
                return r2
            L_0x00fe:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0110
                android.os.Parcelable$Creator r5 = android.accounts.Account.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.accounts.Account r5 = (android.accounts.Account) r5
                goto L_0x0111
            L_0x0110:
                r5 = r3
            L_0x0111:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0120
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0120:
                android.os.Bundle r5 = r4.getMiCloudUserInfo(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0130
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x0133
            L_0x0130:
                r7.writeInt(r0)
            L_0x0133:
                return r2
            L_0x0134:
                r7.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.account.IXiaomiAuthService.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void getAccessTokenInResponse(IXiaomiAuthResponse iXiaomiAuthResponse, Bundle bundle, int i, int i2);

    Bundle getMiCloudAccessToken(Account account, Bundle bundle);

    Bundle getMiCloudUserInfo(Account account, Bundle bundle);

    Bundle getSnsAccessToken(Account account, Bundle bundle);

    int getVersionNum();

    void invalidateAccessToken(Account account, Bundle bundle);

    boolean isSupport(String str);

    boolean supportResponseWay();
}
