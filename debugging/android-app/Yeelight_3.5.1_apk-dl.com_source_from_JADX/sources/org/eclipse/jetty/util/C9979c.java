package org.eclipse.jetty.util;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: org.eclipse.jetty.util.c */
public class C9979c implements C9978b {

    /* renamed from: a */
    protected final Map<String, Object> f18377a = new HashMap();

    /* renamed from: a */
    public Object mo39576a(String str) {
        return this.f18377a.get(str);
    }

    /* renamed from: b */
    public void mo39578b(String str, Object obj) {
        if (obj == null) {
            this.f18377a.remove(str);
        } else {
            this.f18377a.put(str, obj);
        }
    }

    /* renamed from: b0 */
    public void mo39579b0() {
        this.f18377a.clear();
    }

    /* renamed from: c */
    public Set<Map.Entry<String, Object>> mo40206c() {
        return this.f18377a.entrySet();
    }

    /* renamed from: d */
    public void mo39582d(String str) {
        this.f18377a.remove(str);
    }

    /* renamed from: e */
    public Enumeration<String> mo40207e() {
        return Collections.enumeration(this.f18377a.keySet());
    }

    public String toString() {
        return this.f18377a.toString();
    }
}
