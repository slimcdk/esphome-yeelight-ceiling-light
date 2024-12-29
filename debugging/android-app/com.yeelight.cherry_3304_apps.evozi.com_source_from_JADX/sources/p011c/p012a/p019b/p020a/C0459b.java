package p011c.p012a.p019b.p020a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.a.b.a.b */
public final class C0459b {

    /* renamed from: a */
    private final String f50a;

    private C0459b(@NonNull String str) {
        if (str != null) {
            this.f50a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C0459b m41b(@NonNull String str) {
        return new C0459b(str);
    }

    /* renamed from: a */
    public String mo8397a() {
        return this.f50a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0459b)) {
            return false;
        }
        return this.f50a.equals(((C0459b) obj).f50a);
    }

    public int hashCode() {
        return this.f50a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f50a + "\"}";
    }
}
