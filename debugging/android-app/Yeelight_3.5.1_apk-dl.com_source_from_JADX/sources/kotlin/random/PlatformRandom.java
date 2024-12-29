package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

final class PlatformRandom extends C9448a implements Serializable {
    @NotNull
    private static final C9446a Companion = new C9446a((C9422o) null);
    @Deprecated
    private static final long serialVersionUID = 0;
    @NotNull
    private final Random impl;

    /* renamed from: kotlin.random.PlatformRandom$a */
    private static final class C9446a {
        private C9446a() {
        }

        public /* synthetic */ C9446a(C9422o oVar) {
            this();
        }
    }

    public PlatformRandom(@NotNull Random random) {
        C9424q.m22996e(random, "impl");
        this.impl = random;
    }

    @NotNull
    public Random getImpl() {
        return this.impl;
    }
}
