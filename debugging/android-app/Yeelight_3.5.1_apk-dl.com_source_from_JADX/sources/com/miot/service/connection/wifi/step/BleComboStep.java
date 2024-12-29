package com.miot.service.connection.wifi.step;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.miot.bluetooth.MiotBleClient;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.service.C2875R;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.connection.bluetooth.BleComboConnector;
import com.miot.service.connection.bluetooth.ComboConnectResponse;
import com.miot.service.connection.bluetooth.ComboRestoreResponse;
import com.miot.service.connection.bluetooth.IBleComboConnector;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.connection.wifi.DeviceFinder;
import com.miot.service.connection.wifi.ErrorCode;
import com.miot.service.connection.wifi.QConnectCallback;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.ConfigStep;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.apache.commons.p194io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BleComboStep extends ConfigStep implements ComboConnectResponse {
    private static final int BLE_CONNECT_TIMEOUT = 62000;
    private static final int BLE_NOTIFY_TIMEOUT = 30000;
    private static final int CONNECT_INDEX = 0;
    private static final int CONNECT_TIME = 90000;
    private static final int GET_NEW_DEVICE_INDEX = 2;
    private static final int GET_NEW_DEVICE_TIME = 60000;
    private static final int SEND_SSID_AND_PASSWD_INDEX = 1;
    private static final int SEND_SSID_AND_PASSWD_TIME = 40000;
    /* access modifiers changed from: private */
    public IBleComboConnector mBleComboConnector;
    private BroadcastReceiver mBluetoothReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra("extra.mac");
                int intExtra = intent.getIntExtra("extra.status", -1);
                if (TextUtils.equals(stringExtra, BleComboStep.this.mComboAddress)) {
                    BluetoothLog.m7332v("BleComboStep bluetooth connect status = " + intExtra);
                }
                if ("action.connect_status_changed".equalsIgnoreCase(action) && TextUtils.equals(stringExtra, BleComboStep.this.mComboAddress) && intExtra == 32) {
                    BluetoothLog.m7332v("BleComboStep disconnect mac = " + BleComboStep.this.mComboAddress);
                    boolean unused = BleComboStep.this.mUseBleConfig = false;
                    BleComboStep.this.getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                    BleComboStep.this.startUpdateDeviceState(0);
                }
            }
        }
    };
    private ConfigStep.DeviceFinderCallback mCallback = new ConfigStep.DeviceFinderCallback() {
        public void onDeviceConnectionBind(MiotWanDevice miotWanDevice) {
            BluetoothLog.m7333w("BleComboStep DeviceFinderCallback.onDeviceConnectionBind");
            int unused = BleComboStep.this.mCurrentIndex = 2;
            BleComboStep.this.onCurrentIndexSuccess(2);
        }

        public void onDeviceConnectionFailure() {
            BluetoothLog.m7333w("BleComboStep DeviceFinderCallback.onDeviceConnectionFailure");
        }

        public void onDeviceConnectionSuccess(MiotWanDevice miotWanDevice) {
            BluetoothLog.m7333w("BleComboStep DeviceFinderCallback.onDeviceConnectionSuccess");
            int unused = BleComboStep.this.mCurrentIndex = 2;
            BleComboStep.this.onCurrentIndexSuccess(2);
        }
    };
    /* access modifiers changed from: private */
    public String mComboAddress;
    private ArrayList<ConfigStep.ConfigTime> mConfigStageList = new ArrayList<>();
    /* access modifiers changed from: private */
    public int mCurrentIndex;
    /* access modifiers changed from: private */
    public DeviceFinder mDeviceFinder = new DeviceFinder(this.mContext, (People) SmartConfigDataProvider.getInstance().get("people"));
    /* access modifiers changed from: private */
    public long mDid;
    private Handler mDummyHandler;
    private int mFindDeviceTime = 0;
    private int mId;
    private int mNotifyStatus;
    /* access modifiers changed from: private */
    public ScanResult mScanResult;
    private int mSendPasswdTime = 0;
    /* access modifiers changed from: private */
    public String mToken;
    /* access modifiers changed from: private */
    public boolean mUseBleConfig = true;

    /* renamed from: com.miot.service.connection.wifi.step.BleComboStep$10 */
    static /* synthetic */ class C405510 {
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

    BleComboStep() {
    }

    static /* synthetic */ int access$508(BleComboStep bleComboStep) {
        int i = bleComboStep.mSendPasswdTime;
        bleComboStep.mSendPasswdTime = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void getBindkey() {
        if (TextUtils.isEmpty(this.mBindkey)) {
            MiotCloudApi.getBindKey(ServiceManager.getInstance().getPeople(), new JSONObject(), new MiotCloud.ResponseHandler() {
                public void onFailure(int i, String str) {
                    BluetoothLog.m7333w("BleComboStep.getBindKey code: " + i + ", des:" + str);
                    if (BleComboStep.this.getHandler() != null) {
                        BleComboStep.this.getHandler().postDelayed(new Runnable() {
                            public void run() {
                                BleComboStep.this.getBindkey();
                            }
                        }, 2000);
                    }
                }

                public void onSuccess(JSONObject jSONObject) {
                    BluetoothLog.m7333w("BleComboStep.getBindKey: " + jSONObject);
                    if (jSONObject != null) {
                        try {
                            BleComboStep.this.mBindkey = jSONObject.optJSONObject("result").optString("bindkey");
                        } catch (Exception unused) {
                        }
                    }
                    ((Activity) BleComboStep.this.mContext).runOnUiThread(new Runnable() {
                        public void run() {
                            if (BleComboStep.this.mUseBleConfig) {
                                BleComboStep.this.startConnectToBle();
                            } else {
                                BleComboStep.this.startConnectToDeviceAp();
                            }
                        }
                    });
                }
            });
        } else if (this.mUseBleConfig) {
            startConnectToBle();
        } else {
            startConnectToDeviceAp();
        }
    }

    private String getNotifyStatusString(int i) {
        if (i == 0) {
            return "NOTIFY_START";
        }
        if (i == 1) {
            return "connecting router";
        }
        if (i == 2) {
            return "router connected";
        }
        if (i == 3) {
            return "server connected";
        }
        if (i == 4) {
            return "unknown error";
        }
        if (i == 5) {
            return "pwd error";
        }
        return "unknown " + i;
    }

    private void retryComboConnect() {
        BluetoothLog.m7332v("BleComboStep.retryComboConnect");
        this.mNotifyStatus = 0;
        this.mUseBleConfig = true;
        this.mBleComboConnector.retryConnect();
        getHandler().removeMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
        getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
        this.mBleComboConnector.openComboNotify();
        getHandler().sendEmptyMessageDelayed(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 30000);
    }

    /* access modifiers changed from: private */
    public void startUpdateDeviceState(long j) {
        if (getHandler() != null) {
            getHandler().sendEmptyMessageDelayed(112, j);
        }
    }

    public ArrayList<ConfigStep.ConfigTime> getAllConfigStages() {
        this.mConfigStageList.clear();
        ConfigStep.ConfigTime configTime = new ConfigStep.ConfigTime();
        configTime.index = 0;
        configTime.time = 90000;
        this.mConfigStageList.add(configTime);
        ConfigStep.ConfigTime configTime2 = new ConfigStep.ConfigTime();
        configTime2.index = 1;
        configTime2.time = 40000;
        this.mConfigStageList.add(configTime2);
        ConfigStep.ConfigTime configTime3 = new ConfigStep.ConfigTime();
        configTime3.index = 2;
        configTime3.time = 60000;
        this.mConfigStageList.add(configTime3);
        return this.mConfigStageList;
    }

    public int getCurrentStageIndex() {
        int i = this.mCurrentIndex;
        if (i != 0) {
            if (i == 1) {
                BluetoothLog.m7333w("BleComboStep.getCurrentStageIndex mCurrentIndex = SEND_SSID_AND_PASSWD_INDEX, mUseBleConfig = " + this.mUseBleConfig);
                if (!this.mUseBleConfig) {
                    String str = ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID;
                    WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
                    if (connectionInfo != null && ConnectionUtils.isEqualWifi(str, connectionInfo.getSSID())) {
                        return ((Boolean) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_SEND_PASSWD_SUCCESS, Boolean.FALSE)).booleanValue() ? 2 : 1;
                    }
                    this.mCurrentIndex = 0;
                    return 0;
                }
            }
            return this.mCurrentIndex;
        }
        BluetoothLog.m7333w("BleComboStep.getCurrentStageIndex mCurrentIndex = CONNECT_INDEX, mUseBleConfig = " + this.mUseBleConfig);
        if (this.mUseBleConfig) {
            return 0;
        }
        String str2 = ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID;
        WifiInfo connectionInfo2 = this.mWifiManager.getConnectionInfo();
        return (connectionInfo2 == null || !ConnectionUtils.isEqualWifi(str2, connectionInfo2.getSSID())) ? 0 : 1;
    }

    public String getGatewayAddr() {
        Context context = this.mContext;
        return context == null ? "" : long2Ip((long) ((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway);
    }

    public Handler getHandler() {
        Handler handler = super.getHandler();
        return handler != null ? handler : this.mDummyHandler;
    }

    public SmartConfigStep.Step getStep() {
        return null;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 101) {
            BluetoothLog.m7333w("BleComboStep.handleMessage NETWORK_STATE_CHANGED + use ble:" + this.mUseBleConfig);
            if (!this.mUseBleConfig) {
                NetworkInfo networkInfo = (NetworkInfo) message.obj;
                NetworkInfo.DetailedState detailedState = networkInfo.getDetailedState();
                WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
                if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getSSID()) && !connectionInfo.getSSID().contains("<unknown ssid>")) {
                    MyLogger instance = MyLogger.getInstance();
                    StringBuilder sb = new StringBuilder();
                    sb.append(detailedState.toString());
                    sb.append(", ");
                    String str = "";
                    sb.append(connectionInfo.getSSID() != null ? connectionInfo.getSSID() : str);
                    sb.append(", ");
                    sb.append(networkInfo.getExtraInfo() != null ? networkInfo.getExtraInfo() : str);
                    sb.append(", ");
                    if (networkInfo.getReason() != null) {
                        str = networkInfo.getReason();
                    }
                    sb.append(str);
                    instance.log("BleComboStep WifiStateConfig", sb.toString());
                    if (detailedState == NetworkInfo.DetailedState.CONNECTED && networkInfo.isConnected() && ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID) && this.mCurrentIndex == 0 && !this.mIsPaused) {
                        onApConnected();
                    }
                }
            }
        } else if (i != 112) {
            if (i == 123) {
                BluetoothLog.m7333w("BleComboStep.handleMessage MSG_RECONNECT_DEVICE_AP");
                this.mUseBleConfig = false;
            } else if (i == 125) {
                BluetoothLog.m7333w("BleComboStep.handleMessage MSG_CONNECT_BLE_TIME_OUT");
                this.mUseBleConfig = false;
                MiotBleClient.getInstance().stopSearch();
                try {
                    this.mContext.unregisterReceiver(this.mBluetoothReceiver);
                } catch (Exception unused) {
                }
                this.mBleComboConnector.release();
            } else if (i == 127) {
                BluetoothLog.m7333w("BleComboStep.handleMessage MSG_BLE_NOTIFY_TIME_OUT, current notifyStatus = " + this.mNotifyStatus);
                getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                int i2 = this.mNotifyStatus;
                if (i2 != 0) {
                    if (i2 == 1) {
                        triggerTimeoutNow();
                        return;
                    } else if (i2 == 2) {
                        this.mUseBleConfig = false;
                        this.mBleComboConnector.closeComboNotify();
                        startUpdateDeviceState(0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 114) {
                BluetoothLog.m7333w("BleComboStep.handleMessage MSG_SEND_DEVICE_MSG");
                startConnectionAsso();
                return;
            } else if (i != 115) {
                super.handleMessage(message);
                return;
            } else {
                BluetoothLog.m7333w("BleComboStep.handleMessage MSG_DISCONNECT_TIME_OUT");
                onStopConnection();
                return;
            }
            startConnectToDeviceAp();
        } else {
            BluetoothLog.m7333w("BleComboStep.handleMessage MSG_UPDATE_DEVICE_STATE");
            if (getHandler() != null) {
                getHandler().removeMessages(112);
                getHandler().removeMessages(114);
            }
            this.mUseBleConfig = false;
            if (this.mCurrentIndex == 1) {
                onStopConnection();
                startSearchNewDevice();
                onCurrentIndexSuccess(1);
                this.mCurrentIndex = 2;
            }
        }
    }

    public String long2Ip(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j & 255)));
        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
        stringBuffer.append(String.valueOf((int) ((j >> 8) & 255)));
        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
        stringBuffer.append(String.valueOf((int) ((j >> 16) & 255)));
        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
        stringBuffer.append(String.valueOf((int) ((j >> 24) & 255)));
        return stringBuffer.toString();
    }

    public void onApConnected() {
        MyLogger.getInstance().log("BleComboStep", "onApConnected, go to send wifi config.");
        if (getHandler() != null) {
            getHandler().postDelayed(new Runnable() {
                public void run() {
                    if (BleComboStep.this.mCurrentIndex == 0) {
                        BleComboStep bleComboStep = BleComboStep.this;
                        if (bleComboStep.isDeviceApConnected(bleComboStep.mScanResult)) {
                            BleComboStep bleComboStep2 = BleComboStep.this;
                            bleComboStep2.onCurrentIndexSuccess(bleComboStep2.mCurrentIndex);
                            BleComboStep.this.getHandler().removeMessages(123);
                            BleComboStep.this.startConnectionAsso();
                            int unused = BleComboStep.this.mCurrentIndex = 1;
                            BleComboStep.access$508(BleComboStep.this);
                        }
                    }
                }
            }, 2000);
        }
    }

    public void onCreateStep(Context context) {
        this.mDummyHandler = new Handler(Looper.getMainLooper());
        super.onCreateStep(context);
    }

    public void onFinishStep() {
        super.onFinishStep();
        try {
            this.mContext.unregisterReceiver(this.mBluetoothReceiver);
        } catch (Exception unused) {
        }
        Handler handler = this.mDummyHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        MiotBleClient.getInstance().stopSearch();
        if (this.mBleComboConnector != null) {
            boolean booleanValue = ((Boolean) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_RESTORE_WIFI, Boolean.FALSE)).booleanValue();
            BluetoothLog.m7332v(String.format("wifi restore ? -> %b", new Object[]{Boolean.valueOf(booleanValue)}));
            if (booleanValue) {
                this.mBleComboConnector.restore(new ComboRestoreResponse() {
                    public void onResponse(int i) {
                        BleComboStep.this.mBleComboConnector.release();
                    }
                });
            } else {
                this.mBleComboConnector.release();
            }
        }
    }

    public void onNotifyStatus(int i) {
        this.mNotifyStatus = i;
        BluetoothLog.m7332v("onNotifyStatus " + getNotifyStatusString(i));
        if (this.mUseBleConfig && getHandler().hasMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT)) {
            if (i == 3) {
                try {
                    this.mContext.unregisterReceiver(this.mBluetoothReceiver);
                } catch (Exception unused) {
                }
                this.mBleComboConnector.release();
                getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                startUpdateDeviceState(0);
            } else if (i == 4 || i == 5) {
                try {
                    this.mContext.unregisterReceiver(this.mBluetoothReceiver);
                } catch (Exception unused2) {
                }
                getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                triggerTimeoutNow();
            }
        }
    }

    public void onResumeStep() {
        this.mUseBleConfig = true;
        this.mCurrentIndex = 0;
        super.onResumeStep();
    }

    public void onSearchComboAddress(String str) {
        BluetoothLog.m7333w(String.format("BleComboStep.onSearchComboAddress, mac = %s", new Object[]{str}));
        if (!TextUtils.isEmpty(str)) {
            this.mComboAddress = str;
            this.mBleComboConnector.sendSSIDAndPassWd(this.mBindkey);
        } else if (getHandler().hasMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT)) {
            getHandler().removeMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
            getHandler().sendEmptyMessage(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
        }
    }

    public void onSendSSIDAndPassWd(int i) {
        BluetoothLog.m7333w("BleComboStep.onSendSSIDAndPassWd " + i);
        if (i != 0) {
            Handler handler = getHandler();
            if (handler != null && handler.hasMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT)) {
                handler.removeMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
                handler.sendEmptyMessage(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
            }
        } else if (this.mUseBleConfig && !this.mIsFinished) {
            this.mContext.registerReceiver(this.mBluetoothReceiver, new IntentFilter("action.connect_status_changed"));
            getHandler().removeMessages(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT);
            this.mBleComboConnector.openComboNotify();
            onCurrentIndexSuccess(this.mCurrentIndex);
            startConnection(1);
            getHandler().sendEmptyMessageDelayed(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 30000);
        }
    }

    public SmartConfigStep.Step onStageTimeOut(int i) {
        QConnectCallback qConnectCallback;
        ConnectivityManager.NetworkCallback networkCallback;
        if (i != 0) {
            if (i == 1) {
                BluetoothLog.m7333w("BleComboStep.onStageTimeOut SEND_SSID_AND_PASSWD_INDEX, mUseBleConfig = " + this.mUseBleConfig);
                if (!this.mUseBleConfig) {
                    return SmartConfigStep.Step.STEP_SEND_ROUTER_INFO_ERROR;
                }
                int i2 = this.mNotifyStatus;
                if (i2 == 0) {
                    return SmartConfigStep.Step.STEP_BLE_ERROR;
                }
                if (i2 == 1) {
                    BluetoothLog.m7333w(">>> current notifyStatus == NOTIFY_CONNECTING_ROUTER");
                    return SmartConfigStep.Step.STEP_BLE_ERROR;
                } else if (i2 == 2) {
                    BluetoothLog.m7333w(">>> current notifyStatus == NOTIFY_CONNECTING_ROUTER");
                    return SmartConfigStep.Step.STEP_BLE_ERROR;
                } else if (i2 == 5) {
                    BluetoothLog.m7333w(">>> current notifyStatus == NOTIFY_AUTHENTICATION_ERROR");
                    return SmartConfigStep.Step.STEP_BLE_PWD_ERROR;
                } else if (i2 == 4) {
                    BluetoothLog.m7333w(">>> current notifyStatus == NOTIFY_UNKNONW_ERROR");
                    return SmartConfigStep.Step.STEP_BLE_ERROR;
                } else if (i2 == 3) {
                    return SmartConfigStep.Step.STEP_BLE_ERROR;
                } else {
                    BluetoothLog.m7333w(String.format(">>> Unknown notifyStatus = %d", new Object[]{Integer.valueOf(i2)}));
                }
            } else if (i == 2) {
                return SmartConfigStep.Step.STEP_FIND_DEVICE_FAILED;
            }
            return null;
        }
        BluetoothLog.m7333w("BleComboStep.onStageTimeOut CONNECT_INDEX, mUseBleConfig = " + this.mUseBleConfig);
        if (this.mUseBleConfig) {
            return SmartConfigStep.Step.STEP_CONNECT_AP_ERROR;
        }
        if (Build.VERSION.SDK_INT >= 29 && ConnectionUtils.isTargetSDKVersionAfter29(this.mContext) && (qConnectCallback = this.mApNetworkCallback) != null && (networkCallback = qConnectCallback.callback) != null) {
            this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
            this.mApNetworkCallback.callback = null;
            this.mApNetworkCallback = null;
        }
        getHandler().removeMessages(123);
        return SmartConfigStep.Step.STEP_CONNECT_AP_ERROR;
    }

    public void onStopConnection() {
        QConnectCallback qConnectCallback;
        ConnectivityManager.NetworkCallback networkCallback;
        BluetoothLog.m7333w("BleComboStep.onStopConnection");
        getHandler().removeMessages(112);
        getHandler().removeMessages(114);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            this.mConnectivityManager.bindProcessToNetwork((Network) null);
        }
        if (!this.mUseBleConfig) {
            String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
            String selectedApPasswd = SmartConfigDataProvider.getInstance().getSelectedApPasswd();
            String selectedAPCapabilities = SmartConfigDataProvider.getInstance().getSelectedAPCapabilities();
            if (i >= 29 && ConnectionUtils.isTargetSDKVersionAfter29(this.mContext) && (qConnectCallback = this.mApNetworkCallback) != null && (networkCallback = qConnectCallback.callback) != null) {
                this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
                this.mApNetworkCallback.callback = null;
                this.mApNetworkCallback = null;
            }
            ConnectionUtils.connectToAP(this.mContext, this.mConnectivityManager, this.mWifiManager, selectedSSID, selectedApPasswd, (String) null, selectedAPCapabilities, (QConnectCallback) null, false, true);
        }
    }

    public JSONObject parseRpcResponse(String str) {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C405510.$SwitchMap$com$miot$service$connection$wifi$ErrorCode[ErrorCode.valueof(jSONObject.optInt("code")).ordinal()] != 1) {
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

    public void setMainTitle(TextView textView) {
        int i;
        int i2 = this.mCurrentIndex;
        if (i2 == 0 || i2 == 1) {
            i = C2875R.string.smart_config_device_connecting;
        } else if (i2 == 2) {
            i = C2875R.string.smart_config_update_connection_state;
        } else {
            return;
        }
        textView.setText(i);
    }

    public void setMiioRouter(String str, String str2, Class cls) {
        People people = (People) SmartConfigDataProvider.getInstance().get("people");
        if (people == null) {
            BluetoothLog.m7329e(String.format("setMiioRouter people == null", new Object[0]));
            finishSmartConfig(true);
            return;
        }
        long j = 0;
        try {
            j = Long.valueOf(people.getUserId()).longValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.mId);
            jSONObject.put("method", "miIO.config_router");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ssid", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("passwd", str2);
            jSONObject2.put("uid", j);
            jSONObject2.put("bind_key", this.mBindkey);
            AppConfiguration.Locale locale = ServiceManager.getInstance().getAppConfig().getLocale();
            if (!(locale == null || locale == AppConfiguration.Locale.cn)) {
                jSONObject2.put("country_domain", locale.toString());
            }
            jSONObject2.put("tz", new GregorianCalendar().getTimeZone().getID());
            jSONObject2.put(SmartConfigDataProvider.KEY_TIME_GMT_OFFSET, (Integer) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_TIME_GMT_OFFSET, 480));
            jSONObject.put("params", jSONObject2);
        } catch (JSONException unused) {
        }
        String gatewayAddr = getGatewayAddr();
        if (!TextUtils.isEmpty(gatewayAddr)) {
            MiioLocalAPI.async_get_token(gatewayAddr, new MiioLocalRpcResponse() {
                public void onResponse(final String str) {
                    BluetoothLog.m7333w("RPC response: " + str);
                    if (BleComboStep.this.getHandler() != null) {
                        BleComboStep.this.getHandler().post(new Runnable() {
                            public void run() {
                                JSONObject parseRpcResponse = BleComboStep.this.parseRpcResponse(str);
                                if (parseRpcResponse != null) {
                                    long unused = BleComboStep.this.mDid = Long.valueOf(parseRpcResponse.optString("did")).longValue();
                                    String unused2 = BleComboStep.this.mToken = parseRpcResponse.optString("token");
                                    BleComboStep.this.mDeviceFinder.addToken(String.valueOf(BleComboStep.this.mDid), BleComboStep.this.mToken);
                                    String gatewayAddr = BleComboStep.this.getGatewayAddr();
                                    if (!TextUtils.isEmpty(gatewayAddr)) {
                                        MiioLocalAPI.async_rpc(gatewayAddr, jSONObject.toString(), BleComboStep.this.mDid, BleComboStep.this.mToken, new MiioLocalRpcResponse() {
                                            public void onResponse(String str) {
                                                BluetoothLog.m7333w("BleComboStep. setMiioRouter result: " + str);
                                                if (BleComboStep.this.parseRpcResponse(str) == null && BleComboStep.this.getHandler() != null) {
                                                    BleComboStep.this.getHandler().sendEmptyMessageDelayed(114, 1000);
                                                }
                                                if (BleComboStep.this.getHandler() != null) {
                                                    BleComboStep.this.getHandler().sendEmptyMessageDelayed(112, 1000);
                                                }
                                            }
                                        });
                                    }
                                } else if (BleComboStep.this.getHandler() != null) {
                                    BleComboStep.this.getHandler().sendEmptyMessageDelayed(114, 1000);
                                }
                            }
                        });
                    }
                }
            }, 9);
        }
    }

    public void setSubMainTitle(TextView textView) {
        int i;
        int i2 = this.mCurrentIndex;
        if (i2 == 0) {
            i = C2875R.string.smart_config_ap_connect_sub_title;
        } else if (i2 == 1 || i2 == 2) {
            i = C2875R.string.smart_config_connecting_sub_title;
        } else {
            return;
        }
        textView.setText(i);
    }

    public void startConnectToBle() {
        BluetoothLog.m7333w("BleComboStep.startConnectToBle");
        this.mCurrentIndex = 0;
        if (this.mBleComboConnector == null) {
            this.mBleComboConnector = new BleComboConnector(this);
        }
        this.mBleComboConnector.searchComboAddress(this.mScanResult);
        getHandler().sendEmptyMessageDelayed(SmartConfigStep.MSG_CONNECT_BLE_TIME_OUT, 20000);
        this.mNextButton.setVisibility(8);
    }

    public void startConnectToDeviceAp() {
        BluetoothLog.m7333w("BleComboStep.startConnectToDeviceAp");
        WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
        if (TextUtils.isEmpty(connectionInfo.getSSID()) || !ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), this.mScanResult.SSID) || connectionInfo.getSupplicantState() != SupplicantState.COMPLETED) {
            QConnectCallback qConnectCallback = this.mApNetworkCallback;
            if (qConnectCallback == null || qConnectCallback.callback == null) {
                C40637 r8 = new QConnectCallback() {
                    public void onAvailable(Network network) {
                        super.onAvailable(network);
                        BluetoothLog.m7333w("connectToAP ok: " + BleComboStep.this.mScanResult.SSID);
                    }

                    public void onLost(Network network) {
                        super.onLost(network);
                        BluetoothLog.m7333w("connecttoAp onLost ");
                        if (BleComboStep.this.mCurrentIndex == 0) {
                            BleComboStep.this.getHandler().post(new Runnable() {
                                public void run() {
                                    BleComboStep.this.triggerTimeoutNow();
                                }
                            });
                        }
                    }

                    public void onUnavailable() {
                        super.onUnavailable();
                        BluetoothLog.m7333w("connectToAP onUnavailable!");
                        if (BleComboStep.this.mCurrentIndex == 0) {
                            BleComboStep.this.getHandler().post(new Runnable() {
                                public void run() {
                                    BleComboStep.this.triggerTimeoutNow();
                                }
                            });
                        }
                    }
                };
                this.mApNetworkCallback = r8;
                Context context = this.mContext;
                ConnectivityManager connectivityManager = this.mConnectivityManager;
                WifiManager wifiManager = this.mWifiManager;
                ScanResult scanResult = this.mScanResult;
                ConnectionUtils.connectToAP(context, connectivityManager, wifiManager, scanResult.SSID, "", scanResult.BSSID, scanResult.capabilities, r8, true, false);
                getHandler().sendEmptyMessageDelayed(123, 15000);
            } else {
                return;
            }
        } else if (getHandler() != null) {
            getHandler().post(new Runnable() {
                public void run() {
                    if (BleComboStep.this.mCurrentIndex != 1) {
                        BleComboStep.this.startConnectionAsso();
                        BleComboStep bleComboStep = BleComboStep.this;
                        bleComboStep.onCurrentIndexSuccess(bleComboStep.mCurrentIndex);
                        int unused = BleComboStep.this.mCurrentIndex = 1;
                        BleComboStep.access$508(BleComboStep.this);
                    }
                }
            });
        }
        this.mNextButton.setVisibility(8);
    }

    public void startConnection(int i) {
        this.mScanResult = (ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP);
        this.mConfigStartTime = System.currentTimeMillis();
        if (i == 0) {
            getWorkHandler().post(new Runnable() {
                public void run() {
                    BleComboStep.this.getBindkey();
                }
            });
            BluetoothLog.m7333w("BleComboStep.startConnection CONNECT_INDEX, mUseBleConfig = " + this.mUseBleConfig);
        } else if (i != 1) {
            if (i == 2) {
                BluetoothLog.m7333w("BleComboStep.startConnection GET_NEW_DEVICE_INDEX");
                BluetoothLog.m7332v(">>> current mNotifyStatus = " + getNotifyStatusString(this.mNotifyStatus));
                onStopConnection();
                startSearchNewDevice();
                return;
            }
            return;
        }
        BluetoothLog.m7333w("BleComboStep.startConnection SEND_SSID_AND_PASSWD_INDEX, mUseBleConfig = " + this.mUseBleConfig);
        if (this.mUseBleConfig) {
            BluetoothLog.m7332v(">>> current mNotifyStatus = " + getNotifyStatusString(this.mNotifyStatus));
            int i2 = this.mNotifyStatus;
            if (i2 == 0) {
                startSendPasswdToBle();
            } else if (i2 == 4) {
                retryComboConnect();
            } else if (i2 != 3 && !BluetoothUtils.isDeviceConnected(this.mComboAddress)) {
                this.mUseBleConfig = false;
                getHandler().removeMessages(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                startUpdateDeviceState(0);
            } else {
                this.mUseBleConfig = true;
                getHandler().sendEmptyMessageDelayed(SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 30000);
                onNotifyStatus(this.mNotifyStatus);
            }
        } else {
            startConnectionAsso();
            this.mSendPasswdTime++;
        }
    }

    public void startConnectionAsso() {
        Network network;
        BluetoothLog.m7333w("BleComboStep.startConnectionAsso");
        this.mId = (int) (System.currentTimeMillis() / 1000);
        this.mCurrentIndex = 1;
        if (Build.VERSION.SDK_INT >= 23) {
            Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
            int i = 0;
            while (true) {
                if (i >= allNetworks.length) {
                    network = null;
                    break;
                }
                NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(allNetworks[i]);
                if (networkInfo != null && networkInfo.getType() == 1) {
                    network = allNetworks[i];
                    break;
                }
                i++;
            }
            this.mConnectivityManager.bindProcessToNetwork(network);
        }
        setMiioRouter(SmartConfigDataProvider.getInstance().getSelectedSSID(), SmartConfigDataProvider.getInstance().getSelectedApPasswd(), (Class) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_SMART_CONFIG_MIUI_CLASS, (Object) null));
        this.mCurrentIndex = 1;
        this.mNextButton.setEnabled(false);
        this.mNextButton.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void startSearchNewDevice() {
        BluetoothLog.m7333w("BleComboStep.startSearchNewDevice mDid = " + this.mDid);
        this.mDeviceFinder.scanNewDevice(this.mCallback, this.mScanResult, String.valueOf(this.mDid), this.mContext);
    }

    public void startSendPasswdToBle() {
        this.mCurrentIndex = 1;
    }
}
