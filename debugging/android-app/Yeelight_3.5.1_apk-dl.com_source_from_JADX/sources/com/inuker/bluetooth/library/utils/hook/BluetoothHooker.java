package com.inuker.bluetooth.library.utils.hook;

import android.os.IBinder;
import com.inuker.bluetooth.library.utils.hook.compat.ServiceManagerCompat;
import com.inuker.bluetooth.library.utils.hook.utils.HookUtils;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class BluetoothHooker {
    private static final String BLUETOOTH_MANAGER = "bluetooth_manager";

    public static void hook() {
        IBinder iBinder = (IBinder) HookUtils.invoke(ServiceManagerCompat.getService(), (Object) null, BLUETOOTH_MANAGER);
        HashMap<String, IBinder> cacheValue = ServiceManagerCompat.getCacheValue();
        cacheValue.put(BLUETOOTH_MANAGER, (IBinder) Proxy.newProxyInstance(iBinder.getClass().getClassLoader(), new Class[]{IBinder.class}, new BluetoothManagerBinderProxyHandler(iBinder)));
    }
}
