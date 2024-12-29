package com.google.p017ar.sceneform.utilities;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.a */
final /* synthetic */ class C2169a implements Callable {

    /* renamed from: a */
    private final Context f3455a;

    /* renamed from: b */
    private final int f3456b;

    C2169a(Context context, int i) {
        this.f3455a = context;
        this.f3456b = i;
    }

    public final Object call() {
        return this.f3455a.getResources().openRawResource(this.f3456b);
    }
}
