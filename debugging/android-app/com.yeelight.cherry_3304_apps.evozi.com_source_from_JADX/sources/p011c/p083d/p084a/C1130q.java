package p011c.p083d.p084a;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.p271io.IOUtils;
import p011c.p083d.p084a.p085d0.p087n.C1088g;

/* renamed from: c.d.a.q */
public final class C1130q {

    /* renamed from: a */
    private final String[] f1801a;

    /* renamed from: c.d.a.q$b */
    public static final class C1132b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f1802a = new ArrayList(20);

        /* renamed from: f */
        private void m2715f(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* renamed from: b */
        public C1132b mo9752b(String str, String str2) {
            m2715f(str, str2);
            mo9754d(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1132b mo9753c(String str) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR, 1);
            if (indexOf != -1) {
                mo9754d(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(Constants.COLON_SEPARATOR)) {
                mo9754d("", str.substring(1));
                return this;
            } else {
                mo9754d("", str);
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C1132b mo9754d(String str, String str2) {
            this.f1802a.add(str);
            this.f1802a.add(str2.trim());
            return this;
        }

        /* renamed from: e */
        public C1130q mo9755e() {
            return new C1130q(this);
        }

        /* renamed from: g */
        public C1132b mo9756g(String str) {
            int i = 0;
            while (i < this.f1802a.size()) {
                if (str.equalsIgnoreCase(this.f1802a.get(i))) {
                    this.f1802a.remove(i);
                    this.f1802a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: h */
        public C1132b mo9757h(String str, String str2) {
            m2715f(str, str2);
            mo9756g(str);
            mo9754d(str, str2);
            return this;
        }
    }

    private C1130q(C1132b bVar) {
        this.f1801a = (String[]) bVar.f1802a.toArray(new String[bVar.f1802a.size()]);
    }

    private C1130q(String[] strArr) {
        this.f1801a = strArr;
    }

    /* renamed from: b */
    private static String m2705b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C1130q m2706f(String... strArr) {
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int i = 0;
        while (i < strArr2.length) {
            if (strArr2[i] != null) {
                strArr2[i] = strArr2[i].trim();
                i++;
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        int i2 = 0;
        while (i2 < strArr2.length) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                i2 += 2;
            } else {
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
        }
        return new C1130q(strArr2);
    }

    /* renamed from: a */
    public String mo9744a(String str) {
        return m2705b(this.f1801a, str);
    }

    /* renamed from: c */
    public Date mo9745c(String str) {
        String a = mo9744a(str);
        if (a != null) {
            return C1088g.m2463b(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo9746d(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f1801a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: e */
    public C1132b mo9747e() {
        C1132b bVar = new C1132b();
        Collections.addAll(bVar.f1802a, this.f1801a);
        return bVar;
    }

    /* renamed from: g */
    public int mo9748g() {
        return this.f1801a.length / 2;
    }

    /* renamed from: h */
    public String mo9749h(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f1801a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: i */
    public List<String> mo9750i(String str) {
        int g = mo9748g();
        ArrayList arrayList = null;
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(mo9746d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo9749h(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g = mo9748g();
        for (int i = 0; i < g; i++) {
            sb.append(mo9746d(i));
            sb.append(": ");
            sb.append(mo9749h(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
