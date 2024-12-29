package p157f6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: f6.a */
class C9037a extends C9044g {

    /* renamed from: i */
    private String f16573i = null;

    C9037a(URL url, String str) {
        super(url, (URLConnection) null);
        this.f16573i = str;
    }

    /* renamed from: c */
    public boolean mo36919c() {
        return false;
    }

    /* renamed from: e */
    public File mo36920e() {
        return null;
    }

    /* renamed from: f */
    public InputStream mo36921f() {
        throw new FileNotFoundException(this.f16573i);
    }

    /* renamed from: j */
    public boolean mo36922j() {
        return false;
    }

    /* renamed from: k */
    public long mo36923k() {
        return -1;
    }

    /* renamed from: l */
    public long mo36924l() {
        return -1;
    }

    /* renamed from: m */
    public String[] mo36925m() {
        return null;
    }

    public String toString() {
        return super.toString() + "; BadResource=" + this.f16573i;
    }
}
