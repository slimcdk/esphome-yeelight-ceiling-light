package com.miot.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public class NetworkUtils {
    public static final int NETWORK_2G = 10;
    public static final int NETWORK_3G = 20;
    public static final int NETWORK_4G = 30;
    public static final int NETWORK_MOBILE_3G = 22;
    public static final int NETWORK_MOBILE_UNICOM_2G = 12;
    public static final int NETWORK_NOT_CONNECTED = -1;
    public static final int NETWORK_TELECOM_2G = 11;
    public static final int NETWORK_TELECOM_3G = 21;
    public static final int NETWORK_UNICOM_3G = 23;
    public static final int NETWORK_UNKNOWN = 0;
    public static final int NETWORK_WIFI = 1;

    public static String getWifiMac(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "";
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    public int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        if (type == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (!(subtype == 8 || subtype == 15)) {
                if (subtype != 12) {
                    if (subtype != 13) {
                        switch (subtype) {
                            case 1:
                            case 2:
                                return 12;
                            case 3:
                                break;
                            case 4:
                                return 11;
                            case 5:
                            case 6:
                                break;
                        }
                    } else {
                        return 30;
                    }
                }
                return 21;
            }
            return 23;
        }
        return 0;
    }
}
