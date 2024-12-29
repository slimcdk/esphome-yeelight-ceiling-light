package com.xiaomi.xmsf.push.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* renamed from: com.xiaomi.xmsf.push.service.a */
public interface C4952a extends IInterface {

    /* renamed from: com.xiaomi.xmsf.push.service.a$a */
    public static abstract class C4953a extends Binder implements C4952a {

        /* renamed from: com.xiaomi.xmsf.push.service.a$a$a */
        private static class C4954a implements C4952a {

            /* renamed from: a */
            private IBinder f10220a;

            C4954a(IBinder iBinder) {
                this.f10220a = iBinder;
            }

            /* renamed from: a */
            public String mo26036a(String str, Map map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.xmsf.push.service.IHttpService");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f10220a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10220a;
            }
        }

        /* renamed from: a */
        public static C4952a m15893a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xmsf.push.service.IHttpService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C4952a)) ? new C4954a(iBinder) : (C4952a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.xmsf.push.service.IHttpService");
                String a = mo26036a(parcel.readString(), parcel.readHashMap(C4953a.class.getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.xiaomi.xmsf.push.service.IHttpService");
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo26036a(String str, Map map);
}
