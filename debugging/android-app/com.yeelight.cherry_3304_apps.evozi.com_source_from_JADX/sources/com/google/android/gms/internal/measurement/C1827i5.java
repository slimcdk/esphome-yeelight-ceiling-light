package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i5 */
final class C1827i5 extends C1812h5 {
    private C1827i5() {
        super();
    }

    /* renamed from: e */
    private static <E> C1999t4<E> m5244e(Object obj, long j) {
        return (C1999t4) C1859k7.m5317F(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo11713b(Object obj, Object obj2, long j) {
        C1999t4 e = m5244e(obj, j);
        C1999t4 e2 = m5244e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo12091C()) {
                e = e.mo11562a(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        C1859k7.m5336j(obj, j, e2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11714d(Object obj, long j) {
        m5244e(obj, j).mo12092t();
    }
}
