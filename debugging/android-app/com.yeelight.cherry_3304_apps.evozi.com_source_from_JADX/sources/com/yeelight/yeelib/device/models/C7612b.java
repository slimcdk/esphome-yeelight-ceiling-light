package com.yeelight.yeelib.device.models;

import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.device.models.b */
public abstract class C7612b extends C7622g {

    /* renamed from: f */
    private static final String f15567f = "b";

    /* renamed from: b */
    protected int f15568b = -1;

    /* renamed from: c */
    private boolean f15569c = true;

    /* renamed from: d */
    private int f15570d = -1;

    /* renamed from: e */
    private int f15571e = -1;

    /* renamed from: t */
    private String m22471t(int i) {
        String valueOf = String.valueOf(i);
        if (valueOf.length() != 4) {
            String str = f15567f;
            C4308b.m12139r(str, "Invalid firmware format!" + i);
            return TimerCodec.DISENABLE;
        }
        String substring = valueOf.substring(0, 1);
        String substring2 = valueOf.substring(1, 2);
        String substring3 = valueOf.substring(2, 4);
        return substring + "." + substring2 + "." + substring3;
    }

    /* renamed from: a */
    public boolean mo29038a(int i) {
        return mo29039b() >= i;
    }

    /* renamed from: b */
    public int mo29039b() {
        return this.f15569c ? this.f15570d : this.f15571e;
    }

    /* renamed from: c */
    public String mo29040c() {
        return m22471t(mo29039b());
    }

    /* renamed from: d */
    public String mo29041d() {
        return m22471t(mo29046n());
    }

    /* renamed from: g */
    public boolean mo29042g() {
        return false;
    }

    /* renamed from: i */
    public void mo29043i() {
        if (mo29047o()) {
            this.f15571e = this.f15568b;
        } else {
            this.f15570d = this.f15568b;
        }
        mo29050r(!mo29047o());
    }

    /* renamed from: l */
    public int mo29044l() {
        return this.f15570d;
    }

    /* renamed from: m */
    public int mo29045m() {
        return this.f15571e;
    }

    /* renamed from: n */
    public int mo29046n() {
        return this.f15568b;
    }

    /* renamed from: o */
    public boolean mo29047o() {
        return this.f15569c;
    }

    /* renamed from: p */
    public void mo29048p(int i) {
        this.f15570d = i;
    }

    /* renamed from: q */
    public void mo29049q(int i) {
        this.f15571e = i;
    }

    /* renamed from: r */
    public void mo29050r(boolean z) {
        this.f15569c = z;
    }

    /* renamed from: s */
    public void mo29051s(int i) {
        this.f15568b = i;
    }
}
