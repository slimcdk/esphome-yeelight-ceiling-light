package com.miot.common.utils;

import android.net.wifi.ScanResult;

public class DeviceUtils {

    public enum AP_TYPE {
        AP_NONE,
        AP_MIIO,
        AP_MIAP
    }

    public static String getDeviceUid(ScanResult scanResult) {
        return getDeviceUid(scanResult.SSID);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r1.indexOf("_miap");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getDeviceUid(java.lang.String r1) {
        /*
            java.lang.String r0 = "_miio"
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x000f
        L_0x0008:
            int r0 = r0 + 5
            java.lang.String r1 = r1.substring(r0)
            return r1
        L_0x000f:
            java.lang.String r0 = "_miap"
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x0018
            goto L_0x0008
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.utils.DeviceUtils.getDeviceUid(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r1.indexOf("_miap");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getDidFromMdns(java.lang.String r1) {
        /*
            java.lang.String r0 = "_miio"
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x000f
        L_0x0008:
            int r0 = r0 + 5
            java.lang.String r1 = r1.substring(r0)
            return r1
        L_0x000f:
            java.lang.String r0 = "_miap"
            int r0 = r1.indexOf(r0)
            if (r0 <= 0) goto L_0x0018
            goto L_0x0008
        L_0x0018:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.utils.DeviceUtils.getDidFromMdns(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r5.indexOf("_miap");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getModelFromMdns(java.lang.String r5) {
        /*
            java.lang.String r0 = "_miio"
            int r0 = r5.indexOf(r0)
            r1 = 46
            r2 = 45
            r3 = 0
            r4 = 1
            if (r0 <= r4) goto L_0x0017
        L_0x000e:
            java.lang.String r5 = r5.substring(r3, r0)
            java.lang.String r5 = r5.replace(r2, r1)
            return r5
        L_0x0017:
            java.lang.String r0 = "_miap"
            int r0 = r5.indexOf(r0)
            if (r0 <= r4) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.utils.DeviceUtils.getModelFromMdns(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r1 = r1 + 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.miot.common.utils.DeviceUtils.AP_TYPE isMideaDevice(android.net.wifi.ScanResult r4) {
        /*
            java.lang.String r0 = r4.BSSID
            java.lang.String r1 = "\\:"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L_0x000f
            com.miot.common.utils.DeviceUtils$AP_TYPE r4 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_NONE
            return r4
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length
            int r2 = r2 + -2
            r2 = r0[r2]
            r1.append(r2)
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r4.SSID
            java.lang.String r2 = "_miio"
            int r1 = r1.indexOf(r2)
            java.lang.String r2 = "midea"
            if (r1 <= 0) goto L_0x0055
            int r1 = r1 + 5
            java.lang.String r3 = r4.SSID
            int r3 = r3.length()
            if (r1 >= r3) goto L_0x0055
            java.lang.String r3 = r4.SSID
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r4.SSID
            java.lang.String r1 = r3.substring(r1)
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0055
            com.miot.common.utils.DeviceUtils$AP_TYPE r4 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_MIIO
            return r4
        L_0x0055:
            java.lang.String r1 = r4.SSID
            java.lang.String r3 = "_miap"
            int r1 = r1.indexOf(r3)
            if (r1 <= 0) goto L_0x0080
            int r1 = r1 + 5
            java.lang.String r3 = r4.SSID
            int r3 = r3.length()
            if (r1 >= r3) goto L_0x0080
            java.lang.String r3 = r4.SSID
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0080
            java.lang.String r4 = r4.SSID
            java.lang.String r4 = r4.substring(r1)
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0080
            com.miot.common.utils.DeviceUtils$AP_TYPE r4 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_MIAP
            return r4
        L_0x0080:
            com.miot.common.utils.DeviceUtils$AP_TYPE r4 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_NONE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.utils.DeviceUtils.isMideaDevice(android.net.wifi.ScanResult):com.miot.common.utils.DeviceUtils$AP_TYPE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r1 = r1 + 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.miot.common.utils.DeviceUtils.AP_TYPE isMiioAP(android.net.wifi.ScanResult r3) {
        /*
            java.lang.String r0 = r3.BSSID
            java.lang.String r1 = "\\:"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L_0x000f
            com.miot.common.utils.DeviceUtils$AP_TYPE r3 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_NONE
            return r3
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length
            int r2 = r2 + -2
            r2 = r0[r2]
            r1.append(r2)
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r3.SSID
            java.lang.String r2 = "_miio"
            int r1 = r1.indexOf(r2)
            if (r1 <= 0) goto L_0x004b
            int r1 = r1 + 5
            java.lang.String r2 = r3.SSID
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x004b
            java.lang.String r2 = r3.SSID
            java.lang.String r1 = r2.substring(r1)
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x004b
            com.miot.common.utils.DeviceUtils$AP_TYPE r3 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_MIIO
            return r3
        L_0x004b:
            java.lang.String r1 = r3.SSID
            java.lang.String r2 = "_miap"
            int r1 = r1.indexOf(r2)
            if (r1 <= 0) goto L_0x006e
            int r1 = r1 + 5
            java.lang.String r2 = r3.SSID
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x006e
            java.lang.String r3 = r3.SSID
            java.lang.String r3 = r3.substring(r1)
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x006e
            com.miot.common.utils.DeviceUtils$AP_TYPE r3 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_MIAP
            return r3
        L_0x006e:
            com.miot.common.utils.DeviceUtils$AP_TYPE r3 = com.miot.common.utils.DeviceUtils.AP_TYPE.AP_NONE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.utils.DeviceUtils.isMiioAP(android.net.wifi.ScanResult):com.miot.common.utils.DeviceUtils$AP_TYPE");
    }
}
