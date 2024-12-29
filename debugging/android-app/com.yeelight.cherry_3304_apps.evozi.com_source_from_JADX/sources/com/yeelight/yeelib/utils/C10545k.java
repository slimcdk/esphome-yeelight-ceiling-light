package com.yeelight.yeelib.utils;

import com.p146mi.iot.common.abstractdevice.AbstractDevice;

/* renamed from: com.yeelight.yeelib.utils.k */
public class C10545k {
    /* renamed from: a */
    public static void m25748a(AbstractDevice abstractDevice) {
        if (C4308b.f7482a) {
            "Device id: " + abstractDevice.getDeviceId();
            "Device address: " + abstractDevice.getDevice().getMac();
            "Device name: " + abstractDevice.getName();
            "Device online: " + abstractDevice.isOnline();
            "Device model: " + abstractDevice.getDevice().getDeviceType();
        }
    }

    /* renamed from: b */
    public static void m25749b(com.miot.common.abstractdevice.AbstractDevice abstractDevice) {
        if (C4308b.f7482a) {
            "Device id: " + abstractDevice.getDeviceId();
            "Device address: " + abstractDevice.getAddress();
            "Device name: " + abstractDevice.getName();
            "Device owner: " + abstractDevice.getOwnership().name();
            "Device online: " + abstractDevice.isOnline();
            "Device model: " + abstractDevice.getDeviceModel();
            "Device connected: " + abstractDevice.isConnectionEstablished();
            "Device connect type: " + abstractDevice.getConnectionType().name();
        }
    }
}
