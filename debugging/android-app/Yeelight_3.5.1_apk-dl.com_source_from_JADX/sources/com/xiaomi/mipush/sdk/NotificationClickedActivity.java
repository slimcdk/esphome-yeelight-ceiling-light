package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.xiaomi.channel.commonutils.logger.C4408b;

public final class NotificationClickedActivity extends Activity {

    /* renamed from: a */
    private BroadcastReceiver f7415a;

    /* renamed from: a */
    private Handler f7416a;

    /* renamed from: a */
    private void m12582a(Intent intent) {
        if (intent != null) {
            try {
                Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
                if (intent2 != null) {
                    intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
                    intent2.putExtra("is_clicked_activity_call", true);
                    C4408b.m12481b("clicked activity start service.");
                    startService(intent2);
                }
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
        Handler handler = new Handler();
        this.f7416a = handler;
        handler.postDelayed(new C4453ac(this), 3000);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        C4454ad adVar = new C4454ad(this);
        this.f7415a = adVar;
        try {
            registerReceiver(adVar, intentFilter, C4478d.m12749a(this), (Handler) null);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f7416a.removeCallbacksAndMessages((Object) null);
        try {
            unregisterReceiver(this.f7415a);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m12582a(getIntent());
    }
}
