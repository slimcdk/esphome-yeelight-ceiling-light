package com.yeelight.cherry.p141ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.c1 */
public final /* synthetic */ class C5736c1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f11540a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f11541b;

    /* renamed from: c */
    public final /* synthetic */ int f11542c;

    public /* synthetic */ C5736c1(FanclControlViewActivity fanclControlViewActivity, ImageView imageView, int i) {
        this.f11540a = fanclControlViewActivity;
        this.f11541b = imageView;
        this.f11542c = i;
    }

    public final void run() {
        this.f11540a.m16243I0(this.f11541b, this.f11542c);
    }
}
