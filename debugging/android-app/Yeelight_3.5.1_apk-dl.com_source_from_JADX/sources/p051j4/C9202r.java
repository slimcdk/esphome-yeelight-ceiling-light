package p051j4;

import com.telink.crypto.AES;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p149e3.C8964a;
import p149e3.C8965b;

/* renamed from: j4.r */
public class C9202r {

    /* renamed from: a */
    private static int f17017a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static byte[] m22197a(byte[] bArr, byte b, int i, byte[] bArr2, byte[] bArr3) {
        int d = m22200d();
        byte[] bArr4 = new byte[20];
        bArr4[0] = (byte) (d & 255);
        bArr4[1] = (byte) ((d >> 8) & 255);
        bArr4[2] = (byte) ((d >> 16) & 255);
        bArr4[3] = 0;
        bArr4[4] = 0;
        bArr4[5] = (byte) (i & 255);
        bArr4[6] = (byte) ((i >> 8) & 255);
        bArr4[7] = (byte) (b | 192);
        bArr4[8] = (byte) 100;
        bArr4[9] = (byte) 1;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr4, 10, bArr2.length);
        }
        byte[] e = m22201e(bArr, d);
        StringBuilder sb = new StringBuilder();
        sb.append("build mesh command sk = ");
        sb.append(bArr3);
        sb.append(" nonce = ");
        sb.append(e);
        sb.append(" command = ");
        sb.append(bArr4);
        if (bArr3 == null) {
            return null;
        }
        return AES.m12462c(bArr3, e, bArr4);
    }

    /* renamed from: b */
    public static byte[] m22198b(byte b, String str, byte[] bArr) {
        return m22199c(b, C8965b.m21443d(str, 16), bArr);
    }

    /* renamed from: c */
    public static byte[] m22199c(byte b, byte[] bArr, byte[] bArr2) {
        try {
            byte[] b2 = AES.m12461b(bArr2, bArr);
            C8964a.m21439e(b2, 0, b2.length - 1);
            byte[] bArr3 = new byte[17];
            bArr3[0] = b;
            System.arraycopy(b2, 0, bArr3, 1, b2.length);
            return bArr3;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private static int m22200d() {
        if (f17017a > 16777215) {
            f17017a = Math.round(((float) Math.random()) * ((float) 16777214)) + 1;
        }
        int i = f17017a + 1;
        f17017a = i;
        return i;
    }

    /* renamed from: e */
    private static byte[] m22201e(byte[] bArr, int i) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[4] = 1;
        bArr2[5] = (byte) (i & 255);
        bArr2[6] = (byte) ((i >> 8) & 255);
        bArr2[7] = (byte) ((i >> 16) & 255);
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m22202f(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = bArr[0];
        bArr2[1] = bArr[1];
        bArr2[2] = bArr[2];
        return bArr2;
    }
}
