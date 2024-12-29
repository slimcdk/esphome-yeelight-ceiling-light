package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.util.a */
public final class C0960a {
    @KeepForSdk
    /* renamed from: a */
    public static void m1588a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
