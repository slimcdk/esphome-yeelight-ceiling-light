package com.miot.service.connection;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.miot.api.ICommonHandler;
import com.miot.api.ICompletionHandler;
import com.miot.api.IDeviceConnection;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import com.miot.common.config.AppConfiguration;
import com.miot.common.device.ConnectionInfo;
import com.miot.common.device.Device;
import com.miot.common.people.People;
import com.miot.service.common.crypto.Base64Coder;
import com.miot.service.common.miotcloud.OkHttpManager;
import com.miot.service.connection.wifi.ErrorCode;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.SmartConfigMainActivity;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class DeviceConnectionImpl extends IDeviceConnection.Stub {
    private static final String SHT_CHUANGMI_CAMERA_V1 = "chuangmi.camera.xiaobai";
    private static final String key = "89JFSjo8HUbhou5776NJOMp9i90ghg7Y78G78t68899y79HY7g7y87y9ED45Ew30O0jkkl";
    private Context mContext;

    public DeviceConnectionImpl(Context context) {
        this.mContext = context;
    }

    /* access modifiers changed from: private */
    public static String getBase64(String str, boolean z) {
        if (z) {
            try {
                int length = str.length();
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = 0;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    cArr[i2] = (char) (str.charAt(i2) ^ key.charAt(i2 % 70));
                    if (cArr[i2] == 0) {
                        cArr[i2] = str.charAt(i2);
                    }
                }
                str = new String(cArr);
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return Base64Coder.encode(str.getBytes("UTF-8"));
    }

    /* access modifiers changed from: private */
    public boolean supportTimeArea() {
        String str = (String) SmartConfigDataProvider.getInstance().get(SmartConfigDataProvider.KEY_DEVICE_MODEL);
        if (!TextUtils.isEmpty(str)) {
            return !str.equalsIgnoreCase(SHT_CHUANGMI_CAMERA_V1);
        }
        return true;
    }

    public void connectToCloud(People people, Device device, ICompletionHandler iCompletionHandler) {
        ScanResult scanResult;
        Iterator<ScanResult> it = ((WifiManager) this.mContext.getSystemService("wifi")).getScanResults().iterator();
        while (true) {
            if (!it.hasNext()) {
                scanResult = null;
                break;
            }
            scanResult = it.next();
            ConnectionInfo connectionInfo = device.getConnectionInfo();
            if (scanResult.BSSID.equalsIgnoreCase(connectionInfo.getBssid()) && scanResult.SSID.equalsIgnoreCase(connectionInfo.getSsid())) {
                break;
            }
        }
        if (scanResult == null) {
            iCompletionHandler.onFailed(1008, "cann't find the wifi device");
            return;
        }
        Intent intent = new Intent(this.mContext, SmartConfigMainActivity.class);
        intent.addFlags(536870912);
        intent.addFlags(4194304);
        intent.addFlags(268435456);
        intent.putExtra("scanResult", scanResult);
        intent.putExtra("people", people);
        intent.putExtra(SmartConfigDataProvider.KEY_HANDLER, new BinderParcel(iCompletionHandler.asBinder()));
        if (scanResult.SSID.contains("miap")) {
            intent.putExtra("strategy_id", 2);
        } else {
            intent.putExtra("strategy_id", 4);
            MiotBleDeviceConfig config = MiotBleClient.getInstance().getConfig();
            if (config != null) {
                config.setBindStyle(0);
            }
        }
        intent.putExtra("name", device.getName());
        this.mContext.startActivity(intent);
    }

    public void enableHttpLog() {
        OkHttpManager.getInstance().enableHttpLog();
    }

    public void getQrCode(String str, String str2, String str3, People people, ICommonHandler iCommonHandler) {
        final ICommonHandler iCommonHandler2 = iCommonHandler;
        final String str4 = str;
        final String str5 = str3;
        final String str6 = str2;
        C36381 r0 = new ICompletionHandler.Stub() {
            public void onFailed(int i, String str) {
                ICommonHandler iCommonHandler = iCommonHandler2;
                if (iCommonHandler != null) {
                    iCommonHandler.onFailed(i, str);
                }
            }

            public void onSucceed() {
                ICommonHandler iCommonHandler;
                ICommonHandler iCommonHandler2;
                StringBuilder sb = new StringBuilder();
                String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
                String selectedApPasswd = SmartConfigDataProvider.getInstance().getSelectedApPasswd();
                if ((selectedSSID == null || selectedApPasswd == null) && (iCommonHandler2 = iCommonHandler2) != null) {
                    iCommonHandler2.onFailed(ErrorCode.ERROR_NO_WIFI_INDO.getCode(), "no wifi info.");
                    return;
                }
                boolean z = false;
                String access$000 = DeviceConnectionImpl.getBase64(selectedSSID, false);
                String access$0002 = DeviceConnectionImpl.getBase64(selectedApPasswd, true);
                if ((access$000 == null || access$0002 == null || TextUtils.isEmpty(str4)) && (iCommonHandler = iCommonHandler2) != null) {
                    iCommonHandler.onFailed(-1, "Base64 transfer error.");
                    return;
                }
                sb.append("b=");
                sb.append(str4);
                sb.append("&");
                sb.append("s=");
                sb.append(access$000);
                sb.append("&");
                sb.append("p=");
                sb.append(access$0002);
                if (DeviceConnectionImpl.this.supportTimeArea() && !TextUtils.isEmpty(str5)) {
                    sb.append("&t=");
                    sb.append(str5);
                }
                if (!TextUtils.isEmpty(str6) && !str6.equalsIgnoreCase(AppConfiguration.Locale.cn.name())) {
                    z = true;
                }
                if (DeviceConnectionImpl.this.supportTimeArea() && z) {
                    sb.append("&r=");
                    sb.append(str6);
                }
                ICommonHandler iCommonHandler3 = iCommonHandler2;
                if (iCommonHandler3 != null) {
                    iCommonHandler3.onSucceed(sb.toString());
                }
            }
        };
        Intent intent = new Intent(this.mContext, SmartConfigMainActivity.class);
        intent.addFlags(536870912);
        intent.addFlags(4194304);
        intent.addFlags(268435456);
        intent.putExtra("people", people);
        intent.putExtra(SmartConfigDataProvider.KEY_HANDLER, new BinderParcel(r0.asBinder()));
        intent.putExtra("strategy_id", 7);
        this.mContext.startActivity(intent);
    }

    public void setHttpUserAgent(String str) {
        OkHttpManager.getInstance().setUserAgent(str);
    }
}
