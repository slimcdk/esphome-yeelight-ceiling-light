package p236z2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import okio.ByteString;
import okio.C3564c;
import okio.C9838e;
import okio.C9841h;
import okio.C9844k;
import okio.C9845l;
import okio.C9853r;

/* renamed from: z2.j */
class C12130j {

    /* renamed from: a */
    private final C9844k f22289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f22290b;

    /* renamed from: c */
    private final C9838e f22291c;

    /* renamed from: z2.j$a */
    class C12131a extends C9841h {
        C12131a(C9853r rVar) {
            super(rVar);
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            if (C12130j.this.f22290b == 0) {
                return -1;
            }
            long R0 = super.mo24477R0(cVar, Math.min(j, (long) C12130j.this.f22290b));
            if (R0 == -1) {
                return -1;
            }
            C12130j jVar = C12130j.this;
            int unused = jVar.f22290b = (int) (((long) jVar.f22290b) - R0);
            return R0;
        }
    }

    /* renamed from: z2.j$b */
    class C12132b extends Inflater {
        C12132b(C12130j jVar) {
        }

        public int inflate(byte[] bArr, int i, int i2) {
            int inflate = super.inflate(bArr, i, i2);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(C12137n.f22301a);
            return super.inflate(bArr, i, i2);
        }
    }

    public C12130j(C9838e eVar) {
        C9844k kVar = new C9844k((C9853r) new C12131a(eVar), (Inflater) new C12132b(this));
        this.f22289a = kVar;
        this.f22291c = C9845l.m23738d(kVar);
    }

    /* renamed from: d */
    private void m31467d() {
        if (this.f22290b > 0) {
            this.f22289a.mo39094a();
            if (this.f22290b != 0) {
                throw new IOException("compressedLimit > 0: " + this.f22290b);
            }
        }
    }

    /* renamed from: e */
    private ByteString m31468e() {
        return this.f22291c.mo24789w((long) this.f22291c.readInt());
    }

    /* renamed from: c */
    public void mo42890c() {
        this.f22291c.close();
    }

    /* renamed from: f */
    public List<C12117e> mo42891f(int i) {
        this.f22290b += i;
        int readInt = this.f22291c.readInt();
        if (readInt < 0) {
            throw new IOException("numberOfPairs < 0: " + readInt);
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                ByteString asciiLowercase = m31468e().toAsciiLowercase();
                ByteString e = m31468e();
                if (asciiLowercase.size() != 0) {
                    arrayList.add(new C12117e(asciiLowercase, e));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            m31467d();
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: " + readInt);
        }
    }
}
