package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.device.base.C3010c;

/* renamed from: u3.z */
public final /* synthetic */ class C10529z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10420a0 f19693a;

    /* renamed from: b */
    public final /* synthetic */ Activity f19694b;

    /* renamed from: c */
    public final /* synthetic */ C3010c f19695c;

    public /* synthetic */ C10529z(C10420a0 a0Var, Activity activity, C3010c cVar) {
        this.f19693a = a0Var;
        this.f19694b = activity;
        this.f19695c = cVar;
    }

    public final void onClick(View view) {
        this.f19693a.m26442r(this.f19694b, this.f19695c, view);
    }
}
