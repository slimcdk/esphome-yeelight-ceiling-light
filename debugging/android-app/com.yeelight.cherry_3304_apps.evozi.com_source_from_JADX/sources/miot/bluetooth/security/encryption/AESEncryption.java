package miot.bluetooth.security.encryption;

import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.utils.AESCryptUtils;

public final class AESEncryption implements Encryption {
    public String decrypt(String str, String str2) {
        try {
            return AESCryptUtils.decrypt(str, str2);
        } catch (Throwable th) {
            BluetoothLog.m10336e(th);
            return str2;
        }
    }

    public String encrypt(String str, String str2) {
        try {
            return AESCryptUtils.encrypt(str, str2);
        } catch (Throwable th) {
            BluetoothLog.m10336e(th);
            return str2;
        }
    }
}
