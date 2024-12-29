package com.yeelight.yeelib_tasker.p143ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import p184m3.C9546b;

/* renamed from: com.yeelight.yeelib_tasker.ui.InfoActivity */
public final class InfoActivity extends Activity {
    public void onCreate(Bundle bundle) {
        Intent addFlags;
        super.onCreate(bundle);
        PackageManager packageManager = getPackageManager();
        String b = C9546b.m23215b(packageManager, (String) null);
        if (b != null) {
            String.format(Locale.US, "Locale-compatible package %s is installed", new Object[]{b});
            try {
                addFlags = packageManager.getLaunchIntentForPackage(b);
                addFlags.addFlags(268435456);
            } catch (Exception unused) {
            }
        } else {
            addFlags = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "market://details?id=%s&referrer=utm_source=%s&utm_medium=app&utm_campaign=plugin", new Object[]{"com.twofortyfouram.locale", getPackageName()}))).addFlags(67108864);
        }
        startActivity(addFlags);
        finish();
    }
}
