package com.miot.bluetooth;

import java.util.List;

public interface RestAPI {
    void bindDeviceSN(String str, String str2, String str3, ResponseHandler responseHandler);

    void getBluetoothFirmwareUpdateInfo(String str, ResponseHandler responseHandler);

    void getDeviceProps(String str, List<String> list, ResponseHandler responseHandler);

    void getDeviceSN(String str, String str2, String str3, String str4, ResponseHandler responseHandler);
}
