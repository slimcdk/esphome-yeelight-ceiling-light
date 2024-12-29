package com.miot.api.bluetooth;

public class BtFirmwareUpdateInfo {
    public String changeLog;
    public String url;
    public String version;

    public String toString() {
        return "BtFirmwareUpdateInfo{version='" + this.version + '\'' + ", url='" + this.url + '\'' + ", changeLog='" + this.changeLog + '\'' + '}';
    }
}
