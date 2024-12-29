package org.fourthline.cling.model.message.header;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.fourthline.cling.model.message.header.z */
public class C10065z extends UpnpHeader<Integer> {

    /* renamed from: c */
    public static final Integer f18548c = Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);

    /* renamed from: d */
    public static final Pattern f18549d = Pattern.compile("Second-(?:([0-9]+)|infinite)");

    public C10065z() {
        mo40451e(1800);
    }

    public C10065z(int i) {
        mo40451e(Integer.valueOf(i));
    }

    /* renamed from: a */
    public String mo40448a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Second-");
        sb.append(((Integer) mo40449b()).equals(f18548c) ? "infinite" : (Serializable) mo40449b());
        return sb.toString();
    }

    /* renamed from: d */
    public void mo40450d(String str) {
        Matcher matcher = f18549d.matcher(str);
        if (matcher.matches()) {
            mo40451e(matcher.group(1) != null ? Integer.valueOf(Integer.parseInt(matcher.group(1))) : f18548c);
            return;
        }
        throw new InvalidHeaderException("Can't parse timeout seconds integer from: " + str);
    }
}
