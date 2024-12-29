package com.squareup.okhttp;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.p194io.IOUtils;
import p123a3.C3947g;

/* renamed from: com.squareup.okhttp.p */
public final class C4299p {

    /* renamed from: a */
    private final String[] f6996a;

    /* renamed from: com.squareup.okhttp.p$b */
    public static final class C4301b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f6997a = new ArrayList(20);

        /* renamed from: f */
        private void m11995f(String str, String str2) {
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
        public C4301b mo27939b(String str, String str2) {
            m11995f(str, str2);
            return mo27941d(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4301b mo27940c(String str) {
            int indexOf = str.indexOf(Constants.COLON_SEPARATOR, 1);
            return indexOf != -1 ? mo27941d(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(Constants.COLON_SEPARATOR) ? mo27941d("", str.substring(1)) : mo27941d("", str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4301b mo27941d(String str, String str2) {
            this.f6997a.add(str);
            this.f6997a.add(str2.trim());
            return this;
        }

        /* renamed from: e */
        public C4299p mo27942e() {
            return new C4299p(this);
        }

        /* renamed from: g */
        public C4301b mo27943g(String str) {
            int i = 0;
            while (i < this.f6997a.size()) {
                if (str.equalsIgnoreCase(this.f6997a.get(i))) {
                    this.f6997a.remove(i);
                    this.f6997a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: h */
        public C4301b mo27944h(String str, String str2) {
            m11995f(str, str2);
            mo27943g(str);
            mo27941d(str, str2);
            return this;
        }
    }

    private C4299p(C4301b bVar) {
        this.f6996a = (String[]) bVar.f6997a.toArray(new String[bVar.f6997a.size()]);
    }

    private C4299p(String[] strArr) {
        this.f6996a = strArr;
    }

    /* renamed from: b */
    private static String m11985b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C4299p m11986f(String... strArr) {
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
        return new C4299p(strArr2);
    }

    /* renamed from: a */
    public String mo27931a(String str) {
        return m11985b(this.f6996a, str);
    }

    /* renamed from: c */
    public Date mo27932c(String str) {
        String a = mo27931a(str);
        if (a != null) {
            return C3947g.m11321b(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo27933d(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f6996a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: e */
    public C4301b mo27934e() {
        C4301b bVar = new C4301b();
        Collections.addAll(bVar.f6997a, this.f6996a);
        return bVar;
    }

    /* renamed from: g */
    public int mo27935g() {
        return this.f6996a.length / 2;
    }

    /* renamed from: h */
    public String mo27936h(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f6996a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: i */
    public List<String> mo27937i(String str) {
        int g = mo27935g();
        ArrayList arrayList = null;
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(mo27933d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo27936h(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g = mo27935g();
        for (int i = 0; i < g; i++) {
            sb.append(mo27933d(i));
            sb.append(": ");
            sb.append(mo27936h(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
