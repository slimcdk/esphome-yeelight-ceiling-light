package p231y2;

import java.io.IOException;
import okio.C3564c;
import okio.C9840g;
import okio.C9852q;

/* renamed from: y2.c */
class C12021c extends C9840g {

    /* renamed from: b */
    private boolean f22041b;

    public C12021c(C9852q qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42633a(IOException iOException) {
        throw null;
    }

    public void close() {
        if (!this.f22041b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f22041b = true;
                mo42633a(e);
            }
        }
    }

    public void flush() {
        if (!this.f22041b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f22041b = true;
                mo42633a(e);
            }
        }
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        if (this.f22041b) {
            cVar.skip(j);
            return;
        }
        try {
            super.mo24476q0(cVar, j);
        } catch (IOException e) {
            this.f22041b = true;
            mo42633a(e);
        }
    }
}
