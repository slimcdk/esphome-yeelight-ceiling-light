package com.miot.service.manager.discovery.impl.bonjour.impl.getter.impl;

import com.miot.service.manager.discovery.impl.bonjour.impl.getter.ExtraInfoGetter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ExtraInfoGetterOnKitKat implements ExtraInfoGetter {
    private static final String TAG = "ExtraInfoGetterOnKitKat";

    private Map<String, String> getDnsSdTxtRecord(Object obj) {
        Class<Integer> cls = Integer.class;
        try {
            Class<?> cls2 = Class.forName("android.net.nsd.DnsSdTxtRecord");
            try {
                Method method = cls2.getMethod("size", new Class[0]);
                Method method2 = cls2.getMethod("getValueAsString", new Class[]{cls});
                if (!(method == null || method2 == null)) {
                    method.setAccessible(true);
                    method2.setAccessible(true);
                    try {
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (invoke != null && invoke.getClass().isInstance(cls)) {
                            HashMap hashMap = new HashMap();
                            int intValue = ((Integer) invoke).intValue();
                            int i = 0;
                            while (i < intValue) {
                                try {
                                    Object invoke2 = method2.invoke(obj, new Object[]{Integer.valueOf(i)});
                                    if (invoke2 != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("value: ");
                                        sb.append(invoke2.toString());
                                    }
                                    i++;
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    return hashMap;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    return hashMap;
                                }
                            }
                            return hashMap;
                        }
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            }
        } catch (ClassNotFoundException e6) {
            e6.printStackTrace();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> get(android.net.nsd.NsdServiceInfo r6) {
        /*
            r5 = this;
            java.lang.Class<android.net.nsd.NsdServiceInfo> r0 = android.net.nsd.NsdServiceInfo.class
            r1 = 0
            java.lang.String r2 = "getTxtRecord"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x002c }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x002c }
            if (r0 != 0) goto L_0x000f
            goto L_0x0030
        L_0x000f:
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x001f, InvocationTargetException -> 0x001a }
            java.lang.Object r6 = r0.invoke(r6, r2)     // Catch:{ IllegalAccessException -> 0x001f, InvocationTargetException -> 0x001a }
            goto L_0x0024
        L_0x001a:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0023
        L_0x001f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0023:
            r6 = r1
        L_0x0024:
            if (r6 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0027:
            java.util.Map r1 = r5.getDnsSdTxtRecord(r6)
            goto L_0x0030
        L_0x002c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.discovery.impl.bonjour.impl.getter.impl.ExtraInfoGetterOnKitKat.get(android.net.nsd.NsdServiceInfo):java.util.Map");
    }
}
