package com.miot.common.exception.account;

import com.miot.common.exception.MiotException;

public class AccountNotLoginException extends MiotException {
    public AccountNotLoginException() {
    }

    public AccountNotLoginException(String str) {
        super(str);
    }

    public AccountNotLoginException(String str, Throwable th) {
        super(str, th);
    }

    public AccountNotLoginException(Throwable th) {
        super(th);
    }
}
