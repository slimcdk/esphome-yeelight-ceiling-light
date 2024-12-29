package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.f */
public final class C1652f {
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m4582a() {
        return Collections.emptyList();
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m4583b(T t) {
        return Collections.singletonList(t);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m4584c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m4583b(tArr[0]) : m4582a();
    }
}
