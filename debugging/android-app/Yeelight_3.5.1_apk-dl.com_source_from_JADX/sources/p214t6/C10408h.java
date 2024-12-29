package p214t6;

import java.net.InetAddress;
import java.net.URL;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.types.C10105z;
import p206r6.C10298a;
import p206r6.C10300c;

/* renamed from: t6.h */
public class C10408h extends C10402b {

    /* renamed from: c */
    private final URL f19489c;

    /* renamed from: d */
    private final byte[] f19490d;

    /* renamed from: e */
    private final InetAddress f19491e;

    public C10408h(C10105z zVar, Integer num, URL url, byte[] bArr, InetAddress inetAddress) {
        super(zVar, num);
        this.f19489c = url;
        this.f19490d = bArr;
        this.f19491e = inetAddress;
    }

    public C10408h(C10105z zVar, C10408h hVar) {
        this(zVar, hVar.mo42057a(), hVar.mo42097d(), hVar.mo42099f(), hVar.mo42098e());
    }

    public C10408h(C10298a aVar) {
        this(aVar.mo41838A(), aVar.mo41843z(), aVar.mo41842y(), aVar.mo41841x(), aVar.mo40429u());
    }

    public C10408h(C10300c cVar) {
        this(cVar.mo41847A(), cVar.mo41851z(), cVar.mo41850y(), cVar.mo41849x(), cVar.mo40429u());
    }

    /* renamed from: d */
    public URL mo42097d() {
        return this.f19489c;
    }

    /* renamed from: e */
    public InetAddress mo42098e() {
        return this.f19491e;
    }

    /* renamed from: f */
    public byte[] mo42099f() {
        return this.f19490d;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (C10018f.f18492a) {
            sb = new StringBuilder();
            str = "(RemoteDeviceIdentity) UDN: ";
        } else {
            sb = new StringBuilder();
            sb.append("(");
            sb.append(C10408h.class.getSimpleName());
            str = ") UDN: ";
        }
        sb.append(str);
        sb.append(mo42058b());
        sb.append(", Descriptor: ");
        sb.append(mo42097d());
        return sb.toString();
    }
}
