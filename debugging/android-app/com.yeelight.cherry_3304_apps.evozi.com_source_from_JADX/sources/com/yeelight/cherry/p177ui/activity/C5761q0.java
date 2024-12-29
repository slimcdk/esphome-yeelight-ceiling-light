package com.yeelight.cherry.p177ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C5761q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f12047a;

    /* renamed from: b */
    public final /* synthetic */ boolean f12048b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f12049c;

    public /* synthetic */ C5761q0(FanclControlViewActivity fanclControlViewActivity, boolean z, ImageView imageView) {
        this.f12047a = fanclControlViewActivity;
        this.f12048b = z;
        this.f12049c = imageView;
    }

    public final void run() {
        this.f12047a.mo26432p0(this.f12048b, this.f12049c);
    }
}
