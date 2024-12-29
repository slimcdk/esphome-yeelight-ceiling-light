package com.miot.common.exception.account;

import com.miot.common.exception.MiotException;

public class AccountExpiredException extends MiotException {
    public AccountExpiredException() {
    }

    public AccountExpiredException(String str) {
        super(str);
    }

    public AccountExpiredException(String str, Throwable th) {
        super(str, th);
    }

    public AccountExpiredException(Throwable th) {
        super(th);
    }
}
