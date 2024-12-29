package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.j */
public final /* synthetic */ class C0257j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f109a;

    /* renamed from: b */
    public final /* synthetic */ Executor f110b;

    /* renamed from: c */
    public final /* synthetic */ int f111c;

    public /* synthetic */ C0257j(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, int i) {
        this.f109a = gpsStatusTransport;
        this.f110b = executor;
        this.f111c = i;
    }

    public final void run() {
        this.f109a.lambda$onGpsStatusChanged$2(this.f110b, this.f111c);
    }
}
