package com.miot.service.manager.discovery.impl;

import android.net.wifi.ScanResult;
import com.miot.common.utils.Logger;
import com.xiaomi.mipush.sdk.Constants;

public class MiotWifiDevice {
    private String bssid;
    private String capabilities;
    private String deviceModel;
    private int rssi;
    private ScanResult scanResult;
    private String ssid;

    public String getAddress() {
        return this.bssid;
    }

    public String getBssid() {
        return this.bssid;
    }

    public String getCapabilities() {
        return this.capabilities;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public int getRssi() {
        return this.rssi;
    }

    public ScanResult getScanResult() {
        return this.scanResult;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setCapabilities(String str) {
        this.capabilities = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setScanResult(ScanResult scanResult2) {
        this.scanResult = scanResult2;
    }

    public void setSsid(String str) {
        this.ssid = str;
        int lastIndexOf = str.lastIndexOf("_");
        if (lastIndexOf != -1) {
            this.deviceModel = this.ssid.substring(0, lastIndexOf).replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".");
        }
        Logger.m7499d("MiotWifiDevice", "deviceModel = " + this.deviceModel);
    }
}
