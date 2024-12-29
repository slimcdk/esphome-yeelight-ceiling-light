package com.google.p017ar.sceneform.p018ux;

import com.google.p017ar.sceneform.rendering.ModelRenderable;
import java.util.function.Consumer;

/* renamed from: com.google.ar.sceneform.ux.d */
public final /* synthetic */ class C2184d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ FootprintSelectionVisualizer f3472a;

    public /* synthetic */ C2184d(FootprintSelectionVisualizer footprintSelectionVisualizer) {
        this.f3472a = footprintSelectionVisualizer;
    }

    public final void accept(Object obj) {
        BaseArFragment.lambda$setupSelectionRenderable$1(this.f3472a, (ModelRenderable) obj);
    }
}
