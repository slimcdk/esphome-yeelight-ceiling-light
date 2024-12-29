package com.google.firebase.crashlytics.p110c.p115j;

import p156f.C4332c0;
import p156f.C4388s;

/* renamed from: com.google.firebase.crashlytics.c.j.d */
public class C2983d {

    /* renamed from: a */
    private int f5801a;

    /* renamed from: b */
    private String f5802b;

    /* renamed from: c */
    private C4388s f5803c;

    C2983d(int i, String str, C4388s sVar) {
        this.f5801a = i;
        this.f5802b = str;
        this.f5803c = sVar;
    }

    /* renamed from: c */
    static C2983d m9159c(C4332c0 c0Var) {
        return new C2983d(c0Var.mo23860g(), c0Var.mo23857a() == null ? null : c0Var.mo23857a().mo23902s(), c0Var.mo23864n());
    }

    /* renamed from: a */
    public String mo17340a() {
        return this.f5802b;
    }

    /* renamed from: b */
    public int mo17341b() {
        return this.f5801a;
    }

    /* renamed from: d */
    public String mo17342d(String str) {
        return this.f5803c.mo24085c(str);
    }
}
