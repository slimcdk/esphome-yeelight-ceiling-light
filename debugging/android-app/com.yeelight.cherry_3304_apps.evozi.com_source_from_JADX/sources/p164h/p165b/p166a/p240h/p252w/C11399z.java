package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p164h.p165b.p166a.p240h.C11216f;

/* renamed from: h.b.a.h.w.z */
public class C11399z {

    /* renamed from: e */
    public static final Pattern f22671e = Pattern.compile("urn:schemas-upnp-org:control-1-0#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* renamed from: f */
    public static final Pattern f22672f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+)#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* renamed from: a */
    private String f22673a;

    /* renamed from: b */
    private String f22674b;

    /* renamed from: c */
    private String f22675c;

    /* renamed from: d */
    private Integer f22676d;

    public C11399z(C11397x xVar, String str) {
        this(xVar.mo36137a(), xVar.mo36138b(), Integer.valueOf(xVar.mo36139c()), str);
    }

    public C11399z(String str, String str2, Integer num, String str3) {
        this.f22673a = str;
        this.f22674b = str2;
        this.f22676d = num;
        this.f22675c = str3;
        if (str3 != null && !C11216f.m29268e(str3)) {
            throw new IllegalArgumentException("Action name contains illegal characters: " + str3);
        }
    }

    /* renamed from: g */
    public static C11399z m29881g(String str) {
        Matcher matcher = f22671e.matcher(str);
        try {
            if (matcher.matches()) {
                return new C11399z("schemas-upnp-org", "control-1-0", (Integer) null, matcher.group(1));
            }
            Matcher matcher2 = f22672f.matcher(str);
            if (matcher2.matches()) {
                return new C11399z(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)), matcher2.group(4));
            }
            throw new C11391r("Can't parse action type string (namespace/type/version#actionName): " + str);
        } catch (RuntimeException e) {
            throw new C11391r(String.format("Can't parse action type string (namespace/type/version#actionName) '%s': %s", new Object[]{str, e.toString()}));
        }
    }

    /* renamed from: a */
    public String mo36145a() {
        return this.f22675c;
    }

    /* renamed from: b */
    public String mo36146b() {
        return this.f22673a;
    }

    /* renamed from: c */
    public C11397x mo36147c() {
        if (this.f22676d == null) {
            return null;
        }
        return new C11397x(this.f22673a, this.f22674b, this.f22676d.intValue());
    }

    /* renamed from: d */
    public String mo36148d() {
        return this.f22674b;
    }

    /* renamed from: e */
    public String mo36149e() {
        StringBuilder sb;
        if (this.f22676d == null) {
            sb = new StringBuilder();
            sb.append("urn:");
            sb.append(mo36146b());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo36148d());
        } else {
            sb = new StringBuilder();
            sb.append("urn:");
            sb.append(mo36146b());
            sb.append(":service:");
            sb.append(mo36148d());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo36151f());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11399z)) {
            return false;
        }
        C11399z zVar = (C11399z) obj;
        if (!this.f22675c.equals(zVar.f22675c) || !this.f22673a.equals(zVar.f22673a) || !this.f22674b.equals(zVar.f22674b)) {
            return false;
        }
        Integer num = this.f22676d;
        Integer num2 = zVar.f22676d;
        return num == null ? num2 == null : num.equals(num2);
    }

    /* renamed from: f */
    public Integer mo36151f() {
        return this.f22676d;
    }

    public int hashCode() {
        int hashCode = ((((this.f22673a.hashCode() * 31) + this.f22674b.hashCode()) * 31) + this.f22675c.hashCode()) * 31;
        Integer num = this.f22676d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return mo36149e() + "#" + mo36145a();
    }
}
