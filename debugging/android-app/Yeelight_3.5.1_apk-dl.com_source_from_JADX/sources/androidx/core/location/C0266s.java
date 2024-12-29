package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.s */
public final /* synthetic */ class C0266s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f131a;

    /* renamed from: b */
    public final /* synthetic */ Executor f132b;

    public /* synthetic */ C0266s(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f131a = preRGnssStatusTransport;
        this.f132b = executor;
    }

    public final void run() {
        this.f131a.lambda$onStarted$0(this.f132b);
    }
}
