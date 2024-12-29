package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.l6 */
final class C1876l6 implements C2032v5 {

    /* renamed from: a */
    private final C2062x5 f3545a;

    /* renamed from: b */
    private final String f3546b;

    /* renamed from: c */
    private final Object[] f3547c;

    /* renamed from: d */
    private final int f3548d;

    C1876l6(C2062x5 x5Var, String str, Object[] objArr) {
        this.f3545a = x5Var;
        this.f3546b = str;
        this.f3547c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3548d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f3548d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: C */
    public final int mo11471C() {
        return (this.f3548d & 1) == 1 ? C1889m4.C1894e.f3577i : C1889m4.C1894e.f3578j;
    }

    /* renamed from: D */
    public final boolean mo11472D() {
        return (this.f3548d & 2) == 2;
    }

    /* renamed from: E */
    public final C2062x5 mo11473E() {
        return this.f3545a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11813a() {
        return this.f3546b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo11814b() {
        return this.f3547c;
    }
}
