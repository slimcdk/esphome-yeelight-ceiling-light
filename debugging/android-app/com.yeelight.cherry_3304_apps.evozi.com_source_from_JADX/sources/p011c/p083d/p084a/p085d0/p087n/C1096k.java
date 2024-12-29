package p011c.p083d.p084a.p085d0.p087n;

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
import p011c.p083d.p084a.C0990b;
import p011c.p083d.p084a.C1118h;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1019i;
import p011c.p083d.p084a.p085d0.C1024k;

/* renamed from: c.d.a.d0.n.k */
public final class C1096k {

    /* renamed from: a */
    private static final Comparator<String> f1608a = new C1097a();

    /* renamed from: b */
    static final String f1609b = C1019i.m2068f().mo9476g();

    /* renamed from: c */
    public static final String f1610c = (f1609b + "-Sent-Millis");

    /* renamed from: d */
    public static final String f1611d = (f1609b + "-Received-Millis");

    /* renamed from: e */
    public static final String f1612e = (f1609b + "-Selected-Protocol");

    /* renamed from: c.d.a.d0.n.k$a */
    static class C1097a implements Comparator<String> {
        C1097a() {
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

    /* renamed from: a */
    public static void m2521a(C1144x.C1146b bVar, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                bVar.mo9847f(str, m2522b((List) next.getValue()));
            }
        }
    }

    /* renamed from: b */
    private static String m2522b(List<String> list) {
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
    public static long m2523c(C1130q qVar) {
        return m2531k(qVar.mo9744a("Content-Length"));
    }

    /* renamed from: d */
    public static long m2524d(C1144x xVar) {
        return m2523c(xVar.mo9836i());
    }

    /* renamed from: e */
    public static long m2525e(C1150z zVar) {
        return m2523c(zVar.mo9865s());
    }

    /* renamed from: f */
    public static boolean m2526f(C1130q qVar) {
        return m2533m(qVar).contains("*");
    }

    /* renamed from: g */
    public static boolean m2527g(C1150z zVar) {
        return m2526f(zVar.mo9865s());
    }

    /* renamed from: h */
    static boolean m2528h(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: i */
    public static List<C1118h> m2529i(C1130q qVar, String str) {
        ArrayList arrayList = new ArrayList();
        int g = qVar.mo9748g();
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(qVar.mo9746d(i))) {
                String h = qVar.mo9749h(i);
                int i2 = 0;
                while (i2 < h.length()) {
                    int b = C1079e.m2422b(h, i2, " ");
                    String trim = h.substring(i2, b).trim();
                    int c = C1079e.m2423c(h, b);
                    if (!h.regionMatches(true, c, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = c + 7;
                    int b2 = C1079e.m2422b(h, i3, "\"");
                    String substring = h.substring(i3, b2);
                    i2 = C1079e.m2423c(h, C1079e.m2422b(h, b2 + 1, Constants.ACCEPT_TIME_SEPARATOR_SP) + 1);
                    arrayList.add(new C1118h(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C1144x m2530j(C0990b bVar, C1150z zVar, Proxy proxy) {
        return zVar.mo9861o() == 407 ? bVar.mo9392a(proxy, zVar) : bVar.mo9393b(proxy, zVar);
    }

    /* renamed from: k */
    private static long m2531k(String str) {
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
    public static Map<String, List<String>> m2532l(C1130q qVar, String str) {
        TreeMap treeMap = new TreeMap(f1608a);
        int g = qVar.mo9748g();
        for (int i = 0; i < g; i++) {
            String d = qVar.mo9746d(i);
            String h = qVar.mo9749h(i);
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
    public static Set<String> m2533m(C1130q qVar) {
        Set<String> emptySet = Collections.emptySet();
        int g = qVar.mo9748g();
        for (int i = 0; i < g; i++) {
            if ("Vary".equalsIgnoreCase(qVar.mo9746d(i))) {
                String h = qVar.mo9749h(i);
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
    private static Set<String> m2534n(C1150z zVar) {
        return m2533m(zVar.mo9865s());
    }

    /* renamed from: o */
    public static C1130q m2535o(C1130q qVar, C1130q qVar2) {
        Set<String> m = m2533m(qVar2);
        if (m.isEmpty()) {
            return new C1130q.C1132b().mo9755e();
        }
        C1130q.C1132b bVar = new C1130q.C1132b();
        int g = qVar.mo9748g();
        for (int i = 0; i < g; i++) {
            String d = qVar.mo9746d(i);
            if (m.contains(d)) {
                bVar.mo9752b(d, qVar.mo9749h(i));
            }
        }
        return bVar.mo9755e();
    }

    /* renamed from: p */
    public static C1130q m2536p(C1150z zVar) {
        return m2535o(zVar.mo9869v().mo9872y().mo9836i(), zVar.mo9865s());
    }

    /* renamed from: q */
    public static boolean m2537q(C1150z zVar, C1130q qVar, C1144x xVar) {
        for (String next : m2534n(zVar)) {
            if (!C1024k.m2095f(qVar.mo9750i(next), xVar.mo9837j(next))) {
                return false;
            }
        }
        return true;
    }
}
