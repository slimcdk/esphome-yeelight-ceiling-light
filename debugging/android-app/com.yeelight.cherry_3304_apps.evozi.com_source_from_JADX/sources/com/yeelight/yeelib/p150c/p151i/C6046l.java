package com.yeelight.yeelib.p150c.p151i;

/* renamed from: com.yeelight.yeelib.c.i.l */
public class C6046l {

    /* renamed from: a */
    private int f12852a = 21;

    /* renamed from: b */
    private int f12853b = 8193;

    /* renamed from: c */
    private String f12854c;

    public C6046l(String str) {
        this.f12854c = str;
    }

    /* renamed from: a */
    public String mo27797a() {
        return this.f12854c;
    }

    /* renamed from: b */
    public int mo27798b() {
        return this.f12853b;
    }

    /* renamed from: c */
    public int mo27799c() {
        return this.f12852a;
    }

    /* renamed from: d */
    public void mo27800d(int i) {
        this.f12852a = i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6046l)) {
            return false;
        }
        C6046l lVar = (C6046l) obj;
        return lVar.mo27797a().equals(this.f12854c) && lVar.mo27799c() == this.f12852a;
    }

    public String toString() {
        return "MiBandDevice{mPId=" + this.f12852a + ", mDeviceId='" + this.f12854c + '\'' + '}';
    }
}
