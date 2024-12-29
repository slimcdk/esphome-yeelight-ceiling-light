package com.google.android.gms.internal.wearable;

public enum zzen {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzau.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzen(Object obj) {
        this.zzj = obj;
    }
}
