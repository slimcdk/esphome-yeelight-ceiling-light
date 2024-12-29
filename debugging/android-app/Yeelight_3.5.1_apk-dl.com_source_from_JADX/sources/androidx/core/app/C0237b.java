package androidx.core.app;

import android.app.SharedElementCallback;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;

/* renamed from: androidx.core.app.b */
public final /* synthetic */ class C0237b implements SharedElementCallback.OnSharedElementsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f83a;

    public /* synthetic */ C0237b(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f83a = onSharedElementsReadyListener;
    }

    public final void onSharedElementsReady() {
        ActivityCompat.Api23Impl.onSharedElementsReady(this.f83a);
    }
}
