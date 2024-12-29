package p164h.p165b.p166a.p240h.p248s;

import java.net.InetAddress;
import java.net.URL;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.p243r.p245l.C11261a;
import p164h.p165b.p166a.p240h.p243r.p245l.C11263c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.h.s.m */
public class C11333m extends C11325e {

    /* renamed from: c */
    private final URL f22496c;

    /* renamed from: d */
    private final byte[] f22497d;

    /* renamed from: e */
    private final InetAddress f22498e;

    public C11333m(C11261a aVar) {
        this(aVar.mo35810A(), aVar.mo35815z(), aVar.mo35814y(), aVar.mo35813x(), aVar.mo35744u());
    }

    public C11333m(C11263c cVar) {
        this(cVar.mo35819A(), cVar.mo35823z(), cVar.mo35822y(), cVar.mo35821x(), cVar.mo35744u());
    }

    public C11333m(C11365e0 e0Var, C11333m mVar) {
        this(e0Var, mVar.mo35921a(), mVar.mo35973d(), mVar.mo35975f(), mVar.mo35974e());
    }

    public C11333m(C11365e0 e0Var, Integer num, URL url, byte[] bArr, InetAddress inetAddress) {
        super(e0Var, num);
        this.f22496c = url;
        this.f22497d = bArr;
        this.f22498e = inetAddress;
    }

    /* renamed from: d */
    public URL mo35973d() {
        return this.f22496c;
    }

    /* renamed from: e */
    public InetAddress mo35974e() {
        return this.f22498e;
    }

    /* renamed from: f */
    public byte[] mo35975f() {
        return this.f22497d;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (C11216f.f22294a) {
            sb = new StringBuilder();
            str = "(RemoteDeviceIdentity) UDN: ";
        } else {
            sb = new StringBuilder();
            sb.append("(");
            sb.append(C11333m.class.getSimpleName());
            str = ") UDN: ";
        }
        sb.append(str);
        sb.append(mo35922b());
        sb.append(", Descriptor: ");
        sb.append(mo35973d());
        return sb.toString();
    }
}
