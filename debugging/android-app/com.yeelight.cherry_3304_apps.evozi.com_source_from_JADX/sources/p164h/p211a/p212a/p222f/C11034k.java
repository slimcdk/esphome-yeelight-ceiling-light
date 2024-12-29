package p164h.p211a.p212a.p222f;

import p154d.p155b.C10731q;
import p164h.p211a.p212a.p216c.C10912n;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10943o;

/* renamed from: h.a.a.f.k */
public class C11034k extends C10731q {

    /* renamed from: a */
    protected final C11010b f21621a;

    /* renamed from: b */
    protected final C10912n f21622b;

    public C11034k(C11010b bVar) {
        this.f21621a = bVar;
        this.f21622b = (C10912n) bVar.mo34847t();
    }

    public int available() {
        return this.f21622b.mo34519g();
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        C10929e h = this.f21622b.mo34520h((long) this.f21621a.mo34845r());
        if (h != null) {
            return h.mo34554B0(bArr, i, i2);
        }
        if (!this.f21621a.mo34827F()) {
            return -1;
        }
        throw new C10943o("early EOF");
    }
}
