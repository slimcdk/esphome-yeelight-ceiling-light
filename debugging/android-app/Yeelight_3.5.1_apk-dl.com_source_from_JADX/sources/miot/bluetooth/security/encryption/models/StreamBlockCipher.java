package miot.bluetooth.security.encryption.models;

import miot.bluetooth.security.encryption.exception.DataLengthException;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    /* access modifiers changed from: protected */
    public abstract byte calculateByte(byte b);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 + i2 <= bArr2.length) {
            int i4 = i + i2;
            if (i4 <= bArr.length) {
                while (i < i4) {
                    bArr2[i3] = calculateByte(bArr[i]);
                    i3++;
                    i++;
                }
                return i2;
            }
            throw new DataLengthException("input buffer too small");
        }
        throw new DataLengthException("output buffer too short");
    }

    public final byte returnByte(byte b) {
        return calculateByte(b);
    }
}
