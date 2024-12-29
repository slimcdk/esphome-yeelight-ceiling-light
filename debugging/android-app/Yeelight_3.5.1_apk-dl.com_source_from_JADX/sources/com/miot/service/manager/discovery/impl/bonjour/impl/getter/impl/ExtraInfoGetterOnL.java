package com.miot.service.manager.discovery.impl.bonjour.impl.getter.impl;

import android.net.nsd.NsdServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.impl.getter.ExtraInfoGetter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ExtraInfoGetterOnL implements ExtraInfoGetter {
    private static final String TAG = "ExtraInfoGetterOnL";

    private Map<String, String> getAttributes(Object obj) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            hashMap.put(entry.getKey(), new String((byte[]) entry.getValue()));
        }
        return hashMap;
    }

    public Map<String, String> get(NsdServiceInfo nsdServiceInfo) {
        try {
            Method method = nsdServiceInfo.getClass().getMethod("getAttributes", new Class[0]);
            if (method != null) {
                method.setAccessible(true);
                try {
                    Object invoke = method.invoke(nsdServiceInfo, new Object[0]);
                    if (invoke != null) {
                        return getAttributes(invoke);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
        return null;
    }
}
