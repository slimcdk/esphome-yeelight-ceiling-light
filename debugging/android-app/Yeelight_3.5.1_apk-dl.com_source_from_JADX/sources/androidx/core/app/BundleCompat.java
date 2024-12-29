package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BundleCompat {

    @RequiresApi(18)
    static class Api18Impl {
        private Api18Impl() {
        }

        @DoNotInline
        static IBinder getBinder(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @DoNotInline
        static void putBinder(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static class BeforeApi18Impl {
        private static final String TAG = "BundleCompatBaseImpl";
        private static Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        private BeforeApi18Impl() {
        }

        public static IBinder getBinder(Bundle bundle, String str) {
            if (!sGetIBinderMethodFetched) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    sGetIBinderMethod = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sGetIBinderMethodFetched = true;
            }
            Method method2 = sGetIBinderMethod;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    sGetIBinderMethod = null;
                }
            }
            return null;
        }

        public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
            if (!sPutIBinderMethodFetched) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    sPutIBinderMethod = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sPutIBinderMethodFetched = true;
            }
            Method method2 = sPutIBinderMethod;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    sPutIBinderMethod = null;
                }
            }
        }
    }

    private BundleCompat() {
    }

    @Nullable
    public static IBinder getBinder(@NonNull Bundle bundle, @Nullable String str) {
        return Build.VERSION.SDK_INT >= 18 ? Api18Impl.getBinder(bundle, str) : BeforeApi18Impl.getBinder(bundle, str);
    }

    public static void putBinder(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            Api18Impl.putBinder(bundle, str, iBinder);
        } else {
            BeforeApi18Impl.putBinder(bundle, str, iBinder);
        }
    }
}
