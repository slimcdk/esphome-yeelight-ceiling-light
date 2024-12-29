package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattDescriptor;
import com.inuker.bluetooth.library.connect.listener.WriteDescriptorListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleWriteDescriptorRequest extends BleRequest implements WriteDescriptorListener {
    private byte[] mBytes;
    private UUID mCharacterUUID;
    private UUID mDescriptorUUID;
    private UUID mServiceUUID;

    public BleWriteDescriptorRequest(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.mDescriptorUUID = uuid3;
        this.mBytes = bArr;
    }

    private void startWrite() {
        if (!writeDescriptor(this.mServiceUUID, this.mCharacterUUID, this.mDescriptorUUID, this.mBytes)) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }

    public void onDescriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        stopRequestTiming();
        onRequestCompleted(i == 0 ? 0 : -1);
    }

    public void processRequest() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0 || !(currentStatus == 2 || currentStatus == 19)) {
            onRequestCompleted(-1);
        } else {
            startWrite();
        }
    }
}
