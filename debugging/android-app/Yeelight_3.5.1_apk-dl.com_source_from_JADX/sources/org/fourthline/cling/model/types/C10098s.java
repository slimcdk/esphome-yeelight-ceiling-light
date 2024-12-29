package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.s */
public class C10098s {

    /* renamed from: d */
    private static final Logger f18631d = Logger.getLogger(C10098s.class.getName());

    /* renamed from: e */
    public static final Pattern f18632e = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: f */
    public static final Pattern f18633f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    /* renamed from: a */
    private String f18634a;

    /* renamed from: b */
    private String f18635b;

    /* renamed from: c */
    private int f18636c = 1;

    public C10098s(String str, String str2, int i) {
        if (str == null || str.matches("[a-zA-Z0-9\\-\\.]+")) {
            this.f18634a = str;
            if (str2 == null || str2.matches("[a-zA-Z_0-9\\-]{1,64}")) {
                this.f18635b = str2;
                this.f18636c = i;
                return;
            }
            throw new IllegalArgumentException("Service type suffix too long (64) or contains illegal characters");
        }
        throw new IllegalArgumentException("Service type namespace contains illegal characters");
    }

    /* renamed from: e */
    public static C10098s m25165e(String str) {
        if (str != null) {
            C10104y yVar = null;
            String replaceAll = str.replaceAll("\\s", "");
            try {
                yVar = C10104y.m25184f(replaceAll);
            } catch (Exception unused) {
            }
            if (yVar != null) {
                return yVar;
            }
            try {
                Matcher matcher = f18632e.matcher(replaceAll);
                if (matcher.matches() && matcher.groupCount() >= 3) {
                    return new C10098s(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
                }
                Matcher matcher2 = f18633f.matcher(replaceAll);
                if (matcher2.matches() && matcher2.groupCount() >= 3) {
                    return new C10098s(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)).intValue());
                }
                Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:(.+?):([0-9]+).*").matcher(replaceAll);
                if (matcher3.matches()) {
                    if (matcher3.groupCount() >= 3) {
                        String replaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        Logger logger = f18631d;
                        logger.warning("UPnP specification violation, replacing invalid service type token '" + matcher3.group(2) + "' with: " + replaceAll2);
                        return new C10098s(matcher3.group(1), replaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
                    }
                }
                Matcher matcher4 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:(.+?):([0-9]+).*").matcher(replaceAll);
                if (!matcher4.matches() || matcher4.groupCount() < 3) {
                    throw new InvalidValueException("Can't parse service type string (namespace/type/version): " + replaceAll);
                }
                String replaceAll3 = matcher4.group(2).replaceAll("[^a-zA-Z_0-9\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                Logger logger2 = f18631d;
                logger2.warning("UPnP specification violation, replacing invalid service type token '" + matcher4.group(2) + "' with: " + replaceAll3);
                return new C10098s(matcher4.group(1), replaceAll3, Integer.valueOf(matcher4.group(3)).intValue());
            } catch (RuntimeException e) {
                throw new InvalidValueException(String.format("Can't parse service type string (namespace/type/version) '%s': %s", new Object[]{replaceAll, e.toString()}));
            }
        } else {
            throw new InvalidValueException("Can't parse null string");
        }
    }

    /* renamed from: a */
    public String mo40643a() {
        return this.f18634a;
    }

    /* renamed from: b */
    public String mo40644b() {
        return this.f18635b;
    }

    /* renamed from: c */
    public int mo40645c() {
        return this.f18636c;
    }

    /* renamed from: d */
    public boolean mo40646d(C10098s sVar) {
        return sVar != null && this.f18634a.equals(sVar.f18634a) && this.f18635b.equals(sVar.f18635b) && this.f18636c >= sVar.f18636c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10098s)) {
            return false;
        }
        C10098s sVar = (C10098s) obj;
        return this.f18636c == sVar.f18636c && this.f18634a.equals(sVar.f18634a) && this.f18635b.equals(sVar.f18635b);
    }

    public int hashCode() {
        return (((this.f18634a.hashCode() * 31) + this.f18635b.hashCode()) * 31) + this.f18636c;
    }

    public String toString() {
        return "urn:" + mo40643a() + ":service:" + mo40644b() + Constants.COLON_SEPARATOR + mo40645c();
    }
}
