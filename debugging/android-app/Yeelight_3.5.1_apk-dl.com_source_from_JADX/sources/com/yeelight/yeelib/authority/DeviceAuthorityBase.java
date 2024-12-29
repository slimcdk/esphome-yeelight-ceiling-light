package com.yeelight.yeelib.authority;

import java.util.ArrayList;
import java.util.List;
import p237z3.C12141a;

public abstract class DeviceAuthorityBase {

    /* renamed from: a */
    protected AuthState f12247a = AuthState.AUTH_UNKNOWN;

    /* renamed from: b */
    protected List<C12141a> f12248b = new ArrayList();

    public enum AuthState {
        AUTH_UNKNOWN,
        AUTH_IP,
        AUTH_SUC,
        AUTH_FAIL,
        AUTH_NO_NEED
    }

    /* renamed from: a */
    public abstract void mo31412a(int i);

    /* renamed from: b */
    public void mo31413b() {
        for (C12141a w : this.f12248b) {
            w.mo30162w(this.f12247a);
        }
    }

    /* renamed from: c */
    public void mo31414c(C12141a aVar) {
        this.f12248b.add(aVar);
        aVar.mo30162w(this.f12247a);
    }

    /* renamed from: d */
    public abstract boolean mo31415d();

    /* renamed from: e */
    public void mo31416e(AuthState authState) {
        if (this.f12247a != authState) {
            this.f12247a = authState;
            mo31413b();
        }
    }

    /* renamed from: f */
    public void mo31417f(C12141a aVar) {
        if (aVar == null) {
            this.f12248b.clear();
        } else {
            this.f12248b.remove(aVar);
        }
    }
}
