package com.miot.service.manager.discovery;

import android.content.Context;
import com.miot.common.device.DiscoveryType;

public class DeviceScanFactory {

    /* renamed from: com.miot.service.manager.discovery.DeviceScanFactory$1 */
    static /* synthetic */ class C37921 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$device$DiscoveryType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.miot.common.device.DiscoveryType[] r0 = com.miot.common.device.DiscoveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$common$device$DiscoveryType = r0
                com.miot.common.device.DiscoveryType r1 = com.miot.common.device.DiscoveryType.MIOT_WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$miot$common$device$DiscoveryType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.device.DiscoveryType r1 = com.miot.common.device.DiscoveryType.MIOT_BLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.discovery.DeviceScanFactory.C37921.<clinit>():void");
        }
    }

    public static DeviceScan create(Context context, DiscoveryType discoveryType) {
        DeviceScan deviceScan;
        int i = C37921.$SwitchMap$com$miot$common$device$DiscoveryType[discoveryType.ordinal()];
        if (i == 1) {
            deviceScan = new WifiDeviceScan(context);
        } else if (i != 2) {
            return null;
        } else {
            deviceScan = new BleDeviceScan(context);
        }
        return deviceScan;
    }
}
