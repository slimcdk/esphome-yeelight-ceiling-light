package com.inuker.bluetooth.library.utils.hook.compat;

import android.os.IBinder;
import com.inuker.bluetooth.library.utils.hook.utils.HookUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ServiceManagerCompat {
    private static Method getService = HookUtils.getMethod(serviceManager, "getService", String.class);
    private static Field sCache;
    private static Class<?> serviceManager;

    static {
        Class<?> cls = HookUtils.getClass("android.os.ServiceManager");
        serviceManager = cls;
        Field field = HookUtils.getField(cls, "sCache");
        sCache = field;
        field.setAccessible(true);
    }

    public static Field getCacheField() {
        return sCache;
    }

    public static HashMap<String, IBinder> getCacheValue() {
        return (HashMap) HookUtils.getValue(sCache);
    }

    public static Method getService() {
        return getService;
    }

    public static Class<?> getServiceManager() {
        return serviceManager;
    }
}
