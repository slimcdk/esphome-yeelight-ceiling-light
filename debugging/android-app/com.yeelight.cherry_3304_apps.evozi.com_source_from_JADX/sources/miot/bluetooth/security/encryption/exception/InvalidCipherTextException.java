package miot.bluetooth.security.encryption.exception;

import miot.bluetooth.security.utils.CryptoException;

public class InvalidCipherTextException extends CryptoException {
    public InvalidCipherTextException() {
    }

    public InvalidCipherTextException(String str) {
        super(str);
    }

    public InvalidCipherTextException(String str, Throwable th) {
        super(str, th);
    }
}
