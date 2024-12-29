package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.people.People;

public interface IPeopleManager extends IInterface {

    public static abstract class Stub extends Binder implements IPeopleManager {
        private static final String DESCRIPTOR = "com.miot.api.IPeopleManager";
        static final int TRANSACTION_deletePeople = 3;
        static final int TRANSACTION_getPeople = 1;
        static final int TRANSACTION_savePeople = 2;

        private static class Proxy implements IPeopleManager {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int deletePeople() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public People getPeople() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? People.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int savePeople(People people) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (people != null) {
                        obtain.writeInt(1);
                        people.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPeopleManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPeopleManager)) ? new Proxy(iBinder) : (IPeopleManager) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int savePeople;
            if (i != 1) {
                if (i == 2) {
                    parcel.enforceInterface(DESCRIPTOR);
                    savePeople = savePeople(parcel.readInt() != 0 ? People.CREATOR.createFromParcel(parcel) : null);
                } else if (i == 3) {
                    parcel.enforceInterface(DESCRIPTOR);
                    savePeople = deletePeople();
                } else if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeInt(savePeople);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            People people = getPeople();
            parcel2.writeNoException();
            if (people != null) {
                parcel2.writeInt(1);
                people.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    int deletePeople();

    People getPeople();

    int savePeople(People people);
}
