package com.p022mi.iot.common.exception;

import com.p022mi.iot.common.error.IotError;

/* renamed from: com.mi.iot.common.exception.IotException */
public class IotException extends Exception {
    private int errorCode;

    public IotException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public IotException(IotError iotError) {
        super(iotError.getMessage());
        this.errorCode = iotError.getCode();
    }

    public IotException(IotError iotError, String str) {
        super(iotError.getMessage() + " -> " + str);
        this.errorCode = iotError.getCode();
    }

    public IotException(Throwable th) {
        super(th);
    }

    public IotError toIotError() {
        return new IotError(this.errorCode, getMessage());
    }
}
