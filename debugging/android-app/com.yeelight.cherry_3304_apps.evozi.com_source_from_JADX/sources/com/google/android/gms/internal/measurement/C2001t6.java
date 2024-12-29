package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
final class C2001t6 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f3728a;

    /* renamed from: b */
    private Iterator<Map.Entry<K, V>> f3729b;

    /* renamed from: c */
    private final /* synthetic */ C1971r6 f3730c;

    private C2001t6(C1971r6 r6Var) {
        this.f3730c = r6Var;
        this.f3728a = this.f3730c.f3698b.size();
    }

    /* synthetic */ C2001t6(C1971r6 r6Var, C1955q6 q6Var) {
        this(r6Var);
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m6019a() {
        if (this.f3729b == null) {
            this.f3729b = this.f3730c.f3702f.entrySet().iterator();
        }
        return this.f3729b;
    }

    public final boolean hasNext() {
        int i = this.f3728a;
        return (i > 0 && i <= this.f3730c.f3698b.size()) || m6019a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m6019a().hasNext()) {
            obj = m6019a().next();
        } else {
            List g = this.f3730c.f3698b;
            int i = this.f3728a - 1;
            this.f3728a = i;
            obj = g.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
