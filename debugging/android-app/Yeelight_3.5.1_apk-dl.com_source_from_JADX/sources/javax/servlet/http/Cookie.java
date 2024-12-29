package javax.servlet.http;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Cookie implements Cloneable, Serializable {
    private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
    private static final String TSPECIALS = (Boolean.valueOf(System.getProperty("org.glassfish.web.rfc2109_cookie_names_enforced", "true")).booleanValue() ? "/()<>@,;:\\\"[]?={} \t" : ",; ");
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private static final long serialVersionUID = -6454587001725327448L;
    private String comment;
    private String domain;
    private boolean isHttpOnly = false;
    private int maxAge = -1;
    private String name;
    private String path;
    private boolean secure;
    private String value;
    private int version = 0;

    public Cookie(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(lStrings.getString("err.cookie_name_blank"));
        } else if (!isToken(str) || str.equalsIgnoreCase("Comment") || str.equalsIgnoreCase("Discard") || str.equalsIgnoreCase("Domain") || str.equalsIgnoreCase("Expires") || str.equalsIgnoreCase("Max-Age") || str.equalsIgnoreCase("Path") || str.equalsIgnoreCase("Secure") || str.equalsIgnoreCase("Version") || str.startsWith("$")) {
            throw new IllegalArgumentException(MessageFormat.format(lStrings.getString("err.cookie_name_is_token"), new Object[]{str}));
        } else {
            this.name = str;
            this.value = str2;
        }
    }

    private boolean isToken(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt >= 127 || TSPECIALS.indexOf(charAt) != -1) {
                return false;
            }
        }
        return true;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public String getComment() {
        return this.comment;
    }

    public String getDomain() {
        return this.domain;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public boolean getSecure() {
        return this.secure;
    }

    public String getValue() {
        return this.value;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isHttpOnly() {
        return this.isHttpOnly;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDomain(String str) {
        this.domain = str.toLowerCase(Locale.ENGLISH);
    }

    public void setHttpOnly(boolean z) {
        this.isHttpOnly = z;
    }

    public void setMaxAge(int i) {
        this.maxAge = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSecure(boolean z) {
        this.secure = z;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
