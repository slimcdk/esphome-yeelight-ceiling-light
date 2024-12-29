package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.utilities.Preconditions;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.rendering.j */
public final /* synthetic */ class C2139j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ByteArrayInputStream f3389a;

    public /* synthetic */ C2139j(ByteArrayInputStream byteArrayInputStream) {
        this.f3389a = byteArrayInputStream;
    }

    public final Object call() {
        return Preconditions.checkNotNull(this.f3389a);
    }
}
