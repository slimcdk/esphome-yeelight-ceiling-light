package com.inuker.bluetooth.library.receiver.listener;

import android.content.Context;
import com.inuker.bluetooth.library.BluetoothClientImpl;

public abstract class BluetoothStateChangeListener extends BluetoothReceiverListener {
    public String getName() {
        return "BluetoothStateChangeListener";
    }

    /* access modifiers changed from: protected */
    public abstract void onBluetoothStateChanged(int i, int i2);

    public void onInvoke(Object... objArr) {
        int intValue = objArr[0].intValue();
        int intValue2 = objArr[1].intValue();
        if (intValue2 == 10 || intValue2 == 13) {
            BluetoothClientImpl.getInstance((Context) null).stopSearch();
        }
        onBluetoothStateChanged(intValue, intValue2);
    }
}
