package com.miot.common.exception.device;

public class InvalidPropertyException extends InvalidServiceException {
    public InvalidPropertyException() {
    }

    public InvalidPropertyException(String str) {
        super(str);
    }

    public InvalidPropertyException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidPropertyException(Throwable th) {
        super(th);
    }
}
