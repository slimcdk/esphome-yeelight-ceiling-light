package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.random.a */
public abstract class C9448a extends Random {
    @NotNull
    public abstract Random getImpl();

    public int nextBits(int i) {
        return C9452d.m23074f(getImpl().nextInt(), i);
    }

    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        C9424q.m22996e(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }

    public double nextDouble() {
        return getImpl().nextDouble();
    }

    public float nextFloat() {
        return getImpl().nextFloat();
    }

    public int nextInt() {
        return getImpl().nextInt();
    }

    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }

    public long nextLong() {
        return getImpl().nextLong();
    }
}
