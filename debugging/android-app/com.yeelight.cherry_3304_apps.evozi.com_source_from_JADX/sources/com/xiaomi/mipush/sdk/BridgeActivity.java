package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.xiaomi.channel.commonutils.logger.C3989b;

public class BridgeActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 51;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            Intent intent2 = getIntent();
            if (!(intent2 == null || (intent = (Intent) intent2.getParcelableExtra("mipush_serviceIntent")) == null)) {
                PushMessageHandler.m10776a(getApplicationContext(), intent);
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        } catch (Throwable th) {
            finish();
            throw th;
        }
        finish();
    }
}
