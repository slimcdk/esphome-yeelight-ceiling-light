package p164h.p165b.p166a.p240h.p252w;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.d0 */
public class C11363d0 extends C11397x {

    /* renamed from: g */
    public static final Pattern f22544g = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public C11363d0(String str) {
        this(str, 1);
    }

    public C11363d0(String str, int i) {
        super("schemas-upnp-org", str, i);
    }

    /* renamed from: f */
    public static C11363d0 m29782f(String str) {
        Matcher matcher = f22544g.matcher(str);
        try {
            if (matcher.matches()) {
                return new C11363d0(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new C11391r("Can't parse UDA service type string (namespace/type/version): " + str);
        } catch (RuntimeException e) {
            throw new C11391r(String.format("Can't parse UDA service type string (namespace/type/version) '%s': %s", new Object[]{str, e.toString()}));
        }
    }
}
