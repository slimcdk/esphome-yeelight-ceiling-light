package miot.bluetooth.security.encryption;

public interface Encryption {
    String decrypt(String str, String str2);

    String encrypt(String str, String str2);
}
