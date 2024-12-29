package p164h.p211a.p212a.p228h.p235z;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.z.b */
public class C11161b extends C11166f {

    /* renamed from: j */
    private static final C11158c f22114j = C11156b.m29015a(C11161b.class);

    /* renamed from: i */
    private File f22115i;

    public C11161b(URL url) {
        super(url, (URLConnection) null);
        String str;
        File file;
        try {
            this.f22115i = new File(new URI(url.toString()));
        } catch (Exception e) {
            f22114j.mo35488d(e);
            try {
                URI uri = new URI("file:" + C11139s.m28940f(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    file = new File(uri);
                } else {
                    file = new File("//" + uri.getAuthority() + C11139s.m28938d(url.getFile()));
                }
                this.f22115i = file;
            } catch (Exception e2) {
                f22114j.mo35488d(e2);
                mo35508k();
                Permission permission = this.f22132e.getPermission();
                this.f22115i = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        if (this.f22115i.isDirectory()) {
            if (!this.f22131d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                str = this.f22131d + MiotCloudImpl.COOKIE_PATH;
            } else {
                return;
            }
        } else if (this.f22131d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            String str2 = this.f22131d;
            str = str2.substring(0, str2.length() - 1);
        } else {
            return;
        }
        this.f22131d = str;
    }

    C11161b(URL url, URLConnection uRLConnection, File file) {
        super(url, uRLConnection);
        this.f22115i = file;
        if (file.isDirectory() && !this.f22131d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            this.f22131d += MiotCloudImpl.COOKIE_PATH;
        }
    }

    /* renamed from: a */
    public boolean mo35500a() {
        return this.f22115i.exists();
    }

    /* renamed from: b */
    public File mo35501b() {
        return this.f22115i;
    }

    /* renamed from: c */
    public InputStream mo35502c() {
        return new FileInputStream(this.f22115i);
    }

    /* renamed from: d */
    public long mo35503d() {
        return this.f22115i.lastModified();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11161b)) {
            return false;
        }
        File file = ((C11161b) obj).f22115i;
        File file2 = this.f22115i;
        if (file != file2) {
            return file2 != null && file2.equals(file);
        }
        return true;
    }

    public int hashCode() {
        File file = this.f22115i;
        return file == null ? super.hashCode() : file.hashCode();
    }
}
