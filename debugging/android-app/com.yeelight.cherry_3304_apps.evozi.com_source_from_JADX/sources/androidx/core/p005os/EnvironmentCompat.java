package androidx.core.p005os;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: androidx.core.os.EnvironmentCompat */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    private EnvironmentCompat() {
    }

    public static String getStorageState(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            return file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()) ? Environment.getExternalStorageState() : MEDIA_UNKNOWN;
        } catch (IOException e) {
            "Failed to resolve canonical path: " + e;
            return MEDIA_UNKNOWN;
        }
    }
}
