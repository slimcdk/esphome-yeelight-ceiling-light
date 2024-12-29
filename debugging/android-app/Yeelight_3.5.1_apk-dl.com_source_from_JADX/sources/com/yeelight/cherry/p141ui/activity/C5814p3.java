package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.yeelight.cherry.ui.activity.p3 */
public final /* synthetic */ class C5814p3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchDeviceAutoActivity f11640a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f11641b;

    /* renamed from: c */
    public final /* synthetic */ int f11642c;

    public /* synthetic */ C5814p3(SearchDeviceAutoActivity searchDeviceAutoActivity, AlertDialog alertDialog, int i) {
        this.f11640a = searchDeviceAutoActivity;
        this.f11641b = alertDialog;
        this.f11642c = i;
    }

    public final void onClick(View view) {
        this.f11640a.m17050s0(this.f11641b, this.f11642c, view);
    }
}
