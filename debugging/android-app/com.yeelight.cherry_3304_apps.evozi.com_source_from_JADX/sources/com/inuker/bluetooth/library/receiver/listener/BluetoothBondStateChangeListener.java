package com.inuker.bluetooth.library.receiver.listener;

public abstract class BluetoothBondStateChangeListener extends BluetoothReceiverListener {
    public String getName() {
        return "BluetoothBondStateChangeListener";
    }

    /* access modifiers changed from: protected */
    public abstract void onBondStateChanged(String str, int i);

    public void onInvoke(Object... objArr) {
        onBondStateChanged(objArr[0], objArr[1].intValue());
    }
}
