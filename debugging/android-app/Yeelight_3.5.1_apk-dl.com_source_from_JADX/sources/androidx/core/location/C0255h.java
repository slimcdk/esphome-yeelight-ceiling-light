package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.h */
public final /* synthetic */ class C0255h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f105a;

    /* renamed from: b */
    public final /* synthetic */ Executor f106b;

    public /* synthetic */ C0255h(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f105a = gpsStatusTransport;
        this.f106b = executor;
    }

    public final void run() {
        this.f105a.lambda$onGpsStatusChanged$0(this.f106b);
    }
}
