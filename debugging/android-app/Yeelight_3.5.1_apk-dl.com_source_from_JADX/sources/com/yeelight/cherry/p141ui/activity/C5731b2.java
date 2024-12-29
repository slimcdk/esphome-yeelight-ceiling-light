package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.yeelight.cherry.ui.activity.b2 */
public final /* synthetic */ class C5731b2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MiBandSearchActivity f11533a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f11534b;

    /* renamed from: c */
    public final /* synthetic */ int f11535c;

    public /* synthetic */ C5731b2(MiBandSearchActivity miBandSearchActivity, AlertDialog alertDialog, int i) {
        this.f11533a = miBandSearchActivity;
        this.f11534b = alertDialog;
        this.f11535c = i;
    }

    public final void onClick(View view) {
        this.f11533a.m16661D0(this.f11534b, this.f11535c, view);
    }
}
