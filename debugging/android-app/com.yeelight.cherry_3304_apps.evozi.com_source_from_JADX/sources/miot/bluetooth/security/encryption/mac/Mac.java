package miot.bluetooth.security.encryption.mac;

import miot.bluetooth.security.encryption.params.CipherParameters;

public interface Mac {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters);

    void reset();

    void update(byte b);

    void update(byte[] bArr, int i, int i2);
}
