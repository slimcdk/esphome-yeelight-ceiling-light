package com.xiaomi.xmsf.push.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.xiaomi.xmsf.push.service.b */
public interface C4955b extends IInterface {

    /* renamed from: com.xiaomi.xmsf.push.service.b$a */
    public static abstract class C4956a extends Binder implements C4955b {

        /* renamed from: com.xiaomi.xmsf.push.service.b$a$a */
        private static class C4957a implements C4955b {

            /* renamed from: a */
            private IBinder f10221a;

            C4957a(IBinder iBinder) {
                this.f10221a = iBinder;
            }

            /* renamed from: a */
            public void mo26039a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.xmsf.push.service.IStatService");
                    obtain.writeString(str);
                    this.f10221a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10221a;
            }
        }

        /* renamed from: a */
        public static C4955b m15896a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xmsf.push.service.IStatService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C4955b)) ? new C4957a(iBinder) : (C4955b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.xmsf.push.service.IStatService");
                mo26039a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.xiaomi.xmsf.push.service.IStatService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo26039a(String str);
}
