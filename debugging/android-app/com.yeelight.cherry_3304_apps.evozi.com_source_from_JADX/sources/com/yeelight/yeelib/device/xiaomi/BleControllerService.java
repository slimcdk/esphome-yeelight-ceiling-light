package com.yeelight.yeelib.device.xiaomi;

import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.abstractdevice.AbstractService;

public class BleControllerService extends AbstractService {
    private static final String TAG = "BleControllerService";
    private AbstractDevice mDevice = null;

    public BleControllerService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }
}
