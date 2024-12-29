package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
public final class C1416b1 extends BroadcastReceiver {

    /* renamed from: a */
    private Context f2620a;

    /* renamed from: b */
    private final C1420c1 f2621b;

    public C1416b1(C1420c1 c1Var) {
        this.f2621b = c1Var;
    }

    /* renamed from: a */
    public final synchronized void mo10884a() {
        if (this.f2620a != null) {
            this.f2620a.unregisterReceiver(this);
        }
        this.f2620a = null;
    }

    /* renamed from: b */
    public final void mo10885b(Context context) {
        this.f2620a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2621b.mo10895a();
            mo10884a();
        }
    }
}
