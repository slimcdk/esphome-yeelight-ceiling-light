package org.fourthline.cling.transport.impl;

import java.net.InetAddress;

/* renamed from: org.fourthline.cling.transport.impl.h */
public class C10131h {

    /* renamed from: a */
    private InetAddress f18710a;

    /* renamed from: b */
    private int f18711b;

    /* renamed from: c */
    private int f18712c;

    public C10131h(InetAddress inetAddress, int i) {
        this(inetAddress, i, 640);
    }

    public C10131h(InetAddress inetAddress, int i, int i2) {
        this.f18710a = inetAddress;
        this.f18711b = i;
        this.f18712c = i2;
    }

    /* renamed from: a */
    public InetAddress mo40754a() {
        return this.f18710a;
    }

    /* renamed from: b */
    public int mo40755b() {
        return this.f18712c;
    }

    /* renamed from: c */
    public int mo40756c() {
        return this.f18711b;
    }
}
