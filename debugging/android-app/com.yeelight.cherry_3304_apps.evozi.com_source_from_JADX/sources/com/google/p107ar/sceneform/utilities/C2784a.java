package com.google.p107ar.sceneform.utilities;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.a */
final /* synthetic */ class C2784a implements Callable {

    /* renamed from: a */
    private final Context f5380a;

    /* renamed from: b */
    private final int f5381b;

    C2784a(Context context, int i) {
        this.f5380a = context;
        this.f5381b = i;
    }

    public final Object call() {
        return this.f5380a.getResources().openRawResource(this.f5381b);
    }
}
