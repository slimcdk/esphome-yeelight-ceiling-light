package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
final class C1093f7 extends C1125h7 {

    /* renamed from: a */
    private int f1323a = 0;

    /* renamed from: b */
    private final int f1324b;

    /* renamed from: c */
    final /* synthetic */ zzjb f1325c;

    C1093f7(zzjb zzjb) {
        this.f1325c = zzjb;
        this.f1324b = zzjb.zzd();
    }

    public final boolean hasNext() {
        return this.f1323a < this.f1324b;
    }

    public final byte zza() {
        int i = this.f1323a;
        if (i < this.f1324b) {
            this.f1323a = i + 1;
            return this.f1325c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
