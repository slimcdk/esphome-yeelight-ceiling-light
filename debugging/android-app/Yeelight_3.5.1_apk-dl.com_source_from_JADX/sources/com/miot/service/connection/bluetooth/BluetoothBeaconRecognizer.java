package com.miot.service.connection.bluetooth;

import android.text.TextUtils;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.MiotBleDeviceConfig;
import miot.bluetooth.security.cache.BleDevicePropCache;

public class BluetoothBeaconRecognizer implements IBluetoothRecognizer {
    private static BluetoothBeaconRecognizer instance;

    private BluetoothBeaconRecognizer() {
    }

    public static BluetoothBeaconRecognizer getInstance() {
        if (instance == null) {
            synchronized (BluetoothBeaconRecognizer.class) {
                if (instance == null) {
                    instance = new BluetoothBeaconRecognizer();
                }
            }
        }
        return instance;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[Catch:{ Exception -> 0x001b }, LOOP:0: B:3:0x0009->B:6:0x0019, LOOP_START, PHI: r1 
      PHI: (r1v3 com.miot.service.connection.bluetooth.MiotBleAdvPacket) = (r1v1 com.miot.service.connection.bluetooth.MiotBleAdvPacket), (r1v4 com.miot.service.connection.bluetooth.MiotBleAdvPacket) binds: [B:2:?, B:6:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.miot.service.connection.bluetooth.MiotBleAdvPacket parseMiotBleAdvPacket(com.inuker.bluetooth.library.search.SearchResult r1, com.miot.service.connection.bluetooth.BleAdvertisement r2) {
        /*
            r1 = 0
            java.util.List r2 = r2.getItems()     // Catch:{ Exception -> 0x001b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x001b }
        L_0x0009:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x001b }
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x001b }
            com.miot.service.connection.bluetooth.BleAdvertiseItem r0 = (com.miot.service.connection.bluetooth.BleAdvertiseItem) r0     // Catch:{ Exception -> 0x001b }
            com.miot.service.connection.bluetooth.MiotBleAdvPacket r1 = com.miot.service.connection.bluetooth.MiotPacketParser.parse(r0)     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0009
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.BluetoothBeaconRecognizer.parseMiotBleAdvPacket(com.inuker.bluetooth.library.search.SearchResult, com.miot.service.connection.bluetooth.BleAdvertisement):com.miot.service.connection.bluetooth.MiotBleAdvPacket");
    }

    public String recognize(SearchResult searchResult) {
        MiotBleAdvPacket parseMiotBleAdvPacket;
        BluetoothLog.m7332v(String.format("BluetoothBeaconRecognizer.recognize for %s", new Object[]{searchResult.getAddress()}));
        byte[] bArr = searchResult.scanRecord;
        if (bArr == null || (parseMiotBleAdvPacket = parseMiotBleAdvPacket(searchResult, new BleAdvertisement(bArr))) == null) {
            return "";
        }
        BleDevicePropCache.getInstance().setPropExtra(searchResult.getAddress(), "mibeacon_auth_mode", parseMiotBleAdvPacket.frameControl.authMode);
        if (parseMiotBleAdvPacket.productId != MiotBleDeviceConfig.productId()) {
            return null;
        }
        String model = MiotBleDeviceConfig.model();
        if (!parseMiotBleAdvPacket.isComboPacket() || TextUtils.isEmpty(parseMiotBleAdvPacket.comboKey)) {
            return model;
        }
        BluetoothLog.m7328d("addCombo    " + parseMiotBleAdvPacket.comboKey + "  device.getAddress()    " + searchResult.getAddress());
        ComboCollector.addCombo(parseMiotBleAdvPacket.comboKey, searchResult.getAddress());
        return model;
    }
}
