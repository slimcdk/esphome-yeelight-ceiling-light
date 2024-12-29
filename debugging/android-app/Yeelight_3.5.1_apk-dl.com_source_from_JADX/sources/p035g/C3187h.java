package p035g;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;
import p031f.C3150a;

/* renamed from: g.h */
public final class C3187h {

    /* renamed from: a */
    private final C3150a f5153a;

    /* renamed from: b */
    private final byte[] f5154b;

    public C3187h(@NonNull C3150a aVar, @NonNull byte[] bArr) {
        Objects.requireNonNull(aVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f5153a = aVar;
        this.f5154b = bArr;
    }

    /* renamed from: a */
    public byte[] mo23745a() {
        return this.f5154b;
    }

    /* renamed from: b */
    public C3150a mo23746b() {
        return this.f5153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187h)) {
            return false;
        }
        C3187h hVar = (C3187h) obj;
        if (!this.f5153a.equals(hVar.f5153a)) {
            return false;
        }
        return Arrays.equals(this.f5154b, hVar.f5154b);
    }

    public int hashCode() {
        return ((this.f5153a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5154b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f5153a + ", bytes=[...]}";
    }
}
