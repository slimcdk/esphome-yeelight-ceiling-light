package org.fourthline.cling.model.types;

import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DLNADoc {

    /* renamed from: c */
    public static final Pattern f18592c = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");

    /* renamed from: a */
    private final String f18593a;

    /* renamed from: b */
    private final String f18594b;

    public enum Version {
        V1_0("1.00"),
        V1_5("1.50");
        

        /* renamed from: s */
        String f18595s;

        private Version(String str) {
            this.f18595s = str;
        }

        public String toString() {
            return this.f18595s;
        }
    }

    public DLNADoc(String str, String str2) {
        this.f18593a = str;
        this.f18594b = str2;
    }

    /* renamed from: c */
    public static DLNADoc m25068c(String str) {
        Matcher matcher = f18592c.matcher(str);
        if (matcher.matches()) {
            return new DLNADoc(matcher.group(1), matcher.group(2));
        }
        throw new InvalidValueException("Can't parse DLNADoc: " + str);
    }

    /* renamed from: a */
    public String mo40550a() {
        return this.f18593a;
    }

    /* renamed from: b */
    public String mo40551b() {
        return this.f18594b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DLNADoc.class != obj.getClass()) {
            return false;
        }
        DLNADoc dLNADoc = (DLNADoc) obj;
        return this.f18593a.equals(dLNADoc.f18593a) && this.f18594b.equals(dLNADoc.f18594b);
    }

    public int hashCode() {
        return (this.f18593a.hashCode() * 31) + this.f18594b.hashCode();
    }

    public String toString() {
        return mo40550a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + mo40551b();
    }
}
