package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.l */
public final /* synthetic */ class C0259l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f115a;

    /* renamed from: b */
    public final /* synthetic */ int f116b;

    public /* synthetic */ C0259l(LocationManagerCompat.LocationListenerTransport locationListenerTransport, int i) {
        this.f115a = locationListenerTransport;
        this.f116b = i;
    }

    public final void run() {
        this.f115a.lambda$onFlushComplete$2(this.f116b);
    }
}
