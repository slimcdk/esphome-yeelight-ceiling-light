package androidx.core.location;

import android.location.Location;
import java.util.function.Consumer;

/* renamed from: androidx.core.location.e */
public final /* synthetic */ class C0252e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ androidx.core.util.Consumer f101a;

    public /* synthetic */ C0252e(androidx.core.util.Consumer consumer) {
        this.f101a = consumer;
    }

    public final void accept(Object obj) {
        this.f101a.accept((Location) obj);
    }
}
