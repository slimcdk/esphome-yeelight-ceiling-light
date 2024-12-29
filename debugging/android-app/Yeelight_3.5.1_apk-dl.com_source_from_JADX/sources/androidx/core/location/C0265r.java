package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.r */
public final /* synthetic */ class C0265r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f129a;

    /* renamed from: b */
    public final /* synthetic */ Executor f130b;

    public /* synthetic */ C0265r(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f129a = preRGnssStatusTransport;
        this.f130b = executor;
    }

    public final void run() {
        this.f129a.lambda$onStopped$1(this.f130b);
    }
}
