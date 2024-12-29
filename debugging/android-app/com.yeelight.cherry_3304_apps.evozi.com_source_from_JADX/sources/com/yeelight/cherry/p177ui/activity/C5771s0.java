package com.yeelight.cherry.p177ui.activity;

import android.widget.ImageView;

/* renamed from: com.yeelight.cherry.ui.activity.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C5771s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f12062a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f12063b;

    /* renamed from: c */
    public final /* synthetic */ int f12064c;

    public /* synthetic */ C5771s0(FanclControlViewActivity fanclControlViewActivity, ImageView imageView, int i) {
        this.f12062a = fanclControlViewActivity;
        this.f12063b = imageView;
        this.f12064c = i;
    }

    public final void run() {
        this.f12062a.mo26440y0(this.f12063b, this.f12064c);
    }
}
