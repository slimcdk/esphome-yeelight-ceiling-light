package p164h.p211a.p212a.p228h.p235z;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: h.a.a.h.z.a */
class C11160a extends C11166f {

    /* renamed from: i */
    private String f22113i = null;

    C11160a(URL url, String str) {
        super(url, (URLConnection) null);
        this.f22113i = str;
    }

    /* renamed from: a */
    public boolean mo35500a() {
        return false;
    }

    /* renamed from: b */
    public File mo35501b() {
        return null;
    }

    /* renamed from: c */
    public InputStream mo35502c() {
        throw new FileNotFoundException(this.f22113i);
    }

    /* renamed from: d */
    public long mo35503d() {
        return -1;
    }

    public String toString() {
        return super.toString() + "; BadResource=" + this.f22113i;
    }
}
