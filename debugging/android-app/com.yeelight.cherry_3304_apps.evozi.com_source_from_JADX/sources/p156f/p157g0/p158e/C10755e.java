package p156f.p157g0.p158e;

import java.io.IOException;
import p163g.C10838h;
import p163g.C4406c;
import p163g.C4415s;

/* renamed from: f.g0.e.e */
class C10755e extends C10838h {

    /* renamed from: b */
    private boolean f20635b;

    C10755e(C4415s sVar) {
        super(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23958a(IOException iOException) {
        throw null;
    }

    public void close() {
        if (!this.f20635b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f20635b = true;
                mo23958a(e);
            }
        }
    }

    public void flush() {
        if (!this.f20635b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f20635b = true;
                mo23958a(e);
            }
        }
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        if (this.f20635b) {
            cVar.skip(j);
            return;
        }
        try {
            super.mo9442p0(cVar, j);
        } catch (IOException e) {
            this.f20635b = true;
            mo23958a(e);
        }
    }
}
