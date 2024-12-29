package org.fourthline.cling.model;

import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: org.fourthline.cling.model.h */
public class C10020h {

    /* renamed from: a */
    protected InetAddress f18497a;

    /* renamed from: b */
    protected int f18498b;

    /* renamed from: c */
    protected byte[] f18499c;

    public C10020h(InetAddress inetAddress, int i, byte[] bArr) {
        this.f18497a = inetAddress;
        this.f18498b = i;
        this.f18499c = bArr;
    }

    /* renamed from: a */
    public InetAddress mo40368a() {
        return this.f18497a;
    }

    /* renamed from: b */
    public byte[] mo40369b() {
        return this.f18499c;
    }

    /* renamed from: c */
    public int mo40370c() {
        return this.f18498b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10020h.class != obj.getClass()) {
            return false;
        }
        C10020h hVar = (C10020h) obj;
        return this.f18498b == hVar.f18498b && this.f18497a.equals(hVar.f18497a) && Arrays.equals(this.f18499c, hVar.f18499c);
    }

    public int hashCode() {
        int hashCode = ((this.f18497a.hashCode() * 31) + this.f18498b) * 31;
        byte[] bArr = this.f18499c;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
