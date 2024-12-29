package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.k */
public final /* synthetic */ class C0258k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f112a;

    /* renamed from: b */
    public final /* synthetic */ Executor f113b;

    /* renamed from: c */
    public final /* synthetic */ GnssStatusCompat f114c;

    public /* synthetic */ C0258k(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
        this.f112a = gpsStatusTransport;
        this.f113b = executor;
        this.f114c = gnssStatusCompat;
    }

    public final void run() {
        this.f112a.lambda$onGpsStatusChanged$3(this.f113b, this.f114c);
    }
}
