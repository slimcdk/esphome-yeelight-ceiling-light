package org.fourthline.cling.model.message;

import java.net.InetAddress;
import org.fourthline.cling.model.message.C10033g;

/* renamed from: org.fourthline.cling.model.message.b */
public class C10028b<O extends C10033g> extends UpnpMessage<O> {

    /* renamed from: g */
    private InetAddress f18523g;

    /* renamed from: h */
    private int f18524h;

    /* renamed from: i */
    private InetAddress f18525i;

    protected C10028b(C10028b<O> bVar) {
        super(bVar);
        this.f18523g = bVar.mo40430v();
        this.f18524h = bVar.mo40431w();
        this.f18525i = bVar.mo40429u();
    }

    public C10028b(O o, InetAddress inetAddress, int i, InetAddress inetAddress2) {
        super(o);
        this.f18523g = inetAddress;
        this.f18524h = i;
        this.f18525i = inetAddress2;
    }

    /* renamed from: u */
    public InetAddress mo40429u() {
        return this.f18525i;
    }

    /* renamed from: v */
    public InetAddress mo40430v() {
        return this.f18523g;
    }

    /* renamed from: w */
    public int mo40431w() {
        return this.f18524h;
    }
}
