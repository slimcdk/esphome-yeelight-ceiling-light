package p164h.p211a.p212a.p228h.p235z;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.z.e */
public abstract class C11165e {

    /* renamed from: a */
    private static final C11158c f22127a = C11156b.m29015a(C11165e.class);

    /* renamed from: b */
    public static boolean f22128b = true;

    /* renamed from: e */
    public static C11165e m29075e(String str) {
        return m29076f(str, f22128b);
    }

    /* renamed from: f */
    public static C11165e m29076f(String str, boolean z) {
        try {
            URL url = new URL(str);
            String url2 = url.toString();
            if (url2.length() <= 0 || url2.charAt(url2.length() - 1) == str.charAt(str.length() - 1) || ((url2.charAt(url2.length() - 1) == '/' && url2.charAt(url2.length() - 2) == str.charAt(str.length() - 1)) || (str.charAt(str.length() - 1) == '/' && str.charAt(str.length() - 2) == url2.charAt(url2.length() - 1)))) {
                return m29077g(url);
            }
            return new C11160a(url, "Trailing special characters stripped by URL in " + str);
        } catch (MalformedURLException e) {
            if (str.startsWith("ftp:") || str.startsWith("file:") || str.startsWith("jar:")) {
                C11158c cVar = f22127a;
                cVar.mo35486b("Bad Resource: " + str, new Object[0]);
                throw e;
            }
            try {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                File canonicalFile = new File(str).getCanonicalFile();
                URL j = m29079j(canonicalFile);
                URLConnection openConnection = j.openConnection();
                openConnection.setUseCaches(z);
                return new C11161b(j, openConnection, canonicalFile);
            } catch (Exception e2) {
                f22127a.mo35493i("EXCEPTION ", e2);
                throw e;
            }
        }
    }

    /* renamed from: g */
    public static C11165e m29077g(URL url) {
        return m29078h(url, f22128b);
    }

    /* renamed from: h */
    static C11165e m29078h(URL url, boolean z) {
        if (url == null) {
            return null;
        }
        String externalForm = url.toExternalForm();
        if (!externalForm.startsWith("file:")) {
            return externalForm.startsWith("jar:file:") ? new C11162c(url, z) : externalForm.startsWith("jar:") ? new C11163d(url, z) : new C11166f(url, (URLConnection) null, z);
        }
        try {
            return new C11161b(url);
        } catch (Exception e) {
            f22127a.mo35493i("EXCEPTION ", e);
            return new C11160a(url, e.toString());
        }
    }

    /* renamed from: j */
    public static URL m29079j(File file) {
        return file.toURI().toURL();
    }

    /* renamed from: a */
    public abstract boolean mo35500a();

    /* renamed from: b */
    public abstract File mo35501b();

    /* renamed from: c */
    public abstract InputStream mo35502c();

    /* renamed from: d */
    public abstract long mo35503d();

    /* access modifiers changed from: protected */
    public void finalize() {
        mo35507i();
    }

    /* renamed from: i */
    public abstract void mo35507i();
}
