package com.yeelight.yeelib.utils;

import android.graphics.Color;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.device.models.C7610a;
import com.yeelight.yeelib.device.models.C7618e;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p150c.p184n.C7558h;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.utils.e */
public class C10540e {

    /* renamed from: com.yeelight.yeelib.utils.e$a */
    static /* synthetic */ class C10541a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20164a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.c.i.e$d[] r0 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20164a = r0
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20164a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR_HSV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20164a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20164a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.c.i.e$d r1 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.C10540e.C10541a.<clinit>():void");
        }
    }

    /* renamed from: A */
    public static C7618e m25684A() {
        return m25685B(0);
    }

    /* renamed from: B */
    public static C7618e m25685B(int i) {
        String str;
        String str2 = C7610a.READALARM.f15566a;
        Object[] objArr = new Object[1];
        if (i == 0) {
            str = "ff";
        } else {
            str = TimerCodec.DISENABLE + i;
        }
        objArr[0] = str;
        return new C7618e(str2, objArr);
    }

    /* renamed from: C */
    public static C7618e m25686C(int i) {
        String str = C7610a.REQUEST_OTA.f15566a;
        Object[] objArr = new Object[1];
        if (i == 1) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        return new C7618e(str, objArr);
    }

    /* renamed from: D */
    public static C7618e m25687D(C4200i iVar) {
        String str;
        String str2;
        String str3;
        String str4 = C7610a.SIMPLECOLORFLOW.f15566a;
        int i = iVar.mo23408d0().mo27718v().mo28896i();
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
        sb.toString();
        int i3 = 0;
        Object[] objArr = {TimerCodec.DISENABLE + 2, "01", String.format("%02x", new Object[]{Integer.valueOf(i2)}), "04", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00"};
        List<C7556g.C7557a> o = iVar.mo23408d0().mo27704o();
        while (i3 < o.size()) {
            int red = Color.red(iVar.mo23408d0().mo27704o().get(i3).mo28914a());
            int green = Color.green(iVar.mo23408d0().mo27704o().get(i3).mo28914a());
            int blue = Color.blue(iVar.mo23408d0().mo27704o().get(i3).mo28914a());
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
        return new C7618e(str4, objArr);
    }

    /* renamed from: E */
    public static C7618e m25688E(C6024e.C6028d dVar, C4200i iVar) {
        String str;
        String str2;
        String str3;
        String str4 = C7610a.COLORLFOW.f15566a;
        int i = C10541a.f20164a[dVar.ordinal()];
        int i2 = (i == 1 || i == 2) ? 3 : i != 3 ? i != 4 ? 0 : 1 : 2;
        int red = Color.red(iVar.mo23408d0().mo27702n());
        int green = Color.green(iVar.mo23408d0().mo27702n());
        int blue = Color.blue(iVar.mo23408d0().mo27702n());
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
            String[] i3 = C10539d.m25678i(iVar.mo23408d0().mo27706p());
            objArr[9] = i3[0];
            objArr[10] = i3[1];
        } else {
            objArr[9] = "00";
            objArr[10] = "00";
        }
        objArr[11] = "00";
        objArr[12] = "00";
        return new C7618e(str4, objArr);
    }

    /* renamed from: F */
    public static C7618e m25689F(int i) {
        String str = C7610a.COLORLFOW.f15566a;
        return new C7618e(str, new Object[]{TimerCodec.DISENABLE + i, "01", "01", "00", "00", "00", "00", "00", "00", "00", "00", "00", "00"});
    }

    /* renamed from: G */
    public static C7618e m25690G(boolean z) {
        String str = C7610a.ONOFF.f15566a;
        Object[] objArr = new Object[1];
        if (z) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        return new C7618e(str, objArr);
    }

    /* renamed from: H */
    public static C7618e m25691H() {
        return new C7618e(C7610a.SWITCH_OAD.f15566a, new Object[]{(byte) 67, (byte) 102});
    }

    /* renamed from: I */
    public static C7618e m25692I(int i) {
        String str;
        String str2;
        String str3 = C7610a.SYNC_ID.f15566a;
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
        "objs[0]: " + objArr[0];
        "objs[1]: " + objArr[1];
        return new C7618e(str3, objArr);
    }

    /* renamed from: J */
    public static C7618e m25693J(int i, int i2) {
        String str = C7610a.COLORTEMPERATURE.f15566a;
        Object[] objArr = new Object[3];
        C10543g.m25740a("TAG", "parse temperature = " + i);
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
        return new C7618e(str, objArr);
    }

    /* renamed from: K */
    public static C7618e m25694K() {
        return new C7618e(C7610a.READALLBEACON.f15566a, new Object[]{"00"});
    }

    /* renamed from: L */
    public static C7618e m25695L() {
        return new C7618e(C7610a.READDELAYTIME.f15566a, new Object[]{"00"});
    }

    /* renamed from: M */
    public static C7618e m25696M() {
        return new C7618e(C7610a.GINGKOQUERYFACTORY.f15566a, new Object[]{"00"});
    }

    /* renamed from: N */
    public static C7618e m25697N() {
        return new C7618e(C7610a.READGINGKOBATTERY.f15566a, new Object[]{"00"});
    }

    /* renamed from: O */
    public static C7618e m25698O() {
        return new C7618e(C7610a.READNIGHTLIGHT.f15566a, new Object[]{"00"});
    }

    /* renamed from: P */
    public static C7618e m25699P() {
        return new C7618e(C7610a.WAKEUPREAD.f15566a, new Object[]{"06"});
    }

    /* renamed from: Q */
    public static C7618e m25700Q(int[] iArr, int i) {
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
        return new C7618e(C7610a.SIMPLECOLORFLOW.f15566a, objArr);
    }

    /* renamed from: R */
    public static C7618e m25701R() {
        return new C7618e(C7610a.READRECORDS.f15566a, new Object[]{"00"});
    }

    /* renamed from: S */
    public static C7618e m25702S() {
        return new C7618e(C7610a.RESET.f15566a, new Object[]{String.format("%02x", new Object[]{0})});
    }

    /* renamed from: T */
    public static C7618e m25703T(int i, int i2) {
        return new C7618e(C7610a.SETDELAYTIME.f15566a, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)}), String.format("%02x", new Object[]{Integer.valueOf(i2)})});
    }

    /* renamed from: U */
    public static C7618e m25704U(int i, int i2) {
        return new C7618e(C7610a.SETDELAYTIME.f15566a, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)}), String.format("%02x", new Object[]{2}), String.format("%02x", new Object[]{Integer.valueOf(i2)})});
    }

    /* renamed from: V */
    public static C7618e m25705V(C7558h hVar) {
        Object[] objArr = new Object[6];
        objArr[0] = hVar.mo28922e() ? "01" : "00";
        objArr[1] = "01";
        objArr[2] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo28918a())});
        objArr[3] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo28919b())});
        objArr[4] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo28920c())});
        objArr[5] = String.format("%02d", new Object[]{Integer.valueOf(hVar.mo28921d())});
        return new C7618e(C7610a.SETNIGHTLIGHT.f15566a, objArr);
    }

    /* renamed from: a */
    public static C7618e m25706a(int i, int i2, int i3, int i4, String[] strArr, boolean z) {
        return m25715j(C7610a.WAKEUPSET.f15566a, 6, i, i2, i3, i4, strArr, 30, 1, true, z);
    }

    /* renamed from: b */
    public static C7618e m25707b(int i) {
        return new C7618e(C7610a.DELETEALAARM.f15566a, new Object[]{String.format("%02x", new Object[]{Integer.valueOf(i)})});
    }

    /* renamed from: c */
    public static C7618e m25708c(String[] strArr) {
        String str = C7610a.DELETEAUTHORIZE.f15566a;
        Object[] objArr = new Object[strArr.length];
        System.arraycopy(strArr, 0, objArr, 0, strArr.length);
        return new C7618e(str, objArr);
    }

    /* renamed from: d */
    public static C7618e m25709d() {
        return new C7618e(C7610a.GINGKOEXITFACTORY.f15566a, new Object[]{"00"});
    }

    /* renamed from: e */
    public static C7618e m25710e() {
        return new C7618e(C7610a.CHECK_CRC.f15566a, new Object[0]);
    }

    /* renamed from: f */
    private static String m25711f(String str) {
        return new BigInteger(str, 2).toString(16);
    }

    /* renamed from: g */
    public static C7618e m25712g(int i) {
        String num = Integer.toString(i);
        while (num.length() < 4) {
            num = TimerCodec.DISENABLE + num;
        }
        "finish ota, version: " + num;
        return new C7618e(C7610a.FINISH_OTA.f15566a, new Object[]{num.substring(0, 2), num.substring(2, 4)});
    }

    /* renamed from: h */
    public static C7618e m25713h(int i) {
        String str;
        String str2;
        String str3 = C7610a.WRITE_FLASH.f15566a;
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
        return new C7618e(str3, objArr);
    }

    /* renamed from: i */
    private static String m25714i(int i) {
        return String.format("%02d", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: j */
    private static C7618e m25715j(String str, int i, int i2, int i3, int i4, int i5, String[] strArr, int i6, int i7, boolean z, boolean z2) {
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
            C10543g.m25740a("timer", "cmd str= " + str2);
            String f = m25711f(str2);
            C10543g.m25740a("timer", "cmd repat str= " + f);
            if (f.length() < 2) {
                f = TimerCodec.DISENABLE + f;
            }
            objArr[5] = f;
        }
        String[] i14 = C10539d.m25678i(i6);
        objArr[6] = i14[0];
        objArr[7] = i14[1];
        objArr[8] = TimerCodec.DISENABLE + i7;
        objArr[9] = z ? "01" : str3;
        if (z2) {
            str3 = "01";
        }
        objArr[10] = str3;
        String str4 = str;
        return new C7618e(str, objArr);
    }

    /* renamed from: k */
    public static C7618e m25716k(String[] strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        System.arraycopy(strArr, 0, objArr, 0, length);
        return new C7618e("4367", objArr);
    }

    /* renamed from: l */
    public static C7618e m25717l(int i) {
        String str = C7610a.BRIGHTNESS.f15566a;
        Object[] objArr = new Object[1];
        if (i < 1) {
            i = 1;
        }
        objArr[0] = String.format("%02x", new Object[]{Integer.valueOf(i)});
        return new C7618e(str, objArr);
    }

    /* renamed from: m */
    public static C7618e m25718m(boolean z) {
        String str = C7610a.ENABLEBEACON.f15566a;
        Object[] objArr = new Object[1];
        objArr[0] = z ? "01" : "02";
        C7618e eVar = new C7618e(str, objArr);
        C10543g.m25742c(eVar.mo29066a());
        return eVar;
    }

    /* renamed from: n */
    public static C7618e m25719n(int i, int i2, int i3, int i4, int i5, String[] strArr, int i6, int i7, boolean z, boolean z2) {
        StringBuilder sb;
        StringBuilder sb2;
        int i8 = i2;
        int i9 = i3;
        int i10 = i5;
        String[] strArr2 = strArr;
        String str = C7610a.SETALARM.f15566a;
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
            C10543g.m25740a("timer", "cmd str= " + str2);
            String f = m25711f(str2);
            C10543g.m25740a("timer", "cmd repat str= " + f);
            if (f.length() < 2) {
                f = TimerCodec.DISENABLE + f;
            }
            objArr[5] = f;
        }
        String[] i14 = C10539d.m25678i(i6);
        objArr[6] = i14[0];
        objArr[7] = i14[1];
        objArr[8] = TimerCodec.DISENABLE + i7;
        objArr[9] = z ? "01" : str3;
        if (z2) {
            str3 = "01";
        }
        objArr[10] = str3;
        return new C7618e(str, objArr);
    }

    /* renamed from: o */
    public static C7618e m25720o(int i) {
        String str = C7610a.READCOLORLFOW.f15566a;
        return new C7618e(str, new Object[]{TimerCodec.DISENABLE + i});
    }

    /* renamed from: p */
    public static C7618e m25721p(String[] strArr, String str, int i, int i2, Object[] objArr, int i3) {
        String str2 = C7610a.ADDBEACON.f15566a;
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
            String[] i5 = C10539d.m25678i(Integer.parseInt(objArr[0].toString()));
            objArr2[length + 3] = i5[0];
            objArr2[length + 4] = i5[1];
            objArr2[length + 5] = objArr[1].toString();
            objArr2[length + 6] = "00";
        }
        C7618e eVar = new C7618e(str2, objArr2);
        C10543g.m25742c(eVar.mo29066a());
        return eVar;
    }

    /* renamed from: q */
    public static C7618e m25722q() {
        return new C7618e(C7610a.READVERSION.f15566a, new Object[]{"00"});
    }

    /* renamed from: r */
    public static C7618e m25723r() {
        return new C7618e(C7610a.INQIRY.f15566a, new Object[]{"00"});
    }

    /* renamed from: s */
    public static C7618e m25724s() {
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
            objArr[0] = m25714i(i);
            objArr[1] = m25714i(i2);
            objArr[2] = m25714i(i3);
            objArr[3] = m25714i(i4);
            objArr[4] = m25714i(i5);
            objArr[5] = m25714i(i6);
            objArr[6] = m25714i(i7);
            return new C7618e("4360", objArr);
        } catch (Exception e) {
            C4310h.m12146b(e);
            return null;
        }
    }

    /* renamed from: t */
    public static C7618e m25725t(int i, int i2) {
        String str;
        String str2;
        String str3;
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        String str4 = C7610a.COLOR.f15566a;
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
        return new C7618e(str4, objArr);
    }

    /* renamed from: u */
    public static C7618e m25726u() {
        return new C7618e(C7610a.READLIGHTNAME.f15566a, new Object[]{"00"});
    }

    /* renamed from: v */
    public static C7618e m25727v(int i) {
        String str = C7610a.BRIGHTNESS.f15566a;
        Object[] objArr = new Object[4];
        if (i < 1) {
            i = 1;
        }
        objArr[0] = String.format("%02x", new Object[]{Integer.valueOf(i)});
        objArr[1] = "01";
        objArr[2] = "01";
        objArr[3] = "f4";
        return new C7618e(str, objArr);
    }

    /* renamed from: w */
    public static C7618e m25728w() {
        return new C7618e(C7610a.INQIRY.f15566a, new Object[]{"00"});
    }

    /* renamed from: x */
    public static C7618e m25729x(boolean z) {
        String str = C7610a.ONOFF.f15566a;
        Object[] objArr = new Object[4];
        if (z) {
            objArr[0] = "01";
        } else {
            objArr[0] = "02";
        }
        objArr[1] = "01";
        objArr[2] = "01";
        objArr[3] = "f4";
        return new C7618e(str, objArr);
    }

    /* renamed from: y */
    public static List<C7618e> m25730y(String str) {
        return m25731z(C7610a.LIGHTNAME.f15566a, 1, str);
    }

    /* renamed from: z */
    private static List<C7618e> m25731z(String str, int i, String str2) {
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[4];
        C10543g.m25740a("name", "parse name = " + str4);
        String m = C10539d.m25682m(str2);
        C10543g.m25740a("name", "hexname=" + m);
        byte[] bArr = null;
        try {
            bArr = str4.getBytes("utf-8");
            for (byte b : bArr) {
                C10543g.m25740a("name", "byte =" + String.format("%02x", new Object[]{Integer.valueOf(b & 255)}));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        C10543g.m25740a("name", "namelength =" + bArr.length);
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
            objArr[3] = C10539d.m25676g(bArr2);
        }
        C7618e eVar = new C7618e(str3, objArr);
        C10543g.m25740a("name", " parseName: " + str4 + " result = " + eVar.mo29066a() + " length=" + objArr[2]);
        arrayList.add(eVar);
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
            objArr2[3] = C10539d.m25676g(bArr3);
        }
        C7618e eVar2 = new C7618e(str3, objArr2);
        C10543g.m25740a("name", " parseName: " + str4 + " result = " + eVar2.mo29066a() + " length=" + objArr2[2]);
        arrayList.add(eVar2);
        return arrayList;
    }
}
