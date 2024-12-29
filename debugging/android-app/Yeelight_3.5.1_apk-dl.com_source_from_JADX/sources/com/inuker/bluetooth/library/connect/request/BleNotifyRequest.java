package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattDescriptor;
import com.inuker.bluetooth.library.connect.listener.WriteDescriptorListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleNotifyRequest extends BleRequest implements WriteDescriptorListener {
    private UUID mCharacterUUID;
    private UUID mServiceUUID;

    public BleNotifyRequest(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
    }

    private void openNotify() {
        if (!setCharacteristicNotification(this.mServiceUUID, this.mCharacterUUID, true)) {
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
            openNotify();
        }
    }
}
