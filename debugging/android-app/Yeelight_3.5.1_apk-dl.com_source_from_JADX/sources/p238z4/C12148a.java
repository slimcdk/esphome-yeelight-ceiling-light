package p238z4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C9424q;
import kotlin.random.C9448a;
import org.jetbrains.annotations.NotNull;

/* renamed from: z4.a */
public final class C12148a extends C9448a {
    @NotNull
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C9424q.m22995d(current, "current()");
        return current;
    }

    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
