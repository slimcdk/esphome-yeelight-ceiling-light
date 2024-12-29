package com.yeelight.cherry.p141ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.d1 */
public final /* synthetic */ class C5742d1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f11550a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11551b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f11552c;

    public /* synthetic */ C5742d1(FanclControlViewActivity fanclControlViewActivity, boolean z, ImageView imageView) {
        this.f11550a = fanclControlViewActivity;
        this.f11551b = z;
        this.f11552c = imageView;
    }

    public final void run() {
        this.f11550a.m16284z0(this.f11551b, this.f11552c);
    }
}
