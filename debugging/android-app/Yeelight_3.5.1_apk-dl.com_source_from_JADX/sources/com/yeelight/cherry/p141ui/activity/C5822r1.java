package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.yeelight.cherry.ui.activity.r1 */
public final /* synthetic */ class C5822r1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MeshDeviceFirmwareUpgradeActivity f11651a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f11652b;

    /* renamed from: c */
    public final /* synthetic */ int f11653c;

    public /* synthetic */ C5822r1(MeshDeviceFirmwareUpgradeActivity meshDeviceFirmwareUpgradeActivity, AlertDialog alertDialog, int i) {
        this.f11651a = meshDeviceFirmwareUpgradeActivity;
        this.f11652b = alertDialog;
        this.f11653c = i;
    }

    public final void onClick(View view) {
        this.f11651a.m16563w0(this.f11652b, this.f11653c, view);
    }
}
