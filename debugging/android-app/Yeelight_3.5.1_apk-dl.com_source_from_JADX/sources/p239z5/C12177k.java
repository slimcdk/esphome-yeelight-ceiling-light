package p239z5;

import org.eclipse.jetty.http.C9910m;
import org.eclipse.jetty.p195io.EofException;
import p208s4.C10361m;
import p225w5.C11940d;

/* renamed from: z5.k */
public class C12177k extends C10361m {

    /* renamed from: a */
    protected final C12151b f22421a;

    /* renamed from: b */
    protected final C9910m f22422b;

    public C12177k(C12151b bVar) {
        this.f22421a = bVar;
        this.f22422b = (C9910m) bVar.mo42992t();
    }

    public int available() {
        return this.f22422b.mo39841g();
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        C11940d h = this.f22422b.mo39842h((long) this.f22421a.mo42990r());
        if (h != null) {
            return h.mo42404D0(bArr, i, i2);
        }
        if (!this.f22421a.mo42972H()) {
            return -1;
        }
        throw new EofException("early EOF");
    }
}
