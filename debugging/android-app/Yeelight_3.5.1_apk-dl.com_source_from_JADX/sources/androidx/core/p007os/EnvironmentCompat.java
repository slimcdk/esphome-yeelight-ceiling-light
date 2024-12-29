package androidx.core.p007os;

import android.os.Build;
import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;

/* renamed from: androidx.core.os.EnvironmentCompat */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    @RequiresApi(19)
    /* renamed from: androidx.core.os.EnvironmentCompat$Api19Impl */
    static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        static String getStorageState(File file) {
            return Environment.getStorageState(file);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.os.EnvironmentCompat$Api21Impl */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static String getExternalStorageState(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private EnvironmentCompat() {
    }

    @NonNull
    public static String getStorageState(@NonNull File file) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return Api21Impl.getExternalStorageState(file);
        }
        if (i >= 19) {
            return Api19Impl.getStorageState(file);
        }
        try {
            return file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()) ? Environment.getExternalStorageState() : MEDIA_UNKNOWN;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve canonical path: ");
            sb.append(e);
            return MEDIA_UNKNOWN;
        }
    }
}
