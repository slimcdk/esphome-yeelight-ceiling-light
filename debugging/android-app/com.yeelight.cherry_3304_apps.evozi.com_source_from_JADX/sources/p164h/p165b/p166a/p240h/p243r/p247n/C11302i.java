package p164h.p165b.p166a.p240h.p243r.p247n;

import com.xiaomi.mipush.sdk.Constants;
import p164h.p165b.p166a.p240h.p252w.C11389p;

/* renamed from: h.b.a.h.r.n.i */
public class C11302i extends C11296f0<C11389p> {

    /* renamed from: c */
    int f22431c = 1900;

    /* renamed from: d */
    String f22432d = "239.255.255.250";

    public C11302i() {
        mo35846e(new C11389p("239.255.255.250", 1900));
    }

    /* renamed from: a */
    public String mo35841a() {
        return ((C11389p) mo35845b()).toString();
    }

    /* renamed from: d */
    public void mo35842d(String str) {
        if (str.contains(Constants.COLON_SEPARATOR)) {
            try {
                this.f22431c = Integer.valueOf(str.substring(str.indexOf(Constants.COLON_SEPARATOR) + 1)).intValue();
                String substring = str.substring(0, str.indexOf(Constants.COLON_SEPARATOR));
                this.f22432d = substring;
                mo35846e(new C11389p(substring, this.f22431c));
            } catch (NumberFormatException e) {
                throw new C11304k("Invalid HOST header value, can't parse port: " + str + " - " + e.getMessage());
            }
        } else {
            this.f22432d = str;
            mo35846e(new C11389p(str, this.f22431c));
        }
    }
}
