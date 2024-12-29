package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.schemas.sceneform.LightingDef;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.e */
/* compiled from: lambda */
public final /* synthetic */ class C2744e implements Function {

    /* renamed from: a */
    public final /* synthetic */ LightProbe f5291a;

    public /* synthetic */ C2744e(LightProbe lightProbe) {
        this.f5291a = lightProbe;
    }

    public final Object apply(Object obj) {
        return this.f5291a.buildFilamentResource((LightingDef) obj);
    }
}
