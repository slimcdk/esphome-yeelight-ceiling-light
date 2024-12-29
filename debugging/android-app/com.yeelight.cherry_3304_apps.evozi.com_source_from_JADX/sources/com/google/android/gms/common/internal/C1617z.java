package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.z */
final class C1617z extends C1570g {

    /* renamed from: a */
    private final /* synthetic */ Intent f3089a;

    /* renamed from: b */
    private final /* synthetic */ Activity f3090b;

    /* renamed from: c */
    private final /* synthetic */ int f3091c;

    C1617z(Intent intent, Activity activity, int i) {
        this.f3089a = intent;
        this.f3090b = activity;
        this.f3091c = i;
    }

    /* renamed from: b */
    public final void mo11212b() {
        Intent intent = this.f3089a;
        if (intent != null) {
            this.f3090b.startActivityForResult(intent, this.f3091c);
        }
    }
}
