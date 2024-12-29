package org.seamless.util;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: org.seamless.util.c */
public class C10245c {

    /* renamed from: a */
    private String f19036a;

    /* renamed from: b */
    private String f19037b;

    /* renamed from: c */
    private Map<String, String> f19038c;

    /* renamed from: org.seamless.util.c$a */
    class C10246a implements Comparator<String> {
        C10246a(C10245c cVar) {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public C10245c() {
        this("*", "*");
    }

    public C10245c(String str, String str2) {
        this(str, str2, Collections.EMPTY_MAP);
    }

    public C10245c(String str, String str2, Map<String, String> map) {
        Map<String, String> unmodifiableMap;
        this.f19036a = str == null ? "*" : str;
        this.f19037b = str2 == null ? "*" : str2;
        if (map == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            TreeMap treeMap = new TreeMap(new C10246a(this));
            for (Map.Entry next : map.entrySet()) {
                treeMap.put(next.getKey(), next.getValue());
            }
            unmodifiableMap = Collections.unmodifiableMap(treeMap);
        }
        this.f19038c = unmodifiableMap;
    }

    /* renamed from: a */
    protected static int m25755a(String str, int i) {
        int indexOf = str.indexOf(61, i);
        int indexOf2 = str.indexOf(59, i);
        return (indexOf == -1 && indexOf2 == -1) ? str.length() : indexOf == -1 ? indexOf2 : (indexOf2 != -1 && indexOf >= indexOf2) ? indexOf2 : indexOf;
    }

    /* renamed from: e */
    public static int m25756e(Map<String, String> map, String str, int i) {
        int a = m25755a(str, i);
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
    public static C10245c m25757g(String str) {
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
                return new C10245c(str4, str3);
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < str2.length(); i = m25756e(hashMap, str2, i)) {
            }
            return new C10245c(str4, str3, hashMap);
        }
        throw new IllegalArgumentException("String value is null");
    }

    /* renamed from: b */
    public Map<String, String> mo41564b() {
        return this.f19038c;
    }

    /* renamed from: c */
    public String mo41565c() {
        return this.f19037b;
    }

    /* renamed from: d */
    public String mo41566d() {
        return this.f19036a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10245c.class != obj.getClass()) {
            return false;
        }
        C10245c cVar = (C10245c) obj;
        Map<String, String> map = this.f19038c;
        if (map == null ? cVar.f19038c == null : map.equals(cVar.f19038c)) {
            return this.f19037b.equalsIgnoreCase(cVar.f19037b) && this.f19036a.equalsIgnoreCase(cVar.f19036a);
        }
        return false;
    }

    /* renamed from: f */
    public String mo41568f() {
        return mo41566d() + MiotCloudImpl.COOKIE_PATH + mo41565c();
    }

    public int hashCode() {
        int hashCode = ((this.f19036a.toLowerCase().hashCode() * 31) + this.f19037b.toLowerCase().hashCode()) * 31;
        Map<String, String> map = this.f19038c;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo41568f());
        if (mo41564b() != null || mo41564b().size() > 0) {
            for (String next : mo41564b().keySet()) {
                sb.append(";");
                sb.append(next);
                sb.append("=\"");
                sb.append(mo41564b().get(next));
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
