package p011c.p091e.p092a.p093a.p100f;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.security.MessageDigest;

/* renamed from: c.e.a.a.f.d */
public final class C1251d {
    /* renamed from: a */
    public static final String m3238a(byte[] bArr) {
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
