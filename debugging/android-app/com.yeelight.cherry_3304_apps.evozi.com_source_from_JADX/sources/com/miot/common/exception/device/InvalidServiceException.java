package com.miot.common.exception.device;

public class InvalidServiceException extends InvalidDeviceException {
    public InvalidServiceException() {
    }

    public InvalidServiceException(String str) {
        super(str);
    }

    public InvalidServiceException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidServiceException(Throwable th) {
        super(th);
    }
}
