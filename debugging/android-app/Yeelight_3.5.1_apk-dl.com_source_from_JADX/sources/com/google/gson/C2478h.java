package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.h */
public final class C2478h extends C2528k implements Iterable<C2528k> {

    /* renamed from: a */
    private final List<C2528k> f4198a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2478h) && ((C2478h) obj).f4198a.equals(this.f4198a));
    }

    public int hashCode() {
        return this.f4198a.hashCode();
    }

    public Iterator<C2528k> iterator() {
        return this.f4198a.iterator();
    }

    /* renamed from: o */
    public void mo19259o(C2528k kVar) {
        if (kVar == null) {
            kVar = C2529l.f4270a;
        }
        this.f4198a.add(kVar);
    }
}
