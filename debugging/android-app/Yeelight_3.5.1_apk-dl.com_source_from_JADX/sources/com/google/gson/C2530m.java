package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.gson.m */
public final class C2530m extends C2528k {

    /* renamed from: a */
    private final LinkedTreeMap<String, C2528k> f4271a = new LinkedTreeMap<>();

    /* renamed from: u */
    private C2528k m6816u(Object obj) {
        return obj == null ? C2529l.f4270a : new C2531n(obj);
    }

    public Set<Map.Entry<String, C2528k>> entrySet() {
        return this.f4271a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2530m) && ((C2530m) obj).f4271a.equals(this.f4271a));
    }

    public int hashCode() {
        return this.f4271a.hashCode();
    }

    /* renamed from: o */
    public void mo19396o(String str, C2528k kVar) {
        if (kVar == null) {
            kVar = C2529l.f4270a;
        }
        this.f4271a.put(str, kVar);
    }

    /* renamed from: r */
    public void mo19397r(String str, Number number) {
        mo19396o(str, m6816u(number));
    }

    /* renamed from: t */
    public void mo19398t(String str, String str2) {
        mo19396o(str, m6816u(str2));
    }
}
