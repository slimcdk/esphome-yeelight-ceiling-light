package com.google.android.gms.common.util;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.util.c */
public class C0962c {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @KeepForSdk
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m1590a(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
