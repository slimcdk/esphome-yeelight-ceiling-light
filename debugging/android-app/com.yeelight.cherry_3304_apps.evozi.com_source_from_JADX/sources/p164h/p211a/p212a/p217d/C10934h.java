package p164h.p211a.p212a.p217d;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p228h.C11137q;

/* renamed from: h.a.a.d.h */
public class C10934h {

    /* renamed from: a */
    static final byte[] f21316a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b */
    private static final int[] f21317b = {268435456, 16777216, 1048576, 65536, 4096, 256, 16, 1};

    /* renamed from: c */
    private static final long[] f21318c = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    /* renamed from: a */
    public static boolean m27665a(C10929e eVar, C10929e eVar2) {
        if (eVar.length() > eVar2.length()) {
            return false;
        }
        int index = eVar2.getIndex();
        int index2 = eVar.getIndex();
        while (index2 < eVar.mo34562S0()) {
            int i = index + 1;
            if (eVar.mo34606X(index2) != eVar2.mo34606X(index)) {
                return false;
            }
            index2++;
            index = i;
        }
        return true;
    }

    /* renamed from: b */
    public static void m27666b(C10929e eVar, int i) {
        if (i == 0) {
            int index = eVar.getIndex() - 1;
            eVar.mo34609o0(index, (byte) 48);
            eVar.mo34592v0(index);
            return;
        }
        boolean z = false;
        if (i < 0) {
            z = true;
            i = -i;
        }
        int index2 = eVar.getIndex();
        while (i > 0) {
            int i2 = i & 15;
            i >>= 4;
            index2--;
            eVar.mo34609o0(index2, f21316a[i2]);
        }
        if (z) {
            index2--;
            eVar.mo34609o0(index2, (byte) 45);
        }
        eVar.mo34592v0(index2);
    }

    /* renamed from: c */
    public static void m27667c(C10929e eVar) {
        eVar.mo34560Q0(ParameterInitDefType.IntVec3Init);
        eVar.mo34560Q0((byte) 10);
    }

    /* renamed from: d */
    public static void m27668d(C10929e eVar, long j) {
        if (j < 0) {
            eVar.mo34560Q0((byte) 45);
            if (j == Long.MIN_VALUE) {
                eVar.mo34560Q0((byte) 57);
                j = 223372036854775808L;
            } else {
                j = -j;
            }
        }
        if (j < 10) {
            eVar.mo34560Q0(f21316a[(int) j]);
            return;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long[] jArr = f21318c;
            if (i < jArr.length) {
                if (j >= jArr[i]) {
                    long j2 = j / jArr[i];
                    eVar.mo34560Q0(f21316a[(int) j2]);
                    j -= j2 * f21318c[i];
                    z = true;
                } else if (z) {
                    eVar.mo34560Q0((byte) 48);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m27669e(C10929e eVar, int i) {
        if (i < 0) {
            eVar.mo34560Q0((byte) 45);
            if (i == Integer.MIN_VALUE) {
                eVar.mo34560Q0((byte) 56);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                eVar.mo34560Q0((byte) 48);
                return;
            }
            i = -i;
        }
        if (i < 16) {
            eVar.mo34560Q0(f21316a[i]);
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr = f21317b;
            if (i2 < iArr.length) {
                if (i >= iArr[i2]) {
                    int i3 = i / iArr[i2];
                    eVar.mo34560Q0(f21316a[i3]);
                    i -= i3 * f21317b[i2];
                    z = true;
                } else if (z) {
                    eVar.mo34560Q0((byte) 48);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static String m27670f(C10929e eVar) {
        return eVar instanceof C10931f.C10932a ? eVar.toString() : eVar.mo34565W(C11137q.f22065b);
    }

    /* renamed from: g */
    public static C10929e m27671g(long j) {
        C10938k kVar = new C10938k(32);
        m27668d(kVar, j);
        return kVar;
    }

    /* renamed from: h */
    public static int m27672h(C10929e eVar) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (int index = eVar.getIndex(); index < eVar.mo34562S0(); index++) {
            byte X = eVar.mo34606X(index);
            if (X <= 32) {
                if (z) {
                    break;
                }
            } else if (X < 48 || X > 57) {
                if (X != 45 || z) {
                    break;
                }
                z2 = true;
            } else {
                i = (i * 10) + (X - 48);
                z = true;
            }
        }
        if (z) {
            return z2 ? -i : i;
        }
        throw new NumberFormatException(eVar.toString());
    }

    /* renamed from: i */
    public static long m27673i(C10929e eVar) {
        boolean z = false;
        long j = 0;
        boolean z2 = false;
        for (int index = eVar.getIndex(); index < eVar.mo34562S0(); index++) {
            byte X = eVar.mo34606X(index);
            if (X <= 32) {
                if (z) {
                    break;
                }
            } else if (X < 48 || X > 57) {
                if (X != 45 || z) {
                    break;
                }
                z2 = true;
            } else {
                j = (j * 10) + ((long) (X - 48));
                z = true;
            }
        }
        if (z) {
            return z2 ? -j : j;
        }
        throw new NumberFormatException(eVar.toString());
    }
}
