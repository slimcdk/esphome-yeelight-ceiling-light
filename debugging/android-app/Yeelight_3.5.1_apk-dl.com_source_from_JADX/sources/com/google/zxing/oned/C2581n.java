package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2548a;
import com.miot.service.manager.timer.TimerCodec;
import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: com.google.zxing.oned.n */
final class C2581n {

    /* renamed from: c */
    private static final int[] f4387c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f4388a = new int[4];

    /* renamed from: b */
    private final StringBuilder f4389b = new StringBuilder();

    C2581n() {
    }

    /* renamed from: a */
    private int m7062a(C2548a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f4388a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo19481j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < j; i3++) {
            int i4 = C2583p.m7070i(aVar, iArr2, i, C2583p.f4396g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo19480i(aVar.mo19478h(i));
            }
        }
        if (sb.length() == 5) {
            if (m7064d(sb.toString()) == m7063c(i2)) {
                return i;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: c */
    private static int m7063c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f4387c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    private static int m7064d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: e */
    private static String m7065e(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = TimerCodec.DISENABLE + i;
        } else {
            str2 = String.valueOf(i);
        }
        return str3 + valueOf + FilenameUtils.EXTENSION_SEPARATOR + str2;
    }

    /* renamed from: f */
    private static Map<ResultMetadataType, Object> m7066f(String str) {
        String e;
        if (str.length() != 5 || (e = m7065e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2563g mo19562b(int i, C2548a aVar, int[] iArr) {
        StringBuilder sb = this.f4389b;
        sb.setLength(0);
        int a = m7062a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> f = m7066f(sb2);
        float f2 = (float) i;
        C2563g gVar = new C2563g(sb2, (byte[]) null, new C2564h[]{new C2564h(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C2564h((float) a, f2)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (f != null) {
            gVar.mo19543g(f);
        }
        return gVar;
    }
}
