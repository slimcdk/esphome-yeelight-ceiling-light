package p073n5;

import androidx.appcompat.widget.ActivityChooserView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.C3509b0;
import okhttp3.C3535l;
import okhttp3.C3544s;
import okhttp3.C3546t;
import okhttp3.C3558z;
import okhttp3.C9830m;
import okio.ByteString;
import p056k5.C3300c;

/* renamed from: n5.e */
public final class C9732e {
    static {
        ByteString.encodeUtf8("\"\\");
        ByteString.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static long m23355a(C3544s sVar) {
        return m23364j(sVar.mo24544c("Content-Length"));
    }

    /* renamed from: b */
    public static long m23356b(C3509b0 b0Var) {
        return m23355a(b0Var.mo24363k());
    }

    /* renamed from: c */
    public static boolean m23357c(C3509b0 b0Var) {
        if (b0Var.mo24372z().mo24658g().equals("HEAD")) {
            return false;
        }
        int d = b0Var.mo24359d();
        return (((d >= 100 && d < 200) || d == 204 || d == 304) && m23356b(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0Var.mo24361h("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static boolean m23358d(C3544s sVar) {
        return m23365k(sVar).contains("*");
    }

    /* renamed from: e */
    public static boolean m23359e(C3509b0 b0Var) {
        return m23358d(b0Var.mo24363k());
    }

    /* renamed from: f */
    public static int m23360f(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: g */
    public static void m23361g(C9830m mVar, C3546t tVar, C3544s sVar) {
        if (mVar != C9830m.f17822a) {
            List<C3535l> f = C3535l.m9750f(tVar, sVar);
            if (!f.isEmpty()) {
                mVar.mo39077a(tVar, f);
            }
        }
    }

    /* renamed from: h */
    public static int m23362h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static int m23363i(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: j */
    private static long m23364j(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: k */
    public static Set<String> m23365k(C3544s sVar) {
        Set<String> emptySet = Collections.emptySet();
        int h = sVar.mo24548h();
        for (int i = 0; i < h; i++) {
            if ("Vary".equalsIgnoreCase(sVar.mo24545e(i))) {
                String i2 = sVar.mo24550i(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : i2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: l */
    private static Set<String> m23366l(C3509b0 b0Var) {
        return m23365k(b0Var.mo24363k());
    }

    /* renamed from: m */
    public static C3544s m23367m(C3544s sVar, C3544s sVar2) {
        Set<String> k = m23365k(sVar2);
        if (k.isEmpty()) {
            return new C3544s.C3545a().mo24556d();
        }
        C3544s.C3545a aVar = new C3544s.C3545a();
        int h = sVar.mo24548h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24545e(i);
            if (k.contains(e)) {
                aVar.mo24553a(e, sVar.mo24550i(i));
            }
        }
        return aVar.mo24556d();
    }

    /* renamed from: n */
    public static C3544s m23368n(C3509b0 b0Var) {
        return m23367m(b0Var.mo24366n().mo24372z().mo24656e(), b0Var.mo24363k());
    }

    /* renamed from: o */
    public static boolean m23369o(C3509b0 b0Var, C3544s sVar, C3558z zVar) {
        for (String next : m23366l(b0Var)) {
            if (!C3300c.m8931p(sVar.mo24551j(next), zVar.mo24655d(next))) {
                return false;
            }
        }
        return true;
    }
}
