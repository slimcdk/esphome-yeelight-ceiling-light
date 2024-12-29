package miot.bluetooth.security.rc4;

public abstract class StreamCipher extends Cipher {
    public StreamCipher(int i) {
        super(i);
    }

    public abstract byte decrypt(byte b);

    public void decrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = decrypt(bArr[i + i4]);
        }
    }

    public void decrypt(byte[] bArr, byte[] bArr2) {
        decrypt(bArr, 0, bArr2, 0, bArr.length);
    }

    public abstract byte encrypt(byte b);

    public void encrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = encrypt(bArr[i + i4]);
        }
    }

    public void encrypt(byte[] bArr, byte[] bArr2) {
        encrypt(bArr, 0, bArr2, 0, bArr.length);
    }
}
