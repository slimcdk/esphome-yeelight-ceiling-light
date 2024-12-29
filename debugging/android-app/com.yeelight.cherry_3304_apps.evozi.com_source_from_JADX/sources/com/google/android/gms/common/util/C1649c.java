package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.c */
public final class C1649c {
    @KeepForSdk
    /* renamed from: a */
    public static String m4574a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @KeepForSdk
    /* renamed from: b */
    public static String m4575b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @KeepForSdk
    /* renamed from: c */
    public static String m4576c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
