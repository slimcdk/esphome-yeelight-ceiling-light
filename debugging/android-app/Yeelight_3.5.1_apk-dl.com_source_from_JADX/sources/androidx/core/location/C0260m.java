package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.m */
public final /* synthetic */ class C0260m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f117a;

    /* renamed from: b */
    public final /* synthetic */ Location f118b;

    public /* synthetic */ C0260m(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Location location) {
        this.f117a = locationListenerTransport;
        this.f118b = location;
    }

    public final void run() {
        this.f117a.lambda$onLocationChanged$0(this.f118b);
    }
}
