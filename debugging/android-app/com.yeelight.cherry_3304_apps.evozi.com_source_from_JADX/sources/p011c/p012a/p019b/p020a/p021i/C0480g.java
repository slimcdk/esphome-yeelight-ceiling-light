package p011c.p012a.p019b.p020a.p021i;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p011c.p012a.p019b.p020a.C0459b;

/* renamed from: c.a.b.a.i.g */
public final class C0480g {

    /* renamed from: a */
    private final C0459b f96a;

    /* renamed from: b */
    private final byte[] f97b;

    public C0480g(@NonNull C0459b bVar, @NonNull byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f96a = bVar;
            this.f97b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo8453a() {
        return this.f97b;
    }

    /* renamed from: b */
    public C0459b mo8454b() {
        return this.f96a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0480g)) {
            return false;
        }
        C0480g gVar = (C0480g) obj;
        if (!this.f96a.equals(gVar.f96a)) {
            return false;
        }
        return Arrays.equals(this.f97b, gVar.f97b);
    }

    public int hashCode() {
        return ((this.f96a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f97b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f96a + ", bytes=[...]}";
    }
}
