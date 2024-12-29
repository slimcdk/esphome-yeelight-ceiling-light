package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: V */
    public abstract int mo12417V();

    /* renamed from: W */
    public abstract long mo12418W();

    /* renamed from: c0 */
    public abstract long mo12419c0();

    @NonNull
    /* renamed from: d0 */
    public abstract String mo12420d0();

    @NonNull
    public final String toString() {
        long c0 = mo12419c0();
        int V = mo12417V();
        long W = mo12418W();
        String d0 = mo12420d0();
        return c0 + "\t" + V + "\t" + W + d0;
    }
}
