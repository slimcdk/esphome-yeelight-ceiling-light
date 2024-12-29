package p031f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: f.a */
public final class C3150a {

    /* renamed from: a */
    private final String f5053a;

    private C3150a(@NonNull String str) {
        Objects.requireNonNull(str, "name is null");
        this.f5053a = str;
    }

    /* renamed from: b */
    public static C3150a m8421b(@NonNull String str) {
        return new C3150a(str);
    }

    /* renamed from: a */
    public String mo23639a() {
        return this.f5053a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3150a)) {
            return false;
        }
        return this.f5053a.equals(((C3150a) obj).f5053a);
    }

    public int hashCode() {
        return this.f5053a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f5053a + "\"}";
    }
}
