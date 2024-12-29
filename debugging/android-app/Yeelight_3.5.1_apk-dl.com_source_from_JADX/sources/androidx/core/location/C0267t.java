package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.t */
public final /* synthetic */ class C0267t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f133a;

    /* renamed from: b */
    public final /* synthetic */ Executor f134b;

    /* renamed from: c */
    public final /* synthetic */ int f135c;

    public /* synthetic */ C0267t(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f133a = preRGnssStatusTransport;
        this.f134b = executor;
        this.f135c = i;
    }

    public final void run() {
        this.f133a.lambda$onFirstFix$2(this.f134b, this.f135c);
    }
}
