package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.f */
public final /* synthetic */ class C0253f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f102a;

    public /* synthetic */ C0253f(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f102a = cancellableLocationListener;
    }

    public final void run() {
        this.f102a.lambda$startTimeout$0();
    }
}
