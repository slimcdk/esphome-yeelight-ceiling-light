package com.xiaomi.push;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.xiaomi.push.i */
public class C4777i {

    /* renamed from: a */
    private static final byte[] f8862a = {100, 23, 84, 114, 72, 0, 4, 97, 73, 97, 2, 52, 84, 102, ParameterInitDefType.DoubleVec2Init, 32};

    /* renamed from: a */
    private static Cipher m14411a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f8862a);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, ivParameterSpec);
        return instance;
    }

    /* renamed from: a */
    public static byte[] m14412a(byte[] bArr, byte[] bArr2) {
        return m14411a(bArr, 2).doFinal(bArr2);
    }

    /* renamed from: b */
    public static byte[] m14413b(byte[] bArr, byte[] bArr2) {
        return m14411a(bArr, 1).doFinal(bArr2);
    }
}
