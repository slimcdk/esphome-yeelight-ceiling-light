package org.fourthline.cling.model;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.util.Locale;
import java.util.Set;

/* renamed from: org.fourthline.cling.model.f */
public class C10018f {

    /* renamed from: a */
    public static final boolean f18492a;

    /* renamed from: b */
    public static final boolean f18493b;

    static {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        try {
            if (Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("ID").get((Object) null) != null) {
                z = true;
                f18492a = z;
                String str = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get((Object) null);
                if (!"google_sdk".equals(str) && !"sdk".equals(str)) {
                    z2 = false;
                }
                z3 = z2;
                f18493b = z3;
            }
        } catch (Exception unused) {
        }
        z = false;
        f18492a = z;
        try {
            String str2 = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get((Object) null);
            z2 = false;
            z3 = z2;
        } catch (Exception unused2) {
        }
        f18493b = z3;
    }

    /* renamed from: a */
    public static String[] m24802a(String str) {
        return m24803b(str, true);
    }

    /* renamed from: b */
    public static String[] m24803b(String str, boolean z) {
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
    public static InetAddress m24804c(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static boolean m24805d(Set<Class> set, Class cls) {
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
    public static boolean m24806e(String str) {
        return f18492a ? (str == null || str.length() == 0) ? false : true : str != null && str.length() != 0 && !str.toLowerCase(Locale.ROOT).startsWith("xml") && str.matches("[a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*");
    }

    /* renamed from: f */
    public static String m24807f(Object[] objArr) {
        return m24808g(objArr, true, false);
    }

    /* renamed from: g */
    public static String m24808g(Object[] objArr, boolean z, boolean z2) {
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
