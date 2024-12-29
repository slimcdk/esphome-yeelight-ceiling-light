package org.fourthline.cling.model.types;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.x */
public class C10103x extends C10097r {

    /* renamed from: f */
    private static Logger f18644f = Logger.getLogger(C10103x.class.getName());

    /* renamed from: g */
    public static final Pattern f18645g = Pattern.compile("urn:upnp-org:serviceId:([a-zA-Z_0-9\\-:\\.]{1,64})");

    /* renamed from: h */
    public static final Pattern f18646h = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-:\\.]{1,64})");

    public C10103x(String str) {
        super("upnp-org", str);
    }

    /* renamed from: d */
    public static C10103x m25183d(String str) {
        Matcher matcher = f18645g.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 1) {
            return new C10103x(matcher.group(1));
        }
        Matcher matcher2 = f18646h.matcher(str);
        if (matcher2.matches() && matcher2.groupCount() >= 1) {
            return new C10103x(matcher2.group(1));
        }
        Matcher matcher3 = Pattern.compile("urn:upnp-orgerviceId:urnchemas-upnp-orgervice:([a-zA-Z_0-9\\-:\\.]{1,64})").matcher(str);
        if (matcher3.matches()) {
            Logger logger = f18644f;
            logger.warning("UPnP specification violation, recovering from Eyecon garbage: " + str);
            return new C10103x(matcher3.group(1));
        } else if ("ContentDirectory".equals(str) || "ConnectionManager".equals(str) || "RenderingControl".equals(str) || "AVTransport".equals(str)) {
            Logger logger2 = f18644f;
            logger2.warning("UPnP specification violation, fixing broken Service ID: " + str);
            return new C10103x(str);
        } else {
            throw new InvalidValueException("Can't parse UDA service ID string (upnp-org/id): " + str);
        }
    }
}
