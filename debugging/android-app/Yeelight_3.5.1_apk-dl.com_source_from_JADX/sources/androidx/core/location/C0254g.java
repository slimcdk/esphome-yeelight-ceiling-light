package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.g */
public final /* synthetic */ class C0254g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Consumer f103a;

    /* renamed from: b */
    public final /* synthetic */ Location f104b;

    public /* synthetic */ C0254g(Consumer consumer, Location location) {
        this.f103a = consumer;
        this.f104b = location;
    }

    public final void run() {
        this.f103a.accept(this.f104b);
    }
}
