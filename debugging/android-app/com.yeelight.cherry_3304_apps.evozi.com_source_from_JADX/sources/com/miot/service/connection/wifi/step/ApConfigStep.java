package com.miot.service.connection.wifi.step;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.service.C3602R;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.common.miotcloud.MiotCloud;
import com.miot.service.common.miotcloud.MiotCloudApi;
import com.miot.service.connection.wifi.ConnectionUtils;
import com.miot.service.connection.wifi.DeviceFinder;
import com.miot.service.connection.wifi.ErrorCode;
import com.miot.service.connection.wifi.QConnectCallback;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.step.ConfigStep;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.miot.service.log.MyLogger;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import com.miot.service.view.MLAlertDialog;
import com.xiaomi.miio.MiioLocalAPI;
import com.xiaomi.miio.MiioLocalRpcResponse;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.apache.commons.p271io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApConfigStep extends ConfigStep {
    private static final int CONNECT_TO_AP_INDEX = 0;
    private static final int CONNECT_TO_SELECT_AP_INDEX = 2;
    private static final int GET_NEW_DEVICE_INDEX = 3;
    private static final int SEND_SSID_AND_PASSWD_INDEX = 1;
    private static final String TAG = "ApConfigStep";
    private ConfigStep.DeviceFinderCallback mCallback;
    private ArrayList<ConfigStep.ConfigTime> mConfigStageList;
    /* access modifiers changed from: private */
    public int mCurrentIndex;
    DeviceFinder mDeviceFinder;
    /* access modifiers changed from: private */
    public long mDid;
    private int mFindDeviceTime;
    private boolean mGotoErrorPage;
    private int mId;
    /* access modifiers changed from: private */
    public ScanResult mScanResult;
    private int mSendPasswdTime;
    /* access modifiers changed from: private */
    public String mToken;

    /* renamed from: com.miot.service.connection.wifi.step.ApConfigStep$10 */
    static /* synthetic */ class C368410 {
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

    ApConfigStep() {
        this.mConfigStageList = new ArrayList<>();
        this.mSendPasswdTime = 0;
        this.mFindDeviceTime = 0;
        this.mGotoErrorPage = false;
        this.mCallback = new ConfigStep.DeviceFinderCallback() {
            public void onDeviceConnectionBind(MiotWanDevice miotWanDevice) {
                ApConfigStep.this.onCurrentIndexSuccess(3);
            }

            public void onDeviceConnectionFailure() {
            }

            public void onDeviceConnectionSuccess(MiotWanDevice miotWanDevice) {
                ApConfigStep.this.onCurrentIndexSuccess(3);
            }
        };
        this.mDeviceFinder = new DeviceFinder(this.mContext, (People) SmartConfigDataProvider.getInstance().get("people"));
        this.mFindDeviceTime = ((Integer) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_FIND_DEVICE_TIME, 0)).intValue();
    }

    static /* synthetic */ int access$208(ApConfigStep apConfigStep) {
        int i = apConfigStep.mSendPasswdTime;
        apConfigStep.mSendPasswdTime = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void getBindkey() {
        if (!TextUtils.isEmpty(this.mBindkey)) {
            startConnectToDeviceAp();
            return;
        }
        MiotCloudApi.getBindKey(ServiceManager.getInstance().getPeople(), new JSONObject(), new MiotCloud.ResponseHandler() {
            public void onFailure(int i, String str) {
                BluetoothLog.m10339w("BleComboStep.getBindKey code: " + i + ", des:" + str);
                if (ApConfigStep.this.getHandler() != null) {
                    ApConfigStep.this.getHandler().postDelayed(new Runnable() {
                        public void run() {
                            ApConfigStep.this.getBindkey();
                        }
                    }, 2000);
                }
            }

            public void onSuccess(JSONObject jSONObject) {
                BluetoothLog.m10339w("BleComboStep.getBindKey: " + jSONObject);
                if (jSONObject != null) {
                    try {
                        ApConfigStep.this.mBindkey = jSONObject.optJSONObject("result").optString("bindkey");
                    } catch (Exception unused) {
                    }
                }
                ((Activity) ApConfigStep.this.mContext).runOnUiThread(new Runnable() {
                    public void run() {
                        ApConfigStep.this.startConnectToDeviceAp();
                    }
                });
            }
        });
    }

    public ArrayList<ConfigStep.ConfigTime> getAllConfigStages() {
        this.mConfigStageList.clear();
        ConfigStep.ConfigTime configTime = new ConfigStep.ConfigTime();
        configTime.index = 0;
        configTime.time = 30000;
        this.mConfigStageList.add(configTime);
        ConfigStep.ConfigTime configTime2 = new ConfigStep.ConfigTime();
        configTime2.index = 1;
        configTime2.time = 20000;
        this.mConfigStageList.add(configTime2);
        ConfigStep.ConfigTime configTime3 = new ConfigStep.ConfigTime();
        configTime3.index = 3;
        configTime3.time = 50000;
        boolean booleanValue = ((Boolean) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_GOTO_TO_ERROR_PAGE, Boolean.FALSE)).booleanValue();
        this.mGotoErrorPage = booleanValue;
        if (booleanValue) {
            SmartConfigDataProvider.getInstance().set(SmartConfigDataProvider.KEY_GOTO_TO_ERROR_PAGE, Boolean.FALSE);
            this.mCurrentIndex = 3;
            configTime3.time = 0;
        }
        this.mConfigStageList.add(configTime3);
        return this.mConfigStageList;
    }

    public int getCurrentStageIndex() {
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "getCurrentStageIndex mCurrentIndex: " + this.mCurrentIndex);
        int i = this.mCurrentIndex;
        if (i == 0) {
            ScanResult scanResult = (ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP);
            if (scanResult == null) {
                finishSmartConfig(false);
                return -1;
            }
            String str = scanResult.SSID;
            WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
            return (connectionInfo == null || !ConnectionUtils.isEqualWifi(str, connectionInfo.getSSID())) ? 0 : 1;
        } else if (i == 1) {
            String str2 = ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID;
            WifiInfo connectionInfo2 = this.mWifiManager.getConnectionInfo();
            if (connectionInfo2 != null && ConnectionUtils.isEqualWifi(str2, connectionInfo2.getSSID())) {
                return ((Boolean) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_SEND_PASSWD_SUCCESS, Boolean.FALSE)).booleanValue() ? 3 : 1;
            }
            this.mCurrentIndex = 0;
            return 0;
        } else if (i != 2) {
            return i;
        } else {
            String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
            WifiInfo connectionInfo3 = this.mWifiManager.getConnectionInfo();
            return (connectionInfo3 == null || !connectionInfo3.getSSID().equals(selectedSSID)) ? 2 : 3;
        }
    }

    public String getGatewayAddr() {
        Context context = this.mContext;
        return context == null ? "" : long2Ip((long) ((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway);
    }

    public SmartConfigStep.Step getStep() {
        return SmartConfigStep.Step.STEP_AP_CONFIG_STEP;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 101) {
            NetworkInfo networkInfo = (NetworkInfo) message.obj;
            NetworkInfo.DetailedState detailedState = networkInfo.getDetailedState();
            WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
            if (connectionInfo == null || TextUtils.isEmpty(connectionInfo.getSSID()) || connectionInfo.getSSID().contains("<unknown ssid>")) {
                MyLogger.getInstance().log(TAG, "wifi info is not right!");
            } else if (detailedState != NetworkInfo.DetailedState.CONNECTED || !networkInfo.isConnected()) {
                MyLogger.getInstance().log(TAG, "wifi is not connected!");
            } else {
                MyLogger instance = MyLogger.getInstance();
                StringBuilder sb = new StringBuilder();
                sb.append("WifiStateConfig");
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
                instance.log(TAG, sb.toString());
                if (ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), ((ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP)).SSID) && this.mCurrentIndex == 0 && !this.mIsPaused) {
                    onApConnected();
                }
            }
        } else if (i == 112) {
            MyLogger instance2 = MyLogger.getInstance();
            instance2.log(TAG, "handleMessage, msg.what = MSG_UPDATE_DEVICE_STATE, mCurrentIndex = " + this.mCurrentIndex);
            if (getHandler() != null) {
                getHandler().removeMessages(112);
                getHandler().removeMessages(114);
            }
            if (this.mCurrentIndex == 1) {
                onCurrentIndexSuccess(1);
                this.mCurrentIndex = 3;
                onStopConnection();
                onDeviceConnSuccess(true);
            }
        } else if (i == 123) {
            startConnectToDeviceAp();
        } else if (i == 114) {
            startConnectionAsso();
        } else if (i != 115) {
            super.handleMessage(message);
        } else {
            onStopConnection();
            stopConnection();
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
        MyLogger.getInstance().log(TAG, "handle message network changed, decide connect ap success");
        if (getHandler() != null) {
            getHandler().postDelayed(new Runnable() {
                public void run() {
                    if (ApConfigStep.this.mCurrentIndex == 0) {
                        ApConfigStep apConfigStep = ApConfigStep.this;
                        if (apConfigStep.isDeviceApConnected(apConfigStep.mScanResult)) {
                            ApConfigStep apConfigStep2 = ApConfigStep.this;
                            apConfigStep2.onCurrentIndexSuccess(apConfigStep2.mCurrentIndex);
                            ApConfigStep.this.getHandler().removeMessages(SmartConfigStep.MSG_RECONNECT_DEVICE_AP);
                            ApConfigStep.this.startConnectionAsso();
                            int unused = ApConfigStep.this.mCurrentIndex = 1;
                            ApConfigStep.access$208(ApConfigStep.this);
                        }
                    }
                }
            }, 2000);
        }
    }

    public boolean onBackPressed() {
        new MLAlertDialog.Builder(this.mContext).setTitle((CharSequence) this.mContext.getString(C3602R.string.stop_connect_device_title)).setMessage((CharSequence) this.mContext.getString(C3602R.string.stop_connect_device_message)).setPositiveButton((CharSequence) this.mContext.getString(C3602R.string.confirm), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                WifiManager wifiManager = (WifiManager) ApConfigStep.this.mContext.getApplicationContext().getSystemService("wifi");
                WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                if (!(ApConfigStep.this.mScanResult == null || connectionInfo == null || !ApConfigStep.this.mScanResult.BSSID.equalsIgnoreCase(wifiManager.getConnectionInfo().getBSSID()))) {
                    ApConfigStep apConfigStep = ApConfigStep.this;
                    ConnectionUtils.disconnectAp(apConfigStep.mConnectivityManager, apConfigStep.mWifiManager, apConfigStep.mScanResult.SSID, ApConfigStep.this.mApNetworkCallback);
                }
                DeviceFinder deviceFinder = ApConfigStep.this.mDeviceFinder;
                if (deviceFinder != null && deviceFinder.isFindingNew()) {
                    ApConfigStep.this.mDeviceFinder.stopScanNewDevice();
                }
                ApConfigStep.this.finishSmartConfig(true);
            }
        }).setNegativeButton((CharSequence) this.mContext.getString(C3602R.string.cancel), (DialogInterface.OnClickListener) null).setBtnTextColor(this.mContext.getResources().getColor(C3602R.color.std_dialog_button_red), -1).show();
        return true;
    }

    public void onDeviceConnSuccess(boolean z) {
        startSearchNewDevice();
    }

    public void onFinishStep() {
        super.onFinishStep();
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "onFinishStep, mCurrentIndex: " + this.mCurrentIndex);
        this.mDeviceFinder.stopScanNewDevice();
        this.mDeviceFinder.cleanCallback();
    }

    public SmartConfigStep.Step onStageTimeOut(int i) {
        QConnectCallback qConnectCallback;
        ConnectivityManager.NetworkCallback networkCallback;
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "onStageTimeOut index: " + i);
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 29 && ConnectionUtils.isTargetSDKVersionAfter29(this.mContext) && (qConnectCallback = this.mApNetworkCallback) != null && (networkCallback = qConnectCallback.callback) != null) {
                this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
                this.mApNetworkCallback.callback = null;
                this.mApNetworkCallback = null;
            }
            getHandler().removeMessages(SmartConfigStep.MSG_RECONNECT_DEVICE_AP);
            return SmartConfigStep.Step.STEP_CONNECT_AP_ERROR;
        } else if (i == 1) {
            return this.mSendPasswdTime == 1 ? SmartConfigStep.Step.STEP_SEND_ROUTER_INFO_ERROR : SmartConfigStep.Step.STEP_SEND_ROUTER_INFO_ERROR;
        } else {
            if (i == 2) {
                return SmartConfigStep.Step.STEP_CONNECT_SELECTED_AP_FAILED;
            }
            if (i != 3) {
                return null;
            }
            this.mDeviceFinder.stopScanNewDevice();
            return this.mFindDeviceTime == 1 ? SmartConfigStep.Step.STEP_FIND_DEVICE_FAILED : SmartConfigStep.Step.STEP_FIND_DEVICE_FAILED;
        }
    }

    public void onStopConnection() {
        QConnectCallback qConnectCallback;
        ConnectivityManager.NetworkCallback networkCallback;
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "onStopConnection, mCurrentIndex: " + this.mCurrentIndex);
        getHandler().removeMessages(112);
        getHandler().removeMessages(114);
        if (Build.VERSION.SDK_INT >= 23) {
            this.mConnectivityManager.bindProcessToNetwork((Network) null);
        }
        if (!this.mDeviceFinder.isFindingNew()) {
            String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
            String selectedApPasswd = SmartConfigDataProvider.getInstance().getSelectedApPasswd();
            String selectedAPCapabilities = SmartConfigDataProvider.getInstance().getSelectedAPCapabilities();
            if (Build.VERSION.SDK_INT >= 29 && ConnectionUtils.isTargetSDKVersionAfter29(this.mContext) && (qConnectCallback = this.mApNetworkCallback) != null && (networkCallback = qConnectCallback.callback) != null) {
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
            if (C368410.$SwitchMap$com$miot$service$connection$wifi$ErrorCode[ErrorCode.valueof(jSONObject.optInt("code")).ordinal()] != 1) {
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
            i = C3602R.string.smart_config_device_connecting;
        } else if (i2 == 2 || i2 == 3) {
            i = C3602R.string.smart_config_update_connection_state;
        } else {
            return;
        }
        textView.setText(i);
    }

    public void setMiioRouter(String str, String str2, Class cls) {
        MyLogger instance = MyLogger.getInstance();
        instance.log(TAG, "setMiioRouter, ssid = " + str + ", pw = " + str2 + ", BEGIN!");
        People people = (People) SmartConfigDataProvider.getInstance().get("people");
        AppConfiguration.Locale locale = ServiceManager.getInstance().getAppConfig().getLocale();
        if (people == null) {
            finishSmartConfig(true);
            return;
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
            jSONObject2.put("uid", Long.valueOf(people.getUserId()));
            jSONObject2.put("bind_key", this.mBindkey);
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
            MyLogger.getInstance().log(TAG, "async_get_token start");
            MiioLocalAPI.async_get_token(gatewayAddr, new MiioLocalRpcResponse() {
                public void onResponse(final String str) {
                    MyLogger instance = MyLogger.getInstance();
                    instance.log(ApConfigStep.TAG, "async_get_token response:" + str);
                    if (ApConfigStep.this.getHandler() != null) {
                        ApConfigStep.this.getHandler().post(new Runnable() {
                            public void run() {
                                JSONObject parseRpcResponse = ApConfigStep.this.parseRpcResponse(str);
                                if (parseRpcResponse != null) {
                                    long unused = ApConfigStep.this.mDid = Long.valueOf(parseRpcResponse.optString("did")).longValue();
                                    String unused2 = ApConfigStep.this.mToken = parseRpcResponse.optString("token");
                                    ApConfigStep apConfigStep = ApConfigStep.this;
                                    apConfigStep.mDeviceFinder.addToken(String.valueOf(apConfigStep.mDid), ApConfigStep.this.mToken);
                                    String gatewayAddr = ApConfigStep.this.getGatewayAddr();
                                    if (!TextUtils.isEmpty(gatewayAddr)) {
                                        MyLogger.getInstance().log(ApConfigStep.TAG, "setmiiorouter start");
                                        MiioLocalAPI.async_rpc(gatewayAddr, jSONObject.toString(), ApConfigStep.this.mDid, ApConfigStep.this.mToken, new MiioLocalRpcResponse() {
                                            public void onResponse(String str) {
                                                Handler handler;
                                                int i;
                                                MyLogger instance = MyLogger.getInstance();
                                                instance.log(ApConfigStep.TAG, "setmiiorouter result:" + str);
                                                if (ApConfigStep.this.parseRpcResponse(str) != null) {
                                                    MyLogger.getInstance().log(ApConfigStep.TAG, "send MSG_UPDATE_DEVICE_STATE");
                                                    if (ApConfigStep.this.getHandler() != null) {
                                                        handler = ApConfigStep.this.getHandler();
                                                        i = 112;
                                                    } else {
                                                        return;
                                                    }
                                                } else if (ApConfigStep.this.getHandler() != null) {
                                                    handler = ApConfigStep.this.getHandler();
                                                    i = 114;
                                                } else {
                                                    return;
                                                }
                                                handler.sendEmptyMessageDelayed(i, 1000);
                                            }
                                        });
                                    }
                                } else if (ApConfigStep.this.getHandler() != null) {
                                    ApConfigStep.this.getHandler().sendEmptyMessageDelayed(114, 1000);
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
            i = C3602R.string.smart_config_ap_connect_sub_title;
        } else if (i2 == 1 || i2 == 2 || i2 == 3) {
            i = C3602R.string.smart_config_connecting_sub_title;
        } else {
            return;
        }
        textView.setText(i);
    }

    public void startConnectToDeviceAp() {
        MyLogger.getInstance().log(TAG, "startConnectToDeviceAp");
        this.mCurrentIndex = 0;
        WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
        if (TextUtils.isEmpty(connectionInfo.getSSID()) || !ConnectionUtils.isEqualWifi(connectionInfo.getSSID(), this.mScanResult.SSID) || connectionInfo.getSupplicantState() != SupplicantState.COMPLETED) {
            QConnectCallback qConnectCallback = this.mApNetworkCallback;
            if (qConnectCallback == null || qConnectCallback.callback == null) {
                C36905 r8 = new QConnectCallback() {
                    public void onAvailable(Network network) {
                        super.onAvailable(network);
                        MyLogger instance = MyLogger.getInstance();
                        instance.log("connectToAP ok: " + ApConfigStep.this.mScanResult.SSID);
                    }

                    public void onLost(Network network) {
                        super.onLost(network);
                        MyLogger.getInstance().log("connecttoAp onLost ");
                        if (ApConfigStep.this.mCurrentIndex == 0) {
                            ApConfigStep.this.getHandler().post(new Runnable() {
                                public void run() {
                                    ApConfigStep.this.triggerTimeoutNow();
                                }
                            });
                        }
                    }

                    public void onUnavailable() {
                        super.onUnavailable();
                        MyLogger.getInstance().log("connectToAP onUnavailable!");
                        if (ApConfigStep.this.mCurrentIndex == 0) {
                            ApConfigStep.this.getHandler().post(new Runnable() {
                                public void run() {
                                    ApConfigStep.this.triggerTimeoutNow();
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
                getHandler().sendEmptyMessageDelayed(SmartConfigStep.MSG_RECONNECT_DEVICE_AP, 15000);
            } else {
                return;
            }
        } else if (getHandler() != null) {
            getHandler().post(new Runnable() {
                public void run() {
                    if (ApConfigStep.this.mCurrentIndex != 1) {
                        ApConfigStep.this.startConnectionAsso();
                        ApConfigStep apConfigStep = ApConfigStep.this;
                        apConfigStep.onCurrentIndexSuccess(apConfigStep.mCurrentIndex);
                        int unused = ApConfigStep.this.mCurrentIndex = 1;
                        ApConfigStep.access$208(ApConfigStep.this);
                    }
                }
            });
        }
        this.mNextButton.setVisibility(8);
        this.mNextButton.setText(C3602R.string.cancel);
        this.mNextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApConfigStep apConfigStep = ApConfigStep.this;
                ConnectionUtils.disconnectAp(apConfigStep.mConnectivityManager, apConfigStep.mWifiManager, apConfigStep.mScanResult.SSID, ApConfigStep.this.mApNetworkCallback);
                ApConfigStep.this.finishSmartConfig(true);
            }
        });
    }

    public void startConnection(int i) {
        this.mScanResult = (ScanResult) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_AP);
        this.mConfigStartTime = System.currentTimeMillis();
        if (i == 0) {
            getBindkey();
        } else if (i == 1) {
            startConnectionAsso();
            this.mSendPasswdTime++;
        } else if (i == 2) {
            onStopConnection();
        } else if (i == 3) {
            onStopConnection();
            onDeviceConnSuccess(false);
        }
    }

    public void startConnectionAsso() {
        Network network;
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
    }

    /* access modifiers changed from: protected */
    public boolean startSearchNewDevice() {
        this.mGotoErrorPage = false;
        this.mDeviceFinder.scanNewDevice(this.mCallback, this.mScanResult, String.valueOf(this.mDid), this.mContext);
        this.mFindDeviceTime++;
        return false;
    }

    public void stopConnection() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.mId);
            jSONObject.put("method", "miIO.stop_diag_mode");
            jSONObject.put("params", "");
        } catch (JSONException unused) {
        }
        String gatewayAddr = getGatewayAddr();
        if (!TextUtils.isEmpty(gatewayAddr)) {
            MiioLocalAPI.async_rpc(gatewayAddr, jSONObject.toString(), this.mDid, this.mToken, new MiioLocalRpcResponse() {
                public void onResponse(String str) {
                }
            });
        }
    }
}
