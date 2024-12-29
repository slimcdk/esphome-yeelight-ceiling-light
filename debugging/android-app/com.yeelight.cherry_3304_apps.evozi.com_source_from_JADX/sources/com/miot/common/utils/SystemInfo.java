package com.miot.common.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.p005os.EnvironmentCompat;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class SystemInfo {
    private static final String APP_MANUFACTURE = "xiaomi";
    private static volatile SystemInfo instance;
    private Context context;
    private String deviceId;

    private SystemInfo(Context context2) {
        this.context = context2;
    }

    public static SystemInfo getInstance(Context context2) {
        if (instance == null) {
            synchronized (SystemInfo.class) {
                if (instance == null) {
                    instance = new SystemInfo(context2);
                }
            }
        }
        return instance;
    }

    public String getAppManufacture() {
        return APP_MANUFACTURE;
    }

    public String getAppVersion() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    public String getDeviceId() {
        if (this.deviceId == null) {
            try {
                String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
                this.deviceId = (!"9774d56d682e549c".equals(string) ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : ((TelephonyManager) this.context.getSystemService("phone")).getDeviceId() != null ? UUID.nameUUIDFromBytes(this.deviceId.getBytes("utf8")) : UUID.nameUUIDFromBytes(Build.SERIAL.getBytes("utf8"))).toString();
            } catch (UnsupportedEncodingException unused) {
                this.deviceId = UUID.randomUUID().toString();
            }
        }
        return this.deviceId;
    }

    public String getDeviceModel() {
        return Build.MODEL;
    }

    public String getOsName() {
        return "Android";
    }

    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str != null ? str : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public float getScreenDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    public String getSdkVersion() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }
}
