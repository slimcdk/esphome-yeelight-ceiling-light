package p156f.p157g0.p160g;

import androidx.appcompat.widget.ActivityChooserView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import p156f.C10829m;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4379l;
import p156f.C4388s;
import p156f.C4390t;
import p156f.p157g0.C4345c;
import p163g.C4411f;

/* renamed from: f.g0.g.e */
public final class C10771e {
    static {
        C4411f.m12868h("\"\\");
        C4411f.m12868h("\t ,=");
    }

    /* renamed from: a */
    public static long m26685a(C4388s sVar) {
        return m26694j(sVar.mo24085c("Content-Length"));
    }

    /* renamed from: b */
    public static long m26686b(C4332c0 c0Var) {
        return m26685a(c0Var.mo23864n());
    }

    /* renamed from: c */
    public static boolean m26687c(C4332c0 c0Var) {
        if (c0Var.mo23855I().mo23813g().equals("HEAD")) {
            return false;
        }
        int g = c0Var.mo23860g();
        return (((g >= 100 && g < 200) || g == 204 || g == 304) && m26686b(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0Var.mo23862i("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static boolean m26688d(C4388s sVar) {
        return m26695k(sVar).contains("*");
    }

    /* renamed from: e */
    public static boolean m26689e(C4332c0 c0Var) {
        return m26688d(c0Var.mo23864n());
    }

    /* renamed from: f */
    public static int m26690f(String str, int i) {
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
    public static void m26691g(C10829m mVar, C4390t tVar, C4388s sVar) {
        if (mVar != C10829m.f20890a) {
            List<C4379l> f = C4379l.m12547f(tVar, sVar);
            if (!f.isEmpty()) {
                mVar.mo34157a(tVar, f);
            }
        }
    }

    /* renamed from: h */
    public static int m26692h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static int m26693i(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    /* renamed from: j */
    private static long m26694j(String str) {
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
    public static Set<String> m26695k(C4388s sVar) {
        Set<String> emptySet = Collections.emptySet();
        int h = sVar.mo24089h();
        for (int i = 0; i < h; i++) {
            if ("Vary".equalsIgnoreCase(sVar.mo24086e(i))) {
                String i2 = sVar.mo24091i(i);
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
    private static Set<String> m26696l(C4332c0 c0Var) {
        return m26695k(c0Var.mo23864n());
    }

    /* renamed from: m */
    public static C4388s m26697m(C4388s sVar, C4388s sVar2) {
        Set<String> k = m26695k(sVar2);
        if (k.isEmpty()) {
            return new C4388s.C4389a().mo24097d();
        }
        C4388s.C4389a aVar = new C4388s.C4389a();
        int h = sVar.mo24089h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24086e(i);
            if (k.contains(e)) {
                aVar.mo24094a(e, sVar.mo24091i(i));
            }
        }
        return aVar.mo24097d();
    }

    /* renamed from: n */
    public static C4388s m26698n(C4332c0 c0Var) {
        return m26697m(c0Var.mo23867t().mo23855I().mo23811e(), c0Var.mo23864n());
    }

    /* renamed from: o */
    public static boolean m26699o(C4332c0 c0Var, C4388s sVar, C4318a0 a0Var) {
        for (String next : m26696l(c0Var)) {
            if (!C4345c.m12370q(sVar.mo24092j(next), a0Var.mo23810d(next))) {
                return false;
            }
        }
        return true;
    }
}
