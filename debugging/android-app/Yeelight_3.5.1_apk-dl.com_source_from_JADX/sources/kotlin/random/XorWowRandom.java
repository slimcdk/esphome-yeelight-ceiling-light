package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.C9422o;
import org.jetbrains.annotations.NotNull;

public final class XorWowRandom extends Random implements Serializable {
    @NotNull
    private static final C9447a Companion = new C9447a((C9422o) null);
    @Deprecated
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v */
    private int f17325v;

    /* renamed from: w */
    private int f17326w;

    /* renamed from: x */
    private int f17327x;

    /* renamed from: y */
    private int f17328y;

    /* renamed from: z */
    private int f17329z;

    /* renamed from: kotlin.random.XorWowRandom$a */
    private static final class C9447a {
        private C9447a() {
        }

        public /* synthetic */ C9447a(C9422o oVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XorWowRandom(int r8, int r9) {
        /*
            r7 = this;
            r5 = r8 ^ -1
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.XorWowRandom.<init>(int, int):void");
    }

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f17327x = i;
        this.f17328y = i2;
        this.f17329z = i3;
        this.f17326w = i4;
        this.f17325v = i5;
        this.addend = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                nextInt();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    public int nextBits(int i) {
        return C9452d.m23074f(nextInt(), i);
    }

    public int nextInt() {
        int i = this.f17327x;
        int i2 = i ^ (i >>> 2);
        this.f17327x = this.f17328y;
        this.f17328y = this.f17329z;
        this.f17329z = this.f17326w;
        int i3 = this.f17325v;
        this.f17326w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f17325v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }
}
