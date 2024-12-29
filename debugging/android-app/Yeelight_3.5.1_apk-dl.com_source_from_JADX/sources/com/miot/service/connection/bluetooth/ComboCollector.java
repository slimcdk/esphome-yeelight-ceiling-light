package com.miot.service.connection.bluetooth;

import android.text.TextUtils;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.util.concurrent.ConcurrentHashMap;

public class ComboCollector {
    private static ConcurrentHashMap<String, String> mAddressMap = new ConcurrentHashMap<>();

    public static void addCombo(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            BluetoothLog.m7332v(String.format("addCombo: key = %s, mac = %s", new Object[]{str, str2}));
            if (!mAddressMap.containsKey(str)) {
                mAddressMap.put(str, str2);
            }
        }
    }

    public static String getAddress(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mAddressMap.get(str.toUpperCase());
        }
        return null;
    }
}
