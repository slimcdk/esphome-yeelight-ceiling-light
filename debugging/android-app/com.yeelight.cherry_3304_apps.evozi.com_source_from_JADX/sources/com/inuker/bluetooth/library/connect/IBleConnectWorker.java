package com.inuker.bluetooth.library.connect;

import com.inuker.bluetooth.library.connect.listener.GattResponseListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.model.BleGattProfile;
import java.util.UUID;

public interface IBleConnectWorker {
    void clearGattResponseListener(GattResponseListener gattResponseListener);

    void closeGatt();

    boolean discoverService();

    int getCurrentStatus();

    BleGattProfile getGattProfile();

    void isCharacterExist(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse);

    boolean openGatt();

    boolean readCharacteristic(UUID uuid, UUID uuid2);

    boolean readDescriptor(UUID uuid, UUID uuid2, UUID uuid3);

    boolean readRemoteRssi();

    boolean refreshDeviceCache();

    void registerGattResponseListener(GattResponseListener gattResponseListener);

    boolean setCharacteristicIndication(UUID uuid, UUID uuid2, boolean z);

    boolean setCharacteristicNotification(UUID uuid, UUID uuid2, boolean z);

    boolean writeCharacteristic(UUID uuid, UUID uuid2, byte[] bArr);

    boolean writeCharacteristicWithNoRsp(UUID uuid, UUID uuid2, byte[] bArr);

    boolean writeDescriptor(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr);
}
