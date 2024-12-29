package p063l5;

import java.io.IOException;
import okio.C3564c;
import okio.C9840g;
import okio.C9852q;

/* renamed from: l5.e */
class C9533e extends C9840g {

    /* renamed from: b */
    private boolean f17368b;

    C9533e(C9852q qVar) {
        super(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24054a(IOException iOException) {
        throw null;
    }

    public void close() {
        if (!this.f17368b) {
            try {
                super.close();
            } catch (IOException e) {
                this.f17368b = true;
                mo24054a(e);
            }
        }
    }

    public void flush() {
        if (!this.f17368b) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f17368b = true;
                mo24054a(e);
            }
        }
    }

    /* renamed from: q0 */
    public void mo24476q0(C3564c cVar, long j) {
        if (this.f17368b) {
            cVar.skip(j);
            return;
        }
        try {
            super.mo24476q0(cVar, j);
        } catch (IOException e) {
            this.f17368b = true;
            mo24054a(e);
        }
    }
}
