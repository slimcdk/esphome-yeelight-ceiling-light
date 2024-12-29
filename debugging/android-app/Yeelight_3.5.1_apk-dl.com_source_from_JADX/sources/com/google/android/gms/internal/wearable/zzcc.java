package com.google.android.gms.internal.wearable;

import java.io.IOException;

public class zzcc extends IOException {
    private C1486o1 zza = null;

    public zzcc(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzcc(String str) {
        super(str);
    }

    static zzcc zzb() {
        return new zzcc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzcc zzc() {
        return new zzcc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzcc zzd() {
        return new zzcc("Protocol message contained an invalid tag (zero).");
    }

    static zzcb zze() {
        return new zzcb("Protocol message tag had invalid wire type.");
    }

    static zzcc zzf() {
        return new zzcc("Failed to parse the message.");
    }

    static zzcc zzg() {
        return new zzcc("Protocol message had invalid UTF-8.");
    }

    public final zzcc zza(C1486o1 o1Var) {
        this.zza = o1Var;
        return this;
    }
}
