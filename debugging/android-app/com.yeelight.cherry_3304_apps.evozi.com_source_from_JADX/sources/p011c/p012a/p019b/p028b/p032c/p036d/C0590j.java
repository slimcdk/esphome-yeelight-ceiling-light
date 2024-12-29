package p011c.p012a.p019b.p028b.p032c.p036d;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;

/* renamed from: c.a.b.b.c.d.j */
public final class C0590j {

    /* renamed from: a */
    private final byte[] f258a;

    /* renamed from: b */
    private final int f259b;

    /* renamed from: c */
    private int f260c;

    /* renamed from: d */
    private int f261d;

    /* renamed from: e */
    private int f262e;

    /* renamed from: f */
    private int f263f;

    /* renamed from: g */
    private int f264g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: h */
    private int f265h;

    /* renamed from: i */
    private int f266i = 64;

    private C0590j(byte[] bArr, int i, int i2) {
        this.f258a = bArr;
        this.f259b = i;
        this.f260c = i2 + i;
        this.f262e = i;
    }

    /* renamed from: d */
    public static C0590j m381d(byte[] bArr, int i, int i2) {
        return new C0590j(bArr, 0, i2);
    }

    /* renamed from: m */
    private final void m382m(int i) {
        if (i >= 0) {
            int i2 = this.f262e;
            int i3 = i2 + i;
            int i4 = this.f264g;
            if (i3 > i4) {
                m382m(i4 - i2);
                throw C0598r.m451a();
            } else if (i <= this.f260c - i2) {
                this.f262e = i2 + i;
            } else {
                throw C0598r.m451a();
            }
        } else {
            throw C0598r.m452b();
        }
    }

    /* renamed from: s */
    private final void m383s() {
        int i = this.f260c + this.f261d;
        this.f260c = i;
        int i2 = this.f264g;
        if (i > i2) {
            int i3 = i - i2;
            this.f261d = i3;
            this.f260c = i - i3;
            return;
        }
        this.f261d = 0;
    }

    /* renamed from: u */
    private final byte m384u() {
        int i = this.f262e;
        if (i != this.f260c) {
            byte[] bArr = this.f258a;
            this.f262e = i + 1;
            return bArr[i];
        }
        throw C0598r.m451a();
    }

    /* renamed from: a */
    public final int mo8572a() {
        return this.f262e - this.f259b;
    }

    /* renamed from: b */
    public final byte[] mo8573b() {
        int o = mo8584o();
        if (o < 0) {
            throw C0598r.m452b();
        } else if (o == 0) {
            return C0602v.f285d;
        } else {
            int i = this.f260c;
            int i2 = this.f262e;
            if (o <= i - i2) {
                byte[] bArr = new byte[o];
                System.arraycopy(this.f258a, i2, bArr, 0, o);
                this.f262e += o;
                return bArr;
            }
            throw C0598r.m451a();
        }
    }

    /* renamed from: c */
    public final String mo8574c() {
        int o = mo8584o();
        if (o < 0) {
            throw C0598r.m452b();
        } else if (o <= this.f260c - this.f262e) {
            String str = new String(this.f258a, this.f262e, o, C0597q.f277a);
            this.f262e += o;
            return str;
        } else {
            throw C0598r.m451a();
        }
    }

    /* renamed from: e */
    public final void mo8575e(C0599s sVar) {
        int o = mo8584o();
        if (this.f265h < this.f266i) {
            int j = mo8580j(o);
            this.f265h++;
            sVar.mo8561a(this);
            mo8577g(0);
            this.f265h--;
            mo8581k(j);
            return;
        }
        throw new C0598r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: f */
    public final byte[] mo8576f(int i, int i2) {
        if (i2 == 0) {
            return C0602v.f285d;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f258a, this.f259b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: g */
    public final void mo8577g(int i) {
        if (this.f263f != i) {
            throw new C0598r("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo8578h(int i, int i2) {
        int i3 = this.f262e;
        int i4 = this.f259b;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.f262e - this.f259b);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f262e = i4 + i;
            this.f263f = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: i */
    public final boolean mo8579i(int i) {
        int n;
        int i2 = i & 7;
        if (i2 == 0) {
            mo8584o();
            return true;
        } else if (i2 == 1) {
            mo8587r();
            return true;
        } else if (i2 == 2) {
            m382m(mo8584o());
            return true;
        } else if (i2 == 3) {
            do {
                n = mo8583n();
                if (n == 0 || !mo8579i(n)) {
                    mo8577g(((i >>> 3) << 3) | 4);
                }
                n = mo8583n();
                break;
            } while (!mo8579i(n));
            mo8577g(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo8586q();
                return true;
            }
            throw new C0598r("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: j */
    public final int mo8580j(int i) {
        if (i >= 0) {
            int i2 = i + this.f262e;
            int i3 = this.f264g;
            if (i2 <= i3) {
                this.f264g = i2;
                m383s();
                return i3;
            }
            throw C0598r.m451a();
        }
        throw C0598r.m452b();
    }

    /* renamed from: k */
    public final void mo8581k(int i) {
        this.f264g = i;
        m383s();
    }

    /* renamed from: l */
    public final void mo8582l(int i) {
        mo8578h(i, this.f263f);
    }

    /* renamed from: n */
    public final int mo8583n() {
        if (this.f262e == this.f260c) {
            this.f263f = 0;
            return 0;
        }
        int o = mo8584o();
        this.f263f = o;
        if (o != 0) {
            return o;
        }
        throw new C0598r("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: o */
    public final int mo8584o() {
        int i;
        byte u = m384u();
        if (u >= 0) {
            return u;
        }
        byte b = u & Byte.MAX_VALUE;
        byte u2 = m384u();
        if (u2 >= 0) {
            i = u2 << 7;
        } else {
            b |= (u2 & Byte.MAX_VALUE) << 7;
            byte u3 = m384u();
            if (u3 >= 0) {
                i = u3 << ParameterInitDefType.IntVec4Init;
            } else {
                b |= (u3 & Byte.MAX_VALUE) << ParameterInitDefType.IntVec4Init;
                byte u4 = m384u();
                if (u4 >= 0) {
                    i = u4 << 21;
                } else {
                    byte b2 = b | ((u4 & Byte.MAX_VALUE) << 21);
                    byte u5 = m384u();
                    byte b3 = b2 | (u5 << 28);
                    if (u5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (m384u() >= 0) {
                            return b3;
                        }
                    }
                    throw C0598r.m453c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: p */
    public final long mo8585p() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte u = m384u();
            j |= ((long) (u & Byte.MAX_VALUE)) << i;
            if ((u & 128) == 0) {
                return j;
            }
        }
        throw C0598r.m453c();
    }

    /* renamed from: q */
    public final int mo8586q() {
        return (m384u() & 255) | ((m384u() & 255) << 8) | ((m384u() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((m384u() & 255) << 24);
    }

    /* renamed from: r */
    public final long mo8587r() {
        byte u = m384u();
        byte u2 = m384u();
        return ((((long) u2) & 255) << 8) | (((long) u) & 255) | ((((long) m384u()) & 255) << 16) | ((((long) m384u()) & 255) << 24) | ((((long) m384u()) & 255) << 32) | ((((long) m384u()) & 255) << 40) | ((((long) m384u()) & 255) << 48) | ((((long) m384u()) & 255) << 56);
    }

    /* renamed from: t */
    public final int mo8588t() {
        int i = this.f264g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f262e;
    }
}
