package okio;

import android.support.p004v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: okio.m */
final class C9849m implements C9837d {

    /* renamed from: a */
    public final C3564c f17846a = new C3564c();

    /* renamed from: b */
    public final C9852q f17847b;

    /* renamed from: c */
    boolean f17848c;

    C9849m(C9852q qVar) {
        Objects.requireNonNull(qVar, "sink == null");
        this.f17847b = qVar;
    }

    /* renamed from: F */
    public C3564c mo24724F() {
        return this.f17846a;
    }

    /* renamed from: K */
    public C9837d mo24727K() {
        if (!this.f17848c) {
            long i1 = this.f17846a.mo24758i1();
            if (i1 > 0) {
                this.f17847b.mo24476q0(this.f17846a, i1);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: L */
    public C9837d mo24729L(int i) {
        if (!this.f17848c) {
            this.f17846a.mo24729L(i);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: M */
    public C9837d mo24730M(int i) {
        if (!this.f17848c) {
            this.f17846a.mo24730M(i);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: O0 */
    public C9837d mo24732O0(byte[] bArr) {
        if (!this.f17848c) {
            this.f17846a.mo24732O0(bArr);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: P0 */
    public C9837d mo24733P0(ByteString byteString) {
        if (!this.f17848c) {
            this.f17846a.mo24733P0(byteString);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: R */
    public C9837d mo24736R(int i) {
        if (!this.f17848c) {
            this.f17846a.mo24736R(i);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Y */
    public C9837d mo24738Y() {
        if (!this.f17848c) {
            long c = this.f17846a.mo24743c();
            if (c > 0) {
                this.f17847b.mo24476q0(this.f17846a, c);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c1 */
    public C9837d mo24744c1(long j) {
        if (!this.f17848c) {
            this.f17846a.mo24744c1(j);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f17848c) {
            Throwable th = null;
            try {
                C3564c cVar = this.f17846a;
                long j = cVar.f5933b;
                if (j > 0) {
                    this.f17847b.mo24476q0(cVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f17847b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f17848c = true;
            if (th != null) {
                C9856t.m23808e(th);
            }
        }
    }

    public void flush() {
        if (!this.f17848c) {
            C3564c cVar = this.f17846a;
            long j = cVar.f5933b;
            if (j > 0) {
                this.f17847b.mo24476q0(cVar, j);
            }
            this.f17847b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i0 */
    public C9837d mo24757i0(String str) {
        if (!this.f17848c) {
            this.f17846a.mo24757i0(str);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f17848c;
    }

    /* renamed from: j */
    public C9854s mo24475j() {
        return this.f17847b.mo24475j();
    }

    /* renamed from: m0 */
    public C9837d mo24765m0(byte[] bArr, int i, int i2) {
        if (!this.f17848c) {
            this.f17846a.mo24765m0(bArr, i, i2);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        if (!this.f17848c) {
            this.f17846a.mo24476q0(cVar, j);
            mo24738Y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: s0 */
    public long mo24781s0(C9853r rVar) {
        if (rVar != null) {
            long j = 0;
            while (true) {
                long R0 = rVar.mo24477R0(this.f17846a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (R0 == -1) {
                    return j;
                }
                j += R0;
                mo24738Y();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: t0 */
    public C9837d mo24784t0(long j) {
        if (!this.f17848c) {
            this.f17846a.mo24784t0(j);
            return mo24738Y();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f17847b + ")";
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f17848c) {
            int write = this.f17846a.write(byteBuffer);
            mo24738Y();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
