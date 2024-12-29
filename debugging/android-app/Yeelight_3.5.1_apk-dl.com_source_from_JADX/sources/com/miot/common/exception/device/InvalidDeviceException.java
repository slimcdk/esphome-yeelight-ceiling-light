package com.miot.common.exception.device;

import com.miot.common.exception.MiotException;

public class InvalidDeviceException extends MiotException {
    public InvalidDeviceException() {
    }

    public InvalidDeviceException(String str) {
        super(str);
    }

    public InvalidDeviceException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidDeviceException(Throwable th) {
        super(th);
    }
}
