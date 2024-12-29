package com.yeelight.cherry.p177ui.activity;

import android.view.MotionEvent;
import com.google.p107ar.core.HitResult;
import com.google.p107ar.core.Plane;
import com.google.p107ar.sceneform.p108ux.BaseArFragment;

/* renamed from: com.yeelight.cherry.ui.activity.f */
/* compiled from: lambda */
public final /* synthetic */ class C5705f implements BaseArFragment.OnTapArPlaneListener {

    /* renamed from: a */
    public final /* synthetic */ ARCoreDemoActivity f11976a;

    public /* synthetic */ C5705f(ARCoreDemoActivity aRCoreDemoActivity) {
        this.f11976a = aRCoreDemoActivity;
    }

    public final void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
        this.f11976a.mo26071b0(hitResult, plane, motionEvent);
    }
}
