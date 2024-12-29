package com.google.p017ar.sceneform.utilities;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.google.ar.sceneform.utilities.b */
final /* synthetic */ class C2170b implements Callable {

    /* renamed from: a */
    private final Context f3457a;

    /* renamed from: b */
    private final Uri f3458b;

    C2170b(Context context, Uri uri) {
        this.f3457a = context;
        this.f3458b = uri;
    }

    public final Object call() {
        return this.f3457a.getContentResolver().openInputStream(this.f3458b);
    }
}
