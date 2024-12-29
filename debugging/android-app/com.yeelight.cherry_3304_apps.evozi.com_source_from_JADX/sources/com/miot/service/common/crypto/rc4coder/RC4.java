package com.miot.service.common.crypto.rc4coder;

final class RC4 {

    /* renamed from: _i */
    private int f6701_i;

    /* renamed from: _j */
    private int f6702_j;

    /* renamed from: _s */
    private final byte[] f6703_s = new byte[256];

    public RC4(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < 256; i++) {
            this.f6703_s[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = b + bArr[i2 % length];
            byte[] bArr2 = this.f6703_s;
            b = (i3 + bArr2[i2]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f6701_i = 0;
        this.f6702_j = 0;
    }

    public void encrypt(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ output());
        }
    }

    public void encrypt(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            bArr[i] = (byte) (bArr[i] ^ output());
            i++;
        }
    }

    public byte output() {
        int i = (this.f6701_i + 1) & 255;
        this.f6701_i = i;
        int i2 = this.f6702_j;
        byte[] bArr = this.f6703_s;
        int i3 = (i2 + bArr[i]) & 255;
        this.f6702_j = i3;
        byte b = bArr[i];
        bArr[i] = bArr[i3];
        bArr[i3] = b;
        return bArr[(bArr[i] + bArr[i3]) & 255];
    }
}
