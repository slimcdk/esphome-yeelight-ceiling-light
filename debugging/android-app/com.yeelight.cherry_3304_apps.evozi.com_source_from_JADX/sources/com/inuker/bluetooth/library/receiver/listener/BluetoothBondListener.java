package com.inuker.bluetooth.library.receiver.listener;

public abstract class BluetoothBondListener extends BluetoothClientListener {
    public abstract void onBondStateChanged(String str, int i);

    public void onSyncInvoke(Object... objArr) {
        onBondStateChanged(objArr[0], objArr[1].intValue());
    }
}
