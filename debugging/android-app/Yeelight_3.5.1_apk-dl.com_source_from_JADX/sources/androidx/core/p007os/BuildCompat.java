package androidx.core.p007os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* renamed from: androidx.core.os.BuildCompat */
public class BuildCompat {

    @RequiresOptIn
    /* renamed from: androidx.core.os.BuildCompat$PrereleaseSdkCheck */
    public @interface PrereleaseSdkCheck {
    }

    private BuildCompat() {
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 24)
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 25)
    public static boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 26)
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 27)
    public static boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 28)
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    protected static boolean isAtLeastPreReleaseCodename(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 29)
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 30)
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    @ChecksSdkIntAtLeast(api = 31, codename = "S")
    public static boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && isAtLeastPreReleaseCodename("S", Build.VERSION.CODENAME));
    }

    @Deprecated
    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @PrereleaseSdkCheck
    public static boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        return i >= 32 || (i >= 31 && isAtLeastPreReleaseCodename("Sv2", Build.VERSION.CODENAME));
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @PrereleaseSdkCheck
    public static boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && isAtLeastPreReleaseCodename("Tiramisu", Build.VERSION.CODENAME));
    }

    @ChecksSdkIntAtLeast(codename = "UpsideDownCake")
    @PrereleaseSdkCheck
    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 33 && isAtLeastPreReleaseCodename("UpsideDownCake", Build.VERSION.CODENAME);
    }
}
