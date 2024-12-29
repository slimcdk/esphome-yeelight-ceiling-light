package p011c.p012a.p053e.p065w;

import java.util.Arrays;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0826m;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.C0830q;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.p */
public abstract class C0892p extends C0887k {

    /* renamed from: d */
    static final int[] f949d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f950e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[][] f951f;

    /* renamed from: g */
    static final int[][] f952g;

    /* renamed from: a */
    private final StringBuilder f953a = new StringBuilder(20);

    /* renamed from: b */
    private final C0891o f954b = new C0891o();

    /* renamed from: c */
    private final C0883g f955c = new C0883g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f951f = iArr;
        int[][] iArr2 = new int[20][];
        f952g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f951f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f952g[i] = iArr4;
        }
    }

    protected C0892p() {
    }

    /* renamed from: h */
    static boolean m1421h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C0820g.m1114a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C0820g.m1114a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* renamed from: i */
    static int m1422i(C0839a aVar, int[] iArr, int i, int[][] iArr2) {
        C0887k.m1401e(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float d = C0887k.m1400d(iArr, iArr2[i3], 0.7f);
            if (d < f) {
                i2 = i3;
                f = d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: m */
    static int[] m1423m(C0839a aVar, int i, boolean z, int[] iArr) {
        return m1424n(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    private static int[] m1424n(C0839a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int m = aVar.mo9047m();
        int l = z ? aVar.mo9046l(i) : aVar.mo9045k(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = l;
        while (l < m) {
            if (aVar.mo9042f(l) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else if (C0887k.m1400d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, l};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            l++;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: o */
    static int[] m1425o(C0839a aVar) {
        int[] iArr = new int[f949d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f949d.length, 0);
            iArr2 = m1424n(aVar, i, false, f949d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo9049p(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        return mo9153l(i, aVar, m1425o(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9157g(String str) {
        return m1421h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo9158j(C0839a aVar, int i) {
        return m1423m(aVar, i, false, f949d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo9150k(C0839a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: l */
    public C0827n mo9153l(int i, C0839a aVar, int[] iArr, Map<C0818e, ?> map) {
        int i2;
        String c;
        int[] iArr2 = null;
        C0830q qVar = map == null ? null : (C0830q) map.get(C0818e.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (qVar != null) {
            qVar.foundPossibleResultPoint(new C0829p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f953a;
        sb.setLength(0);
        int k = mo9150k(aVar, iArr, sb);
        if (qVar != null) {
            qVar.foundPossibleResultPoint(new C0829p((float) k, (float) i));
        }
        int[] j = mo9158j(aVar, k);
        if (qVar != null) {
            qVar.foundPossibleResultPoint(new C0829p(((float) (j[0] + j[1])) / 2.0f, (float) i));
        }
        int i3 = j[1];
        int i4 = (i3 - j[0]) + i3;
        if (i4 >= aVar.mo9047m() || !aVar.mo9049p(i3, i4, false)) {
            throw C0823j.m1126a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C0820g.m1114a();
        } else if (mo9157g(sb2)) {
            C0814a p = mo9151p();
            float f = (float) i;
            C0827n nVar = new C0827n(sb2, (byte[]) null, new C0829p[]{new C0829p(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C0829p(((float) (j[1] + j[0])) / 2.0f, f)}, p);
            try {
                C0827n a = this.f954b.mo9156a(i, aVar, j[1]);
                nVar.mo9018h(C0828o.UPC_EAN_EXTENSION, a.mo9016f());
                nVar.mo9017g(a.mo9014d());
                nVar.mo9011a(a.mo9015e());
                i2 = a.mo9016f().length();
            } catch (C0826m unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C0818e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C0823j.m1126a();
                }
            }
            if ((p == C0814a.EAN_13 || p == C0814a.UPC_A) && (c = this.f955c.mo9152c(sb2)) != null) {
                nVar.mo9018h(C0828o.POSSIBLE_COUNTRY, c);
            }
            return nVar;
        } else {
            throw C0817d.m1112a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract C0814a mo9151p();
}
