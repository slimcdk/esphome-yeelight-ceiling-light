package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.l */
public class C11381l {

    /* renamed from: d */
    private static final Logger f22607d = Logger.getLogger(C11381l.class.getName());

    /* renamed from: e */
    public static final Pattern f22608e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: a */
    private String f22609a;

    /* renamed from: b */
    private String f22610b;

    /* renamed from: c */
    private int f22611c = 1;

    public C11381l(String str, String str2, int i) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f22609a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
                this.f22610b = str2;
                this.f22611c = i;
                return;
            }
            throw new IllegalArgumentException("Device type suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Device type namespace contains illegal characters");
    }

    /* renamed from: e */
    public static C11381l m29829e(String str) {
        C11359b0 b0Var;
        String replaceAll = str.replaceAll("\\s", "");
        try {
            b0Var = C11359b0.m29770f(replaceAll);
        } catch (Exception unused) {
            b0Var = null;
        }
        if (b0Var != null) {
            return b0Var;
        }
        try {
            Matcher matcher = f22608e.matcher(replaceAll);
            if (matcher.matches()) {
                return new C11381l(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device::([0-9]+).*").matcher(replaceAll);
            if (!matcher2.matches() || matcher2.groupCount() < 2) {
                Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:(.+?):([0-9]+).*").matcher(replaceAll);
                if (!matcher3.matches() || matcher3.groupCount() < 3) {
                    throw new C11391r("Can't parse device type string (namespace/type/version): " + replaceAll);
                }
                String replaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                Logger logger = f22607d;
                logger.warning("UPnP specification violation, replacing invalid device type token '" + matcher3.group(2) + "' with: " + replaceAll2);
                return new C11381l(matcher3.group(1), replaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
            }
            Logger logger2 = f22607d;
            logger2.warning("UPnP specification violation, no device type token, defaulting to UNKNOWN: " + replaceAll);
            return new C11381l(matcher2.group(1), "UNKNOWN", Integer.valueOf(matcher2.group(2)).intValue());
        } catch (RuntimeException e) {
            throw new C11391r(String.format("Can't parse device type string (namespace/type/version) '%s': %s", new Object[]{replaceAll, e.toString()}));
        }
    }

    /* renamed from: a */
    public String mo36089a() {
        return this.f22609a;
    }

    /* renamed from: b */
    public String mo36090b() {
        return this.f22610b;
    }

    /* renamed from: c */
    public int mo36091c() {
        return this.f22611c;
    }

    /* renamed from: d */
    public boolean mo36092d(C11381l lVar) {
        return this.f22609a.equals(lVar.f22609a) && this.f22610b.equals(lVar.f22610b) && this.f22611c >= lVar.f22611c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11381l)) {
            return false;
        }
        C11381l lVar = (C11381l) obj;
        return this.f22611c == lVar.f22611c && this.f22609a.equals(lVar.f22609a) && this.f22610b.equals(lVar.f22610b);
    }

    public int hashCode() {
        return (((this.f22609a.hashCode() * 31) + this.f22610b.hashCode()) * 31) + this.f22611c;
    }

    public String toString() {
        return "urn:" + mo36089a() + ":device:" + mo36090b() + Constants.COLON_SEPARATOR + mo36091c();
    }
}
