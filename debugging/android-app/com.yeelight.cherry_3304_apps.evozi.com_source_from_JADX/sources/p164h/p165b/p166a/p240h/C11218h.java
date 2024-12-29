package p164h.p165b.p166a.p240h;

import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: h.b.a.h.h */
public class C11218h {

    /* renamed from: a */
    protected InetAddress f22299a;

    /* renamed from: b */
    protected int f22300b;

    /* renamed from: c */
    protected byte[] f22301c;

    public C11218h(InetAddress inetAddress, int i, byte[] bArr) {
        this.f22299a = inetAddress;
        this.f22300b = i;
        this.f22301c = bArr;
    }

    /* renamed from: a */
    public InetAddress mo35663a() {
        return this.f22299a;
    }

    /* renamed from: b */
    public byte[] mo35664b() {
        return this.f22301c;
    }

    /* renamed from: c */
    public int mo35665c() {
        return this.f22300b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11218h.class != obj.getClass()) {
            return false;
        }
        C11218h hVar = (C11218h) obj;
        return this.f22300b == hVar.f22300b && this.f22299a.equals(hVar.f22299a) && Arrays.equals(this.f22301c, hVar.f22301c);
    }

    public int hashCode() {
        int hashCode = ((this.f22299a.hashCode() * 31) + this.f22300b) * 31;
        byte[] bArr = this.f22301c;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
