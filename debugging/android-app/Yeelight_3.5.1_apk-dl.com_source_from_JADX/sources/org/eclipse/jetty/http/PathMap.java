package org.eclipse.jetty.http;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.StringMap;

public class PathMap extends HashMap implements Externalizable {
    private static String __pathSpecSeparators = ":,";
    C9886a _default;
    List _defaultSingletonList;
    final Set _entrySet;
    final StringMap _exactMap;
    boolean _nodefault;
    C9886a _prefixDefault;
    final StringMap _prefixMap;
    final StringMap _suffixMap;

    /* renamed from: org.eclipse.jetty.http.PathMap$a */
    public static class C9886a implements Map.Entry {

        /* renamed from: a */
        private final Object f17985a;

        /* renamed from: b */
        private final Object f17986b;

        /* renamed from: c */
        private String f17987c;

        /* renamed from: d */
        private transient String f17988d;

        C9886a(Object obj, Object obj2) {
            this.f17985a = obj;
            this.f17986b = obj2;
        }

        /* renamed from: a */
        public String mo39701a() {
            return this.f17987c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39702b(String str) {
            this.f17987c = str;
        }

        public Object getKey() {
            return this.f17985a;
        }

        public Object getValue() {
            return this.f17986b;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            if (this.f17988d == null) {
                this.f17988d = this.f17985a + "=" + this.f17986b;
            }
            return this.f17988d;
        }
    }

    public PathMap() {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public PathMap(int i) {
        super(i);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public PathMap(Map map) {
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        putAll(map);
        this._entrySet = entrySet();
    }

    public PathMap(boolean z) {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
        this._nodefault = z;
    }

    private static boolean isPathWildcardMatch(String str, String str2) {
        int length = str.length() - 2;
        return str.endsWith("/*") && str2.regionMatches(0, str, 0, length) && (str2.length() == length || '/' == str2.charAt(length));
    }

    public static boolean match(String str, String str2) {
        return match(str, str2, false);
    }

    public static boolean match(String str, String str2, boolean z) {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            return (!z && str.length() == 1) || str.equals(str2) || isPathWildcardMatch(str, str2);
        }
        if (charAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
    }

    public static String pathInfo(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        if (str.charAt(0) != '/' || str.length() == 1) {
            return null;
        }
        boolean isPathWildcardMatch = isPathWildcardMatch(str, str2);
        if ((!str.equals(str2) || isPathWildcardMatch) && isPathWildcardMatch && str2.length() != str.length() - 2) {
            return str2.substring(str.length() - 2);
        }
        return null;
    }

    public static String pathMatch(String str, String str2) {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            if (str.length() == 1 || str.equals(str2)) {
                return str2;
            }
            if (isPathWildcardMatch(str, str2)) {
                return str2.substring(0, str.length() - 2);
            }
            return null;
        } else if (charAt != '*' || !str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
            return null;
        } else {
            return str2;
        }
    }

    public static String relativePath(String str, String str2, String str3) {
        StringBuilder sb;
        String pathInfo = pathInfo(str2, str3);
        if (pathInfo != null) {
            str3 = pathInfo;
        }
        if (str3.startsWith("./")) {
            str3 = str3.substring(2);
        }
        if (str.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            if (str3.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(str3.substring(1));
                return sb.toString();
            }
            sb = new StringBuilder();
        } else if (str3.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            sb = new StringBuilder();
        } else {
            return str + MiotCloudImpl.COOKIE_PATH + str3;
        }
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    public static void setPathSpecSeparators(String str) {
        __pathSpecSeparators = str;
    }

    public void clear() {
        this._exactMap.clear();
        this._prefixMap.clear();
        this._suffixMap.clear();
        this._default = null;
        this._defaultSingletonList = null;
        super.clear();
    }

    public boolean containsMatch(String str) {
        C9886a match = getMatch(str);
        return match != null && !match.equals(this._default);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r3 = r7.indexOf(46, r3 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r3 <= 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r2 = r6._suffixMap.getEntry(r7, r3 + 1, (r1 - r3) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r2 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r2 = r2.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = org.eclipse.jetty.util.LazyList.add(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r7 = r6._default;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        return r6._defaultSingletonList;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return org.eclipse.jetty.util.LazyList.add(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getLazyMatches(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            java.util.List r7 = org.eclipse.jetty.util.LazyList.getList(r0)
            return r7
        L_0x0008:
            int r1 = r7.length()
            org.eclipse.jetty.util.StringMap r2 = r6._exactMap
            r3 = 0
            java.util.Map$Entry r2 = r2.getEntry((java.lang.String) r7, (int) r3, (int) r1)
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r0 = org.eclipse.jetty.util.LazyList.add(r0, r2)
        L_0x001d:
            int r2 = r1 + -1
        L_0x001f:
            r4 = 47
            int r2 = r2 + -1
            int r2 = r7.lastIndexOf(r4, r2)
            if (r2 < 0) goto L_0x003a
            org.eclipse.jetty.util.StringMap r4 = r6._prefixMap
            java.util.Map$Entry r4 = r4.getEntry((java.lang.String) r7, (int) r3, (int) r2)
            if (r4 == 0) goto L_0x001f
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r0 = org.eclipse.jetty.util.LazyList.add(r0, r4)
            goto L_0x001f
        L_0x003a:
            org.eclipse.jetty.http.PathMap$a r2 = r6._prefixDefault
            if (r2 == 0) goto L_0x003f
            goto L_0x005b
        L_0x003f:
            r2 = 46
            int r3 = r3 + 1
            int r3 = r7.indexOf(r2, r3)
            if (r3 <= 0) goto L_0x0060
            org.eclipse.jetty.util.StringMap r2 = r6._suffixMap
            int r4 = r3 + 1
            int r5 = r1 - r3
            int r5 = r5 + -1
            java.util.Map$Entry r2 = r2.getEntry((java.lang.String) r7, (int) r4, (int) r5)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.getValue()
        L_0x005b:
            java.lang.Object r0 = org.eclipse.jetty.util.LazyList.add(r0, r2)
            goto L_0x003f
        L_0x0060:
            org.eclipse.jetty.http.PathMap$a r7 = r6._default
            if (r7 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x0069
            java.util.List r7 = r6._defaultSingletonList
            return r7
        L_0x0069:
            java.lang.Object r0 = org.eclipse.jetty.util.LazyList.add(r0, r7)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.PathMap.getLazyMatches(java.lang.String):java.lang.Object");
    }

    public C9886a getMatch(String str) {
        Map.Entry entry;
        Object value;
        Map.Entry entry2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        if (length == 1 && str.charAt(0) == '/' && (entry2 = (Map.Entry) this._exactMap.get("")) != null) {
            return (C9886a) entry2;
        }
        Map.Entry entry3 = this._exactMap.getEntry(str, 0, length);
        if (entry3 != null) {
            value = entry3.getValue();
        } else {
            int i2 = length;
            while (true) {
                i2 = str.lastIndexOf(47, i2 - 1);
                if (i2 >= 0) {
                    Map.Entry entry4 = this._prefixMap.getEntry(str, 0, i2);
                    if (entry4 != null) {
                        value = entry4.getValue();
                        break;
                    }
                } else {
                    C9886a aVar = this._prefixDefault;
                    if (aVar != null) {
                        return aVar;
                    }
                    do {
                        i = str.indexOf(46, i + 1);
                        if (i <= 0) {
                            return this._default;
                        }
                        entry = this._suffixMap.getEntry(str, i + 1, (length - i) - 1);
                    } while (entry == null);
                    value = entry.getValue();
                }
            }
        }
        return (C9886a) value;
    }

    public List getMatches(String str) {
        return LazyList.getList(getLazyMatches(str));
    }

    public Object match(String str) {
        C9886a match = getMatch(str);
        if (match != null) {
            return match.getValue();
        }
        return null;
    }

    public Object put(Object obj, Object obj2) {
        StringMap stringMap;
        String obj3 = obj.toString();
        if ("".equals(obj3.trim())) {
            C9886a aVar = new C9886a("", obj2);
            aVar.mo39702b("");
            this._exactMap.put("", (Object) aVar);
            return super.put("", obj2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(obj3, __pathSpecSeparators);
        Object obj4 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.startsWith(MiotCloudImpl.COOKIE_PATH) || nextToken.startsWith("*.")) {
                Object put = super.put(nextToken, obj2);
                C9886a aVar2 = new C9886a(nextToken, obj2);
                if (aVar2.getKey().equals(nextToken)) {
                    if (nextToken.equals("/*")) {
                        this._prefixDefault = aVar2;
                    } else {
                        if (nextToken.endsWith("/*")) {
                            String substring = nextToken.substring(0, nextToken.length() - 2);
                            aVar2.mo39702b(substring);
                            this._prefixMap.put(substring, (Object) aVar2);
                            this._exactMap.put(substring, (Object) aVar2);
                            stringMap = this._exactMap;
                            nextToken = nextToken.substring(0, nextToken.length() - 1);
                        } else if (nextToken.startsWith("*.")) {
                            stringMap = this._suffixMap;
                            nextToken = nextToken.substring(2);
                        } else {
                            if (!nextToken.equals(MiotCloudImpl.COOKIE_PATH)) {
                                aVar2.mo39702b(nextToken);
                            } else if (!this._nodefault) {
                                this._default = aVar2;
                                this._defaultSingletonList = Collections.singletonList(aVar2);
                            }
                            stringMap = this._exactMap;
                        }
                        stringMap.put(nextToken, (Object) aVar2);
                    }
                }
                obj4 = put;
            } else {
                throw new IllegalArgumentException("PathSpec " + nextToken + ". must start with '/' or '*.'");
            }
        }
        return obj4;
    }

    public void readExternal(ObjectInput objectInput) {
        putAll((HashMap) objectInput.readObject());
    }

    public Object remove(Object obj) {
        StringMap stringMap;
        if (obj != null) {
            String str = (String) obj;
            if (str.equals("/*")) {
                this._prefixDefault = null;
            } else {
                if (str.endsWith("/*")) {
                    this._prefixMap.remove(str.substring(0, str.length() - 2));
                    this._exactMap.remove(str.substring(0, str.length() - 1));
                    stringMap = this._exactMap;
                    str = str.substring(0, str.length() - 2);
                } else if (str.startsWith("*.")) {
                    stringMap = this._suffixMap;
                    str = str.substring(2);
                } else if (str.equals(MiotCloudImpl.COOKIE_PATH)) {
                    this._default = null;
                    this._defaultSingletonList = null;
                } else {
                    stringMap = this._exactMap;
                }
                stringMap.remove(str);
            }
        }
        return super.remove(obj);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(new HashMap(this));
    }
}
