package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.p */
public final /* synthetic */ class C0263p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f123a;

    /* renamed from: b */
    public final /* synthetic */ String f124b;

    /* renamed from: c */
    public final /* synthetic */ int f125c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f126d;

    public /* synthetic */ C0263p(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i, Bundle bundle) {
        this.f123a = locationListenerTransport;
        this.f124b = str;
        this.f125c = i;
        this.f126d = bundle;
    }

    public final void run() {
        this.f123a.lambda$onStatusChanged$3(this.f124b, this.f125c, this.f126d);
    }
}
