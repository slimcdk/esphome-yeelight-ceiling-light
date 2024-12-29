package p157f6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import org.eclipse.jetty.util.C9997p;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: f6.g */
public class C9044g extends C9042e {

    /* renamed from: h */
    private static final C9003c f16593h = C9001b.m21450a(C9044g.class);

    /* renamed from: c */
    protected URL f16594c;

    /* renamed from: d */
    protected String f16595d;

    /* renamed from: e */
    protected URLConnection f16596e;

    /* renamed from: f */
    protected InputStream f16597f;

    /* renamed from: g */
    transient boolean f16598g;

    protected C9044g(URL url, URLConnection uRLConnection) {
        this.f16597f = null;
        this.f16598g = C9042e.f16592b;
        this.f16594c = url;
        this.f16595d = url.toString();
        this.f16596e = uRLConnection;
    }

    protected C9044g(URL url, URLConnection uRLConnection, boolean z) {
        this(url, uRLConnection);
        this.f16598g = z;
    }

    /* renamed from: a */
    public C9042e mo36927a(String str) {
        if (str == null) {
            return null;
        }
        return C9042e.m21617n(C9997p.m24723a(this.f16594c.toExternalForm(), C9997p.m24724b(str)));
    }

    /* renamed from: c */
    public boolean mo36919c() {
        try {
            synchronized (this) {
                if (mo36932u() && this.f16597f == null) {
                    this.f16597f = this.f16596e.getInputStream();
                }
            }
        } catch (IOException e) {
            f16593h.mo36849d(e);
        }
        return this.f16597f != null;
    }

    /* renamed from: e */
    public File mo36920e() {
        if (mo36932u()) {
            Permission permission = this.f16596e.getPermission();
            if (permission instanceof FilePermission) {
                return new File(permission.getName());
            }
        }
        try {
            return new File(this.f16594c.getFile());
        } catch (Exception e) {
            f16593h.mo36849d(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9044g) && this.f16595d.equals(((C9044g) obj).f16595d);
    }

    /* renamed from: f */
    public synchronized InputStream mo36921f() {
        if (mo36932u()) {
            try {
                InputStream inputStream = this.f16597f;
                if (inputStream != null) {
                    this.f16597f = null;
                    return inputStream;
                }
                InputStream inputStream2 = this.f16596e.getInputStream();
                this.f16596e = null;
                return inputStream2;
            } finally {
                this.f16596e = null;
            }
        } else {
            throw new IOException("Invalid resource");
        }
    }

    /* renamed from: h */
    public URL mo36938h() {
        return this.f16594c;
    }

    public int hashCode() {
        return this.f16595d.hashCode();
    }

    /* renamed from: j */
    public boolean mo36922j() {
        return mo36919c() && this.f16594c.toString().endsWith(MiotCloudImpl.COOKIE_PATH);
    }

    /* renamed from: k */
    public long mo36923k() {
        if (mo36932u()) {
            return this.f16596e.getLastModified();
        }
        return -1;
    }

    /* renamed from: l */
    public long mo36924l() {
        if (mo36932u()) {
            return (long) this.f16596e.getContentLength();
        }
        return -1;
    }

    /* renamed from: m */
    public String[] mo36925m() {
        return null;
    }

    /* renamed from: r */
    public synchronized void mo36931r() {
        InputStream inputStream = this.f16597f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                f16593h.mo36849d(e);
            }
            this.f16597f = null;
        }
        if (this.f16596e != null) {
            this.f16596e = null;
        }
    }

    public String toString() {
        return this.f16595d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public synchronized boolean mo36932u() {
        if (this.f16596e == null) {
            try {
                URLConnection openConnection = this.f16594c.openConnection();
                this.f16596e = openConnection;
                openConnection.setUseCaches(this.f16598g);
            } catch (IOException e) {
                f16593h.mo36849d(e);
            }
        }
        return this.f16596e != null;
    }

    /* renamed from: v */
    public boolean mo36940v() {
        return this.f16598g;
    }
}
