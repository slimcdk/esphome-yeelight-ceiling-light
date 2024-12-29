package p164h.p165b.p166a.p240h.p252w;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.b0 */
public class C11359b0 extends C11381l {

    /* renamed from: f */
    public static final Pattern f22540f = Pattern.compile("urn:schemas-upnp-org:device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public C11359b0(String str, int i) {
        super("schemas-upnp-org", str, i);
    }

    /* renamed from: f */
    public static C11359b0 m29770f(String str) {
        Matcher matcher = f22540f.matcher(str);
        try {
            if (matcher.matches()) {
                return new C11359b0(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new C11391r("Can't parse UDA device type string (namespace/type/version): " + str);
        } catch (RuntimeException e) {
            throw new C11391r(String.format("Can't parse UDA device type string (namespace/type/version) '%s': %s", new Object[]{str, e.toString()}));
        }
    }
}
