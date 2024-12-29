package com.yeelight.cherry.p141ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.x2 */
public final /* synthetic */ class C5853x2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PlugControlActivity f11690a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f11691b;

    /* renamed from: c */
    public final /* synthetic */ int f11692c;

    public /* synthetic */ C5853x2(PlugControlActivity plugControlActivity, ImageView imageView, int i) {
        this.f11690a = plugControlActivity;
        this.f11691b = imageView;
        this.f11692c = i;
    }

    public final void run() {
        this.f11690a.m16855w0(this.f11691b, this.f11692c);
    }
}
