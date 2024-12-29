package com.yeelight.yeelib.models;

import com.yeelight.yeelib.managers.C3076j;

/* renamed from: com.yeelight.yeelib.models.l */
public class C8320l {

    /* renamed from: a */
    private String f14298a;

    /* renamed from: b */
    private String f14299b;

    /* renamed from: c */
    private String f14300c;

    /* renamed from: d */
    private LaunchPageType f14301d = LaunchPageType.Others;

    /* renamed from: e */
    private long f14302e;

    /* renamed from: f */
    private boolean f14303f;

    /* renamed from: g */
    private String f14304g;

    /* renamed from: h */
    private String f14305h;

    /* renamed from: i */
    private boolean f14306i;

    /* renamed from: j */
    private int f14307j;

    /* renamed from: k */
    private int f14308k;

    /* renamed from: l */
    private int f14309l;

    public C8320l(String str, String str2, String str3) {
        LaunchPageTerm launchPageTerm = LaunchPageTerm.CertainTimes;
        this.f14303f = false;
        this.f14304g = null;
        this.f14305h = null;
        this.f14306i = false;
        this.f14307j = 3;
        this.f14308k = 0;
        this.f14309l = 0;
        this.f14298a = str;
        this.f14299b = str2;
        this.f14300c = str3;
    }

    /* renamed from: a */
    public String mo35382a() {
        return this.f14300c;
    }

    /* renamed from: b */
    public String mo35383b() {
        return this.f14304g;
    }

    /* renamed from: c */
    public long mo35384c() {
        return this.f14302e;
    }

    /* renamed from: d */
    public String mo35385d() {
        return this.f14298a;
    }

    /* renamed from: e */
    public String mo35386e() {
        return this.f14305h;
    }

    /* renamed from: f */
    public int mo35387f() {
        return this.f14309l;
    }

    /* renamed from: g */
    public int mo35388g() {
        return this.f14308k;
    }

    /* renamed from: h */
    public int mo35389h() {
        return this.f14307j;
    }

    /* renamed from: i */
    public String mo35390i() {
        return this.f14299b;
    }

    /* renamed from: j */
    public LaunchPageType mo35391j() {
        return this.f14301d;
    }

    /* renamed from: k */
    public boolean mo35392k() {
        StringBuilder sb = new StringBuilder();
        sb.append("show num: ");
        sb.append(mo35388g());
        sb.append(", show count: ");
        sb.append(mo35387f());
        boolean z = mo35384c() * 1000 > System.currentTimeMillis() && (mo35388g() == 0 || mo35388g() > mo35387f());
        if (z && mo35388g() != 0) {
            this.f14309l++;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("need to update show count into config file! count: ");
            sb2.append(this.f14309l);
            C3076j.m8060c().mo23446m(this);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Launch page: ");
        sb3.append(mo35385d());
        sb3.append(" is ");
        sb3.append(z ? "" : "not");
        sb3.append(" available!");
        return z;
    }

    /* renamed from: l */
    public boolean mo35393l() {
        return this.f14303f;
    }

    /* renamed from: m */
    public boolean mo35394m() {
        return this.f14306i;
    }

    /* renamed from: n */
    public void mo35395n(String str) {
        this.f14304g = str;
    }

    /* renamed from: o */
    public void mo35396o(boolean z) {
        this.f14303f = z;
    }

    /* renamed from: p */
    public void mo35397p(boolean z) {
        this.f14306i = z;
    }

    /* renamed from: q */
    public void mo35398q(long j) {
        this.f14302e = j;
    }

    /* renamed from: r */
    public void mo35399r(String str) {
        this.f14305h = str;
    }

    /* renamed from: s */
    public void mo35400s(int i) {
        this.f14309l = i;
    }

    /* renamed from: t */
    public void mo35401t(int i) {
        this.f14308k = i;
    }

    /* renamed from: u */
    public void mo35402u(int i) {
        this.f14307j = i;
    }

    /* renamed from: v */
    public void mo35403v(LaunchPageType launchPageType) {
        this.f14301d = launchPageType;
    }
}
