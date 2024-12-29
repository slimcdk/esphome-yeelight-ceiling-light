package p164h.p257c.p259b;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: h.c.b.c */
public class C11497c {

    /* renamed from: a */
    private String f22853a;

    /* renamed from: b */
    private String f22854b;

    /* renamed from: c */
    private Map<String, String> f22855c;

    /* renamed from: h.c.b.c$a */
    class C11498a implements Comparator<String> {
        C11498a(C11497c cVar) {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public C11497c() {
        this("*", "*");
    }

    public C11497c(String str, String str2) {
        this(str, str2, Collections.EMPTY_MAP);
    }

    public C11497c(String str, String str2, Map<String, String> map) {
        Map<String, String> unmodifiableMap;
        this.f22853a = str == null ? "*" : str;
        this.f22854b = str2 == null ? "*" : str2;
        if (map == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            TreeMap treeMap = new TreeMap(new C11498a(this));
            for (Map.Entry next : map.entrySet()) {
                treeMap.put(next.getKey(), next.getValue());
            }
            unmodifiableMap = Collections.unmodifiableMap(treeMap);
        }
        this.f22855c = unmodifiableMap;
    }

    /* renamed from: a */
    protected static int m30175a(String str, int i) {
        int indexOf = str.indexOf(61, i);
        int indexOf2 = str.indexOf(59, i);
        return (indexOf == -1 && indexOf2 == -1) ? str.length() : indexOf == -1 ? indexOf2 : (indexOf2 != -1 && indexOf >= indexOf2) ? indexOf2 : indexOf;
    }

    /* renamed from: e */
    public static int m30176e(Map<String, String> map, String str, int i) {
        int a = m30175a(str, i);
        String trim = str.substring(i, a).trim();
        if (a < str.length() && str.charAt(a) == '=') {
            a++;
        }
        StringBuilder sb = new StringBuilder(str.length() - a);
        boolean z = false;
        boolean z2 = false;
        while (a < str.length()) {
            char charAt = str.charAt(a);
            if (charAt != '\"') {
                if (charAt != ';') {
                    if (charAt == '\\') {
                        if (!z) {
                            z = true;
                            a++;
                        }
                    }
                } else if (!z2) {
                    map.put(trim, sb.toString().trim());
                    return a + 1;
                }
                sb.append(charAt);
                a++;
            } else if (!z) {
                z2 = !z2;
                a++;
            }
            sb.append(charAt);
            z = false;
            a++;
        }
        map.put(trim, sb.toString().trim());
        return a;
    }

    /* renamed from: g */
    public static C11497c m30177g(String str) {
        String str2;
        String str3;
        if (str != null) {
            int indexOf = str.indexOf(";");
            String str4 = null;
            if (indexOf > -1) {
                str2 = str.substring(indexOf + 1).trim();
                str = str.substring(0, indexOf);
            } else {
                str2 = null;
            }
            String[] split = str.split(MiotCloudImpl.COOKIE_PATH);
            if (split.length < 2 && str.equals("*")) {
                str3 = "*";
                str4 = str3;
            } else if (split.length == 2) {
                str4 = split[0].trim();
                str3 = split[1].trim();
            } else if (split.length == 2) {
                str3 = null;
            } else {
                throw new IllegalArgumentException("Error parsing string: " + str);
            }
            if (str2 == null || str2.length() <= 0) {
                return new C11497c(str4, str3);
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < str2.length(); i = m30176e(hashMap, str2, i)) {
            }
            return new C11497c(str4, str3, hashMap);
        }
        throw new IllegalArgumentException("String value is null");
    }

    /* renamed from: b */
    public Map<String, String> mo36398b() {
        return this.f22855c;
    }

    /* renamed from: c */
    public String mo36399c() {
        return this.f22854b;
    }

    /* renamed from: d */
    public String mo36400d() {
        return this.f22853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11497c.class != obj.getClass()) {
            return false;
        }
        C11497c cVar = (C11497c) obj;
        Map<String, String> map = this.f22855c;
        if (map == null ? cVar.f22855c == null : map.equals(cVar.f22855c)) {
            return this.f22854b.equalsIgnoreCase(cVar.f22854b) && this.f22853a.equalsIgnoreCase(cVar.f22853a);
        }
        return false;
    }

    /* renamed from: f */
    public String mo36402f() {
        return mo36400d() + MiotCloudImpl.COOKIE_PATH + mo36399c();
    }

    public int hashCode() {
        int hashCode = ((this.f22853a.toLowerCase().hashCode() * 31) + this.f22854b.toLowerCase().hashCode()) * 31;
        Map<String, String> map = this.f22855c;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo36402f());
        if (mo36398b() != null || mo36398b().size() > 0) {
            for (String next : mo36398b().keySet()) {
                sb.append(";");
                sb.append(next);
                sb.append("=\"");
                sb.append(mo36398b().get(next));
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
