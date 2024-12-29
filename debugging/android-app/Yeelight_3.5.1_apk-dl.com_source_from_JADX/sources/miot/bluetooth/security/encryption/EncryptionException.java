package miot.bluetooth.security.encryption;

public class EncryptionException extends Exception {
    private static final long serialVersionUID = 4405557080464242482L;

    public EncryptionException() {
    }

    public EncryptionException(String str) {
        super(str);
    }

    public EncryptionException(String str, Throwable th) {
        super(str, th);
    }

    public EncryptionException(Throwable th) {
        super(th);
    }
}
