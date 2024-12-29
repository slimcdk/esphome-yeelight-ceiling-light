package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.people.People;
import com.miot.common.voice.VoiceCommand;
import com.miot.common.voice.VoiceSession;

public interface IVoiceAssistant extends IInterface {

    public static abstract class Stub extends Binder implements IVoiceAssistant {
        private static final String DESCRIPTOR = "com.miot.api.IVoiceAssistant";
        static final int TRANSACTION_startSession = 1;
        static final int TRANSACTION_startSessionNew = 2;
        static final int TRANSACTION_voiceInvoke = 3;

        private static class Proxy implements IVoiceAssistant {
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

            public void startSession(People people, IVoiceSessionHandler iVoiceSessionHandler) {
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
                    obtain.writeStrongBinder(iVoiceSessionHandler != null ? iVoiceSessionHandler.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startSessionNew(People people, int i, String str, IVoiceSessionHandler iVoiceSessionHandler) {
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
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iVoiceSessionHandler != null ? iVoiceSessionHandler.asBinder() : null);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void voiceInvoke(People people, VoiceSession voiceSession, VoiceCommand voiceCommand, IVoiceInvokeHandler iVoiceInvokeHandler) {
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
                    if (voiceSession != null) {
                        obtain.writeInt(1);
                        voiceSession.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (voiceCommand != null) {
                        obtain.writeInt(1);
                        voiceCommand.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iVoiceInvokeHandler != null ? iVoiceInvokeHandler.asBinder() : null);
                    this.mRemote.transact(3, obtain, obtain2, 0);
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

        public static IVoiceAssistant asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IVoiceAssistant)) ? new Proxy(iBinder) : (IVoiceAssistant) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.miot.common.voice.VoiceCommand} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v10 */
        /* JADX WARNING: type inference failed for: r1v11 */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                java.lang.String r0 = "com.miot.api.IVoiceAssistant"
                r1 = 0
                r2 = 1
                if (r5 == r2) goto L_0x0081
                r3 = 2
                if (r5 == r3) goto L_0x005b
                r3 = 3
                if (r5 == r3) goto L_0x001a
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r1) goto L_0x0016
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r7.writeString(r0)
                return r2
            L_0x001a:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002c
                android.os.Parcelable$Creator<com.miot.common.people.People> r5 = com.miot.common.people.People.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.miot.common.people.People r5 = (com.miot.common.people.People) r5
                goto L_0x002d
            L_0x002c:
                r5 = r1
            L_0x002d:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x003c
                android.os.Parcelable$Creator<com.miot.common.voice.VoiceSession> r8 = com.miot.common.voice.VoiceSession.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                com.miot.common.voice.VoiceSession r8 = (com.miot.common.voice.VoiceSession) r8
                goto L_0x003d
            L_0x003c:
                r8 = r1
            L_0x003d:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x004c
                android.os.Parcelable$Creator<com.miot.common.voice.VoiceCommand> r0 = com.miot.common.voice.VoiceCommand.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                r1 = r0
                com.miot.common.voice.VoiceCommand r1 = (com.miot.common.voice.VoiceCommand) r1
            L_0x004c:
                android.os.IBinder r6 = r6.readStrongBinder()
                com.miot.api.IVoiceInvokeHandler r6 = com.miot.api.IVoiceInvokeHandler.Stub.asInterface(r6)
                r4.voiceInvoke(r5, r8, r1, r6)
            L_0x0057:
                r7.writeNoException()
                return r2
            L_0x005b:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x006d
                android.os.Parcelable$Creator<com.miot.common.people.People> r5 = com.miot.common.people.People.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                com.miot.common.people.People r1 = (com.miot.common.people.People) r1
            L_0x006d:
                int r5 = r6.readInt()
                java.lang.String r8 = r6.readString()
                android.os.IBinder r6 = r6.readStrongBinder()
                com.miot.api.IVoiceSessionHandler r6 = com.miot.api.IVoiceSessionHandler.Stub.asInterface(r6)
                r4.startSessionNew(r1, r5, r8, r6)
                goto L_0x0057
            L_0x0081:
                r6.enforceInterface(r0)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0093
                android.os.Parcelable$Creator<com.miot.common.people.People> r5 = com.miot.common.people.People.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                com.miot.common.people.People r1 = (com.miot.common.people.People) r1
            L_0x0093:
                android.os.IBinder r5 = r6.readStrongBinder()
                com.miot.api.IVoiceSessionHandler r5 = com.miot.api.IVoiceSessionHandler.Stub.asInterface(r5)
                r4.startSession(r1, r5)
                goto L_0x0057
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.api.IVoiceAssistant.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void startSession(People people, IVoiceSessionHandler iVoiceSessionHandler);

    void startSessionNew(People people, int i, String str, IVoiceSessionHandler iVoiceSessionHandler);

    void voiceInvoke(People people, VoiceSession voiceSession, VoiceCommand voiceCommand, IVoiceInvokeHandler iVoiceInvokeHandler);
}
