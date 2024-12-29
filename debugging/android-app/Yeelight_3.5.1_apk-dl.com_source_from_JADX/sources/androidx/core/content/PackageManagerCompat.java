package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.p007os.UserManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import p102u0.C3711a;

public final class PackageManagerCompat {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 30;
        boolean z2 = i >= 23 && i < 30;
        boolean z3 = getPermissionRevocationVerifierApp(packageManager) != null;
        if (!z) {
            return z2 && z3;
        }
        return true;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", (String) null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static C3711a<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        int i;
        ResolvableFuture create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            return create;
        } else if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        } else {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i2 < 30) {
                create.set(0);
                return create;
            }
            int i3 = Build.VERSION.SDK_INT;
            int i4 = 4;
            if (i3 >= 31) {
                if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    if (i2 >= 31) {
                        i4 = 5;
                    }
                    i = Integer.valueOf(i4);
                } else {
                    i = 2;
                }
                create.set(i);
                return create;
            } else if (i3 == 30) {
                if (!Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    i4 = 2;
                }
                create.set(Integer.valueOf(i4));
                return create;
            } else {
                UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
                create.addListener(new C0240a(unusedAppRestrictionsBackportServiceConnection), Executors.newSingleThreadExecutor());
                unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
                return create;
            }
        }
    }
}
