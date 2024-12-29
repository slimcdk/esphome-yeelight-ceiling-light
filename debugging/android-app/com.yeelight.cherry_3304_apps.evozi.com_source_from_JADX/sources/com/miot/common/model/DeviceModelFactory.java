package com.miot.common.model;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.abstractdevice.UniversalDevice;
import java.io.IOException;

public class DeviceModelFactory {
    public static DeviceModel createDeviceModel(Context context, String str, String str2) {
        return createDeviceModel(context, str, str2, UniversalDevice.class);
    }

    public static DeviceModel createDeviceModel(Context context, String str, String str2, Class<? extends AbstractDevice> cls) {
        if (str.split("\\.").length == 3) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2.endsWith(".json") || str2.endsWith(".xml")) {
                    try {
                        context.getAssets().open(str2);
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new DeviceModelException((Throwable) e);
                    }
                } else {
                    throw new DeviceModelException("url must be end with .xml or .json for rpc device");
                }
            }
            if (cls.getSuperclass().equals(AbstractDevice.class)) {
                return new DeviceModel(str, str2, cls);
            }
            throw new DeviceModelException("clazz isn't extends AbstractDevice: " + cls);
        }
        throw new DeviceModelException("model is illegal: " + str);
    }

    public static DeviceModel createSpecDeviceModel(Context context, String str) {
        return createDeviceModel(context, str, "", UniversalDevice.class);
    }
}
