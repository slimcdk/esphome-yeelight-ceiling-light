package com.yeelight.yeelib.p153g;

import java.io.Serializable;

/* renamed from: com.yeelight.yeelib.g.x */
public class C9855x implements Serializable {

    /* renamed from: a */
    private String f17885a;

    /* renamed from: b */
    private int f17886b;

    /* renamed from: c */
    private String f17887c;

    /* renamed from: d */
    private boolean f17888d;

    /* renamed from: e */
    private int f17889e = 0;

    /* renamed from: f */
    private boolean f17890f = true;

    /* renamed from: a */
    public int mo31839a() {
        return this.f17889e;
    }

    /* renamed from: b */
    public int mo31840b() {
        return this.f17886b;
    }

    /* renamed from: c */
    public String mo31841c() {
        return this.f17887c;
    }

    /* renamed from: d */
    public String mo31842d() {
        return this.f17885a;
    }

    /* renamed from: e */
    public boolean mo31843e() {
        return this.f17890f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9855x) {
            return ((C9855x) obj).mo31841c().equals(mo31841c());
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo31845f() {
        return this.f17888d;
    }

    /* renamed from: g */
    public void mo31846g(boolean z) {
        this.f17890f = z;
    }

    /* renamed from: h */
    public void mo31847h(boolean z) {
        this.f17888d = z;
    }

    /* renamed from: i */
    public void mo31848i(int i) {
        this.f17889e = i;
    }

    /* renamed from: j */
    public void mo31849j(int i) {
        this.f17886b = i;
    }

    /* renamed from: k */
    public void mo31850k(String str) {
        this.f17887c = str;
    }

    /* renamed from: l */
    public void mo31851l(String str) {
        this.f17885a = str;
    }
}
