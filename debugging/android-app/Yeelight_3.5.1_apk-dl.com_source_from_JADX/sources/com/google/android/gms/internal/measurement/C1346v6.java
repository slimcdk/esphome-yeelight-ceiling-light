package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
final class C1346v6 implements C1331u6 {
    @CheckForNull

    /* renamed from: a */
    volatile C1331u6 f1682a;

    /* renamed from: b */
    volatile boolean f1683b;
    @CheckForNull

    /* renamed from: c */
    Object f1684c;

    C1346v6(C1331u6 u6Var) {
        Objects.requireNonNull(u6Var);
        this.f1682a = u6Var;
    }

    public final String toString() {
        Object obj = this.f1682a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f1684c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f1683b) {
            synchronized (this) {
                if (!this.f1683b) {
                    C1331u6 u6Var = this.f1682a;
                    u6Var.getClass();
                    Object zza = u6Var.zza();
                    this.f1684c = zza;
                    this.f1683b = true;
                    this.f1682a = null;
                    return zza;
                }
            }
        }
        return this.f1684c;
    }
}
