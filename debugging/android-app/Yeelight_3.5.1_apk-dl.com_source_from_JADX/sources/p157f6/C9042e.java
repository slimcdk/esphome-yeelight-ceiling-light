package p157f6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import org.eclipse.jetty.util.C9985i;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9997p;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: f6.e */
public abstract class C9042e implements C9043f {

    /* renamed from: a */
    private static final C9003c f16591a = C9001b.m21450a(C9042e.class);

    /* renamed from: b */
    public static boolean f16592b = true;

    /* renamed from: b */
    private static String m21615b(String str) {
        return C9995n.m24710f(C9995n.m24710f(str, "<", "&lt;"), ">", "&gt;");
    }

    /* renamed from: i */
    private static String m21616i(String str) {
        StringBuffer stringBuffer;
        String str2;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                stringBuffer = null;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == '\'' || charAt == '<' || charAt == '>') {
                stringBuffer = new StringBuffer(str.length() << 1);
            } else {
                i++;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '\"') {
                str2 = "%22";
            } else if (charAt2 == '\'') {
                str2 = "%27";
            } else if (charAt2 == '<') {
                str2 = "%3C";
            } else if (charAt2 != '>') {
                stringBuffer.append(charAt2);
            } else {
                str2 = "%3E";
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    /* renamed from: n */
    public static C9042e m21617n(String str) {
        return m21618o(str, f16592b);
    }

    /* renamed from: o */
    public static C9042e m21618o(String str, boolean z) {
        try {
            URL url = new URL(str);
            String url2 = url.toString();
            if (url2.length() <= 0 || url2.charAt(url2.length() - 1) == str.charAt(str.length() - 1) || ((url2.charAt(url2.length() - 1) == '/' && url2.charAt(url2.length() - 2) == str.charAt(str.length() - 1)) || (str.charAt(str.length() - 1) == '/' && str.charAt(str.length() - 2) == url2.charAt(url2.length() - 1)))) {
                return m21619p(url);
            }
            return new C9037a(url, "Trailing special characters stripped by URL in " + str);
        } catch (MalformedURLException e) {
            if (str.startsWith("ftp:") || str.startsWith("file:") || str.startsWith("jar:")) {
                C9003c cVar = f16591a;
                cVar.mo36847b("Bad Resource: " + str, new Object[0]);
                throw e;
            }
            try {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                File canonicalFile = new File(str).getCanonicalFile();
                URL s = m21621s(canonicalFile);
                URLConnection openConnection = s.openConnection();
                openConnection.setUseCaches(z);
                return new C9038b(s, openConnection, canonicalFile);
            } catch (Exception e2) {
                f16591a.mo36854h("EXCEPTION ", e2);
                throw e;
            }
        }
    }

    /* renamed from: p */
    public static C9042e m21619p(URL url) {
        return m21620q(url, f16592b);
    }

    /* renamed from: q */
    static C9042e m21620q(URL url, boolean z) {
        if (url == null) {
            return null;
        }
        String externalForm = url.toExternalForm();
        if (!externalForm.startsWith("file:")) {
            return externalForm.startsWith("jar:file:") ? new C9039c(url, z) : externalForm.startsWith("jar:") ? new C9040d(url, z) : new C9044g(url, (URLConnection) null, z);
        }
        try {
            return new C9038b(url);
        } catch (Exception e) {
            f16591a.mo36854h("EXCEPTION ", e);
            return new C9037a(url, e.toString());
        }
    }

    /* renamed from: s */
    public static URL m21621s(File file) {
        return file.toURI().toURL();
    }

    /* renamed from: a */
    public abstract C9042e mo36927a(String str);

    /* renamed from: c */
    public abstract boolean mo36919c();

    /* renamed from: d */
    public URL mo36928d() {
        return null;
    }

    /* renamed from: e */
    public abstract File mo36920e();

    /* renamed from: f */
    public abstract InputStream mo36921f();

    /* access modifiers changed from: protected */
    public void finalize() {
        mo36931r();
    }

    /* renamed from: g */
    public String mo36936g(String str, boolean z) {
        String[] m;
        String b = C9997p.m24724b(str);
        if (b == null || !mo36922j() || (m = mo36925m()) == null) {
            return null;
        }
        Arrays.sort(m);
        String d = C9997p.m24726d(b);
        String str2 = "Directory: " + m21615b(d);
        StringBuilder sb = new StringBuilder(4096);
        sb.append("<HTML><HEAD>");
        sb.append("<LINK HREF=\"");
        sb.append("jetty-dir.css");
        sb.append("\" REL=\"stylesheet\" TYPE=\"text/css\"/><TITLE>");
        sb.append(str2);
        sb.append("</TITLE></HEAD><BODY>\n<H1>");
        sb.append(str2);
        sb.append("</H1>\n<TABLE BORDER=0>\n");
        if (z) {
            sb.append("<TR><TD><A HREF=\"");
            sb.append(C9997p.m24723a(b, "../"));
            sb.append("\">Parent Directory</A></TD><TD></TD><TD></TD></TR>\n");
        }
        String i = m21616i(b);
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        for (int i2 = 0; i2 < m.length; i2++) {
            C9042e a = mo36927a(m[i2]);
            sb.append("\n<TR><TD><A HREF=\"");
            String a2 = C9997p.m24723a(i, C9997p.m24728f(m[i2]));
            sb.append(a2);
            if (a.mo36922j() && !a2.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                sb.append(MiotCloudImpl.COOKIE_PATH);
            }
            sb.append("\">");
            sb.append(m21615b(m[i2]));
            sb.append("&nbsp;");
            sb.append("</A></TD><TD ALIGN=right>");
            sb.append(a.mo36924l());
            sb.append(" bytes&nbsp;</TD><TD>");
            sb.append(dateTimeInstance.format(new Date(a.mo36923k())));
            sb.append("</TD></TR>");
        }
        sb.append("</TABLE>\n");
        sb.append("</BODY></HTML>\n");
        return sb.toString();
    }

    public C9042e getResource(String str) {
        try {
            return mo36927a(str);
        } catch (Exception e) {
            f16591a.mo36848c(e);
            return null;
        }
    }

    /* renamed from: h */
    public abstract URL mo36938h();

    /* renamed from: j */
    public abstract boolean mo36922j();

    /* renamed from: k */
    public abstract long mo36923k();

    /* renamed from: l */
    public abstract long mo36924l();

    /* renamed from: m */
    public abstract String[] mo36925m();

    /* renamed from: r */
    public abstract void mo36931r();

    /* renamed from: t */
    public void mo36939t(OutputStream outputStream, long j, long j2) {
        InputStream f = mo36921f();
        try {
            f.skip(j);
            if (j2 < 0) {
                C9985i.m24688c(f, outputStream);
            } else {
                C9985i.m24689d(f, outputStream, j2);
            }
        } finally {
            f.close();
        }
    }
}
