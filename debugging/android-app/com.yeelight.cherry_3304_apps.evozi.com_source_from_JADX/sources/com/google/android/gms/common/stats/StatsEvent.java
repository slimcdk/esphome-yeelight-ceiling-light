package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: Q */
    public abstract int mo11364Q();

    /* renamed from: R */
    public abstract long mo11365R();

    /* renamed from: S */
    public abstract long mo11366S();

    /* renamed from: T */
    public abstract String mo11367T();

    public String toString() {
        long R = mo11365R();
        int Q = mo11364Q();
        long S = mo11366S();
        String T = mo11367T();
        StringBuilder sb = new StringBuilder(String.valueOf(T).length() + 53);
        sb.append(R);
        sb.append("\t");
        sb.append(Q);
        sb.append("\t");
        sb.append(S);
        sb.append(T);
        return sb.toString();
    }
}
