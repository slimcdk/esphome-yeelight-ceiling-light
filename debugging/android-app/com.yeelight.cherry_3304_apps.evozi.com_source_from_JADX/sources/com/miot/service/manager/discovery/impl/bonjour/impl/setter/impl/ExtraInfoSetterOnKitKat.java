package com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl;

import android.net.nsd.NsdServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.ExtraInfoSetter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class ExtraInfoSetterOnKitKat implements ExtraInfoSetter {
    private static final String TAG = "ExtraInfoSetterOnKitKat";

    private Object createDnsSdTxtRecord() {
        try {
            Class<?> cls = Class.forName("android.net.nsd.DnsSdTxtRecord");
            if (cls != null) {
                Constructor[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (i < length) {
                    if (constructors[i].getTypeParameters().length == 0) {
                        try {
                            return cls.newInstance();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        i++;
                    }
                }
            }
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }
        return null;
    }

    private boolean setDnsSdTxtRecord(Object obj, Map<String, String> map) {
        Class<String> cls = String.class;
        try {
            Method method = obj.getClass().getMethod("set", new Class[]{cls, cls});
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            for (Map.Entry next : map.entrySet()) {
                try {
                    method.invoke(obj, new Object[]{next.getKey(), next.getValue()});
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

    public boolean set(NsdServiceInfo nsdServiceInfo, Map<String, String> map) {
        try {
            try {
                Method method = NsdServiceInfo.class.getMethod("setTxtRecord", new Class[]{Class.forName("android.net.nsd.DnsSdTxtRecord")});
                if (method == null) {
                    return false;
                }
                method.setAccessible(true);
                Object createDnsSdTxtRecord = createDnsSdTxtRecord();
                if (createDnsSdTxtRecord != null) {
                    setDnsSdTxtRecord(createDnsSdTxtRecord, map);
                }
                "txtRecord: " + createDnsSdTxtRecord.toString();
                try {
                    method.invoke(nsdServiceInfo, new Object[]{createDnsSdTxtRecord});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
