package okhttp3;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.p194io.IOUtils;
import p056k5.C3300c;

/* renamed from: okhttp3.s */
public final class C3544s {

    /* renamed from: a */
    private final String[] f5803a;

    /* renamed from: okhttp3.s$a */
    public static final class C3545a {

        /* renamed from: a */
        final List<String> f5804a = new ArrayList(20);

        /* renamed from: a */
        public C3545a mo24553a(String str, String str2) {
            C3544s.m9800a(str);
            C3544s.m9801b(str2, str);
            return mo24555c(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3545a mo24554b(String str) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR, 1);
            return indexOf != -1 ? mo24555c(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(Constants.COLON_SEPARATOR) ? mo24555c("", str.substring(1)) : mo24555c("", str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3545a mo24555c(String str, String str2) {
            this.f5804a.add(str);
            this.f5804a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C3544s mo24556d() {
            return new C3544s(this);
        }

        /* renamed from: e */
        public String mo24557e(String str) {
            for (int size = this.f5804a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f5804a.get(size))) {
                    return this.f5804a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: f */
        public C3545a mo24558f(String str) {
            int i = 0;
            while (i < this.f5804a.size()) {
                if (str.equalsIgnoreCase(this.f5804a.get(i))) {
                    this.f5804a.remove(i);
                    this.f5804a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: g */
        public C3545a mo24559g(String str, String str2) {
            C3544s.m9800a(str);
            C3544s.m9801b(str2, str);
            mo24558f(str);
            mo24555c(str, str2);
            return this;
        }
    }

    C3544s(C3545a aVar) {
        List<String> list = aVar.f5804a;
        this.f5803a = (String[]) list.toArray(new String[list.size()]);
    }

    private C3544s(String[] strArr) {
        this.f5803a = strArr;
    }

    /* renamed from: a */
    static void m9800a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C3300c.m8932q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: b */
    static void m9801b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C3300c.m8932q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m9802d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C3544s m9803g(String... strArr) {
        Objects.requireNonNull(strArr, "namesAndValues == null");
        if (strArr.length % 2 == 0) {
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
                m9800a(str);
                m9801b(str2, str);
            }
            return new C3544s(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    /* renamed from: c */
    public String mo24544c(String str) {
        return m9802d(this.f5803a, str);
    }

    /* renamed from: e */
    public String mo24545e(int i) {
        return this.f5803a[i * 2];
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C3544s) && Arrays.equals(((C3544s) obj).f5803a, this.f5803a);
    }

    /* renamed from: f */
    public C3545a mo24547f() {
        C3545a aVar = new C3545a();
        Collections.addAll(aVar.f5804a, this.f5803a);
        return aVar;
    }

    /* renamed from: h */
    public int mo24548h() {
        return this.f5803a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5803a);
    }

    /* renamed from: i */
    public String mo24550i(int i) {
        return this.f5803a[(i * 2) + 1];
    }

    /* renamed from: j */
    public List<String> mo24551j(String str) {
        int h = mo24548h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(mo24545e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo24550i(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = mo24548h();
        for (int i = 0; i < h; i++) {
            sb.append(mo24545e(i));
            sb.append(": ");
            sb.append(mo24550i(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
