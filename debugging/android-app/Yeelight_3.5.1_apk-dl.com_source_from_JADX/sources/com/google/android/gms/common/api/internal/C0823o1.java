package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.api.internal.o1 */
public final class C0823o1 extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    Context f727a;

    /* renamed from: b */
    private final C0817n1 f728b;

    public C0823o1(C0817n1 n1Var) {
        this.f728b = n1Var;
    }

    /* renamed from: a */
    public final void mo12052a(Context context) {
        this.f727a = context;
    }

    /* renamed from: b */
    public final synchronized void mo12053b() {
        Context context = this.f727a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f727a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f728b.mo11902a();
            mo12053b();
        }
    }
}
