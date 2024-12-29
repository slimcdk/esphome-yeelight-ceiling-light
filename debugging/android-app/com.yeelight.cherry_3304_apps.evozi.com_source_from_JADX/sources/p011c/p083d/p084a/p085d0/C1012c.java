package p011c.p083d.p084a.p085d0;

import java.io.IOException;
import p163g.C10838h;
import p163g.C4406c;
import p163g.C4415s;

/* renamed from: c.d.a.d0.c */
class C1012c extends C10838h {

    /* renamed from: b */
    private boolean f1319b;

    public C1012c(C4415s sVar) {
        super(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9439a(IOException iOException) {
        throw null;
    }

    public void close() {
        if (!this.f1319b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f1319b = true;
                mo9439a(e);
            }
        }
    }

    public void flush() {
        if (!this.f1319b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f1319b = true;
                mo9439a(e);
            }
        }
    }

    /* renamed from: p0 */
    public void mo9442p0(C4406c cVar, long j) {
        if (this.f1319b) {
            cVar.skip(j);
            return;
        }
        try {
            super.mo9442p0(cVar, j);
        } catch (IOException e) {
            this.f1319b = true;
            mo9439a(e);
        }
    }
}
