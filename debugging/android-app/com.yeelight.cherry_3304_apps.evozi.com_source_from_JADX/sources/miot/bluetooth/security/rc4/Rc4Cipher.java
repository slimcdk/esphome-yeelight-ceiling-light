package miot.bluetooth.security.rc4;

public class Rc4Cipher extends StreamCipher {
    private byte[] state = new byte[256];

    /* renamed from: x */
    private int f23041x;

    /* renamed from: y */
    private int f23042y;

    public Rc4Cipher(String str) {
        super(256);
        setKey(str);
    }

    public Rc4Cipher(byte[] bArr) {
        super(256);
        setKey(bArr);
    }

    private int nextState() {
        int i = (this.f23041x + 1) & 255;
        this.f23041x = i;
        int i2 = this.f23042y;
        byte[] bArr = this.state;
        int i3 = (i2 + bArr[i]) & 255;
        this.f23042y = i3;
        swap(bArr, i, i3);
        byte[] bArr2 = this.state;
        return (bArr2[this.f23041x] + bArr2[this.f23042y]) & 255;
    }

    public byte decrypt(byte b) {
        return (byte) (b ^ this.state[nextState()]);
    }

    public void decrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.state[nextState()]);
        }
    }

    public byte encrypt(byte b) {
        return (byte) (b ^ this.state[nextState()]);
    }

    public void encrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.state[nextState()]);
        }
    }

    public void setKey(byte[] bArr) {
        this.f23041x = 0;
        this.f23042y = 0;
        for (int i = 0; i < 256; i++) {
            this.state[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.state;
            b = (b + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            swap(bArr2, i2, b);
        }
    }
}
