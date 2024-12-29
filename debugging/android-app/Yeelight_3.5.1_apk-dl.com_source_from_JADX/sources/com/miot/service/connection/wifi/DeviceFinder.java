package com.miot.service.connection.wifi;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.miot.common.people.People;
import com.miot.common.utils.Logger;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.connection.wifi.CheckStatusHandlerTask;
import com.miot.service.connection.wifi.step.ConfigStep;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceFinder {
    private static final int BIND_DEVICE = 104;
    private static final int BIND_TIMEINTERVAL_LEN = 2000;
    private static final int BIND_TIMES = 30;
    private static final int CHECK_TIME_LEN = 50000;
    private static final int SEARCH_TIMEINTERVAL_LEN = 5000;
    private static final String TAG = "DeviceFinder";
    private static final int UPDATE_BIND_STATUS = 105;
    private static final int UPDATE_CONNECTION_LAST = 103;
    private static final int UPDATE_FINISH = 106;
    private static final int UPDATE_PROGRESS = 101;
    private static final int UPDATE_TIMEOUT = 102;
    private int mBindTimes = 0;
    CheckStatusHandlerTask mCheckStatusTask;
    private Context mContext;
    /* access modifiers changed from: private */
    public ScanResult mCurrentScan;
    private String mCurrentScanDid;
    private ConfigStep.DeviceFinderCallback mFinderCallback;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 102) {
                if (i != 104) {
                    if (i == 106) {
                        MiioLocalAPI.stop_smart_config();
                    } else {
                        return;
                    }
                }
                DeviceFinder deviceFinder = DeviceFinder.this;
                deviceFinder.startBindDevice(deviceFinder.mSearchResult);
            }
            DeviceFinder.this.mHandler.removeMessages(101);
            DeviceFinder.this.mHandler.removeMessages(102);
            CheckStatusHandlerTask checkStatusHandlerTask = DeviceFinder.this.mCheckStatusTask;
            if (checkStatusHandlerTask != null) {
                checkStatusHandlerTask.stop();
            }
            DeviceFinder deviceFinder2 = DeviceFinder.this;
            MiotWanDevice miotWanDevice = deviceFinder2.mSearchResult;
            if (miotWanDevice == null) {
                deviceFinder2.mIsScanNewDevice = false;
                deviceFinder2.onDeviceConnectionError();
                return;
            }
            if (miotWanDevice.getOwner() != null) {
                DeviceFinder.this.onDeviceConnectionSuccess();
                return;
            }
            DeviceFinder deviceFinder3 = DeviceFinder.this;
            deviceFinder3.startBindDevice(deviceFinder3.mSearchResult);
        }
    };
    private boolean mIsFinishBinding = false;
    boolean mIsScanNewDevice = false;
    /* access modifiers changed from: private */
    public People mPeople;
    MiotWanDevice mSearchResult;
    private long mStartTimes = 0;
    private HashMap<String, String> mTokenMap = new HashMap<>();
    private Map<String, Boolean> mWifiResultList = new HashMap();

    /* renamed from: com.miot.service.connection.wifi.DeviceFinder$5 */
    static /* synthetic */ class C29495 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$service$connection$wifi$ErrorCode;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            $SwitchMap$com$miot$service$connection$wifi$ErrorCode = iArr;
            try {
                iArr[ErrorCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public DeviceFinder(Context context, People people) {
        this.mContext = context;
        this.mPeople = people;
    }

    /* access modifiers changed from: private */
    public void bindDevice(MiotWanDevice miotWanDevice, String str) {
        MiotCloudApi.takeOwnership(this.mPeople, miotWanDevice.getDeviceId(), miotWanDevice.getModel(), str, new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                new Message().what = 106;
                DeviceFinder.this.onDeviceConnectionSuccess();
            }

            public void onSuccess(JSONObject jSONObject) {
                new Message().what = 106;
                DeviceFinder.this.onDeviceConnectionSuccess();
            }
        });
    }

    private void handleBindingError() {
        onDeviceConnectionSuccess(this.mSearchResult, true);
        this.mIsScanNewDevice = false;
    }

    private void handleBindingSuccess() {
        this.mIsScanNewDevice = false;
        onDeviceConnectionSuccess(this.mSearchResult, true);
    }

    /* access modifiers changed from: private */
    public void onDeviceConnectionError() {
        ConfigStep.DeviceFinderCallback deviceFinderCallback = this.mFinderCallback;
        if (deviceFinderCallback != null) {
            deviceFinderCallback.onDeviceConnectionFailure();
            this.mFinderCallback = null;
        }
    }

    /* access modifiers changed from: private */
    public void onDeviceConnectionSuccess() {
        ConfigStep.DeviceFinderCallback deviceFinderCallback = this.mFinderCallback;
        if (deviceFinderCallback != null) {
            deviceFinderCallback.onDeviceConnectionSuccess(this.mSearchResult);
            this.mFinderCallback = null;
        }
    }

    private void onDeviceConnectionSuccess(MiotWanDevice miotWanDevice, boolean z) {
        ConfigStep.DeviceFinderCallback deviceFinderCallback = this.mFinderCallback;
        if (deviceFinderCallback != null) {
            deviceFinderCallback.onDeviceConnectionSuccess(this.mSearchResult);
            this.mFinderCallback = null;
        }
    }

    private void onDeviceConnectionSuccessBind() {
        SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_CONNECTED_DEVICE, this.mSearchResult);
        ConfigStep.DeviceFinderCallback deviceFinderCallback = this.mFinderCallback;
        if (deviceFinderCallback != null) {
            deviceFinderCallback.onDeviceConnectionBind(this.mSearchResult);
        }
    }

    /* access modifiers changed from: private */
    public List<MiotWanDevice> parse(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("list")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    MiotWanDevice create = MiotWanDevice.create(optJSONArray.getJSONObject(i));
                    if (create != null) {
                        arrayList.add(create);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static JSONObject parse(String str) {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C29495.$SwitchMap$com$miot$service$connection$wifi$ErrorCode[ErrorCode.valueof(jSONObject.optInt("code")).ordinal()] != 1) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            if (optJSONObject == null && (optJSONArray = jSONObject.optJSONArray("result")) != null) {
                optJSONObject = new JSONObject();
                optJSONObject.put("result", optJSONArray);
            }
            return optJSONObject == null ? jSONObject : optJSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void startBindDevice(final MiotWanDevice miotWanDevice) {
        if (this.mTokenMap.containsKey(miotWanDevice.getDeviceId())) {
            bindDevice(miotWanDevice, this.mTokenMap.get(miotWanDevice.getDeviceId()));
        } else {
            MiioLocalAPI.async_get_token(miotWanDevice.getLocalIp(), new MiioLocalRpcResponse() {
                public void onResponse(String str) {
                    JSONObject parse = DeviceFinder.parse(str);
                    if (parse == null) {
                        DeviceFinder.this.onDeviceConnectionSuccess();
                        return;
                    }
                    parse.toString();
                    DeviceFinder.this.bindDevice(miotWanDevice, parse.optString("token"));
                }
            }, 9);
        }
    }

    public void addToken(String str, String str2) {
        this.mTokenMap.put(str, str2);
    }

    public void cleanCallback() {
        this.mFinderCallback = null;
    }

    public boolean getLastConnResult(String str) {
        if (this.mWifiResultList.containsKey(str)) {
            return this.mWifiResultList.get(str).booleanValue();
        }
        return true;
    }

    public String getLastConnectionDid() {
        return this.mCurrentScanDid;
    }

    public String getSavedToken(String str) {
        return this.mTokenMap.get(str);
    }

    public long getScanStartTime() {
        return this.mStartTimes;
    }

    public boolean isFindingNew() {
        return this.mIsScanNewDevice;
    }

    public void removeSavedToken(String str) {
        this.mTokenMap.remove(str);
    }

    public void resetFinder() {
        this.mStartTimes = 0;
        this.mCurrentScan = null;
        this.mCurrentScanDid = null;
    }

    public void scanNewDevice(ConfigStep.DeviceFinderCallback deviceFinderCallback, ScanResult scanResult, String str, Context context) {
        MyLogger.getInstance().log(TAG, "scanNewDevice enter.");
        if (!this.mIsScanNewDevice) {
            this.mSearchResult = null;
            this.mIsScanNewDevice = true;
            this.mCurrentScan = scanResult;
            this.mCurrentScanDid = str;
            this.mFinderCallback = deviceFinderCallback;
            this.mBindTimes = 0;
            this.mStartTimes = System.currentTimeMillis();
            this.mHandler.sendEmptyMessage(101);
            this.mHandler.sendEmptyMessageDelayed(102, 50000);
            CheckStatusHandlerTask checkStatusHandlerTask = this.mCheckStatusTask;
            if (checkStatusHandlerTask != null) {
                checkStatusHandlerTask.stop();
            }
            CheckStatusHandlerTask checkStatusHandlerTask2 = new CheckStatusHandlerTask(false);
            this.mCheckStatusTask = checkStatusHandlerTask2;
            checkStatusHandlerTask2.setCheckStatusRunnable(new CheckStatusHandlerTask.MyRunnable() {
                public void run(Handler handler) {
                    String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
                    String selectedBSSID = SmartConfigDataProvider.getInstance().getSelectedBSSID();
                    String str = DeviceFinder.this.mCurrentScan != null ? DeviceFinder.this.mCurrentScan.BSSID : null;
                    MyLogger instance = MyLogger.getInstance();
                    instance.log(DeviceFinder.TAG, "scanNewDevice, bssid = " + selectedBSSID + ", currentBssid = " + str);
                    if (TextUtils.isEmpty(selectedSSID) || TextUtils.isEmpty(selectedBSSID)) {
                        Logger.m7500e(DeviceFinder.TAG, "wifi bssid is null!");
                        MyLogger.getInstance().log(DeviceFinder.TAG, "wifi bssid is null!");
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ssid", ConnectionUtils.convertToSSID(selectedSSID));
                            jSONObject.put("bssid", selectedBSSID.toUpperCase());
                            if (!TextUtils.isEmpty(str)) {
                                jSONObject.put("NewDeviceMac", str.toUpperCase());
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (DeviceFinder.this.mPeople != null) {
                            MiotCloudApi.getNewConnDeviceList(jSONObject, DeviceFinder.this.mPeople, new MiotCloud.ResponseHandler() {
                                public void onFailure(int i, String str) {
                                }

                                public void onSuccess(JSONObject jSONObject) {
                                    List access$600 = DeviceFinder.this.parse(jSONObject.optJSONObject("result"));
                                    if (access$600.size() == 0) {
                                        MyLogger.getInstance().log(DeviceFinder.TAG, "get none device!");
                                        return;
                                    }
                                    Message message = new Message();
                                    DeviceFinder.this.mSearchResult = (MiotWanDevice) access$600.get(0);
                                    SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_DEVICE_ID, DeviceFinder.this.mSearchResult.getDeviceId());
                                    message.what = DeviceFinder.this.mSearchResult.getOwner() == null ? 104 : 106;
                                    message.arg1 = access$600.size();
                                    DeviceFinder.this.mHandler.sendMessage(message);
                                    DeviceFinder.this.mCheckStatusTask.stop();
                                }
                            });
                        }
                    }
                    DeviceFinder.this.mCheckStatusTask.prepareNextCheckStatus();
                }
            }, 5000);
            this.mCheckStatusTask.start();
        }
    }

    public void setFindingListener(ConfigStep.DeviceFinderCallback deviceFinderCallback) {
        this.mFinderCallback = deviceFinderCallback;
    }

    public void stopScanNewDevice() {
        if (this.mIsScanNewDevice) {
            this.mIsScanNewDevice = false;
            this.mHandler.removeMessages(102);
            MiioLocalAPI.stop_smart_config();
            this.mCheckStatusTask.stop();
        }
    }
}
