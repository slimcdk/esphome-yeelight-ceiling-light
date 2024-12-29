package com.inuker.bluetooth.library.connect.listener;

import com.inuker.bluetooth.library.receiver.listener.BluetoothClientListener;

public abstract class BleConnectStatusListener extends BluetoothClientListener {
    public abstract void onConnectStatusChanged(String str, int i);

    public void onSyncInvoke(Object... objArr) {
        onConnectStatusChanged(objArr[0], objArr[1].intValue());
    }
}
