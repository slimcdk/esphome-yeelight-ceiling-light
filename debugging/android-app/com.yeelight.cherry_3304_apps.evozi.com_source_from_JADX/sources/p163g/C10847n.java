package p163g;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;

/* renamed from: g.n */
final class C10847n implements C4409d {

    /* renamed from: a */
    public final C4406c f20921a = new C4406c();

    /* renamed from: b */
    public final C4415s f20922b;

    /* renamed from: c */
    boolean f20923c;

    C10847n(C4415s sVar) {
        if (sVar != null) {
            this.f20922b = sVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: H */
    public C4406c mo24208H() {
        return this.f20921a;
    }

    /* renamed from: L0 */
    public C4409d mo24210L0(byte[] bArr) {
        if (!this.f20923c) {
            this.f20921a.mo24245l1(bArr);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: M0 */
    public C4409d mo24211M0(C4411f fVar) {
        if (!this.f20923c) {
            this.f20921a.mo24243k1(fVar);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: N */
    public C4409d mo24212N() {
        if (!this.f20923c) {
            long g1 = this.f20921a.mo24233g1();
            if (g1 > 0) {
                this.f20922b.mo9442p0(this.f20921a, g1);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: O */
    public C4409d mo24214O(int i) {
        if (!this.f20923c) {
            this.f20921a.mo24253r1(i);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: P */
    public C4409d mo24215P(int i) {
        if (!this.f20923c) {
            this.f20921a.mo24252q1(i);
            return mo24219Y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: U */
    public C4409d mo24217U(int i) {
        if (!this.f20923c) {
            this.f20921a.mo24247n1(i);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Y */
    public C4409d mo24219Y() {
        if (!this.f20923c) {
            long b = this.f20921a.mo24222b();
            if (b > 0) {
                this.f20922b.mo9442p0(this.f20921a, b);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: Z0 */
    public C4409d mo24220Z0(long j) {
        if (!this.f20923c) {
            this.f20921a.mo24249o1(j);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f20923c) {
            try {
                if (this.f20921a.f7949b > 0) {
                    this.f20922b.mo9442p0(this.f20921a, this.f20921a.f7949b);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f20922b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f20923c = true;
            if (th != null) {
                C10851v.m27083e(th);
                throw null;
            }
        }
    }

    /* renamed from: f */
    public C4417u mo9440f() {
        return this.f20922b.mo9440f();
    }

    public void flush() {
        if (!this.f20923c) {
            C4406c cVar = this.f20921a;
            long j = cVar.f7949b;
            if (j > 0) {
                this.f20922b.mo9442p0(cVar, j);
            }
            this.f20922b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g0 */
    public C4409d mo24232g0(String str) {
        if (!this.f20923c) {
            this.f20921a.mo24269u1(str);
            return mo24219Y();
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f20923c;
    }

    /* renamed from: l0 */
    public C4409d mo24244l0(byte[] bArr, int i, int i2) {
        if (!this.f20923c) {
            this.f20921a.mo24246m1(bArr, i, i2);
            mo24219Y();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        if (!this.f20923c) {
            this.f20921a.mo9442p0(cVar, j);
            mo24219Y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: s0 */
    public long mo24261s0(C4416t tVar) {
        if (tVar != null) {
            long j = 0;
            while (true) {
                long P0 = tVar.mo9541P0(this.f20921a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (P0 == -1) {
                    return j;
                }
                j += P0;
                mo24219Y();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: t0 */
    public C4409d mo24265t0(long j) {
        if (!this.f20923c) {
            this.f20921a.mo24251p1(j);
            return mo24219Y();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f20922b + ")";
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f20923c) {
            int write = this.f20921a.write(byteBuffer);
            mo24219Y();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
