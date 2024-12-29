package p011c.p083d.p084a.p085d0.p087n;

import java.net.Proxy;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1143w;
import p011c.p083d.p084a.C1144x;

/* renamed from: c.d.a.d0.n.n */
public final class C1100n {
    /* renamed from: a */
    static String m2543a(C1144x xVar, Proxy.Type type, C1143w wVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.mo9840m());
        sb.append(' ');
        boolean b = m2544b(xVar, type);
        C1133r k = xVar.mo9838k();
        if (b) {
            sb.append(k);
        } else {
            sb.append(m2545c(k));
        }
        sb.append(' ');
        sb.append(m2546d(wVar));
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m2544b(C1144x xVar, Proxy.Type type) {
        return !xVar.mo9839l() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m2545c(C1133r rVar) {
        String m = rVar.mo9768m();
        String o = rVar.mo9770o();
        if (o == null) {
            return m;
        }
        return m + '?' + o;
    }

    /* renamed from: d */
    public static String m2546d(C1143w wVar) {
        return wVar == C1143w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
