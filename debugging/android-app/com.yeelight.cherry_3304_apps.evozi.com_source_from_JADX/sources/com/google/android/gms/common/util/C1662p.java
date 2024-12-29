package com.google.android.gms.common.util;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.util.p */
public class C1662p {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4614a(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
