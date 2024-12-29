package miot.bluetooth.security.mesh.util;

import java.io.Serializable;

public class BleMeshFirmwareUpdateInfo implements Serializable {
    public String changeLog;
    public String md5;
    public String safeUrl;
    public String url;
    public String version;

    public String toString() {
        return "BtFirmwareUpdateInfo{version='" + this.version + '\'' + ", safeUrl='" + this.safeUrl + '\'' + ", url='" + this.url + '\'' + ", changeLog='" + this.changeLog + '\'' + ", md5='" + this.md5 + '\'' + '}';
    }
}
