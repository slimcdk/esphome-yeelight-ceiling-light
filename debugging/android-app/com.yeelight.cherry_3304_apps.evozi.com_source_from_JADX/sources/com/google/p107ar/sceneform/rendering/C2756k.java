package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.utilities.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.rendering.k */
/* compiled from: lambda */
public final /* synthetic */ class C2756k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ByteArrayInputStream f5306a;

    public /* synthetic */ C2756k(ByteArrayInputStream byteArrayInputStream) {
        this.f5306a = byteArrayInputStream;
    }

    public final Object call() {
        ByteArrayInputStream byteArrayInputStream = this.f5306a;
        InputStream unused = Preconditions.checkNotNull(byteArrayInputStream);
        return byteArrayInputStream;
    }
}
