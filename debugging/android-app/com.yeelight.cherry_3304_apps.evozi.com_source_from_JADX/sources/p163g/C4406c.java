package p163g;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import org.apache.commons.p271io.IOUtils;

/* renamed from: g.c */
public final class C4406c implements C4410e, C4409d, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f7947c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a */
    C4413p f7948a;

    /* renamed from: b */
    long f7949b;

    /* renamed from: g.c$a */
    class C4407a extends OutputStream {
        C4407a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return C4406c.this + ".outputStream()";
        }

        public void write(int i) {
            C4406c.this.mo24247n1((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C4406c.this.mo24246m1(bArr, i, i2);
        }
    }

    /* renamed from: g.c$b */
    class C4408b extends InputStream {
        C4408b() {
        }

        public int available() {
            return (int) Math.min(C4406c.this.f7949b, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            C4406c cVar = C4406c.this;
            if (cVar.f7949b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return C4406c.this.read(bArr, i, i2);
        }

        public String toString() {
            return C4406c.this + ".inputStream()";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r8 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r3;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24202B() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f7949b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c4
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            g.p r10 = r0.f7948a
            byte[] r11 = r10.f7958a
            int r12 = r10.f7959b
            int r13 = r10.f7960c
        L_0x001c:
            if (r12 >= r13) goto L_0x009d
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x006a
            r14 = 57
            if (r15 > r14) goto L_0x006a
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
            goto L_0x0074
        L_0x003f:
            g.c r1 = new g.c
            r1.<init>()
            r1.mo24249o1(r3)
            r1.mo24247n1(r15)
            if (r8 != 0) goto L_0x004f
            r1.readByte()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo24228d0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006a:
            r1 = 45
            if (r15 != r1) goto L_0x007e
            if (r7 != 0) goto L_0x007e
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0074:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007e:
            if (r7 == 0) goto L_0x0082
            r9 = 1
            goto L_0x009d
        L_0x0082:
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
        L_0x009d:
            if (r12 != r13) goto L_0x00a9
            g.p r1 = r10.mo24306b()
            r0.f7948a = r1
            p163g.C4414q.m12894a(r10)
            goto L_0x00ab
        L_0x00a9:
            r10.f7959b = r12
        L_0x00ab:
            if (r9 != 0) goto L_0x00b9
            g.p r1 = r0.f7948a
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b9
        L_0x00b2:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b9:
            long r1 = r0.f7949b
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f7949b = r1
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            long r3 = -r3
        L_0x00c3:
            return r3
        L_0x00c4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00cd
        L_0x00cc:
            throw r1
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.C4406c.mo24202B():long");
    }

    /* renamed from: C0 */
    public String mo24203C0() {
        return mo24205E(Long.MAX_VALUE);
    }

    /* renamed from: D */
    public boolean mo24204D(long j, C4411f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f7949b - j < ((long) i2) || fVar.mo24297q() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo24260s(((long) i3) + j) != fVar.mo24290i(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public String mo24205E(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long t = mo24264t((byte) 10, 0, j2);
            if (t != -1) {
                return mo24231f1(t);
            }
            if (j2 < mo24233g1() && mo24260s(j2 - 1) == 13 && mo24260s(j2) == 10) {
                return mo24231f1(j2);
            }
            C4406c cVar = new C4406c();
            mo24240j(cVar, 0, Math.min(32, mo24233g1()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo24233g1(), j) + " content=" + cVar.mo24207F().mo24291j() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: E0 */
    public int mo24206E0() {
        return C10851v.m27081c(readInt());
    }

    /* renamed from: F */
    public C4411f mo24207F() {
        return new C4411f(mo24270v());
    }

    /* renamed from: H */
    public C4406c mo24208H() {
        return this;
    }

    /* renamed from: H0 */
    public byte[] mo24209H0(long j) {
        C10851v.m27080b(this.f7949b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: L0 */
    public /* bridge */ /* synthetic */ C4409d mo24210L0(byte[] bArr) {
        mo24245l1(bArr);
        return this;
    }

    /* renamed from: M0 */
    public /* bridge */ /* synthetic */ C4409d mo24211M0(C4411f fVar) {
        mo24243k1(fVar);
        return this;
    }

    /* renamed from: N */
    public C4409d mo24212N() {
        return this;
    }

    /* renamed from: N0 */
    public short mo24213N0() {
        return C10851v.m27082d(readShort());
    }

    /* renamed from: O */
    public /* bridge */ /* synthetic */ C4409d mo24214O(int i) {
        mo24253r1(i);
        return this;
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ C4409d mo24215P(int i) {
        mo24252q1(i);
        return this;
    }

    /* renamed from: P0 */
    public long mo9541P0(C4406c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f7949b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo9442p0(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    /* renamed from: R0 */
    public long mo24216R0(C4415s sVar) {
        long j = this.f7949b;
        if (j > 0) {
            sVar.mo9442p0(this, j);
        }
        return j;
    }

    /* renamed from: U */
    public /* bridge */ /* synthetic */ C4409d mo24217U(int i) {
        mo24247n1(i);
        return this;
    }

    /* renamed from: X0 */
    public void mo24218X0(long j) {
        if (this.f7949b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: Y */
    public /* bridge */ /* synthetic */ C4409d mo24219Y() {
        mo24248o();
        return this;
    }

    /* renamed from: Z0 */
    public /* bridge */ /* synthetic */ C4409d mo24220Z0(long j) {
        mo24249o1(j);
        return this;
    }

    /* renamed from: a */
    public C4406c clone() {
        C4406c cVar = new C4406c();
        if (this.f7949b == 0) {
            return cVar;
        }
        C4413p d = this.f7948a.mo24308d();
        cVar.f7948a = d;
        d.f7964g = d;
        d.f7963f = d;
        C4413p pVar = this.f7948a;
        while (true) {
            pVar = pVar.f7963f;
            if (pVar != this.f7948a) {
                cVar.f7948a.f7964g.mo24307c(pVar.mo24308d());
            } else {
                cVar.f7949b = this.f7949b;
                return cVar;
            }
        }
    }

    /* renamed from: b */
    public final long mo24222b() {
        long j = this.f7949b;
        if (j == 0) {
            return 0;
        }
        C4413p pVar = this.f7948a.f7964g;
        int i = pVar.f7960c;
        return (i >= 8192 || !pVar.f7962e) ? j : j - ((long) (i - pVar.f7959b));
    }

    /* renamed from: b0 */
    public String mo24223b0(long j, Charset charset) {
        C10851v.m27080b(this.f7949b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C4413p pVar = this.f7948a;
            if (((long) pVar.f7959b) + j > ((long) pVar.f7960c)) {
                return new String(mo24209H0(j), charset);
            }
            String str = new String(pVar.f7958a, pVar.f7959b, (int) j, charset);
            int i = (int) (((long) pVar.f7959b) + j);
            pVar.f7959b = i;
            this.f7949b -= j;
            if (i == pVar.f7960c) {
                this.f7948a = pVar.mo24306b();
                C4414q.m12894a(pVar);
            }
            return str;
        }
    }

    /* renamed from: b1 */
    public long mo24224b1(byte b) {
        return mo24264t(b, 0, Long.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f7948a = r6.mo24306b();
        p163g.C4414q.m12894a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f7959b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24225c1() {
        /*
            r15 = this;
            long r0 = r15.f7949b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            g.p r6 = r15.f7948a
            byte[] r7 = r6.f7958a
            int r8 = r6.f7959b
            int r9 = r6.f7960c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
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
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
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
            g.c r0 = new g.c
            r0.<init>()
            r0.mo24251p1(r4)
            r0.mo24247n1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo24228d0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x008f
        L_0x0074:
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
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            g.p r7 = r6.mo24306b()
            r15.f7948a = r7
            p163g.C4414q.m12894a(r6)
            goto L_0x009d
        L_0x009b:
            r6.f7959b = r8
        L_0x009d:
            if (r1 != 0) goto L_0x00a3
            g.p r6 = r15.f7948a
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r1 = r15.f7949b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f7949b = r1
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00b3
        L_0x00b2:
            throw r0
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.C4406c.mo24225c1():long");
    }

    public final void clear() {
        try {
            skip(this.f7949b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void close() {
    }

    /* renamed from: d0 */
    public String mo24228d0() {
        try {
            return mo24223b0(this.f7949b, C10851v.f20930a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d1 */
    public InputStream mo24229d1() {
        return new C4408b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4406c)) {
            return false;
        }
        C4406c cVar = (C4406c) obj;
        long j = this.f7949b;
        if (j != cVar.f7949b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C4413p pVar = this.f7948a;
        C4413p pVar2 = cVar.f7948a;
        int i = pVar.f7959b;
        int i2 = pVar2.f7959b;
        while (j2 < this.f7949b) {
            long min = (long) Math.min(pVar.f7960c - i, pVar2.f7960c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (pVar.f7958a[i] != pVar2.f7958a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == pVar.f7960c) {
                pVar = pVar.f7963f;
                i = pVar.f7959b;
            }
            if (i2 == pVar2.f7960c) {
                pVar2 = pVar2.f7963f;
                i2 = pVar2.f7959b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public C4417u mo9542f() {
        return C4417u.f7967d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public String mo24231f1(long j) {
        String k0;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (mo24260s(j3) == 13) {
                k0 = mo24242k0(j3);
                j2 = 2;
                skip(j2);
                return k0;
            }
        }
        k0 = mo24242k0(j);
        skip(j2);
        return k0;
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public /* bridge */ /* synthetic */ C4409d mo24232g0(String str) {
        mo24269u1(str);
        return this;
    }

    /* renamed from: g1 */
    public final long mo24233g1() {
        return this.f7949b;
    }

    /* renamed from: h0 */
    public boolean mo24234h0(long j, C4411f fVar) {
        return mo24204D(j, fVar, 0, fVar.mo24297q());
    }

    /* renamed from: h1 */
    public final C4411f mo24235h1() {
        long j = this.f7949b;
        if (j <= 2147483647L) {
            return mo24238i1((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f7949b);
    }

    public int hashCode() {
        C4413p pVar = this.f7948a;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f7960c;
            for (int i3 = pVar.f7959b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f7958a[i3];
            }
            pVar = pVar.f7963f;
        } while (pVar != this.f7948a);
        return i;
    }

    /* renamed from: i0 */
    public String mo24237i0(Charset charset) {
        try {
            return mo24223b0(this.f7949b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i1 */
    public final C4411f mo24238i1(int i) {
        return i == 0 ? C4411f.f7953e : new C10850r(this, i);
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final C4406c mo24240j(C4406c cVar, long j, long j2) {
        if (cVar != null) {
            C10851v.m27080b(this.f7949b, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f7949b += j2;
            C4413p pVar = this.f7948a;
            while (true) {
                int i = pVar.f7960c;
                int i2 = pVar.f7959b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                pVar = pVar.f7963f;
            }
            while (j2 > 0) {
                C4413p d = pVar.mo24308d();
                int i3 = (int) (((long) d.f7959b) + j);
                d.f7959b = i3;
                d.f7960c = Math.min(i3 + ((int) j2), d.f7960c);
                C4413p pVar2 = cVar.f7948a;
                if (pVar2 == null) {
                    d.f7964g = d;
                    d.f7963f = d;
                    cVar.f7948a = d;
                } else {
                    pVar2.f7964g.mo24307c(d);
                }
                j2 -= (long) (d.f7960c - d.f7959b);
                pVar = pVar.f7963f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public C4413p mo24241j1(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C4413p pVar = this.f7948a;
        if (pVar == null) {
            C4413p b = C4414q.m12895b();
            this.f7948a = b;
            b.f7964g = b;
            b.f7963f = b;
            return b;
        }
        C4413p pVar2 = pVar.f7964g;
        if (pVar2.f7960c + i <= 8192 && pVar2.f7962e) {
            return pVar2;
        }
        C4413p b2 = C4414q.m12895b();
        pVar2.mo24307c(b2);
        return b2;
    }

    /* renamed from: k0 */
    public String mo24242k0(long j) {
        return mo24223b0(j, C10851v.f20930a);
    }

    /* renamed from: k1 */
    public C4406c mo24243k1(C4411f fVar) {
        if (fVar != null) {
            fVar.mo24304w(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: l0 */
    public /* bridge */ /* synthetic */ C4409d mo24244l0(byte[] bArr, int i, int i2) {
        mo24246m1(bArr, i, i2);
        return this;
    }

    /* renamed from: l1 */
    public C4406c mo24245l1(byte[] bArr) {
        if (bArr != null) {
            mo24246m1(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: m1 */
    public C4406c mo24246m1(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C10851v.m27080b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C4413p j1 = mo24241j1(1);
                int min = Math.min(i3 - i, 8192 - j1.f7960c);
                System.arraycopy(bArr, i, j1.f7958a, j1.f7960c, min);
                i += min;
                j1.f7960c += min;
            }
            this.f7949b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: n1 */
    public C4406c mo24247n1(int i) {
        C4413p j1 = mo24241j1(1);
        byte[] bArr = j1.f7958a;
        int i2 = j1.f7960c;
        j1.f7960c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f7949b++;
        return this;
    }

    /* renamed from: o */
    public C4406c mo24248o() {
        return this;
    }

    /* renamed from: o1 */
    public C4406c mo24249o1(long j) {
        if (j == 0) {
            mo24247n1(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                mo24269u1("-9223372036854775808");
                return this;
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
        C4413p j1 = mo24241j1(i);
        byte[] bArr = j1.f7958a;
        int i2 = j1.f7960c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f7947c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        j1.f7960c += i;
        this.f7949b += (long) i;
        return this;
    }

    /* renamed from: p */
    public C4411f mo24250p(long j) {
        return new C4411f(mo24209H0(j));
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C10851v.m27080b(cVar.f7949b, 0, j);
            while (j > 0) {
                C4413p pVar = cVar.f7948a;
                if (j < ((long) (pVar.f7960c - pVar.f7959b))) {
                    C4413p pVar2 = this.f7948a;
                    C4413p pVar3 = pVar2 != null ? pVar2.f7964g : null;
                    if (pVar3 != null && pVar3.f7962e) {
                        if ((((long) pVar3.f7960c) + j) - ((long) (pVar3.f7961d ? 0 : pVar3.f7959b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            cVar.f7948a.mo24310f(pVar3, (int) j);
                            cVar.f7949b -= j;
                            this.f7949b += j;
                            return;
                        }
                    }
                    cVar.f7948a = cVar.f7948a.mo24309e((int) j);
                }
                C4413p pVar4 = cVar.f7948a;
                long j2 = (long) (pVar4.f7960c - pVar4.f7959b);
                cVar.f7948a = pVar4.mo24306b();
                C4413p pVar5 = this.f7948a;
                if (pVar5 == null) {
                    this.f7948a = pVar4;
                    pVar4.f7964g = pVar4;
                    pVar4.f7963f = pVar4;
                } else {
                    pVar5.f7964g.mo24307c(pVar4);
                    pVar4.mo24305a();
                }
                cVar.f7949b -= j2;
                this.f7949b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: p1 */
    public C4406c mo24251p1(long j) {
        if (j == 0) {
            mo24247n1(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C4413p j1 = mo24241j1(numberOfTrailingZeros);
        byte[] bArr = j1.f7958a;
        int i = j1.f7960c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f7947c[(int) (15 & j)];
            j >>>= 4;
        }
        j1.f7960c += numberOfTrailingZeros;
        this.f7949b += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: q1 */
    public C4406c mo24252q1(int i) {
        C4413p j1 = mo24241j1(4);
        byte[] bArr = j1.f7958a;
        int i2 = j1.f7960c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        j1.f7960c = i5 + 1;
        this.f7949b += 4;
        return this;
    }

    /* renamed from: r1 */
    public C4406c mo24253r1(int i) {
        C4413p j1 = mo24241j1(2);
        byte[] bArr = j1.f7958a;
        int i2 = j1.f7960c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        j1.f7960c = i3 + 1;
        this.f7949b += 2;
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        C4413p pVar = this.f7948a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pVar.f7960c - pVar.f7959b);
        byteBuffer.put(pVar.f7958a, pVar.f7959b, min);
        int i = pVar.f7959b + min;
        pVar.f7959b = i;
        this.f7949b -= (long) min;
        if (i == pVar.f7960c) {
            this.f7948a = pVar.mo24306b();
            C4414q.m12894a(pVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i, int i2) {
        C10851v.m27080b((long) bArr.length, (long) i, (long) i2);
        C4413p pVar = this.f7948a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(i2, pVar.f7960c - pVar.f7959b);
        System.arraycopy(pVar.f7958a, pVar.f7959b, bArr, i, min);
        int i3 = pVar.f7959b + min;
        pVar.f7959b = i3;
        this.f7949b -= (long) min;
        if (i3 == pVar.f7960c) {
            this.f7948a = pVar.mo24306b();
            C4414q.m12894a(pVar);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f7949b;
        if (j != 0) {
            C4413p pVar = this.f7948a;
            int i = pVar.f7959b;
            int i2 = pVar.f7960c;
            int i3 = i + 1;
            byte b = pVar.f7958a[i];
            this.f7949b = j - 1;
            if (i3 == i2) {
                this.f7948a = pVar.mo24306b();
                C4414q.m12894a(pVar);
            } else {
                pVar.f7959b = i3;
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
        long j = this.f7949b;
        if (j >= 4) {
            C4413p pVar = this.f7948a;
            int i = pVar.f7959b;
            int i2 = pVar.f7960c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = pVar.f7958a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << ParameterInitDefType.ExternalSamplerInit);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f7949b = j - 4;
            if (i6 == i2) {
                this.f7948a = pVar.mo24306b();
                C4414q.m12894a(pVar);
            } else {
                pVar.f7959b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f7949b);
    }

    public short readShort() {
        long j = this.f7949b;
        if (j >= 2) {
            C4413p pVar = this.f7948a;
            int i = pVar.f7959b;
            int i2 = pVar.f7960c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = pVar.f7958a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f7949b = j - 2;
            if (i4 == i2) {
                this.f7948a = pVar.mo24306b();
                C4414q.m12894a(pVar);
            } else {
                pVar.f7959b = i4;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f7949b);
    }

    /* renamed from: s */
    public final byte mo24260s(long j) {
        int i;
        C10851v.m27080b(this.f7949b, j, 1);
        long j2 = this.f7949b;
        if (j2 - j > j) {
            C4413p pVar = this.f7948a;
            while (true) {
                int i2 = pVar.f7960c;
                int i3 = pVar.f7959b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return pVar.f7958a[i3 + ((int) j)];
                }
                j -= j3;
                pVar = pVar.f7963f;
            }
        } else {
            long j4 = j - j2;
            C4413p pVar2 = this.f7948a;
            do {
                pVar2 = pVar2.f7964g;
                int i4 = pVar2.f7960c;
                i = pVar2.f7959b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return pVar2.f7958a[i + ((int) j4)];
        }
    }

    /* renamed from: s0 */
    public long mo24261s0(C4416t tVar) {
        if (tVar != null) {
            long j = 0;
            while (true) {
                long P0 = tVar.mo9541P0(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (P0 == -1) {
                    return j;
                }
                j += P0;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: s1 */
    public C4406c mo24262s1(String str, int i, int i2, Charset charset) {
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
        } else if (charset.equals(C10851v.f20930a)) {
            mo24271v1(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            mo24246m1(bytes, 0, bytes.length);
            return this;
        }
    }

    public void skip(long j) {
        while (j > 0) {
            C4413p pVar = this.f7948a;
            if (pVar != null) {
                int min = (int) Math.min(j, (long) (pVar.f7960c - pVar.f7959b));
                long j2 = (long) min;
                this.f7949b -= j2;
                j -= j2;
                C4413p pVar2 = this.f7948a;
                int i = pVar2.f7959b + min;
                pVar2.f7959b = i;
                if (i == pVar2.f7960c) {
                    this.f7948a = pVar2.mo24306b();
                    C4414q.m12894a(pVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public long mo24264t(byte b, long j, long j2) {
        C4413p pVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f7949b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f7949b;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (pVar = this.f7948a) == null) {
            return -1;
        }
        long j5 = this.f7949b;
        if (j5 - j < j) {
            while (j5 > j) {
                pVar = pVar.f7964g;
                j5 -= (long) (pVar.f7960c - pVar.f7959b);
            }
        } else {
            while (true) {
                long j6 = ((long) (pVar.f7960c - pVar.f7959b)) + j3;
                if (j6 >= j) {
                    break;
                }
                pVar = pVar.f7963f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = pVar.f7958a;
            int min = (int) Math.min((long) pVar.f7960c, (((long) pVar.f7959b) + j4) - j5);
            for (int i = (int) ((((long) pVar.f7959b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - pVar.f7959b)) + j5;
                }
            }
            byte b2 = b;
            j5 += (long) (pVar.f7960c - pVar.f7959b);
            pVar = pVar.f7963f;
            j7 = j5;
        }
        return -1;
    }

    /* renamed from: t0 */
    public /* bridge */ /* synthetic */ C4409d mo24265t0(long j) {
        mo24251p1(j);
        return this;
    }

    /* renamed from: t1 */
    public C4406c mo24266t1(String str, Charset charset) {
        mo24262s1(str, 0, str.length(), charset);
        return this;
    }

    public String toString() {
        return mo24235h1().toString();
    }

    /* renamed from: u */
    public OutputStream mo24268u() {
        return new C4407a();
    }

    /* renamed from: u1 */
    public C4406c mo24269u1(String str) {
        mo24271v1(str, 0, str.length());
        return this;
    }

    /* renamed from: v */
    public byte[] mo24270v() {
        try {
            return mo24209H0(this.f7949b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: v1 */
    public C4406c mo24271v1(String str, int i, int i2) {
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
                    C4413p j1 = mo24241j1(1);
                    byte[] bArr = j1.f7958a;
                    int i4 = j1.f7960c - i;
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
                    int i6 = j1.f7960c;
                    int i7 = (i4 + i5) - i6;
                    j1.f7960c = i6 + i7;
                    this.f7949b += (long) i7;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo24247n1((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo24247n1(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + IOUtils.DIR_SEPARATOR;
                            mo24247n1((i9 >> 18) | 240);
                            mo24247n1(((i9 >> 12) & 63) | 128);
                            mo24247n1(((i9 >> 6) & 63) | 128);
                            mo24247n1((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    mo24247n1(i3);
                    mo24247n1((charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: w1 */
    public C4406c mo24272w1(int i) {
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
                        mo24247n1(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    mo24247n1((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                mo24247n1(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo24247n1(i3);
            i = (i & 63) | 128;
        }
        mo24247n1(i);
        return this;
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C4413p j1 = mo24241j1(1);
                int min = Math.min(i, 8192 - j1.f7960c);
                byteBuffer.get(j1.f7958a, j1.f7960c, min);
                i -= min;
                j1.f7960c += min;
            }
            this.f7949b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x */
    public boolean mo24274x() {
        return this.f7949b == 0;
    }
}
