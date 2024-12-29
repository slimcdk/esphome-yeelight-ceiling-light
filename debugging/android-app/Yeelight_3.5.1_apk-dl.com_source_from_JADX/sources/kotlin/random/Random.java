package kotlin.random;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import p125a5.C3975c;
import p216u4.C10532b;

@SinceKotlin(version = "1.3")
public abstract class Random {
    @NotNull
    public static final Default Default = new Default((C9422o) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final Random defaultRandom = C10532b.f19696a.mo42190a();

    public static final class Default extends Random implements Serializable {

        private static final class Serialized implements Serializable {
            @NotNull
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(C9422o oVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        public int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @NotNull
        public byte[] nextBytes(int i) {
            return Random.defaultRandom.nextBytes(i);
        }

        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr) {
            C9424q.m22996e(bArr, "array");
            return Random.defaultRandom.nextBytes(bArr);
        }

        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
            C9424q.m22996e(bArr, "array");
            return Random.defaultRandom.nextBytes(bArr, i, i2);
        }

        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        public double nextDouble(double d) {
            return Random.defaultRandom.nextDouble(d);
        }

        public double nextDouble(double d, double d2) {
            return Random.defaultRandom.nextDouble(d, d2);
        }

        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        public int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        public int nextInt(int i, int i2) {
            return Random.defaultRandom.nextInt(i, i2);
        }

        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        public long nextLong(long j) {
            return Random.defaultRandom.nextLong(j);
        }

        public long nextLong(long j, long j2) {
            return Random.defaultRandom.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return random.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        C9424q.m22996e(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
        C9424q.m22996e(bArr, "array");
        boolean z = true;
        if (new C3975c(0, bArr.length).mo26534m(i) && new C3975c(0, bArr.length).mo26534m(i2)) {
            if (i > i2) {
                z = false;
            }
            if (z) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int nextInt = nextInt();
                    bArr[i] = (byte) nextInt;
                    bArr[i + 1] = (byte) (nextInt >>> 8);
                    bArr[i + 2] = (byte) (nextInt >>> 16);
                    bArr[i + 3] = (byte) (nextInt >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int nextBits = nextBits(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (nextBits >>> (i6 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    public double nextDouble() {
        return C9451c.m23068a(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.C9452d.m23070b(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L_0x0044
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0044
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L_0x002b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0044
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r4 = r9 / r2
            java.lang.Double.isNaN(r2)
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x004b
        L_0x0044:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L_0x004b:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x0055:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public abstract int nextInt();

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public int nextInt(int i, int i2) {
        int i3;
        int nextInt;
        int i4;
        int nextInt2;
        boolean z;
        C9452d.m23071c(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = nextBits(C9452d.m23073e(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i4 = nextInt % i5;
                } while ((nextInt - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        do {
            nextInt2 = nextInt();
            z = false;
            if (i <= nextInt2 && nextInt2 < i2) {
                z = true;
                continue;
            }
        } while (!z);
        return nextInt2;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        boolean z;
        long j3;
        long nextLong2;
        long j4;
        int nextInt;
        C9452d.m23072d(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    nextInt = nextBits(C9452d.m23073e(i));
                } else if (i2 == 1) {
                    nextInt = nextInt();
                } else {
                    j3 = (((long) nextBits(C9452d.m23073e(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                j3 = ((long) nextInt) & 4294967295L;
            } else {
                do {
                    nextLong2 = nextLong() >>> 1;
                    j4 = nextLong2 % j5;
                } while ((nextLong2 - j4) + (j5 - 1) < 0);
                j3 = j4;
            }
            return j + j3;
        }
        do {
            nextLong = nextLong();
            z = false;
            if (j <= nextLong && nextLong < j2) {
                z = true;
                continue;
            }
        } while (!z);
        return nextLong;
    }
}
