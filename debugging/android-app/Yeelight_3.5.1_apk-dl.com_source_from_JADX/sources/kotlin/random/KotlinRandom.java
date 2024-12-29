package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

final class KotlinRandom extends Random {
    @NotNull
    private static final C9445a Companion = new C9445a((C9422o) null);
    @Deprecated
    private static final long serialVersionUID = 0;
    @NotNull
    private final Random impl;
    private boolean seedInitialized;

    /* renamed from: kotlin.random.KotlinRandom$a */
    private static final class C9445a {
        private C9445a() {
        }

        public /* synthetic */ C9445a(C9422o oVar) {
            this();
        }
    }

    public KotlinRandom(@NotNull Random random) {
        C9424q.m22996e(random, "impl");
        this.impl = random;
    }

    @NotNull
    public final Random getImpl() {
        return this.impl;
    }

    /* access modifiers changed from: protected */
    public int next(int i) {
        return this.impl.nextBits(i);
    }

    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    public void nextBytes(@NotNull byte[] bArr) {
        C9424q.m22996e(bArr, "bytes");
        this.impl.nextBytes(bArr);
    }

    public double nextDouble() {
        return this.impl.nextDouble();
    }

    public float nextFloat() {
        return this.impl.nextFloat();
    }

    public int nextInt() {
        return this.impl.nextInt();
    }

    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }

    public long nextLong() {
        return this.impl.nextLong();
    }

    public void setSeed(long j) {
        if (!this.seedInitialized) {
            this.seedInitialized = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }
}
