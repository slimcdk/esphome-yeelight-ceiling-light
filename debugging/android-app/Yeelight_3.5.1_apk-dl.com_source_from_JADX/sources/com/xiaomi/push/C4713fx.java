package com.xiaomi.push;

import java.util.Map;

/* renamed from: com.xiaomi.push.fx */
public class C4713fx implements Cloneable {

    /* renamed from: a */
    public static String f8237a = "wcc-ml-test10.bj";

    /* renamed from: b */
    public static final String f8238b = C4512ah.f7545a;

    /* renamed from: c */
    public static String f8239c;

    /* renamed from: a */
    private int f8240a;

    /* renamed from: a */
    private C4717ga f8241a;

    /* renamed from: a */
    private boolean f8242a = C4711fw.f8217a;

    /* renamed from: b */
    private boolean f8243b = true;

    /* renamed from: d */
    private String f8244d;

    /* renamed from: e */
    private String f8245e;

    /* renamed from: f */
    private String f8246f;

    public C4713fx(Map<String, Integer> map, int i, String str, C4717ga gaVar) {
        m13973a(map, i, str, gaVar);
    }

    /* renamed from: a */
    public static final String mo29197a() {
        String str = f8239c;
        return str != null ? str : C4509ae.m12843a() ? "sandbox.xmpush.xiaomi.com" : C4509ae.m12846b() ? f8238b : "app.chat.xiaomi.net";
    }

    /* renamed from: a */
    public static final void m13972a(String str) {
        if (!C4830m.m14998a(C4994v.m15733a()) || !C4509ae.m12846b()) {
            f8239c = str;
        }
    }

    /* renamed from: a */
    private void m13973a(Map<String, Integer> map, int i, String str, C4717ga gaVar) {
        this.f8240a = i;
        this.f8244d = str;
        this.f8241a = gaVar;
    }

    /* renamed from: a */
    public int m13974a() {
        return this.f8240a;
    }

    /* renamed from: a */
    public void mo29198a(boolean z) {
        this.f8242a = z;
    }

    /* renamed from: a */
    public boolean m13976a() {
        return this.f8242a;
    }

    /* renamed from: a */
    public byte[] m13977a() {
        return null;
    }

    /* renamed from: b */
    public String mo29199b() {
        return this.f8246f;
    }

    /* renamed from: b */
    public void mo29200b(String str) {
        this.f8246f = str;
    }

    /* renamed from: c */
    public String mo29201c() {
        if (this.f8245e == null) {
            this.f8245e = mo29197a();
        }
        return this.f8245e;
    }

    /* renamed from: c */
    public void mo29202c(String str) {
        this.f8245e = str;
    }
}
