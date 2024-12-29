package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.device.base.C3010c;

/* renamed from: u3.r0 */
public final /* synthetic */ class C10498r0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10503s0 f19643a;

    /* renamed from: b */
    public final /* synthetic */ Activity f19644b;

    /* renamed from: c */
    public final /* synthetic */ C3010c f19645c;

    public /* synthetic */ C10498r0(C10503s0 s0Var, Activity activity, C3010c cVar) {
        this.f19643a = s0Var;
        this.f19644b = activity;
        this.f19645c = cVar;
    }

    public final void onClick(View view) {
        this.f19643a.m26662r(this.f19644b, this.f19645c, view);
    }
}
