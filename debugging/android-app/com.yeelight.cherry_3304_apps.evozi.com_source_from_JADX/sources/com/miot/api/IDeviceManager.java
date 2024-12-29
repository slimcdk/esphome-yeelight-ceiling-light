package com.miot.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.miot.common.device.Device;
import com.miot.common.devicelog.DeviceLogQueryParams;
import com.miot.common.people.People;
import com.miot.common.scene.SceneBean;
import com.miot.common.share.SharedRequest;
import com.miot.common.timer.Timer;
import java.util.List;

public interface IDeviceManager extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceManager {
        private static final String DESCRIPTOR = "com.miot.api.IDeviceManager";
        static final int TRANSACTION_addScene = 18;
        static final int TRANSACTION_addTimer = 24;
        static final int TRANSACTION_bindWithBindkey = 30;
        static final int TRANSACTION_callSmarthomeApi = 29;
        static final int TRANSACTION_cancelShare = 10;
        static final int TRANSACTION_checkBindKey = 35;
        static final int TRANSACTION_checkPinCode = 32;
        static final int TRANSACTION_disclaimOwnership = 8;
        static final int TRANSACTION_editScene = 21;
        static final int TRANSACTION_editTimer = 26;
        static final int TRANSACTION_enableScene = 22;
        static final int TRANSACTION_getBindKey = 34;
        static final int TRANSACTION_getDevice = 2;
        static final int TRANSACTION_getDevice0 = 3;
        static final int TRANSACTION_getUserProfile = 31;
        static final int TRANSACTION_localPing = 36;
        static final int TRANSACTION_queryDeviceLog = 28;
        static final int TRANSACTION_queryFirmwareInfo = 14;
        static final int TRANSACTION_queryScene = 17;
        static final int TRANSACTION_querySceneList = 16;
        static final int TRANSACTION_querySharedRequests = 12;
        static final int TRANSACTION_querySharedUsers = 11;
        static final int TRANSACTION_queryTimerList = 23;
        static final int TRANSACTION_queryWanDevices = 1;
        static final int TRANSACTION_removeScene = 19;
        static final int TRANSACTION_removeTimer = 25;
        static final int TRANSACTION_renameDevice = 27;
        static final int TRANSACTION_replySharedRequest = 13;
        static final int TRANSACTION_runScene = 20;
        static final int TRANSACTION_setPinCode = 33;
        static final int TRANSACTION_shareDevice = 9;
        static final int TRANSACTION_startScan = 4;
        static final int TRANSACTION_startScan0 = 5;
        static final int TRANSACTION_startUpgradeFirmware = 15;
        static final int TRANSACTION_stopScan = 6;
        static final int TRANSACTION_takeOwnership = 7;

        private static class Proxy implements IDeviceManager {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void addScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler) {
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
                    if (sceneBean != null) {
                        obtain.writeInt(1);
                        sceneBean.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void addTimer(People people, Timer timer, IAddTimerCompletionHandler iAddTimerCompletionHandler) {
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
                    if (timer != null) {
                        obtain.writeInt(1);
                        timer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iAddTimerCompletionHandler != null ? iAddTimerCompletionHandler.asBinder() : null);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void bindWithBindkey(People people, String str, ICommonHandler iCommonHandler) {
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
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void callSmarthomeApi(People people, String str, String str2, ICommonHandler iCommonHandler) {
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
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void cancelShare(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void checkBindKey(People people, String str, ICommonHandler iCommonHandler) {
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
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void checkPinCode(People people, String str, Device device, ICommonHandler iCommonHandler) {
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
                    obtain.writeString(str);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void disclaimOwnership(People people, Device device, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void editScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler) {
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
                    if (sceneBean != null) {
                        obtain.writeInt(1);
                        sceneBean.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void editTimer(People people, Timer timer, ICompletionHandler iCompletionHandler) {
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
                    if (timer != null) {
                        obtain.writeInt(1);
                        timer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void enableScene(People people, int i, boolean z, ICompletionHandler iCompletionHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i2 = 1;
                    if (people != null) {
                        obtain.writeInt(1);
                        people.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getBindKey(People people, ICommonHandler iCommonHandler) {
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
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Device getDevice(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Device.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Device getDevice0(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Device.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void getUserProfile(People people, String str, IGetUserProfileHandler iGetUserProfileHandler) {
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
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iGetUserProfileHandler != null ? iGetUserProfileHandler.asBinder() : null);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void localPing(String str, ICompletionHandler iCompletionHandler) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void queryDeviceLog(People people, DeviceLogQueryParams deviceLogQueryParams, IDeviceLogHandler iDeviceLogHandler) {
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
                    if (deviceLogQueryParams != null) {
                        obtain.writeInt(1);
                        deviceLogQueryParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iDeviceLogHandler != null ? iDeviceLogHandler.asBinder() : null);
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void queryFirmwareInfo(People people, Device device, IQueryFirmwareHandler iQueryFirmwareHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iQueryFirmwareHandler != null ? iQueryFirmwareHandler.asBinder() : null);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void queryScene(People people, int i, ISceneHandler iSceneHandler) {
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
                    obtain.writeStrongBinder(iSceneHandler != null ? iSceneHandler.asBinder() : null);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void querySceneList(People people, IScenesHandler iScenesHandler) {
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
                    obtain.writeStrongBinder(iScenesHandler != null ? iScenesHandler.asBinder() : null);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void querySharedRequests(People people, ISharedRequestsHandler iSharedRequestsHandler) {
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
                    obtain.writeStrongBinder(iSharedRequestsHandler != null ? iSharedRequestsHandler.asBinder() : null);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void querySharedUsers(People people, Device device, ISharedUsersHandler iSharedUsersHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iSharedUsersHandler != null ? iSharedUsersHandler.asBinder() : null);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void queryTimerList(People people, String str, ITimerHandler iTimerHandler) {
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
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iTimerHandler != null ? iTimerHandler.asBinder() : null);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void queryWanDevices(People people, IDeviceHandler iDeviceHandler) {
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
                    obtain.writeStrongBinder(iDeviceHandler != null ? iDeviceHandler.asBinder() : null);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeScene(People people, int i, ICompletionHandler iCompletionHandler) {
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
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeTimer(People people, long j, ICompletionHandler iCompletionHandler) {
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
                    obtain.writeLong(j);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void renameDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void replySharedRequest(People people, SharedRequest sharedRequest, ICompletionHandler iCompletionHandler) {
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
                    if (sharedRequest != null) {
                        obtain.writeInt(1);
                        sharedRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void runScene(People people, int i, ICompletionHandler iCompletionHandler) {
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
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPinCode(People people, String str, String str2, Device device, ICommonHandler iCommonHandler) {
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
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCommonHandler != null ? iCommonHandler.asBinder() : null);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void shareDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startScan(People people, IDeviceHandler iDeviceHandler) {
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
                    obtain.writeStrongBinder(iDeviceHandler != null ? iDeviceHandler.asBinder() : null);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startScan0(People people, List<String> list, IDeviceHandler iDeviceHandler) {
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
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(iDeviceHandler != null ? iDeviceHandler.asBinder() : null);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startUpgradeFirmware(People people, Device device, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stopScan(People people) {
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
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void takeOwnership(People people, Device device, ICompletionHandler iCompletionHandler) {
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
                    if (device != null) {
                        obtain.writeInt(1);
                        device.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iCompletionHandler != null ? iCompletionHandler.asBinder() : null);
                    this.mRemote.transact(7, obtain, obtain2, 0);
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

        public static IDeviceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceManager)) ? new Proxy(iBinder) : (IDeviceManager) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.miot.common.share.SharedRequest} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: com.miot.common.scene.SceneBean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: com.miot.common.scene.SceneBean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v76, resolved type: com.miot.common.devicelog.DeviceLogQueryParams} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v85, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v88, resolved type: com.miot.common.device.Device} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v94, resolved type: com.miot.common.people.People} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v97, resolved type: com.miot.common.people.People} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v64, types: [com.miot.common.timer.Timer] */
        /* JADX WARNING: type inference failed for: r3v70, types: [com.miot.common.timer.Timer] */
        /* JADX WARNING: type inference failed for: r3v91 */
        /* JADX WARNING: type inference failed for: r3v100 */
        /* JADX WARNING: type inference failed for: r3v101 */
        /* JADX WARNING: type inference failed for: r3v102 */
        /* JADX WARNING: type inference failed for: r3v103 */
        /* JADX WARNING: type inference failed for: r3v104 */
        /* JADX WARNING: type inference failed for: r3v105 */
        /* JADX WARNING: type inference failed for: r3v106 */
        /* JADX WARNING: type inference failed for: r3v107 */
        /* JADX WARNING: type inference failed for: r3v108 */
        /* JADX WARNING: type inference failed for: r3v109 */
        /* JADX WARNING: type inference failed for: r3v110 */
        /* JADX WARNING: type inference failed for: r3v111 */
        /* JADX WARNING: type inference failed for: r3v112 */
        /* JADX WARNING: type inference failed for: r3v113 */
        /* JADX WARNING: type inference failed for: r3v114 */
        /* JADX WARNING: type inference failed for: r3v115 */
        /* JADX WARNING: type inference failed for: r3v116 */
        /* JADX WARNING: type inference failed for: r3v117 */
        /* JADX WARNING: type inference failed for: r3v118 */
        /* JADX WARNING: type inference failed for: r3v119 */
        /* JADX WARNING: type inference failed for: r3v120 */
        /* JADX WARNING: type inference failed for: r3v121 */
        /* JADX WARNING: type inference failed for: r3v122 */
        /* JADX WARNING: type inference failed for: r3v123 */
        /* JADX WARNING: type inference failed for: r3v124 */
        /* JADX WARNING: type inference failed for: r3v125 */
        /* JADX WARNING: type inference failed for: r3v126 */
        /* JADX WARNING: type inference failed for: r3v127 */
        /* JADX WARNING: type inference failed for: r3v128 */
        /* JADX WARNING: type inference failed for: r3v129 */
        /* JADX WARNING: type inference failed for: r3v130 */
        /* JADX WARNING: type inference failed for: r3v131 */
        /* JADX WARNING: type inference failed for: r3v132 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
            /*
                r10 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "com.miot.api.IDeviceManager"
                r2 = 1
                if (r11 == r0) goto L_0x05a8
                r0 = 0
                r3 = 0
                switch(r11) {
                    case 1: goto L_0x0589;
                    case 2: goto L_0x056e;
                    case 3: goto L_0x054f;
                    case 4: goto L_0x0530;
                    case 5: goto L_0x050d;
                    case 6: goto L_0x04f6;
                    case 7: goto L_0x04c7;
                    case 8: goto L_0x0498;
                    case 9: goto L_0x0465;
                    case 10: goto L_0x0432;
                    case 11: goto L_0x0403;
                    case 12: goto L_0x03e4;
                    case 13: goto L_0x03b5;
                    case 14: goto L_0x0386;
                    case 15: goto L_0x0357;
                    case 16: goto L_0x0338;
                    case 17: goto L_0x0315;
                    case 18: goto L_0x02e6;
                    case 19: goto L_0x02c3;
                    case 20: goto L_0x02a0;
                    case 21: goto L_0x0271;
                    case 22: goto L_0x0247;
                    case 23: goto L_0x0224;
                    case 24: goto L_0x01f5;
                    case 25: goto L_0x01d2;
                    case 26: goto L_0x01a3;
                    case 27: goto L_0x0170;
                    case 28: goto L_0x0141;
                    case 29: goto L_0x011a;
                    case 30: goto L_0x00f7;
                    case 31: goto L_0x00d4;
                    case 32: goto L_0x00a1;
                    case 33: goto L_0x0068;
                    case 34: goto L_0x004a;
                    case 35: goto L_0x0028;
                    case 36: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L_0x0012:
                r12.enforceInterface(r1)
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.localPing(r11, r12)
            L_0x0024:
                r13.writeNoException()
                return r2
            L_0x0028:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x003a
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x003a:
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r12 = com.miot.api.ICommonHandler.Stub.asInterface(r12)
                r10.checkBindKey(r3, r11, r12)
                goto L_0x0024
            L_0x004a:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x005c
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x005c:
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r11 = com.miot.api.ICommonHandler.Stub.asInterface(r11)
                r10.getBindKey(r3, r11)
                goto L_0x0024
            L_0x0068:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x007b
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                r5 = r11
                goto L_0x007c
            L_0x007b:
                r5 = r3
            L_0x007c:
                java.lang.String r6 = r12.readString()
                java.lang.String r7 = r12.readString()
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0093
                android.os.Parcelable$Creator<com.miot.common.device.Device> r11 = com.miot.common.device.Device.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0093:
                r8 = r3
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r9 = com.miot.api.ICommonHandler.Stub.asInterface(r11)
                r4 = r10
                r4.setPinCode(r5, r6, r7, r8, r9)
                goto L_0x0024
            L_0x00a1:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x00b3
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x00b4
            L_0x00b3:
                r11 = r3
            L_0x00b4:
                java.lang.String r14 = r12.readString()
                int r0 = r12.readInt()
                if (r0 == 0) goto L_0x00c7
                android.os.Parcelable$Creator<com.miot.common.device.Device> r0 = com.miot.common.device.Device.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r12)
                r3 = r0
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x00c7:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r12 = com.miot.api.ICommonHandler.Stub.asInterface(r12)
                r10.checkPinCode(r11, r14, r3, r12)
                goto L_0x0024
            L_0x00d4:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x00e6
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x00e6:
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.IGetUserProfileHandler r12 = com.miot.api.IGetUserProfileHandler.Stub.asInterface(r12)
                r10.getUserProfile(r3, r11, r12)
                goto L_0x0024
            L_0x00f7:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0109
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0109:
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r12 = com.miot.api.ICommonHandler.Stub.asInterface(r12)
                r10.bindWithBindkey(r3, r11, r12)
                goto L_0x0024
            L_0x011a:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x012c
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x012c:
                java.lang.String r11 = r12.readString()
                java.lang.String r14 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICommonHandler r12 = com.miot.api.ICommonHandler.Stub.asInterface(r12)
                r10.callSmarthomeApi(r3, r11, r14, r12)
                goto L_0x0024
            L_0x0141:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0153
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0154
            L_0x0153:
                r11 = r3
            L_0x0154:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0163
                android.os.Parcelable$Creator<com.miot.common.devicelog.DeviceLogQueryParams> r14 = com.miot.common.devicelog.DeviceLogQueryParams.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.devicelog.DeviceLogQueryParams r3 = (com.miot.common.devicelog.DeviceLogQueryParams) r3
            L_0x0163:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.IDeviceLogHandler r12 = com.miot.api.IDeviceLogHandler.Stub.asInterface(r12)
                r10.queryDeviceLog(r11, r3, r12)
                goto L_0x0024
            L_0x0170:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0182
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0183
            L_0x0182:
                r11 = r3
            L_0x0183:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0192
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0192:
                java.lang.String r14 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.renameDevice(r11, r3, r14, r12)
                goto L_0x0024
            L_0x01a3:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x01b5
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x01b6
            L_0x01b5:
                r11 = r3
            L_0x01b6:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x01c5
                android.os.Parcelable$Creator<com.miot.common.timer.Timer> r14 = com.miot.common.timer.Timer.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.timer.Timer r3 = (com.miot.common.timer.Timer) r3
            L_0x01c5:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.editTimer(r11, r3, r12)
                goto L_0x0024
            L_0x01d2:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x01e4
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x01e4:
                long r0 = r12.readLong()
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r11 = com.miot.api.ICompletionHandler.Stub.asInterface(r11)
                r10.removeTimer(r3, r0, r11)
                goto L_0x0024
            L_0x01f5:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0207
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0208
            L_0x0207:
                r11 = r3
            L_0x0208:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0217
                android.os.Parcelable$Creator<com.miot.common.timer.Timer> r14 = com.miot.common.timer.Timer.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.timer.Timer r3 = (com.miot.common.timer.Timer) r3
            L_0x0217:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.IAddTimerCompletionHandler r12 = com.miot.api.IAddTimerCompletionHandler.Stub.asInterface(r12)
                r10.addTimer(r11, r3, r12)
                goto L_0x0024
            L_0x0224:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0236
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0236:
                java.lang.String r11 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ITimerHandler r12 = com.miot.api.ITimerHandler.Stub.asInterface(r12)
                r10.queryTimerList(r3, r11, r12)
                goto L_0x0024
            L_0x0247:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0259
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0259:
                int r11 = r12.readInt()
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0264
                r0 = 1
            L_0x0264:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.enableScene(r3, r11, r0, r12)
                goto L_0x0024
            L_0x0271:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0283
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0284
            L_0x0283:
                r11 = r3
            L_0x0284:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0293
                android.os.Parcelable$Creator<com.miot.common.scene.SceneBean> r14 = com.miot.common.scene.SceneBean.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.scene.SceneBean r3 = (com.miot.common.scene.SceneBean) r3
            L_0x0293:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.editScene(r11, r3, r12)
                goto L_0x0024
            L_0x02a0:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x02b2
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x02b2:
                int r11 = r12.readInt()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.runScene(r3, r11, r12)
                goto L_0x0024
            L_0x02c3:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x02d5
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x02d5:
                int r11 = r12.readInt()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.removeScene(r3, r11, r12)
                goto L_0x0024
            L_0x02e6:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x02f8
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x02f9
            L_0x02f8:
                r11 = r3
            L_0x02f9:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0308
                android.os.Parcelable$Creator<com.miot.common.scene.SceneBean> r14 = com.miot.common.scene.SceneBean.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.scene.SceneBean r3 = (com.miot.common.scene.SceneBean) r3
            L_0x0308:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.addScene(r11, r3, r12)
                goto L_0x0024
            L_0x0315:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0327
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0327:
                int r11 = r12.readInt()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ISceneHandler r12 = com.miot.api.ISceneHandler.Stub.asInterface(r12)
                r10.queryScene(r3, r11, r12)
                goto L_0x0024
            L_0x0338:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x034a
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x034a:
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.IScenesHandler r11 = com.miot.api.IScenesHandler.Stub.asInterface(r11)
                r10.querySceneList(r3, r11)
                goto L_0x0024
            L_0x0357:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0369
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x036a
            L_0x0369:
                r11 = r3
            L_0x036a:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0379
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0379:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.startUpgradeFirmware(r11, r3, r12)
                goto L_0x0024
            L_0x0386:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0398
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0399
            L_0x0398:
                r11 = r3
            L_0x0399:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x03a8
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x03a8:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.IQueryFirmwareHandler r12 = com.miot.api.IQueryFirmwareHandler.Stub.asInterface(r12)
                r10.queryFirmwareInfo(r11, r3, r12)
                goto L_0x0024
            L_0x03b5:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x03c7
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x03c8
            L_0x03c7:
                r11 = r3
            L_0x03c8:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x03d7
                android.os.Parcelable$Creator<com.miot.common.share.SharedRequest> r14 = com.miot.common.share.SharedRequest.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.share.SharedRequest r3 = (com.miot.common.share.SharedRequest) r3
            L_0x03d7:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.replySharedRequest(r11, r3, r12)
                goto L_0x0024
            L_0x03e4:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x03f6
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x03f6:
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.ISharedRequestsHandler r11 = com.miot.api.ISharedRequestsHandler.Stub.asInterface(r11)
                r10.querySharedRequests(r3, r11)
                goto L_0x0024
            L_0x0403:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0415
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0416
            L_0x0415:
                r11 = r3
            L_0x0416:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0425
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0425:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ISharedUsersHandler r12 = com.miot.api.ISharedUsersHandler.Stub.asInterface(r12)
                r10.querySharedUsers(r11, r3, r12)
                goto L_0x0024
            L_0x0432:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0444
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0445
            L_0x0444:
                r11 = r3
            L_0x0445:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0454
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0454:
                java.lang.String r14 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.cancelShare(r11, r3, r14, r12)
                goto L_0x0024
            L_0x0465:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0477
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x0478
            L_0x0477:
                r11 = r3
            L_0x0478:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x0487
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x0487:
                java.lang.String r14 = r12.readString()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.shareDevice(r11, r3, r14, r12)
                goto L_0x0024
            L_0x0498:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x04aa
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x04ab
            L_0x04aa:
                r11 = r3
            L_0x04ab:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x04ba
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x04ba:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.disclaimOwnership(r11, r3, r12)
                goto L_0x0024
            L_0x04c7:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x04d9
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.miot.common.people.People r11 = (com.miot.common.people.People) r11
                goto L_0x04da
            L_0x04d9:
                r11 = r3
            L_0x04da:
                int r14 = r12.readInt()
                if (r14 == 0) goto L_0x04e9
                android.os.Parcelable$Creator<com.miot.common.device.Device> r14 = com.miot.common.device.Device.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r12)
                r3 = r14
                com.miot.common.device.Device r3 = (com.miot.common.device.Device) r3
            L_0x04e9:
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.ICompletionHandler r12 = com.miot.api.ICompletionHandler.Stub.asInterface(r12)
                r10.takeOwnership(r11, r3, r12)
                goto L_0x0024
            L_0x04f6:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0508
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0508:
                r10.stopScan(r3)
                goto L_0x0024
            L_0x050d:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x051f
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x051f:
                java.util.ArrayList r11 = r12.createStringArrayList()
                android.os.IBinder r12 = r12.readStrongBinder()
                com.miot.api.IDeviceHandler r12 = com.miot.api.IDeviceHandler.Stub.asInterface(r12)
                r10.startScan0(r3, r11, r12)
                goto L_0x0024
            L_0x0530:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0542
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x0542:
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.IDeviceHandler r11 = com.miot.api.IDeviceHandler.Stub.asInterface(r11)
                r10.startScan(r3, r11)
                goto L_0x0024
            L_0x054f:
                r12.enforceInterface(r1)
                java.lang.String r11 = r12.readString()
                java.lang.String r12 = r12.readString()
                com.miot.common.device.Device r11 = r10.getDevice0(r11, r12)
                r13.writeNoException()
                if (r11 == 0) goto L_0x056a
                r13.writeInt(r2)
                r11.writeToParcel(r13, r2)
                goto L_0x056d
            L_0x056a:
                r13.writeInt(r0)
            L_0x056d:
                return r2
            L_0x056e:
                r12.enforceInterface(r1)
                java.lang.String r11 = r12.readString()
                com.miot.common.device.Device r11 = r10.getDevice(r11)
                r13.writeNoException()
                if (r11 == 0) goto L_0x0585
                r13.writeInt(r2)
                r11.writeToParcel(r13, r2)
                goto L_0x0588
            L_0x0585:
                r13.writeInt(r0)
            L_0x0588:
                return r2
            L_0x0589:
                r12.enforceInterface(r1)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x059b
                android.os.Parcelable$Creator<com.miot.common.people.People> r11 = com.miot.common.people.People.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r3 = r11
                com.miot.common.people.People r3 = (com.miot.common.people.People) r3
            L_0x059b:
                android.os.IBinder r11 = r12.readStrongBinder()
                com.miot.api.IDeviceHandler r11 = com.miot.api.IDeviceHandler.Stub.asInterface(r11)
                r10.queryWanDevices(r3, r11)
                goto L_0x0024
            L_0x05a8:
                r13.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.api.IDeviceManager.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void addScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler);

    void addTimer(People people, Timer timer, IAddTimerCompletionHandler iAddTimerCompletionHandler);

    void bindWithBindkey(People people, String str, ICommonHandler iCommonHandler);

    void callSmarthomeApi(People people, String str, String str2, ICommonHandler iCommonHandler);

    void cancelShare(People people, Device device, String str, ICompletionHandler iCompletionHandler);

    void checkBindKey(People people, String str, ICommonHandler iCommonHandler);

    void checkPinCode(People people, String str, Device device, ICommonHandler iCommonHandler);

    void disclaimOwnership(People people, Device device, ICompletionHandler iCompletionHandler);

    void editScene(People people, SceneBean sceneBean, ICompletionHandler iCompletionHandler);

    void editTimer(People people, Timer timer, ICompletionHandler iCompletionHandler);

    void enableScene(People people, int i, boolean z, ICompletionHandler iCompletionHandler);

    void getBindKey(People people, ICommonHandler iCommonHandler);

    Device getDevice(String str);

    Device getDevice0(String str, String str2);

    void getUserProfile(People people, String str, IGetUserProfileHandler iGetUserProfileHandler);

    void localPing(String str, ICompletionHandler iCompletionHandler);

    void queryDeviceLog(People people, DeviceLogQueryParams deviceLogQueryParams, IDeviceLogHandler iDeviceLogHandler);

    void queryFirmwareInfo(People people, Device device, IQueryFirmwareHandler iQueryFirmwareHandler);

    void queryScene(People people, int i, ISceneHandler iSceneHandler);

    void querySceneList(People people, IScenesHandler iScenesHandler);

    void querySharedRequests(People people, ISharedRequestsHandler iSharedRequestsHandler);

    void querySharedUsers(People people, Device device, ISharedUsersHandler iSharedUsersHandler);

    void queryTimerList(People people, String str, ITimerHandler iTimerHandler);

    void queryWanDevices(People people, IDeviceHandler iDeviceHandler);

    void removeScene(People people, int i, ICompletionHandler iCompletionHandler);

    void removeTimer(People people, long j, ICompletionHandler iCompletionHandler);

    void renameDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler);

    void replySharedRequest(People people, SharedRequest sharedRequest, ICompletionHandler iCompletionHandler);

    void runScene(People people, int i, ICompletionHandler iCompletionHandler);

    void setPinCode(People people, String str, String str2, Device device, ICommonHandler iCommonHandler);

    void shareDevice(People people, Device device, String str, ICompletionHandler iCompletionHandler);

    void startScan(People people, IDeviceHandler iDeviceHandler);

    void startScan0(People people, List<String> list, IDeviceHandler iDeviceHandler);

    void startUpgradeFirmware(People people, Device device, ICompletionHandler iCompletionHandler);

    void stopScan(People people);

    void takeOwnership(People people, Device device, ICompletionHandler iCompletionHandler);
}
