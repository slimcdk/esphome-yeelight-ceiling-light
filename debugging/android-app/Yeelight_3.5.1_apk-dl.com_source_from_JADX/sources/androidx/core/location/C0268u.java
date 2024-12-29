package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.u */
public final /* synthetic */ class C0268u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f136a;

    /* renamed from: b */
    public final /* synthetic */ Executor f137b;

    /* renamed from: c */
    public final /* synthetic */ GnssStatus f138c;

    public /* synthetic */ C0268u(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
        this.f136a = preRGnssStatusTransport;
        this.f137b = executor;
        this.f138c = gnssStatus;
    }

    public final void run() {
        this.f136a.lambda$onSatelliteStatusChanged$3(this.f137b, this.f138c);
    }
}
