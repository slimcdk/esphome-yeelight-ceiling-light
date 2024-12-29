package okio;

import android.support.p004v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import org.apache.commons.p194io.IOUtils;

/* renamed from: okio.c */
public final class C3564c implements C9838e, C9837d, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f5931c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a */
    C3568o f5932a;

    /* renamed from: b */
    long f5933b;

    /* renamed from: okio.c$a */
    class C3565a extends OutputStream {
        C3565a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return C3564c.this + ".outputStream()";
        }

        public void write(int i) {
            C3564c.this.mo24736R((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C3564c.this.mo24765m0(bArr, i, i2);
        }
    }

    /* renamed from: okio.c$b */
    class C3566b extends InputStream {
        C3566b() {
        }

        public int available() {
            return (int) Math.min(C3564c.this.f5933b, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            C3564c cVar = C3564c.this;
            if (cVar.f5933b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return C3564c.this.read(bArr, i, i2);
        }

        public String toString() {
            return C3564c.this + ".inputStream()";
        }
    }

    /* renamed from: B0 */
    public boolean mo24721B0(long j) {
        return this.f5933b >= j;
    }

    /* renamed from: D */
    public String mo24722D() {
        try {
            return mo24771q(this.f5933b, C9856t.f17857a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: E */
    public String mo24723E(long j) {
        return mo24771q(j, C9856t.f17857a);
    }

    /* renamed from: F */
    public C3564c mo24724F() {
        return this;
    }

    /* renamed from: G0 */
    public String mo24725G0() {
        return mo24741a0(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: I0 */
    public int mo24726I0() {
        return C9856t.m23806c(readInt());
    }

    /* renamed from: K */
    public C9837d mo24727K() {
        return this;
    }

    /* renamed from: K0 */
    public byte[] mo24728K0(long j) {
        C9856t.m23805b(this.f5933b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: O */
    public byte[] mo24731O() {
        try {
            return mo24728K0(this.f5933b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: Q */
    public boolean mo24734Q() {
        return this.f5933b == 0;
    }

    /* renamed from: Q0 */
    public short mo24735Q0() {
        return C9856t.m23807d(readShort());
    }

    /* renamed from: R0 */
    public long mo24477R0(C3564c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f5933b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo24476q0(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    /* renamed from: T0 */
    public long mo24737T0(C9852q qVar) {
        long j = this.f5933b;
        if (j > 0) {
            qVar.mo24476q0(this, j);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r8 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r3;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24739Z() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f5933b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c6
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            okio.o r10 = r0.f5932a
            byte[] r11 = r10.f5937a
            int r12 = r10.f5938b
            int r13 = r10.f5939c
        L_0x001c:
            if (r12 >= r13) goto L_0x009f
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x006c
            r14 = 57
            if (r15 > r14) goto L_0x006c
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0038
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0076
        L_0x003f:
            okio.c r1 = new okio.c
            r1.<init>()
            okio.c r1 = r1.mo24744c1(r3)
            okio.c r1 = r1.mo24736R(r15)
            if (r8 != 0) goto L_0x0051
            r1.readByte()
        L_0x0051:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo24722D()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006c:
            r1 = 45
            if (r15 != r1) goto L_0x0080
            if (r7 != 0) goto L_0x0080
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0076:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x0080:
            if (r7 == 0) goto L_0x0084
            r9 = 1
            goto L_0x009f
        L_0x0084:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009f:
            if (r12 != r13) goto L_0x00ab
            okio.o r1 = r10.mo24805b()
            r0.f5932a = r1
            okio.C3569p.m10054a(r10)
            goto L_0x00ad
        L_0x00ab:
            r10.f5938b = r12
        L_0x00ad:
            if (r9 != 0) goto L_0x00bb
            okio.o r1 = r0.f5932a
            if (r1 != 0) goto L_0x00b4
            goto L_0x00bb
        L_0x00b4:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00bb:
            long r1 = r0.f5933b
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f5933b = r1
            if (r8 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            long r3 = -r3
        L_0x00c5:
            return r3
        L_0x00c6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00cf
        L_0x00ce:
            throw r1
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C3564c.mo24739Z():long");
    }

    /* renamed from: a */
    public C3564c clone() {
        C3564c cVar = new C3564c();
        if (this.f5933b == 0) {
            return cVar;
        }
        C3568o d = this.f5932a.mo24807d();
        cVar.f5932a = d;
        d.f5943g = d;
        d.f5942f = d;
        C3568o oVar = this.f5932a;
        while (true) {
            oVar = oVar.f5942f;
            if (oVar != this.f5932a) {
                cVar.f5932a.f5943g.mo24806c(oVar.mo24807d());
            } else {
                cVar.f5933b = this.f5933b;
                return cVar;
            }
        }
    }

    /* renamed from: a0 */
    public String mo24741a0(long j) {
        if (j >= 0) {
            long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = j + 1;
            }
            long i = mo24756i((byte) 10, 0, j2);
            if (i != -1) {
                return mo24754h1(i);
            }
            if (j2 < mo24758i1() && mo24753h(j2 - 1) == 13 && mo24753h(j2) == 10) {
                return mo24754h1(j2);
            }
            C3564c cVar = new C3564c();
            mo24747d(cVar, 0, Math.min(32, mo24758i1()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo24758i1(), j) + " content=" + cVar.mo24769p().hex() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: a1 */
    public void mo24742a1(long j) {
        if (this.f5933b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public final long mo24743c() {
        long j = this.f5933b;
        if (j == 0) {
            return 0;
        }
        C3568o oVar = this.f5932a.f5943g;
        int i = oVar.f5939c;
        return (i >= 8192 || !oVar.f5941e) ? j : j - ((long) (i - oVar.f5938b));
    }

    public final void clear() {
        try {
            skip(this.f5933b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public final C3564c mo24747d(C3564c cVar, long j, long j2) {
        if (cVar != null) {
            C9856t.m23805b(this.f5933b, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f5933b += j2;
            C3568o oVar = this.f5932a;
            while (true) {
                int i = oVar.f5939c;
                int i2 = oVar.f5938b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                oVar = oVar.f5942f;
            }
            while (j2 > 0) {
                C3568o d = oVar.mo24807d();
                int i3 = (int) (((long) d.f5938b) + j);
                d.f5938b = i3;
                d.f5939c = Math.min(i3 + ((int) j2), d.f5939c);
                C3568o oVar2 = cVar.f5932a;
                if (oVar2 == null) {
                    d.f5943g = d;
                    d.f5942f = d;
                    cVar.f5932a = d;
                } else {
                    oVar2.f5943g.mo24806c(d);
                }
                j2 -= (long) (d.f5939c - d.f5938b);
                oVar = oVar.f5942f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: d1 */
    public long mo24748d1(byte b) {
        return mo24756i(b, 0, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f5932a = r6.mo24805b();
        okio.C3569p.m10054a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f5938b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24749e1() {
        /*
            r15 = this;
            long r0 = r15.f5933b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            okio.o r6 = r15.f5932a
            byte[] r7 = r6.f5937a
            int r8 = r6.f5938b
            int r9 = r6.f5939c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.mo24784t0(r4)
            okio.c r0 = r0.mo24736R(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo24722D()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            okio.o r7 = r6.mo24805b()
            r15.f5932a = r7
            okio.C3569p.m10054a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f5938b = r8
        L_0x009f:
            if (r1 != 0) goto L_0x00a5
            okio.o r6 = r15.f5932a
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r1 = r15.f5933b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f5933b = r1
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C3564c.mo24749e1():long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3564c)) {
            return false;
        }
        C3564c cVar = (C3564c) obj;
        long j = this.f5933b;
        if (j != cVar.f5933b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C3568o oVar = this.f5932a;
        C3568o oVar2 = cVar.f5932a;
        int i = oVar.f5938b;
        int i2 = oVar2.f5938b;
        while (j2 < this.f5933b) {
            long min = (long) Math.min(oVar.f5939c - i, oVar2.f5939c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (oVar.f5937a[i] != oVar2.f5937a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == oVar.f5939c) {
                oVar = oVar.f5942f;
                i = oVar.f5938b;
            }
            if (i2 == oVar2.f5939c) {
                oVar2 = oVar2.f5942f;
                i2 = oVar2.f5938b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public C3564c mo24738Y() {
        return this;
    }

    /* renamed from: f1 */
    public InputStream mo24752f1() {
        return new C3566b();
    }

    public void flush() {
    }

    /* renamed from: h */
    public final byte mo24753h(long j) {
        int i;
        C9856t.m23805b(this.f5933b, j, 1);
        long j2 = this.f5933b;
        if (j2 - j > j) {
            C3568o oVar = this.f5932a;
            while (true) {
                int i2 = oVar.f5939c;
                int i3 = oVar.f5938b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return oVar.f5937a[i3 + ((int) j)];
                }
                j -= j3;
                oVar = oVar.f5942f;
            }
        } else {
            long j4 = j - j2;
            C3568o oVar2 = this.f5932a;
            do {
                oVar2 = oVar2.f5943g;
                int i4 = oVar2.f5939c;
                i = oVar2.f5938b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return oVar2.f5937a[i + ((int) j4)];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public String mo24754h1(long j) {
        String E;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (mo24753h(j3) == 13) {
                E = mo24723E(j3);
                j2 = 2;
                skip(j2);
                return E;
            }
        }
        E = mo24723E(j);
        skip(j2);
        return E;
    }

    public int hashCode() {
        C3568o oVar = this.f5932a;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oVar.f5939c;
            for (int i3 = oVar.f5938b; i3 < i2; i3++) {
                i = (i * 31) + oVar.f5937a[i3];
            }
            oVar = oVar.f5942f;
        } while (oVar != this.f5932a);
        return i;
    }

    /* renamed from: i */
    public long mo24756i(byte b, long j, long j2) {
        C3568o oVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f5933b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f5933b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (oVar = this.f5932a) == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                oVar = oVar.f5943g;
                j4 -= (long) (oVar.f5939c - oVar.f5938b);
            }
        } else {
            while (true) {
                long j6 = ((long) (oVar.f5939c - oVar.f5938b)) + j3;
                if (j6 >= j) {
                    break;
                }
                oVar = oVar.f5942f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = oVar.f5937a;
            int min = (int) Math.min((long) oVar.f5939c, (((long) oVar.f5938b) + j5) - j4);
            for (int i = (int) ((((long) oVar.f5938b) + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - oVar.f5938b)) + j4;
                }
            }
            byte b2 = b;
            j4 += (long) (oVar.f5939c - oVar.f5938b);
            oVar = oVar.f5942f;
            j7 = j4;
        }
        return -1;
    }

    /* renamed from: i1 */
    public final long mo24758i1() {
        return this.f5933b;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public C9854s mo24479j() {
        return C9854s.f17853d;
    }

    /* renamed from: j0 */
    public int mo24760j0() {
        byte b;
        int i;
        byte b2;
        if (this.f5933b != 0) {
            byte h = mo24753h(0);
            int i2 = 1;
            if ((h & 128) == 0) {
                b2 = h & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((h & 224) == 192) {
                b2 = h & 31;
                i = 2;
                b = 128;
            } else if ((h & 240) == 224) {
                b2 = h & ParameterInitDefType.CubemapSamplerInit;
                i = 3;
                b = 2048;
            } else if ((h & 248) == 240) {
                b2 = h & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f5933b >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte h2 = mo24753h(j2);
                    if ((h2 & 192) == 128) {
                        b2 = (b2 << 6) | (h2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((b2 < 55296 || b2 > 57343) && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            throw new EOFException("size < " + i + ": " + this.f5933b + " (to read code point prefixed 0x" + Integer.toHexString(h) + ")");
        }
        throw new EOFException();
    }

    /* renamed from: j1 */
    public final ByteString mo24761j1() {
        long j = this.f5933b;
        if (j <= 2147483647L) {
            return mo24763k1((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f5933b);
    }

    /* renamed from: k */
    public OutputStream mo24762k() {
        return new C3565a();
    }

    /* renamed from: k1 */
    public final ByteString mo24763k1(int i) {
        return i == 0 ? ByteString.EMPTY : new SegmentedByteString(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public C3568o mo24764l1(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C3568o oVar = this.f5932a;
        if (oVar == null) {
            C3568o b = C3569p.m10055b();
            this.f5932a = b;
            b.f5943g = b;
            b.f5942f = b;
            return b;
        }
        C3568o oVar2 = oVar.f5943g;
        return (oVar2.f5939c + i > 8192 || !oVar2.f5941e) ? oVar2.mo24806c(C3569p.m10055b()) : oVar2;
    }

    /* renamed from: m1 */
    public C3564c mo24733P0(ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: n1 */
    public C3564c mo24732O0(byte[] bArr) {
        if (bArr != null) {
            return mo24765m0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: o1 */
    public C3564c mo24765m0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C9856t.m23805b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C3568o l1 = mo24764l1(1);
                int min = Math.min(i3 - i, 8192 - l1.f5939c);
                System.arraycopy(bArr, i, l1.f5937a, l1.f5939c, min);
                i += min;
                l1.f5939c += min;
            }
            this.f5933b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: p */
    public ByteString mo24769p() {
        return new ByteString(mo24731O());
    }

    /* renamed from: p1 */
    public C3564c mo24736R(int i) {
        C3568o l1 = mo24764l1(1);
        byte[] bArr = l1.f5937a;
        int i2 = l1.f5939c;
        l1.f5939c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f5933b++;
        return this;
    }

    /* renamed from: q */
    public String mo24771q(long j, Charset charset) {
        C9856t.m23805b(this.f5933b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C3568o oVar = this.f5932a;
            int i = oVar.f5938b;
            if (((long) i) + j > ((long) oVar.f5939c)) {
                return new String(mo24728K0(j), charset);
            }
            String str = new String(oVar.f5937a, i, (int) j, charset);
            int i2 = (int) (((long) oVar.f5938b) + j);
            oVar.f5938b = i2;
            this.f5933b -= j;
            if (i2 == oVar.f5939c) {
                this.f5932a = oVar.mo24805b();
                C3569p.m10054a(oVar);
            }
            return str;
        }
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C9856t.m23805b(cVar.f5933b, 0, j);
            while (j > 0) {
                C3568o oVar = cVar.f5932a;
                if (j < ((long) (oVar.f5939c - oVar.f5938b))) {
                    C3568o oVar2 = this.f5932a;
                    C3568o oVar3 = oVar2 != null ? oVar2.f5943g : null;
                    if (oVar3 != null && oVar3.f5941e) {
                        if ((((long) oVar3.f5939c) + j) - ((long) (oVar3.f5940d ? 0 : oVar3.f5938b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            oVar.mo24809f(oVar3, (int) j);
                            cVar.f5933b -= j;
                            this.f5933b += j;
                            return;
                        }
                    }
                    cVar.f5932a = oVar.mo24808e((int) j);
                }
                C3568o oVar4 = cVar.f5932a;
                long j2 = (long) (oVar4.f5939c - oVar4.f5938b);
                cVar.f5932a = oVar4.mo24805b();
                C3568o oVar5 = this.f5932a;
                if (oVar5 == null) {
                    this.f5932a = oVar4;
                    oVar4.f5943g = oVar4;
                    oVar4.f5942f = oVar4;
                } else {
                    oVar5.f5943g.mo24806c(oVar4).mo24804a();
                }
                cVar.f5933b -= j2;
                this.f5933b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: q1 */
    public C3564c mo24744c1(long j) {
        if (j == 0) {
            return mo24736R(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return mo24757i0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C3568o l1 = mo24764l1(i);
        byte[] bArr = l1.f5937a;
        int i2 = l1.f5939c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f5931c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        l1.f5939c += i;
        this.f5933b += (long) i;
        return this;
    }

    /* renamed from: r1 */
    public C3564c mo24784t0(long j) {
        if (j == 0) {
            return mo24736R(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C3568o l1 = mo24764l1(numberOfTrailingZeros);
        byte[] bArr = l1.f5937a;
        int i = l1.f5939c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f5931c[(int) (15 & j)];
            j >>>= 4;
        }
        l1.f5939c += numberOfTrailingZeros;
        this.f5933b += (long) numberOfTrailingZeros;
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        C3568o oVar = this.f5932a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f5939c - oVar.f5938b);
        byteBuffer.put(oVar.f5937a, oVar.f5938b, min);
        int i = oVar.f5938b + min;
        oVar.f5938b = i;
        this.f5933b -= (long) min;
        if (i == oVar.f5939c) {
            this.f5932a = oVar.mo24805b();
            C3569p.m10054a(oVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i, int i2) {
        C9856t.m23805b((long) bArr.length, (long) i, (long) i2);
        C3568o oVar = this.f5932a;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i2, oVar.f5939c - oVar.f5938b);
        System.arraycopy(oVar.f5937a, oVar.f5938b, bArr, i, min);
        int i3 = oVar.f5938b + min;
        oVar.f5938b = i3;
        this.f5933b -= (long) min;
        if (i3 == oVar.f5939c) {
            this.f5932a = oVar.mo24805b();
            C3569p.m10054a(oVar);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f5933b;
        if (j != 0) {
            C3568o oVar = this.f5932a;
            int i = oVar.f5938b;
            int i2 = oVar.f5939c;
            int i3 = i + 1;
            byte b = oVar.f5937a[i];
            this.f5933b = j - 1;
            if (i3 == i2) {
                this.f5932a = oVar.mo24805b();
                C3569p.m10054a(oVar);
            } else {
                oVar.f5938b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f5933b;
        if (j >= 4) {
            C3568o oVar = this.f5932a;
            int i = oVar.f5938b;
            int i2 = oVar.f5939c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.f5937a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << ParameterInitDefType.ExternalSamplerInit);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f5933b = j - 4;
            if (i6 == i2) {
                this.f5932a = oVar.mo24805b();
                C3569p.m10054a(oVar);
            } else {
                oVar.f5938b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f5933b);
    }

    public short readShort() {
        long j = this.f5933b;
        if (j >= 2) {
            C3568o oVar = this.f5932a;
            int i = oVar.f5938b;
            int i2 = oVar.f5939c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.f5937a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f5933b = j - 2;
            if (i4 == i2) {
                this.f5932a = oVar.mo24805b();
                C3569p.m10054a(oVar);
            } else {
                oVar.f5938b = i4;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f5933b);
    }

    /* renamed from: s */
    public String mo24780s(Charset charset) {
        try {
            return mo24771q(this.f5933b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: s0 */
    public long mo24781s0(C9853r rVar) {
        if (rVar != null) {
            long j = 0;
            while (true) {
                long R0 = rVar.mo24477R0(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (R0 == -1) {
                    return j;
                }
                j += R0;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: s1 */
    public C3564c mo24730M(int i) {
        C3568o l1 = mo24764l1(4);
        byte[] bArr = l1.f5937a;
        int i2 = l1.f5939c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        l1.f5939c = i5 + 1;
        this.f5933b += 4;
        return this;
    }

    public void skip(long j) {
        while (j > 0) {
            C3568o oVar = this.f5932a;
            if (oVar != null) {
                int min = (int) Math.min(j, (long) (oVar.f5939c - oVar.f5938b));
                long j2 = (long) min;
                this.f5933b -= j2;
                j -= j2;
                C3568o oVar2 = this.f5932a;
                int i = oVar2.f5938b + min;
                oVar2.f5938b = i;
                if (i == oVar2.f5939c) {
                    this.f5932a = oVar2.mo24805b();
                    C3569p.m10054a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t1 */
    public C3564c mo24729L(int i) {
        C3568o l1 = mo24764l1(2);
        byte[] bArr = l1.f5937a;
        int i2 = l1.f5939c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        l1.f5939c = i3 + 1;
        this.f5933b += 2;
        return this;
    }

    public String toString() {
        return mo24761j1().toString();
    }

    /* renamed from: u1 */
    public C3564c mo24787u1(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C9856t.f17857a)) {
            return mo24792x1(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo24765m0(bytes, 0, bytes.length);
        }
    }

    /* renamed from: v1 */
    public C3564c mo24788v1(String str, Charset charset) {
        return mo24787u1(str, 0, str.length(), charset);
    }

    /* renamed from: w */
    public ByteString mo24789w(long j) {
        return new ByteString(mo24728K0(j));
    }

    /* renamed from: w1 */
    public C3564c mo24757i0(String str) {
        return mo24792x1(str, 0, str.length());
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C3568o l1 = mo24764l1(1);
                int min = Math.min(i, 8192 - l1.f5939c);
                byteBuffer.get(l1.f5937a, l1.f5939c, min);
                i -= min;
                l1.f5939c += min;
            }
            this.f5933b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x1 */
    public C3564c mo24792x1(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C3568o l1 = mo24764l1(1);
                    byte[] bArr = l1.f5937a;
                    int i4 = l1.f5939c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = l1.f5939c;
                    int i7 = (i4 + i5) - i6;
                    l1.f5939c = i6 + i7;
                    this.f5933b += (long) i7;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo24736R((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo24736R(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + IOUtils.DIR_SEPARATOR;
                            mo24736R((i9 >> 18) | 240);
                            mo24736R(((i9 >> 12) & 63) | 128);
                            mo24736R(((i9 >> 6) & 63) | 128);
                            mo24736R((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    mo24736R(i3);
                    mo24736R((charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: y1 */
    public C3564c mo24793y1(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        mo24736R(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    mo24736R((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                mo24736R(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo24736R(i3);
            i = (i & 63) | 128;
        }
        mo24736R(i);
        return this;
    }
}
