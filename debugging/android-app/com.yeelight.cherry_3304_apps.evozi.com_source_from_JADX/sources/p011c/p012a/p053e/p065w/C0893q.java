package p011c.p012a.p053e.p065w;

import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.q */
public final class C0893q extends C0892p {

    /* renamed from: i */
    private static final int[] f956i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    private static final int[][] f957j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    private final int[] f958h = new int[4];

    /* renamed from: q */
    public static String m1432q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: r */
    private static void m1433r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f957j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo9157g(String str) {
        return super.mo9157g(m1432q(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int[] mo9158j(C0839a aVar, int i) {
        return C0892p.m1423m(aVar, i, true, f956i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo9150k(C0839a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f958h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = aVar.mo9047m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < m; i3++) {
            int i4 = C0892p.m1422i(aVar, iArr2, i, C0892p.f952g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m1433r(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0814a mo9151p() {
        return C0814a.UPC_E;
    }
}