package p123a3;

import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.Protocol;
import java.net.Proxy;

/* renamed from: a3.m */
public final class C3958m {
    /* renamed from: a */
    static String m11400a(C4312v vVar, Proxy.Type type, Protocol protocol) {
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.mo28039m());
        sb.append(' ');
        boolean b = m11401b(vVar, type);
        C4302q k = vVar.mo28037k();
        if (b) {
            sb.append(k);
        } else {
            sb.append(m11402c(k));
        }
        sb.append(' ');
        sb.append(m11403d(protocol));
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m11401b(C4312v vVar, Proxy.Type type) {
        return !vVar.mo28038l() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m11402c(C4302q qVar) {
        String m = qVar.mo27955m();
        String o = qVar.mo27957o();
        if (o == null) {
            return m;
        }
        return m + '?' + o;
    }

    /* renamed from: d */
    public static String m11403d(Protocol protocol) {
        return protocol == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
