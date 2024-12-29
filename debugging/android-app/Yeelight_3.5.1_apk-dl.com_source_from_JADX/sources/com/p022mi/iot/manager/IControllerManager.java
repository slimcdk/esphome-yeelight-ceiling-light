package com.p022mi.iot.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.manager.handler.ICompletedHandler;
import com.p022mi.iot.manager.handler.IControlHandler;
import com.p022mi.iot.manager.handler.IInvokeHandler;
import com.p022mi.iot.manager.listener.IDeviceListener;
import com.p022mi.iot.manager.listener.IPropertiesChangedListener;
import java.util.List;

/* renamed from: com.mi.iot.manager.IControllerManager */
public interface IControllerManager extends IInterface {

    /* renamed from: com.mi.iot.manager.IControllerManager$Default */
    public static class Default implements IControllerManager {
        public IBinder asBinder() {
            return null;
        }

        public void changeName(Device device, String str, ICompletedHandler iCompletedHandler) {
        }

        public void getDeviceList(IDeviceListener iDeviceListener) {
        }

        public void getDeviceListExtV2(IDeviceListener iDeviceListener) {
        }

        public void getDeviceListV2(IDeviceListener iDeviceListener) {
        }

        public void getProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
        }

        public void getPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        }

        public void invokeAction(Device device, Action action, IInvokeHandler iInvokeHandler) {
        }

        public void invokeActionV2(Device device, Action action, IInvokeHandler iInvokeHandler) {
        }

        public void pairing(Device device, String str, ICompletedHandler iCompletedHandler) {
        }

        public void setProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
        }

        public void setPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        }

        public void startScanBarcode() {
        }

        public void subscribe(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
        }

        public void subscribeV2(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
        }

        public void unpairing(Device device, ICompletedHandler iCompletedHandler) {
        }

        public void unsubscribe(Device device, List<Property> list, IControlHandler iControlHandler) {
        }

        public void unsubscribeV2(Device device, List<Property> list, IControlHandler iControlHandler) {
        }
    }

    /* renamed from: com.mi.iot.manager.IControllerManager$Stub */
    public static abstract class Stub extends Binder implements IControllerManager {
        private static final String DESCRIPTOR = "com.mi.iot.manager.IControllerManager";
        static final int TRANSACTION_changeName = 4;
        static final int TRANSACTION_getDeviceList = 3;
        static final int TRANSACTION_getDeviceListExtV2 = 11;
        static final int TRANSACTION_getDeviceListV2 = 10;
        static final int TRANSACTION_getProperties = 5;
        static final int TRANSACTION_getPropertiesV2 = 12;
        static final int TRANSACTION_invokeAction = 7;
        static final int TRANSACTION_invokeActionV2 = 14;
        static final int TRANSACTION_pairing = 1;
        static final int TRANSACTION_setProperties = 6;
        static final int TRANSACTION_setPropertiesV2 = 13;
        static final int TRANSACTION_startScanBarcode = 17;
        static final int TRANSACTION_subscribe = 8;
        static final int TRANSACTION_subscribeV2 = 15;
        static final int TRANSACTION_unpairing = 2;
        static final int TRANSACTION_unsubscribe = 9;
        static final int TRANSACTION_unsubscribeV2 = 16;

        /* renamed from: com.mi.iot.manager.IControllerManager$Stub$Proxy */
        private static class Proxy implements IControllerManager {
            public static IControllerManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void changeName(Device device, String str, ICompletedHandler iCompletedHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletedHandler != null ? iCompletedHandler.asBinder() : null);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().changeName(device, str, iCompletedHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getDeviceList(IDeviceListener iDeviceListener) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iDeviceListener != null ? iDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getDeviceList(iDeviceListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getDeviceListExtV2(IDeviceListener iDeviceListener) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iDeviceListener != null ? iDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getDeviceListExtV2(iDeviceListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getDeviceListV2(IDeviceListener iDeviceListener) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iDeviceListener != null ? iDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getDeviceListV2(iDeviceListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void getProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getProperties(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getPropertiesV2(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void invokeAction(Device device, Action action, IInvokeHandler iInvokeHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (action != null) {
                        obtain.writeInt(1);
                        action.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iInvokeHandler != null ? iInvokeHandler.asBinder() : null);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().invokeAction(device, action, iInvokeHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void invokeActionV2(Device device, Action action, IInvokeHandler iInvokeHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (action != null) {
                        obtain.writeInt(1);
                        action.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iInvokeHandler != null ? iInvokeHandler.asBinder() : null);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().invokeActionV2(device, action, iInvokeHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pairing(Device device, String str, ICompletedHandler iCompletedHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletedHandler != null ? iCompletedHandler.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().pairing(device, str, iCompletedHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setProperties(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setProperties(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setPropertiesV2(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startScanBarcode() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(17, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().startScanBarcode();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void subscribe(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (iPropertiesChangedListener != null) {
                        iBinder = iPropertiesChangedListener.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().subscribe(device, list, iControlHandler, iPropertiesChangedListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void subscribeV2(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (iPropertiesChangedListener != null) {
                        iBinder = iPropertiesChangedListener.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(15, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().subscribeV2(device, list, iControlHandler, iPropertiesChangedListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unpairing(Device device, ICompletedHandler iCompletedHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletedHandler != null ? iCompletedHandler.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unpairing(device, iCompletedHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unsubscribe(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unsubscribe(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unsubscribeV2(Device device, List<Property> list, IControlHandler iControlHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(iControlHandler != null ? iControlHandler.asBinder() : null);
                    if (this.mRemote.transact(16, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unsubscribeV2(device, list, iControlHandler);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IControllerManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IControllerManager)) ? new Proxy(iBinder) : (IControllerManager) queryLocalInterface;
        }

        public static IControllerManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IControllerManager iControllerManager) {
            if (Proxy.sDefaultImpl != null || iControllerManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iControllerManager;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.mi.iot.common.instance.Action} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.mi.iot.common.instance.Action} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.mi.iot.common.instance.Device} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: type inference failed for: r0v45 */
        /* JADX WARNING: type inference failed for: r0v46 */
        /* JADX WARNING: type inference failed for: r0v47 */
        /* JADX WARNING: type inference failed for: r0v48 */
        /* JADX WARNING: type inference failed for: r0v49 */
        /* JADX WARNING: type inference failed for: r0v50 */
        /* JADX WARNING: type inference failed for: r0v51 */
        /* JADX WARNING: type inference failed for: r0v52 */
        /* JADX WARNING: type inference failed for: r0v53 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.mi.iot.manager.IControllerManager"
                if (r4 == r0) goto L_0x0244
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x0221;
                    case 2: goto L_0x0202;
                    case 3: goto L_0x01f2;
                    case 4: goto L_0x01cf;
                    case 5: goto L_0x01aa;
                    case 6: goto L_0x0185;
                    case 7: goto L_0x0156;
                    case 8: goto L_0x0129;
                    case 9: goto L_0x0104;
                    case 10: goto L_0x00f4;
                    case 11: goto L_0x00e4;
                    case 12: goto L_0x00bf;
                    case 13: goto L_0x009a;
                    case 14: goto L_0x006b;
                    case 15: goto L_0x003f;
                    case 16: goto L_0x001b;
                    case 17: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                r3.startScanBarcode()
            L_0x0017:
                r6.writeNoException()
                return r1
            L_0x001b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x002d
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x002d:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.unsubscribeV2(r0, r4, r5)
                goto L_0x0017
            L_0x003f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0051
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0051:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r7 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r7 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r7)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.listener.IPropertiesChangedListener r5 = com.p022mi.iot.manager.listener.IPropertiesChangedListener.Stub.asInterface(r5)
                r3.subscribeV2(r0, r4, r7, r5)
                goto L_0x0017
            L_0x006b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x007d
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.mi.iot.common.instance.Device r4 = (com.p022mi.iot.common.instance.Device) r4
                goto L_0x007e
            L_0x007d:
                r4 = r0
            L_0x007e:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x008d
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Action> r7 = com.p022mi.iot.common.instance.Action.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.mi.iot.common.instance.Action r0 = (com.p022mi.iot.common.instance.Action) r0
            L_0x008d:
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IInvokeHandler r5 = com.p022mi.iot.manager.handler.IInvokeHandler.Stub.asInterface(r5)
                r3.invokeActionV2(r4, r0, r5)
                goto L_0x0017
            L_0x009a:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x00ac:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.setPropertiesV2(r0, r4, r5)
                goto L_0x0017
            L_0x00bf:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00d1
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x00d1:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.getPropertiesV2(r0, r4, r5)
                goto L_0x0017
            L_0x00e4:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.mi.iot.manager.listener.IDeviceListener r4 = com.p022mi.iot.manager.listener.IDeviceListener.Stub.asInterface(r4)
                r3.getDeviceListExtV2(r4)
                goto L_0x0017
            L_0x00f4:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.mi.iot.manager.listener.IDeviceListener r4 = com.p022mi.iot.manager.listener.IDeviceListener.Stub.asInterface(r4)
                r3.getDeviceListV2(r4)
                goto L_0x0017
            L_0x0104:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0116
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0116:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.unsubscribe(r0, r4, r5)
                goto L_0x0017
            L_0x0129:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x013b
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x013b:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r7 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r7 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r7)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.listener.IPropertiesChangedListener r5 = com.p022mi.iot.manager.listener.IPropertiesChangedListener.Stub.asInterface(r5)
                r3.subscribe(r0, r4, r7, r5)
                goto L_0x0017
            L_0x0156:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0168
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.mi.iot.common.instance.Device r4 = (com.p022mi.iot.common.instance.Device) r4
                goto L_0x0169
            L_0x0168:
                r4 = r0
            L_0x0169:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0178
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Action> r7 = com.p022mi.iot.common.instance.Action.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                r0 = r7
                com.mi.iot.common.instance.Action r0 = (com.p022mi.iot.common.instance.Action) r0
            L_0x0178:
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IInvokeHandler r5 = com.p022mi.iot.manager.handler.IInvokeHandler.Stub.asInterface(r5)
                r3.invokeAction(r4, r0, r5)
                goto L_0x0017
            L_0x0185:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0197
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0197:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.setProperties(r0, r4, r5)
                goto L_0x0017
            L_0x01aa:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x01bc
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x01bc:
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Property> r4 = com.p022mi.iot.common.instance.Property.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.IControlHandler r5 = com.p022mi.iot.manager.handler.IControlHandler.Stub.asInterface(r5)
                r3.getProperties(r0, r4, r5)
                goto L_0x0017
            L_0x01cf:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x01e1
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x01e1:
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.ICompletedHandler r5 = com.p022mi.iot.manager.handler.ICompletedHandler.Stub.asInterface(r5)
                r3.changeName(r0, r4, r5)
                goto L_0x0017
            L_0x01f2:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.mi.iot.manager.listener.IDeviceListener r4 = com.p022mi.iot.manager.listener.IDeviceListener.Stub.asInterface(r4)
                r3.getDeviceList(r4)
                goto L_0x0017
            L_0x0202:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0214
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0214:
                android.os.IBinder r4 = r5.readStrongBinder()
                com.mi.iot.manager.handler.ICompletedHandler r4 = com.p022mi.iot.manager.handler.ICompletedHandler.Stub.asInterface(r4)
                r3.unpairing(r0, r4)
                goto L_0x0017
            L_0x0221:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0233
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Device> r4 = com.p022mi.iot.common.instance.Device.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.mi.iot.common.instance.Device r0 = (com.p022mi.iot.common.instance.Device) r0
            L_0x0233:
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                com.mi.iot.manager.handler.ICompletedHandler r5 = com.p022mi.iot.manager.handler.ICompletedHandler.Stub.asInterface(r5)
                r3.pairing(r0, r4, r5)
                goto L_0x0017
            L_0x0244:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p022mi.iot.manager.IControllerManager.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void changeName(Device device, String str, ICompletedHandler iCompletedHandler);

    void getDeviceList(IDeviceListener iDeviceListener);

    void getDeviceListExtV2(IDeviceListener iDeviceListener);

    void getDeviceListV2(IDeviceListener iDeviceListener);

    void getProperties(Device device, List<Property> list, IControlHandler iControlHandler);

    void getPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler);

    void invokeAction(Device device, Action action, IInvokeHandler iInvokeHandler);

    void invokeActionV2(Device device, Action action, IInvokeHandler iInvokeHandler);

    void pairing(Device device, String str, ICompletedHandler iCompletedHandler);

    void setProperties(Device device, List<Property> list, IControlHandler iControlHandler);

    void setPropertiesV2(Device device, List<Property> list, IControlHandler iControlHandler);

    void startScanBarcode();

    void subscribe(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener);

    void subscribeV2(Device device, List<Property> list, IControlHandler iControlHandler, IPropertiesChangedListener iPropertiesChangedListener);

    void unpairing(Device device, ICompletedHandler iCompletedHandler);

    void unsubscribe(Device device, List<Property> list, IControlHandler iControlHandler);

    void unsubscribeV2(Device device, List<Property> list, IControlHandler iControlHandler);
}
