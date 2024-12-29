package p011c.p012a.p053e.p065w;

import com.miot.service.manager.timer.TimerCodec;
import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.p271io.FilenameUtils;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.n */
final class C0890n {

    /* renamed from: c */
    private static final int[] f943c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f944a = new int[4];

    /* renamed from: b */
    private final StringBuilder f945b = new StringBuilder();

    C0890n() {
    }

    /* renamed from: a */
    private int m1414a(C0839a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f944a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = aVar.mo9047m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < m; i3++) {
            int i4 = C0892p.m1422i(aVar, iArr2, i, C0892p.f952g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo9046l(aVar.mo9045k(i));
            }
        }
        if (sb.length() == 5) {
            if (m1416d(sb.toString()) == m1415c(i2)) {
                return i;
            }
            throw C0823j.m1126a();
        }
        throw C0823j.m1126a();
    }

    /* renamed from: c */
    private static int m1415c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f943c[i2]) {
                return i2;
            }
        }
        throw C0823j.m1126a();
    }

    /* renamed from: d */
    private static int m1416d(CharSequence charSequence) {
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
    private static String m1417e(String str) {
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
    private static Map<C0828o, Object> m1418f(String str) {
        String e;
        if (str.length() != 5 || (e = m1417e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C0828o.class);
        enumMap.put(C0828o.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0827n mo9155b(int i, C0839a aVar, int[] iArr) {
        StringBuilder sb = this.f945b;
        sb.setLength(0);
        int a = m1414a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C0828o, Object> f = m1418f(sb2);
        float f2 = (float) i;
        C0827n nVar = new C0827n(sb2, (byte[]) null, new C0829p[]{new C0829p(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C0829p((float) a, f2)}, C0814a.UPC_EAN_EXTENSION);
        if (f != null) {
            nVar.mo9017g(f);
        }
        return nVar;
    }
}
