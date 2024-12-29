package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.location.d */
public final /* synthetic */ class C0251d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ LocationManager f99a;

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f100b;

    public /* synthetic */ C0251d(LocationManager locationManager, LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f99a = locationManager;
        this.f100b = gpsStatusTransport;
    }

    public final Object call() {
        return Boolean.valueOf(this.f99a.addGpsStatusListener(this.f100b));
    }
}
