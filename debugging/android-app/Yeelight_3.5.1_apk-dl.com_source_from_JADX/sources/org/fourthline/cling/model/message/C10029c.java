package org.fourthline.cling.model.message;

import java.net.InetAddress;
import org.fourthline.cling.model.message.C10033g;

/* renamed from: org.fourthline.cling.model.message.c */
public abstract class C10029c<O extends C10033g> extends UpnpMessage<O> {

    /* renamed from: g */
    private InetAddress f18526g;

    /* renamed from: h */
    private int f18527h;

    /* renamed from: i */
    private C10032f f18528i = new C10032f(false);

    protected C10029c(O o, InetAddress inetAddress, int i) {
        super(o);
        this.f18526g = inetAddress;
        this.f18527h = i;
    }

    /* renamed from: j */
    public C10032f mo40403j() {
        return this.f18528i;
    }

    /* renamed from: u */
    public InetAddress mo40432u() {
        return this.f18526g;
    }

    /* renamed from: v */
    public int mo40433v() {
        return this.f18527h;
    }
}
