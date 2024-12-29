package com.yeelight.yeelib.utils;

import androidx.core.app.NotificationCompat;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.models.C7614c;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.utils.d */
public class C10539d {

    /* renamed from: a */
    private static final String f20162a = "d";

    /* renamed from: b */
    protected static final char[] f20163b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static int m25670a(byte b) {
        try {
            return Integer.parseInt(m25675f(b));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static byte[] m25671b(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            bArr[i] = m25683n(bytes[i2], bytes[i2 + 1]);
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m25672c(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length);
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X ", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Exception unused) {
            C4310h.m12146b(new C4308b.C4309a(f20162a, "Invalid byte"));
            return "";
        }
    }

    /* renamed from: d */
    public static String m25673d(String str) {
        if (str == null || str.equals("") || str.length() % 8 != 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = i + i3;
                i2 += Integer.parseInt(str.substring(i4, i4 + 1)) << ((4 - i3) - 1);
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static short m25674e(byte b, byte b2) {
        return (short) ((b << 8) + (b2 & 255));
    }

    /* renamed from: f */
    public static String m25675f(byte b) {
        byte b2 = b & 255;
        return ("" + f20163b[b2 >>> 4]) + f20163b[b2 & ParameterInitDefType.CubemapSamplerInit];
    }

    /* renamed from: g */
    public static String m25676g(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f20163b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    /* renamed from: h */
    public static short m25677h(byte[] bArr) {
        int length = bArr.length;
        short s = 0;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return s;
            }
            int i3 = i + 1;
            short s2 = (short) bArr[i];
            for (int i4 = 0; i4 < 8; i4++) {
                boolean z = true;
                boolean z2 = (32768 & s) != 0;
                if ((s2 & 128) == 0) {
                    z = false;
                }
                int i5 = s << 1;
                if (z2 != z) {
                    i5 ^= 4129;
                }
                s = (short) i5;
                s2 = (short) (s2 << 1);
            }
            i = i3;
            length = i2;
        }
    }

    /* renamed from: i */
    public static String[] m25678i(int i) {
        String[] strArr = new String[2];
        String str = "00";
        try {
            String binaryString = Integer.toBinaryString(i);
            if (binaryString.length() <= 8) {
                while (binaryString.length() < 8) {
                    binaryString = TimerCodec.DISENABLE + binaryString;
                }
            } else {
                String substring = binaryString.substring(0, binaryString.length() - 8);
                while (substring.length() < 8) {
                    substring = TimerCodec.DISENABLE + substring;
                }
                binaryString = binaryString.substring(binaryString.length() - 8);
                str = m25673d(substring);
            }
            String d = m25673d(binaryString);
            strArr[0] = str;
            strArr[1] = d;
            return strArr;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m25679j(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    /* renamed from: k */
    public static C7561k m25680k(byte[] bArr) {
        boolean z = false;
        if (bArr == null || bArr.length < 2 || bArr[1] == -1 || bArr[2] == -1) {
            C7561k kVar = new C7561k();
            kVar.mo28938D(bArr[0] & 255);
            return kVar;
        }
        C7561k kVar2 = new C7561k();
        kVar2.mo28938D(bArr[0] & 255);
        C10543g.m25740a(NotificationCompat.CATEGORY_ALARM, "hour=" + bArr[1] + " minute=" + bArr[2]);
        kVar2.mo28959u(Integer.parseInt(m25675f(bArr[1])));
        kVar2.mo28960v(Integer.parseInt(m25675f(bArr[2])));
        kVar2.mo28936B(Integer.parseInt(m25675f(bArr[3])));
        byte b = bArr[4] & 255;
        kVar2.mo28961w(b);
        kVar2.mo28964z(b != 1 ? b != 2 ? b != 3 ? "" : Integer.toString(bArr[5] & 255, 2) : "00" : String.format("%02x", new Object[]{Integer.valueOf(bArr[5] & 255)}));
        kVar2.mo28958t(bArr[7] & 255);
        kVar2.mo28963y(bArr[8] & 255);
        kVar2.mo28962x(String.format("%02d", new Object[]{Integer.valueOf(kVar2.mo28942d())}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(kVar2.mo28943e())}));
        kVar2.mo28939E(bArr[9] & 255);
        if (bArr[10] != 0) {
            z = true;
        }
        kVar2.mo28957s(z);
        kVar2.mo28937C();
        return kVar2;
    }

    /* renamed from: l */
    public static C7614c m25681l(byte[] bArr) {
        int i = 0;
        byte b = bArr[0];
        boolean z = true;
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte b5 = bArr[4];
        byte b6 = bArr[5];
        byte b7 = bArr[6];
        byte b8 = bArr[7];
        byte b9 = bArr[8];
        byte b10 = bArr[9];
        byte b11 = bArr[10];
        String str = m25675f(b4) + m25675f(b5);
        String str2 = m25675f(b6) + m25675f(b7);
        String str3 = m25675f(b8) + m25675f(b9);
        C7614c cVar = new C7614c();
        "current image: " + b;
        if (b != 1) {
            z = false;
        }
        cVar.mo29050r(z);
        try {
            cVar.mo29048p(str.equals("ffff") ? 0 : Integer.parseInt(str));
            if (!str2.equals("ffff")) {
                i = Integer.parseInt(str2);
            }
            cVar.mo29049q(i);
            cVar.mo29060y(Integer.parseInt(str3));
        } catch (NumberFormatException unused) {
            "Invalid firmware version, 2541 ver: " + str3 + ", mcua ver: " + str + ", mcub ver: " + str2;
            C4308b.m12139r("FIRMWARE_UPGRADE", "Invalid firmware version, 2541 ver: " + str3 + ", mcua ver: " + str + ", mcub ver: " + str2);
        }
        "version, 2541: " + cVar.mo29056u() + ", mcuA: " + cVar.mo29044l() + ", mcuB: " + cVar.mo29045m();
        return cVar;
    }

    /* renamed from: m */
    public static String m25682m(String str) {
        try {
            byte[] bytes = str.getBytes("utf-8");
            String str2 = "";
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                String format = String.format("%02x", new Object[]{Byte.valueOf(bytes[i])});
                if (format.length() > 2) {
                    format = format.substring(format.length() - 2);
                }
                str2 = str2 + format;
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static byte m25683n(byte b, byte b2) {
        return (byte) (((byte) (Byte.decode("0x" + new String(new byte[]{b})).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{b2})).byteValue());
    }
}
