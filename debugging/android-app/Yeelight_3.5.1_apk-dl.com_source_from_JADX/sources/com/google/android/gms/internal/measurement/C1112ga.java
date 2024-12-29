package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ga */
final class C1112ga implements Iterator {

    /* renamed from: a */
    private int f1344a = -1;

    /* renamed from: b */
    private boolean f1345b;

    /* renamed from: c */
    private Iterator f1346c;

    /* renamed from: d */
    final /* synthetic */ C1176ka f1347d;

    /* synthetic */ C1112ga(C1176ka kaVar, C1096fa faVar) {
        this.f1347d = kaVar;
    }

    /* renamed from: a */
    private final Iterator m2018a() {
        if (this.f1346c == null) {
            this.f1346c = this.f1347d.f1395c.entrySet().iterator();
        }
        return this.f1346c;
    }

    public final boolean hasNext() {
        if (this.f1344a + 1 >= this.f1347d.f1394b.size()) {
            return !this.f1347d.f1395c.isEmpty() && m2018a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f1345b = true;
        int i = this.f1344a + 1;
        this.f1344a = i;
        return (Map.Entry) (i < this.f1347d.f1394b.size() ? this.f1347d.f1394b.get(this.f1344a) : m2018a().next());
    }

    public final void remove() {
        if (this.f1345b) {
            this.f1345b = false;
            this.f1347d.m2176n();
            if (this.f1344a < this.f1347d.f1394b.size()) {
                C1176ka kaVar = this.f1347d;
                int i = this.f1344a;
                this.f1344a = i - 1;
                Object unused = kaVar.m2174l(i);
                return;
            }
            m2018a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
