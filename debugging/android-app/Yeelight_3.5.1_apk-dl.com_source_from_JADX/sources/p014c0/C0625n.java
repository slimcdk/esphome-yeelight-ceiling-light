package p014c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0884e;
import com.google.android.gms.common.annotation.KeepForSdk;
import p028e0.C3144c;

@KeepForSdk
/* renamed from: c0.n */
public final class C0625n {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m233a(@NonNull Context context, int i) {
        if (!m234b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C0884e.m1246a(context).mo12141b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @TargetApi(19)
    @KeepForSdk
    /* renamed from: b */
    public static boolean m234b(@NonNull Context context, int i, @NonNull String str) {
        return C3144c.m8403a(context).mo23631f(i, str);
    }
}
