package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C0778g;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @VisibleForTesting

    /* renamed from: a */
    protected int f510a = 0;

    @NonNull
    /* renamed from: a */
    public static Intent m636a(@NonNull Context context, @NonNull PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    private final void m637b() {
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
                this.f510a = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0778g.m817x(this).mo11958I(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f510a = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } else {
            C0721a.m617p().mo11778q(this, ((Integer) C0917i.m1419j(num)).intValue(), 2, this);
            this.f510a = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f510a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C0778g x = C0778g.m817x(this);
                if (i2 == -1) {
                    x.mo11959a();
                } else if (i2 == 0) {
                    x.mo11958I(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f510a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        this.f510a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f510a = bundle.getInt("resolution");
        }
        if (this.f510a != 1) {
            m637b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putInt("resolution", this.f510a);
        super.onSaveInstanceState(bundle);
    }
}
