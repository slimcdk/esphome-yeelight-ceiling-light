package com.inuker.bluetooth.library.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import com.inuker.bluetooth.library.connect.listener.WriteCharacterListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import java.util.UUID;

public class BleWriteNoRspFastRequest extends BleRequest implements IFastSchedule, WriteCharacterListener {
    private byte[] mBytes;
    private UUID mCharacterUUID;
    private UUID mServiceUUID;

    public BleWriteNoRspFastRequest(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.mBytes = bArr;
    }

    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        stopRequestTiming();
        onRequestCompleted(i == 0 ? 0 : -1);
    }

    public void processRequest() {
        if (!writeCharacteristicWithNoRsp(this.mServiceUUID, this.mCharacterUUID, this.mBytes)) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }
}
