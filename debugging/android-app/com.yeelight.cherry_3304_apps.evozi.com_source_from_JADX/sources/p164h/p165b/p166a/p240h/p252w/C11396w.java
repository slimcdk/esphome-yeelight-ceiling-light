package p164h.p165b.p166a.p240h.p252w;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.w */
public class C11396w {

    /* renamed from: c */
    private static final Logger f22660c = Logger.getLogger(C11396w.class.getName());

    /* renamed from: d */
    public static final Pattern f22661d = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: e */
    public static final Pattern f22662e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: a */
    private String f22663a;

    /* renamed from: b */
    private String f22664b;

    public C11396w(String str, String str2) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f22663a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-:\\.]{1,64}")) {
                this.f22664b = str2;
                return;
            }
            throw new IllegalArgumentException("Service ID suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Service ID namespace contains illegal characters");
    }

    /* renamed from: c */
    public static C11396w m29870c(String str) {
        C11361c0 c0Var;
        try {
            c0Var = C11361c0.m29776d(str);
        } catch (Exception unused) {
            c0Var = null;
        }
        if (c0Var != null) {
            return c0Var;
        }
        Matcher matcher = f22661d.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 2) {
            return new C11396w(matcher.group(1), matcher.group(2));
        }
        Matcher matcher2 = f22662e.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 2) {
            return new C11396w(matcher2.group(1), matcher2.group(2));
        }
        Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:").matcher(str);
        if (!matcher3.matches() || matcher3.groupCount() < 1) {
            String[] split = str.split("[:]");
            if (split.length == 4) {
                Logger logger = f22660c;
                logger.warning("UPnP specification violation, trying a simple colon-split of: " + str);
                return new C11396w(split[1], split[3]);
            }
            throw new C11391r("Can't parse service ID string (namespace/id): " + str);
        }
        Logger logger2 = f22660c;
        logger2.warning("UPnP specification violation, no service ID token, defaulting to UNKNOWN: " + str);
        return new C11396w(matcher3.group(1), "UNKNOWN");
    }

    /* renamed from: a */
    public String mo36132a() {
        return this.f22664b;
    }

    /* renamed from: b */
    public String mo36133b() {
        return this.f22663a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11396w)) {
            return false;
        }
        C11396w wVar = (C11396w) obj;
        return this.f22664b.equals(wVar.f22664b) && this.f22663a.equals(wVar.f22663a);
    }

    public int hashCode() {
        return (this.f22663a.hashCode() * 31) + this.f22664b.hashCode();
    }

    public String toString() {
        return "urn:" + mo36133b() + ":serviceId:" + mo36132a();
    }
}
