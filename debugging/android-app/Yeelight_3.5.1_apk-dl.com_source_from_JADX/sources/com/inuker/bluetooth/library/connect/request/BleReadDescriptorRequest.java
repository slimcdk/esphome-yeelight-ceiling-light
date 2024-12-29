package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattDescriptor;
import com.inuker.bluetooth.library.connect.listener.ReadDescriptorListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleReadDescriptorRequest extends BleRequest implements ReadDescriptorListener {
    private UUID mCharacterUUID;
    private UUID mDescriptorUUID;
    private UUID mServiceUUID;

    public BleReadDescriptorRequest(UUID uuid, UUID uuid2, UUID uuid3, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.mDescriptorUUID = uuid3;
    }

    private void startRead() {
        if (!readDescriptor(this.mServiceUUID, this.mCharacterUUID, this.mDescriptorUUID)) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }

    public void onDescriptorRead(BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
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
