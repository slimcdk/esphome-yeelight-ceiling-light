package com.yeelight.cherry.p141ui.activity;

import android.view.MotionEvent;
import com.google.p017ar.core.HitResult;
import com.google.p017ar.core.Plane;
import com.google.p017ar.sceneform.p018ux.BaseArFragment;

/* renamed from: com.yeelight.cherry.ui.activity.c */
public final /* synthetic */ class C5734c implements BaseArFragment.OnTapArPlaneListener {

    /* renamed from: a */
    public final /* synthetic */ ARCoreDemoActivity f11538a;

    public /* synthetic */ C5734c(ARCoreDemoActivity aRCoreDemoActivity) {
        this.f11538a = aRCoreDemoActivity;
    }

    public final void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
        this.f11538a.m15768i0(hitResult, plane, motionEvent);
    }
}
