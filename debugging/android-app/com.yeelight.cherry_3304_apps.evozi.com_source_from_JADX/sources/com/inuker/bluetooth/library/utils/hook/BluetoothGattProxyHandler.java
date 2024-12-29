package com.inuker.bluetooth.library.utils.hook;

import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BluetoothGattProxyHandler implements InvocationHandler {
    private Object bluetoothGatt;

    BluetoothGattProxyHandler(Object obj) {
        this.bluetoothGatt = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        BluetoothLog.m10338v(String.format("IBluetoothGatt method: %s", new Object[]{method.getName()}));
        return method.invoke(this.bluetoothGatt, objArr);
    }
}
