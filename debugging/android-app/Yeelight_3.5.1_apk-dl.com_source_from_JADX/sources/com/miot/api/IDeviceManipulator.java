package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.people.People;

public interface IDeviceManipulator extends IInterface {

    public static class Default implements IDeviceManipulator {
        public void addPropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler, IPropertyChangedListener iPropertyChangedListener) {
        }

        public IBinder asBinder() {
            return null;
        }

        public void enableLanCtrl(boolean z) {
        }

        public void invoke(People people, ActionInfo actionInfo, IInvokeCompletionHandler iInvokeCompletionHandler) {
        }

        public boolean isLanCtrlEnabled() {
            return false;
        }

        public void readProperty(People people, PropertyInfo propertyInfo, IReadPropertyCompletionHandler iReadPropertyCompletionHandler) {
        }

        public void removePropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler) {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceManipulator {
        private static final String DESCRIPTOR = "com.miot.api.IDeviceManipulator";
        static final int TRANSACTION_addPropertyChangedListener = 5;
        static final int TRANSACTION_enableLanCtrl = 1;
        static final int TRANSACTION_invoke = 3;
        static final int TRANSACTION_isLanCtrlEnabled = 2;
        static final int TRANSACTION_readProperty = 4;
        static final int TRANSACTION_removePropertyChangedListener = 6;

        private static class Proxy implements IDeviceManipulator {
            public static IDeviceManipulator sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void addPropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler, IPropertyChangedListener iPropertyChangedListener) {
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
                    if (propertyInfo != null) {
                        obtain.writeInt(1);
                        propertyInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    if (iPropertyChangedListener != null) {
                        iBinder = iPropertyChangedListener.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addPropertyChangedListener(people, propertyInfo, iCompletionHandler, iPropertyChangedListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void enableLanCtrl(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().enableLanCtrl(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void invoke(People people, ActionInfo actionInfo, IInvokeCompletionHandler iInvokeCompletionHandler) {
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
                    if (actionInfo != null) {
                        obtain.writeInt(1);
                        actionInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iInvokeCompletionHandler != null ? iInvokeCompletionHandler.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().invoke(people, actionInfo, iInvokeCompletionHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isLanCtrlEnabled() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isLanCtrlEnabled();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void readProperty(People people, PropertyInfo propertyInfo, IReadPropertyCompletionHandler iReadPropertyCompletionHandler) {
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
                    if (propertyInfo != null) {
                        obtain.writeInt(1);
                        propertyInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iReadPropertyCompletionHandler != null ? iReadPropertyCompletionHandler.asBinder() : null);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().readProperty(people, propertyInfo, iReadPropertyCompletionHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removePropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler) {
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
                    if (propertyInfo != null) {
                        obtain.writeInt(1);
                        propertyInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().removePropertyChangedListener(people, propertyInfo, iCompletionHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDeviceManipulator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceManipulator)) ? new Proxy(iBinder) : (IDeviceManipulator) queryLocalInterface;
        }

        public static IDeviceManipulator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceManipulator iDeviceManipulator) {
            if (Proxy.sDefaultImpl != null || iDeviceManipulator == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceManipulator;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.miot.common.device.invocation.ActionInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.miot.common.device.invocation.PropertyInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.miot.common.device.invocation.PropertyInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.miot.common.device.invocation.PropertyInfo} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.miot.api.IDeviceManipulator"
                if (r4 == r0) goto L_0x00f4
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00e3;
                    case 2: goto L_0x00d5;
                    case 3: goto L_0x00a6;
                    case 4: goto L_0x0078;
                    case 5: goto L_0x0042;
                    case 6: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0023
                android.os.Parcelable$Creator<com.miot.common.people.People> r4 = com.miot.common.people.People.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.miot.common.people.People r4 = (com.miot.common.people.People) r4
                goto L_0x0024
            L_0x0023:
                r4 = r0
            L_0x0024:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0033
                android.os.Parcelable$Creator<com.miot.common.device.invocation.PropertyInfo> r7 = com.miot.common.device.invocation.PropertyInfo.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.miot.common.device.invocation.PropertyInfo r0 = (com.miot.common.device.invocation.PropertyInfo) r0
            L_0x0033:
                android.os.IBinder r5 = r5.readStrongBinder()
                com.miot.api.ICompletionHandler r5 = com.miot.api.ICompletionHandler.Stub.asInterface(r5)
                r3.removePropertyChangedListener(r4, r0, r5)
            L_0x003e:
                r6.writeNoException()
                return r1
            L_0x0042:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0054
                android.os.Parcelable$Creator<com.miot.common.people.People> r4 = com.miot.common.people.People.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.miot.common.people.People r4 = (com.miot.common.people.People) r4
                goto L_0x0055
            L_0x0054:
                r4 = r0
            L_0x0055:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0064
                android.os.Parcelable$Creator<com.miot.common.device.invocation.PropertyInfo> r7 = com.miot.common.device.invocation.PropertyInfo.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.miot.common.device.invocation.PropertyInfo r0 = (com.miot.common.device.invocation.PropertyInfo) r0
            L_0x0064:
                android.os.IBinder r7 = r5.readStrongBinder()
                com.miot.api.ICompletionHandler r7 = com.miot.api.ICompletionHandler.Stub.asInterface(r7)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.miot.api.IPropertyChangedListener r5 = com.miot.api.IPropertyChangedListener.Stub.asInterface(r5)
                r3.addPropertyChangedListener(r4, r0, r7, r5)
                goto L_0x003e
            L_0x0078:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x008a
                android.os.Parcelable$Creator<com.miot.common.people.People> r4 = com.miot.common.people.People.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.miot.common.people.People r4 = (com.miot.common.people.People) r4
                goto L_0x008b
            L_0x008a:
                r4 = r0
            L_0x008b:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x009a
                android.os.Parcelable$Creator<com.miot.common.device.invocation.PropertyInfo> r7 = com.miot.common.device.invocation.PropertyInfo.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.miot.common.device.invocation.PropertyInfo r0 = (com.miot.common.device.invocation.PropertyInfo) r0
            L_0x009a:
                android.os.IBinder r5 = r5.readStrongBinder()
                com.miot.api.IReadPropertyCompletionHandler r5 = com.miot.api.IReadPropertyCompletionHandler.Stub.asInterface(r5)
                r3.readProperty(r4, r0, r5)
                goto L_0x003e
            L_0x00a6:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b8
                android.os.Parcelable$Creator<com.miot.common.people.People> r4 = com.miot.common.people.People.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.miot.common.people.People r4 = (com.miot.common.people.People) r4
                goto L_0x00b9
            L_0x00b8:
                r4 = r0
            L_0x00b9:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x00c8
                android.os.Parcelable$Creator<com.miot.common.device.invocation.ActionInfo> r7 = com.miot.common.device.invocation.ActionInfo.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.miot.common.device.invocation.ActionInfo r0 = (com.miot.common.device.invocation.ActionInfo) r0
            L_0x00c8:
                android.os.IBinder r5 = r5.readStrongBinder()
                com.miot.api.IInvokeCompletionHandler r5 = com.miot.api.IInvokeCompletionHandler.Stub.asInterface(r5)
                r3.invoke(r4, r0, r5)
                goto L_0x003e
            L_0x00d5:
                r5.enforceInterface(r2)
                boolean r4 = r3.isLanCtrlEnabled()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x00e3:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ee
                r4 = 1
                goto L_0x00ef
            L_0x00ee:
                r4 = 0
            L_0x00ef:
                r3.enableLanCtrl(r4)
                goto L_0x003e
            L_0x00f4:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.api.IDeviceManipulator.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void addPropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler, IPropertyChangedListener iPropertyChangedListener);

    void enableLanCtrl(boolean z);

    void invoke(People people, ActionInfo actionInfo, IInvokeCompletionHandler iInvokeCompletionHandler);

    boolean isLanCtrlEnabled();

    void readProperty(People people, PropertyInfo propertyInfo, IReadPropertyCompletionHandler iReadPropertyCompletionHandler);

    void removePropertyChangedListener(People people, PropertyInfo propertyInfo, ICompletionHandler iCompletionHandler);
}
