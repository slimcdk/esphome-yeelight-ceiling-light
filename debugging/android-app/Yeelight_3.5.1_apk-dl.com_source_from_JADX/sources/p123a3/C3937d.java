package p123a3;

import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.C9845l;
import okio.C9852q;
import p231y2.C12033k;
import p236z2.C12100c;
import p236z2.C12112d;
import p236z2.C12117e;

/* renamed from: a3.d */
public final class C3937d implements C3962q {

    /* renamed from: d */
    private static final List<ByteString> f6600d = C12033k.m31049i(ByteString.encodeUtf8("connection"), ByteString.encodeUtf8("host"), ByteString.encodeUtf8("keep-alive"), ByteString.encodeUtf8("proxy-connection"), ByteString.encodeUtf8("transfer-encoding"));

    /* renamed from: e */
    private static final List<ByteString> f6601e = C12033k.m31049i(ByteString.encodeUtf8("connection"), ByteString.encodeUtf8("host"), ByteString.encodeUtf8("keep-alive"), ByteString.encodeUtf8("proxy-connection"), ByteString.encodeUtf8("te"), ByteString.encodeUtf8("transfer-encoding"), ByteString.encodeUtf8("encoding"), ByteString.encodeUtf8("upgrade"));

    /* renamed from: a */
    private final C3949h f6602a;

    /* renamed from: b */
    private final C12100c f6603b;

    /* renamed from: c */
    private C12112d f6604c;

    public C3937d(C3949h hVar, C12100c cVar) {
        this.f6602a = hVar;
        this.f6603b = cVar;
    }

    /* renamed from: j */
    private static boolean m11266j(Protocol protocol, ByteString byteString) {
        List<ByteString> list;
        if (protocol == Protocol.SPDY_3) {
            list = f6600d;
        } else if (protocol == Protocol.HTTP_2) {
            list = f6601e;
        } else {
            throw new AssertionError(protocol);
        }
        return list.contains(byteString);
    }

    /* renamed from: k */
    private static String m11267k(String str, String str2) {
        return str + 0 + str2;
    }

    /* renamed from: l */
    public static C4318x.C4320b m11268l(List<C12117e> list, Protocol protocol) {
        C4299p.C4301b bVar = new C4299p.C4301b();
        bVar.mo27944h(C3955k.f6669e, protocol.toString());
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            ByteString byteString = list.get(i).f22246a;
            String utf8 = list.get(i).f22247b.utf8();
            int i2 = 0;
            while (i2 < utf8.length()) {
                int indexOf = utf8.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = utf8.length();
                }
                String substring = utf8.substring(i2, indexOf);
                if (byteString.equals(C12117e.f22239d)) {
                    str = substring;
                } else if (byteString.equals(C12117e.f22245j)) {
                    str2 = substring;
                } else if (!m11266j(protocol, byteString)) {
                    bVar.mo27939b(byteString.utf8(), substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            C3961p a = C3961p.m11421a(str2 + " " + str);
            return new C4318x.C4320b().mo28083x(protocol).mo28076q(a.f6688b).mo28080u(a.f6689c).mo28079t(bVar.mo27942e());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: m */
    public static List<C12117e> m11269m(C4312v vVar, Protocol protocol, String str) {
        C12117e eVar;
        C4299p i = vVar.mo28035i();
        ArrayList arrayList = new ArrayList(i.mo27935g() + 10);
        arrayList.add(new C12117e(C12117e.f22240e, vVar.mo28039m()));
        arrayList.add(new C12117e(C12117e.f22241f, C3958m.m11402c(vVar.mo28037k())));
        String g = C12033k.m31047g(vVar.mo28037k());
        if (Protocol.SPDY_3 == protocol) {
            arrayList.add(new C12117e(C12117e.f22245j, str));
            eVar = new C12117e(C12117e.f22244i, g);
        } else if (Protocol.HTTP_2 == protocol) {
            eVar = new C12117e(C12117e.f22243h, g);
        } else {
            throw new AssertionError();
        }
        arrayList.add(eVar);
        arrayList.add(new C12117e(C12117e.f22242g, vVar.mo28037k().mo27948E()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int g2 = i.mo27935g();
        for (int i2 = 0; i2 < g2; i2++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(i.mo27933d(i2).toLowerCase(Locale.US));
            String h = i.mo27936h(i2);
            if (!m11266j(protocol, encodeUtf8) && !encodeUtf8.equals(C12117e.f22240e) && !encodeUtf8.equals(C12117e.f22241f) && !encodeUtf8.equals(C12117e.f22242g) && !encodeUtf8.equals(C12117e.f22243h) && !encodeUtf8.equals(C12117e.f22244i) && !encodeUtf8.equals(C12117e.f22245j)) {
                if (linkedHashSet.add(encodeUtf8)) {
                    arrayList.add(new C12117e(encodeUtf8, h));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (((C12117e) arrayList.get(i3)).f22246a.equals(encodeUtf8)) {
                            arrayList.set(i3, new C12117e(encodeUtf8, m11267k(((C12117e) arrayList.get(i3)).f22247b.utf8(), h)));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo26433a() {
        this.f6604c.mo42859q().close();
    }

    /* renamed from: b */
    public C9852q mo26434b(C4312v vVar, long j) {
        return this.f6604c.mo42859q();
    }

    /* renamed from: c */
    public void mo26435c() {
    }

    /* renamed from: d */
    public void mo26436d(C4312v vVar) {
        if (this.f6604c == null) {
            this.f6602a.mo26468I();
            boolean w = this.f6602a.mo26476w();
            String d = C3958m.m11403d(this.f6602a.mo26472n().mo27875k());
            C12100c cVar = this.f6603b;
            C12112d d0 = cVar.mo42845d0(m11269m(vVar, cVar.mo42841T(), d), w, true);
            this.f6604c = d0;
            d0.mo42863u().mo39091g((long) this.f6602a.f6635a.mo28015w(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public void mo26437e(C3959n nVar) {
        nVar.mo26488c(this.f6604c.mo42859q());
    }

    /* renamed from: f */
    public void mo26438f(C3949h hVar) {
        C12112d dVar = this.f6604c;
        if (dVar != null) {
            dVar.mo42855l(ErrorCode.CANCEL);
        }
    }

    /* renamed from: g */
    public C4318x.C4320b mo26439g() {
        return m11268l(this.f6604c.mo42858p(), this.f6603b.mo42841T());
    }

    /* renamed from: h */
    public boolean mo26440h() {
        return true;
    }

    /* renamed from: i */
    public C4321y mo26441i(C4318x xVar) {
        return new C3957l(xVar.mo28064s(), C9845l.m23738d(this.f6604c.mo42860r()));
    }
}
