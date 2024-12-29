package miot.bluetooth.security;

import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.miot.bluetooth.BleBindResponse;

public interface IBleDeviceBinder {
    void bindDeviceToServer(BleBindResponse bleBindResponse);

    int getBindStyle();

    void readBeaconKeyFromDevice(BleReadResponse bleReadResponse);

    void readSNFromDevice(BleReadResponse bleReadResponse);

    void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse);
}
