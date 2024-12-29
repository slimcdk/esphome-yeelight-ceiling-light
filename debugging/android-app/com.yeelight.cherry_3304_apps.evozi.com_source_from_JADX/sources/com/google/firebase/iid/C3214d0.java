package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting
/* renamed from: com.google.firebase.iid.d0 */
final class C3214d0 extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C3217e0 f6217a;

    public C3214d0(C3217e0 e0Var) {
        this.f6217a = e0Var;
    }

    /* renamed from: a */
    public final void mo17812a() {
        boolean v = FirebaseInstanceId.m10002v();
        this.f6217a.mo17817b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C3217e0 e0Var = this.f6217a;
        if (e0Var != null && e0Var.mo17818c()) {
            boolean v = FirebaseInstanceId.m10002v();
            FirebaseInstanceId.m9998n(this.f6217a, 0);
            this.f6217a.mo17817b().unregisterReceiver(this);
            this.f6217a = null;
        }
    }
}
