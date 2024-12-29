package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j5 */
final class C1843j5 extends C1812h5 {

    /* renamed from: c */
    private static final Class<?> f3501c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C1843j5() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.f5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.f5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.f5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m5280e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m5281f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1766e5
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.f5 r0 = new com.google.android.gms.internal.measurement.f5
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1858k6
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1999t4
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.t4 r0 = (com.google.android.gms.internal.measurement.C1999t4) r0
            com.google.android.gms.internal.measurement.t4 r6 = r0.mo11562a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C1859k7.m5336j(r3, r4, r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f3501c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            com.google.android.gms.internal.measurement.C1859k7.m5336j(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1845j7
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.f5 r1 = new com.google.android.gms.internal.measurement.f5
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.j7 r0 = (com.google.android.gms.internal.measurement.C1845j7) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1858k6
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C1999t4
            if (r1 == 0) goto L_0x007a
            r1 = r0
            com.google.android.gms.internal.measurement.t4 r1 = (com.google.android.gms.internal.measurement.C1999t4) r1
            boolean r2 = r1.mo12091C()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.t4 r0 = r1.mo11562a(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1843j5.m5280e(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: f */
    private static <E> List<E> m5281f(Object obj, long j) {
        return (List) C1859k7.m5317F(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo11713b(Object obj, Object obj2, long j) {
        List f = m5281f(obj2, j);
        List e = m5280e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        C1859k7.m5336j(obj, j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11714d(Object obj, long j) {
        Object obj2;
        List list = (List) C1859k7.m5317F(obj, j);
        if (list instanceof C1766e5) {
            obj2 = ((C1766e5) list).mo11602k0();
        } else if (!f3501c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C1858k6) || !(list instanceof C1999t4)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C1999t4 t4Var = (C1999t4) list;
                if (t4Var.mo12091C()) {
                    t4Var.mo12092t();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C1859k7.m5336j(obj, j, obj2);
    }
}
