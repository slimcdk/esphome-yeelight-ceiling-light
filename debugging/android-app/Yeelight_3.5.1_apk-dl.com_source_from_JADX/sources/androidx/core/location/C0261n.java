package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.n */
public final /* synthetic */ class C0261n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f119a;

    /* renamed from: b */
    public final /* synthetic */ String f120b;

    public /* synthetic */ C0261n(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f119a = locationListenerTransport;
        this.f120b = str;
    }

    public final void run() {
        this.f119a.lambda$onProviderEnabled$4(this.f120b);
    }
}
