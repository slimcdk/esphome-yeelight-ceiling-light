package org.fourthline.cling.model;

import java.net.InetAddress;
import java.net.URL;

/* renamed from: org.fourthline.cling.model.e */
public class C10017e {

    /* renamed from: a */
    protected final C10020h f18489a;

    /* renamed from: b */
    protected final String f18490b;

    /* renamed from: c */
    protected final URL f18491c;

    public C10017e(C10020h hVar, String str) {
        this.f18489a = hVar;
        this.f18490b = str;
        this.f18491c = m24799a(hVar.mo40368a(), hVar.mo40370c(), str);
    }

    /* renamed from: a */
    private static URL m24799a(InetAddress inetAddress, int i, String str) {
        try {
            return new URL("http", inetAddress.getHostAddress(), i, str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Address, port, and URI can not be converted to URL", e);
        }
    }

    /* renamed from: b */
    public C10020h mo40347b() {
        return this.f18489a;
    }

    /* renamed from: c */
    public URL mo40348c() {
        return this.f18491c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10017e.class != obj.getClass()) {
            return false;
        }
        C10017e eVar = (C10017e) obj;
        return this.f18489a.equals(eVar.f18489a) && this.f18490b.equals(eVar.f18490b);
    }

    public int hashCode() {
        return (this.f18489a.hashCode() * 31) + this.f18490b.hashCode();
    }
}
