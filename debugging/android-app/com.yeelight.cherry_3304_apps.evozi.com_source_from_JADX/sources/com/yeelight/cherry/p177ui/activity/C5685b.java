package com.yeelight.cherry.p177ui.activity;

import android.view.MotionEvent;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.p108ux.TransformableNode;

/* renamed from: com.yeelight.cherry.ui.activity.b */
/* compiled from: lambda */
public final /* synthetic */ class C5685b implements Node.OnTapListener {

    /* renamed from: a */
    public final /* synthetic */ ARCoreDemoActivity f11951a;

    /* renamed from: b */
    public final /* synthetic */ TransformableNode f11952b;

    public /* synthetic */ C5685b(ARCoreDemoActivity aRCoreDemoActivity, TransformableNode transformableNode) {
        this.f11951a = aRCoreDemoActivity;
        this.f11952b = transformableNode;
    }

    public final void onTap(HitTestResult hitTestResult, MotionEvent motionEvent) {
        this.f11951a.mo26066W(this.f11952b, hitTestResult, motionEvent);
    }
}
