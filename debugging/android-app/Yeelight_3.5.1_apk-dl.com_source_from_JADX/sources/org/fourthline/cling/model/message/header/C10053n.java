package org.fourthline.cling.model.message.header;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.message.header.n */
public class C10053n extends UpnpHeader<Integer> {

    /* renamed from: c */
    public static final Pattern f18547c = Pattern.compile(".*max-age\\s*=\\s*([0-9]+).*");

    public C10053n() {
        mo40451e(1800);
    }

    public C10053n(Integer num) {
        mo40451e(num);
    }

    /* renamed from: a */
    public String mo40448a() {
        return "max-age=" + ((Integer) mo40449b()).toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        Matcher matcher = f18547c.matcher(str.toLowerCase(Locale.ROOT));
        if (matcher.matches()) {
            mo40451e(Integer.valueOf(Integer.parseInt(matcher.group(1))));
            return;
        }
        throw new InvalidHeaderException("Invalid cache-control value, can't parse max-age seconds: " + str);
    }
}
