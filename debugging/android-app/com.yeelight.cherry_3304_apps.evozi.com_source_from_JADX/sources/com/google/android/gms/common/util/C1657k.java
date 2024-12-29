package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
public final class C1657k {
    @KeepForSdk
    /* renamed from: a */
    public static void m4598a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
