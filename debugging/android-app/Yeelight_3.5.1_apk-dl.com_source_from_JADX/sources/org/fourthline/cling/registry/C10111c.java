package org.fourthline.cling.registry;

import org.fourthline.cling.model.C10016d;

/* renamed from: org.fourthline.cling.registry.c */
class C10111c<K, I> {

    /* renamed from: a */
    private K f18662a;

    /* renamed from: b */
    private I f18663b;

    /* renamed from: c */
    private C10016d f18664c = new C10016d();

    C10111c(K k) {
        this.f18662a = k;
    }

    C10111c(K k, I i, int i2) {
        this.f18662a = k;
        this.f18663b = i;
        this.f18664c = new C10016d(i2);
    }

    /* renamed from: a */
    public C10016d mo40685a() {
        return this.f18664c;
    }

    /* renamed from: b */
    public I mo40686b() {
        return this.f18663b;
    }

    /* renamed from: c */
    public K mo40687c() {
        return this.f18662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10111c.class != obj.getClass()) {
            return false;
        }
        return this.f18662a.equals(((C10111c) obj).f18662a);
    }

    public int hashCode() {
        return this.f18662a.hashCode();
    }

    public String toString() {
        return "(" + C10111c.class.getSimpleName() + ") " + mo40685a() + " KEY: " + mo40687c() + " ITEM: " + mo40686b();
    }
}
