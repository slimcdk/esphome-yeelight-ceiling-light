package p164h.p165b.p166a.p240h.p252w;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: h.b.a.h.w.p */
public class C11389p {

    /* renamed from: a */
    private String f22642a;

    /* renamed from: b */
    private int f22643b;

    public C11389p() {
    }

    public C11389p(String str, int i) {
        this.f22642a = str;
        this.f22643b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11389p.class != obj.getClass()) {
            return false;
        }
        C11389p pVar = (C11389p) obj;
        return this.f22643b == pVar.f22643b && this.f22642a.equals(pVar.f22642a);
    }

    public int hashCode() {
        return (this.f22642a.hashCode() * 31) + this.f22643b;
    }

    public String toString() {
        return this.f22642a + Constants.COLON_SEPARATOR + this.f22643b;
    }
}
