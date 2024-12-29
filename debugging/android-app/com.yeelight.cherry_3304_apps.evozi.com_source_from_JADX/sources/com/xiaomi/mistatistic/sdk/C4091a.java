package com.xiaomi.mistatistic.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.mistatistic.sdk.data.StatEventPojo;
import java.util.List;

/* renamed from: com.xiaomi.mistatistic.sdk.a */
public interface C4091a extends IInterface {

    /* renamed from: com.xiaomi.mistatistic.sdk.a$a */
    public static abstract class C4092a extends Binder implements C4091a {

        /* renamed from: com.xiaomi.mistatistic.sdk.a$a$a */
        private static class C4093a implements C4091a {

            /* renamed from: a */
            private IBinder f6993a;

            C4093a(IBinder iBinder) {
                this.f6993a = iBinder;
            }

            /* renamed from: a */
            public int mo22983a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.mistatistic.sdk.IBaseService");
                    this.f6993a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public StatEventPojo mo22984a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.mistatistic.sdk.IBaseService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f6993a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? StatEventPojo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public List<StatEventPojo> mo22985a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaomi.mistatistic.sdk.IBaseService");
                    obtain.writeLong(j);
                    this.f6993a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(StatEventPojo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6993a;
            }
        }

        public C4092a() {
            attachInterface(this, "com.xiaomi.mistatistic.sdk.IBaseService");
        }

        /* renamed from: a */
        public static C4091a m11018a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.mistatistic.sdk.IBaseService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C4091a)) ? new C4093a(iBinder) : (C4091a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.mistatistic.sdk.IBaseService");
                StatEventPojo a = mo22984a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.xiaomi.mistatistic.sdk.IBaseService");
                List<StatEventPojo> a2 = mo22985a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.xiaomi.mistatistic.sdk.IBaseService");
                int a3 = mo22983a();
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.xiaomi.mistatistic.sdk.IBaseService");
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo22983a();

    /* renamed from: a */
    StatEventPojo mo22984a(String str, String str2);

    /* renamed from: a */
    List<StatEventPojo> mo22985a(long j);
}
