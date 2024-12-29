package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.C10018f;

/* renamed from: org.fourthline.cling.model.types.u */
public class C10100u {

    /* renamed from: e */
    public static final Pattern f18637e = Pattern.compile("urn:schemas-upnp-org:control-1-0#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* renamed from: f */
    public static final Pattern f18638f = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+)#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    /* renamed from: a */
    private String f18639a;

    /* renamed from: b */
    private String f18640b;

    /* renamed from: c */
    private String f18641c;

    /* renamed from: d */
    private Integer f18642d;

    public C10100u(String str, String str2, Integer num, String str3) {
        this.f18639a = str;
        this.f18640b = str2;
        this.f18642d = num;
        this.f18641c = str3;
        if (str3 != null && !C10018f.m24806e(str3)) {
            throw new IllegalArgumentException("Action name contains illegal characters: " + str3);
        }
    }

    public C10100u(C10098s sVar, String str) {
        this(sVar.mo40643a(), sVar.mo40644b(), Integer.valueOf(sVar.mo40645c()), str);
    }

    /* renamed from: g */
    public static C10100u m25173g(String str) {
        Matcher matcher = f18637e.matcher(str);
        try {
            if (matcher.matches()) {
                return new C10100u("schemas-upnp-org", "control-1-0", (Integer) null, matcher.group(1));
            }
            Matcher matcher2 = f18638f.matcher(str);
            if (matcher2.matches()) {
                return new C10100u(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)), matcher2.group(4));
            }
            throw new InvalidValueException("Can't parse action type string (namespace/type/version#actionName): " + str);
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse action type string (namespace/type/version#actionName) '%s': %s", new Object[]{str, e.toString()}));
        }
    }

    /* renamed from: a */
    public String mo40651a() {
        return this.f18641c;
    }

    /* renamed from: b */
    public String mo40652b() {
        return this.f18639a;
    }

    /* renamed from: c */
    public C10098s mo40653c() {
        if (this.f18642d == null) {
            return null;
        }
        return new C10098s(this.f18639a, this.f18640b, this.f18642d.intValue());
    }

    /* renamed from: d */
    public String mo40654d() {
        return this.f18640b;
    }

    /* renamed from: e */
    public String mo40655e() {
        StringBuilder sb;
        if (this.f18642d == null) {
            sb = new StringBuilder();
            sb.append("urn:");
            sb.append(mo40652b());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo40654d());
        } else {
            sb = new StringBuilder();
            sb.append("urn:");
            sb.append(mo40652b());
            sb.append(":service:");
            sb.append(mo40654d());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo40657f());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10100u)) {
            return false;
        }
        C10100u uVar = (C10100u) obj;
        if (!this.f18641c.equals(uVar.f18641c) || !this.f18639a.equals(uVar.f18639a) || !this.f18640b.equals(uVar.f18640b)) {
            return false;
        }
        Integer num = this.f18642d;
        Integer num2 = uVar.f18642d;
        return num == null ? num2 == null : num.equals(num2);
    }

    /* renamed from: f */
    public Integer mo40657f() {
        return this.f18642d;
    }

    public int hashCode() {
        int hashCode = ((((this.f18639a.hashCode() * 31) + this.f18640b.hashCode()) * 31) + this.f18641c.hashCode()) * 31;
        Integer num = this.f18642d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return mo40655e() + "#" + mo40651a();
    }
}
