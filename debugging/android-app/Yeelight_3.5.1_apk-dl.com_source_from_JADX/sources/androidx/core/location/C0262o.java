package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.o */
public final /* synthetic */ class C0262o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f121a;

    /* renamed from: b */
    public final /* synthetic */ String f122b;

    public /* synthetic */ C0262o(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f121a = locationListenerTransport;
        this.f122b = str;
    }

    public final void run() {
        this.f121a.lambda$onProviderDisabled$5(this.f122b);
    }
}
