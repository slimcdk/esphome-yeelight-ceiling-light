package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.c */
public final /* synthetic */ class C0250c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Consumer f97a;

    /* renamed from: b */
    public final /* synthetic */ Location f98b;

    public /* synthetic */ C0250c(Consumer consumer, Location location) {
        this.f97a = consumer;
        this.f98b = location;
    }

    public final void run() {
        this.f97a.accept(this.f98b);
    }
}
