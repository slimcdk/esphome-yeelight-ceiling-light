package p164h.p211a.p212a.p228h.p235z;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p164h.p211a.p212a.p228h.C11121i;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.z.d */
public class C11163d extends C11166f {

    /* renamed from: j */
    private static final C11158c f22124j = C11156b.m29015a(C11163d.class);

    /* renamed from: i */
    protected JarURLConnection f22125i;

    /* renamed from: h.a.a.h.z.d$a */
    class C11164a extends FilterInputStream {
        C11164a(InputStream inputStream) {
            super(inputStream);
        }

        public void close() {
            this.in = C11121i.m28876f();
        }
    }

    C11163d(URL url, boolean z) {
        super(url, (URLConnection) null, z);
    }

    /* renamed from: a */
    public boolean mo35500a() {
        return this.f22131d.endsWith("!/") ? mo35508k() : super.mo35500a();
    }

    /* renamed from: b */
    public File mo35501b() {
        return null;
    }

    /* renamed from: c */
    public InputStream mo35502c() {
        mo35508k();
        if (!this.f22131d.endsWith("!/")) {
            return new C11164a(super.mo35502c());
        }
        String str = this.f22131d;
        return new URL(str.substring(4, str.length() - 2)).openStream();
    }

    /* renamed from: i */
    public synchronized void mo35507i() {
        this.f22125i = null;
        super.mo35507i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public synchronized boolean mo35508k() {
        super.mo35508k();
        try {
            if (this.f22125i != this.f22132e) {
                mo35509m();
            }
        } catch (IOException e) {
            f22124j.mo35488d(e);
            this.f22125i = null;
        }
        return this.f22125i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo35509m() {
        this.f22125i = (JarURLConnection) this.f22132e;
    }
}
