package p103u1;

import java.util.Objects;
import javax.annotation.Nonnull;

/* renamed from: u1.a */
final class C3712a extends C3716f {

    /* renamed from: a */
    private final String f6234a;

    /* renamed from: b */
    private final String f6235b;

    C3712a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f6234a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f6235b = str2;
    }

    @Nonnull
    /* renamed from: b */
    public String mo26128b() {
        return this.f6234a;
    }

    @Nonnull
    /* renamed from: c */
    public String mo26129c() {
        return this.f6235b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3716f)) {
            return false;
        }
        C3716f fVar = (C3716f) obj;
        return this.f6234a.equals(fVar.mo26128b()) && this.f6235b.equals(fVar.mo26129c());
    }

    public int hashCode() {
        return ((this.f6234a.hashCode() ^ 1000003) * 1000003) ^ this.f6235b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f6234a + ", version=" + this.f6235b + "}";
    }
}
