package org.fourthline.cling.model.types;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.r */
public class C10097r {

    /* renamed from: c */
    private static final Logger f18626c = Logger.getLogger(C10097r.class.getName());

    /* renamed from: d */
    public static final Pattern f18627d = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: e */
    public static final Pattern f18628e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: a */
    private String f18629a;

    /* renamed from: b */
    private String f18630b;

    public C10097r(String str, String str2) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f18629a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-:\\.]{1,64}")) {
                this.f18630b = str2;
                return;
            }
            throw new IllegalArgumentException("Service ID suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Service ID namespace contains illegal characters");
    }

    /* renamed from: c */
    public static C10097r m25162c(String str) {
        C10103x xVar;
        try {
            xVar = C10103x.m25183d(str);
        } catch (Exception unused) {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        Matcher matcher = f18627d.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 2) {
            return new C10097r(matcher.group(1), matcher.group(2));
        }
        Matcher matcher2 = f18628e.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 2) {
            return new C10097r(matcher2.group(1), matcher2.group(2));
        }
        Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:").matcher(str);
        if (!matcher3.matches() || matcher3.groupCount() < 1) {
            String[] split = str.split("[:]");
            if (split.length == 4) {
                Logger logger = f18626c;
                logger.warning("UPnP specification violation, trying a simple colon-split of: " + str);
                return new C10097r(split[1], split[3]);
            }
            throw new InvalidValueException("Can't parse service ID string (namespace/id): " + str);
        }
        Logger logger2 = f18626c;
        logger2.warning("UPnP specification violation, no service ID token, defaulting to UNKNOWN: " + str);
        return new C10097r(matcher3.group(1), "UNKNOWN");
    }

    /* renamed from: a */
    public String mo40638a() {
        return this.f18630b;
    }

    /* renamed from: b */
    public String mo40639b() {
        return this.f18629a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10097r)) {
            return false;
        }
        C10097r rVar = (C10097r) obj;
        return this.f18630b.equals(rVar.f18630b) && this.f18629a.equals(rVar.f18629a);
    }

    public int hashCode() {
        return (this.f18629a.hashCode() * 31) + this.f18630b.hashCode();
    }

    public String toString() {
        return "urn:" + mo40639b() + ":serviceId:" + mo40638a();
    }
}
