package com.miot.common.exception;

public class MiotException extends Exception {
    public MiotException() {
    }

    public MiotException(String str) {
        super(str);
    }

    public MiotException(String str, Throwable th) {
        super(str, th);
    }

    public MiotException(Throwable th) {
        super(th);
    }
}
