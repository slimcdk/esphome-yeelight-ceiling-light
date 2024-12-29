package p011c.p012a.p053e.p065w;

import java.util.EnumMap;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.m */
final class C0889m {

    /* renamed from: a */
    private final int[] f941a = new int[4];

    /* renamed from: b */
    private final StringBuilder f942b = new StringBuilder();

    C0889m() {
    }

    /* renamed from: a */
    private int m1411a(C0839a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f941a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = aVar.mo9047m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m; i3++) {
            int i4 = C0892p.m1422i(aVar, iArr2, i, C0892p.f952g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo9046l(aVar.mo9045k(i));
            }
        }
        if (sb.length() != 2) {
            throw C0823j.m1126a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw C0823j.m1126a();
        }
    }

    /* renamed from: c */
    private static Map<C0828o, Object> m1412c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C0828o.class);
        enumMap.put(C0828o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0827n mo9154b(int i, C0839a aVar, int[] iArr) {
        StringBuilder sb = this.f942b;
        sb.setLength(0);
        int a = m1411a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C0828o, Object> c = m1412c(sb2);
        float f = (float) i;
        C0827n nVar = new C0827n(sb2, (byte[]) null, new C0829p[]{new C0829p(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C0829p((float) a, f)}, C0814a.UPC_EAN_EXTENSION);
        if (c != null) {
            nVar.mo9017g(c);
        }
        return nVar;
    }
}
