package com.miot.common.crash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.miot.service.C3602R;

public class CrashShowActivity extends Activity {
    private TextView mCrashTextview;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3602R.layout.layout);
        this.mCrashTextview = (TextView) findViewById(C3602R.C3604id.crash_tv);
        Intent intent = getIntent();
        if (intent != null) {
            this.mCrashTextview.setText(intent.getExtras().getString("crash"));
        }
    }
}
