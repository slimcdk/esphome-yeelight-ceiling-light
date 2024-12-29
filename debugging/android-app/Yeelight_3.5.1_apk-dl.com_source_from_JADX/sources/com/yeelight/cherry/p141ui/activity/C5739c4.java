package com.yeelight.cherry.p141ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.c4 */
public final /* synthetic */ class C5739c4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SwitchControlActivity f11545a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f11546b;

    /* renamed from: c */
    public final /* synthetic */ int f11547c;

    public /* synthetic */ C5739c4(SwitchControlActivity switchControlActivity, ImageView imageView, int i) {
        this.f11545a = switchControlActivity;
        this.f11546b = imageView;
        this.f11547c = i;
    }

    public final void run() {
        this.f11545a.m17118A0(this.f11546b, this.f11547c);
    }
}
