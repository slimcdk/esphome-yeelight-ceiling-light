package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzac extends AbstractList<Long> implements RandomAccess, Serializable {
    final long[] zza;
    final int zzb;
    final int zzc;

    zzac(long[] jArr, int i, int i2) {
        this.zza = jArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Long) && C1429d.m3500b(this.zza, ((Long) obj).longValue(), this.zzb, this.zzc) != -1;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return super.equals(obj);
        }
        zzac zzac = (zzac) obj;
        int i = this.zzc - this.zzb;
        if (zzac.zzc - zzac.zzb != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zza[this.zzb + i2] != zzac.zza[zzac.zzb + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C1513t3.m3818a(i, this.zzc - this.zzb, "index");
        return Long.valueOf(this.zza[this.zzb + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            long j = this.zza[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int b;
        if (!(obj instanceof Long) || (b = C1429d.m3500b(this.zza, ((Long) obj).longValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return b - this.zzb;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.zza;
            long longValue = ((Long) obj).longValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 >= i) {
                    if (jArr[i2] == longValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.zzb;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Long l = (Long) obj;
        C1513t3.m3818a(i, this.zzc - this.zzb, "index");
        long[] jArr = this.zza;
        int i2 = this.zzb + i;
        long j = jArr[i2];
        Objects.requireNonNull(l);
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.zzc - this.zzb;
    }

    public final List<Long> subList(int i, int i2) {
        C1513t3.m3819b(i, i2, this.zzc - this.zzb);
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.zza;
        int i3 = this.zzb;
        return new zzac(jArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 10);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i = this.zzb;
        while (true) {
            i++;
            if (i < this.zzc) {
                sb.append(", ");
                sb.append(this.zza[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
