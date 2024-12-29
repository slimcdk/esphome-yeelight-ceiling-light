package com.inuker.bluetooth.library.receiver.listener;

public abstract class BleConnectStatusChangeListener extends BluetoothReceiverListener {
    public String getName() {
        return "BleConnectStatusChangeListener";
    }

    /* access modifiers changed from: protected */
    public abstract void onConnectStatusChanged(String str, int i);

    public void onInvoke(Object... objArr) {
        onConnectStatusChanged(objArr[0], objArr[1].intValue());
    }
}
