package miot.bluetooth.security.utils;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import miot.bluetooth.security.encryption.AESEngine;
import miot.bluetooth.security.encryption.exception.InvalidCipherTextException;
import miot.bluetooth.security.encryption.models.CCMBlockCipher;
import miot.bluetooth.security.encryption.params.AEADParameters;
import miot.bluetooth.security.encryption.params.KeyParameter;

public class SecurityChipUtil {
    public static final int AUTH_TAG_BIT_LENGTH = 32;

    public static byte[] AESDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return AESDecryptWithAuth(new SecretKeySpec(bArr, "AES"), bArr2, Arrays.copyOfRange(bArr3, 0, bArr3.length - 4), (byte[]) null, Arrays.copyOfRange(bArr3, bArr3.length - 4, bArr3.length));
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] AESDecryptWithAuth(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        CCMBlockCipher createAESCCMCipher = createAESCCMCipher(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[createAESCCMCipher.getOutputSize(length)];
        try {
            createAESCCMCipher.doFinal(bArr6, createAESCCMCipher.processBytes(bArr5, 0, length, bArr6, 0));
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
        }
        return bArr6;
    }

    public static byte[] AESEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return AESEncryptWithAuth(new SecretKeySpec(bArr, "AES"), bArr2, bArr3, (byte[]) null).getTotalData();
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AuthenticatedCipherText AESEncryptWithAuth(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        CCMBlockCipher createAESCCMCipher = createAESCCMCipher(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[createAESCCMCipher.getOutputSize(bArr2.length)];
        int processBytes = createAESCCMCipher.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            processBytes += createAESCCMCipher.doFinal(bArr4, processBytes);
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
        }
        int i = processBytes - 4;
        byte[] bArr5 = new byte[i];
        byte[] bArr6 = new byte[4];
        System.arraycopy(bArr4, 0, bArr5, 0, i);
        System.arraycopy(bArr4, i, bArr6, 0, 4);
        return new AuthenticatedCipherText(bArr5, bArr6);
    }

    private static CCMBlockCipher createAESCCMCipher(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        CCMBlockCipher cCMBlockCipher = new CCMBlockCipher(createAESCipher(secretKey, z));
        cCMBlockCipher.init(z, new AEADParameters(new KeyParameter(secretKey.getEncoded()), 32, bArr, bArr2));
        return cCMBlockCipher;
    }

    public static AESEngine createAESCipher(SecretKey secretKey, boolean z) {
        AESEngine aESEngine = new AESEngine();
        aESEngine.init(z, new KeyParameter(secretKey.getEncoded()));
        return aESEngine;
    }

    public static KeyPair generateEcc256KeyPair() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("secp256r1"));
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] getRawPublicKey(PublicKey publicKey) {
        byte[] publicKeyToBytes = ECCPointConvert.publicKeyToBytes((ECPublicKey) publicKey);
        return publicKeyToBytes.length == 65 ? Arrays.copyOfRange(publicKeyToBytes, 1, 65) : publicKeyToBytes;
    }

    public static SecretKey getSecret(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement instance = KeyAgreement.getInstance("ECDH");
            instance.init(privateKey);
            instance.doPhase(publicKey, true);
            return instance.generateSecret("ECDH");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] sha256HMAC(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
