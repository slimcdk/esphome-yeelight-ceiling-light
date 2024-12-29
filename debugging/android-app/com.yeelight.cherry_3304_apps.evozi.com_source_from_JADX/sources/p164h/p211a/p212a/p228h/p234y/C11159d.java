package p164h.p211a.p212a.p228h.p234y;

import java.io.PrintStream;
import java.security.AccessControlException;
import java.util.Properties;
import org.apache.commons.p271io.FilenameUtils;
import p164h.p211a.p212a.p228h.C11120h;

/* renamed from: h.a.a.h.y.d */
public class C11159d extends C11155a {

    /* renamed from: i */
    private static final String f22100i = System.getProperty("line.separator");

    /* renamed from: j */
    private static C11120h f22101j;

    /* renamed from: k */
    private static final Properties f22102k = new Properties();

    /* renamed from: l */
    private static final boolean f22103l;

    /* renamed from: m */
    private static final boolean f22104m = Boolean.parseBoolean(C11156b.f22094a.getProperty("org.eclipse.jetty.util.log.stderr.LONG", "false"));

    /* renamed from: a */
    private int f22105a;

    /* renamed from: b */
    private int f22106b;

    /* renamed from: c */
    private PrintStream f22107c;

    /* renamed from: d */
    private boolean f22108d;

    /* renamed from: e */
    private boolean f22109e;

    /* renamed from: f */
    private final String f22110f;

    /* renamed from: g */
    private final String f22111g;

    /* renamed from: h */
    private boolean f22112h;

    static {
        Properties properties = C11156b.f22094a;
        f22103l = Boolean.parseBoolean(properties.getProperty("org.eclipse.jetty.util.log.SOURCE", properties.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", "false")));
        f22102k.putAll(C11156b.f22094a);
        String[] strArr = {"DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (System.getProperty(str) != null) {
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", new Object[]{str});
            }
        }
        try {
            f22101j = new C11120h("yyyy-MM-dd HH:mm:ss");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public C11159d() {
        this((String) null);
    }

    public C11159d(String str) {
        this(str, f22102k);
    }

    public C11159d(String str, Properties properties) {
        Properties properties2;
        this.f22105a = 2;
        this.f22107c = null;
        this.f22108d = f22103l;
        this.f22109e = f22104m;
        this.f22112h = false;
        if (!(properties == null || properties == (properties2 = f22102k))) {
            properties2.putAll(properties);
        }
        str = str == null ? "" : str;
        this.f22110f = str;
        this.f22111g = m29033n(str);
        int u = m29040u(properties, this.f22110f);
        this.f22105a = u;
        this.f22106b = u;
        try {
            this.f22108d = Boolean.parseBoolean(properties.getProperty(this.f22110f + ".SOURCE", Boolean.toString(this.f22108d)));
        } catch (AccessControlException unused) {
            this.f22108d = f22103l;
        }
    }

    /* renamed from: n */
    protected static String m29033n(String str) {
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            sb.append(split[i].charAt(0));
        }
        if (sb.length() > 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        sb.append(split[split.length - 1]);
        return sb.toString();
    }

    /* renamed from: o */
    private void m29034o(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isISOControl(charAt)) {
                charAt = charAt == 10 ? '|' : charAt == 13 ? '<' : '?';
            }
            sb.append(charAt);
        }
    }

    /* renamed from: p */
    private void m29035p(StringBuilder sb, String str, String str2, Throwable th) {
        m29036q(sb, str, str2, new Object[0]);
        if (mo35497v()) {
            m29037r(sb, String.valueOf(th), new Object[0]);
        } else {
            m29038s(sb, th);
        }
    }

    /* renamed from: q */
    private void m29036q(StringBuilder sb, String str, String str2, Object... objArr) {
        m29041y(sb, f22101j.mo35359c(), f22101j.mo35358b(), str);
        m29037r(sb, str2, objArr);
    }

    /* renamed from: r */
    private void m29037r(StringBuilder sb, String str, Object... objArr) {
        if (str == null) {
            str = "";
            for (int i = 0; i < objArr.length; i++) {
                str = str + "{} ";
            }
        }
        int i2 = 0;
        for (Object obj : objArr) {
            int indexOf = str.indexOf("{}", i2);
            if (indexOf < 0) {
                m29034o(sb, str.substring(i2));
                sb.append(" ");
                sb.append(obj);
                i2 = str.length();
            } else {
                m29034o(sb, str.substring(i2, indexOf));
                sb.append(String.valueOf(obj));
                i2 = indexOf + 2;
            }
        }
        m29034o(sb, str.substring(i2));
    }

    /* renamed from: s */
    private void m29038s(StringBuilder sb, Throwable th) {
        if (th == null) {
            sb.append("null");
            return;
        }
        sb.append(f22100i);
        m29037r(sb, th.toString(), new Object[0]);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = 0;
        while (stackTrace != null && i < stackTrace.length) {
            sb.append(f22100i);
            sb.append("\tat ");
            m29037r(sb, stackTrace[i].toString(), new Object[0]);
            i++;
        }
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            sb.append(f22100i);
            sb.append("Caused by: ");
            m29038s(sb, cause);
        }
    }

    /* renamed from: t */
    protected static int m29039t(String str, String str2) {
        if (str2 == null) {
            return -1;
        }
        String trim = str2.trim();
        if ("ALL".equalsIgnoreCase(trim)) {
            return 0;
        }
        if ("DEBUG".equalsIgnoreCase(trim)) {
            return 1;
        }
        if ("INFO".equalsIgnoreCase(trim)) {
            return 2;
        }
        if ("WARN".equalsIgnoreCase(trim)) {
            return 3;
        }
        PrintStream printStream = System.err;
        printStream.println("Unknown StdErrLog level [" + str + "]=[" + trim + "], expecting only [ALL, DEBUG, INFO, WARN] as values.");
        return -1;
    }

    /* renamed from: u */
    public static int m29040u(Properties properties, String str) {
        while (str != null && str.length() > 0) {
            String property = properties.getProperty(str + ".LEVEL");
            int t = m29039t(str + ".LEVEL", property);
            if (t != -1) {
                return t;
            }
            int lastIndexOf = str.lastIndexOf(46);
            str = lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : null;
        }
        return m29039t("log.LEVEL", properties.getProperty("log.LEVEL", "INFO"));
    }

    /* renamed from: y */
    private void m29041y(StringBuilder sb, String str, int i, String str2) {
        int i2 = 0;
        sb.setLength(0);
        sb.append(str);
        if (i > 99) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        } else {
            sb.append(i > 9 ? ".0" : ".00");
        }
        sb.append(i);
        sb.append(str2);
        sb.append(this.f22109e ? this.f22110f : this.f22111g);
        sb.append(':');
        if (this.f22108d) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                String className = stackTraceElement.getClassName();
                if (className.equals(C11159d.class.getName()) || className.equals(C11156b.class.getName())) {
                    i2++;
                } else {
                    if (this.f22109e || !className.startsWith("org.eclipse.jetty.")) {
                        sb.append(className);
                    } else {
                        sb.append(m29033n(className));
                    }
                    sb.append('#');
                    sb.append(stackTraceElement.getMethodName());
                    if (stackTraceElement.getFileName() != null) {
                        sb.append('(');
                        sb.append(stackTraceElement.getFileName());
                        sb.append(':');
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(')');
                    }
                    sb.append(':');
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo35485a() {
        return this.f22105a <= 1;
    }

    /* renamed from: b */
    public void mo35486b(String str, Object... objArr) {
        if (this.f22105a <= 3) {
            StringBuilder sb = new StringBuilder(64);
            m29036q(sb, ":WARN:", str, objArr);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: c */
    public void mo35487c(Throwable th) {
        mo35493i("", th);
    }

    /* renamed from: d */
    public void mo35488d(Throwable th) {
        if (this.f22105a <= 0) {
            StringBuilder sb = new StringBuilder(64);
            m29035p(sb, ":IGNORED:", "", th);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: e */
    public void mo35489e(String str, Object... objArr) {
        if (this.f22105a <= 1) {
            StringBuilder sb = new StringBuilder(64);
            m29036q(sb, ":DBUG:", str, objArr);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: g */
    public void mo35490g(String str, Throwable th) {
        if (this.f22105a <= 2) {
            StringBuilder sb = new StringBuilder(64);
            m29035p(sb, ":INFO:", str, th);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    public String getName() {
        return this.f22110f;
    }

    /* renamed from: h */
    public void mo35492h(String str, Throwable th) {
        if (this.f22105a <= 3) {
            StringBuilder sb = new StringBuilder(64);
            m29035p(sb, ":WARN:", str, th);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: i */
    public void mo35493i(String str, Throwable th) {
        if (this.f22105a <= 1) {
            StringBuilder sb = new StringBuilder(64);
            m29035p(sb, ":DBUG:", str, th);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: j */
    public void mo35494j(String str, Object... objArr) {
        if (this.f22105a <= 2) {
            StringBuilder sb = new StringBuilder(64);
            m29036q(sb, ":INFO:", str, objArr);
            PrintStream printStream = this.f22107c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: k */
    public void mo35495k(Throwable th) {
        mo35492h("", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C11158c mo35483m(String str) {
        C11159d dVar = new C11159d(str);
        dVar.mo35498w(this.f22109e);
        dVar.mo35499x(this.f22108d);
        dVar.f22107c = this.f22107c;
        int i = this.f22105a;
        if (i != this.f22106b) {
            dVar.f22105a = i;
        }
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StdErrLog:");
        sb.append(this.f22110f);
        sb.append(":LEVEL=");
        int i = this.f22105a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "WARN" : "INFO" : "DEBUG" : "ALL");
        return sb.toString();
    }

    /* renamed from: v */
    public boolean mo35497v() {
        return this.f22112h;
    }

    /* renamed from: w */
    public void mo35498w(boolean z) {
        this.f22109e = z;
    }

    /* renamed from: x */
    public void mo35499x(boolean z) {
        this.f22108d = z;
    }
}
