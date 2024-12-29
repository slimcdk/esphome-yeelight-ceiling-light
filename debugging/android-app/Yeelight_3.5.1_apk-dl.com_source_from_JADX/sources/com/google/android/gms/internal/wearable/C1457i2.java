package com.google.android.gms.internal.wearable;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.i2 */
final class C1457i2 implements Iterator<Map.Entry> {

    /* renamed from: a */
    private int f1799a = -1;

    /* renamed from: b */
    private boolean f1800b;

    /* renamed from: c */
    private Iterator<Map.Entry> f1801c;

    /* renamed from: d */
    final /* synthetic */ C1467k2 f1802d;

    /* synthetic */ C1457i2(C1467k2 k2Var, C1432d2 d2Var) {
        this.f1802d = k2Var;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m3558a() {
        if (this.f1801c == null) {
            this.f1801c = this.f1802d.f1815c.entrySet().iterator();
        }
        return this.f1801c;
    }

    public final boolean hasNext() {
        if (this.f1799a + 1 >= this.f1802d.f1814b.size()) {
            return !this.f1802d.f1815c.isEmpty() && m3558a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f1800b = true;
        int i = this.f1799a + 1;
        this.f1799a = i;
        return (Map.Entry) (i < this.f1802d.f1814b.size() ? this.f1802d.f1814b.get(this.f1799a) : m3558a().next());
    }

    public final void remove() {
        if (this.f1800b) {
            this.f1800b = false;
            this.f1802d.m3600m();
            if (this.f1799a < this.f1802d.f1814b.size()) {
                C1467k2 k2Var = this.f1802d;
                int i = this.f1799a;
                this.f1799a = i - 1;
                Object unused = k2Var.m3598k(i);
                return;
            }
            m3558a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
