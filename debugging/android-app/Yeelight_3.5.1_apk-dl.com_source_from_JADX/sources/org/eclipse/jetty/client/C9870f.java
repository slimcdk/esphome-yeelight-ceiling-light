package org.eclipse.jetty.client;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.util.C9995n;
import p225w5.C11940d;
import p225w5.C11945g;

/* renamed from: org.eclipse.jetty.client.f */
public class C9870f extends C9869e {

    /* renamed from: A */
    private File f17911A;

    /* renamed from: x */
    private int f17912x = 4096;

    /* renamed from: y */
    private String f17913y = "utf-8";

    /* renamed from: z */
    private ByteArrayOutputStream f17914z;

    public C9870f() {
        super(false);
    }

    public C9870f(boolean z) {
        super(z);
    }

    /* renamed from: g0 */
    private synchronized InputStream m23890g0() {
        return new FileInputStream(this.f17911A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo39562D(C11940d dVar) {
        super.mo39562D(dVar);
        if (this.f17914z == null) {
            this.f17914z = new ByteArrayOutputStream(this.f17912x);
        }
        dVar.mo42433l(this.f17914z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized void mo39558E(C11940d dVar, C11940d dVar2) {
        super.mo39558E(dVar, dVar2);
        int f = C9908k.f18084d.mo42459f(dVar);
        if (f == 12) {
            this.f17912x = C11945g.m30570h(dVar2);
        } else if (f == 16) {
            String b = C9995n.m24706b(dVar2.toString());
            int indexOf = b.indexOf("charset=");
            if (indexOf > 0) {
                String substring = b.substring(indexOf + 8);
                this.f17913y = substring;
                int indexOf2 = substring.indexOf(59);
                if (indexOf2 > 0) {
                    this.f17913y = this.f17913y.substring(0, indexOf2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public synchronized void mo39559G(C11940d dVar, int i, C11940d dVar2) {
        ByteArrayOutputStream byteArrayOutputStream = this.f17914z;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        super.mo39559G(dVar, i, dVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public synchronized void mo39563H() {
        if (this.f17911A != null) {
            mo39607O((C11940d) null);
            mo39608P(m23890g0());
        } else {
            super.mo39563H();
        }
    }

    /* renamed from: h0 */
    public synchronized byte[] mo39564h0() {
        ByteArrayOutputStream byteArrayOutputStream = this.f17914z;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
