package com.xiaomi.account.openauth;

public class XMAuthericationException extends Exception {
    private static final long serialVersionUID = 1;

    public XMAuthericationException(String str) {
        super(str);
    }

    public XMAuthericationException(Throwable th) {
        super(th);
    }
}
