package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzau implements Iterable<Byte>, Serializable {
    public static final zzau zzb = new zzas(C1524w0.f1868b);
    private static final Comparator<zzau> zzc = new C1479n();
    private static final C1494q zzd = new C1494q((C1474m) null);
    private int zza = 0;

    static {
        int i = C1449h.f1782a;
    }

    zzau() {
    }

    public static zzau zzk(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzas(bArr2);
    }

    public static zzau zzl(byte[] bArr) {
        return zzk(bArr, 0, bArr.length);
    }

    public static zzau zzm(String str) {
        return new zzas(str.getBytes(C1524w0.f1867a));
    }

    static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc2 = zzc();
            i = zzj(zzc2, 0, zzc2);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C1474m(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? C1477m2.m3618a(this) : String.valueOf(C1477m2.m3618a(zzf(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzc();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract zzau zzf(int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void zzg(C1469l lVar);

    /* access modifiers changed from: protected */
    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    /* access modifiers changed from: protected */
    public abstract int zzj(int i, int i2, int i3);

    public final byte[] zzn() {
        int zzc2 = zzc();
        if (zzc2 == 0) {
            return C1524w0.f1868b;
        }
        byte[] bArr = new byte[zzc2];
        zze(bArr, 0, 0, zzc2);
        return bArr;
    }

    public final String zzo(Charset charset) {
        return zzc() == 0 ? "" : zzh(charset);
    }

    /* access modifiers changed from: protected */
    public final int zzp() {
        return this.zza;
    }
}
