package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.i */
public class C11372i {

    /* renamed from: c */
    public static final Pattern f22551c = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");

    /* renamed from: a */
    private final String f22552a;

    /* renamed from: b */
    private final String f22553b;

    public C11372i(String str, String str2) {
        this.f22552a = str;
        this.f22553b = str2;
    }

    /* renamed from: c */
    public static C11372i m29802c(String str) {
        Matcher matcher = f22551c.matcher(str);
        if (matcher.matches()) {
            return new C11372i(matcher.group(1), matcher.group(2));
        }
        throw new C11391r("Can't parse DLNADoc: " + str);
    }

    /* renamed from: a */
    public String mo36073a() {
        return this.f22552a;
    }

    /* renamed from: b */
    public String mo36074b() {
        return this.f22553b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11372i.class != obj.getClass()) {
            return false;
        }
        C11372i iVar = (C11372i) obj;
        return this.f22552a.equals(iVar.f22552a) && this.f22553b.equals(iVar.f22553b);
    }

    public int hashCode() {
        return (this.f22552a.hashCode() * 31) + this.f22553b.hashCode();
    }

    public String toString() {
        return mo36073a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + mo36074b();
    }
}
