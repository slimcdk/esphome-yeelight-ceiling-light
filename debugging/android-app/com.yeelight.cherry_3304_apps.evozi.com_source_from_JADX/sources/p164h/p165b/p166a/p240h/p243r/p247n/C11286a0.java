package p164h.p165b.p166a.p240h.p243r.p247n;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.b.a.h.r.n.a0 */
public class C11286a0 extends C11296f0<Integer> {

    /* renamed from: c */
    public static final Integer f22397c = Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);

    /* renamed from: d */
    public static final Pattern f22398d = Pattern.compile("Second-(?:([0-9]+)|infinite)");

    public C11286a0() {
        mo35846e(1800);
    }

    public C11286a0(int i) {
        mo35846e(Integer.valueOf(i));
    }

    /* renamed from: a */
    public String mo35841a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Second-");
        sb.append(((Integer) mo35845b()).equals(f22397c) ? "infinite" : (Serializable) mo35845b());
        return sb.toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        Matcher matcher = f22398d.matcher(str);
        if (matcher.matches()) {
            mo35846e(matcher.group(1) != null ? Integer.valueOf(Integer.parseInt(matcher.group(1))) : f22397c);
            return;
        }
        throw new C11304k("Can't parse timeout seconds integer from: " + str);
    }
}
