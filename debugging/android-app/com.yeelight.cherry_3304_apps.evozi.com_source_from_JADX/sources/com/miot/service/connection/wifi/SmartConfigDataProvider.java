package com.miot.service.connection.wifi;

import android.net.wifi.ScanResult;
import java.util.concurrent.ConcurrentHashMap;

public class SmartConfigDataProvider {
    public static final String KEY_AP_CONNECT_FAILED_TIMES = "ap_connect_failed_times";
    public static final String KEY_CAMERA_BIND_KEY = "camera_bind_key";
    public static final String KEY_CONNECTED_DEVICE = "connected_device";
    public static final String KEY_DEVICE_AP = "device_ap";
    public static final String KEY_DEVICE_MODEL = "device_model";
    public static final String KEY_DEVICE_NAME = "device_name";
    public static final String KEY_FIND_DEVICE_TIME = "find_device_time";
    public static final String KEY_GOTO_TO_ERROR_PAGE = "goto_error_page";
    public static final String KEY_HANDLER = "handler";
    public static final String KEY_IS_MI_WIFI_IN_DEVICE_LIST = "mi_router_in_device_list";
    public static final String KEY_MI_ROUTER_INFO = "mi_router_info";
    public static final String KEY_PEOPLE = "people";
    public static final String KEY_RESTORE_WIFI = "restore_wifi";
    public static final String KEY_SCAN_QR_CODE = "scan_qr_code";
    public static final String KEY_SCAN_QR_MODEL = "scan_qr_model";
    public static final String KEY_SELECTED_AP = "selected_ap";
    public static final String KEY_SELECTED_AP_CAPABILITIES = "selected_ap_capabilities";
    public static final String KEY_SELECTED_AP_PASSWD = "selected_ap_passwd";
    public static final String KEY_SELECTED_AP_SSID = "selected_ap_ssid";
    public static final String KEY_SEND_PASSWD_SUCCESS = "send_passwd_success";
    public static final String KEY_SMART_CONFIG_MIUI_CLASS = "miui_class";
    public static final String KEY_TARGET_AP_BSSID = "target_bssid";
    public static final String KEY_TARGET_AP_PASSWD = "target_passwd";
    public static final String KEY_TIME_GMT_OFFSET = "gmt_offset";
    public static final String KEY_USE_QR_CODE = "user_qr_code";
    public static final String KEY_WIFI_BSSID = "wifi_bssid";
    public static final String KEY_WIFI_SSID = "wifi_ssid";
    private static volatile SmartConfigDataProvider instance;
    private ConcurrentHashMap<String, Object> mData = new ConcurrentHashMap<>();

    private SmartConfigDataProvider() {
    }

    public static SmartConfigDataProvider getInstance() {
        if (instance == null) {
            synchronized (SmartConfigDataProvider.class) {
                if (instance == null) {
                    instance = new SmartConfigDataProvider();
                }
            }
        }
        return instance;
    }

    public void cleanValue(String str) {
        this.mData.remove(str);
    }

    public void clear() {
        this.mData.clear();
    }

    public Object get(String str) {
        if (str == null || !this.mData.containsKey(str)) {
            return null;
        }
        return this.mData.get(str);
    }

    public Object get(String str, Object obj) {
        return (str == null || !this.mData.containsKey(str)) ? obj : this.mData.get(str);
    }

    public String getSelectedAPCapabilities() {
        return ((ScanResult) get(KEY_SELECTED_AP)).capabilities;
    }

    public String getSelectedApPasswd() {
        return (String) get(KEY_SELECTED_AP_PASSWD);
    }

    public String getSelectedBSSID() {
        if (get(KEY_SELECTED_AP) != null) {
            return ((ScanResult) get(KEY_SELECTED_AP)).BSSID;
        }
        return null;
    }

    public String getSelectedSSID() {
        if (get(KEY_SELECTED_AP) != null) {
            return ((ScanResult) get(KEY_SELECTED_AP)).SSID;
        }
        return null;
    }

    public void set(String str, Object obj) {
        if (str != null && obj != null) {
            this.mData.put(str, obj);
        }
    }
}
