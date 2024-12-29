package com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl;

import android.net.nsd.NsdServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.ExtraInfoSetter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class ExtraInfoSetterOnL implements ExtraInfoSetter {
    private static final String TAG = "ExtraInfoSetterOnL";

    public boolean set(NsdServiceInfo nsdServiceInfo, Map<String, String> map) {
        Class<String> cls = String.class;
        try {
            Method method = NsdServiceInfo.class.getMethod("setAttribute", new Class[]{cls, cls});
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            for (Map.Entry next : map.entrySet()) {
                try {
                    method.invoke(nsdServiceInfo, new Object[]{next.getKey(), next.getValue()});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return false;
        }
    }
}
