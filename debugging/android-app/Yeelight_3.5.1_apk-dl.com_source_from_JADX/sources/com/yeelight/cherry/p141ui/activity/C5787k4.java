package com.yeelight.cherry.p141ui.activity;

import com.google.android.material.tabs.TabLayout;

/* renamed from: com.yeelight.cherry.ui.activity.k4 */
public final /* synthetic */ class C5787k4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TabLayout f11609a;

    /* renamed from: b */
    public final /* synthetic */ int f11610b;

    public /* synthetic */ C5787k4(TabLayout tabLayout, int i) {
        this.f11609a = tabLayout;
        this.f11610b = i;
    }

    public final void run() {
        SwitchControlActivity.m17152z0(this.f11609a, this.f11610b);
    }
}
