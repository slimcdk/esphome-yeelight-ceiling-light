package org.fourthline.cling.model.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.w */
public class C10102w extends C10089j {

    /* renamed from: f */
    public static final Pattern f18643f = Pattern.compile("urn:schemas-upnp-org:device:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public C10102w(String str, int i) {
        super("schemas-upnp-org", str, i);
    }

    /* renamed from: f */
    public static C10102w m25182f(String str) {
        Matcher matcher = f18643f.matcher(str);
        try {
            if (matcher.matches()) {
                return new C10102w(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new InvalidValueException("Can't parse UDA device type string (namespace/type/version): " + str);
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse UDA device type string (namespace/type/version) '%s': %s", new Object[]{str, e.toString()}));
        }
    }
}
