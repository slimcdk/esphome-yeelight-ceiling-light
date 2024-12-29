package com.xiaomi.mipush.sdk.help;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.mipush.sdk.C4070n;

public class HelpActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4070n.m10970a(this, getIntent(), (Uri) null);
        finish();
    }
}
