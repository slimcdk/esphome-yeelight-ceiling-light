package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s6 */
final class C1986s6 extends C2080y6 {

    /* renamed from: b */
    private final /* synthetic */ C1971r6 f3716b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C1986s6(C1971r6 r6Var) {
        super(r6Var, (C1955q6) null);
        this.f3716b = r6Var;
    }

    /* synthetic */ C1986s6(C1971r6 r6Var, C1955q6 q6Var) {
        this(r6Var);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C2001t6(this.f3716b, (C1955q6) null);
    }
}
