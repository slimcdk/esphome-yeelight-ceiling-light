package com.squareup.leakcanary.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

@TargetApi(23)
public class RequestStoragePermissionActivity extends Activity {
    public static PendingIntent createPendingIntent(Context context) {
        Class<RequestStoragePermissionActivity> cls = RequestStoragePermissionActivity.class;
        LeakCanaryInternals.setEnabledBlocking(context, cls, true);
        Intent intent = new Intent(context, cls);
        intent.setFlags(335544320);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            finish();
        } else {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 42);
        }
    }
}
