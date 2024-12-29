package com.inuker.bluetooth.library.receiver.listener;

import java.util.UUID;

public abstract class BleCharacterChangeListener extends BluetoothReceiverListener {
    public String getName() {
        return "BleCharacterChangeListener";
    }

    /* access modifiers changed from: protected */
    public abstract void onCharacterChanged(String str, UUID uuid, UUID uuid2, byte[] bArr);

    public void onInvoke(Object... objArr) {
        onCharacterChanged(objArr[0], objArr[1], objArr[2], objArr[3]);
    }
}
