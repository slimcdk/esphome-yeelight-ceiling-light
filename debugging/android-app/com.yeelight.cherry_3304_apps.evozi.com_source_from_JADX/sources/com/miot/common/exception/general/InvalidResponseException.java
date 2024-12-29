package com.miot.common.exception.general;

import com.miot.common.exception.MiotException;

public class InvalidResponseException extends MiotException {
    public InvalidResponseException() {
    }

    public InvalidResponseException(String str) {
        super(str);
    }

    public InvalidResponseException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidResponseException(Throwable th) {
        super(th);
    }
}
