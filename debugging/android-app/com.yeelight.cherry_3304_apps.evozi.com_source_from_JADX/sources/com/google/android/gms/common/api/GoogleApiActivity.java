package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.C1518c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1426e;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @VisibleForTesting

    /* renamed from: a */
    private int f2545a = 0;

    /* renamed from: a */
    public static PendingIntent m3608a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m3609b(context, pendingIntent, i, true), 134217728);
    }

    /* renamed from: b */
    public static Intent m3609b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2545a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1426e j = C1426e.m3746j(this);
                if (i2 == -1) {
                    j.mo10915y();
                } else if (i2 == 0) {
                    j.mo10909f(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f2545a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f2545a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2545a = bundle.getInt("resolution");
        }
        if (this.f2545a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f2545a = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else {
                C1518c.m4095q().mo11049r(this, num.intValue(), 2, this);
                this.f2545a = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2545a);
        super.onSaveInstanceState(bundle);
    }
}
