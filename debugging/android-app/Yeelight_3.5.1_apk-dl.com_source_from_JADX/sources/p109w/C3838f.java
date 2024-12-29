package p109w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* renamed from: w.f */
public final class C3838f {
    @Nullable

    /* renamed from: b */
    private static C3838f f6454b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f6455c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @Nullable

    /* renamed from: a */
    private RootTelemetryConfiguration f6456a;

    private C3838f() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static synchronized C3838f m10936b() {
        C3838f fVar;
        synchronized (C3838f.class) {
            if (f6454b == null) {
                f6454b = new C3838f();
            }
            fVar = f6454b;
        }
        return fVar;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public RootTelemetryConfiguration mo26308a() {
        return this.f6456a;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final synchronized void mo26309c(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f6456a = f6455c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f6456a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.mo12182f0() < rootTelemetryConfiguration.mo12182f0()) {
            this.f6456a = rootTelemetryConfiguration;
        }
    }
}
