package p164h.p211a.p212a.p213a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10934h;
import p164h.p211a.p212a.p228h.C11137q;

/* renamed from: h.a.a.a.f */
public class C10861f extends C10860e {

    /* renamed from: A */
    private File f20959A;

    /* renamed from: x */
    private int f20960x = 4096;

    /* renamed from: y */
    private String f20961y = "utf-8";

    /* renamed from: z */
    private ByteArrayOutputStream f20962z;

    public C10861f() {
        super(false);
    }

    public C10861f(boolean z) {
        super(z);
    }

    /* renamed from: g0 */
    private synchronized InputStream m27135g0() {
        return new FileInputStream(this.f20959A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo34231D(C10929e eVar) {
        super.mo34231D(eVar);
        if (this.f20962z == null) {
            this.f20962z = new ByteArrayOutputStream(this.f20960x);
        }
        eVar.writeTo(this.f20962z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized void mo34227E(C10929e eVar, C10929e eVar2) {
        super.mo34227E(eVar, eVar2);
        int f = C10910l.f21152d.mo34616f(eVar);
        if (f == 12) {
            this.f20960x = C10934h.m27672h(eVar2);
        } else if (f == 16) {
            String b = C11137q.m28919b(eVar2.toString());
            int indexOf = b.indexOf("charset=");
            if (indexOf > 0) {
                String substring = b.substring(indexOf + 8);
                this.f20961y = substring;
                int indexOf2 = substring.indexOf(59);
                if (indexOf2 > 0) {
                    this.f20961y = this.f20961y.substring(0, indexOf2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public synchronized void mo34228G(C10929e eVar, int i, C10929e eVar2) {
        if (this.f20962z != null) {
            this.f20962z.reset();
        }
        super.mo34228G(eVar, i, eVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public synchronized void mo34232H() {
        if (this.f20959A != null) {
            mo34306O((C10929e) null);
            mo34307P(m27135g0());
        } else {
            super.mo34232H();
        }
    }

    /* renamed from: h0 */
    public synchronized byte[] mo34233h0() {
        if (this.f20962z == null) {
            return null;
        }
        return this.f20962z.toByteArray();
    }
}
