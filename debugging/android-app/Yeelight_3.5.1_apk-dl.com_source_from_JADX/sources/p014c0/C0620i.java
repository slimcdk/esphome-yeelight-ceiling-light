package p014c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: c0.i */
public final class C0620i {
    @Nullable

    /* renamed from: a */
    private static Boolean f232a;
    @Nullable

    /* renamed from: b */
    private static Boolean f233b;
    @Nullable

    /* renamed from: c */
    private static Boolean f234c;
    @Nullable

    /* renamed from: d */
    private static Boolean f235d;

    @KeepForSdk
    /* renamed from: a */
    public static boolean m212a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f235d == null) {
            boolean z = false;
            if (C0624m.m229h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f235d = Boolean.valueOf(z);
        }
        return f235d.booleanValue();
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m213b() {
        int i = C0879d.f886a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    /* renamed from: c */
    public static boolean m214c(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f232a == null) {
            boolean z = false;
            if (C0624m.m226e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f232a = Boolean.valueOf(z);
        }
        return f232a.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    /* renamed from: d */
    public static boolean m215d(@NonNull Context context) {
        if (m214c(context) && !C0624m.m228g()) {
            return true;
        }
        if (m216e(context)) {
            return !C0624m.m229h() || C0624m.m231j();
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m216e(@NonNull Context context) {
        if (f233b == null) {
            boolean z = false;
            if (C0624m.m227f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f233b = Boolean.valueOf(z);
        }
        return f233b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m217f(@NonNull Context context) {
        if (f234c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f234c = Boolean.valueOf(z);
        }
        return f234c.booleanValue();
    }
}
