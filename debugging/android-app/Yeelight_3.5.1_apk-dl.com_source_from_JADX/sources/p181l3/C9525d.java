package p181l3;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.security.MessageDigest;

/* renamed from: l3.d */
public final class C9525d {
    /* renamed from: a */
    public static final String m23175a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(bArr);
            char[] cArr2 = new char[(r1 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & ParameterInitDefType.CubemapSamplerInit];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
