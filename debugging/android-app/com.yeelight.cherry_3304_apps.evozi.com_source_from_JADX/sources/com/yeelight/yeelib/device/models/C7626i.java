package com.yeelight.yeelib.device.models;

import com.miot.service.manager.timer.TimerCodec;

/* renamed from: com.yeelight.yeelib.device.models.i */
public class C7626i extends C7622g {

    /* renamed from: b */
    private String f15583b = TimerCodec.DISENABLE;

    /* renamed from: c */
    private int f15584c = 0;

    /* renamed from: d */
    private int f15585d;

    public C7626i(String str) {
        this.f15583b = str;
    }

    /* renamed from: o */
    private int m22523o(String str) {
        try {
            return Integer.valueOf(str.substring(str.indexOf("_") + 1).trim()).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public boolean mo29038a(int i) {
        return mo29039b() >= i;
    }

    /* renamed from: b */
    public int mo29039b() {
        return m22523o(this.f15583b);
    }

    /* renamed from: c */
    public String mo29040c() {
        return this.f15583b;
    }

    /* renamed from: d */
    public String mo29041d() {
        return "";
    }

    /* renamed from: e */
    public int mo29052e() {
        return this.f15584c;
    }

    /* renamed from: f */
    public String mo29054f() {
        return "";
    }

    /* renamed from: g */
    public boolean mo29042g() {
        return false;
    }

    /* renamed from: i */
    public void mo29043i() {
    }

    /* renamed from: j */
    public void mo29055j(int i) {
    }

    /* renamed from: l */
    public int mo29071l() {
        return this.f15585d;
    }

    /* renamed from: m */
    public void mo29072m(int i) {
        this.f15585d = i;
    }

    /* renamed from: n */
    public void mo29073n(int i) {
        this.f15584c = i;
    }

    public String toString() {
        return "MeshDeviceFirmware{mCurrentVersion='" + this.f15583b + '}';
    }
}
