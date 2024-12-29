package miot.bluetooth.security;

import android.text.TextUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.xiaomi.mipush.sdk.Constants;

public class BLECipher {
    static {
        System.loadLibrary("blecipher");
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        if (ByteUtils.isEmpty(bArr) || ByteUtils.isEmpty(bArr2)) {
            return ByteUtils.EMPTY_BYTES;
        }
        byte[] bArr3 = new byte[bArr2.length];
        return nativeEncrypt(bArr, bArr2, bArr3) != 0 ? ByteUtils.EMPTY_BYTES : bArr3;
    }

    private static byte int2Byte(int i) {
        return (byte) (i & 255);
    }

    private static byte[] mac2Bytes(String str) {
        String[] split = str.split(Constants.COLON_SEPARATOR);
        int length = split.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[(length - i) - 1] = int2Byte(Integer.parseInt(split[i], 16));
        }
        return bArr;
    }

    public static byte[] mixA(String str, int i) {
        if (TextUtils.isEmpty(str) || i < 0) {
            return ByteUtils.EMPTY_BYTES;
        }
        byte[] bArr = new byte[8];
        return nativeMixA(mac2Bytes(str), pid2Bytes(i), bArr) != 0 ? ByteUtils.EMPTY_BYTES : bArr;
    }

    public static byte[] mixB(String str, int i) {
        if (TextUtils.isEmpty(str) || i < 0) {
            return ByteUtils.EMPTY_BYTES;
        }
        byte[] bArr = new byte[8];
        return nativeMixB(mac2Bytes(str), pid2Bytes(i), bArr) != 0 ? ByteUtils.EMPTY_BYTES : bArr;
    }

    private static native int nativeEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native int nativeMixA(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native int nativeMixB(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static byte[] pid2Bytes(int i) {
        return new byte[]{int2Byte(i), int2Byte(i >>> 8)};
    }
}
