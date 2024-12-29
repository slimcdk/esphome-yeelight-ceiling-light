package p164h.p165b.p166a.p240h.p252w;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.w.c0 */
public class C11361c0 extends C11396w {

    /* renamed from: f */
    private static Logger f22541f = Logger.getLogger(C11361c0.class.getName());

    /* renamed from: g */
    public static final Pattern f22542g = Pattern.compile("urn:upnp-org:serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: h */
    public static final Pattern f22543h = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    public C11361c0(String str) {
        super("upnp-org", str);
    }

    /* renamed from: d */
    public static C11361c0 m29776d(String str) {
        Matcher matcher = f22542g.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 1) {
            return new C11361c0(matcher.group(1));
        }
        Matcher matcher2 = f22543h.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 1) {
            return new C11361c0(matcher2.group(1));
        }
        Matcher matcher3 = Pattern.compile("urn:upnp-orgerviceId:urnchemas-upnp-orgervice:([a-zA-Z_0-9\\-:\\.]{1,64})").matcher(str);
        if (matcher3.matches()) {
            Logger logger = f22541f;
            logger.warning("UPnP specification violation, recovering from Eyecon garbage: " + str);
            return new C11361c0(matcher3.group(1));
        } else if ("ContentDirectory".equals(str) || "ConnectionManager".equals(str) || "RenderingControl".equals(str) || "AVTransport".equals(str)) {
            Logger logger2 = f22541f;
            logger2.warning("UPnP specification violation, fixing broken Service ID: " + str);
            return new C11361c0(str);
        } else {
            throw new C11391r("Can't parse UDA service ID string (upnp-org/id): " + str);
        }
    }
}
