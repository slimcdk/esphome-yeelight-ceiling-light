package com.yeelight.yeelib.p152f;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.f.p */
public class C4237p {

    /* renamed from: b */
    private static C4237p f7359b;

    /* renamed from: a */
    private List<C4238a> f7360a = new ArrayList();

    /* renamed from: com.yeelight.yeelib.f.p$a */
    public interface C4238a {
    }

    /* renamed from: a */
    public static C4237p m11800a() {
        if (f7359b == null) {
            f7359b = new C4237p();
        }
        return f7359b;
    }

    /* renamed from: b */
    public void mo23571b(C4238a aVar) {
        if (!this.f7360a.contains(aVar)) {
            this.f7360a.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo23572c(C4238a aVar) {
        this.f7360a.remove(aVar);
    }
}
