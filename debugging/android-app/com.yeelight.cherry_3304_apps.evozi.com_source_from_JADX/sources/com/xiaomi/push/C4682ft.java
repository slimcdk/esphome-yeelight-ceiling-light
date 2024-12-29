package com.xiaomi.push;

import java.util.Map;

/* renamed from: com.xiaomi.push.ft */
public class C4682ft implements Cloneable {

    /* renamed from: a */
    public static String f8770a = "wcc-ml-test10.bj";

    /* renamed from: b */
    public static final String f8771b = C4494ae.f8150a;

    /* renamed from: c */
    public static String f8772c = null;

    /* renamed from: a */
    private int f8773a;

    /* renamed from: a */
    private C4685fw f8774a;

    /* renamed from: a */
    private boolean f8775a = C4680fs.f8750a;

    /* renamed from: b */
    private boolean f8776b = true;

    /* renamed from: d */
    private String f8777d;

    /* renamed from: e */
    private String f8778e;

    /* renamed from: f */
    private String f8779f;

    public C4682ft(Map<String, Integer> map, int i, String str, C4685fw fwVar) {
        m14310a(map, i, str, fwVar);
    }

    /* renamed from: a */
    public static final String mo25160a() {
        String str = f8772c;
        return str != null ? str : C4491ab.m13256a() ? "sandbox.xmpush.xiaomi.com" : C4491ab.m13259b() ? f8771b : "app.chat.xiaomi.net";
    }

    /* renamed from: a */
    public static final void m14309a(String str) {
        f8772c = str;
    }

    /* renamed from: a */
    private void m14310a(Map<String, Integer> map, int i, String str, C4685fw fwVar) {
        this.f8773a = i;
        this.f8777d = str;
        this.f8774a = fwVar;
    }

    /* renamed from: a */
    public int m14311a() {
        return this.f8773a;
    }

    /* renamed from: a */
    public void mo25161a(boolean z) {
        this.f8775a = z;
    }

    /* renamed from: a */
    public boolean m14313a() {
        return this.f8775a;
    }

    /* renamed from: a */
    public byte[] m14314a() {
        return null;
    }

    /* renamed from: b */
    public String mo25162b() {
        return this.f8779f;
    }

    /* renamed from: b */
    public void mo25163b(String str) {
        this.f8779f = str;
    }

    /* renamed from: c */
    public String mo25164c() {
        if (this.f8778e == null) {
            this.f8778e = mo25160a();
        }
        return this.f8778e;
    }

    /* renamed from: c */
    public void mo25165c(String str) {
        this.f8778e = str;
    }
}
