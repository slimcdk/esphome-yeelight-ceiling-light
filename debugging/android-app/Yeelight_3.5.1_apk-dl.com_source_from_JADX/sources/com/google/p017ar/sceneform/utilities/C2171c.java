package com.google.p017ar.sceneform.utilities;

import android.content.res.AssetManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.c */
final /* synthetic */ class C2171c implements Callable {

    /* renamed from: a */
    private final AssetManager f3459a;

    /* renamed from: b */
    private final String f3460b;

    /* renamed from: c */
    private final String f3461c;

    C2171c(AssetManager assetManager, String str, String str2) {
        this.f3459a = assetManager;
        this.f3460b = str;
        this.f3461c = str2;
    }

    public final Object call() {
        return LoadHelper.lambda$fileUriToInputStreamCreator$1$LoadHelper(this.f3459a, this.f3460b, this.f3461c);
    }
}
