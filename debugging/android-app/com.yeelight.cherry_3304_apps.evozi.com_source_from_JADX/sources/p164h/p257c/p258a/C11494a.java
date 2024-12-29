package p164h.p257c.p258a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p271io.IOUtils;

/* renamed from: h.c.a.a */
public class C11494a implements Map<String, List<String>> {

    /* renamed from: a */
    final Map<String, List<String>> f22848a = new HashMap(32);

    /* renamed from: b */
    private boolean f22849b = true;

    public C11494a() {
    }

    public C11494a(ByteArrayInputStream byteArrayInputStream) {
        StringBuilder sb = new StringBuilder(256);
        C11494a aVar = new C11494a();
        String i = m30164i(sb, byteArrayInputStream);
        if (i.length() != 0) {
            String str = null;
            do {
                char charAt = i.charAt(0);
                if (str == null || !(charAt == ' ' || charAt == 9)) {
                    String[] k = mo36389k(i);
                    aVar.mo35754a(k[0], k[1]);
                    str = k[0];
                } else {
                    List<String> d = aVar.get(str);
                    int size = d.size() - 1;
                    d.set(size, d.get(size) + i.trim());
                }
                sb.delete(0, sb.length());
                i = m30164i(sb, byteArrayInputStream);
            } while (i.length() != 0);
        }
        putAll(aVar);
    }

    public C11494a(Map<String, List<String>> map) {
        putAll(map);
    }

    public C11494a(boolean z) {
        this.f22849b = z;
    }

    /* renamed from: f */
    private String m30162f(String str) {
        if (!this.f22849b) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        if (charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char) (charArray[0] - ' ');
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + ' ');
            }
        }
        return new String(charArray);
    }

    /* renamed from: h */
    public static String m30163h(ByteArrayInputStream byteArrayInputStream) {
        return m30164i(new StringBuilder(256), byteArrayInputStream);
    }

    /* renamed from: i */
    public static String m30164i(StringBuilder sb, ByteArrayInputStream byteArrayInputStream) {
        while (true) {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                break;
            }
            char c = (char) read;
            if (c == 13) {
                if (((char) byteArrayInputStream.read()) == 10) {
                    break;
                }
            } else if (c == 10) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo35754a(String str, String str2) {
        String f = m30162f(str);
        List list = this.f22848a.get(f);
        if (list == null) {
            list = new LinkedList();
            this.f22848a.put(f, list);
        }
        list.add(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo36378b(String str) {
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo36379c(String str, int i) {
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public void clear() {
        this.f22848a.clear();
    }

    public boolean containsKey(Object obj) {
        return obj != null && (obj instanceof String) && this.f22848a.containsKey(m30162f((String) obj));
    }

    public boolean containsValue(Object obj) {
        return this.f22848a.containsValue(obj);
    }

    /* renamed from: d */
    public List<String> get(Object obj) {
        return this.f22848a.get(m30162f((String) obj));
    }

    /* renamed from: e */
    public String mo36383e(String str) {
        List list = this.f22848a.get(m30162f(str));
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public Set<Map.Entry<String, List<String>>> entrySet() {
        return this.f22848a.entrySet();
    }

    public boolean equals(Object obj) {
        return this.f22848a.equals(obj);
    }

    /* renamed from: g */
    public List<String> put(String str, List<String> list) {
        return this.f22848a.put(m30162f(str), list);
    }

    public int hashCode() {
        return this.f22848a.hashCode();
    }

    public boolean isEmpty() {
        return this.f22848a.isEmpty();
    }

    /* renamed from: j */
    public List<String> remove(Object obj) {
        return this.f22848a.remove(m30162f((String) obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String[] mo36389k(String str) {
        int c = mo36379c(str, 0);
        int i = c;
        while (i < str.length() && (r3 = str.charAt(i)) != ':' && !Character.isWhitespace(r3)) {
            i++;
        }
        int i2 = i;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            i2++;
            if (charAt == ':') {
                break;
            }
        }
        int c2 = mo36379c(str, i2);
        int b = mo36378b(str);
        String[] strArr = new String[2];
        strArr[0] = str.substring(c, i);
        strArr[1] = (str.length() < c2 || str.length() < b || c2 >= b) ? null : str.substring(c2, b);
        return strArr;
    }

    public Set<String> keySet() {
        return this.f22848a.keySet();
    }

    public void putAll(Map<? extends String, ? extends List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            put((String) next.getKey(), (List) next.getValue());
        }
    }

    public int size() {
        return this.f22848a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        for (Map.Entry next : entrySet()) {
            sb.append((String) next.getKey());
            sb.append(": ");
            for (String append : (List) next.getValue()) {
                sb.append(append);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return sb.toString();
    }

    public Collection<List<String>> values() {
        return this.f22848a.values();
    }
}
