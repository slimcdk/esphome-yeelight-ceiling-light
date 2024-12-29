package com.google.android.gms.internal.wearable;

public enum zzem {
    DOUBLE(zzen.DOUBLE, 1),
    FLOAT(zzen.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzen.BOOLEAN, 0),
    STRING(zzen.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzen.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzen.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzen zzs;

    private zzem(zzen zzen, int i) {
        this.zzs = zzen;
    }

    public final zzen zza() {
        return this.zzs;
    }
}
