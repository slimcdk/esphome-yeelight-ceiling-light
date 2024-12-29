package p011c.p083d.p084a.p085d0.p086m;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import p163g.C10839i;
import p163g.C10842l;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;

/* renamed from: c.d.a.d0.m.l */
class C1062l {

    /* renamed from: a */
    private final C10842l f1507a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f1508b;

    /* renamed from: c */
    private final C4410e f1509c;

    /* renamed from: c.d.a.d0.m.l$a */
    class C1063a extends C10839i {
        C1063a(C4416t tVar) {
            super(tVar);
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            if (C1062l.this.f1508b == 0) {
                return -1;
            }
            long P0 = super.mo9541P0(cVar, Math.min(j, (long) C1062l.this.f1508b));
            if (P0 == -1) {
                return -1;
            }
            C1062l lVar = C1062l.this;
            int unused = lVar.f1508b = (int) (((long) lVar.f1508b) - P0);
            return P0;
        }
    }

    /* renamed from: c.d.a.d0.m.l$b */
    class C1064b extends Inflater {
        C1064b(C1062l lVar) {
        }

        public int inflate(byte[] bArr, int i, int i2) {
            int inflate = super.inflate(bArr, i, i2);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(C1069p.f1519a);
            return super.inflate(bArr, i, i2);
        }
    }

    public C1062l(C4410e eVar) {
        C10842l lVar = new C10842l((C4416t) new C1063a(eVar), (Inflater) new C1064b(this));
        this.f1507a = lVar;
        this.f1509c = C10843m.m27009d(lVar);
    }

    /* renamed from: d */
    private void m2340d() {
        if (this.f1508b > 0) {
            this.f1507a.mo34168a();
            if (this.f1508b != 0) {
                throw new IOException("compressedLimit > 0: " + this.f1508b);
            }
        }
    }

    /* renamed from: e */
    private C4411f m2341e() {
        return this.f1509c.mo24250p((long) this.f1509c.readInt());
    }

    /* renamed from: c */
    public void mo9571c() {
        this.f1509c.close();
    }

    /* renamed from: f */
    public List<C1048f> mo9572f(int i) {
        this.f1508b += i;
        int readInt = this.f1509c.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                C4411f t = m2341e().mo24300t();
                C4411f e = m2341e();
                if (t.mo24297q() != 0) {
                    arrayList.add(new C1048f(t, e));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            m2340d();
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
    }
}
