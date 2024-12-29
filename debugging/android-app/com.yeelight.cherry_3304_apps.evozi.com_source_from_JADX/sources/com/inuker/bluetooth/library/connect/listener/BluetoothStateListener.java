package com.inuker.bluetooth.library.connect.listener;

import com.inuker.bluetooth.library.receiver.listener.BluetoothClientListener;

public abstract class BluetoothStateListener extends BluetoothClientListener {
    public abstract void onBluetoothStateChanged(boolean z);

    public void onSyncInvoke(Object... objArr) {
        onBluetoothStateChanged(objArr[0].booleanValue());
    }
}
