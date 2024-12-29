package com.google.android.gms.internal.wearable;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.wearable.m */
final class C1474m extends C1484o {

    /* renamed from: a */
    private int f1819a = 0;

    /* renamed from: b */
    private final int f1820b;

    /* renamed from: c */
    final /* synthetic */ zzau f1821c;

    C1474m(zzau zzau) {
        this.f1821c = zzau;
        this.f1820b = zzau.zzc();
    }

    public final boolean hasNext() {
        return this.f1819a < this.f1820b;
    }

    public final byte zza() {
        int i = this.f1819a;
        if (i < this.f1820b) {
            this.f1819a = i + 1;
            return this.f1821c.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
