package com.miot.common.device;

public enum ConnectionType {
    UNDEFINED,
    BLE,
    MIOT_AP,
    MIOT_WIFI,
    MIOT_LAN,
    MIOT_WAN;
    
    private static final String STR_BLE = "ble";
    private static final String STR_MIOT_AP = "miot_ap";
    private static final String STR_MIOT_LAN = "miot_lan";
    private static final String STR_MIOT_WAN = "miot_wan";
    private static final String STR_MIOT_WIFI = "miot_wifi";
    private static final String STR_UNDEFINED = "undefined";

    /* renamed from: com.miot.common.device.ConnectionType$1 */
    static /* synthetic */ class C35601 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$device$ConnectionType = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.common.device.ConnectionType[] r0 = com.miot.common.device.ConnectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$common$device$ConnectionType = r0
                com.miot.common.device.ConnectionType r1 = com.miot.common.device.ConnectionType.BLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$common$device$ConnectionType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.device.ConnectionType r1 = com.miot.common.device.ConnectionType.MIOT_AP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$miot$common$device$ConnectionType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.device.ConnectionType r1 = com.miot.common.device.ConnectionType.MIOT_WIFI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$miot$common$device$ConnectionType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.device.ConnectionType r1 = com.miot.common.device.ConnectionType.MIOT_WAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$miot$common$device$ConnectionType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.device.ConnectionType r1 = com.miot.common.device.ConnectionType.MIOT_LAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.ConnectionType.C35601.<clinit>():void");
        }
    }

    public static ConnectionType retrieveType(String str) {
        return str == null ? UNDEFINED : str.equals(STR_UNDEFINED) ? UNDEFINED : str.equals(STR_BLE) ? BLE : str.equals(STR_MIOT_AP) ? MIOT_AP : str.equals(STR_MIOT_WIFI) ? MIOT_WIFI : str.equals(STR_MIOT_WAN) ? MIOT_WAN : str.equals(STR_MIOT_LAN) ? MIOT_LAN : UNDEFINED;
    }

    public String toString() {
        int i = C35601.$SwitchMap$com$miot$common$device$ConnectionType[ordinal()];
        if (i == 1) {
            return STR_BLE;
        }
        if (i == 2) {
            return STR_MIOT_AP;
        }
        if (i == 3) {
            return STR_MIOT_WIFI;
        }
        if (i == 4) {
            return STR_MIOT_WAN;
        }
        if (i != 5) {
            return null;
        }
        return STR_MIOT_LAN;
    }
}
