package miot.bluetooth.security.encryption;

import android.text.TextUtils;

public final class TokenEncryption implements Encryption {
    private static final String TOKEN_KEY = "token.key";
    private Encryption mEncryption;

    private static class TokenEncryptionHolder {
        /* access modifiers changed from: private */
        public static TokenEncryption instance = new TokenEncryption();

        private TokenEncryptionHolder() {
        }
    }

    private TokenEncryption() {
        this.mEncryption = new AESEncryption();
    }

    public static TokenEncryption getInstance() {
        return TokenEncryptionHolder.instance;
    }

    private String getPassword() {
        return String.format("%s.%s", new Object[]{TOKEN_KEY, "miot_bluetooth"});
    }

    public String decrypt(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : this.mEncryption.decrypt(str, str2);
    }

    public String decryptToken(String str) {
        return decrypt(getPassword(), str);
    }

    public String encrypt(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : this.mEncryption.encrypt(str, str2);
    }

    public String encryptToken(String str) {
        return encrypt(getPassword(), str);
    }
}
