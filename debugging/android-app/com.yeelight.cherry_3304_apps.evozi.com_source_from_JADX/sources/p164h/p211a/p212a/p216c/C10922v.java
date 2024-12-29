package p164h.p211a.p212a.p216c;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import p164h.p211a.p212a.p228h.C11133p;

/* renamed from: h.a.a.c.v */
public class C10922v extends HashMap implements Externalizable {

    /* renamed from: h */
    private static String f21277h = ":,";

    /* renamed from: a */
    final C11133p f21278a = new C11133p();

    /* renamed from: b */
    final C11133p f21279b = new C11133p();

    /* renamed from: c */
    final C11133p f21280c = new C11133p();

    /* renamed from: d */
    List f21281d = null;

    /* renamed from: e */
    C10923a f21282e = null;

    /* renamed from: f */
    C10923a f21283f = null;

    /* renamed from: g */
    boolean f21284g = false;

    /* renamed from: h.a.a.c.v$a */
    public static class C10923a implements Map.Entry {

        /* renamed from: a */
        private final Object f21285a;

        /* renamed from: b */
        private final Object f21286b;

        /* renamed from: c */
        private String f21287c;

        /* renamed from: d */
        private transient String f21288d;

        C10923a(Object obj, Object obj2) {
            this.f21285a = obj;
            this.f21286b = obj2;
        }

        /* renamed from: a */
        public String mo34548a() {
            return this.f21287c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo34549b(String str) {
            this.f21287c = str;
        }

        public Object getKey() {
            return this.f21285a;
        }

        public Object getValue() {
            return this.f21286b;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            if (this.f21288d == null) {
                this.f21288d = this.f21285a + "=" + this.f21286b;
            }
            return this.f21288d;
        }
    }

    public C10922v() {
        super(11);
        entrySet();
    }

    /* renamed from: c */
    private static boolean m27566c(String str, String str2) {
        int length = str.length() - 2;
        return str.endsWith("/*") && str2.regionMatches(0, str, 0, length) && (str2.length() == length || '/' == str2.charAt(length));
    }

    /* renamed from: e */
    public static boolean m27567e(String str, String str2, boolean z) {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            return (!z && str.length() == 1) || str.equals(str2) || m27566c(str, str2);
        }
        if (charAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
    }

    /* renamed from: f */
    public static String m27568f(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        if (str.charAt(0) != '/' || str.length() == 1) {
            return null;
        }
        boolean c = m27566c(str, str2);
        if ((!str.equals(str2) || c) && c && str2.length() != str.length() - 2) {
            return str2.substring(str.length() - 2);
        }
        return null;
    }

    /* renamed from: j */
    public static String m27569j(String str, String str2) {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            if (str.length() == 1 || str.equals(str2)) {
                return str2;
            }
            if (m27566c(str, str2)) {
                return str2.substring(0, str.length() - 2);
            }
            return null;
        } else if (charAt != '*' || !str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
            return null;
        } else {
            return str2;
        }
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
        r2 = r6.f21279b.mo35416c(r7, r3 + 1, (r1 - r3) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r2 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r2 = r2.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r7 = r6.f21283f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        return r6.f21281d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo34540a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            java.util.List r7 = p164h.p211a.p212a.p228h.C11126j.m28885k(r0)
            return r7
        L_0x0008:
            int r1 = r7.length()
            h.a.a.h.p r2 = r6.f21280c
            r3 = 0
            java.util.Map$Entry r2 = r2.mo35416c(r7, r3, r1)
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r2)
        L_0x001d:
            int r2 = r1 + -1
        L_0x001f:
            r4 = 47
            int r2 = r2 + -1
            int r2 = r7.lastIndexOf(r4, r2)
            if (r2 < 0) goto L_0x003a
            h.a.a.h.p r4 = r6.f21278a
            java.util.Map$Entry r4 = r4.mo35416c(r7, r3, r2)
            if (r4 == 0) goto L_0x001f
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r4)
            goto L_0x001f
        L_0x003a:
            h.a.a.c.v$a r2 = r6.f21282e
            if (r2 == 0) goto L_0x003f
            goto L_0x005b
        L_0x003f:
            r2 = 46
            int r3 = r3 + 1
            int r3 = r7.indexOf(r2, r3)
            if (r3 <= 0) goto L_0x0060
            h.a.a.h.p r2 = r6.f21279b
            int r4 = r3 + 1
            int r5 = r1 - r3
            int r5 = r5 + -1
            java.util.Map$Entry r2 = r2.mo35416c(r7, r4, r5)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.getValue()
        L_0x005b:
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r2)
            goto L_0x003f
        L_0x0060:
            h.a.a.c.v$a r7 = r6.f21283f
            if (r7 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x0069
            java.util.List r7 = r6.f21281d
            return r7
        L_0x0069:
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r0, r7)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10922v.mo34540a(java.lang.String):java.lang.Object");
    }

    /* renamed from: b */
    public C10923a mo34541b(String str) {
        Map.Entry c;
        Object value;
        Map.Entry entry;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        if (length == 1 && str.charAt(0) == '/' && (entry = (Map.Entry) this.f21280c.mo35414a("")) != null) {
            return (C10923a) entry;
        }
        Map.Entry c2 = this.f21280c.mo35416c(str, 0, length);
        if (c2 != null) {
            value = c2.getValue();
        } else {
            int i2 = length;
            while (true) {
                i2 = str.lastIndexOf(47, i2 - 1);
                if (i2 >= 0) {
                    Map.Entry c3 = this.f21278a.mo35416c(str, 0, i2);
                    if (c3 != null) {
                        value = c3.getValue();
                        break;
                    }
                } else {
                    C10923a aVar = this.f21282e;
                    if (aVar != null) {
                        return aVar;
                    }
                    do {
                        i = str.indexOf(46, i + 1);
                        if (i <= 0) {
                            return this.f21283f;
                        }
                        c = this.f21279b.mo35416c(str, i + 1, (length - i) - 1);
                    } while (c == null);
                    value = c.getValue();
                }
            }
        }
        return (C10923a) value;
    }

    public void clear() {
        this.f21280c.clear();
        this.f21278a.clear();
        this.f21279b.clear();
        this.f21283f = null;
        this.f21281d = null;
        super.clear();
    }

    /* renamed from: d */
    public Object mo34543d(String str) {
        C10923a b = mo34541b(str);
        if (b != null) {
            return b.getValue();
        }
        return null;
    }

    public Object put(Object obj, Object obj2) {
        C11133p pVar;
        String obj3 = obj.toString();
        if ("".equals(obj3.trim())) {
            C10923a aVar = new C10923a("", obj2);
            aVar.mo34549b("");
            this.f21280c.mo35419d("", aVar);
            return super.put("", obj2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(obj3, f21277h);
        Object obj4 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.startsWith(MiotCloudImpl.COOKIE_PATH) || nextToken.startsWith("*.")) {
                Object put = super.put(nextToken, obj2);
                C10923a aVar2 = new C10923a(nextToken, obj2);
                if (aVar2.getKey().equals(nextToken)) {
                    if (nextToken.equals("/*")) {
                        this.f21282e = aVar2;
                    } else {
                        if (nextToken.endsWith("/*")) {
                            String substring = nextToken.substring(0, nextToken.length() - 2);
                            aVar2.mo34549b(substring);
                            this.f21278a.mo35419d(substring, aVar2);
                            this.f21280c.mo35419d(substring, aVar2);
                            pVar = this.f21280c;
                            nextToken = nextToken.substring(0, nextToken.length() - 1);
                        } else if (nextToken.startsWith("*.")) {
                            pVar = this.f21279b;
                            nextToken = nextToken.substring(2);
                        } else {
                            if (!nextToken.equals(MiotCloudImpl.COOKIE_PATH)) {
                                aVar2.mo34549b(nextToken);
                            } else if (!this.f21284g) {
                                this.f21283f = aVar2;
                                this.f21281d = Collections.singletonList(aVar2);
                            }
                            pVar = this.f21280c;
                        }
                        pVar.mo35419d(nextToken, aVar2);
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
        C11133p pVar;
        if (obj != null) {
            String str = (String) obj;
            if (str.equals("/*")) {
                this.f21282e = null;
            } else {
                if (str.endsWith("/*")) {
                    this.f21278a.mo35420e(str.substring(0, str.length() - 2));
                    this.f21280c.mo35420e(str.substring(0, str.length() - 1));
                    pVar = this.f21280c;
                    str = str.substring(0, str.length() - 2);
                } else if (str.startsWith("*.")) {
                    pVar = this.f21279b;
                    str = str.substring(2);
                } else if (str.equals(MiotCloudImpl.COOKIE_PATH)) {
                    this.f21283f = null;
                    this.f21281d = null;
                } else {
                    pVar = this.f21280c;
                }
                pVar.mo35420e(str);
            }
        }
        return super.remove(obj);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(new HashMap(this));
    }
}
