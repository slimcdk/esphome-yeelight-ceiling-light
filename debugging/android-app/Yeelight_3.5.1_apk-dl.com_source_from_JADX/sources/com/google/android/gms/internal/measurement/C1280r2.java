package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
final class C1280r2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C1296s2 f1569a;

    C1280r2(C1296s2 s2Var) {
        this.f1569a = s2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f1569a.m2739k(new C1152j2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f1569a.m2739k(new C1264q2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f1569a.m2739k(new C1200m2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f1569a.m2739k(new C1184l2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1007a1 a1Var = new C1007a1();
        this.f1569a.m2739k(new C1248p2(this, activity, a1Var));
        Bundle e = a1Var.mo12513e(50);
        if (e != null) {
            bundle.putAll(e);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f1569a.m2739k(new C1168k2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f1569a.m2739k(new C1232o2(this, activity));
    }
}
