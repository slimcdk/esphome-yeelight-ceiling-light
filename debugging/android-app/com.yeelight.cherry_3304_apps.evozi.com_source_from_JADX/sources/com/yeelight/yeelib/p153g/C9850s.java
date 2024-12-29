package com.yeelight.yeelib.p153g;

import java.io.Serializable;

/* renamed from: com.yeelight.yeelib.g.s */
public class C9850s implements Serializable {

    /* renamed from: a */
    private int f17874a;

    /* renamed from: b */
    private String f17875b = "yeelight_ms";

    /* renamed from: c */
    private String f17876c = "yeelight_ms";

    /* renamed from: d */
    private String f17877d = "YLu2M80aE";

    /* renamed from: a */
    public int mo31820a() {
        return this.f17874a;
    }

    /* renamed from: b */
    public String mo31821b() {
        return this.f17875b;
    }

    /* renamed from: c */
    public String mo31822c() {
        return this.f17876c;
    }

    /* renamed from: d */
    public String mo31823d() {
        return this.f17877d;
    }

    /* renamed from: e */
    public void mo31824e(int i) {
        this.f17874a = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9850s)) {
            return false;
        }
        C9850s sVar = (C9850s) obj;
        return sVar.mo31822c().equals(mo31822c()) && sVar.mo31823d().equals(mo31823d());
    }

    /* renamed from: f */
    public void mo31826f(String str) {
        this.f17875b = str;
    }

    /* renamed from: g */
    public void mo31827g(String str) {
        this.f17876c = str;
    }

    /* renamed from: h */
    public void mo31828h(String str) {
        this.f17877d = str;
    }

    public String toString() {
        return "MeshNetWork{id=" + this.f17874a + ", name='" + this.f17875b + '\'' + ", networkName='" + this.f17876c + '\'' + ", password='" + this.f17877d + '\'' + '}';
    }
}
