package com.miot.common.exception.general;

import com.miot.common.exception.MiotException;

public class InvalidRequestException extends MiotException {
    public InvalidRequestException() {
    }

    public InvalidRequestException(String str) {
        super(str);
    }

    public InvalidRequestException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidRequestException(Throwable th) {
        super(th);
    }
}
