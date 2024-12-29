package miot.bluetooth.security.utils;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private final String algorithm;
    private SecretKey prk = null;
    private final Provider provider;

    private Hkdf(String str) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            this.provider = null;
            return;
        }
        throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
    }

    private Hkdf(String str, Provider provider2) {
        if (str.startsWith("Hmac")) {
            this.algorithm = str;
            this.provider = provider2;
            return;
        }
        throw new IllegalArgumentException("Invalid algorithm " + str + ". Hkdf may only be used with Hmac algorithms.");
    }

    private void assertInitialized() {
        if (this.prk == null) {
            throw new IllegalStateException("Hkdf has not been initialized");
        }
    }

    private Mac createMac() {
        try {
            Mac instance = this.provider != null ? Mac.getInstance(this.algorithm, this.provider) : Mac.getInstance(this.algorithm);
            instance.init(this.prk);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Hkdf getInstance(String str) {
        Mac.getInstance(str);
        return new Hkdf(str);
    }

    public static Hkdf getInstance(String str, String str2) {
        return new Hkdf(str, Mac.getInstance(str, str2).getProvider());
    }

    public static Hkdf getInstance(String str, Provider provider2) {
        return new Hkdf(str, Mac.getInstance(str, provider2).getProvider());
    }

    public void deriveKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        assertInitialized();
        if (i < 0) {
            throw new IllegalArgumentException("Length must be a non-negative value.");
        } else if (bArr2.length >= i2 + i) {
            Mac createMac = createMac();
            if (i <= createMac.getMacLength() * 255) {
                byte[] bArr3 = EMPTY_ARRAY;
                byte b = 1;
                int i3 = 0;
                while (i3 < i) {
                    try {
                        createMac.update(bArr3);
                        createMac.update(bArr);
                        createMac.update(b);
                        bArr3 = createMac.doFinal();
                        int i4 = 0;
                        while (i4 < bArr3.length && i3 < i) {
                            bArr2[i3] = bArr3[i4];
                            i4++;
                            i3++;
                        }
                        b = (byte) (b + 1);
                    } catch (Throwable th) {
                        Arrays.fill(bArr3, (byte) 0);
                        throw th;
                    }
                }
                Arrays.fill(bArr3, (byte) 0);
                return;
            }
            throw new IllegalArgumentException("Requested keys may not be longer than 255 times the underlying HMAC length.");
        } else {
            throw new ShortBufferException();
        }
    }

    public byte[] deriveKey(String str, int i) {
        return deriveKey(str != null ? str.getBytes(Charset.forName("UTF-8")) : null, i);
    }

    public byte[] deriveKey(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        try {
            deriveKey(bArr, i, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void init(byte[] bArr) {
        init(bArr, (byte[]) null);
    }

    public void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? EMPTY_ARRAY : (byte[]) bArr2.clone();
        byte[] bArr4 = EMPTY_ARRAY;
        try {
            Mac instance = this.provider != null ? Mac.getInstance(this.algorithm, this.provider) : Mac.getInstance(this.algorithm);
            if (bArr3.length == 0) {
                bArr3 = new byte[instance.getMacLength()];
                Arrays.fill(bArr3, (byte) 0);
            }
            instance.init(new SecretKeySpec(bArr3, this.algorithm));
            byte[] doFinal = instance.doFinal(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(doFinal, this.algorithm);
            Arrays.fill(doFinal, (byte) 0);
            unsafeInitWithoutKeyExtraction(secretKeySpec);
            Arrays.fill(doFinal, (byte) 0);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Unexpected exception", e);
        } catch (Throwable th) {
            Arrays.fill(bArr4, (byte) 0);
            throw th;
        }
    }

    public void unsafeInitWithoutKeyExtraction(SecretKey secretKey) {
        if (secretKey.getAlgorithm().equals(this.algorithm)) {
            this.prk = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + secretKey.getAlgorithm());
    }
}
