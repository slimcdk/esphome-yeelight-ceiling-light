package p157f6;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.eclipse.jetty.util.C9985i;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: f6.d */
public class C9040d extends C9044g {

    /* renamed from: j */
    private static final C9003c f16588j = C9001b.m21450a(C9040d.class);

    /* renamed from: i */
    protected JarURLConnection f16589i;

    /* renamed from: f6.d$a */
    class C9041a extends FilterInputStream {
        C9041a(InputStream inputStream) {
            super(inputStream);
        }

        public void close() {
            this.in = C9985i.m24691f();
        }
    }

    C9040d(URL url, boolean z) {
        super(url, (URLConnection) null, z);
    }

    /* renamed from: c */
    public boolean mo36919c() {
        return this.f16595d.endsWith("!/") ? mo36932u() : super.mo36919c();
    }

    /* renamed from: e */
    public File mo36920e() {
        return null;
    }

    /* renamed from: f */
    public InputStream mo36921f() {
        mo36932u();
        if (!this.f16595d.endsWith("!/")) {
            return new C9041a(super.mo36921f());
        }
        String str = this.f16595d;
        return new URL(str.substring(4, str.length() - 2)).openStream();
    }

    /* renamed from: r */
    public synchronized void mo36931r() {
        this.f16589i = null;
        super.mo36931r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public synchronized boolean mo36932u() {
        super.mo36932u();
        try {
            if (this.f16589i != this.f16596e) {
                mo36933w();
            }
        } catch (IOException e) {
            f16588j.mo36849d(e);
            this.f16589i = null;
        }
        return this.f16589i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo36933w() {
        this.f16589i = (JarURLConnection) this.f16596e;
    }
}
