package com.yeelight.yeelib.p153g;

import com.yeelight.yeelib.p152f.C4226i;

/* renamed from: com.yeelight.yeelib.g.o */
public class C9846o {

    /* renamed from: a */
    private String f17852a;

    /* renamed from: b */
    private String f17853b;

    /* renamed from: c */
    private String f17854c;

    /* renamed from: d */
    private C9848q f17855d = C9848q.Others;

    /* renamed from: e */
    private long f17856e;

    /* renamed from: f */
    private boolean f17857f;

    /* renamed from: g */
    private String f17858g;

    /* renamed from: h */
    private String f17859h;

    /* renamed from: i */
    private boolean f17860i;

    /* renamed from: j */
    private int f17861j;

    /* renamed from: k */
    private int f17862k;

    /* renamed from: l */
    private int f17863l;

    public C9846o(String str, String str2, String str3) {
        C9847p pVar = C9847p.CertainTimes;
        this.f17857f = false;
        this.f17858g = null;
        this.f17859h = null;
        this.f17860i = false;
        this.f17861j = 3;
        this.f17862k = 0;
        this.f17863l = 0;
        this.f17852a = str;
        this.f17853b = str2;
        this.f17854c = str3;
    }

    /* renamed from: a */
    public String mo31795a() {
        return this.f17854c;
    }

    /* renamed from: b */
    public String mo31796b() {
        return this.f17858g;
    }

    /* renamed from: c */
    public long mo31797c() {
        return this.f17856e;
    }

    /* renamed from: d */
    public String mo31798d() {
        return this.f17852a;
    }

    /* renamed from: e */
    public String mo31799e() {
        return this.f17859h;
    }

    /* renamed from: f */
    public int mo31800f() {
        return this.f17863l;
    }

    /* renamed from: g */
    public int mo31801g() {
        return this.f17862k;
    }

    /* renamed from: h */
    public int mo31802h() {
        return this.f17861j;
    }

    /* renamed from: i */
    public String mo31803i() {
        return this.f17853b;
    }

    /* renamed from: j */
    public C9848q mo31804j() {
        return this.f17855d;
    }

    /* renamed from: k */
    public boolean mo31805k() {
        "show num: " + mo31801g() + ", show count: " + mo31800f();
        boolean z = mo31797c() * 1000 > System.currentTimeMillis() && (mo31801g() == 0 || mo31801g() > mo31800f());
        if (z && mo31801g() != 0) {
            this.f17863l++;
            "need to update show count into config file! count: " + this.f17863l;
            C4226i.m11743c().mo23547m(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Launch page: ");
        sb.append(mo31798d());
        sb.append(" is ");
        sb.append(z ? "" : "not");
        sb.append(" available!");
        sb.toString();
        return z;
    }

    /* renamed from: l */
    public boolean mo31806l() {
        return this.f17857f;
    }

    /* renamed from: m */
    public boolean mo31807m() {
        return this.f17860i;
    }

    /* renamed from: n */
    public void mo31808n(String str) {
        this.f17858g = str;
    }

    /* renamed from: o */
    public void mo31809o(boolean z) {
        this.f17857f = z;
    }

    /* renamed from: p */
    public void mo31810p(boolean z) {
        this.f17860i = z;
    }

    /* renamed from: q */
    public void mo31811q(long j) {
        this.f17856e = j;
    }

    /* renamed from: r */
    public void mo31812r(String str) {
        this.f17859h = str;
    }

    /* renamed from: s */
    public void mo31813s(int i) {
        this.f17863l = i;
    }

    /* renamed from: t */
    public void mo31814t(int i) {
        this.f17862k = i;
    }

    /* renamed from: u */
    public void mo31815u(int i) {
        this.f17861j = i;
    }

    /* renamed from: v */
    public void mo31816v(C9848q qVar) {
        this.f17855d = qVar;
    }
}
