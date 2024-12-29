package p164h.p211a.p212a.p213a;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetSocketAddress;

/* renamed from: h.a.a.a.b */
public class C10857b {

    /* renamed from: a */
    private final String f20948a;

    /* renamed from: b */
    private final int f20949b;

    public C10857b(String str, int i) {
        if (str != null) {
            this.f20948a = str.trim();
            this.f20949b = i;
            return;
        }
        throw new IllegalArgumentException("Host is null");
    }

    /* renamed from: a */
    public String mo34219a() {
        return this.f20948a;
    }

    /* renamed from: b */
    public int mo34220b() {
        return this.f20949b;
    }

    /* renamed from: c */
    public InetSocketAddress mo34221c() {
        return new InetSocketAddress(mo34219a(), mo34220b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10857b.class != obj.getClass()) {
            return false;
        }
        C10857b bVar = (C10857b) obj;
        return this.f20948a.equals(bVar.f20948a) && this.f20949b == bVar.f20949b;
    }

    public int hashCode() {
        return (this.f20948a.hashCode() * 31) + this.f20949b;
    }

    public String toString() {
        return this.f20948a + Constants.COLON_SEPARATOR + this.f20949b;
    }
}
