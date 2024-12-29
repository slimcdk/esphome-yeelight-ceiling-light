package p215u3;

import android.app.Activity;
import android.view.View;
import com.yeelight.yeelib.device.base.C3010c;

/* renamed from: u3.i */
public final /* synthetic */ class C10460i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10471l f19580a;

    /* renamed from: b */
    public final /* synthetic */ Activity f19581b;

    /* renamed from: c */
    public final /* synthetic */ C3010c f19582c;

    public /* synthetic */ C10460i(C10471l lVar, Activity activity, C3010c cVar) {
        this.f19580a = lVar;
        this.f19581b = activity;
        this.f19582c = cVar;
    }

    public final void onClick(View view) {
        this.f19580a.m26578u(this.f19581b, this.f19582c, view);
    }
}
