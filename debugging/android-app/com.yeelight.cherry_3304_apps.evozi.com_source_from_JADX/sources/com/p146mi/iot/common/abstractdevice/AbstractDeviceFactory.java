package com.p146mi.iot.common.abstractdevice;

import com.p146mi.iot.common.instance.Device;

/* renamed from: com.mi.iot.common.abstractdevice.AbstractDeviceFactory */
public class AbstractDeviceFactory {
    private static final String TAG = "AbstractDeviceFactory";

    public static AbstractDevice createDevice(Device device, DeviceType deviceType) {
        StringBuilder sb;
        String str;
        if (deviceType == null) {
            sb = new StringBuilder();
            str = "no such deviceType to: ";
        } else {
            Class<? extends AbstractDevice> clazz = deviceType.getClazz();
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
        sb.append(device.getDeviceType());
        sb.toString();
        return null;
    }
}
