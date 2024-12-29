package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.schemas.sceneform.LightingDef;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.i */
public final /* synthetic */ class C2137i implements Function {

    /* renamed from: a */
    public final /* synthetic */ LightProbe f3387a;

    public /* synthetic */ C2137i(LightProbe lightProbe) {
        this.f3387a = lightProbe;
    }

    public final Object apply(Object obj) {
        return this.f3387a.buildFilamentResource((LightingDef) obj);
    }
}
