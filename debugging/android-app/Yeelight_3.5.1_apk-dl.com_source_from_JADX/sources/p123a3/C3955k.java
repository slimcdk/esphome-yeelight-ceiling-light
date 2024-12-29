package p123a3;

import com.squareup.okhttp.C4269b;
import com.squareup.okhttp.C4288h;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import com.xiaomi.mipush.sdk.Constants;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p231y2.C12028i;
import p231y2.C12033k;

/* renamed from: a3.k */
public final class C3955k {

    /* renamed from: a */
    private static final Comparator<String> f6665a = new C3956a();

    /* renamed from: b */
    static final String f6666b;

    /* renamed from: c */
    public static final String f6667c;

    /* renamed from: d */
    public static final String f6668d;

    /* renamed from: e */
    public static final String f6669e;

    /* renamed from: a3.k$a */
    static class C3956a implements Comparator<String> {
        C3956a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        String g = C12028i.m31019f().mo42652g();
        f6666b = g;
        f6667c = g + "-Sent-Millis";
        f6668d = g + "-Received-Millis";
        f6669e = g + "-Selected-Protocol";
    }

    /* renamed from: a */
    public static void m11379a(C4312v.C4314b bVar, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                bVar.mo28046f(str, m11380b((List) next.getValue()));
            }
        }
    }

    /* renamed from: b */
    private static String m11380b(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static long m11381c(C4299p pVar) {
        return m11389k(pVar.mo27931a("Content-Length"));
    }

    /* renamed from: d */
    public static long m11382d(C4312v vVar) {
        return m11381c(vVar.mo28035i());
    }

    /* renamed from: e */
    public static long m11383e(C4318x xVar) {
        return m11381c(xVar.mo28064s());
    }

    /* renamed from: f */
    public static boolean m11384f(C4299p pVar) {
        return m11391m(pVar).contains("*");
    }

    /* renamed from: g */
    public static boolean m11385g(C4318x xVar) {
        return m11384f(xVar.mo28064s());
    }

    /* renamed from: h */
    static boolean m11386h(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: i */
    public static List<C4288h> m11387i(C4299p pVar, String str) {
        ArrayList arrayList = new ArrayList();
        int g = pVar.mo27935g();
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(pVar.mo27933d(i))) {
                String h = pVar.mo27936h(i);
                int i2 = 0;
                while (i2 < h.length()) {
                    int b = C3938e.m11280b(h, i2, " ");
                    String trim = h.substring(i2, b).trim();
                    int c = C3938e.m11281c(h, b);
                    if (!h.regionMatches(true, c, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = c + 7;
                    int b2 = C3938e.m11280b(h, i3, "\"");
                    String substring = h.substring(i3, b2);
                    i2 = C3938e.m11281c(h, C3938e.m11280b(h, b2 + 1, Constants.ACCEPT_TIME_SEPARATOR_SP) + 1);
                    arrayList.add(new C4288h(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C4312v m11388j(C4269b bVar, C4318x xVar, Proxy proxy) {
        return xVar.mo28060o() == 407 ? bVar.mo26428a(proxy, xVar) : bVar.mo26429b(proxy, xVar);
    }

    /* renamed from: k */
    private static long m11389k(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    public static Map<String, List<String>> m11390l(C4299p pVar, String str) {
        TreeMap treeMap = new TreeMap(f6665a);
        int g = pVar.mo27935g();
        for (int i = 0; i < g; i++) {
            String d = pVar.mo27933d(i);
            String h = pVar.mo27936h(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(d);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(h);
            treeMap.put(d, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put((Object) null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* renamed from: m */
    public static Set<String> m11391m(C4299p pVar) {
        Set<String> emptySet = Collections.emptySet();
        int g = pVar.mo27935g();
        for (int i = 0; i < g; i++) {
            if ("Vary".equalsIgnoreCase(pVar.mo27933d(i))) {
                String h = pVar.mo27936h(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : h.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: n */
    private static Set<String> m11392n(C4318x xVar) {
        return m11391m(xVar.mo28064s());
    }

    /* renamed from: o */
    public static C4299p m11393o(C4299p pVar, C4299p pVar2) {
        Set<String> m = m11391m(pVar2);
        if (m.isEmpty()) {
            return new C4299p.C4301b().mo27942e();
        }
        C4299p.C4301b bVar = new C4299p.C4301b();
        int g = pVar.mo27935g();
        for (int i = 0; i < g; i++) {
            String d = pVar.mo27933d(i);
            if (m.contains(d)) {
                bVar.mo27939b(d, pVar.mo27936h(i));
            }
        }
        return bVar.mo27942e();
    }

    /* renamed from: p */
    public static C4299p m11394p(C4318x xVar) {
        return m11393o(xVar.mo28068v().mo28071y().mo28035i(), xVar.mo28064s());
    }

    /* renamed from: q */
    public static boolean m11395q(C4318x xVar, C4299p pVar, C4312v vVar) {
        for (String next : m11392n(xVar)) {
            if (!C12033k.m31046f(pVar.mo27937i(next), vVar.mo28036j(next))) {
                return false;
            }
        }
        return true;
    }
}
