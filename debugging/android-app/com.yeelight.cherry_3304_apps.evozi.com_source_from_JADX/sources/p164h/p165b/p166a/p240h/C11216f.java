package p164h.p165b.p166a.p240h;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.util.Locale;
import java.util.Set;

/* renamed from: h.b.a.h.f */
public class C11216f {

    /* renamed from: a */
    public static final boolean f22294a;

    /* renamed from: b */
    public static final boolean f22295b;

    static {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        try {
            if (Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("ID").get((Object) null) != null) {
                z = true;
                f22294a = z;
                String str = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get((Object) null);
                if (!"google_sdk".equals(str) && !"sdk".equals(str)) {
                    z2 = false;
                }
                z3 = z2;
                f22295b = z3;
            }
        } catch (Exception unused) {
        }
        z = false;
        f22294a = z;
        try {
            String str2 = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get((Object) null);
            z2 = false;
            z3 = z2;
        } catch (Exception unused2) {
        }
        f22295b = z3;
    }

    /* renamed from: a */
    public static String[] m29264a(String str) {
        return m29265b(str, true);
    }

    /* renamed from: b */
    public static String[] m29265b(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z) {
            str = str.replaceAll("\\\\,", "XXX1122334455XXX");
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replaceAll("XXX1122334455XXX", Constants.ACCEPT_TIME_SEPARATOR_SP);
            split[i] = split[i].replaceAll("\\\\\\\\", "\\\\");
        }
        return split;
    }

    /* renamed from: c */
    public static InetAddress m29266c(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m29267d(Set<Class> set, Class cls) {
        if (cls.isEnum()) {
            return true;
        }
        for (Class isAssignableFrom : set) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m29268e(String str) {
        return f22294a ? (str == null || str.length() == 0) ? false : true : str != null && str.length() != 0 && !str.toLowerCase(Locale.ROOT).startsWith("xml") && str.matches("[a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*");
    }

    /* renamed from: f */
    public static String m29269f(Object[] objArr) {
        return m29270g(objArr, true, false);
    }

    /* renamed from: g */
    public static String m29270g(Object[] objArr, boolean z, boolean z2) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            String replaceAll = obj.toString().replaceAll("\\\\", "\\\\\\\\");
            if (z) {
                replaceAll = replaceAll.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SP, "\\\\,");
            }
            if (z2) {
                replaceAll = replaceAll.replaceAll("\"", "\\\"");
            }
            sb.append(replaceAll);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
