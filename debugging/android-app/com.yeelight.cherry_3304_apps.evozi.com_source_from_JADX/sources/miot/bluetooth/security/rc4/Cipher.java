package miot.bluetooth.security.rc4;

public abstract class Cipher extends CryptoUtils {
    public int keySize;

    public Cipher(int i) {
        this.keySize = i;
    }

    public int keySize() {
        return this.keySize;
    }

    public byte[] makeKey(String str) {
        int i = this.keySize;
        if (i == 0) {
            i = str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = 0;
        }
        int i4 = 0;
        while (i2 < str.length()) {
            bArr[i4] = (byte) (bArr[i4] ^ ((byte) str.charAt(i2)));
            i2++;
            i4 = (i4 + 1) % bArr.length;
        }
        return bArr;
    }

    public void setKey(String str) {
        setKey(makeKey(str));
    }

    public abstract void setKey(byte[] bArr);

    /* access modifiers changed from: protected */
    public void swap(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }
}
