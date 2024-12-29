package miot.bluetooth.security.encryption;

public interface EncryptionAlgorithm {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
