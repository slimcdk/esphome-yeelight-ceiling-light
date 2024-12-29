package com.inuker.bluetooth.library.utils.proxy;

import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.lang.reflect.Method;

public class ProxyBulk {
    public Object[] args;
    public Method method;
    public Object object;

    public ProxyBulk(Object obj, Method method2, Object[] objArr) {
        this.object = obj;
        this.method = method2;
        this.args = objArr;
    }

    public static Object safeInvoke(Object obj) {
        return ((ProxyBulk) obj).safeInvoke();
    }

    public Object safeInvoke() {
        try {
            return this.method.invoke(this.object, this.args);
        } catch (Throwable th) {
            BluetoothLog.m7330e(th);
            return null;
        }
    }
}
