package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class zzig implements Serializable, C1331u6 {
    final C1331u6 zza;
    volatile transient boolean zzb;
    @CheckForNull
    transient Object zzc;

    zzig(C1331u6 u6Var) {
        Objects.requireNonNull(u6Var);
        this.zza = u6Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.zzb) {
            obj = "<supplier that returned " + this.zzc + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
