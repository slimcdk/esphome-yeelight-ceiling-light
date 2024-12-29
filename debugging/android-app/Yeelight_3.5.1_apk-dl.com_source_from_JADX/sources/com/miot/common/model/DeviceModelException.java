package com.miot.common.model;

import com.miot.common.exception.MiotException;

public class DeviceModelException extends MiotException {
    public DeviceModelException() {
    }

    public DeviceModelException(String str) {
        super(str);
    }

    public DeviceModelException(Throwable th) {
        super(th);
    }
}
