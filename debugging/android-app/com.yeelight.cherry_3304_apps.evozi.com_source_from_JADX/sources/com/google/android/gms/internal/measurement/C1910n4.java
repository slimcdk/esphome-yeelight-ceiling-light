package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
final class C1910n4 implements C2015u5 {

    /* renamed from: a */
    private static final C1910n4 f3593a = new C1910n4();

    private C1910n4() {
    }

    /* renamed from: c */
    public static C1910n4 m5584c() {
        return f3593a;
    }

    /* renamed from: a */
    public final boolean mo11863a(Class<?> cls) {
        return C1889m4.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C2032v5 mo11864b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.m4> r0 = com.google.android.gms.internal.measurement.C1889m4.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0024
        L_0x001f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0024:
            r0.<init>(r5)
            throw r0
        L_0x0028:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.measurement.m4 r0 = com.google.android.gms.internal.measurement.C1889m4.m5462l(r0)     // Catch:{ Exception -> 0x003a }
            int r1 = com.google.android.gms.internal.measurement.C1889m4.C1894e.f3571c     // Catch:{ Exception -> 0x003a }
            r2 = 0
            java.lang.Object r0 = r0.mo11417o(r1, r2, r2)     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.internal.measurement.v5 r0 = (com.google.android.gms.internal.measurement.C2032v5) r0     // Catch:{ Exception -> 0x003a }
            return r0
        L_0x003a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0052
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0057
        L_0x0052:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0057:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1910n4.mo11864b(java.lang.Class):com.google.android.gms.internal.measurement.v5");
    }
}
