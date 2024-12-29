package com.google.p107ar.sceneform.utilities;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.b */
final /* synthetic */ class C2785b implements Callable {

    /* renamed from: a */
    private final Context f5382a;

    /* renamed from: b */
    private final Uri f5383b;

    C2785b(Context context, Uri uri) {
        this.f5382a = context;
        this.f5383b = uri;
    }

    public final Object call() {
        return this.f5382a.getContentResolver().openInputStream(this.f5383b);
    }
}
