package com.inuker.bluetooth.library.utils.hook;

import android.os.IBinder;
import android.os.IInterface;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.hook.utils.HookUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BluetoothManagerProxyHandler implements InvocationHandler {
    private Object bluetoothGatt;
    private Class<?> bluetoothGattClaz = HookUtils.getClass("android.bluetooth.IBluetoothGatt");
    private Object iBluetoothManager;

    BluetoothManagerProxyHandler(Object obj) {
        this.iBluetoothManager = obj;
        this.bluetoothGatt = HookUtils.invoke(HookUtils.getMethod(HookUtils.getClass("android.bluetooth.IBluetoothManager"), "getBluetoothGatt", new Class[0]), obj, new Object[0]);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        BluetoothLog.m10338v(String.format("IBluetoothManager method: %s", new Object[]{method.getName()}));
        if (!"getBluetoothGatt".equals(method.getName())) {
            return method.invoke(this.iBluetoothManager, objArr);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{IBinder.class, IInterface.class, this.bluetoothGattClaz}, new BluetoothGattProxyHandler(this.bluetoothGatt));
    }
}
