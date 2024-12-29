package com.inuker.bluetooth.library.connect;

import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public interface IBleConnectMaster {
    void clearRequest(int i);

    void connect(BleConnectOptions bleConnectOptions, BleGeneralResponse bleGeneralResponse);

    void disconnect();

    void indicate(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    void isCharacterExist(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    void notify(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    void read(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    void readDescriptor(UUID uuid, UUID uuid2, UUID uuid3, BleGeneralResponse bleGeneralResponse);

    void readRssi(BleGeneralResponse bleGeneralResponse);

    void unnotify(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    void write(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse);

    void writeDescriptor(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr, BleGeneralResponse bleGeneralResponse);

    void writeNoRsp(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse);

    void writeNoRspFast(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse);
}
