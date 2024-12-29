package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.p194io.IOUtils;
import org.slf4j.Marker;
import p012b2.C0599a;
import p026d2.C3129b;
import p034f2.C3161a;
import p034f2.C3163c;
import p129b4.C3989c;
import p223w3.C10744d;
import p223w3.C10865f;
import p223w3.C10922g;
import p223w3.C11107i;
import p223w3.C11280k;
import p223w3.C11363l;
import p223w3.C11480n;
import p223w3.C11511o;
import p223w3.C11542p;
import p223w3.C11581q;
import p223w3.C11627r;
import p223w3.C11641s;
import p223w3.C11671t;
import p223w3.C11699u;
import p223w3.C11733v;
import p223w3.C11766w;
import p223w3.C11819x;
import p223w3.C11864y;

public final class Decoder {

    /* renamed from: b */
    private static final String[] f4294b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f4295c = {"CTRL_PS", " ", "a", "b", C3989c.f6735c, C10744d.f19988C, "e", C10865f.f20187C, C10922g.f20289Q, "h", C11107i.f20578C, "j", C11280k.f20834C, C11363l.f20954Q, "m", C11480n.f21133C, C11511o.f21180C, C11542p.f21227C, C11581q.f21284Q, C11627r.f21359c0, C11641s.f21397C, C11671t.f21438C, C11699u.f21479C, C11733v.f21527C, C11766w.f21573C, C11819x.f21648C, C11864y.f21710C, "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f4296d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", IOUtils.LINE_SEPARATOR_UNIX, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", Constants.WAVE_SEPARATOR, "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f4297e = {"", "\r", IOUtils.LINE_SEPARATOR_WINDOWS, ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", Marker.ANY_NON_NULL_MARKER, Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".", MiotCloudImpl.COOKIE_PATH, Constants.COLON_SEPARATOR, ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f4298f = {"CTRL_PS", " ", TimerCodec.DISENABLE, TimerCodec.ENABLE, "2", "3", "4", "5", "6", "7", "8", "9", Constants.ACCEPT_TIME_SEPARATOR_SP, ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C0599a f4299a;

    private enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$a */
    static /* synthetic */ class C2545a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4300a;

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
                com.google.zxing.aztec.decoder.Decoder$Table[] r0 = com.google.zxing.aztec.decoder.Decoder.Table.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4300a = r0
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4300a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4300a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4300a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4300a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.aztec.decoder.Decoder$Table r1 = com.google.zxing.aztec.decoder.Decoder.Table.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.decoder.Decoder.C2545a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static byte[] m6880a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m6886h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m6881b(boolean[] zArr) {
        C3161a aVar;
        int i = 8;
        if (this.f4299a.mo10967d() <= 2) {
            i = 6;
            aVar = C3161a.f5071j;
        } else if (this.f4299a.mo10967d() <= 8) {
            aVar = C3161a.f5075n;
        } else if (this.f4299a.mo10967d() <= 22) {
            i = 10;
            aVar = C3161a.f5070i;
        } else {
            i = 12;
            aVar = C3161a.f5069h;
        }
        int c = this.f4299a.mo10966c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m6887i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C3163c(aVar).mo23691a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.getFormatInstance();
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
            } catch (ReedSolomonException e) {
                throw FormatException.getFormatInstance(e);
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: d */
    private boolean[] m6882d(C2549b bVar) {
        C2549b bVar2 = bVar;
        boolean e = this.f4299a.mo10968e();
        int d = this.f4299a.mo10967d();
        int i = (e ? 11 : 14) + (d << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m6888j(d, e)];
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
                    zArr[i9 + i14 + i15] = bVar2.mo19493d(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.mo19493d(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.mo19493d(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo19493d(iArr[i20], iArr[i16]);
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
    private static String m6883e(Table table, int i) {
        int i2 = C2545a.f4300a[table.ordinal()];
        if (i2 == 1) {
            return f4294b[i];
        }
        if (i2 == 2) {
            return f4295c[i];
        }
        if (i2 == 3) {
            return f4296d[i];
        }
        if (i2 == 4) {
            return f4297e[i];
        }
        if (i2 == 5) {
            return f4298f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m6884f(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i = 0;
        while (i < length) {
            if (table == Table.BINARY) {
                if (length - i < 5) {
                    break;
                }
                int i2 = m6887i(zArr, i, 5);
                i += 5;
                if (i2 == 0) {
                    if (length - i < 11) {
                        break;
                    }
                    i2 = m6887i(zArr, i, 11) + 31;
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
                        sb.append((char) m6887i(zArr, i, 8));
                        i += 8;
                        i3++;
                    }
                }
            } else {
                int i4 = table == Table.DIGIT ? 4 : 5;
                if (length - i < i4) {
                    break;
                }
                int i5 = m6887i(zArr, i, i4);
                i += i4;
                String e = m6883e(table, i5);
                if (e.startsWith("CTRL_")) {
                    table2 = m6885g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        Table table3 = table2;
                        table2 = table;
                        table = table3;
                    }
                } else {
                    sb.append(e);
                }
            }
            table = table2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static Table m6885g(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? Table.UPPER : Table.MIXED : Table.LOWER : Table.PUNCT : Table.DIGIT : Table.BINARY;
    }

    /* renamed from: h */
    private static byte m6886h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? m6887i(zArr, i, 8) : m6887i(zArr, i, length) << (8 - length));
    }

    /* renamed from: i */
    private static int m6887i(boolean[] zArr, int i, int i2) {
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
    private static int m6888j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C3129b mo19453c(C0599a aVar) {
        this.f4299a = aVar;
        boolean[] b = m6881b(m6882d(aVar.mo23619a()));
        C3129b bVar = new C3129b(m6880a(b), m6884f(b), (List<byte[]>) null, (String) null);
        bVar.mo23615l(b.length);
        return bVar;
    }
}
