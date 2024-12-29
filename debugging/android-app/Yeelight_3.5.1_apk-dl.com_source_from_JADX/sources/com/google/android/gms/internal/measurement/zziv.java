package com.google.android.gms.internal.measurement;

final class zziv extends zziy {
    private final int zzc;

    zziv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzjb.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: protected */
    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }
}
