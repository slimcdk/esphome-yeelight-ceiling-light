package com.miot.service.common.crypto.rc4coder;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class RC4Coder {
    public static final String RC4_ALGORITHM = "RC4";
    private SecretKeySpec keySpec;

    public RC4Coder(byte[] bArr) {
        if (isEmpty(bArr)) {
            throw new SecurityException("rc4 key is null");
        } else if (bArr.length == 16) {
            this.keySpec = new SecretKeySpec(bArr, RC4_ALGORITHM);
        } else {
            throw new IllegalArgumentException("rc4Key is invalid");
        }
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public byte[] decrypt(byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(RC4_ALGORITHM);
            instance.init(2, this.keySpec);
            if (bArr != null) {
                return instance.doFinal(bArr);
            }
            throw new IllegalBlockSizeException("no block data");
        } catch (NoSuchAlgorithmException e) {
            throw new SecurityException(e);
        } catch (NoSuchPaddingException e2) {
            throw new SecurityException(e2);
        } catch (InvalidKeyException e3) {
            throw new SecurityException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new SecurityException(e4);
        } catch (BadPaddingException e5) {
            throw new SecurityException(e5);
        }
    }

    public byte[] encrypt(byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(RC4_ALGORITHM);
            instance.init(1, this.keySpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new SecurityException(e);
        } catch (NoSuchPaddingException e2) {
            throw new SecurityException(e2);
        } catch (InvalidKeyException e3) {
            throw new SecurityException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new SecurityException(e4);
        } catch (BadPaddingException e5) {
            throw new SecurityException(e5);
        }
    }
}
