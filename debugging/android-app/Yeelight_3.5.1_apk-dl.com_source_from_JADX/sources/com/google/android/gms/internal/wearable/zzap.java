package com.google.android.gms.internal.wearable;

final class zzap extends zzas {
    private final int zzc;

    zzap(byte[] bArr, int i, int i2) {
        super(bArr);
        zzau.zzq(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final int zzc() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final int zzd() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }
}
