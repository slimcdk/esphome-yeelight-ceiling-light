package com.miot.common.crash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.miot.service.C2875R;

public class CrashShowActivity extends Activity {
    private TextView mCrashTextview;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2875R.layout.layout);
        this.mCrashTextview = (TextView) findViewById(C2875R.C2877id.crash_tv);
        Intent intent = getIntent();
        if (intent != null) {
            this.mCrashTextview.setText(intent.getExtras().getString("crash"));
        }
    }
}
