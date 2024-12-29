package com.miot.common.exception.device;

public class InvalidArgumentException extends InvalidActionException {
    public InvalidArgumentException() {
    }

    public InvalidArgumentException(String str) {
        super(str);
    }

    public InvalidArgumentException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidArgumentException(Throwable th) {
        super(th);
    }
}
