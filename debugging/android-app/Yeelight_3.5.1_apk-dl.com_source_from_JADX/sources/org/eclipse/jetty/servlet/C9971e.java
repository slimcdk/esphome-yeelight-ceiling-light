package org.eclipse.jetty.servlet;

import java.util.Arrays;

/* renamed from: org.eclipse.jetty.servlet.e */
public class C9971e {

    /* renamed from: a */
    private String[] f18362a;

    /* renamed from: b */
    private String f18363b;

    /* renamed from: a */
    public String[] mo40107a() {
        return this.f18362a;
    }

    /* renamed from: b */
    public String mo40108b() {
        return this.f18363b;
    }

    /* renamed from: c */
    public void mo40109c(String str) {
        this.f18362a = new String[]{str};
    }

    /* renamed from: d */
    public void mo40110d(String str) {
        this.f18363b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f18362a;
        sb.append(strArr == null ? "[]" : Arrays.asList(strArr).toString());
        sb.append("=>");
        sb.append(this.f18363b);
        return sb.toString();
    }
}
