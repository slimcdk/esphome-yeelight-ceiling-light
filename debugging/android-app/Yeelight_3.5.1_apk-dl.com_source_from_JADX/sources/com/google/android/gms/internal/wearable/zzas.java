package com.google.android.gms.internal.wearable;

import java.nio.charset.Charset;
import java.util.Objects;

class zzas extends zzar {
    protected final byte[] zza;

    zzas(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzau) || zzc() != ((zzau) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return obj.equals(this);
        }
        zzas zzas = (zzas) obj;
        int zzp = zzp();
        int zzp2 = zzas.zzp();
        if (zzp != 0 && zzp2 != 0 && zzp != zzp2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzas.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc <= zzas.zzc()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzas.zza;
            zzas.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int zzc3 = zzas.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public int zzd() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final zzau zzf(int i, int i2) {
        int zzq = zzau.zzq(0, i2, zzc());
        return zzq == 0 ? zzau.zzb : new zzap(this.zza, 0, zzq);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(C1469l lVar) {
        ((C1519v) lVar).mo13807E(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzi() {
        return C1428c3.m3494b(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        return C1524w0.m3864h(i, this.zza, 0, i3);
    }
}
