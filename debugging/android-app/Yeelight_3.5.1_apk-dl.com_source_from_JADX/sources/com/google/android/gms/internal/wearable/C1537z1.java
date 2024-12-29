package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.z1 */
final class C1537z1 implements C1471l1 {

    /* renamed from: a */
    private final C1486o1 f1896a;

    /* renamed from: b */
    private final String f1897b;

    /* renamed from: c */
    private final Object[] f1898c;

    /* renamed from: d */
    private final int f1899d;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|(3:10|11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = r2.charAt(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("Failed parsing '%s' with charArray.length of %d", new java.lang.Object[]{r0, java.lang.Integer.valueOf(r6.length)}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = new char[r0.length()];
        r0.getChars(0, r0.length(), r1, 0);
        r2 = new java.lang.String(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1537z1(com.google.android.gms.internal.wearable.C1486o1 r5, java.lang.String r6, java.lang.Object[] r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f1896a = r5
            r4.f1897b = r6
            r4.f1898c = r7
            r5 = 1
            r7 = 0
            char r7 = r6.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0010 }
            goto L_0x0036
        L_0x0010:
            char[] r6 = r6.toCharArray()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            char r7 = r0.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x001f }
            r6 = r0
            goto L_0x0036
        L_0x001f:
            int r1 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            char[] r1 = new char[r1]     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            int r2 = r0.length()     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            r0.getChars(r7, r2, r1, r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            java.lang.String r2 = new java.lang.String     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            r2.<init>(r1)     // Catch:{ StringIndexOutOfBoundsException -> 0x005f, ArrayIndexOutOfBoundsException -> 0x005d }
            char r7 = r2.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x0059, ArrayIndexOutOfBoundsException -> 0x0057 }
            r6 = r2
        L_0x0036:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r7 >= r0) goto L_0x003e
            r4.f1899d = r7
            return
        L_0x003e:
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x0042:
            int r2 = r5 + 1
            char r5 = r6.charAt(r5)
            if (r5 < r0) goto L_0x0052
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r1
            r7 = r7 | r5
            int r1 = r1 + 13
            r5 = r2
            goto L_0x0042
        L_0x0052:
            int r5 = r5 << r1
            r5 = r5 | r7
            r4.f1899d = r5
            return
        L_0x0057:
            r0 = move-exception
            goto L_0x005a
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r1 = r0
            r0 = r2
            goto L_0x0060
        L_0x005d:
            r1 = move-exception
            goto L_0x0060
        L_0x005f:
            r1 = move-exception
        L_0x0060:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r0
            int r6 = r6.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            java.lang.String r5 = "Failed parsing '%s' with charArray.length of %d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r2.<init>(r5, r1)
            goto L_0x0079
        L_0x0078:
            throw r2
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1537z1.<init>(com.google.android.gms.internal.wearable.o1, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: D */
    public final C1486o1 mo13703D() {
        return this.f1896a;
    }

    /* renamed from: E */
    public final int mo13704E() {
        return (this.f1899d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo13906a() {
        return this.f1897b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo13907b() {
        return this.f1898c;
    }

    public final boolean zza() {
        return (this.f1899d & 2) == 2;
    }
}
