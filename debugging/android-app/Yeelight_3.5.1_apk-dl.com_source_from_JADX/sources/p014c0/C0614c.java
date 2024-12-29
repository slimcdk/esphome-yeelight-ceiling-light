package p014c0;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: c0.c */
public final class C0614c {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static String m197a(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static String m198b(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static String m199c(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
