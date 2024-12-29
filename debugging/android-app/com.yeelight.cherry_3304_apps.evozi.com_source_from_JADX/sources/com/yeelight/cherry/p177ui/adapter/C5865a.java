package com.yeelight.cherry.p177ui.adapter;

import android.view.View;
import com.yeelight.cherry.p174b.p175a.C4960c;
import com.yeelight.cherry.p177ui.adapter.AutoSearchAdapter;

/* renamed from: com.yeelight.cherry.ui.adapter.a */
/* compiled from: lambda */
public final /* synthetic */ class C5865a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoSearchAdapter f12355a;

    /* renamed from: b */
    public final /* synthetic */ AutoSearchAdapter.DeviceViewHolder f12356b;

    /* renamed from: c */
    public final /* synthetic */ C4960c f12357c;

    public /* synthetic */ C5865a(AutoSearchAdapter autoSearchAdapter, AutoSearchAdapter.DeviceViewHolder deviceViewHolder, C4960c cVar) {
        this.f12355a = autoSearchAdapter;
        this.f12356b = deviceViewHolder;
        this.f12357c = cVar;
    }

    public final void onClick(View view) {
        this.f12355a.mo27133c(this.f12356b, this.f12357c, view);
    }
}
