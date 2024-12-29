package p164h.p165b.p166a.p240h.p252w;

import java.util.logging.Logger;

/* renamed from: h.b.a.h.w.e0 */
public class C11365e0 {

    /* renamed from: a */
    private String f22548a;

    static {
        Logger.getLogger(C11365e0.class.getName());
    }

    public C11365e0(String str) {
        this.f22548a = str;
    }

    /* renamed from: b */
    public static C11365e0 m29787b(String str) {
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return new C11365e0(str);
    }

    /* renamed from: a */
    public String mo36059a() {
        return this.f22548a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11365e0)) {
            return false;
        }
        return this.f22548a.equals(((C11365e0) obj).f22548a);
    }

    public int hashCode() {
        return this.f22548a.hashCode();
    }

    public String toString() {
        return "uuid:" + mo36059a();
    }
}
