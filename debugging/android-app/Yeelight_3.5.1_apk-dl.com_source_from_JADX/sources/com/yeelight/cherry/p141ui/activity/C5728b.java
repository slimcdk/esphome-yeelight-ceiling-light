package com.yeelight.cherry.p141ui.activity;

import android.view.MotionEvent;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.Node;
import com.google.p017ar.sceneform.p018ux.TransformableNode;

/* renamed from: com.yeelight.cherry.ui.activity.b */
public final /* synthetic */ class C5728b implements Node.OnTapListener {

    /* renamed from: a */
    public final /* synthetic */ ARCoreDemoActivity f11528a;

    /* renamed from: b */
    public final /* synthetic */ TransformableNode f11529b;

    public /* synthetic */ C5728b(ARCoreDemoActivity aRCoreDemoActivity, TransformableNode transformableNode) {
        this.f11528a = aRCoreDemoActivity;
        this.f11529b = transformableNode;
    }

    public final void onTap(HitTestResult hitTestResult, MotionEvent motionEvent) {
        this.f11528a.m15767h0(this.f11529b, hitTestResult, motionEvent);
    }
}
