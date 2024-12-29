package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q3 */
public abstract class C1952q3 {
    private C1952q3() {
    }

    /* renamed from: a */
    public static long m5833a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    static C1952q3 m5834b(byte[] bArr, int i, int i2, boolean z) {
        C1983s3 s3Var = new C1983s3(bArr, 0, i2, false);
        try {
            s3Var.mo12055d(i2);
            return s3Var;
        } catch (C2046w4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public static int m5835c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
