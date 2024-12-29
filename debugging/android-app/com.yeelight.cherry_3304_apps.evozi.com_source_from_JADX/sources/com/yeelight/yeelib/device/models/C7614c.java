package com.yeelight.yeelib.device.models;

import com.yeelight.yeelib.p152f.C4214g;

/* renamed from: com.yeelight.yeelib.device.models.c */
public class C7614c extends C7612b {

    /* renamed from: g */
    private int f15572g = -1;

    /* renamed from: e */
    public int mo29052e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7614c)) {
            return false;
        }
        C7614c cVar = (C7614c) obj;
        return cVar.mo29039b() == mo29039b() && cVar.mo29046n() == mo29046n() && cVar.mo29056u() == mo29056u();
    }

    /* renamed from: f */
    public String mo29054f() {
        return "";
    }

    /* renamed from: g */
    public boolean mo29042g() {
        return mo29058w();
    }

    /* renamed from: j */
    public void mo29055j(int i) {
    }

    /* renamed from: u */
    public int mo29056u() {
        return this.f15572g;
    }

    /* renamed from: v */
    public boolean mo29057v() {
        "2541 version: " + this.f15572g;
        C4214g.C4218c cVar = (C4214g.C4218c) C4214g.m11665j().mo23494m("yeelink.light.ble1");
        return (cVar == null || this.f15572g == -1 || cVar.mo23517l() <= this.f15572g) ? false : true;
    }

    /* renamed from: w */
    public boolean mo29058w() {
        return mo29057v() || mo29059x();
    }

    /* renamed from: x */
    public boolean mo29059x() {
        int a;
        "mcu version: " + mo29039b();
        C4214g.C4218c cVar = (C4214g.C4218c) C4214g.m11665j().mo23494m("yeelink.light.ble1");
        if (cVar == null || mo29039b() == -1 || (a = cVar.mo23519a()) <= mo29039b()) {
            return false;
        }
        mo29051s(a);
        return true;
    }

    /* renamed from: y */
    public void mo29060y(int i) {
        this.f15572g = i;
    }
}
