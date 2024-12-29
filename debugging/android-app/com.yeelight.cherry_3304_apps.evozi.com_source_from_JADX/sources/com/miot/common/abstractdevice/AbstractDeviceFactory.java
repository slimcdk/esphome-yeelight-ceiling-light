package com.miot.common.abstractdevice;

import com.miot.common.device.Device;
import com.miot.common.model.DeviceModel;

public class AbstractDeviceFactory {
    private static final String TAG = "AbstractDeviceFactory";

    public static AbstractDevice createDevice(Device device, DeviceModel deviceModel) {
        StringBuilder sb;
        String str;
        if (deviceModel == null) {
            sb = new StringBuilder();
            str = "no such deviceModel to: ";
        } else {
            Class<?> clazz = deviceModel.getClazz();
            if (clazz == null) {
                sb = new StringBuilder();
                str = "no such clazz to: ";
            } else {
                try {
                    return (AbstractDevice) clazz.getMethod("create", new Class[]{Device.class}).invoke((Object) null, new Object[]{device});
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        sb.append(str);
        sb.append(device.getDeviceModel());
        sb.toString();
        return null;
    }
}
