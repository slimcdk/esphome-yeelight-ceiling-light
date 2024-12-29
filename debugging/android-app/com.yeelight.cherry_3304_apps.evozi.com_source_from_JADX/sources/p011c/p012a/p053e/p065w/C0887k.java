package p011c.p012a.p053e.p065w;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p011c.p012a.p053e.C0816c;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0825l;
import p011c.p012a.p053e.C0826m;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0828o;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.k */
public abstract class C0887k implements C0825l {
    /* renamed from: c */
    private C0827n m1399c(C0816c cVar, Map<C0818e, ?> map) {
        int i;
        Map<C0818e, ?> map2;
        EnumMap enumMap = map;
        int d = cVar.mo8991d();
        int c = cVar.mo8990c();
        C0839a aVar = new C0839a(d);
        int i2 = c >> 1;
        char c2 = 0;
        int i3 = 1;
        boolean z = enumMap != null && enumMap.containsKey(C0818e.TRY_HARDER);
        int max = Math.max(1, c >> (z ? 8 : 5));
        int i4 = z ? c : 15;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i2;
            if (i8 < 0 || i8 >= c) {
                break;
            }
            try {
                aVar = cVar.mo8989b(i8, aVar);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i3) {
                        aVar.mo9050r();
                        if (enumMap != null && enumMap.containsKey(C0818e.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(C0818e.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(C0818e.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        C0827n b = mo9149b(i8, aVar, enumMap);
                        if (i9 == i3) {
                            b.mo9018h(C0828o.ORIENTATION, 180);
                            C0829p[] e = b.mo9015e();
                            if (e != null) {
                                map2 = enumMap;
                                float f = (float) d;
                                try {
                                    i = d;
                                } catch (C0826m unused) {
                                    i = d;
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i3 = 1;
                                }
                                try {
                                    e[0] = new C0829p((f - e[c2].mo9020c()) - 1.0f, e[c2].mo9021d());
                                    try {
                                        e[1] = new C0829p((f - e[1].mo9020c()) - 1.0f, e[1].mo9021d());
                                    } catch (C0826m unused2) {
                                        continue;
                                    }
                                } catch (C0826m unused3) {
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i3 = 1;
                                }
                            }
                        }
                        return b;
                    } catch (C0826m unused4) {
                        map2 = enumMap;
                        i = d;
                        i9++;
                        enumMap = map2;
                        d = i;
                        c2 = 0;
                        i3 = 1;
                    }
                }
                continue;
            } catch (C0823j unused5) {
            }
            i5 = i6;
            d = d;
            c2 = 0;
            i3 = 1;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: d */
    protected static float m1400d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: e */
    protected static void m1401e(C0839a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m = aVar.mo9047m();
        if (i < m) {
            boolean z = !aVar.mo9042f(i);
            while (i < m) {
                if (!(aVar.mo9042f(i) ^ z)) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != m) {
                throw C0823j.m1126a();
            }
            return;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: f */
    protected static void m1402f(C0839a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean f = aVar.mo9042f(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo9042f(i) != f) {
                length--;
                f = !f;
            }
        }
        if (length < 0) {
            m1401e(aVar, i + 1, iArr);
            return;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: a */
    public C0827n mo9003a(C0816c cVar, Map<C0818e, ?> map) {
        try {
            return m1399c(cVar, map);
        } catch (C0823j e) {
            if (!(map != null && map.containsKey(C0818e.TRY_HARDER)) || !cVar.mo8992e()) {
                throw e;
            }
            cVar.mo8993f();
            throw null;
        }
    }

    /* renamed from: b */
    public abstract C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map);

    public void reset() {
    }
}
