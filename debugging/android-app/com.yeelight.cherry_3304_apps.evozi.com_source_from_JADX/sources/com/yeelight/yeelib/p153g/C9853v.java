package com.yeelight.yeelib.p153g;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.g.v */
public class C9853v {

    /* renamed from: a */
    private int f17878a;
    @StringRes

    /* renamed from: b */
    private int f17879b;
    @StringRes

    /* renamed from: c */
    private int f17880c;
    @DrawableRes

    /* renamed from: d */
    private int f17881d;
    @DrawableRes

    /* renamed from: e */
    private int f17882e;

    /* renamed from: f */
    private List<C9855x> f17883f = new ArrayList();

    /* renamed from: g */
    private List<C9855x> f17884g = new ArrayList();

    public C9853v(int i, @StringRes int i2, @StringRes int i3, @DrawableRes int i4, @DrawableRes int i5) {
        this.f17878a = i;
        this.f17879b = i2;
        this.f17880c = i3;
        this.f17881d = i4;
        this.f17882e = i5;
    }

    /* renamed from: a */
    public void mo31830a(C9855x xVar) {
        this.f17883f.add(xVar);
    }

    /* renamed from: b */
    public List<C9855x> mo31831b() {
        return this.f17883f;
    }

    /* renamed from: c */
    public List<C9855x> mo31832c() {
        return this.f17884g;
    }

    /* renamed from: d */
    public int mo31833d() {
        return this.f17882e;
    }

    /* renamed from: e */
    public int mo31834e() {
        return this.f17880c;
    }

    /* renamed from: f */
    public int mo31835f() {
        return this.f17878a;
    }

    /* renamed from: g */
    public int mo31836g() {
        return this.f17879b;
    }

    /* renamed from: h */
    public int mo31837h() {
        return this.f17881d;
    }

    /* renamed from: i */
    public void mo31838i() {
        this.f17884g.clear();
        for (C9855x next : this.f17883f) {
            if (next.mo31845f() && next.mo31843e()) {
                this.f17884g.add(next);
            }
        }
    }
}
