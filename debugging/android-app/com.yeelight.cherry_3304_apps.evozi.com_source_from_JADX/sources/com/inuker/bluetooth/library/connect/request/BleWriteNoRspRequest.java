package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import com.inuker.bluetooth.library.connect.listener.WriteCharacterListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleWriteNoRspRequest extends BleRequest implements WriteCharacterListener {
    private byte[] mBytes;
    private UUID mCharacterUUID;
    private UUID mServiceUUID;

    public BleWriteNoRspRequest(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.mBytes = bArr;
    }

    private void startWrite() {
        if (!writeCharacteristicWithNoRsp(this.mServiceUUID, this.mCharacterUUID, this.mBytes)) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }

    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
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
