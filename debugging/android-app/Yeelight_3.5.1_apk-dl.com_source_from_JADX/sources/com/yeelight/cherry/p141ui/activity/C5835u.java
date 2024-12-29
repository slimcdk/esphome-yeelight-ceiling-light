package com.yeelight.cherry.p141ui.activity;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.yeelight.cherry.ui.activity.u */
public final /* synthetic */ class C5835u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ BluetoothDeviceUpgradeActivity f11668a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f11669b;

    /* renamed from: c */
    public final /* synthetic */ int f11670c;

    public /* synthetic */ C5835u(BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity, AlertDialog alertDialog, int i) {
        this.f11668a = bluetoothDeviceUpgradeActivity;
        this.f11669b = alertDialog;
        this.f11670c = i;
    }

    public final void onClick(View view) {
        this.f11668a.m15924s0(this.f11669b, this.f11670c, view);
    }
}
