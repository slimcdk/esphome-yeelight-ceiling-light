package p152e6;

import java.io.PrintStream;
import java.security.AccessControlException;
import java.util.Properties;
import org.apache.commons.p194io.FilenameUtils;
import org.eclipse.jetty.util.C9984h;

/* renamed from: e6.d */
public class C9004d extends C9000a {

    /* renamed from: i */
    private static final String f16502i = System.getProperty("line.separator");

    /* renamed from: j */
    private static C9984h f16503j;

    /* renamed from: k */
    private static final Properties f16504k;

    /* renamed from: l */
    private static final boolean f16505l;

    /* renamed from: m */
    private static final boolean f16506m = Boolean.parseBoolean(C9001b.f16496a.getProperty("org.eclipse.jetty.util.log.stderr.LONG", "false"));

    /* renamed from: a */
    private int f16507a;

    /* renamed from: b */
    private int f16508b;

    /* renamed from: c */
    private PrintStream f16509c;

    /* renamed from: d */
    private boolean f16510d;

    /* renamed from: e */
    private boolean f16511e;

    /* renamed from: f */
    private final String f16512f;

    /* renamed from: g */
    private final String f16513g;

    /* renamed from: h */
    private boolean f16514h;

    static {
        Properties properties = new Properties();
        f16504k = properties;
        Properties properties2 = C9001b.f16496a;
        f16505l = Boolean.parseBoolean(properties2.getProperty("org.eclipse.jetty.util.log.SOURCE", properties2.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", "false")));
        properties.putAll(C9001b.f16496a);
        String[] strArr = {"DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (System.getProperty(str) != null) {
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", new Object[]{str});
            }
        }
        try {
            f16503j = new C9984h("yyyy-MM-dd HH:mm:ss");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public C9004d() {
        this((String) null);
    }

    public C9004d(String str) {
        this(str, f16504k);
    }

    public C9004d(String str, Properties properties) {
        Properties properties2;
        this.f16507a = 2;
        this.f16509c = null;
        this.f16510d = f16505l;
        this.f16511e = f16506m;
        this.f16514h = false;
        if (!(properties == null || properties == (properties2 = f16504k))) {
            properties2.putAll(properties);
        }
        str = str == null ? "" : str;
        this.f16512f = str;
        this.f16513g = m21467m(str);
        int t = m21474t(properties, str);
        this.f16507a = t;
        this.f16508b = t;
        try {
            this.f16510d = Boolean.parseBoolean(properties.getProperty(str + ".SOURCE", Boolean.toString(this.f16510d)));
        } catch (AccessControlException unused) {
            this.f16510d = f16505l;
        }
    }

    /* renamed from: m */
    protected static String m21467m(String str) {
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

    /* renamed from: n */
    private void m21468n(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isISOControl(charAt)) {
                charAt = charAt == 10 ? '|' : charAt == 13 ? '<' : '?';
            }
            sb.append(charAt);
        }
    }

    /* renamed from: o */
    private void m21469o(StringBuilder sb, String str, String str2, Throwable th) {
        m21470p(sb, str, str2, new Object[0]);
        if (mo36858u()) {
            m21471q(sb, String.valueOf(th), new Object[0]);
        } else {
            m21472r(sb, th);
        }
    }

    /* renamed from: p */
    private void m21470p(StringBuilder sb, String str, String str2, Object... objArr) {
        m21475x(sb, f16503j.mo40246c(), f16503j.mo40245b(), str);
        m21471q(sb, str2, objArr);
    }

    /* renamed from: q */
    private void m21471q(StringBuilder sb, String str, Object... objArr) {
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
                m21468n(sb, str.substring(i2));
                sb.append(" ");
                sb.append(obj);
                i2 = str.length();
            } else {
                m21468n(sb, str.substring(i2, indexOf));
                sb.append(String.valueOf(obj));
                i2 = indexOf + 2;
            }
        }
        m21468n(sb, str.substring(i2));
    }

    /* renamed from: r */
    private void m21472r(StringBuilder sb, Throwable th) {
        if (th == null) {
            sb.append("null");
            return;
        }
        sb.append(f16502i);
        m21471q(sb, th.toString(), new Object[0]);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = 0;
        while (stackTrace != null && i < stackTrace.length) {
            sb.append(f16502i);
            sb.append("\tat ");
            m21471q(sb, stackTrace[i].toString(), new Object[0]);
            i++;
        }
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            sb.append(f16502i);
            sb.append("Caused by: ");
            m21472r(sb, cause);
        }
    }

    /* renamed from: s */
    protected static int m21473s(String str, String str2) {
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

    /* renamed from: t */
    public static int m21474t(Properties properties, String str) {
        while (str != null && str.length() > 0) {
            String property = properties.getProperty(str + ".LEVEL");
            int s = m21473s(str + ".LEVEL", property);
            if (s != -1) {
                return s;
            }
            int lastIndexOf = str.lastIndexOf(46);
            str = lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : null;
        }
        return m21473s("log.LEVEL", properties.getProperty("log.LEVEL", "INFO"));
    }

    /* renamed from: x */
    private void m21475x(StringBuilder sb, String str, int i, String str2) {
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
        sb.append(this.f16511e ? this.f16512f : this.f16513g);
        sb.append(':');
        if (this.f16510d) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                String className = stackTraceElement.getClassName();
                if (className.equals(C9004d.class.getName()) || className.equals(C9001b.class.getName())) {
                    i2++;
                } else {
                    if (this.f16511e || !className.startsWith("org.eclipse.jetty.")) {
                        sb.append(className);
                    } else {
                        sb.append(m21467m(className));
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
    public boolean mo36846a() {
        return this.f16507a <= 1;
    }

    /* renamed from: b */
    public void mo36847b(String str, Object... objArr) {
        if (this.f16507a <= 3) {
            StringBuilder sb = new StringBuilder(64);
            m21470p(sb, ":WARN:", str, objArr);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: c */
    public void mo36848c(Throwable th) {
        mo36854h("", th);
    }

    /* renamed from: d */
    public void mo36849d(Throwable th) {
        if (this.f16507a <= 0) {
            StringBuilder sb = new StringBuilder(64);
            m21469o(sb, ":IGNORED:", "", th);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: e */
    public void mo36850e(String str, Object... objArr) {
        if (this.f16507a <= 1) {
            StringBuilder sb = new StringBuilder(64);
            m21470p(sb, ":DBUG:", str, objArr);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: f */
    public void mo36851f(String str, Throwable th) {
        if (this.f16507a <= 2) {
            StringBuilder sb = new StringBuilder(64);
            m21469o(sb, ":INFO:", str, th);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: g */
    public void mo36852g(String str, Throwable th) {
        if (this.f16507a <= 3) {
            StringBuilder sb = new StringBuilder(64);
            m21469o(sb, ":WARN:", str, th);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    public String getName() {
        return this.f16512f;
    }

    /* renamed from: h */
    public void mo36854h(String str, Throwable th) {
        if (this.f16507a <= 1) {
            StringBuilder sb = new StringBuilder(64);
            m21469o(sb, ":DBUG:", str, th);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: i */
    public void mo36855i(String str, Object... objArr) {
        if (this.f16507a <= 2) {
            StringBuilder sb = new StringBuilder(64);
            m21470p(sb, ":INFO:", str, objArr);
            PrintStream printStream = this.f16509c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb);
        }
    }

    /* renamed from: j */
    public void mo36856j(Throwable th) {
        mo36852g("", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C9003c mo36844l(String str) {
        C9004d dVar = new C9004d(str);
        dVar.mo36859v(this.f16511e);
        dVar.mo36860w(this.f16510d);
        dVar.f16509c = this.f16509c;
        int i = this.f16507a;
        if (i != this.f16508b) {
            dVar.f16507a = i;
        }
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StdErrLog:");
        sb.append(this.f16512f);
        sb.append(":LEVEL=");
        int i = this.f16507a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "WARN" : "INFO" : "DEBUG" : "ALL");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo36858u() {
        return this.f16514h;
    }

    /* renamed from: v */
    public void mo36859v(boolean z) {
        this.f16511e = z;
    }

    /* renamed from: w */
    public void mo36860w(boolean z) {
        this.f16510d = z;
    }
}
