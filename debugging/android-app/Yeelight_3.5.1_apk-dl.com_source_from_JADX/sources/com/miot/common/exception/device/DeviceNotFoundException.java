package com.miot.common.exception.device;

import com.miot.common.exception.MiotException;

public class DeviceNotFoundException extends MiotException {
    public DeviceNotFoundException() {
    }

    public DeviceNotFoundException(String str) {
        super(str);
    }

    public DeviceNotFoundException(String str, Throwable th) {
        super(str, th);
    }

    public DeviceNotFoundException(Throwable th) {
        super(th);
    }
}
