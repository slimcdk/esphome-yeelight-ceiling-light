package p153e7;

/* renamed from: e7.e */
class C9009e {

    /* renamed from: a */
    private final C9007c[] f16522a;

    /* renamed from: b */
    private C9010a[] f16523b = new C9010a[16];

    /* renamed from: e7.e$a */
    static class C9010a {

        /* renamed from: a */
        final Class<?> f16524a;

        /* renamed from: b */
        final C9007c f16525b;

        C9010a(Class<?> cls, C9007c cVar) {
            this.f16524a = cls;
            this.f16525b = cVar;
        }
    }

    C9009e(C9007c[] cVarArr) {
        this.f16522a = cVarArr;
    }

    /* renamed from: c */
    private static C9007c m21508c(C9009e eVar, Class<?> cls) {
        C9007c[] cVarArr = eVar.f16522a;
        int length = cVarArr.length;
        int i = length;
        while (true) {
            length--;
            if (length >= 0) {
                C9007c cVar = cVarArr[length];
                Class<?> g = cVar.mo36869g();
                if (g == cls) {
                    return cVar;
                }
                if (g == null || (cls != null && !g.isAssignableFrom(cls))) {
                    eVar = eVar.mo36876a(length, (C9007c[]) null);
                    cVarArr = eVar.f16522a;
                    i = cVarArr.length;
                }
            } else if (cls == null || i == 0) {
                return null;
            } else {
                if (i == 1) {
                    return cVarArr[0];
                }
                int i2 = i;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Class<?> g2 = cVarArr[i].mo36869g();
                    int i3 = i2;
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        } else if (i2 != i && cVarArr[i2].mo36869g().isAssignableFrom(g2)) {
                            eVar = eVar.mo36876a(i2, (C9007c[]) null);
                            cVarArr = eVar.f16522a;
                            i3 = cVarArr.length;
                            i = i3 - 1;
                        }
                    }
                    i2 = i3;
                }
                if (i2 == 1) {
                    return cVarArr[0];
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find best converter for type \"");
                sb.append(cls.getName());
                sb.append("\" from remaining set: ");
                for (int i4 = 0; i4 < i2; i4++) {
                    C9007c cVar2 = cVarArr[i4];
                    Class<?> g3 = cVar2.mo36869g();
                    sb.append(cVar2.getClass().getName());
                    sb.append('[');
                    sb.append(g3 == null ? null : g3.getName());
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9009e mo36876a(int i, C9007c[] cVarArr) {
        C9007c[] cVarArr2 = this.f16522a;
        int length = cVarArr2.length;
        if (i < length) {
            if (cVarArr != null) {
                cVarArr[0] = cVarArr2[i];
            }
            C9007c[] cVarArr3 = new C9007c[(length - 1)];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i) {
                    cVarArr3[i2] = cVarArr2[i3];
                    i2++;
                }
            }
            return new C9009e(cVarArr3);
        }
        throw new IndexOutOfBoundsException();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c A[EDGE_INSN: B:39:0x005c->B:29:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    p153e7.C9007c mo36877b(java.lang.Class<?> r10) {
        /*
            r9 = this;
            e7.e$a[] r0 = r9.f16523b
            int r1 = r0.length
            r2 = 0
            if (r10 != 0) goto L_0x0007
            goto L_0x001d
        L_0x0007:
            int r3 = r10.hashCode()
            int r4 = r1 + -1
            r3 = r3 & r4
        L_0x000e:
            r4 = r0[r3]
            if (r4 == 0) goto L_0x001f
            java.lang.Class<?> r5 = r4.f16524a
            if (r5 != r10) goto L_0x0019
            e7.c r10 = r4.f16525b
            return r10
        L_0x0019:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x000e
        L_0x001d:
            r3 = 0
            goto L_0x000e
        L_0x001f:
            e7.c r4 = m21508c(r9, r10)
            e7.e$a r5 = new e7.e$a
            r5.<init>(r10, r4)
            java.lang.Object r10 = r0.clone()
            e7.e$a[] r10 = (p153e7.C9009e.C9010a[]) r10
            r10[r3] = r5
            r0 = 0
        L_0x0031:
            if (r0 >= r1) goto L_0x003d
            r3 = r10[r0]
            if (r3 != 0) goto L_0x003a
            r9.f16523b = r10
            return r4
        L_0x003a:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x003d:
            int r0 = r1 << 1
            e7.e$a[] r3 = new p153e7.C9009e.C9010a[r0]
            r5 = 0
        L_0x0042:
            if (r5 >= r1) goto L_0x0061
            r6 = r10[r5]
            java.lang.Class<?> r7 = r6.f16524a
            if (r7 != 0) goto L_0x004b
            goto L_0x005a
        L_0x004b:
            int r7 = r7.hashCode()
            int r8 = r0 + -1
            r7 = r7 & r8
        L_0x0052:
            r8 = r3[r7]
            if (r8 == 0) goto L_0x005c
            int r7 = r7 + 1
            if (r7 < r0) goto L_0x0052
        L_0x005a:
            r7 = 0
            goto L_0x0052
        L_0x005c:
            r3[r7] = r6
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0061:
            r9.f16523b = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p153e7.C9009e.mo36877b(java.lang.Class):e7.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo36878d() {
        return this.f16522a.length;
    }
}
