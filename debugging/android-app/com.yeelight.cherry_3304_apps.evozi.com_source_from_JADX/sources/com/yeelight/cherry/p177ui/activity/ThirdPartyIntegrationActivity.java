package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;

/* renamed from: com.yeelight.cherry.ui.activity.ThirdPartyIntegrationActivity */
public class ThirdPartyIntegrationActivity extends BaseActivity {
    static {
        Class<ThirdPartyIntegrationActivity> cls = ThirdPartyIntegrationActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 19);
        startActivity(intent);
        finish();
    }
}