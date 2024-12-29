package miot.bluetooth.security.encryption.models;

import miot.bluetooth.security.encryption.params.CipherParameters;

public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i2);

    void reset();
}
