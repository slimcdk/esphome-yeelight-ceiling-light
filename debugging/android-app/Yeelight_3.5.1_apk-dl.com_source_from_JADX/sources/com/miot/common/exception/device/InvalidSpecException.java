package com.miot.common.exception.device;

public class InvalidSpecException extends InvalidDeviceException {
    public InvalidSpecException() {
    }

    public InvalidSpecException(String str) {
        super(str);
    }

    public InvalidSpecException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidSpecException(Throwable th) {
        super(th);
    }
}
