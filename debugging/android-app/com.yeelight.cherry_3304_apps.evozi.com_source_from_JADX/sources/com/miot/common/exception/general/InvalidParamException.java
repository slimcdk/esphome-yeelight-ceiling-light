package com.miot.common.exception.general;

import com.miot.common.exception.MiotException;

public class InvalidParamException extends MiotException {
    public InvalidParamException() {
    }

    public InvalidParamException(String str) {
        super(str);
    }

    public InvalidParamException(Throwable th) {
        super(th);
    }
}
