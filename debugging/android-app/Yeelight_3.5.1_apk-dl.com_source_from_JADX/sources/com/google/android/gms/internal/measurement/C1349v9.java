package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v9 */
final class C1349v9 implements C1143i9 {

    /* renamed from: a */
    private final C1191l9 f1686a;

    /* renamed from: b */
    private final String f1687b;

    /* renamed from: c */
    private final Object[] f1688c;

    /* renamed from: d */
    private final int f1689d;

    C1349v9(C1191l9 l9Var, String str, Object[] objArr) {
        this.f1686a = l9Var;
        this.f1687b = str;
        this.f1688c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1689d = charAt;
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
                this.f1689d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: D */
    public final boolean mo12878D() {
        return (this.f1689d & 2) == 2;
    }

    /* renamed from: E */
    public final int mo12879E() {
        return (this.f1689d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo13434a() {
        return this.f1687b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo13435b() {
        return this.f1688c;
    }

    public final C1191l9 zza() {
        return this.f1686a;
    }
}
