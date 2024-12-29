package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.j */
public class C10089j {

    /* renamed from: d */
    private static final Logger f18611d = Logger.getLogger(C10089j.class.getName());

    /* renamed from: e */
    public static final Pattern f18612e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: a */
    private String f18613a;

    /* renamed from: b */
    private String f18614b;

    /* renamed from: c */
    private int f18615c = 1;

    public C10089j(String str, String str2, int i) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f18613a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
                this.f18614b = str2;
                this.f18615c = i;
                return;
            }
            throw new IllegalArgumentException("Device type suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Device type namespace contains illegal characters");
    }

    /* renamed from: e */
    public static C10089j m25135e(String str) {
        C10102w wVar;
        String replaceAll = str.replaceAll("\\s", "");
        try {
            wVar = C10102w.m25182f(replaceAll);
        } catch (Exception unused) {
            wVar = null;
        }
        if (wVar != null) {
            return wVar;
        }
        try {
            Matcher matcher = f18612e.matcher(replaceAll);
            if (matcher.matches()) {
                return new C10089j(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device::([0-9]+).*").matcher(replaceAll);
            if (!matcher2.matches() || matcher2.groupCount() < 2) {
                Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):device:(.+?):([0-9]+).*").matcher(replaceAll);
                if (!matcher3.matches() || matcher3.groupCount() < 3) {
                    throw new InvalidValueException("Can't parse device type string (namespace/type/version): " + replaceAll);
                }
                String replaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                Logger logger = f18611d;
                logger.warning("UPnP specification violation, replacing invalid device type token '" + matcher3.group(2) + "' with: " + replaceAll2);
                return new C10089j(matcher3.group(1), replaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
            }
            Logger logger2 = f18611d;
            logger2.warning("UPnP specification violation, no device type token, defaulting to UNKNOWN: " + replaceAll);
            return new C10089j(matcher2.group(1), "UNKNOWN", Integer.valueOf(matcher2.group(2)).intValue());
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse device type string (namespace/type/version) '%s': %s", new Object[]{replaceAll, e.toString()}));
        }
    }

    /* renamed from: a */
    public String mo40610a() {
        return this.f18613a;
    }

    /* renamed from: b */
    public String mo40611b() {
        return this.f18614b;
    }

    /* renamed from: c */
    public int mo40612c() {
        return this.f18615c;
    }

    /* renamed from: d */
    public boolean mo40613d(C10089j jVar) {
        return this.f18613a.equals(jVar.f18613a) && this.f18614b.equals(jVar.f18614b) && this.f18615c >= jVar.f18615c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10089j)) {
            return false;
        }
        C10089j jVar = (C10089j) obj;
        return this.f18615c == jVar.f18615c && this.f18613a.equals(jVar.f18613a) && this.f18614b.equals(jVar.f18614b);
    }

    public int hashCode() {
        return (((this.f18613a.hashCode() * 31) + this.f18614b.hashCode()) * 31) + this.f18615c;
    }

    public String toString() {
        return "urn:" + mo40610a() + ":device:" + mo40611b() + Constants.COLON_SEPARATOR + mo40612c();
    }
}
