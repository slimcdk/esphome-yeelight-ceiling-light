package com.squareup.okhttp;

import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.h */
public final class C4288h {

    /* renamed from: a */
    private final String f6953a;

    /* renamed from: b */
    private final String f6954b;

    public C4288h(String str, String str2) {
        this.f6953a = str;
        this.f6954b = str2;
    }

    /* renamed from: a */
    public String mo27864a() {
        return this.f6954b;
    }

    /* renamed from: b */
    public String mo27865b() {
        return this.f6953a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4288h) {
            C4288h hVar = (C4288h) obj;
            return C12033k.m31046f(this.f6953a, hVar.f6953a) && C12033k.m31046f(this.f6954b, hVar.f6954b);
        }
    }

    public int hashCode() {
        String str = this.f6954b;
        int i = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6953a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f6953a + " realm=\"" + this.f6954b + "\"";
    }
}
