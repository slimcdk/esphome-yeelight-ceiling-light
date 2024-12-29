package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* renamed from: androidx.core.location.q */
public final /* synthetic */ class C0264q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f127a;

    /* renamed from: b */
    public final /* synthetic */ List f128b;

    public /* synthetic */ C0264q(LocationManagerCompat.LocationListenerTransport locationListenerTransport, List list) {
        this.f127a = locationListenerTransport;
        this.f128b = list;
    }

    public final void run() {
        this.f127a.lambda$onLocationChanged$1(this.f128b);
    }
}
