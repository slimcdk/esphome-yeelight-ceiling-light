package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.widget.C10526e;

/* renamed from: com.yeelight.cherry.ui.activity.l0 */
/* compiled from: lambda */
public final /* synthetic */ class C5736l0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FanclControlViewActivity f12015a;

    /* renamed from: b */
    public final /* synthetic */ C10526e f12016b;

    /* renamed from: c */
    public final /* synthetic */ C9849r f12017c;

    public /* synthetic */ C5736l0(FanclControlViewActivity fanclControlViewActivity, C10526e eVar, C9849r rVar) {
        this.f12015a = fanclControlViewActivity;
        this.f12016b = eVar;
        this.f12017c = rVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12015a.mo26438w0(this.f12016b, this.f12017c, dialogInterface, i);
    }
}
