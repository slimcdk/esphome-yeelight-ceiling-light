package com.miot.common.exception.device;

public class InvalidActionException extends InvalidServiceException {
    public InvalidActionException() {
    }

    public InvalidActionException(String str) {
        super(str);
    }

    public InvalidActionException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidActionException(Throwable th) {
        super(th);
    }
}
