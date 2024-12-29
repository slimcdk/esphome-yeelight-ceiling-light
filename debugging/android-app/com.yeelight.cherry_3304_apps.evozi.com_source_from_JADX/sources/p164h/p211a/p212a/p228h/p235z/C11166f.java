package p164h.p211a.p212a.p228h.p235z;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.z.f */
public class C11166f extends C11165e {

    /* renamed from: h */
    private static final C11158c f22129h = C11156b.m29015a(C11166f.class);

    /* renamed from: c */
    protected URL f22130c;

    /* renamed from: d */
    protected String f22131d;

    /* renamed from: e */
    protected URLConnection f22132e;

    /* renamed from: f */
    protected InputStream f22133f;

    /* renamed from: g */
    transient boolean f22134g;

    protected C11166f(URL url, URLConnection uRLConnection) {
        this.f22133f = null;
        this.f22134g = C11165e.f22128b;
        this.f22130c = url;
        this.f22131d = url.toString();
        this.f22132e = uRLConnection;
    }

    protected C11166f(URL url, URLConnection uRLConnection, boolean z) {
        this(url, uRLConnection);
        this.f22134g = z;
    }

    /* renamed from: a */
    public boolean mo35500a() {
        try {
            synchronized (this) {
                if (mo35508k() && this.f22133f == null) {
                    this.f22133f = this.f22132e.getInputStream();
                }
            }
        } catch (IOException e) {
            f22129h.mo35488d(e);
        }
        return this.f22133f != null;
    }

    /* renamed from: b */
    public File mo35501b() {
        if (mo35508k()) {
            Permission permission = this.f22132e.getPermission();
            if (permission instanceof FilePermission) {
                return new File(permission.getName());
            }
        }
        try {
            return new File(this.f22130c.getFile());
        } catch (Exception e) {
            f22129h.mo35488d(e);
            return null;
        }
    }

    /* renamed from: c */
    public synchronized InputStream mo35502c() {
        if (mo35508k()) {
            try {
                if (this.f22133f != null) {
                    InputStream inputStream = this.f22133f;
                    this.f22133f = null;
                    return inputStream;
                }
                InputStream inputStream2 = this.f22132e.getInputStream();
                this.f22132e = null;
                return inputStream2;
            } finally {
                this.f22132e = null;
            }
        } else {
            throw new IOException("Invalid resource");
        }
    }

    /* renamed from: d */
    public long mo35503d() {
        if (mo35508k()) {
            return this.f22132e.getLastModified();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11166f) && this.f22131d.equals(((C11166f) obj).f22131d);
    }

    public int hashCode() {
        return this.f22131d.hashCode();
    }

    /* renamed from: i */
    public synchronized void mo35507i() {
        if (this.f22133f != null) {
            try {
                this.f22133f.close();
            } catch (IOException e) {
                f22129h.mo35488d(e);
            }
            this.f22133f = null;
        }
        if (this.f22132e != null) {
            this.f22132e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public synchronized boolean mo35508k() {
        if (this.f22132e == null) {
            try {
                URLConnection openConnection = this.f22130c.openConnection();
                this.f22132e = openConnection;
                openConnection.setUseCaches(this.f22134g);
            } catch (IOException e) {
                f22129h.mo35488d(e);
            }
        }
        return this.f22132e != null;
    }

    /* renamed from: l */
    public boolean mo35512l() {
        return this.f22134g;
    }

    public String toString() {
        return this.f22131d;
    }
}
