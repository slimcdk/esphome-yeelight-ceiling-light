package p051j4;

import android.graphics.Color;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.BleMessage;
import com.yeelight.yeelib.utils.C8896a;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p227x3.C11967d;
import p232y3.C12043g;
import p232y3.C12045h;

/* renamed from: j4.c */
public class C9186c {

    /* renamed from: j4.c$a */
    static /* synthetic */ class C9187a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17009a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode[] r0 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17009a = r0
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17009a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17009a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17009a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r1 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051j4.C9186c.C9187a.<clinit>():void");
        }
    }

    /* renamed from: A */
    public static C11967d m22082A() {
        return m22083B(0);
    }

    /* renamed from: B */
    public static C11967d m22083B(int i) {
        String str;
        String str2 = BleMessage.READALARM.value;
        Object[] objArr = new Object[1];
        if (i == 0) {
            str = "ff";
        } else {
            str = TimerCodec.DISENABLE + i;
        }
        objArr[0] = str;
        return new C11967d(str2, objArr);
    }

    /* renamed from: C */
    public static C11967d m22084C(int i) {
        String str = BleMessage.REQUEST_OTA.value;
        Object[] objArr = new Object[1];
        if (i == 1) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        return new C11967d(str, objArr);
    }

    /* renamed from: D */
    public static C11967d m22085D(C3012e eVar) {
        String str;
        String str2;
        String str3;
        String str4 = BleMessage.SIMPLECOLORFLOW.value;
        int i = eVar.mo23221d0().mo31619v().mo42695i();
        if (i < 1000) {
            i = 1000;
        }
        if (i > 600000) {
            i = 600000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cherry: parseSaveColorFlow interval = ");
        int i2 = i / 1000;
        sb.append(i2);
        int i3 = 0;
        Object[] objArr = {TimerCodec.DISENABLE + 2, "01", String.format("%02x", new Object[]{Integer.valueOf(i2)}), "04", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00"};
        List<C12043g.C12044a> o = eVar.mo23221d0().mo31605o();
        while (i3 < o.size()) {
            int red = Color.red(eVar.mo23221d0().mo31605o().get(i3).mo42713a());
            int green = Color.green(eVar.mo23221d0().mo31605o().get(i3).mo42713a());
            int blue = Color.blue(eVar.mo23221d0().mo31605o().get(i3).mo42713a());
            i3++;
            int i4 = i3 * 3;
            int i5 = i4 + 1;
            objArr[i5] = Integer.toHexString(red);
            if (objArr[i5].toString().length() < 2) {
                str = TimerCodec.DISENABLE + objArr[i5].toString();
            } else {
                str = objArr[i5].toString();
            }
            objArr[i5] = str;
            int i6 = i4 + 2;
            objArr[i6] = Integer.toHexString(green);
            if (objArr[i6].toString().length() < 2) {
                str2 = TimerCodec.DISENABLE + objArr[i6].toString();
            } else {
                str2 = objArr[i6].toString();
            }
            objArr[i6] = str2;
            int i7 = i4 + 3;
            objArr[i7] = Integer.toHexString(blue);
            if (objArr[i7].toString().length() < 2) {
                str3 = TimerCodec.DISENABLE + objArr[i7].toString();
            } else {
                str3 = objArr[i7].toString();
            }
            objArr[i7] = str3;
        }
        return new C11967d(str4, objArr);
    }

    /* renamed from: E */
    public static C11967d m22086E(DeviceStatusBase.DeviceMode deviceMode, C3012e eVar) {
        String str;
        String str2;
        String str3;
        String str4 = BleMessage.COLORLFOW.value;
        int i = C9187a.f17009a[deviceMode.ordinal()];
        int i2 = (i == 1 || i == 2) ? 3 : i != 3 ? i != 4 ? 0 : 1 : 2;
        int red = Color.red(eVar.mo23221d0().mo31603n());
        int green = Color.green(eVar.mo23221d0().mo31603n());
        int blue = Color.blue(eVar.mo23221d0().mo31603n());
        Object[] objArr = new Object[13];
        objArr[0] = TimerCodec.DISENABLE + i2;
        objArr[1] = "01";
        objArr[2] = "04";
        if (i2 == 3) {
            objArr[3] = "01";
        } else if (i2 == 1) {
            objArr[3] = "02";
        } else if (i2 == 2) {
            objArr[3] = "01";
        }
        if (i2 == 3) {
            objArr[4] = Integer.toHexString(red);
            if (objArr[4].toString().length() < 2) {
                str = TimerCodec.DISENABLE + objArr[4].toString();
            } else {
                str = objArr[4].toString();
            }
            objArr[4] = str;
            objArr[5] = Integer.toHexString(green);
            if (objArr[5].toString().length() < 2) {
                str2 = TimerCodec.DISENABLE + objArr[5].toString();
            } else {
                str2 = objArr[5].toString();
            }
            objArr[5] = str2;
            objArr[6] = Integer.toHexString(blue);
            if (objArr[6].toString().length() < 2) {
                str3 = TimerCodec.DISENABLE + objArr[6].toString();
            } else {
                str3 = objArr[6].toString();
            }
            objArr[6] = str3;
        } else {
            objArr[4] = "00";
            objArr[5] = "00";
            objArr[6] = "00";
        }
        objArr[7] = "00";
        objArr[8] = "00";
        if (i2 == 1) {
            String[] i3 = C8896a.m21232i(eVar.mo23221d0().mo31607p());
            objArr[9] = i3[0];
            objArr[10] = i3[1];
        } else {
            objArr[9] = "00";
            objArr[10] = "00";
        }
        objArr[11] = "00";
        objArr[12] = "00";
        return new C11967d(str4, objArr);
    }

    /* renamed from: F */
    public static C11967d m22087F(int i) {
        String str = BleMessage.COLORLFOW.value;
        return new C11967d(str, new Object[]{TimerCodec.DISENABLE + i, "01", "01", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00"});
    }

    /* renamed from: G */
    public static C11967d m22088G(boolean z) {
        String str = BleMessage.ONOFF.value;
        Object[] objArr = new Object[1];
        if (z) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        return new C11967d(str, objArr);
    }

    /* renamed from: H */
    public static C11967d m22089H() {
        return new C11967d(BleMessage.SWITCH_OAD.value, new Object[]{(byte) 67, (byte) 102});
    }

    /* renamed from: I */
    public static C11967d m22090I(int i) {
        String str;
        String str2;
        String str3 = BleMessage.SYNC_ID.value;
        Object[] objArr = new Object[2];
        byte b = (byte) (i >> 8);
        if (Integer.toHexString(b).length() < 2) {
            str = TimerCodec.DISENABLE + Integer.toHexString(b);
        } else {
            str = Integer.toHexString(b);
        }
        objArr[0] = str;
        byte b2 = (byte) (i & 255);
        if (Integer.toHexString(b2).length() < 2) {
            str2 = TimerCodec.DISENABLE + Integer.toHexString(b2);
        } else {
            str2 = Integer.toHexString(b2);
        }
        objArr[1] = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("objs[0]: ");
        sb.append(objArr[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("objs[1]: ");
        sb2.append(objArr[1]);
        return new C11967d(str3, objArr);
    }

    /* renamed from: J */
    public static C11967d m22091J(int i, int i2) {
        String str = BleMessage.COLORTEMPERATURE.value;
        Object[] objArr = new Object[3];
        C9189e.m22138a("TAG", "parse temperature = " + i);
        objArr[0] = String.format("%02x", new Object[]{Integer.valueOf(i >> 8)});
        objArr[1] = String.format("%02x", new Object[]{Integer.valueOf(i & 255)});
        if (i2 == -1) {
            objArr[2] = "00";
        } else {
            Object[] objArr2 = new Object[1];
            if (i2 < 10) {
                i2 = 10;
            }
            objArr2[0] = Integer.valueOf(i2);
            objArr[2] = String.format("%02x", objArr2);
        }
        return new C11967d(str, objArr);
    }

    /* renamed from: K */
    public static C11967d m22092K() {
        return new C11967d(BleMessage.READALLBEACON.value, new Object[]{"00"});
    }

    /* renamed from: L */
    public static C11967d m22093L() {
        return new C11967d(BleMessage.READDELAYTIME.value, new Object[]{"00"});
    }

    /* renamed from: M */
    public static C11967d m22094M() {
        return new C11967d(BleMessage.GINGKOQUERYFACTORY.value, new Object[]{"00"});
    }

    /* renamed from: N */
    public static C11967d m22095N() {
        return new C11967d(BleMessage.READGINGKOBATTERY.value, new Object[]{"00"});
    }

    /* renamed from: O */
    public static C11967d m22096O() {
        return new C11967d(BleMessage.READNIGHTLIGHT.value, new Object[]{"00"});
    }

    /* renamed from: P */
    public static C11967d m22097P() {
        return new C11967d(BleMessage.WAKEUPREAD.value, new Object[]{"06"});
    }

    /* renamed from: Q */
    public static C11967d m22098Q(int[] iArr, int i) {
        Object[] objArr = new Object[16];
        Arrays.fill(objArr, "00");
        objArr[0] = "06";
        objArr[1] = "01";
        objArr[2] = String.format("%02x", new Object[]{Integer.valueOf(i)});
        objArr[3] = "01";
        int i2 = 0;
        while (i2 < iArr.length && i2 <= 3) {
            int i3 = i2 * 3;
            objArr[i3 + 4] = String.format("%02x", new Object[]{Integer.valueOf(Color.red(iArr[i2]))});
            objArr[i3 + 5] = String.format("%02x", new Object[]{Integer.valueOf(Color.green(iArr[i2]))});
            objArr[i3 + 6] = String.format("%02x", new Object[]{Integer.valueOf(Color.blue(iArr[i2]))});
            i2++;
        }
        return new C11967d(BleMessage.SIMPLECOLORFLOW.value, objArr);
    }

    /* renamed from: R */
    public static C11967d m22099R() {
        return new C11967d(BleMessage.READRECORDS.value, new Object[]{"00"});
    }

    /* renamed from: S */
    public static C11967d m22100S() {
        return new C11967d(BleMessage.RESET.value, new Object[]{String.format("%02x", new Object[]{0})});
    }

    /* renamed from: T */
    public static C11967d m22101T(int i, int i2) {
        return new C11967d(BleMessage.SETDELAYTIME.value, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)}), String.format("%02x", new Object[]{Integer.valueOf(i2)})});
    }

    /* renamed from: U */
    public static C11967d m22102U(int i, int i2) {
        return new C11967d(BleMessage.SETDELAYTIME.value, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)}), String.format("%02x", new Object[]{2}), String.format("%02x", new Object[]{Integer.valueOf(i2)})});
    }

    /* renamed from: V */
    public static C11967d m22103V(C12045h hVar) {
        Object[] objArr = new Object[6];
        objArr[0] = hVar.mo42721e() ? "01" : "00";
        objArr[1] = "01";
        objArr[2] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo42717a())});
        objArr[3] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo42718b())});
        objArr[4] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo42719c())});
        objArr[5] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo42720d())});
        return new C11967d(BleMessage.SETNIGHTLIGHT.value, objArr);
    }

    /* renamed from: a */
    public static C11967d m22104a(int i, int i2, int i3, int i4, String[] strArr, boolean z) {
        return m22113j(BleMessage.WAKEUPSET.value, 6, i, i2, i3, i4, strArr, 30, 1, true, z);
    }

    /* renamed from: b */
    public static C11967d m22105b(int i) {
        return new C11967d(BleMessage.DELETEALAARM.value, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)})});
    }

    /* renamed from: c */
    public static C11967d m22106c(String[] strArr) {
        String str = BleMessage.DELETEAUTHORIZE.value;
        Object[] objArr = new Object[strArr.length];
        System.arraycopy(strArr, 0, objArr, 0, strArr.length);
        return new C11967d(str, objArr);
    }

    /* renamed from: d */
    public static C11967d m22107d() {
        return new C11967d(BleMessage.GINGKOEXITFACTORY.value, new Object[]{"00"});
    }

    /* renamed from: e */
    public static C11967d m22108e() {
        return new C11967d(BleMessage.CHECK_CRC.value, new Object[0]);
    }

    /* renamed from: f */
    private static String m22109f(String str) {
        return new BigInteger(str, 2).toString(16);
    }

    /* renamed from: g */
    public static C11967d m22110g(int i) {
        String num = Integer.toString(i);
        while (num.length() < 4) {
            num = TimerCodec.DISENABLE + num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("finish ota, version: ");
        sb.append(num);
        return new C11967d(BleMessage.FINISH_OTA.value, new Object[]{num.substring(0, 2), num.substring(2, 4)});
    }

    /* renamed from: h */
    public static C11967d m22111h(int i) {
        String str;
        String str2;
        String str3 = BleMessage.WRITE_FLASH.value;
        Object[] objArr = new Object[2];
        byte b = (byte) (i >> 8);
        if (Integer.toHexString(b).length() < 2) {
            str = TimerCodec.DISENABLE + Integer.toHexString(b);
        } else {
            str = Integer.toHexString(b);
        }
        objArr[0] = str;
        byte b2 = (byte) (i & 255);
        if (Integer.toHexString(b2).length() < 2) {
            str2 = TimerCodec.DISENABLE + Integer.toHexString(b2);
        } else {
            str2 = Integer.toHexString(b2);
        }
        objArr[1] = str2;
        return new C11967d(str3, objArr);
    }

    /* renamed from: i */
    private static String m22112i(int i) {
        return String.format("%02d", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: j */
    private static C11967d m22113j(String str, int i, int i2, int i3, int i4, int i5, String[] strArr, int i6, int i7, boolean z, boolean z2) {
        StringBuilder sb;
        StringBuilder sb2;
        int i8 = i2;
        int i9 = i3;
        int i10 = i5;
        String[] strArr2 = strArr;
        Object[] objArr = new Object[11];
        StringBuilder sb3 = new StringBuilder();
        sb3.append(TimerCodec.DISENABLE);
        int i11 = i;
        sb3.append(i);
        objArr[0] = sb3.toString();
        String str2 = "";
        if (i8 < 10) {
            sb.append(TimerCodec.DISENABLE);
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(str2);
        }
        objArr[1] = sb.toString();
        if (i9 < 10) {
            sb2.append(TimerCodec.DISENABLE);
        } else {
            sb2 = new StringBuilder();
            sb2.append(str2);
        }
        sb2.append(i9);
        objArr[2] = sb2.toString();
        objArr[3] = String.format("%02d", new Object[]{Integer.valueOf(i4)});
        objArr[4] = TimerCodec.DISENABLE + i10;
        String str3 = "00";
        if (i10 == 1) {
            objArr[5] = strArr2[0];
        } else if (i10 == 2) {
            objArr[5] = str3;
        } else if (i10 == 3) {
            int length = strArr2.length;
            String[] strArr3 = new String[length];
            for (int i12 = 0; i12 < length; i12++) {
                strArr3[i12] = strArr2[(length - i12) - 1];
            }
            for (int i13 = 0; i13 < length; i13++) {
                str2 = str2 + strArr3[i13];
            }
            C9189e.m22138a("timer", "cmd str= " + str2);
            String f = m22109f(str2);
            C9189e.m22138a("timer", "cmd repat str= " + f);
            if (f.length() < 2) {
                f = TimerCodec.DISENABLE + f;
            }
            objArr[5] = f;
        }
        String[] i14 = C8896a.m21232i(i6);
        objArr[6] = i14[0];
        objArr[7] = i14[1];
        objArr[8] = TimerCodec.DISENABLE + i7;
        objArr[9] = z ? "01" : str3;
        if (z2) {
            str3 = "01";
        }
        objArr[10] = str3;
        String str4 = str;
        return new C11967d(str, objArr);
    }

    /* renamed from: k */
    public static C11967d m22114k(String[] strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        System.arraycopy(strArr, 0, objArr, 0, length);
        return new C11967d("4367", objArr);
    }

    /* renamed from: l */
    public static C11967d m22115l(int i) {
        String str = BleMessage.BRIGHTNESS.value;
        Object[] objArr = new Object[1];
        if (i < 1) {
            i = 1;
        }
        objArr[0] = String.format("%02x", new Object[]{Integer.valueOf(i)});
        return new C11967d(str, objArr);
    }

    /* renamed from: m */
    public static C11967d m22116m(boolean z) {
        String str = BleMessage.ENABLEBEACON.value;
        Object[] objArr = new Object[1];
        objArr[0] = z ? "01" : "02";
        C11967d dVar = new C11967d(str, objArr);
        C9189e.m22140c(dVar.mo42537a());
        return dVar;
    }

    /* renamed from: n */
    public static C11967d m22117n(int i, int i2, int i3, int i4, int i5, String[] strArr, int i6, int i7, boolean z, boolean z2) {
        StringBuilder sb;
        StringBuilder sb2;
        int i8 = i2;
        int i9 = i3;
        int i10 = i5;
        String[] strArr2 = strArr;
        String str = BleMessage.SETALARM.value;
        Object[] objArr = new Object[11];
        StringBuilder sb3 = new StringBuilder();
        sb3.append(TimerCodec.DISENABLE);
        int i11 = i;
        sb3.append(i);
        objArr[0] = sb3.toString();
        String str2 = "";
        if (i8 < 10) {
            sb.append(TimerCodec.DISENABLE);
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(str2);
        }
        objArr[1] = sb.toString();
        if (i9 < 10) {
            sb2.append(TimerCodec.DISENABLE);
        } else {
            sb2 = new StringBuilder();
            sb2.append(str2);
        }
        sb2.append(i9);
        objArr[2] = sb2.toString();
        objArr[3] = String.format("%02d", new Object[]{Integer.valueOf(i4)});
        objArr[4] = TimerCodec.DISENABLE + i10;
        String str3 = "00";
        if (i10 == 1) {
            objArr[5] = strArr2[0];
        } else if (i10 == 2) {
            objArr[5] = str3;
        } else if (i10 == 3) {
            int length = strArr2.length;
            String[] strArr3 = new String[length];
            for (int i12 = 0; i12 < length; i12++) {
                strArr3[i12] = strArr2[(length - i12) - 1];
            }
            for (int i13 = 0; i13 < length; i13++) {
                str2 = str2 + strArr3[i13];
            }
            C9189e.m22138a("timer", "cmd str= " + str2);
            String f = m22109f(str2);
            C9189e.m22138a("timer", "cmd repat str= " + f);
            if (f.length() < 2) {
                f = TimerCodec.DISENABLE + f;
            }
            objArr[5] = f;
        }
        String[] i14 = C8896a.m21232i(i6);
        objArr[6] = i14[0];
        objArr[7] = i14[1];
        objArr[8] = TimerCodec.DISENABLE + i7;
        objArr[9] = z ? "01" : str3;
        if (z2) {
            str3 = "01";
        }
        objArr[10] = str3;
        return new C11967d(str, objArr);
    }

    /* renamed from: o */
    public static C11967d m22118o(int i) {
        String str = BleMessage.READCOLORLFOW.value;
        return new C11967d(str, new Object[]{TimerCodec.DISENABLE + i});
    }

    /* renamed from: p */
    public static C11967d m22119p(String[] strArr, String str, int i, int i2, Object[] objArr, int i3) {
        String str2 = BleMessage.ADDBEACON.value;
        Object[] objArr2 = new Object[16];
        Arrays.fill(objArr2, "00");
        objArr2[0] = str;
        objArr2[1] = String.format(Locale.CHINA, "%02d", new Object[]{Integer.valueOf(i3)});
        int length = strArr.length + 1;
        for (int i4 = 2; i4 <= length; i4++) {
            objArr2[i4] = strArr[length - i4];
        }
        objArr2[length + 1] = String.format("%1$02d", new Object[]{Integer.valueOf(i)});
        objArr2[length + 2] = String.format("%02d", new Object[]{Integer.valueOf(i2)});
        if (i2 == 1) {
            objArr2[length + 3] = objArr[0].toString();
            objArr2[length + 4] = "00";
            objArr2[length + 5] = "00";
            objArr2[length + 6] = "00";
        } else if (i2 == 2) {
            objArr2[length + 3] = objArr[0].toString();
            objArr2[length + 4] = objArr[1].toString();
            objArr2[length + 5] = objArr[2].toString();
            objArr2[length + 6] = objArr[3].toString();
        } else if (i2 == 3) {
            String[] i5 = C8896a.m21232i(Integer.parseInt(objArr[0].toString()));
            objArr2[length + 3] = i5[0];
            objArr2[length + 4] = i5[1];
            objArr2[length + 5] = objArr[1].toString();
            objArr2[length + 6] = "00";
        }
        C11967d dVar = new C11967d(str2, objArr2);
        C9189e.m22140c(dVar.mo42537a());
        return dVar;
    }

    /* renamed from: q */
    public static C11967d m22120q() {
        return new C11967d(BleMessage.READVERSION.value, new Object[]{"00"});
    }

    /* renamed from: r */
    public static C11967d m22121r() {
        return new C11967d(BleMessage.INQIRY.value, new Object[]{"00"});
    }

    /* renamed from: s */
    public static C11967d m22122s() {
        try {
            Object[] objArr = new Object[7];
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            int i = instance.get(13);
            int i2 = instance.get(12);
            int i3 = instance.get(11);
            int i4 = instance.get(5);
            int i5 = instance.get(7) - 1;
            int i6 = instance.get(2) + 1;
            int i7 = instance.get(1) - 2000;
            if (i7 < 0) {
                i7 = 0;
            }
            objArr[0] = m22112i(i);
            objArr[1] = m22112i(i2);
            objArr[2] = m22112i(i3);
            objArr[3] = m22112i(i4);
            objArr[4] = m22112i(i5);
            objArr[5] = m22112i(i6);
            objArr[6] = m22112i(i7);
            return new C11967d("4360", objArr);
        } catch (Exception e) {
            C3278f.m8797b(e);
            return null;
        }
    }

    /* renamed from: t */
    public static C11967d m22123t(int i, int i2) {
        String str;
        String str2;
        String str3;
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        String str4 = BleMessage.COLOR.value;
        Object[] objArr = new Object[5];
        if (Integer.toHexString(red).length() < 2) {
            str = TimerCodec.DISENABLE + Integer.toHexString(red);
        } else {
            str = Integer.toHexString(red);
        }
        objArr[0] = str;
        if (Integer.toHexString(green).length() < 2) {
            str2 = TimerCodec.DISENABLE + Integer.toHexString(green);
        } else {
            str2 = Integer.toHexString(green);
        }
        objArr[1] = str2;
        if (Integer.toHexString(blue).length() < 2) {
            str3 = TimerCodec.DISENABLE + Integer.toHexString(blue);
        } else {
            str3 = Integer.toHexString(blue);
        }
        objArr[2] = str3;
        objArr[3] = "00";
        if (i2 == -1) {
            objArr[4] = "00";
        } else {
            Object[] objArr2 = new Object[1];
            if (i2 < 10) {
                i2 = 10;
            }
            objArr2[0] = Integer.valueOf(i2);
            objArr[4] = String.format("%02x", objArr2);
        }
        return new C11967d(str4, objArr);
    }

    /* renamed from: u */
    public static C11967d m22124u() {
        return new C11967d(BleMessage.READLIGHTNAME.value, new Object[]{"00"});
    }

    /* renamed from: v */
    public static C11967d m22125v(int i) {
        String str = BleMessage.BRIGHTNESS.value;
        Object[] objArr = new Object[4];
        if (i < 1) {
            i = 1;
        }
        objArr[0] = String.format("%02x", new Object[]{Integer.valueOf(i)});
        objArr[1] = "01";
        objArr[2] = "01";
        objArr[3] = "f4";
        return new C11967d(str, objArr);
    }

    /* renamed from: w */
    public static C11967d m22126w() {
        return new C11967d(BleMessage.INQIRY.value, new Object[]{"00"});
    }

    /* renamed from: x */
    public static C11967d m22127x(boolean z) {
        String str = BleMessage.ONOFF.value;
        Object[] objArr = new Object[4];
        if (z) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        objArr[1] = "01";
        objArr[2] = "01";
        objArr[3] = "f4";
        return new C11967d(str, objArr);
    }

    /* renamed from: y */
    public static List<C11967d> m22128y(String str) {
        return m22129z(BleMessage.LIGHTNAME.value, 1, str);
    }

    /* renamed from: z */
    private static List<C11967d> m22129z(String str, int i, String str2) {
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[4];
        C9189e.m22138a("name", "parse name = " + str4);
        String m = C8896a.m21236m(str2);
        C9189e.m22138a("name", "hexname=" + m);
        byte[] bArr = null;
        try {
            bArr = str4.getBytes("utf-8");
            for (byte b : bArr) {
                C9189e.m22138a("name", "byte =" + String.format("%02x", new Object[]{Integer.valueOf(b & 255)}));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        C9189e.m22138a("name", "namelength =" + bArr.length);
        int length = bArr.length;
        objArr[0] = TimerCodec.DISENABLE + i2;
        objArr[1] = "00";
        if (length <= 13) {
            objArr[2] = String.format("%02x", new Object[]{Integer.valueOf(length)});
            objArr[3] = m;
        } else {
            byte[] bArr2 = new byte[13];
            System.arraycopy(bArr, 0, bArr2, 0, 13);
            objArr[2] = String.format("%02x", new Object[]{13});
            objArr[3] = C8896a.m21230g(bArr2);
        }
        C11967d dVar = new C11967d(str3, objArr);
        C9189e.m22138a("name", " parseName: " + str4 + " result = " + dVar.mo42537a() + " length=" + objArr[2]);
        arrayList.add(dVar);
        Object[] objArr2 = new Object[4];
        StringBuilder sb = new StringBuilder();
        sb.append(TimerCodec.DISENABLE);
        sb.append(i2);
        objArr2[0] = sb.toString();
        objArr2[1] = "01";
        if (length <= 13) {
            objArr2[2] = "00";
            objArr2[3] = "";
        } else {
            int i3 = length - 13;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 13, bArr3, 0, i3);
            objArr2[2] = String.format("%02x", new Object[]{Integer.valueOf(i3)});
            objArr2[3] = C8896a.m21230g(bArr3);
        }
        C11967d dVar2 = new C11967d(str3, objArr2);
        C9189e.m22138a("name", " parseName: " + str4 + " result = " + dVar2.mo42537a() + " length=" + objArr2[2]);
        arrayList.add(dVar2);
        return arrayList;
    }
}
