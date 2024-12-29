package p011c.p012a.p053e.p054s.p055c;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p183m.C6363d;
import com.yeelight.yeelib.p150c.p183m.C6478f;
import com.yeelight.yeelib.p150c.p183m.C6684h;
import com.yeelight.yeelib.p150c.p183m.C6867j;
import com.yeelight.yeelib.p150c.p183m.C7008l;
import com.yeelight.yeelib.p150c.p183m.C7039m;
import com.yeelight.yeelib.p150c.p183m.C7070n;
import com.yeelight.yeelib.p150c.p183m.C7140p;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import com.yeelight.yeelib.p150c.p183m.C7260t;
import com.yeelight.yeelib.p150c.p183m.C7294u;
import com.yeelight.yeelib.p150c.p183m.C7327v;
import com.yeelight.yeelib.p150c.p183m.C7380w;
import com.yeelight.yeelib.p150c.p183m.C7425x;
import com.yeelight.yeelib.p150c.p183m.C7497z;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.p271io.IOUtils;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.p054s.C0832a;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0843e;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0855c;
import p011c.p012a.p053e.p057t.p059n.C0857e;

/* renamed from: c.a.e.s.c.a */
public final class C0834a {

    /* renamed from: b */
    private static final String[] f748b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f749c = {"CTRL_PS", " ", "a", "b", "c", C6363d.f13402G, "e", C6478f.f13599G, "g", C6684h.f13912H, "i", C6867j.f14189G, "k", C7008l.f14401G, C7039m.f14448G, C7070n.f14495G, "o", C7140p.f14599H, C7186q.f14674T, C7200r.f14712G, C7230s.f14753G, C7260t.f14794G, C7294u.f14842G, C7327v.f14888G, C7380w.f14963G, C7425x.f15025G, "y", C7497z.f15123G, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f750d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", IOUtils.LINE_SEPARATOR_UNIX, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", Constants.WAVE_SEPARATOR, "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f751e = {"", "\r", IOUtils.LINE_SEPARATOR_WINDOWS, ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".", MiotCloudImpl.COOKIE_PATH, Constants.COLON_SEPARATOR, ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f752f = {"CTRL_PS", " ", TimerCodec.DISENABLE, TimerCodec.ENABLE, "2", "3", "4", "5", "6", "7", "8", "9", Constants.ACCEPT_TIME_SEPARATOR_SP, ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C0832a f753a;

    /* renamed from: c.a.e.s.c.a$a */
    static /* synthetic */ class C0835a {

        /* renamed from: a */
        static final /* synthetic */ int[] f754a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.a.e.s.c.a$b[] r0 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f754a = r0
                c.a.e.s.c.a$b r1 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f754a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.e.s.c.a$b r1 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f754a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.a.e.s.c.a$b r1 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f754a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.a.e.s.c.a$b r1 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f754a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.a.e.s.c.a$b r1 = p011c.p012a.p053e.p054s.p055c.C0834a.C0836b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p054s.p055c.C0834a.C0835a.<clinit>():void");
        }
    }

    /* renamed from: c.a.e.s.c.a$b */
    private enum C0836b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m1151a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m1157h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m1152b(boolean[] zArr) {
        C0853a aVar;
        int i = 8;
        if (this.f753a.mo9027d() <= 2) {
            i = 6;
            aVar = C0853a.f847j;
        } else if (this.f753a.mo9027d() <= 8) {
            aVar = C0853a.f851n;
        } else if (this.f753a.mo9027d() <= 22) {
            i = 10;
            aVar = C0853a.f846i;
        } else {
            i = 12;
            aVar = C0853a.f845h;
        }
        int c = this.f753a.mo9026c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m1158i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C0855c(aVar).mo9121a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw C0820g.m1114a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        Arrays.fill(zArr2, i7, (i7 + i) - 1, i9 > 1);
                        i7 += i - 1;
                    } else {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            zArr2[i7] = ((1 << i10) & i9) != 0;
                            i10--;
                            i7 = i11;
                        }
                    }
                }
                return zArr2;
            } catch (C0857e e) {
                throw C0820g.m1115b(e);
            }
        } else {
            throw C0820g.m1114a();
        }
    }

    /* renamed from: d */
    private boolean[] m1153d(C0840b bVar) {
        C0840b bVar2 = bVar;
        boolean e = this.f753a.mo9028e();
        int d = this.f753a.mo9027d();
        int i = (e ? 11 : 14) + (d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m1159j(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = ((d - i8) << i2) + (e ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.mo9059d(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.mo9059d(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.mo9059d(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo9059d(iArr[i20], iArr[i16]);
                    i15++;
                    d = d;
                    e = e;
                    i2 = 2;
                }
                boolean z = e;
                int i21 = d;
                i13++;
                i2 = 2;
            }
            boolean z2 = e;
            int i22 = d;
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m1154e(C0836b bVar, int i) {
        int i2 = C0835a.f754a[bVar.ordinal()];
        if (i2 == 1) {
            return f748b[i];
        }
        if (i2 == 2) {
            return f749c[i];
        }
        if (i2 == 3) {
            return f750d[i];
        }
        if (i2 == 4) {
            return f751e[i];
        }
        if (i2 == 5) {
            return f752f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m1155f(boolean[] zArr) {
        int length = zArr.length;
        C0836b bVar = C0836b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C0836b bVar2 = bVar;
        int i = 0;
        while (i < length) {
            if (bVar == C0836b.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = m1158i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = m1158i(zArr, i, 11) + 31;
                    i += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    } else if (length - i < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) m1158i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = bVar == C0836b.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = m1158i(zArr, i, i4);
                i += i4;
                String e = m1154e(bVar, i5);
                if (e.startsWith("CTRL_")) {
                    bVar2 = m1156g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        C0836b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb.append(e);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static C0836b m1156g(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? C0836b.UPPER : C0836b.MIXED : C0836b.LOWER : C0836b.PUNCT : C0836b.DIGIT : C0836b.BINARY;
    }

    /* renamed from: h */
    private static byte m1157h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m1158i(zArr, i, 8) : m1158i(zArr, i, length) << (8 - length));
    }

    /* renamed from: i */
    private static int m1158i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m1159j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C0843e mo9029c(C0832a aVar) {
        this.f753a = aVar;
        boolean[] b = m1152b(m1153d(aVar.mo9094a()));
        C0843e eVar = new C0843e(m1151a(b), m1155f(b), (List<byte[]>) null, (String) null);
        eVar.mo9090l(b.length);
        return eVar;
    }
}
