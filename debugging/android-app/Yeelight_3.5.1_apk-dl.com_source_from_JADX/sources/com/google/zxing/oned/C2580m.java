package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C2548a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.oned.m */
final class C2580m {

    /* renamed from: a */
    private final int[] f4385a = new int[4];

    /* renamed from: b */
    private final StringBuilder f4386b = new StringBuilder();

    C2580m() {
    }

    /* renamed from: a */
    private int m7059a(C2548a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f4385a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo19481j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < j; i3++) {
            int i4 = C2583p.m7070i(aVar, iArr2, i, C2583p.f4396g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo19480i(aVar.mo19478h(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: c */
    private static Map<ResultMetadataType, Object> m7060c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2563g mo19561b(int i, C2548a aVar, int[] iArr) {
        StringBuilder sb = this.f4386b;
        sb.setLength(0);
        int a = m7059a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> c = m7060c(sb2);
        float f = (float) i;
        C2563g gVar = new C2563g(sb2, (byte[]) null, new C2564h[]{new C2564h(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C2564h((float) a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (c != null) {
            gVar.mo19543g(c);
        }
        return gVar;
    }
}
