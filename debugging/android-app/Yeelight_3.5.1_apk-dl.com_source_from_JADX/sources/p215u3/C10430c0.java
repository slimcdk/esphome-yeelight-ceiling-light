package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.device.base.C3010c;

/* renamed from: u3.c0 */
public final /* synthetic */ class C10430c0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10436d0 f19536a;

    /* renamed from: b */
    public final /* synthetic */ Activity f19537b;

    /* renamed from: c */
    public final /* synthetic */ C3010c f19538c;

    public /* synthetic */ C10430c0(C10436d0 d0Var, Activity activity, C3010c cVar) {
        this.f19536a = d0Var;
        this.f19537b = activity;
        this.f19538c = cVar;
    }

    public final void onClick(View view) {
        this.f19536a.m26486r(this.f19537b, this.f19538c, view);
    }
}
