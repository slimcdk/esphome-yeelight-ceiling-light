package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;

/* renamed from: com.yeelight.cherry.ui.activity.FaqActivity */
public class FaqActivity extends BaseActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 0);
        startActivity(intent);
        finish();
    }
}