package com.yeelight.yeelib.p178b;

import com.yeelight.yeelib.p186e.C9766a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.b.b */
public abstract class C5969b {

    /* renamed from: a */
    protected C5970a f12649a = C5970a.AUTH_UNKNOWN;

    /* renamed from: b */
    protected List<C9766a> f12650b = new ArrayList();

    /* renamed from: com.yeelight.yeelib.b.b$a */
    public enum C5970a {
        AUTH_UNKNOWN,
        AUTH_IP,
        AUTH_SUC,
        AUTH_FAIL,
        AUTH_NO_NEED
    }

    /* renamed from: a */
    public abstract void mo27468a(int i);

    /* renamed from: b */
    public void mo27470b() {
        for (C9766a w : this.f12650b) {
            w.mo26106w(this.f12649a);
        }
    }

    /* renamed from: c */
    public void mo27471c(C9766a aVar) {
        this.f12650b.add(aVar);
        aVar.mo26106w(this.f12649a);
    }

    /* renamed from: d */
    public abstract boolean mo27469d();

    /* renamed from: e */
    public void mo27472e(C5970a aVar) {
        if (this.f12649a != aVar) {
            this.f12649a = aVar;
            mo27470b();
        }
    }

    /* renamed from: f */
    public void mo27473f(C9766a aVar) {
        if (aVar == null) {
            this.f12650b.clear();
        } else {
            this.f12650b.remove(aVar);
        }
    }
}
