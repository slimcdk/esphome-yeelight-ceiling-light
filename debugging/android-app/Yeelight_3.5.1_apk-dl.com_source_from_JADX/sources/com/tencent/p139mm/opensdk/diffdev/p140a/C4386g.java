package com.tencent.p139mm.opensdk.diffdev.p140a;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.g */
public enum C4386g {
    UUID_EXPIRED(TypedValues.CycleType.TYPE_VISIBILITY),
    UUID_CANCELED(TypedValues.CycleType.TYPE_ALPHA),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);
    
    private int code;

    private C4386g(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
