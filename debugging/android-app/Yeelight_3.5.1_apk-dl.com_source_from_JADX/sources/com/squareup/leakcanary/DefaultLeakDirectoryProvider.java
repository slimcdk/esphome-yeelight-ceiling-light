package com.squareup.leakcanary;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import com.squareup.leakcanary.internal.RequestStoragePermissionActivity;
import java.io.File;

public final class DefaultLeakDirectoryProvider implements LeakDirectoryProvider {
    private final Context context;

    public DefaultLeakDirectoryProvider(Context context2) {
        this.context = context2.getApplicationContext();
    }

    @TargetApi(23)
    private boolean hasStoragePermission() {
        return Build.VERSION.SDK_INT < 23 || this.context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean isLeakStorageWritable() {
        if (!hasStoragePermission()) {
            return false;
        }
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public File leakDirectory() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(externalStoragePublicDirectory, "leakcanary-" + this.context.getPackageName());
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        throw new UnsupportedOperationException("Could not create leak directory " + file.getPath());
    }

    public void requestWritePermission() {
        if (!hasStoragePermission()) {
            PendingIntent createPendingIntent = RequestStoragePermissionActivity.createPendingIntent(this.context);
            String string = this.context.getString(C4247R.string.leak_canary_permission_notification_title);
            String packageName = this.context.getPackageName();
            LeakCanaryInternals.showNotification(this.context, string, this.context.getString(C4247R.string.leak_canary_permission_notification_text, new Object[]{packageName}), createPendingIntent);
        }
    }
}
