package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.x */
public class C11397x {

    /* renamed from: d */
    private static final Logger f22665d = Logger.getLogger(C11397x.class.getName());

    /* renamed from: e */
    public static final Pattern f22666e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: f */
    public static final Pattern f22667f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: a */
    private String f22668a;

    /* renamed from: b */
    private String f22669b;

    /* renamed from: c */
    private int f22670c = 1;

    public C11397x(String str, String str2, int i) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f22668a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
                this.f22669b = str2;
                this.f22670c = i;
                return;
            }
            throw new IllegalArgumentException("Service type suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Service type namespace contains illegal characters");
    }

    /* renamed from: e */
    public static C11397x m29873e(String str) {
        if (str != null) {
            C11363d0 d0Var = null;
            String replaceAll = str.replaceAll("\\s", "");
            try {
                d0Var = C11363d0.m29782f(replaceAll);
            } catch (Exception unused) {
            }
            if (d0Var != null) {
                return d0Var;
            }
            try {
                Matcher matcher = f22666e.matcher(replaceAll);
                if (matcher.matches() && matcher.groupCount() >= 3) {
                    return new C11397x(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
                }
                Matcher matcher2 = f22667f.matcher(replaceAll);
                if (matcher2.matches() && matcher2.groupCount() >= 3) {
                    return new C11397x(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)).intValue());
                }
                Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:(.+?):([0-9]+).*").matcher(replaceAll);
                if (matcher3.matches()) {
                    if (matcher3.groupCount() >= 3) {
                        String replaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        Logger logger = f22665d;
                        logger.warning("UPnP specification violation, replacing invalid service type token '" + matcher3.group(2) + "' with: " + replaceAll2);
                        return new C11397x(matcher3.group(1), replaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
                    }
                }
                Matcher matcher4 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:(.+?):([0-9]+).*").matcher(replaceAll);
                if (!matcher4.matches() || matcher4.groupCount() < 3) {
                    throw new C11391r("Can't parse service type string (namespace/type/version): " + replaceAll);
                }
                String replaceAll3 = matcher4.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                Logger logger2 = f22665d;
                logger2.warning("UPnP specification violation, replacing invalid service type token '" + matcher4.group(2) + "' with: " + replaceAll3);
                return new C11397x(matcher4.group(1), replaceAll3, Integer.valueOf(matcher4.group(3)).intValue());
            } catch (RuntimeException e) {
                throw new C11391r(String.format("Can't parse service type string (namespace/type/version) '%s': %s", new Object[]{replaceAll, e.toString()}));
            }
        } else {
            throw new C11391r("Can't parse null string");
        }
    }

    /* renamed from: a */
    public String mo36137a() {
        return this.f22668a;
    }

    /* renamed from: b */
    public String mo36138b() {
        return this.f22669b;
    }

    /* renamed from: c */
    public int mo36139c() {
        return this.f22670c;
    }

    /* renamed from: d */
    public boolean mo36140d(C11397x xVar) {
        return xVar != null && this.f22668a.equals(xVar.f22668a) && this.f22669b.equals(xVar.f22669b) && this.f22670c >= xVar.f22670c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11397x)) {
            return false;
        }
        C11397x xVar = (C11397x) obj;
        return this.f22670c == xVar.f22670c && this.f22668a.equals(xVar.f22668a) && this.f22669b.equals(xVar.f22669b);
    }

    public int hashCode() {
        return (((this.f22668a.hashCode() * 31) + this.f22669b.hashCode()) * 31) + this.f22670c;
    }

    public String toString() {
        return "urn:" + mo36137a() + ":service:" + mo36138b() + Constants.COLON_SEPARATOR + mo36139c();
    }
}
