package p156f;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.p271io.IOUtils;
import p156f.p157g0.C4345c;

/* renamed from: f.s */
public final class C4388s {

    /* renamed from: a */
    private final String[] f7830a;

    /* renamed from: f.s$a */
    public static final class C4389a {

        /* renamed from: a */
        final List<String> f7831a = new ArrayList(20);

        /* renamed from: a */
        public C4389a mo24094a(String str, String str2) {
            C4388s.m12599a(str);
            C4388s.m12600b(str2, str);
            mo24096c(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C4389a mo24095b(String str) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR, 1);
            if (indexOf != -1) {
                mo24096c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(Constants.COLON_SEPARATOR)) {
                mo24096c("", str.substring(1));
                return this;
            } else {
                mo24096c("", str);
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4389a mo24096c(String str, String str2) {
            this.f7831a.add(str);
            this.f7831a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C4388s mo24097d() {
            return new C4388s(this);
        }

        /* renamed from: e */
        public String mo24098e(String str) {
            for (int size = this.f7831a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f7831a.get(size))) {
                    return this.f7831a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: f */
        public C4389a mo24099f(String str) {
            int i = 0;
            while (i < this.f7831a.size()) {
                if (str.equalsIgnoreCase(this.f7831a.get(i))) {
                    this.f7831a.remove(i);
                    this.f7831a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: g */
        public C4389a mo24100g(String str, String str2) {
            C4388s.m12599a(str);
            C4388s.m12600b(str2, str);
            mo24099f(str);
            mo24096c(str, str2);
            return this;
        }
    }

    C4388s(C4389a aVar) {
        List<String> list = aVar.f7831a;
        this.f7830a = (String[]) list.toArray(new String[list.size()]);
    }

    private C4388s(String[] strArr) {
        this.f7830a = strArr;
    }

    /* renamed from: a */
    static void m12599a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C4345c.m12371r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: b */
    static void m12600b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C4345c.m12371r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m12601d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C4388s m12602g(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
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
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m12599a(str);
                m12600b(str2, str);
            }
            return new C4388s(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    @Nullable
    /* renamed from: c */
    public String mo24085c(String str) {
        return m12601d(this.f7830a, str);
    }

    /* renamed from: e */
    public String mo24086e(int i) {
        return this.f7830a[i * 2];
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C4388s) && Arrays.equals(((C4388s) obj).f7830a, this.f7830a);
    }

    /* renamed from: f */
    public C4389a mo24088f() {
        C4389a aVar = new C4389a();
        Collections.addAll(aVar.f7831a, this.f7830a);
        return aVar;
    }

    /* renamed from: h */
    public int mo24089h() {
        return this.f7830a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7830a);
    }

    /* renamed from: i */
    public String mo24091i(int i) {
        return this.f7830a[(i * 2) + 1];
    }

    /* renamed from: j */
    public List<String> mo24092j(String str) {
        int h = mo24089h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(mo24086e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo24091i(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = mo24089h();
        for (int i = 0; i < h; i++) {
            sb.append(mo24086e(i));
            sb.append(": ");
            sb.append(mo24091i(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
