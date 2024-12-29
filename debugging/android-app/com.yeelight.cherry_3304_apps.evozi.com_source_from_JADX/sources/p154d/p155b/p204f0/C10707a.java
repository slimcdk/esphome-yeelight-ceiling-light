package p154d.p155b.p204f0;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/* renamed from: d.b.f0.a */
public class C10707a implements Cloneable, Serializable {

    /* renamed from: c */
    private static final String f20608c = (Boolean.valueOf(System.getProperty("org.glassfish.web.rfc2109_cookie_names_enforced", "true")).booleanValue() ? "/()<>@,;:\\\"[]?={} \t" : ",; ");

    /* renamed from: d */
    private static ResourceBundle f20609d = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* renamed from: a */
    private String f20610a;

    /* renamed from: b */
    private String f20611b;

    public C10707a(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(f20609d.getString("err.cookie_name_blank"));
        } else if (!m26490c(str) || str.equalsIgnoreCase("Comment") || str.equalsIgnoreCase("Discard") || str.equalsIgnoreCase("Domain") || str.equalsIgnoreCase("Expires") || str.equalsIgnoreCase("Max-Age") || str.equalsIgnoreCase("Path") || str.equalsIgnoreCase("Secure") || str.equalsIgnoreCase("Version") || str.startsWith("$")) {
            throw new IllegalArgumentException(MessageFormat.format(f20609d.getString("err.cookie_name_is_token"), new Object[]{str}));
        } else {
            this.f20610a = str;
            this.f20611b = str2;
        }
    }

    /* renamed from: c */
    private boolean m26490c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt >= 127 || f20608c.indexOf(charAt) != -1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public String mo33908a() {
        return this.f20610a;
    }

    /* renamed from: b */
    public String mo33909b() {
        return this.f20611b;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo33911d(String str) {
    }

    /* renamed from: e */
    public void mo33912e(String str) {
        str.toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: f */
    public void mo33913f(String str) {
    }

    /* renamed from: j */
    public void mo33914j(int i) {
    }
}
