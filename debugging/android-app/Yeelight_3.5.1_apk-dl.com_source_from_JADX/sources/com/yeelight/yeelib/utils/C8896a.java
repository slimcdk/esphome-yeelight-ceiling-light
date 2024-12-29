package com.yeelight.yeelib.utils;

import androidx.core.app.NotificationCompat;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C3278f;
import p051j4.C9189e;
import p227x3.C11965b;

/* renamed from: com.yeelight.yeelib.utils.a */
public class C8896a {

    /* renamed from: a */
    private static final String f16335a = "a";

    /* renamed from: b */
    protected static final char[] f16336b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static int m21224a(byte b) {
        try {
            return Integer.parseInt(m21229f(b));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static byte[] m21225b(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            bArr[i] = m21237n(bytes[i2], bytes[i2 + 1]);
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m21226c(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length);
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X ", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Exception unused) {
            C3278f.m8797b(new AppUtils.SuicideException(f16335a, "Invalid byte"));
            return "";
        }
    }

    /* renamed from: d */
    public static String m21227d(String str) {
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
    public static short m21228e(byte b, byte b2) {
        return (short) ((b << 8) + (b2 & 255));
    }

    /* renamed from: f */
    public static String m21229f(byte b) {
        byte b2 = b & 255;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        char[] cArr = f16336b;
        sb.append(cArr[b2 >>> 4]);
        String sb2 = sb.toString();
        return sb2 + cArr[b2 & ParameterInitDefType.CubemapSamplerInit];
    }

    /* renamed from: g */
    public static String m21230g(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f16336b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    /* renamed from: h */
    public static short m21231h(byte[] bArr) {
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
    public static String[] m21232i(int i) {
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
                str = m21227d(substring);
            }
            String d = m21227d(binaryString);
            strArr[0] = str;
            strArr[1] = d;
            return strArr;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m21233j(String str) {
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
    public static TimerModel m21234k(byte[] bArr) {
        boolean z = false;
        if (bArr == null || bArr.length < 2 || bArr[1] == -1 || bArr[2] == -1) {
            TimerModel timerModel = new TimerModel();
            timerModel.setSyncId(bArr[0] & 255);
            return timerModel;
        }
        TimerModel timerModel2 = new TimerModel();
        timerModel2.setSyncId(bArr[0] & 255);
        C9189e.m22138a(NotificationCompat.CATEGORY_ALARM, "hour=" + bArr[1] + " minute=" + bArr[2]);
        timerModel2.setHour(Integer.parseInt(m21229f(bArr[1])));
        timerModel2.setMinute(Integer.parseInt(m21229f(bArr[2])));
        timerModel2.setSecond(Integer.parseInt(m21229f(bArr[3])));
        byte b = bArr[4] & 255;
        timerModel2.setMode(b);
        timerModel2.setRepeat(b != 1 ? b != 2 ? b != 3 ? "" : Integer.toString(bArr[5] & 255, 2) : "00" : String.format("%02x", new Object[]{Integer.valueOf(bArr[5] & 255)}));
        timerModel2.setGradual(bArr[7] & 255);
        timerModel2.setOn_off(bArr[8] & 255);
        timerModel2.setName(String.format("%02d", new Object[]{Integer.valueOf(timerModel2.getHour())}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(timerModel2.getMinute())}));
        timerModel2.setSyncToAlarm(bArr[9] & 255);
        if (bArr[10] != 0) {
            z = true;
        }
        timerModel2.setEnable(z);
        timerModel2.setSetUp();
        return timerModel2;
    }

    /* renamed from: l */
    public static C11965b m21235l(byte[] bArr) {
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
        String str = m21229f(b4) + m21229f(b5);
        String str2 = m21229f(b6) + m21229f(b7);
        String str3 = m21229f(b8) + m21229f(b9);
        C11965b bVar = new C11965b();
        StringBuilder sb = new StringBuilder();
        sb.append("current image: ");
        sb.append(b);
        if (b != 1) {
            z = false;
        }
        bVar.mo42521r(z);
        try {
            bVar.mo42519p(str.equals("ffff") ? 0 : Integer.parseInt(str));
            if (!str2.equals("ffff")) {
                i = Integer.parseInt(str2);
            }
            bVar.mo42520q(i);
            bVar.mo42531y(Integer.parseInt(str3));
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid firmware version, 2541 ver: ");
            sb2.append(str3);
            sb2.append(", mcua ver: ");
            sb2.append(str);
            sb2.append(", mcub ver: ");
            sb2.append(str2);
            AppUtils.m8300u("FIRMWARE_UPGRADE", "Invalid firmware version, 2541 ver: " + str3 + ", mcua ver: " + str + ", mcub ver: " + str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("version, 2541: ");
        sb3.append(bVar.mo42527u());
        sb3.append(", mcuA: ");
        sb3.append(bVar.mo42515l());
        sb3.append(", mcuB: ");
        sb3.append(bVar.mo42516m());
        return bVar;
    }

    /* renamed from: m */
    public static String m21236m(String str) {
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
    public static byte m21237n(byte b, byte b2) {
        return (byte) (((byte) (Byte.decode("0x" + new String(new byte[]{b})).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{b2})).byteValue());
    }
}
