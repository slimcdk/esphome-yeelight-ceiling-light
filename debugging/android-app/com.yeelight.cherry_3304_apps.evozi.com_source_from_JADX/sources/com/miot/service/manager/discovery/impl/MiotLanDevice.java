package com.miot.service.manager.discovery.impl;

import com.miot.common.utils.Logger;
import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;

public class MiotLanDevice {
    private static final String SEPARATOR = "_miio";
    private static final String TAG = "MiotLanDevice";
    private String deviceId;
    private String deviceModel;
    private String host;
    private int port;

    public static MiotLanDevice createFrom(BonjourServiceInfo bonjourServiceInfo) {
        MiotLanDevice miotLanDevice = new MiotLanDevice();
        if (!miotLanDevice.parse(bonjourServiceInfo)) {
            return null;
        }
        return miotLanDevice;
    }

    private boolean parse(BonjourServiceInfo bonjourServiceInfo) {
        String[] split = bonjourServiceInfo.getName().split(SEPARATOR);
        if (split.length != 2) {
            Logger.m10630e(TAG, "parseServiceInfo failed, length:" + split.length);
            return false;
        }
        this.deviceModel = split[0];
        this.deviceId = split[1];
        this.host = bonjourServiceInfo.getIp();
        this.port = bonjourServiceInfo.getPort();
        return true;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(int i) {
        this.port = i;
    }
}
