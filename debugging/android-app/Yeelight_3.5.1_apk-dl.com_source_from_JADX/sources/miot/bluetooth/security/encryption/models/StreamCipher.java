package miot.bluetooth.security.encryption.models;

import miot.bluetooth.security.encryption.params.CipherParameters;

public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z, CipherParameters cipherParameters);

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    void reset();

    byte returnByte(byte b);
}
