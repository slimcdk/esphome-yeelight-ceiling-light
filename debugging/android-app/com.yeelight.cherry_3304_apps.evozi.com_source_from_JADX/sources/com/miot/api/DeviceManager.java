package com.miot.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.miot.api.IAddTimerCompletionHandler;
import com.miot.api.ICommonHandler;
import com.miot.api.ICompletionHandler;
import com.miot.api.IDeviceHandler;
import com.miot.api.IDeviceLogHandler;
import com.miot.api.IGetUserProfileHandler;
import com.miot.api.IQueryFirmwareHandler;
import com.miot.api.ISceneHandler;
import com.miot.api.IScenesHandler;
import com.miot.api.ISharedRequestsHandler;
import com.miot.api.ISharedUsersHandler;
import com.miot.api.ITimerHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.abstractdevice.AbstractDeviceFactory;
import com.miot.common.device.Device;
import com.miot.common.device.DeviceDefinition;
import com.miot.common.device.DiscoveryType;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.devicelog.DeviceLog;
import com.miot.common.devicelog.DeviceLogQueryParams;
import com.miot.common.exception.MiotException;
import com.miot.common.field.FieldList;
import com.miot.common.people.People;
import com.miot.common.people.UserInfo;
import com.miot.common.scene.SceneBean;
import com.miot.common.share.SharedRequest;
import com.miot.common.share.SharedUser;
import com.miot.common.timer.Timer;
import com.miot.common.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceManager {
    /* access modifiers changed from: private */
    public static String TAG = "DeviceManager";
    private IDeviceManager mIDeviceManager;

    public interface AddTimerCompletionHandler {
        void onFailed(int i, String str);

        void onSucceed(long j);
    }

    public interface DeviceHandler {
        void onFailed(int i, String str);

        void onSucceed(List<AbstractDevice> list);
    }

    private static class DeviceListener extends IDeviceHandler.Stub {
        private List<AbstractDevice> mDevices = new ArrayList();
        private DeviceHandler mHandler;
        private boolean mIsAllDeviceListener = false;

        public DeviceListener(DeviceHandler deviceHandler) {
            this.mHandler = deviceHandler;
        }

        public DeviceListener(DeviceHandler deviceHandler, boolean z) {
            this.mHandler = deviceHandler;
            this.mIsAllDeviceListener = z;
        }

        public void onFailed(int i, String str) {
            Logger.m10630e(DeviceManager.TAG, String.format("getRemoteDeviceList onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
            try {
                this.mHandler.onFailed(i, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onSucceed(Device device, int i, int i2) {
            if (device != null) {
                Logger.m10629d(DeviceManager.TAG, String.format("getRemoteDeviceList model=%s address=%s", new Object[]{device.getDeviceModel(), device.getAddress()}));
                if (this.mIsAllDeviceListener) {
                    AbstractDevice abstractDevice = new AbstractDevice();
                    abstractDevice.setDevice(device);
                    this.mDevices.add(abstractDevice);
                } else {
                    AbstractDevice createDevice = AbstractDeviceFactory.createDevice(device, MiotManager.getInstance().getModel(device.getDeviceModel()));
                    if (createDevice != null) {
                        this.mDevices.add(createDevice);
                    }
                }
            }
            if (i2 == 0 || i + 1 == i2) {
                try {
                    this.mHandler.onSucceed(new ArrayList(this.mDevices));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public interface QueryFirmwareHandler {
        void onFailed(int i, String str);

        void onSucceed(MiotFirmware miotFirmware);
    }

    public interface TimerListener {
        void onFailed(int i, String str);

        void onSucceed(List<Timer> list);
    }

    public DeviceManager(IDeviceManager iDeviceManager) {
        this.mIDeviceManager = iDeviceManager;
    }

    public void addTimer(Timer timer, final AddTimerCompletionHandler addTimerCompletionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.addTimer(people, timer, new IAddTimerCompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("addTimer onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                addTimerCompletionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(long j) {
                            Logger.m10629d(DeviceManager.TAG, "addTimer onSucceed");
                            try {
                                addTimerCompletionHandler.onSucceed(j);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void bindWithBindKey(String str, final CommonHandler<String> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.bindWithBindkey(people, str, new ICommonHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(String str) {
                            try {
                                commonHandler.onSucceed(str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void callSmarthomeApi(String str, JSONObject jSONObject, final CommonHandler<String> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    this.mIDeviceManager.callSmarthomeApi(people, str, jSONObject.toString(), new ICommonHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(String str) {
                            try {
                                commonHandler.onSucceed(str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void cancelShare(AbstractDevice abstractDevice, String str, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.cancelShare(people, abstractDevice.getDevice(), str, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("cancelShare onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "cancelShare onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void checkBindKey(String str, final CommonHandler<JSONObject> commonHandler) {
        People people = MiotManager.getPeople();
        if (people != null) {
            try {
                this.mIDeviceManager.checkBindKey(people, str, new ICommonHandler.Stub() {
                    public void onFailed(int i, String str) {
                        CommonHandler commonHandler = commonHandler;
                        if (commonHandler != null) {
                            commonHandler.onFailed(i, str);
                        }
                    }

                    public void onSucceed(String str) {
                        if (TextUtils.isEmpty(str)) {
                            CommonHandler commonHandler = commonHandler;
                            if (commonHandler != null) {
                                commonHandler.onFailed(-1, "empty");
                                return;
                            }
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("result");
                            if (jSONObject == null) {
                                if (commonHandler != null) {
                                    commonHandler.onFailed(-1, "result null");
                                }
                            } else if (commonHandler != null) {
                                commonHandler.onSucceed(jSONObject);
                            }
                        } catch (JSONException e) {
                            CommonHandler commonHandler2 = commonHandler;
                            if (commonHandler2 != null) {
                                commonHandler2.onFailed(-1, e.toString());
                            }
                        }
                    }
                });
            } catch (RemoteException e) {
                if (commonHandler != null) {
                    commonHandler.onFailed(-1, e.toString());
                }
            }
        } else {
            throw new MiotException("account not login");
        }
    }

    public void checkPingCode(String str, Device device, final CommonHandler<Integer> commonHandler) {
        People people = MiotManager.getPeople();
        if (people != null) {
            try {
                this.mIDeviceManager.checkPinCode(people, str, device, new ICommonHandler.Stub() {
                    public void onFailed(int i, String str) {
                        CommonHandler commonHandler = commonHandler;
                        if (commonHandler != null) {
                            commonHandler.onFailed(i, str);
                        }
                    }

                    public void onSucceed(String str) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (!TextUtils.isEmpty(jSONObject.optString("result"))) {
                                int optInt = jSONObject.getJSONObject("result").optInt("ret", -1);
                                if (commonHandler != null) {
                                    commonHandler.onSucceed(Integer.valueOf(optInt));
                                }
                            } else if (commonHandler != null) {
                                commonHandler.onSucceed(0);
                            }
                        } catch (JSONException e) {
                            CommonHandler commonHandler = commonHandler;
                            if (commonHandler != null) {
                                commonHandler.onFailed(-1, e.toString());
                            }
                        }
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
                if (commonHandler != null) {
                    commonHandler.onFailed(-1, e.toString());
                }
            }
        } else {
            throw new MiotException("account not login");
        }
    }

    public void disableScene(int i, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.enableScene(people, i, false, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("enableScene onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "enableScene onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void disclaimOwnership(AbstractDevice abstractDevice, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.disclaimOwnership(people, abstractDevice.getDevice(), new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("disclaimOwnership onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "disclaimOwnership onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void editScene(SceneBean sceneBean, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.editScene(people, sceneBean, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("editScene onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "editScene onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void editTimer(Timer timer, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.editTimer(people, timer, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("editTimer onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "editTimer onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void enableScene(int i, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.enableScene(people, i, true, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("enableScene onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "enableScene onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void getBindKey(final CommonHandler<String> commonHandler) {
        People people = MiotManager.getPeople();
        if (people != null) {
            try {
                this.mIDeviceManager.getBindKey(people, new ICommonHandler.Stub() {
                    public void onFailed(int i, String str) {
                        CommonHandler commonHandler = commonHandler;
                        if (commonHandler != null) {
                            commonHandler.onFailed(i, str);
                        }
                    }

                    public void onSucceed(String str) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                JSONObject jSONObject = new JSONObject(str).getJSONObject("result");
                                if (jSONObject != null) {
                                    String optString = jSONObject.optString("bindkey");
                                    if (commonHandler != null) {
                                        commonHandler.onSucceed(optString);
                                    }
                                } else if (commonHandler != null) {
                                    commonHandler.onFailed(-1, "value null");
                                }
                            } else if (commonHandler != null) {
                                commonHandler.onFailed(-1, "empty");
                            }
                        } catch (JSONException e) {
                            CommonHandler commonHandler = commonHandler;
                            if (commonHandler != null) {
                                commonHandler.onFailed(-1, e.toString());
                            }
                        }
                    }
                });
            } catch (RemoteException e) {
                if (commonHandler != null) {
                    commonHandler.onFailed(-1, e.toString());
                }
            }
        } else {
            throw new MiotException("account not login");
        }
    }

    public AbstractDevice getDevice(String str) {
        IDeviceManager iDeviceManager = this.mIDeviceManager;
        if (iDeviceManager != null) {
            try {
                Device device = iDeviceManager.getDevice(str);
                if (device != null) {
                    return AbstractDeviceFactory.createDevice(device, MiotManager.getInstance().getModel(device.getDeviceModel()));
                }
                return null;
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public AbstractDevice getDevice(String str, String str2) {
        IDeviceManager iDeviceManager = this.mIDeviceManager;
        if (iDeviceManager != null) {
            try {
                Device device0 = iDeviceManager.getDevice0(str, str2);
                if (device0 != null) {
                    return AbstractDeviceFactory.createDevice(device0, MiotManager.getInstance().getModel(device0.getDeviceModel()));
                }
                return null;
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void getRemoteAllDeviceList(DeviceHandler deviceHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryWanDevices(people, new DeviceListener(deviceHandler, true));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void getRemoteDeviceList(DeviceHandler deviceHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryWanDevices(people, new DeviceListener(deviceHandler, false));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void getUserProfile(String str, final CommonHandler<UserInfo> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.getUserProfile(people, str, new IGetUserProfileHandler.Stub() {
                        public void onFailed(int i, String str) {
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(UserInfo userInfo) {
                            try {
                                commonHandler.onSucceed(userInfo);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void localPing(String str, ICompletionHandler iCompletionHandler) {
        try {
            this.mIDeviceManager.localPing(str, iCompletionHandler);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void modifyDevice(AbstractDevice abstractDevice, FieldList fieldList, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.renameDevice(people, abstractDevice.getDevice(), (String) fieldList.getValue(DeviceDefinition.Name), new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("modifyDevice onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "modifyDevice onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void queryDeviceLog(DeviceLogQueryParams deviceLogQueryParams, final CommonHandler<List<DeviceLog>> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryDeviceLog(people, deviceLogQueryParams, new IDeviceLogHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("getPowerConsumption onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(List<DeviceLog> list) {
                            Logger.m10629d(DeviceManager.TAG, "getPowerConsumption onSucceed");
                            try {
                                commonHandler.onSucceed(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void queryFirmwareInfo(final AbstractDevice abstractDevice, final QueryFirmwareHandler queryFirmwareHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryFirmwareInfo(people, abstractDevice.getDevice(), new IQueryFirmwareHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryFirmwareInfo onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                queryFirmwareHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(MiotFirmware miotFirmware) {
                            Logger.m10629d(DeviceManager.TAG, "queryFirmwareInfo onSucceed");
                            abstractDevice.setMiotFirmware(miotFirmware);
                            try {
                                queryFirmwareHandler.onSucceed(miotFirmware);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void queryFirmwareUpgradeInfo(AbstractDevice abstractDevice, final QueryFirmwareHandler queryFirmwareHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryFirmwareInfo(people, abstractDevice.getDevice(), new IQueryFirmwareHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryFirmwareUpgradeInfo onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                queryFirmwareHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(MiotFirmware miotFirmware) {
                            Logger.m10629d(DeviceManager.TAG, "queryFirmwareUpgradeInfo onSucceed");
                            try {
                                queryFirmwareHandler.onSucceed(miotFirmware);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void queryScene(int i, final CommonHandler<SceneBean> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryScene(people, i, new ISceneHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryScene onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(SceneBean sceneBean) {
                            Logger.m10629d(DeviceManager.TAG, "queryScene onSucceed");
                            try {
                                commonHandler.onSucceed(sceneBean);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void querySceneList(final CommonHandler<List<SceneBean>> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.querySceneList(people, new IScenesHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryTimerList onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(List<SceneBean> list) {
                            Logger.m10629d(DeviceManager.TAG, "queryTimerList onSucceed");
                            try {
                                commonHandler.onSucceed(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void querySharedRequests(final CommonHandler<List<SharedRequest>> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.querySharedRequests(people, new ISharedRequestsHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("querySharedRequests onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(List<SharedRequest> list) {
                            Logger.m10629d(DeviceManager.TAG, "querySharedRequests onSucceed");
                            try {
                                commonHandler.onSucceed(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void querySharedUsers(AbstractDevice abstractDevice, final CommonHandler<List<SharedUser>> commonHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.querySharedUsers(people, abstractDevice.getDevice(), new ISharedUsersHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryShareUsers onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                commonHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(List<SharedUser> list) {
                            Logger.m10629d(DeviceManager.TAG, "queryShareUsers onSucceed");
                            try {
                                commonHandler.onSucceed(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void queryTimerList(String str, final TimerListener timerListener) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.queryTimerList(people, str, new ITimerHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("queryTimerList onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                timerListener.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed(List<Timer> list) {
                            Logger.m10629d(DeviceManager.TAG, "queryTimerList onSucceed");
                            try {
                                timerListener.onSucceed(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void removeTimer(long j, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.removeTimer(people, j, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("removeTimer onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "removeTimer onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void renameDevice(AbstractDevice abstractDevice, String str, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.renameDevice(people, abstractDevice.getDevice(), str, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("renameDevice onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "renameDevice onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void replySharedRequest(SharedRequest sharedRequest, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.replySharedRequest(people, sharedRequest, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("replySharedRequest onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "replySharedRequest onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void runScene(int i, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.runScene(people, i, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("runScene onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "runScene onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void setIDeviceManager(IDeviceManager iDeviceManager) {
        this.mIDeviceManager = iDeviceManager;
    }

    public void setPinCode(String str, String str2, Device device, final CommonHandler<Integer> commonHandler) {
        People people = MiotManager.getPeople();
        if (people != null) {
            try {
                this.mIDeviceManager.setPinCode(people, str, str2, device, new ICommonHandler.Stub() {
                    public void onFailed(int i, String str) {
                        CommonHandler commonHandler = commonHandler;
                        if (commonHandler != null) {
                            commonHandler.onFailed(i, str);
                        }
                    }

                    public void onSucceed(String str) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            if (!TextUtils.isEmpty(jSONObject.optString("result"))) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                                if (jSONObject2 != null) {
                                    int optInt = jSONObject2.optInt("ret", -1);
                                    if (commonHandler != null) {
                                        commonHandler.onSucceed(Integer.valueOf(optInt));
                                    }
                                } else if (commonHandler != null) {
                                    commonHandler.onFailed(-1, "result null");
                                }
                            } else if (commonHandler != null) {
                                commonHandler.onSucceed(0);
                            }
                        } catch (JSONException e) {
                            CommonHandler commonHandler = commonHandler;
                            if (commonHandler != null) {
                                commonHandler.onFailed(-1, e.toString());
                            }
                        }
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
                if (commonHandler != null) {
                    commonHandler.onFailed(-1, e.toString());
                }
            }
        } else {
            throw new MiotException("account not login");
        }
    }

    public void shareDevice(AbstractDevice abstractDevice, String str, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.shareDevice(people, abstractDevice.getDevice(), str, new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("shareDevice onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "shareDevice onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void startScan(DeviceHandler deviceHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.startScan(people, new DeviceListener(deviceHandler));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    @Deprecated
    public void startScan(List<DiscoveryType> list, DeviceHandler deviceHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                ArrayList arrayList = new ArrayList();
                for (DiscoveryType discoveryType : list) {
                    arrayList.add(discoveryType.toString());
                }
                try {
                    this.mIDeviceManager.startScan0(people, arrayList, new DeviceListener(deviceHandler));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void startUpgradeFirmware(final AbstractDevice abstractDevice, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.startUpgradeFirmware(people, abstractDevice.getDevice(), new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("upgradeFirmware onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "upgradeFirmware onSucceed");
                            abstractDevice.setMiotFirmware((MiotFirmware) null);
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void stopScan() {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.stopScan(people);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void takeOwnership(AbstractDevice abstractDevice, final CompletionHandler completionHandler) {
        if (this.mIDeviceManager != null) {
            People people = MiotManager.getPeople();
            if (people != null) {
                try {
                    this.mIDeviceManager.takeOwnership(people, abstractDevice.getDevice(), new ICompletionHandler.Stub() {
                        public void onFailed(int i, String str) {
                            Logger.m10630e(DeviceManager.TAG, String.format("takeOwnership onFailed: %d %s", new Object[]{Integer.valueOf(i), str}));
                            try {
                                completionHandler.onFailed(i, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        public void onSucceed() {
                            Logger.m10629d(DeviceManager.TAG, "takeOwnership onSucceed");
                            try {
                                completionHandler.onSucceed();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new MiotException("account not login");
            }
        } else {
            throw new MiotException("service not bound");
        }
    }
}
