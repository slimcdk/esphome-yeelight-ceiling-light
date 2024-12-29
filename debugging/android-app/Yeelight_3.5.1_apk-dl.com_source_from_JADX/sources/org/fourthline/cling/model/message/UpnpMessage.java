package org.fourthline.cling.model.message;

import org.fourthline.cling.model.message.C10033g;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.seamless.util.C10245c;

public abstract class UpnpMessage<O extends C10033g> {

    /* renamed from: a */
    private int f18512a = 1;

    /* renamed from: b */
    private int f18513b = 0;

    /* renamed from: c */
    private O f18514c;

    /* renamed from: d */
    private C10032f f18515d = new C10032f();

    /* renamed from: e */
    private Object f18516e;

    /* renamed from: f */
    private BodyType f18517f = BodyType.STRING;

    public enum BodyType {
        STRING,
        BYTES
    }

    protected UpnpMessage(UpnpMessage<O> upnpMessage) {
        this.f18514c = upnpMessage.mo40404k();
        this.f18515d = upnpMessage.mo40403j();
        this.f18516e = upnpMessage.mo40398e();
        this.f18517f = upnpMessage.mo40400g();
        this.f18512a = upnpMessage.mo40405l();
        this.f18513b = upnpMessage.mo40406m();
    }

    protected UpnpMessage(O o) {
        this.f18514c = o;
    }

    protected UpnpMessage(O o, BodyType bodyType, Object obj) {
        this.f18514c = o;
        this.f18517f = bodyType;
        this.f18516e = obj;
    }

    /* renamed from: a */
    public boolean mo40395a() {
        return mo40407n() && mo40400g().equals(BodyType.STRING) && mo40397c().length() > 0;
    }

    /* renamed from: b */
    public void mo40396b(String str) {
        this.f18517f = BodyType.STRING;
        this.f18516e = str;
    }

    /* renamed from: c */
    public String mo40397c() {
        try {
            if (!mo40407n()) {
                return null;
            }
            if (!mo40400g().equals(BodyType.STRING)) {
                return new String((byte[]) mo40398e(), "UTF-8");
            }
            String str = (String) mo40398e();
            return str.charAt(0) == 65279 ? str.substring(1) : str;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public Object mo40398e() {
        return this.f18516e;
    }

    /* renamed from: f */
    public byte[] mo40399f() {
        try {
            if (!mo40407n()) {
                return null;
            }
            return mo40400g().equals(BodyType.STRING) ? mo40397c().getBytes() : (byte[]) mo40398e();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public BodyType mo40400g() {
        return this.f18517f;
    }

    /* renamed from: h */
    public String mo40401h() {
        C10041d i = mo40402i();
        if (i != null) {
            return ((C10245c) i.mo40449b()).mo41564b().get("charset");
        }
        return null;
    }

    /* renamed from: i */
    public C10041d mo40402i() {
        return (C10041d) mo40403j().mo40443q(UpnpHeader.Type.CONTENT_TYPE, C10041d.class);
    }

    /* renamed from: j */
    public C10032f mo40403j() {
        return this.f18515d;
    }

    /* renamed from: k */
    public O mo40404k() {
        return this.f18514c;
    }

    /* renamed from: l */
    public int mo40405l() {
        return this.f18512a;
    }

    /* renamed from: m */
    public int mo40406m() {
        return this.f18513b;
    }

    /* renamed from: n */
    public boolean mo40407n() {
        return mo40398e() != null;
    }

    /* renamed from: o */
    public boolean mo40408o() {
        return mo40403j().mo40442p(UpnpHeader.Type.HOST) != null;
    }

    /* renamed from: p */
    public boolean mo40409p() {
        C10041d i = mo40402i();
        return i == null || i.mo40456f();
    }

    /* renamed from: q */
    public boolean mo40410q() {
        C10041d i = mo40402i();
        return i != null && i.mo40457g();
    }

    /* renamed from: r */
    public void mo40411r(BodyType bodyType, Object obj) {
        this.f18517f = bodyType;
        this.f18516e = obj;
    }

    /* renamed from: s */
    public void mo40412s(byte[] bArr) {
        mo40411r(BodyType.STRING, new String(bArr, mo40401h() != null ? mo40401h() : "UTF-8"));
    }

    /* renamed from: t */
    public void mo40413t(C10032f fVar) {
        this.f18515d = fVar;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + mo40404k().toString();
    }
}
