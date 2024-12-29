package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* renamed from: com.google.android.gms.common.api.o */
public final class C1512o extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f2867a;

    @KeepForSdk
    public C1512o(Feature feature) {
        this.f2867a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f2867a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
