package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import com.yeelight.yeelib.models.C8321m;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.v0 */
public final /* synthetic */ class C5841v0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f11676a;

    /* renamed from: b */
    public final /* synthetic */ C9113d f11677b;

    /* renamed from: c */
    public final /* synthetic */ C8321m f11678c;

    public /* synthetic */ C5841v0(FanclControlViewActivity fanclControlViewActivity, C9113d dVar, C8321m mVar) {
        this.f11676a = fanclControlViewActivity;
        this.f11677b = dVar;
        this.f11678c = mVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11676a.m16241G0(this.f11677b, this.f11678c, dialogInterface, i);
    }
}
