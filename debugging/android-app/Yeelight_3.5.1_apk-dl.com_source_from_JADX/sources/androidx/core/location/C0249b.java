package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import androidx.core.p007os.CancellationSignal;

/* renamed from: androidx.core.location.b */
public final /* synthetic */ class C0249b implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f96a;

    public /* synthetic */ C0249b(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f96a = cancellableLocationListener;
    }

    public final void onCancel() {
        this.f96a.cancel();
    }
}
