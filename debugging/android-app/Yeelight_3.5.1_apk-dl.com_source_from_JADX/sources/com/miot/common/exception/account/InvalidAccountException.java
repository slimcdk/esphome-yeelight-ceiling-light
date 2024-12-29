package com.miot.common.exception.account;

import com.miot.common.exception.MiotException;

public class InvalidAccountException extends MiotException {
    public InvalidAccountException() {
    }

    public InvalidAccountException(String str) {
        super(str);
    }

    public InvalidAccountException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidAccountException(Throwable th) {
        super(th);
    }
}
