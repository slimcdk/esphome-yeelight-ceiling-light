package com.miot.service.common.crypto.rc4coder;

import com.miot.service.common.crypto.Base64Coder;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;

public class RC4DropCoder {
    private static final int DropLength = 1024;
    private static final byte[] dropBytes;
    RC4 rc4instance;

    static {
        byte[] bArr = new byte[1024];
        dropBytes = bArr;
        Arrays.fill(bArr, (byte) 0);
    }

    public RC4DropCoder(String str) {
        this(Base64Coder.decode(str));
    }

    public RC4DropCoder(byte[] bArr) {
        if (isEmpty(bArr)) {
            throw new SecurityException("rc4 key is null");
        } else if (bArr.length == 32) {
            this.rc4instance = new RC4(bArr);
            decrypt(dropBytes);
        } else {
            throw new IllegalArgumentException("rc4Key length is invalid");
        }
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public String decrypt(String str) {
        try {
            return new String(decrypt(Base64Coder.decode(str)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new SecurityException(e);
        }
    }

    public byte[] decrypt(byte[] bArr) {
        if (bArr != null) {
            try {
                this.rc4instance.encrypt(bArr);
                return bArr;
            } catch (IllegalBlockSizeException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new IllegalBlockSizeException("no block data");
        }
    }

    public String encrypt(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = null;
        }
        return String.valueOf(Base64Coder.encode(encrypt(bArr)));
    }

    public byte[] encrypt(byte[] bArr) {
        if (bArr != null) {
            try {
                this.rc4instance.encrypt(bArr);
                return bArr;
            } catch (IllegalBlockSizeException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new IllegalBlockSizeException("no block data");
        }
    }
}
