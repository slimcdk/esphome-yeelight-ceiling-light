package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
final class C2095z6 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f3864a;

    /* renamed from: b */
    private boolean f3865b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f3866c;

    /* renamed from: d */
    private final /* synthetic */ C1971r6 f3867d;

    private C2095z6(C1971r6 r6Var) {
        this.f3867d = r6Var;
        this.f3864a = -1;
    }

    /* synthetic */ C2095z6(C1971r6 r6Var, C1955q6 q6Var) {
        this(r6Var);
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m6667a() {
        if (this.f3866c == null) {
            this.f3866c = this.f3867d.f3699c.entrySet().iterator();
        }
        return this.f3866c;
    }

    public final boolean hasNext() {
        return this.f3864a + 1 < this.f3867d.f3698b.size() || (!this.f3867d.f3699c.isEmpty() && m6667a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f3865b = true;
        int i = this.f3864a + 1;
        this.f3864a = i;
        return (Map.Entry) (i < this.f3867d.f3698b.size() ? this.f3867d.f3698b.get(this.f3864a) : m6667a().next());
    }

    public final void remove() {
        if (this.f3865b) {
            this.f3865b = false;
            this.f3867d.m5900p();
            if (this.f3864a < this.f3867d.f3698b.size()) {
                C1971r6 r6Var = this.f3867d;
                int i = this.f3864a;
                this.f3864a = i - 1;
                Object unused = r6Var.m5897k(i);
                return;
            }
            m6667a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
