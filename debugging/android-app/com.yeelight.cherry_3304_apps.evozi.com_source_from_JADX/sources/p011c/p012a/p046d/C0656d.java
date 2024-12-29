package p011c.p012a.p046d;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: c.a.d.d */
public enum C0656d implements C0663e {
    IDENTITY {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return C0656d.m606d(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return C0656d.m606d(C0656d.m605c(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return C0656d.m605c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return C0656d.m605c(field.getName(), Constants.ACCEPT_TIME_SEPARATOR_SERVER).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo8701a(Field field) {
            return C0656d.m605c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: b */
    private static String m604b(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        return c + str.substring(i);
    }

    /* renamed from: c */
    static String m605c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: d */
    static String m606d(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m604b(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
