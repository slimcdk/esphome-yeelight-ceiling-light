package com.miot.service.connection.bluetooth;

import android.os.Bundle;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import com.miot.common.config.AppConfiguration;
import com.miot.common.people.People;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.connection.bluetooth.BLEBytesWriter;
import com.miot.service.connection.bluetooth.BleFastConnector;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.log.MyLogger;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class BleStandardAuthFastConnecter implements IBleFastConnector {
    private String mBindKey;
    private String mBindkeyIndex;
    private long mBindkeyTimestamp;
    private final BleSecurityStatusResponse mBleConnectResponse = new BleSecurityStatusResponse() {
        public void onAuthResponse(int i, Bundle bundle) {
        }

        public void onBindResponse(int i, Bundle bundle) {
        }

        public void onConnectResponse(int i, Bundle bundle) {
        }

        public void onResponse(int i, Bundle bundle) {
            MyLogger.getInstance().log(String.format("BleStandardAuthFastConnecter onResponse, code = %d", new Object[]{Integer.valueOf(i)}));
            Bundle unused = BleStandardAuthFastConnecter.this.mBundle = bundle;
            if (i == 0) {
                BleStandardAuthFastConnecter.this.onFastConnectSuccess();
            } else {
                BleStandardAuthFastConnecter.this.onFastConnectFailed(i);
            }
        }
    };
    /* access modifiers changed from: private */
    public Bundle mBundle;
    private String mConfigType;
    private String mMac;
    private String mPassportUrl;
    private String mPwd;
    private BleFastConnector.BleFastConnectResponse mResponse;
    private String mSsid;

    public BleStandardAuthFastConnecter(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7) {
        str2 = str2 == null ? "" : str2;
        str3 = str3 == null ? "" : str3;
        str4 = str4 == null ? "" : str4;
        str6 = str6 == null ? "" : str6;
        str7 = str7 == null ? "" : str7;
        this.mMac = str;
        this.mSsid = str2;
        this.mPwd = str3;
        this.mBindKey = str4;
        this.mConfigType = str6;
        this.mPassportUrl = str7;
        this.mBindkeyTimestamp = j;
        this.mBindkeyIndex = str5;
    }

    public static String getCountryCode() {
        AppConfiguration.Locale locale = ServiceManager.getInstance().getAppConfig().getLocale();
        String upperCase = locale != null ? locale.toString().toUpperCase() : "";
        if ("IL".equalsIgnoreCase(upperCase)) {
            upperCase = "CN";
        }
        MyLogger.getInstance().log(String.format("getcountryCode %s", new Object[]{upperCase}));
        return upperCase;
    }

    public static String getCountryDomain() {
        AppConfiguration.Locale locale = ServiceManager.getInstance().getAppConfig().getLocale();
        String str = (locale == null || locale == AppConfiguration.Locale.cn) ? "" : locale.toString();
        MyLogger.getInstance().log(String.format("getCountryDomain %s", new Object[]{str}));
        return str;
    }

    public static int getGmtOffset() {
        int convert = (int) TimeUnit.SECONDS.convert((long) new GregorianCalendar().getTimeZone().getRawOffset(), TimeUnit.MILLISECONDS);
        MyLogger.getInstance().log(String.format("sendTimeZone %ds", new Object[]{Integer.valueOf(convert)}));
        return convert;
    }

    public static String getTimeZone() {
        TimeZone timeZone = new GregorianCalendar().getTimeZone();
        MyLogger.getInstance().log(String.format("timeArea %s", new Object[]{timeZone.getID()}));
        return timeZone.getID();
    }

    private String getUserId() {
        People people = (People) SmartConfigDataProvider.getInstance().get("people");
        return people != null ? people.getUserId() : "";
    }

    /* access modifiers changed from: private */
    public void onFastConnectFailed(int i) {
        BleFastConnector.BleFastConnectResponse bleFastConnectResponse = this.mResponse;
        if (bleFastConnectResponse != null) {
            bleFastConnectResponse.onResponse(i, null);
        }
    }

    /* access modifiers changed from: private */
    public void onFastConnectSuccess() {
        BleFastConnector.BleFastConnectResponse bleFastConnectResponse = this.mResponse;
        if (bleFastConnectResponse != null) {
            bleFastConnectResponse.onResponse(0, null);
        }
    }

    public void connect(BleFastConnector.BleFastConnectResponse bleFastConnectResponse) {
        BleComboWifiConfig bleComboWifiConfig = new BleComboWifiConfig();
        bleComboWifiConfig.uid = getUserId();
        bleComboWifiConfig.ssid = this.mSsid;
        bleComboWifiConfig.password = this.mPwd;
        bleComboWifiConfig.gmtOffset = getGmtOffset();
        bleComboWifiConfig.countryDomain = getCountryDomain();
        bleComboWifiConfig.timezone = getTimeZone();
        bleComboWifiConfig.configType = this.mConfigType;
        bleComboWifiConfig.bindKey = this.mBindKey;
        bleComboWifiConfig.countryCode = getCountryCode();
        bleComboWifiConfig.passportUrl = this.mPassportUrl;
        bleComboWifiConfig.bindTimestamp = this.mBindkeyTimestamp;
        bleComboWifiConfig.bindIndex = this.mBindkeyIndex;
        this.mResponse = bleFastConnectResponse;
        BleConnectOptions build = new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(35000).setServiceDiscoverRetry(1).setServiceDiscoverTimeout(10000).build();
        MiotBleClient.getInstance().bleComboStandardAuth(this.mMac, MiotBleDeviceConfig.productId(), bleComboWifiConfig, build, this.mBleConnectResponse);
    }

    public void sendRestoreCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse) {
        if (bLEBytesWriteResponse != null) {
            bLEBytesWriteResponse.onResponse(0, null);
        }
    }

    public void sendRetryCommand(BLEBytesWriter.BLEBytesWriteResponse bLEBytesWriteResponse) {
    }
}
