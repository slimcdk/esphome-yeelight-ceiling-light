package com.google.firebase.components;

import com.google.firebase.p133i.C3201a;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
abstract class C2822a implements C2828e {
    C2822a() {
    }

    /* renamed from: a */
    public <T> T mo17074a(Class<T> cls) {
        C3201a<T> b = mo17089b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo17075d(Class<T> cls) {
        return mo17090c(cls).get();
    }
}
