package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;

class zziy extends zzix {
    protected final byte[] zza;

    zziy(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjb) || zzd() != ((zzjb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziy)) {
            return obj.equals(this);
        }
        zziy zziy = (zziy) obj;
        int zzk = zzk();
        int zzk2 = zziy.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zziy.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zziy.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zziy.zza;
            zziy.zzc();
            int i = 0;
            int i2 = 0;
            while (i < zzd) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int zzd3 = zziy.zzd();
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd3);
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i, int i2, int i3) {
        return C1270q8.m2545d(i, this.zza, 0, i3);
    }

    public final zzjb zzf(int i, int i2) {
        int zzj = zzjb.zzj(0, i2, zzd());
        return zzj == 0 ? zzjb.zzb : new zziv(this.zza, 0, zzj);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(C1077e7 e7Var) {
        ((C1269q7) e7Var).mo13086E(this.zza, 0, zzd());
    }

    public final boolean zzi() {
        return C1049cb.m1779f(this.zza, 0, zzd());
    }
}
