package miot.bluetooth.security.utils;

public final class AuthenticatedCipherText {
    private final byte[] authenticationTag;
    private final byte[] cipherText;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.cipherText = bArr;
            if (bArr2 != null) {
                this.authenticationTag = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public byte[] getAuthenticationTag() {
        return this.authenticationTag;
    }

    public byte[] getCipherText() {
        return this.cipherText;
    }

    public byte[] getTotalData() {
        byte[] bArr = this.cipherText;
        byte[] bArr2 = new byte[(bArr.length + this.authenticationTag.length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.authenticationTag;
        System.arraycopy(bArr3, 0, bArr2, this.cipherText.length, bArr3.length);
        return bArr2;
    }
}
