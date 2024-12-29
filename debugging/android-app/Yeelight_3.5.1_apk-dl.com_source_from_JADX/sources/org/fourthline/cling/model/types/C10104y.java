package org.fourthline.cling.model.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.types.y */
public class C10104y extends C10098s {

    /* renamed from: g */
    public static final Pattern f18647g = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public C10104y(String str) {
        this(str, 1);
    }

    public C10104y(String str, int i) {
        super("schemas-upnp-org", str, i);
    }

    /* renamed from: f */
    public static C10104y m25184f(String str) {
        Matcher matcher = f18647g.matcher(str);
        try {
            if (matcher.matches()) {
                return new C10104y(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new InvalidValueException("Can't parse UDA service type string (namespace/type/version): " + str);
        } catch (RuntimeException e) {
            throw new InvalidValueException(String.format("Can't parse UDA service type string (namespace/type/version) '%s': %s", new Object[]{str, e.toString()}));
        }
    }
}
