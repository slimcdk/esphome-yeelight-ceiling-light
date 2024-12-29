package com.yeelight.cherry.p141ui.activity;

import com.yeelight.yeelib.device.base.DeviceStatusBase;

/* renamed from: com.yeelight.cherry.ui.activity.d2 */
public final /* synthetic */ class C5743d2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MiBandSearchActivity f11553a;

    /* renamed from: b */
    public final /* synthetic */ int f11554b;

    /* renamed from: c */
    public final /* synthetic */ DeviceStatusBase f11555c;

    public /* synthetic */ C5743d2(MiBandSearchActivity miBandSearchActivity, int i, DeviceStatusBase deviceStatusBase) {
        this.f11553a = miBandSearchActivity;
        this.f11554b = i;
        this.f11555c = deviceStatusBase;
    }

    public final void run() {
        this.f11553a.m16658A0(this.f11554b, this.f11555c);
    }
}
