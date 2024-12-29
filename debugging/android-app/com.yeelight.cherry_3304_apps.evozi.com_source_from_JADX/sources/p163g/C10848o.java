package p163g;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: g.o */
final class C10848o implements C4410e {

    /* renamed from: a */
    public final C4406c f20924a = new C4406c();

    /* renamed from: b */
    public final C4416t f20925b;

    /* renamed from: c */
    boolean f20926c;

    /* renamed from: g.o$a */
    class C10849a extends InputStream {
        C10849a() {
        }

        public int available() {
            C10848o oVar = C10848o.this;
            if (!oVar.f20926c) {
                return (int) Math.min(oVar.f20924a.f7949b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() {
            C10848o.this.close();
        }

        public int read() {
            C10848o oVar = C10848o.this;
            if (!oVar.f20926c) {
                C4406c cVar = oVar.f20924a;
                if (cVar.f7949b == 0 && oVar.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return C10848o.this.f20924a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!C10848o.this.f20926c) {
                C10851v.m27080b((long) bArr.length, (long) i, (long) i2);
                C10848o oVar = C10848o.this;
                C4406c cVar = oVar.f20924a;
                if (cVar.f7949b == 0 && oVar.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return C10848o.this.f20924a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C10848o.this + ".inputStream()";
        }
    }

    C10848o(C4416t tVar) {
        if (tVar != null) {
            this.f20925b = tVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24202B() {
        /*
            r6 = this;
            r0 = 1
            r6.mo24218X0(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo34176g(r3)
            if (r3 == 0) goto L_0x0040
            g.c r3 = r6.f20924a
            long r4 = (long) r1
            byte r3 = r3.mo24260s(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            g.c r0 = r6.f20924a
            long r0 = r0.mo24202B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.C10848o.mo24202B():long");
    }

    /* renamed from: C0 */
    public String mo24203C0() {
        return mo24205E(Long.MAX_VALUE);
    }

    /* renamed from: E */
    public String mo24205E(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo34174a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f20924a.mo24231f1(a);
            }
            if (j2 < Long.MAX_VALUE && mo34176g(j2) && this.f20924a.mo24260s(j2 - 1) == 13 && mo34176g(1 + j2) && this.f20924a.mo24260s(j2) == 10) {
                return this.f20924a.mo24231f1(j2);
            }
            C4406c cVar = new C4406c();
            C4406c cVar2 = this.f20924a;
            cVar2.mo24240j(cVar, 0, Math.min(32, cVar2.mo24233g1()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f20924a.mo24233g1(), j) + " content=" + cVar.mo24207F().mo24291j() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: E0 */
    public int mo24206E0() {
        mo24218X0(4);
        return this.f20924a.mo24206E0();
    }

    /* renamed from: H */
    public C4406c mo24208H() {
        return this.f20924a;
    }

    /* renamed from: H0 */
    public byte[] mo24209H0(long j) {
        mo24218X0(j);
        return this.f20924a.mo24209H0(j);
    }

    /* renamed from: N0 */
    public short mo24213N0() {
        mo24218X0(2);
        return this.f20924a.mo24213N0();
    }

    /* renamed from: P0 */
    public long mo9541P0(C4406c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f20926c) {
            C4406c cVar2 = this.f20924a;
            if (cVar2.f7949b == 0 && this.f20925b.mo9541P0(cVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.f20924a.mo9541P0(cVar, Math.min(j, this.f20924a.f7949b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: R0 */
    public long mo24216R0(C4415s sVar) {
        C4406c cVar;
        if (sVar != null) {
            long j = 0;
            while (true) {
                int i = (this.f20925b.mo9541P0(this.f20924a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) > -1 ? 1 : (this.f20925b.mo9541P0(this.f20924a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1 ? 0 : -1));
                cVar = this.f20924a;
                if (i == 0) {
                    break;
                }
                long b = cVar.mo24222b();
                if (b > 0) {
                    j += b;
                    sVar.mo9442p0(this.f20924a, b);
                }
            }
            if (cVar.mo24233g1() <= 0) {
                return j;
            }
            long g1 = j + this.f20924a.mo24233g1();
            C4406c cVar2 = this.f20924a;
            sVar.mo9442p0(cVar2, cVar2.mo24233g1());
            return g1;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: X0 */
    public void mo24218X0(long j) {
        if (!mo34176g(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public long mo34174a(byte b, long j, long j2) {
        if (this.f20926c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long t = this.f20924a.mo24264t(b, j, j2);
                if (t == -1) {
                    C4406c cVar = this.f20924a;
                    long j3 = cVar.f7949b;
                    if (j3 >= j2 || this.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return t;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public boolean mo34175b(long j, C4411f fVar, int i, int i2) {
        if (this.f20926c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || fVar.mo24297q() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo34176g(1 + j2) || this.f20924a.mo24260s(j2) != fVar.mo24290i(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b1 */
    public long mo24224b1(byte b) {
        return mo34174a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: c1 */
    public long mo24225c1() {
        mo24218X0(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo34176g((long) i2)) {
                break;
            }
            byte s = this.f20924a.mo24260s((long) i);
            if ((s >= 48 && s <= 57) || ((s >= 97 && s <= 102) || (s >= 65 && s <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(s)}));
            }
        }
        return this.f20924a.mo24225c1();
    }

    public void close() {
        if (!this.f20926c) {
            this.f20926c = true;
            this.f20925b.close();
            this.f20924a.clear();
        }
    }

    /* renamed from: d1 */
    public InputStream mo24229d1() {
        return new C10849a();
    }

    /* renamed from: f */
    public C4417u mo9542f() {
        return this.f20925b.mo9542f();
    }

    /* renamed from: g */
    public boolean mo34176g(long j) {
        C4406c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f20926c) {
            do {
                cVar = this.f20924a;
                if (cVar.f7949b >= j) {
                    return true;
                }
            } while (this.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: h0 */
    public boolean mo24234h0(long j, C4411f fVar) {
        return mo34175b(j, fVar, 0, fVar.mo24297q());
    }

    /* renamed from: i0 */
    public String mo24237i0(Charset charset) {
        if (charset != null) {
            this.f20924a.mo24261s0(this.f20925b);
            return this.f20924a.mo24237i0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public boolean isOpen() {
        return !this.f20926c;
    }

    /* renamed from: p */
    public C4411f mo24250p(long j) {
        mo24218X0(j);
        return this.f20924a.mo24250p(j);
    }

    public int read(ByteBuffer byteBuffer) {
        C4406c cVar = this.f20924a;
        if (cVar.f7949b == 0 && this.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f20924a.read(byteBuffer);
    }

    public byte readByte() {
        mo24218X0(1);
        return this.f20924a.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            mo24218X0((long) bArr.length);
            this.f20924a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C4406c cVar = this.f20924a;
                long j = cVar.f7949b;
                if (j > 0) {
                    int read = cVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() {
        mo24218X0(4);
        return this.f20924a.readInt();
    }

    public short readShort() {
        mo24218X0(2);
        return this.f20924a.readShort();
    }

    public void skip(long j) {
        if (!this.f20926c) {
            while (j > 0) {
                C4406c cVar = this.f20924a;
                if (cVar.f7949b == 0 && this.f20925b.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f20924a.mo24233g1());
                this.f20924a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f20925b + ")";
    }

    /* renamed from: v */
    public byte[] mo24270v() {
        this.f20924a.mo24261s0(this.f20925b);
        return this.f20924a.mo24270v();
    }

    /* renamed from: x */
    public boolean mo24274x() {
        if (!this.f20926c) {
            return this.f20924a.mo24274x() && this.f20925b.mo9541P0(this.f20924a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }
}
