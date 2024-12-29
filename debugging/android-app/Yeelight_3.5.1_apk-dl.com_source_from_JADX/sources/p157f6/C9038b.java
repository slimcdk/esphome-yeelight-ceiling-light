package p157f6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import org.eclipse.jetty.util.C9997p;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: f6.b */
public class C9038b extends C9044g {

    /* renamed from: l */
    private static final C9003c f16574l = C9001b.m21450a(C9038b.class);

    /* renamed from: m */
    private static boolean f16575m = true;

    /* renamed from: i */
    private File f16576i;

    /* renamed from: j */
    private transient URL f16577j = null;

    /* renamed from: k */
    private transient boolean f16578k = false;

    public C9038b(URL url) {
        super(url, (URLConnection) null);
        String str;
        File file;
        try {
            this.f16576i = new File(new URI(url.toString()));
        } catch (Exception e) {
            f16574l.mo36849d(e);
            try {
                URI uri = new URI("file:" + C9997p.m24728f(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    file = new File(uri);
                } else {
                    file = new File("//" + uri.getAuthority() + C9997p.m24726d(url.getFile()));
                }
                this.f16576i = file;
            } catch (Exception e2) {
                f16574l.mo36849d(e2);
                mo36932u();
                Permission permission = this.f16596e.getPermission();
                this.f16576i = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        if (this.f16576i.isDirectory()) {
            if (!this.f16595d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                str = this.f16595d + MiotCloudImpl.COOKIE_PATH;
            } else {
                return;
            }
        } else if (this.f16595d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            String str2 = this.f16595d;
            str = str2.substring(0, str2.length() - 1);
        } else {
            return;
        }
        this.f16595d = str;
    }

    C9038b(URL url, URLConnection uRLConnection, File file) {
        super(url, uRLConnection);
        this.f16576i = file;
        if (file.isDirectory() && !this.f16595d.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            this.f16595d += MiotCloudImpl.COOKIE_PATH;
        }
    }

    /* renamed from: w */
    public static boolean m21590w() {
        return f16575m;
    }

    /* renamed from: a */
    public C9042e mo36927a(String str) {
        String str2;
        C9044g gVar;
        String b = C9997p.m24724b(str);
        if (MiotCloudImpl.COOKIE_PATH.equals(b)) {
            return this;
        }
        if (!mo36922j()) {
            gVar = (C9038b) super.mo36927a(b);
            str2 = gVar.f16595d;
        } else if (b != null) {
            str2 = C9997p.m24723a(this.f16595d, C9997p.m24728f(b.startsWith(MiotCloudImpl.COOKIE_PATH) ? b.substring(1) : b));
            gVar = (C9044g) C9042e.m21617n(str2);
        } else {
            throw new MalformedURLException();
        }
        String f = C9997p.m24728f(b);
        int length = gVar.toString().length() - f.length();
        int lastIndexOf = gVar.f16595d.lastIndexOf(f, length);
        if (length != lastIndexOf && ((length - 1 != lastIndexOf || b.endsWith(MiotCloudImpl.COOKIE_PATH) || !gVar.mo36922j()) && !(gVar instanceof C9037a))) {
            C9038b bVar = (C9038b) gVar;
            bVar.f16577j = new URL(str2);
            bVar.f16578k = true;
        }
        return gVar;
    }

    /* renamed from: c */
    public boolean mo36919c() {
        return this.f16576i.exists();
    }

    /* renamed from: d */
    public URL mo36928d() {
        if (f16575m && !this.f16578k) {
            try {
                String absolutePath = this.f16576i.getAbsolutePath();
                String canonicalPath = this.f16576i.getCanonicalPath();
                if (absolutePath.length() != canonicalPath.length() || !absolutePath.equals(canonicalPath)) {
                    this.f16577j = C9042e.m21621s(new File(canonicalPath));
                }
                this.f16578k = true;
                if (this.f16577j != null) {
                    C9003c cVar = f16574l;
                    if (cVar.mo36846a()) {
                        cVar.mo36850e("ALIAS abs=" + absolutePath, new Object[0]);
                        cVar.mo36850e("ALIAS can=" + canonicalPath, new Object[0]);
                    }
                }
            } catch (Exception e) {
                f16574l.mo36852g("EXCEPTION ", e);
                return mo36938h();
            }
        }
        return this.f16577j;
    }

    /* renamed from: e */
    public File mo36920e() {
        return this.f16576i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9038b)) {
            return false;
        }
        File file = ((C9038b) obj).f16576i;
        File file2 = this.f16576i;
        if (file != file2) {
            return file2 != null && file2.equals(file);
        }
        return true;
    }

    /* renamed from: f */
    public InputStream mo36921f() {
        return new FileInputStream(this.f16576i);
    }

    public int hashCode() {
        File file = this.f16576i;
        return file == null ? super.hashCode() : file.hashCode();
    }

    /* renamed from: j */
    public boolean mo36922j() {
        return this.f16576i.isDirectory();
    }

    /* renamed from: k */
    public long mo36923k() {
        return this.f16576i.lastModified();
    }

    /* renamed from: l */
    public long mo36924l() {
        return this.f16576i.length();
    }

    /* renamed from: m */
    public String[] mo36925m() {
        String[] list = this.f16576i.list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return list;
            }
            if (new File(this.f16576i, list[i]).isDirectory() && !list[i].endsWith(MiotCloudImpl.COOKIE_PATH)) {
                list[i] = list[i] + MiotCloudImpl.COOKIE_PATH;
            }
            length = i;
        }
    }
}
