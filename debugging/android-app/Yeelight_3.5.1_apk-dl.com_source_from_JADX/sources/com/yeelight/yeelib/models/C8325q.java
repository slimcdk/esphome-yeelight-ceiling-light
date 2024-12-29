package com.yeelight.yeelib.models;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.models.q */
public class C8325q {

    /* renamed from: a */
    private int f14312a;
    @StringRes

    /* renamed from: b */
    private int f14313b;
    @StringRes

    /* renamed from: c */
    private int f14314c;
    @DrawableRes

    /* renamed from: d */
    private int f14315d;
    @DrawableRes

    /* renamed from: e */
    private int f14316e;

    /* renamed from: f */
    private List<ProductInfo> f14317f = new ArrayList();

    /* renamed from: g */
    private List<ProductInfo> f14318g = new ArrayList();

    public C8325q(int i, @StringRes int i2, @StringRes int i3, @DrawableRes int i4, @DrawableRes int i5) {
        this.f14312a = i;
        this.f14313b = i2;
        this.f14314c = i3;
        this.f14315d = i4;
        this.f14316e = i5;
    }

    /* renamed from: a */
    public void mo35407a(ProductInfo productInfo) {
        this.f14317f.add(productInfo);
    }

    /* renamed from: b */
    public List<ProductInfo> mo35408b() {
        return this.f14317f;
    }

    /* renamed from: c */
    public List<ProductInfo> mo35409c() {
        return this.f14318g;
    }

    /* renamed from: d */
    public int mo35410d() {
        return this.f14316e;
    }

    /* renamed from: e */
    public int mo35411e() {
        return this.f14314c;
    }

    /* renamed from: f */
    public int mo35412f() {
        return this.f14312a;
    }

    /* renamed from: g */
    public int mo35413g() {
        return this.f14313b;
    }

    /* renamed from: h */
    public int mo35414h() {
        return this.f14315d;
    }

    /* renamed from: i */
    public void mo35415i() {
        this.f14318g.clear();
        for (ProductInfo next : this.f14317f) {
            if (next.isEnabled() && next.isDisplayInList()) {
                this.f14318g.add(next);
            }
        }
    }
}
