package com.google.p107ar.sceneform.utilities;

import android.content.res.AssetManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.c */
final /* synthetic */ class C2786c implements Callable {

    /* renamed from: a */
    private final AssetManager f5384a;

    /* renamed from: b */
    private final String f5385b;

    /* renamed from: c */
    private final String f5386c;

    C2786c(AssetManager assetManager, String str, String str2) {
        this.f5384a = assetManager;
        this.f5385b = str;
        this.f5386c = str2;
    }

    public final Object call() {
        return LoadHelper.lambda$fileUriToInputStreamCreator$1$LoadHelper(this.f5384a, this.f5385b, this.f5386c);
    }
}
