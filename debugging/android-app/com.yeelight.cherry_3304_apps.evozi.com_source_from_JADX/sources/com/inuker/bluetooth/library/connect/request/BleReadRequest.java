package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import com.inuker.bluetooth.library.connect.listener.ReadCharacterListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleReadRequest extends BleRequest implements ReadCharacterListener {
    private UUID mCharacterUUID;
    private UUID mServiceUUID;

    public BleReadRequest(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
    }

    private void startRead() {
        if (!readCharacteristic(this.mServiceUUID, this.mCharacterUUID)) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }

    public void onCharacteristicRead(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        int i2;
        stopRequestTiming();
        if (i == 0) {
            putByteArray("extra.byte.value", bArr);
            i2 = 0;
        } else {
            i2 = -1;
        }
        onRequestCompleted(i2);
    }

    public void processRequest() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0 || !(currentStatus == 2 || currentStatus == 19)) {
            onRequestCompleted(-1);
        } else {
            startRead();
        }
    }
}
