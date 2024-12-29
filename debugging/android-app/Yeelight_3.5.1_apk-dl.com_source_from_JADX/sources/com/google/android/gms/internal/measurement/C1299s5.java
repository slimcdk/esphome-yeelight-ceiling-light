package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.s5 */
final class C1299s5 extends C1220n6 {

    /* renamed from: a */
    private final Context f1595a;

    /* renamed from: b */
    private final C1331u6 f1596b;

    C1299s5(Context context, @Nullable C1331u6 u6Var) {
        Objects.requireNonNull(context, "Null context");
        this.f1595a = context;
        this.f1596b = u6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo13017a() {
        return this.f1595a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final C1331u6 mo13018b() {
        return this.f1596b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1220n6) {
            C1220n6 n6Var = (C1220n6) obj;
            if (this.f1595a.equals(n6Var.mo13017a())) {
                C1331u6 u6Var = this.f1596b;
                C1331u6 b = n6Var.mo13018b();
                if (u6Var != null ? u6Var.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1595a.hashCode() ^ 1000003) * 1000003;
        C1331u6 u6Var = this.f1596b;
        return hashCode ^ (u6Var == null ? 0 : u6Var.hashCode());
    }

    public final String toString() {
        String obj = this.f1595a.toString();
        String valueOf = String.valueOf(this.f1596b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
