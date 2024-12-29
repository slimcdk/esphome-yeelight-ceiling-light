package okio;

import android.support.p004v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: okio.n */
final class C9850n implements C9838e {

    /* renamed from: a */
    public final C3564c f17849a = new C3564c();

    /* renamed from: b */
    public final C9853r f17850b;

    /* renamed from: c */
    boolean f17851c;

    /* renamed from: okio.n$a */
    class C9851a extends InputStream {
        C9851a() {
        }

        public int available() {
            C9850n nVar = C9850n.this;
            if (!nVar.f17851c) {
                return (int) Math.min(nVar.f17849a.f5933b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() {
            C9850n.this.close();
        }

        public int read() {
            C9850n nVar = C9850n.this;
            if (!nVar.f17851c) {
                C3564c cVar = nVar.f17849a;
                if (cVar.f5933b == 0 && nVar.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return C9850n.this.f17849a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!C9850n.this.f17851c) {
                C9856t.m23805b((long) bArr.length, (long) i, (long) i2);
                C9850n nVar = C9850n.this;
                C3564c cVar = nVar.f17849a;
                if (cVar.f5933b == 0 && nVar.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return C9850n.this.f17849a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C9850n.this + ".inputStream()";
        }
    }

    C9850n(C9853r rVar) {
        Objects.requireNonNull(rVar, "source == null");
        this.f17850b = rVar;
    }

    /* renamed from: B0 */
    public boolean mo24721B0(long j) {
        C3564c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f17851c) {
            do {
                cVar = this.f17849a;
                if (cVar.f5933b >= j) {
                    return true;
                }
            } while (this.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: F */
    public C3564c mo24724F() {
        return this.f17849a;
    }

    /* renamed from: G0 */
    public String mo24725G0() {
        return mo24741a0(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: I0 */
    public int mo24726I0() {
        mo24742a1(4);
        return this.f17849a.mo24726I0();
    }

    /* renamed from: K0 */
    public byte[] mo24728K0(long j) {
        mo24742a1(j);
        return this.f17849a.mo24728K0(j);
    }

    /* renamed from: O */
    public byte[] mo24731O() {
        this.f17849a.mo24781s0(this.f17850b);
        return this.f17849a.mo24731O();
    }

    /* renamed from: Q */
    public boolean mo24734Q() {
        if (!this.f17851c) {
            return this.f17849a.mo24734Q() && this.f17850b.mo24477R0(this.f17849a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Q0 */
    public short mo24735Q0() {
        mo24742a1(2);
        return this.f17849a.mo24735Q0();
    }

    /* renamed from: R0 */
    public long mo24477R0(C3564c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f17851c) {
            C3564c cVar2 = this.f17849a;
            if (cVar2.f5933b == 0 && this.f17850b.mo24477R0(cVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.f17849a.mo24477R0(cVar, Math.min(j, this.f17849a.f5933b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: T0 */
    public long mo24737T0(C9852q qVar) {
        C3564c cVar;
        if (qVar != null) {
            long j = 0;
            while (true) {
                int i = (this.f17850b.mo24477R0(this.f17849a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) > -1 ? 1 : (this.f17850b.mo24477R0(this.f17849a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1 ? 0 : -1));
                cVar = this.f17849a;
                if (i == 0) {
                    break;
                }
                long c = cVar.mo24743c();
                if (c > 0) {
                    j += c;
                    qVar.mo24476q0(this.f17849a, c);
                }
            }
            if (cVar.mo24758i1() <= 0) {
                return j;
            }
            long i1 = j + this.f17849a.mo24758i1();
            C3564c cVar2 = this.f17849a;
            qVar.mo24476q0(cVar2, cVar2.mo24758i1());
            return i1;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24739Z() {
        /*
            r6 = this;
            r0 = 1
            r6.mo24742a1(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo24721B0(r3)
            if (r3 == 0) goto L_0x0040
            okio.c r3 = r6.f17849a
            long r4 = (long) r1
            byte r3 = r3.mo24753h(r4)
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
            okio.c r0 = r6.f17849a
            long r0 = r0.mo24739Z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C9850n.mo24739Z():long");
    }

    /* renamed from: a */
    public long mo39100a(byte b, long j, long j2) {
        if (this.f17851c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long i = this.f17849a.mo24756i(b, j, j2);
                if (i == -1) {
                    C3564c cVar = this.f17849a;
                    long j3 = cVar.f5933b;
                    if (j3 >= j2 || this.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a0 */
    public String mo24741a0(long j) {
        if (j >= 0) {
            long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
            long a = mo39100a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f17849a.mo24754h1(a);
            }
            if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && mo24721B0(j2) && this.f17849a.mo24753h(j2 - 1) == 13 && mo24721B0(1 + j2) && this.f17849a.mo24753h(j2) == 10) {
                return this.f17849a.mo24754h1(j2);
            }
            C3564c cVar = new C3564c();
            C3564c cVar2 = this.f17849a;
            cVar2.mo24747d(cVar, 0, Math.min(32, cVar2.mo24758i1()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f17849a.mo24758i1(), j) + " content=" + cVar.mo24769p().hex() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: a1 */
    public void mo24742a1(long j) {
        if (!mo24721B0(j)) {
            throw new EOFException();
        }
    }

    public void close() {
        if (!this.f17851c) {
            this.f17851c = true;
            this.f17850b.close();
            this.f17849a.clear();
        }
    }

    /* renamed from: d1 */
    public long mo24748d1(byte b) {
        return mo39100a(b, 0, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* renamed from: e1 */
    public long mo24749e1() {
        mo24742a1(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo24721B0((long) i2)) {
                break;
            }
            byte h = this.f17849a.mo24753h((long) i);
            if ((h >= 48 && h <= 57) || ((h >= 97 && h <= 102) || (h >= 65 && h <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(h)}));
            }
        }
        return this.f17849a.mo24749e1();
    }

    /* renamed from: f1 */
    public InputStream mo24752f1() {
        return new C9851a();
    }

    public boolean isOpen() {
        return !this.f17851c;
    }

    /* renamed from: j */
    public C9854s mo24479j() {
        return this.f17850b.mo24479j();
    }

    public int read(ByteBuffer byteBuffer) {
        C3564c cVar = this.f17849a;
        if (cVar.f5933b == 0 && this.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f17849a.read(byteBuffer);
    }

    public byte readByte() {
        mo24742a1(1);
        return this.f17849a.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            mo24742a1((long) bArr.length);
            this.f17849a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C3564c cVar = this.f17849a;
                long j = cVar.f5933b;
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
        mo24742a1(4);
        return this.f17849a.readInt();
    }

    public short readShort() {
        mo24742a1(2);
        return this.f17849a.readShort();
    }

    public void skip(long j) {
        if (!this.f17851c) {
            while (j > 0) {
                C3564c cVar = this.f17849a;
                if (cVar.f5933b == 0 && this.f17850b.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f17849a.mo24758i1());
                this.f17849a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f17850b + ")";
    }

    /* renamed from: w */
    public ByteString mo24789w(long j) {
        mo24742a1(j);
        return this.f17849a.mo24789w(j);
    }
}
