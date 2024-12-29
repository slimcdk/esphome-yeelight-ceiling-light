package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.i */
public final /* synthetic */ class C0256i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f107a;

    /* renamed from: b */
    public final /* synthetic */ Executor f108b;

    public /* synthetic */ C0256i(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f107a = gpsStatusTransport;
        this.f108b = executor;
    }

    public final void run() {
        this.f107a.lambda$onGpsStatusChanged$1(this.f108b);
    }
}
