package p225w5;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import org.eclipse.jetty.util.C9995n;
import p225w5.C11942e;

/* renamed from: w5.g */
public class C11945g {

    /* renamed from: a */
    static final byte[] f21829a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b */
    private static final int[] f21830b = {268435456, 16777216, 1048576, 65536, 4096, 256, 16, 1};

    /* renamed from: c */
    private static final long[] f21831c = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    /* renamed from: a */
    public static boolean m30563a(C11940d dVar, C11940d dVar2) {
        if (dVar.length() > dVar2.length()) {
            return false;
        }
        int L0 = dVar2.mo42409L0();
        int L02 = dVar.mo42409L0();
        while (L02 < dVar.mo42416U0()) {
            int i = L0 + 1;
            if (dVar.mo42449W(L02) != dVar2.mo42449W(L0)) {
                return false;
            }
            L02++;
            L0 = i;
        }
        return true;
    }

    /* renamed from: b */
    public static void m30564b(C11940d dVar, int i) {
        if (i == 0) {
            int L0 = dVar.mo42409L0() - 1;
            dVar.mo42452p0(L0, (byte) 48);
            dVar.mo42442v0(L0);
            return;
        }
        boolean z = false;
        if (i < 0) {
            z = true;
            i = -i;
        }
        int L02 = dVar.mo42409L0();
        while (i > 0) {
            int i2 = i & 15;
            i >>= 4;
            L02--;
            dVar.mo42452p0(L02, f21829a[i2]);
        }
        if (z) {
            L02--;
            dVar.mo42452p0(L02, (byte) 45);
        }
        dVar.mo42442v0(L02);
    }

    /* renamed from: c */
    public static void m30565c(C11940d dVar) {
        dVar.mo42414S0(ParameterInitDefType.IntVec3Init);
        dVar.mo42414S0((byte) 10);
    }

    /* renamed from: d */
    public static void m30566d(C11940d dVar, long j) {
        if (j < 0) {
            dVar.mo42414S0((byte) 45);
            if (j == Long.MIN_VALUE) {
                dVar.mo42414S0((byte) 57);
                j = 223372036854775808L;
            } else {
                j = -j;
            }
        }
        if (j < 10) {
            dVar.mo42414S0(f21829a[(int) j]);
            return;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long[] jArr = f21831c;
            if (i < jArr.length) {
                if (j >= jArr[i]) {
                    long j2 = j / jArr[i];
                    dVar.mo42414S0(f21829a[(int) j2]);
                    j -= j2 * jArr[i];
                    z = true;
                } else if (z) {
                    dVar.mo42414S0((byte) 48);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m30567e(C11940d dVar, int i) {
        if (i < 0) {
            dVar.mo42414S0((byte) 45);
            if (i == Integer.MIN_VALUE) {
                dVar.mo42414S0((byte) 56);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                dVar.mo42414S0((byte) 48);
                return;
            }
            i = -i;
        }
        if (i < 16) {
            dVar.mo42414S0(f21829a[i]);
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr = f21830b;
            if (i2 < iArr.length) {
                if (i >= iArr[i2]) {
                    int i3 = i / iArr[i2];
                    dVar.mo42414S0(f21829a[i3]);
                    i -= i3 * iArr[i2];
                    z = true;
                } else if (z) {
                    dVar.mo42414S0((byte) 48);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static String m30568f(C11940d dVar) {
        return dVar instanceof C11942e.C11943a ? dVar.toString() : dVar.mo42417V(C9995n.f18435b);
    }

    /* renamed from: g */
    public static C11940d m30569g(long j) {
        C11946h hVar = new C11946h(32);
        m30566d(hVar, j);
        return hVar;
    }

    /* renamed from: h */
    public static int m30570h(C11940d dVar) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (int L0 = dVar.mo42409L0(); L0 < dVar.mo42416U0(); L0++) {
            byte W = dVar.mo42449W(L0);
            if (W <= 32) {
                if (z) {
                    break;
                }
            } else if (W < 48 || W > 57) {
                if (W != 45 || z) {
                    break;
                }
                z2 = true;
            } else {
                i = (i * 10) + (W - 48);
                z = true;
            }
        }
        if (z) {
            return z2 ? -i : i;
        }
        throw new NumberFormatException(dVar.toString());
    }

    /* renamed from: i */
    public static long m30571i(C11940d dVar) {
        boolean z = false;
        long j = 0;
        boolean z2 = false;
        for (int L0 = dVar.mo42409L0(); L0 < dVar.mo42416U0(); L0++) {
            byte W = dVar.mo42449W(L0);
            if (W <= 32) {
                if (z) {
                    break;
                }
            } else if (W < 48 || W > 57) {
                if (W != 45 || z) {
                    break;
                }
                z2 = true;
            } else {
                j = (j * 10) + ((long) (W - 48));
                z = true;
            }
        }
        if (z) {
            return z2 ? -j : j;
        }
        throw new NumberFormatException(dVar.toString());
    }
}
