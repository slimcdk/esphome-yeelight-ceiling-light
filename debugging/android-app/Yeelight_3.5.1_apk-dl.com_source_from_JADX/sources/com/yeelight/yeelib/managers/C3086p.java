package com.yeelight.yeelib.managers;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.managers.p */
public class C3086p {

    /* renamed from: b */
    private static C3086p f4915b;

    /* renamed from: a */
    private List<C3087a> f4916a = new ArrayList();

    /* renamed from: com.yeelight.yeelib.managers.p$a */
    public interface C3087a {
    }

    /* renamed from: a */
    public static C3086p m8110a() {
        if (f4915b == null) {
            f4915b = new C3086p();
        }
        return f4915b;
    }

    /* renamed from: b */
    public void mo23464b(C3087a aVar) {
        if (!this.f4916a.contains(aVar)) {
            this.f4916a.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo23465c(C3087a aVar) {
        this.f4916a.remove(aVar);
    }
}
