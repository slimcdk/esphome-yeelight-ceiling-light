package com.yeelight.yeelib.p150c.p184n;

/* renamed from: com.yeelight.yeelib.c.n.e */
public class C7554e {

    /* renamed from: a */
    private boolean f15210a;

    /* renamed from: b */
    private int f15211b;

    /* renamed from: c */
    private int f15212c;

    public C7554e(int i, int i2) {
        this.f15211b = i;
        this.f15212c = i2;
        this.f15210a = i2 > 0;
    }

    /* renamed from: a */
    public int mo28880a() {
        return this.f15212c;
    }

    /* renamed from: b */
    public int mo28881b() {
        return this.f15211b;
    }

    /* renamed from: c */
    public boolean mo28882c() {
        return this.f15210a;
    }

    /* renamed from: d */
    public boolean mo28883d(boolean z) {
        boolean z2 = this.f15210a != z;
        this.f15210a = z;
        return z2;
    }

    /* renamed from: e */
    public boolean mo28884e(int i) {
        boolean z = this.f15210a;
        int i2 = this.f15212c;
        this.f15212c = i;
        boolean z2 = i > 0;
        this.f15210a = z2;
        return (z2 == z && this.f15212c == i2) ? false : true;
    }

    /* renamed from: f */
    public boolean mo28885f(int i) {
        int i2 = this.f15211b;
        this.f15211b = i;
        return i != i2;
    }
}
