package com.miot.service.common.deviceId;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class DeviceIdCompat {
    private static final String SPFS_UUID = "spfs_uuid";
    private static final String SPFS_UUID_KEY = "spfs_uuid_key";
    private static final String TAG = "DeviceIdCompat";
    private static String sDeviceId = "";

    private DeviceIdCompat() {
    }

    private static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static byte[] getBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    @SuppressLint({"MissingPermission"})
    private static String getCompatId(Context context) {
        String str;
        try {
            if (Build.VERSION.SDK_INT <= 28 && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (isValidId(deviceId)) {
                    return UUID.nameUUIDFromBytes(deviceId.getBytes()).toString();
                }
            }
        } catch (Exception unused) {
        }
        String str2 = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
        try {
            str = Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : Build.SERIAL;
        } catch (Exception unused2) {
            str = "serial";
        }
        return new UUID((long) str2.hashCode(), (long) str.hashCode()).toString();
    }

    public static String getDeviceId(Context context) {
        if (isValidId(sDeviceId)) {
            return sDeviceId;
        }
        String deviceIdFromSpfs = getDeviceIdFromSpfs(context);
        if (isValidId(deviceIdFromSpfs)) {
            sDeviceId = deviceIdFromSpfs;
            return deviceIdFromSpfs;
        }
        String oaid = IdentifierManager.getOAID(context);
        if (!isValidId(oaid)) {
            oaid = getAndroidId(context);
        }
        if (!isValidId(oaid)) {
            oaid = getCompatId(context);
        }
        sDeviceId = oaid;
        saveDeviceIdToSpfs(context, oaid);
        return sDeviceId;
    }

    private static String getDeviceIdFromSpfs(Context context) {
        return context.getSharedPreferences(SPFS_UUID, 0).getString(SPFS_UUID_KEY, "");
    }

    public static String getSHA2Digest(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(getBytes(str));
            return String.format("%1$040X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isValidId(String str) {
        return !TextUtils.isEmpty(str) && !"unknow".equalsIgnoreCase(str) && !"null".equalsIgnoreCase(str);
    }

    private static void saveDeviceIdToSpfs(Context context, String str) {
        context.getSharedPreferences(SPFS_UUID, 0).edit().putString(SPFS_UUID_KEY, str).commit();
    }
}
