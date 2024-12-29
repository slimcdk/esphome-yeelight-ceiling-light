package com.yeelight.yeelib.p142ui.activity;

import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import p170i4.C9107b;

/* renamed from: com.yeelight.yeelib.ui.activity.l */
public final /* synthetic */ class C8727l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeviceOfflinePromptActivity.C8420c.C8421a f15444a;

    /* renamed from: b */
    public final /* synthetic */ C9107b.C9109b f15445b;

    /* renamed from: c */
    public final /* synthetic */ String f15446c;

    public /* synthetic */ C8727l(DeviceOfflinePromptActivity.C8420c.C8421a aVar, C9107b.C9109b bVar, String str) {
        this.f15444a = aVar;
        this.f15445b = bVar;
        this.f15446c = str;
    }

    public final void run() {
        this.f15444a.m20058b(this.f15445b, this.f15446c);
    }
}
