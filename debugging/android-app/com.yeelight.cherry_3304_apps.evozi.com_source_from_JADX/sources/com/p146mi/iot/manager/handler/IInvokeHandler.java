package com.p146mi.iot.manager.handler;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.instance.Action;

/* renamed from: com.mi.iot.manager.handler.IInvokeHandler */
public interface IInvokeHandler extends IInterface {

    /* renamed from: com.mi.iot.manager.handler.IInvokeHandler$Stub */
    public static abstract class Stub extends Binder implements IInvokeHandler {
        private static final String DESCRIPTOR = "com.mi.iot.manager.handler.IInvokeHandler";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onResult = 1;

        /* renamed from: com.mi.iot.manager.handler.IInvokeHandler$Stub$Proxy */
        private static class Proxy implements IInvokeHandler {
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

            public void onError(IotError iotError) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iotError != null) {
                        obtain.writeInt(1);
                        iotError.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResult(Action action) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (action != null) {
                        obtain.writeInt(1);
                        action.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IInvokeHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IInvokeHandler)) ? new Proxy(iBinder) : (IInvokeHandler) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.mi.iot.common.instance.Action} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.mi.iot.common.error.IotError} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                java.lang.String r1 = "com.mi.iot.manager.handler.IInvokeHandler"
                r2 = 1
                if (r5 == r2) goto L_0x0030
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r1)
                return r2
            L_0x0017:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator<com.mi.iot.common.error.IotError> r5 = com.p146mi.iot.common.error.IotError.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.mi.iot.common.error.IotError r0 = (com.p146mi.iot.common.error.IotError) r0
            L_0x0029:
                r4.onError(r0)
            L_0x002c:
                r7.writeNoException()
                return r2
            L_0x0030:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0042
                android.os.Parcelable$Creator<com.mi.iot.common.instance.Action> r5 = com.p146mi.iot.common.instance.Action.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.mi.iot.common.instance.Action r0 = (com.p146mi.iot.common.instance.Action) r0
            L_0x0042:
                r4.onResult(r0)
                goto L_0x002c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p146mi.iot.manager.handler.IInvokeHandler.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onError(IotError iotError);

    void onResult(Action action);
}