package p190o3;

import android.view.View;
import com.yeelight.cherry.p141ui.adapter.AutoSearchAdapter;
import p197p3.C10267c;

/* renamed from: o3.a */
public final /* synthetic */ class C9775a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoSearchAdapter f17628a;

    /* renamed from: b */
    public final /* synthetic */ AutoSearchAdapter.DeviceViewHolder f17629b;

    /* renamed from: c */
    public final /* synthetic */ C10267c f17630c;

    public /* synthetic */ C9775a(AutoSearchAdapter autoSearchAdapter, AutoSearchAdapter.DeviceViewHolder deviceViewHolder, C10267c cVar) {
        this.f17628a = autoSearchAdapter;
        this.f17629b = deviceViewHolder;
        this.f17630c = cVar;
    }

    public final void onClick(View view) {
        this.f17628a.m17205d(this.f17629b, this.f17630c, view);
    }
}
